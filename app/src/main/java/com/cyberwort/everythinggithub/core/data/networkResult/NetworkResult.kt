package com.cyberwort.everythinggithub.core.data.networkResult

sealed class NetworkResult<T : Any?> {

    abstract val data: T?
    abstract val message: String?

    class Loading<T: Any?>(override val data: T? = null, override val message: String? = null) : NetworkResult<T>()
    class Success<T: Any?>(override val data: T? = null, override val message: String? = null) : NetworkResult<T>()
    class Error<T: Any?>(override val data: T? = null, override val message: String? = null) : NetworkResult<T>()
    class Exception<T: Any?>(override val data: T? = null, override val message: String? = null) : NetworkResult<T>()
}