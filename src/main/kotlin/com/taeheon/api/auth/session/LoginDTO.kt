package com.taeheon.api.auth.session

import jakarta.validation.constraints.NotBlank

data class LoginDTO(
    @field:NotBlank(message = "아이디를 입력해주세요.")
    val id:String? = null,
    @field:NotBlank(message = "패스워드를 입력해주세요.")
    val password:String? = null
)