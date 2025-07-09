package com.taeheon.api.auth.session

interface SessionService {
    fun createSession(loginDTO: LoginDTO)
    fun deleteSession(sessionId: String)
}