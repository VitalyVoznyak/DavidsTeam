package com.example.davidsteam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.davidsteam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //supportFragmentManager.beginTransaction()
        //    .replace(R.id.fragment_menu_container,MenuFragment.newInstance())
        //    .commit()
    }
}