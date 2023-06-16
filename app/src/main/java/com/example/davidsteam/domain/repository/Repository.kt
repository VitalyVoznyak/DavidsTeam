package com.example.davidsteam.domain.repository

import com.example.davidsteam.domain.entity.Message

interface Repository {
    fun getAllMessages():List<Message>
}