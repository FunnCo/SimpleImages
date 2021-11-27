package com.funnco.images

import android.graphics.Color
import com.funnco.images.model.ImagePreview

class SimpleImageController(
    val listOfImages: List<ImagePreview>
) {
    companion object{
        fun getAdapter(listOfImages: List<ImagePreview> = emptyList()): ImageAdapter{
            return ImageAdapter(listOfImages)
        }
    }
}