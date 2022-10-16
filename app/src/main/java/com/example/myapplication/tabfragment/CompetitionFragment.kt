package com.example.myapplication.tabfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.PostListItem
import com.example.myapplication.R
import com.example.myapplication.com.example.myapplication.PostListAdapter


class CompetitionFragment : Fragment() {

    val postItemList = arrayListOf<PostListItem>()
    val postListAdapter = PostListAdapter(postItemList)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_competition, container, false)

        val dataList = view?.findViewById<RecyclerView>(R.id.post_list)

        dataList?.layoutManager = LinearLayoutManager(requireContext())
        dataList?.adapter = postListAdapter

        postItemList.add(PostListItem("일서연","학교생활", "성적 관련 질문", "전과목 평균 80이면 몇등급 나오나용??"))
        postItemList.add(PostListItem("이서연","학교생활", "성적 관련 질문", "전과목 평균 80이면 몇등급 나오나용??"))
        postItemList.add(PostListItem("삼서연","학교생활", "성적 관련 질문", "전과목 평균 80이면 몇등급 나오나용??"))
        postItemList.add(PostListItem("사서연","학교생활", "성적 관련 질문", "전과목 평균 80이면 몇등급 나오나용??"))

        postListAdapter.notifyDataSetChanged()

        return view

    }
}