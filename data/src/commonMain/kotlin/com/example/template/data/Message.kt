package com.example.template.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Message(
    @SerialName("action") val action: String,
    @SerialName("message") val message: String
)
