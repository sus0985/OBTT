package com.hci.obtt.model

data class User(
    val id: String,
    val password: String,
    var action: (() -> Unit)? = null
)