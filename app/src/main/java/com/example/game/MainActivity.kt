package com.example.game

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.game.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val placem=gameNum(100)
        binding.rvNumbers.layoutManager=GridLayoutManager(this,4)
        var gamiefl=NumFib(placem)
        binding.rvNumbers.adapter=gamiefl

    }
    fun gameNum(element:Int):List<Int>{
        val placem= mutableListOf(0,1)
        while(placem.size<element)
        {
            placem.add(placem[placem.lastIndex]+placem[placem.lastIndex-1])
        }
        return placem
    }
}