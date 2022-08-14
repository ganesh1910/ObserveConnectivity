package com.gktech.observeconnectivity

import kotlinx.coroutines.flow.Flow

interface ConnectivityObserver {

    fun observer():Flow<Status>

    enum class Status{
        Available, Unavailable, Losing, Lost
    }
}