package ru.eyelog.daggergames.sample_01

import javax.inject.Inject

class Gen01 @Inject constructor() {
    fun getSubName() = "Name is Alice 01"
}