package com.kudu.dateme.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kudu.dateme.R
import com.kudu.dateme.databinding.ActivityAccountRecoveryBinding

class AccountRecoveryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAccountRecoveryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountRecoveryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpActionBar()

        binding.btnLoginWithEmail.setOnClickListener {
            startActivity(Intent(this@AccountRecoveryActivity, LoginEmailActivity::class.java))
        }
    }

    //action bar
    private fun setUpActionBar() {
        setSupportActionBar(binding.toolbarAccountRecoveryActivity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_back)
        }
        binding.toolbarAccountRecoveryActivity.setNavigationOnClickListener { onBackPressed() }
    }
}