package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class UserContainerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_user_container, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        childFragmentManager.beginTransaction().add(R.id.container, UserFragment()).commit()
    }

    fun toMyWrite(){
        childFragmentManager.beginTransaction().replace(R.id.container, MyWriteFragment()).commit()
    }

    fun toEditProfile(){
        childFragmentManager.beginTransaction().replace(R.id.container, EditProfileFragment()).commit()
    }

}