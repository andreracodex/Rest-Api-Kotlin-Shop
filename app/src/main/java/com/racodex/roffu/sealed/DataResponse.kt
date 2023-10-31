package com.racodex.roffu.sealed

sealed class DataResponse<T>(
    var data: T? = null,
    var error: com.racodex.roffu.sealed.Error? = null,
) {
    class Success<T>(data: T) : DataResponse<T>(data = data)
    class Error<T>(error: com.racodex.roffu.sealed.Error) : DataResponse<T>(error = error)
}