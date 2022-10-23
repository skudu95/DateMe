package com.kudu.dateme.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kudu.dateme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnLoginPhone.setOnClickListener {
            startActivity(Intent(this@MainActivity, PhoneLoginActivity::class.java))
        }

        binding.tvTroubleLogin.setOnClickListener {
            startActivity(Intent(this@MainActivity, AccountRecoveryActivity::class.java))
        }
    }
}