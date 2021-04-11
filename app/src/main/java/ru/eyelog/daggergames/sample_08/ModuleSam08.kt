package ru.eyelog.daggergames.sample_08

import android.view.View
import dagger.Module
import dagger.Provides

@Module
class ModuleSam08 {

    @Provides
    fun getGen(view: View) = Gen08(view)
}
