package com.taeheon.api.auth.common

data class ApiResult<T>(
    val code: String = "",
    val message: String = "",
    val data: T? = null
)