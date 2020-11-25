package ru.eyelog.daggergames.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*
import ru.eyelog.daggergames.R
import ru.eyelog.daggergames.sample_00.Fragment00Sample
import ru.eyelog.daggergames.sample_01.Fragment01Sample
import ru.eyelog.daggergames.sample_02.Fragment02Sample
import ru.eyelog.daggergames.sample_03.Fragment03Sample
import ru.eyelog.daggergames.sample_04.Fragment04Sample
import ru.eyelog.daggergames.sample_05.Fragment05Sample

class MainFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt00Sample.setOnClickListener { setFragment(Fragment00Sample())}
        bt01Sample.setOnClickListener { setFragment(Fragment01Sample())}
        bt02Sample.setOnClickListener { setFragment(Fragment02Sample())}
        bt03Sample.setOnClickListener { setFragment(Fragment03Sample())}
        bt04Sample.setOnClickListener { setFragment(Fragment04Sample())}
        bt05Sample.setOnClickListener { setFragment(Fragment05Sample())}
        bt06Sample.setOnClickListener { setFragment(Fragment05Sample())}
        bt07Sample.setOnClickListener { setFragment(Fragment05Sample())}
        bt08Sample.setOnClickListener { setFragment(Fragment05Sample())}
        bt09Sample.setOnClickListener { setFragment(Fragment05Sample())}

    }

    private fun setFragment(fragment: Fragment){
        fragmentManager
            ?.beginTransaction()
            ?.replace(R.id.mainScreen, fragment)
            ?.addToBackStack(fragment.toString())
            ?.commit()
    }
}