package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import com.example.myapplication.R
import com.example.myapplication.tabfragment.AllFragment

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view?.findViewById<ImageButton>(R.id.all_btn)

        val transaction = childFragmentManager.beginTransaction()
        transaction.add(R.id.all_frag_holder,AllFragment()).commit()

        button?.setOnClickListener { view ->
            Log.d("mytag", "Selected")

        }

    }


}