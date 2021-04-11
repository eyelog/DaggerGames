package ru.eyelog.daggergames.sample_08

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.eyelog.daggergames.R
import javax.inject.Inject

class Fragment08Sample : Fragment() {

    @Inject
    lateinit var gen08: Gen08

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView = inflater.inflate(R.layout.fragment_common, container, false)

        DaggerComponentSam08
            .builder()
            .withView(rootView)
            .build()
            .inject(this)

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gen08.setSubName()
    }
}