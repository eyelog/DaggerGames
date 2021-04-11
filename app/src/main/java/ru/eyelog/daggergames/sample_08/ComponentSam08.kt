package ru.eyelog.daggergames.sample_08

import android.view.View
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        ModuleSam08::class
    ]
)
interface ComponentSam08 {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun withView(view: View): Builder

        fun build(): ComponentSam08
    }

    fun inject(fragment: Fragment08Sample)
}
