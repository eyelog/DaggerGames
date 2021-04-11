package ru.eyelog.daggergames.sample_07

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_common.*
import ru.eyelog.daggergames.R
import ru.eyelog.daggergames.common.RayApplyContext
import ru.eyelog.daggergames.common.RayGet
import ru.eyelog.daggergames.sample_06.DaggerComponentSam06
import javax.inject.Inject

class Fragment07Sample : Fragment() {

    lateinit var subComponentSam07: SubComponentSam07

    @Inject
    lateinit var ray: RayApplyContext

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        Dagger
//            .builder()
//            .build()
//            .inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_common, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvOut.text = ray.applyRey()
    }
}
