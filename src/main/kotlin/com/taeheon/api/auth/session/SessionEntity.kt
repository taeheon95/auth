package com.taeheon.api.auth.session

import jakarta.persistence.Id
import org.springframework.data.redis.core.RedisHash

@RedisHash(value = "session", timeToLive = 3600)
class SessionEntity {
    @Id
    lateinit var key:String
}