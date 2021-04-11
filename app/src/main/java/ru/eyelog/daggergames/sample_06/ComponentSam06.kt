package ru.eyelog.daggergames.sample_06

import dagger.Component

@Component(
    modules = [
        ModuleSam06::class
    ]
)
interface ComponentSam06 {

    fun inject(fragment: Fragment06Sample)
}