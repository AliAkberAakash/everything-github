package com.cyberwort.everythinggithub.core.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.cyberwort.everythinggithub.core.data.networkResult.NetworkResult
import com.orhanobut.logger.Logger
import kotlinx.coroutines.Dispatchers

abstract class BaseViewModel : ViewModel() {
    fun <T : Any> runZoneGuarded(
      apiCall : suspend () -> T,
    ) : LiveData<NetworkResult<T>>{
        return liveData(Dispatchers.IO) {
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