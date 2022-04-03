package com.binar.recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.binar.recycleview.user.ContactAdapter
import com.binar.recycleview.user.MyContact


class ListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listUser = listOf(
            MyContact("Rifaldi Febrianto", +6281212341234),
            MyContact("Yudi", +6281212341234),
            MyContact("Andi", +6281212341234),
            MyContact("Ahmad", +6281212341234),
            MyContact("Rifaldi Febrianto", +6281212341234),
            MyContact("Rifaldi Febrianto", +6281212341234),
            MyContact("Rifaldi Febrianto", +6281212341234),
            MyContact("Rifaldi Febrianto", +6281212341234),
            MyContact("Rifaldi Febrianto", +6281212341234),
            MyContact("Rifaldi Febrianto", +6281212341234),
            MyContact("Rifaldi Febrianto", +6281212341234),
            MyContact("Rifaldi Febrianto", +6281212341234),
            MyContact("Rifaldi Febrianto", +6281212341234)
        )

        val adapter = ContactAdapter(listUser, onItemClick = {
            val action =ListFragmentDirections.actionListFragment2ToDetailFragment3(it)
            findNavController().navigate(action)
        })
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        val recycleView = view.findViewById<RecyclerView>(R.id.recycler_view)
        recycleView.layoutManager = layoutManager
        recycleView.adapter = adapter
    }
}