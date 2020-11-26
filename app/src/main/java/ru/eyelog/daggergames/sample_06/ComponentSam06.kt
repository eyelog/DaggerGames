package ru.eyelog.daggergames.sample_06

import android.content.Context
import dagger.Component

@Component(
    modules = [
        ModuleSam06::class
    ]
)
interface ComponentSam06 {

    @Component.Builder
    interface Builder {

        fun withContext(samModule: ModuleSam06): Builder

        fun build(): ComponentSam06
    }

    fun inject(fragment: Fragment06Sample)
}