package com.dev.sample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.dev.sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater) // Inflating our xml layout
        var view =binding?.root
        setContentView(view)

        bindingValues()
    }
    fun bindingValues()
    {
        binding?.textUsername?.setText("tutorial.dev@gmail.com")
        binding?.textPassword?.setText("Password@123")
        binding?.btnLogin?.setOnClickListener {

            Toast.makeText(this,"Login Successfully",Toast.LENGTH_SHORT).show()
        }
    }
}