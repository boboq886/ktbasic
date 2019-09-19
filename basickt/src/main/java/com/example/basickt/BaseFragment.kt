package com.example.basickt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

abstract class BaseFragment : Fragment() {

    private var mRootView: View? = null
    abstract val layoutId: Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mRootView = layoutInflater.inflate(layoutId, container, false)
        return mRootView!!
    }




}
