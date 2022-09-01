package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [WriteFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WriteFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_write, container, false)
        // Inflate the layout for this fragment
        //  어댑터를 통해 스피너와 아이템 연결하기
        val sAdapter = ArrayAdapter.createFromResource(requireContext(), R.array.category, android.R.layout.simple_spinner_dropdown_item);
        val categoryComboBox = view.findViewById<Spinner>(R.id.categoryComboBox)
        categoryComboBox.setAdapter(sAdapter);
        return view
    }


}