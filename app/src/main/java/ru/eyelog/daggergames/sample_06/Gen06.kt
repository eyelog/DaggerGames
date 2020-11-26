package ru.eyelog.daggergames.sample_06

import android.content.Context
import ru.eyelog.daggergames.R

class Gen06(private val context: Context?) {
    fun getSubName() = "Name is ${context?.resources?.getString(R.string.alice)} 06"
}