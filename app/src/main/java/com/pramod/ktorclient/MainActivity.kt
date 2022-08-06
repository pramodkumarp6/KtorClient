package com.pramod.ktorclient

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pramod.ktorclient.api.GetRepo
import com.pramod.ktorclient.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)





        CoroutineScope(Dispatchers.Main).launch {
           Log.e("TAG", "onCreate getPosts: ${GetRepo().getPosts()}")
          // mainBinding.email.append("Id="+tata.id.toString()+ "\n"+"Email="+tata.email+"\n"+"Name ="+tata.name+"\n"+"School ="+tata.school+"\n\n\n")
            binding.tata.setText("${GetRepo().getPosts()}")
           // Log.d("TAG", "onCreate: get Comments${GetRepo().getComments("1")}")

        }
    }
}