package ru.eyelog.daggergames.sample_08

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView
import ru.eyelog.daggergames.R

class Gen08(val view: View) {
    @SuppressLint("SetTextI18n")
    fun setSubName() {
        val tvOut = view.findViewById<TextView>(R.id.tvOut)
        tvOut.text = "Name is Alice 08"
    }
}