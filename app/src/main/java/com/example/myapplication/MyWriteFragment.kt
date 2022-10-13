package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.com.example.myapplication.MyWriteListAdapter
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MyWriteFragment : Fragment() {
    private  lateinit var  auth: FirebaseAuth

    //    private lateinit var binding : FragmentMyWriteBinding
    val itemList = arrayListOf<ListItem>()     //아이템 배열
    val listAdapter = MyWriteListAdapter(itemList)     // 어댑터

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_my_write, container, false)

        listAdapter.notifyDataSetChanged()

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataList = view?.findViewById<RecyclerView>(R.id.rv_list)

        auth = Firebase.auth

        val currentUser = auth.currentUser
        val db = Firebase.firestore

        //val docRef_email = db.collection("students").document(currentUser?.email.toString())

        // 레이아웃 매니저와 어댑터 설정
        dataList?.layoutManager = LinearLayoutManager(requireContext())
        dataList?.adapter = listAdapter

        db.collection("writes")
            .whereEqualTo("id", currentUser?.email.toString())
            .get()
            .addOnSuccessListener { documents ->
                for (document in documents) {
                    Log.d("mytag", "${document.id} => ${document.data}")
                    // 아이템 추가
                    itemList.add(ListItem(document.data!!.get("category").toString(), document.data!!.get("title").toString()))
                }
            }

    }
}