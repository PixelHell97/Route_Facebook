package com.pixel.routefacebook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pixel.routefacebook.databinding.ItemPostBinding

class PostAdapter(private val postModel: List<PostModel>?) :
    RecyclerView.Adapter<PostAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post = postModel?.get(position)
        with(holder) {
            binding.userAccName.text = post?.name
            binding.lastPostModified.text = post?.time
            binding.postCaption.text = post?.postCaption
            binding.userProfilePic.setImageResource(post!!.userProfilePic)
            binding.likeCounter.text = post.likes.toString()
            binding.commentCounter.text = post.comments.toString()
            binding.shareCounter.text = post.share.toString()
            if (post.postPic == 0) {
                binding.postPic.visibility = View.GONE
            }else {
                binding.postPic.visibility = View.VISIBLE
                binding.postPic.setImageResource(post.postPic)
            }
        }
    }

    override fun getItemCount(): Int = postModel?.size ?: 0


    class ViewHolder(val binding: ItemPostBinding) : RecyclerView.ViewHolder(binding.root)
}