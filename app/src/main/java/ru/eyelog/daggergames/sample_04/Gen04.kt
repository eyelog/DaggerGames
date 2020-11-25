package ru.eyelog.daggergames.sample_04

import ru.eyelog.daggergames.sample_01.Gen01

class Gen04(private val gen: Gen01) {
    fun getSubName() = "${gen.getSubName()} but 04"
}