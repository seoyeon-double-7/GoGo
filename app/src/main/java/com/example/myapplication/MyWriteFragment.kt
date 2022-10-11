package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.com.example.myapplication.UserListAdapter

class MyWriteFragment : Fragment() {

    //    private lateinit var binding : FragmentMyWriteBinding
    val itemList = arrayListOf<ListItem>()     //아이템 배열
    val listAdapter = UserListAdapter(itemList)     // 어댑터

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dataList = view?.findViewById<RecyclerView>(R.id.rv_list)


        // 레이아웃 매니저와 어댑터 설정
//        binding.rvList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        dataList?.layoutManager = LinearLayoutManager(requireContext())
        dataList?.adapter = listAdapter

        // 아이템 추가
        itemList.add(ListItem("교복 관련 질문 드립니다", "1시간 전"))
        itemList.add(ListItem("친구랑 화해하는 법", "5일 전"))
        itemList.add(ListItem("전공 뭐 선택할까여ㅠㅠ", "7일 전"))
        itemList.add(ListItem("제안서 작성법 질문 합니다!", "28일 전"))
        // 리스트가 변경됨을 어댑터에 알림
        listAdapter.notifyDataSetChanged()
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_my_write, container, false)

        // recyclerview 초기호 ㅏ관련 코드

        return view
    }
}