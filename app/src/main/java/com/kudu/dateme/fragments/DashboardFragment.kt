package com.kudu.dateme.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.kudu.dateme.databinding.FragmentDashboardBinding
import com.lorentzos.flingswipe.SwipeFlingAdapterView


class DashboardFragment : Fragment() {

    private lateinit var binding: FragmentDashboardBinding

    private lateinit var al: ArrayList<String>
    private lateinit var arrayAdapter: ArrayAdapter<String>
    private var i = 0

//    lateinit var flingContainer: SwipeFlingAdapterView

//    val flingContainer = binding.frame as SwipeFlingAdapterView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(com.kudu.dateme.R.layout.fragment_dashboard, container, false)
        binding = FragmentDashboardBinding.bind(view)

        val flingContainer = binding.frame

        //swipe card work here
        al = arrayListOf(
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
        arrayAdapter =
            ArrayAdapter(
                requireContext(),
                com.kudu.dateme.R.layout.item_card_swipe,
                com.kudu.dateme.R.id.tv_card_user_name,
                al
            )

        flingContainer.adapter = arrayAdapter
        flingContainer.setFlingListener(object : SwipeFlingAdapterView.onFlingListener {
            override fun removeFirstObjectInAdapter() {
                Log.d("LIST", "removed object!")
                al.removeAt(0)
                arrayAdapter.notifyDataSetChanged()
            }

            override fun onLeftCardExit(dataObject: Any?) {
                Toast.makeText(requireContext(), "Left!", Toast.LENGTH_SHORT).show()
            }

            override fun onRightCardExit(dataObject: Any?) {
                Toast.makeText(requireContext(), "Right!", Toast.LENGTH_SHORT).show()
            }

            override fun onAdapterAboutToEmpty(itemsInAdapter: Int) {
                // Ask for more data here
                al.add("XML $i")
                arrayAdapter.notifyDataSetChanged()
                Log.d("LIST", "notified")
                i++
            }

            override fun onScroll(scrollProgressPercent: Float) {
                val containerView = flingContainer.selectedView
                containerView.findViewById<View>(com.kudu.dateme.R.id.item_swipe_right_indicator).alpha =
                    (if (scrollProgressPercent < 0) -scrollProgressPercent else 0F)
                containerView.findViewById<View>(com.kudu.dateme.R.id.item_swipe_left_indicator).alpha =
                    (if (scrollProgressPercent > 0) scrollProgressPercent else 0F)
            }

        })


        binding.btnLike.setOnClickListener {
            Toast.makeText(requireContext(), "Like clicked", Toast.LENGTH_SHORT).show()
            flingContainer.topCardListener.selectRight()
        }
        binding.btnDislike.setOnClickListener {
            Toast.makeText(requireContext(), "Dislike clicked", Toast.LENGTH_SHORT).show()
            flingContainer.topCardListener.selectLeft()
        }

        return view
    }

}