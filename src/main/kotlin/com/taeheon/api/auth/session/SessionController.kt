package com.taeheon.api.auth.session

import com.taeheon.api.auth.common.ApiResult
import lombok.RequiredArgsConstructor
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequiredArgsConstructor
@RequestMapping("/session")
class SessionController {
    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    fun login(@Validated loginDTO: LoginDTO): ApiResult<Unit> {
        return ApiResult(code = "00000", message = "success")
    }

    @DeleteMapping("/{sessionId}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    fun logout(@PathVariable sessionId: String): ApiResult<Unit> {
        return ApiResult(code = "00000", message = "success")
    }
}