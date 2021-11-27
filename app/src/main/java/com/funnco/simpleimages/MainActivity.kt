package com.funnco.simpleimages

import com.funnco.simpleimages.R
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.funnco.images.SimpleImageController
import com.funnco.images.model.ImagePreview
import com.funnco.simpleimages.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recycler.layoutManager = GridLayoutManager(this,2)

        binding.recycler.adapter = SimpleImageController.getAdapter(Repo.getExamples(this))

    }
}