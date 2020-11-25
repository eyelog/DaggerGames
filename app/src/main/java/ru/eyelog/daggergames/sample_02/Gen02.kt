package ru.eyelog.daggergames.sample_02

import ru.eyelog.daggergames.sample_01.Gen01
import javax.inject.Inject

class Gen02 @Inject constructor(private val gen: Gen01) {
    fun getSubName() = "${gen.getSubName()} but 02"
}