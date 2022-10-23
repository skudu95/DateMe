package com.kudu.dateme.activities

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.kudu.dateme.R
import com.kudu.dateme.databinding.ActivityDashboardBinding
import com.kudu.dateme.fragments.DashboardFragment
import com.kudu.dateme.fragments.MessageFragment
import com.kudu.dateme.fragments.MyProfileFragment
import com.kudu.dateme.fragments.NotificationFragment

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setFragment(DashboardFragment())


        //bottom nav
        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_dashboard -> {
                    setFragment(DashboardFragment())
                }
                R.id.nav_messages -> {
                    Toast.makeText(this, "Messages", Toast.LENGTH_SHORT).show()
                    setFragment(MessageFragment())
                }
                R.id.nav_notification -> {
                    Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show()
                    setFragment(NotificationFragment())
                }
                R.id.nav_my_profile -> {
                    Toast.makeText(this, "My Profile", Toast.LENGTH_SHORT).show()
                    setFragment(MyProfileFragment())
                }
            }

            return@setOnItemSelectedListener true
        }
    }

    //default fragment set
    private fun setFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentFL, fragment)
        transaction.disallowAddToBackStack()
        transaction.commit()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item))
            return true

        return super.onOptionsItemSelected(item)
    }
}