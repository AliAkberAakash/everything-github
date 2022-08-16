package com.cyberwort.everythinggithub.core.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.cyberwort.everythinggithub.core.data.networkResult.NetworkResult
import kotlin.coroutines.CoroutineContext

abstract class BaseViewModel : ViewModel() {
    fun <T : Any?> runZonedGuarded(coroutineContext : CoroutineContext, apiCall : suspend () -> NetworkResult<T?>) : LiveData<NetworkResult<T?>>{
        return liveData(coroutineContext) {
            emit(NetworkResult.Loading())
            val response = apiCall()
            emit(response)
        }
    }
}