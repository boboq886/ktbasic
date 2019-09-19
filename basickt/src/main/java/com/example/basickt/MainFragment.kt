package com.example.basickt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.frag_main.*

class MainFragment : BaseFragment() {
    override val layoutId: Int = R.layout.frag_main


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rv.apply{
            layoutManager=LinearLayoutManager(context)
            adapter=MainAdapter()
        }



    }


    class MainAdapter : RecyclerView.Adapter<MainAdapter.Holder>() {

        val catalogue = listOf<String>("inline")

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

            return Holder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))

        }

        override fun getItemCount(): Int = catalogue.size

        override fun onBindViewHolder(holder: Holder, position: Int) {


        }


        class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        }
    }
}
