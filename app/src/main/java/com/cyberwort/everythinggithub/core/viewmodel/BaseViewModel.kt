package com.cyberwort.everythinggithub.core.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.cyberwort.everythinggithub.core.data.networkResult.NetworkResult
import com.orhanobut.logger.Logger
import kotlin.coroutines.CoroutineContext

abstract class BaseViewModel : ViewModel() {
    fun <T : Any?> runZoneGuarded(coroutineContext : CoroutineContext, apiCall : suspend () -> T) : LiveData<NetworkResult<T>>{

        return liveData(coroutineContext) {
            emit(NetworkResult.Loading())

            try {
                val response = apiCall()
                emit(NetworkResult.Success(response))
            } catch (exception: Exception) {
                Logger.d(exception)
                emit(NetworkResult.Exception(null, exception.message))
            }
        }
    }
}