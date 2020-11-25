package ru.eyelog.daggergames.sample_03

import dagger.Component

@Component(modules = [ModuleSam03::class])
interface ComponentSam03 {
    fun inject(fragment: Fragment03Sample)
}