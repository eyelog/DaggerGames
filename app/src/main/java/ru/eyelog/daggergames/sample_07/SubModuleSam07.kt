package ru.eyelog.daggergames.sample_07

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.eyelog.daggergames.common.RayApplyContext

@Module(subcomponents = [SubComponentSam07::class])
class SubModuleSam07 {

    @Provides
    fun getRayApply(context: Context) = RayApplyContext(context)
}
