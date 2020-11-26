package ru.eyelog.daggergames.sample_05

import dagger.Component

@Component(
    modules = [
        ModuleSam05_00::class,
        ModuleSam05_01::class
    ]
)
interface ComponentSam05 {

    fun inject(fragment: Fragment05Sample)
}
