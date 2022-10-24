package com.kudu.dateme.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.kudu.dateme.R
import com.kudu.dateme.databinding.FragmentNotificationBinding

class NotificationFragment : Fragment() {

    private lateinit var binding: FragmentNotificationBinding
    private lateinit var notificationAdapter: ArrayAdapter<String>
    private lateinit var arrayNotification: ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_notification, container, false)
        binding = FragmentNotificationBinding.bind(view)


        arrayNotification = arrayListOf(
            "php",
            "python",
            "java",
            "javascript",
            "css",
            "html",
            "c",
            "kotlin",
            "kudu",
            "c++",
            "angular",
            "typescript"
        )

        notificationAdapter = ArrayAdapter(
            requireContext(),
            R.layout.item_notification,
            R.id.notification_text,
            arrayNotification
        )
        binding.rvNotification.adapter = notificationAdapter


        return view
    }

}