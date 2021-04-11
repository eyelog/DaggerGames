package ru.eyelog.daggergames.common

import android.content.Context
import ru.eyelog.daggergames.R

class RayApplyContext(private var context: Context) {
    fun applyRey() = "The name is ${context.resources.getString(R.string.alice)} 07"
}