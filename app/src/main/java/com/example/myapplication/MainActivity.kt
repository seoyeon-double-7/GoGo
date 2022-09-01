package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        var bnv_main = findViewById(R.id.bnv_main) as BottomNavigationView

        bnv_main.run {
            setOnNavigationItemReselectedListener {
                when(it.itemId){
                    R.id.item_fragment1 -> {
                        val TodayGoTemple = TodayGoTemple()
                        supportFragmentManager.beginTransaction().replace(R.id.fl_container, TodayGoTemple).commit()
                    }
                    R.id.item_fragment2 -> {
                        val HomeFragment = HomeFragment()
                        supportFragmentManager.beginTransaction().replace(R.id.fl_container, HomeFragment).commit()
                    }
                    R.id.item_fragment3 -> {
                        val WriteFragment = WriteFragment()
                        supportFragmentManager.beginTransaction().replace(R.id.fl_container, WriteFragment).commit()
                    }
                    R.id.item_fragment4 -> {
                        val UserFragment = UserFragment()
                        supportFragmentManager.beginTransaction().replace(R.id.fl_container, UserFragment).commit()
                    }
                }
                true
            }
            selectedItemId = R.id.item_fragment2
        }

    }
}