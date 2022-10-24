package com.kudu.dateme.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kudu.dateme.databinding.ItemNotificationBinding

class NotificationAdapter(
    private val context: Context,
    private val notificationList: ArrayList<String>
) : RecyclerView.Adapter<NotificationAdapter.MyHolder>() {


    class MyHolder(binding: ItemNotificationBinding) : RecyclerView.ViewHolder(binding.root) {
        val userName = binding.notificationText
        val notificationTime = binding.notificationTime
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(
            ItemNotificationBinding.inflate(
                LayoutInflater.from(context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val model = notificationList[position]


    }

    override fun getItemCount(): Int {
        return notificationList.size
    }
}