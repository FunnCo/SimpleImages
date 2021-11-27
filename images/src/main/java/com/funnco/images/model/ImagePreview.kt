package com.funnco.images.model

import android.graphics.Bitmap
import com.funnco.images.databinding.ViewImageBinding

class ImagePreview(
    val bitmap: Bitmap,
    val text: String,
    val onClickListener: ((pos: Int, binding: ViewImageBinding) -> Unit)?
)