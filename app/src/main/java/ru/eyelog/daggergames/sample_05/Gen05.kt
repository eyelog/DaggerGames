package ru.eyelog.daggergames.sample_05

import ru.eyelog.daggergames.sample_01.Gen01

class Gen05(private val gen: Gen01) {
    fun getSubName() = "${gen.getSubName()} but 05"
}