package com.nadhif.akhbar_lakum_v2.ui.antara

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.nadhif.akhbar_lakum_v2.R
import com.nadhif.akhbar_lakum_v2.adapter.SectionPagerAdapterAntara
import com.nadhif.akhbar_lakum_v2.databinding.FragmentAntaraBinding

class AntaraFragment : Fragment() {
	lateinit var binding: FragmentAntaraBinding
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		binding = FragmentAntaraBinding.inflate(inflater, container, false)
		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		setUpViewPager()
	}

	private fun setUpViewPager() {
		binding.vpNews.adapter = SectionPagerAdapterAntara(this)

		val tabsList = arrayOf(
			"Politik",
			"Hukum",
			"Ekonomi"
		)
		TabLayoutMediator(binding.tabs, binding.vpNews) { tab, page ->
			tab.text = tabsList[page]
		}.attach()
	}
}