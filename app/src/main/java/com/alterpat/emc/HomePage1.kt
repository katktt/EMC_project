package com.alterpat.emc.com.alterpat.emc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.view.GravityCompat
import androidx.fragment.app.FragmentManager
import com.alterpat.emc.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class HomePage1 : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener{

    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean{
        TODO("Not yet implemented")
    }

    override fun onBackPressed(){
        if (binding.drawerlayout.isDrawerOpen(GravityCompat.START)){
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        }
}