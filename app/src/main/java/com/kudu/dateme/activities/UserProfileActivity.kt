package com.kudu.dateme.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kudu.dateme.R
import com.kudu.dateme.databinding.ActivityUserProfileBinding

class UserProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpActionBar()
    }

    //action bar
    private fun setUpActionBar() {
        setSupportActionBar(binding.toolbarUserProfileActivity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_back)
        }
        binding.toolbarUserProfileActivity.setNavigationOnClickListener { onBackPressed() }
    }
}