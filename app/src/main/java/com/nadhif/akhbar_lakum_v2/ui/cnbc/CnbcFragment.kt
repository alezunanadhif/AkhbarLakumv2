package com.nadhif.akhbar_lakum_v2.ui.cnbc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.nadhif.akhbar_lakum_v2.adapter.SectionPagerAdapterCnbc
import com.nadhif.akhbar_lakum_v2.databinding.FragmentCnbcBinding

class CnbcFragment : Fragment() {
	lateinit var binding: FragmentCnbcBinding
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		binding = FragmentCnbcBinding.inflate(inflater, container, false)
		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		setUpViewPager()
	}

	private fun setUpViewPager() {
		binding.vpNews.adapter = SectionPagerAdapterCnbc(this)

		val tabsList = arrayOf(
			"Syariah",
			"Tech",
			"Lifestyle"
		)
		TabLayoutMediator(binding.tabs, binding.vpNews) { tab, page ->
			tab.text = tabsList[page]
		}.attach()
	}
}