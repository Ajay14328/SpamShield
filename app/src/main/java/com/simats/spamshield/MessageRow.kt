package com.simats.spamshield

data class MessageRow(
    val id: Long,
    val address: String,
    val body: String,
    val timeMillis: Long,
    val isOutgoing: Boolean
)
