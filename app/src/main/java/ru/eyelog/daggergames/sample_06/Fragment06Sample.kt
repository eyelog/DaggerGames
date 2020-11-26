package ru.eyelog.daggergames.sample_06

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_common.*
import ru.eyelog.daggergames.R
import javax.inject.Inject

class Fragment06Sample : Fragment() {

    @Inject
    lateinit var gen: Gen06

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DaggerComponentSam06
            .builder()
            .withContext(ModuleSam06(context))
            .build()
            .inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_common, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvOut.text = gen.getSubName()
    }
}
