package com.nadhif.akhbar_lakum_v2.ui.cnn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.nadhif.akhbar_lakum_v2.adapter.SectionPagerAdapterCnn
import com.nadhif.akhbar_lakum_v2.databinding.FragmentCnnBinding

class CnnFragment : Fragment() {
	lateinit var binding: FragmentCnnBinding
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		binding = FragmentCnnBinding.inflate(inflater, container, false)
		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		setUpViewPager()
	}

	private fun setUpViewPager() {
		binding.vpNews.adapter = SectionPagerAdapterCnn(this)

		val tabsList = arrayOf(
			"Nasional",
			"Intenasional",
			"Hiburan"
		)
		TabLayoutMediator(binding.tabs, binding.vpNews) { tab, page ->
			tab.text = tabsList[page]
		}.attach()
	}
}