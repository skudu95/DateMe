package com.kudu.dateme.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kudu.dateme.R
import com.kudu.dateme.databinding.ActivityPhoneLoginBinding

class PhoneLoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPhoneLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhoneLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpActionBar()
    }

    //action bar
    private fun setUpActionBar() {
        setSupportActionBar(binding.toolbarLoginPhoneActivity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_back)
        }
        binding.toolbarLoginPhoneActivity.setNavigationOnClickListener { onBackPressed() }
    }
}