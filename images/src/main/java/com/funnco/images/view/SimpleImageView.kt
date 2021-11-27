package com.funnco.images.view

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import com.funnco.images.R
import com.funnco.images.databinding.ViewImageBinding

class SimpleImageView : CardView {
    companion object{
        private var currentId = 0
    }

    constructor(context: Context) : super(context) {
        initViews(context)
    }

    private fun initViews(context: Context){
        val layoutInflater =  context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        layoutInflater.inflate(R.layout.view_image, this)
    }

    override fun onFinishInflate() {
        super.onFinishInflate()


        // Проверка того, что биндниг внутри самой вьюшки работает, и что можно изменгять вьшку по завершнию отрисовки
        val binding = ViewImageBinding.bind(this)
        binding.viewPreviewText.text = currentId.toString()
        currentId++
        Log.i("SimpleImageView", "finished inflating $currentId times")
    }
}