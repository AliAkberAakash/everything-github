package com.cyberwort.everythinggithub.core.data.network
import android.content.Context
import com.cyberwort.everythinggithub.BuildConfig
import com.cyberwort.everythinggithub.utils.ConnectivityAndInternetAccess
import com.orhanobut.logger.Logger
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object NetworkFactory {

    private const val BASE_URL = BuildConfig.BASE_URL
    private const val TIME_OUT = 60L

    fun <Service> createService(appContext: Context, serviceClass: Class<Service>): Service {
        return getRetrofit(
            appContext,
        ).create(serviceClass)
    }

    fun getRetrofit(appContext : Context): Retrofit {
        return getRetrofit(
            okHttpClient = getOkHttpClient(
                getAuthInterceptor(
                    appContext
                ),
                getLogInterceptors()
            )
        )
    }

    fun getRetrofit(baseUrl: String = BASE_URL, okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .callbackExecutor {
                Logger.d("returning")
            }
            .build()
    }

    fun getOkHttpClient(authInterceptor: Interceptor, logInterceptor: Interceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(TIME_OUT, TimeUnit.SECONDS)
            .writeTimeout(TIME_OUT, TimeUnit.SECONDS)
            .addInterceptor(logInterceptor)
            //.addInterceptor(authInterceptor)
            .authenticator { _, response -> response.request }
            .build()
    }

    fun getAuthInterceptor(appContext : Context): Interceptor {
        return object: Interceptor {
            override fun intercept(chain: Interceptor.Chain): Response {
                val requestBuilder = chain.request().newBuilder()
/*//            val token = getSharedPreference(appContext).token
                val token = ""
                if (token.isNotEmpty()) {
                    requestBuilder.addHeader("Authorization", token)
                        .addHeader("Cache-control", "no-cache")
                }*/
                try {
                    return chain.proceed(requestBuilder.build())
                } catch (e: Exception) {
                    if(ConnectivityAndInternetAccess.isConnectedToInternet(appContext, chain.request().url.host))
                        throw e
                    else
                        throw Exception("Slow or no internet connection")
                }
            }
        }
    }

    fun getLogInterceptors(): Interceptor {
        return HttpLoggingInterceptor().apply {
            level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
            else HttpLoggingInterceptor.Level.NONE
        }
    }

}