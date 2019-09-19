package com.example.basickt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    companion object {
        private const val TAG = "mainFragment"


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFragment()
    }


    fun initFragment() {

        val hostFrag = NavHostFragment.create(R.navigation.route)

        supportFragmentManager.apply {
            // 内联 ,返回this
            this.findFragmentByTag(TAG) ?: beginTransaction().add(
                R.id.flContainer,
                hostFrag,
                TAG
            ).commitAllowingStateLoss()
        }


    }





}
