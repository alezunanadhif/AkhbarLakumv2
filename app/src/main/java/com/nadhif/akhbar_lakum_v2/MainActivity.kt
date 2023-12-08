package com.nadhif.akhbar_lakum_v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.nadhif.akhbar_lakum_v2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	private lateinit var binding: ActivityMainBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)

		binding.bottomNavView.setupWithNavController(
			(supportFragmentManager
				.findFragmentById(R.id.nav_host_fragment) as NavHostFragment)
				.navController
		)
	}
}