package ru.eyelog.daggergames.sample_05

import dagger.Module
import dagger.Provides
import ru.eyelog.daggergames.sample_01.Gen01

@Module
class ModuleSam05_00 {

    @Provides
    fun getGen01() = Gen01()
}
