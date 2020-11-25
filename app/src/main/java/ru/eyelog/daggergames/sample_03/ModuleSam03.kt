package ru.eyelog.daggergames.sample_03

import dagger.Module
import dagger.Provides

@Module
class ModuleSam03 {

    @Provides
    fun getGen() = Gen03()
}
