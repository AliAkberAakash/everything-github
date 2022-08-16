package com.cyberwort.everythinggithub.core.data.repository

import com.cyberwort.everythinggithub.core.data.networkResult.NetworkResult
import com.orhanobut.logger.Logger
import okhttp3.internal.http2.ConnectionShutdownException
import java.io.IOException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

interface BaseRepository {
    suspend fun <T : Any?> runZonedGuarded(call : suspend () -> T?)
    : NetworkResult<T?> {
        try{
            val response = call()

            return if(response != null){
                NetworkResult.Success(
                    data = response
                )
            }
            else {
                NetworkResult.Error(
                    message = "Failed to fetch data"
                )
            }

        }catch (e : Exception) {
            Logger.d(e)
            val msg: String
            when (e) {
                is SocketTimeoutException -> {
                    msg = "Timeout - Please check your internet connection"
                }
                is UnknownHostException -> {
                    msg = "Unable to make a connection. Please check your internet"
                }
                is ConnectionShutdownException -> {
                    msg = "Connection shutdown. Please check your internet"
                }
                is IOException -> {
                    msg = "Server is unreachable, please try again later."
                }
                is IllegalStateException -> {
                    msg = "${e.message}"
                }
                else -> {
                    msg = "${e.message}"
                }
            }
            return NetworkResult.Error(
                message = msg
            )
        }
    }
}