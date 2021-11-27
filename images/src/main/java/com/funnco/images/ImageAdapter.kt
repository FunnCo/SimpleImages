package com.funnco.images

import android.graphics.BitmapFactory
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.funnco.images.databinding.ViewImageBinding
import com.funnco.images.model.ImagePreview

class ImageAdapter(var listOfItems: List<ImagePreview>): RecyclerView.Adapter<ImageAdapter.ImageHolder>() {
    class ImageHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private lateinit var binding : ViewImageBinding

        fun bind(item: ImagePreview, position: Int){
            binding = ViewImageBinding.bind(itemView)

            binding.viewPreviewText.text = item.text
            binding.viewPreviewImage.setImageBitmap(item.bitmap)

            // Привязка слушателя нажатия
            if(item.onClickListener != null){
                binding.root.setOnClickListener{
                    item.onClickListener.invoke(position, binding)
                }
            }
        }
    }

    fun insertCard(item: ImagePreview, position: Int){
        val tempList = listOfItems.toMutableList()
        tempList.add(position, item)
        listOfItems = tempList
        notifyItemInserted(position)
    }

    fun removeCard(item: ImagePreview, position: Int){
        val tempList = listOfItems.toMutableList()
        tempList.removeAt(position)
        listOfItems = tempList
        notifyItemRemoved(position)
    }

    fun setNewList(listOfItems: List<ImagePreview>){
        this.listOfItems = listOfItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageHolder {
        return ImageHolder(ViewImageBinding.inflate(LayoutInflater.from(parent.context),parent,false).root)
    }

    override fun onBindViewHolder(holder: ImageHolder, position: Int) {
        holder.bind(listOfItems[position], position)
    }

    override fun getItemCount(): Int {
        return listOfItems.size
    }

}