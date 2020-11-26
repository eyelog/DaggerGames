package ru.eyelog.daggergames.sample_07

import android.content.Context
import ru.eyelog.daggergames.R

class Gen07(private val context: Context) {
    fun getSubName() = "Name is ${context.resources.getString(R.string.alice)} 07"
}
