package com.kudu.dateme.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kudu.dateme.R
import com.kudu.dateme.databinding.ActivityLoginEmailBinding

class LoginEmailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginEmailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginEmailBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setUpActionBar()
    }

    //action bar
    private fun setUpActionBar() {
        setSupportActionBar(binding.toolbarLoginWithActivity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_back)
        }
        binding.toolbarLoginWithActivity.setNavigationOnClickListener { onBackPressed() }
    }
}