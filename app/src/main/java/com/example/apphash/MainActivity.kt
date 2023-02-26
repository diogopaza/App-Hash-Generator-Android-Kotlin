package com.example.apphash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI

import androidx.navigation.ui.setupActionBarWithNavController


class MainActivity : AppCompatActivity() {
     private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerMainActivity) as NavHostFragment
        val navController : NavController = navHostFragment.navController
        //NavigationUI.setupActionBarWithNavController(this, navController)

        //val navController = findNavController(R.id.fragment)
        setupActionBarWithNavController(navController)
  }

   override fun onSupportNavigateUp(): Boolean{
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}