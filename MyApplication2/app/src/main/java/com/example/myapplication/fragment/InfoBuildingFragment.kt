package com.example.myapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapter.InfoAdapter0

class InfoBuildingFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_info_building,container,false)

        val infoRecyclerView = view.findViewById<RecyclerView>(R.id.info_recycler_view)

        infoRecyclerView.adapter = InfoAdapter0()

        return view
    }
}
