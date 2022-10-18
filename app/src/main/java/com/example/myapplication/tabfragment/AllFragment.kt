package com.example.myapplication.tabfragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.PostListItem
import com.example.myapplication.R
import com.example.myapplication.com.example.myapplication.PostListAdapter

class AllFragment : Fragment() {
    
    val postItemList = arrayListOf<PostListItem>()
    val postListAdapter = PostListAdapter(postItemList)
    var count : Boolean = false;
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_all, container, false)
        val dataList = view?.findViewById<RecyclerView>(R.id.post_list)
        // val heartBtn = view.findViewById<Button>(R.id.heart_btn)
        // var heartNum : Int = heartBtn.text.toString().toInt()
        // Log.d("mytag", heartNum.toString())

        dataList?.layoutManager = LinearLayoutManager(requireContext())
        dataList?.adapter = postListAdapter

        postItemList.add(PostListItem("일서연","학교생활", "성적 관련 질문", "전과목 평균 80이면 몇등급 나오나용??"))
        postItemList.add(PostListItem("이서연","학교생활", "성적 관련 질문", "전과목 평균 80이면 몇등급 나오나용??"))
        postItemList.add(PostListItem("삼서연","학교생활", "성적 관련 질문", "전과목 평균 80이면 몇등급 나오나용??"))
        postItemList.add(PostListItem("사서연","학교생활", "성적 관련 질문", "전과목 평균 80이면 몇등급 나오나용??"))

//        heartBtn.setOnClickListener {
//            if(!count){    // 공감 추가 되야될때
////                heartNum++
//                Log.d("mytag","공감 버튼 클릭")
//                count = true
//            }else { // 공감 감소 되야 될때
////                heartNum--
//                Log.d("mytag","공감 버튼 클릭 취소")
//                count = false
//            }
//        }

        postListAdapter.notifyDataSetChanged()
        
        return view
    }

}