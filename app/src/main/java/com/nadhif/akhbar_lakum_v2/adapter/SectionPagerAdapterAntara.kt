package com.nadhif.akhbar_lakum_v2.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.nadhif.akhbar_lakum_v2.ui.antara.AntaraEkonomiNewsFragment
import com.nadhif.akhbar_lakum_v2.ui.antara.AntaraFragment
import com.nadhif.akhbar_lakum_v2.ui.antara.AntaraHukumNewsFragment
import com.nadhif.akhbar_lakum_v2.ui.antara.AntaraPolitikNewsFragment

class SectionPagerAdapterAntara(fa: AntaraFragment) : FragmentStateAdapter(fa) {

	override fun getItemCount(): Int = 3

	override fun createFragment(position: Int): Fragment {
		return when(position){
			0 -> AntaraPolitikNewsFragment()
			1 -> AntaraHukumNewsFragment()
			2 -> AntaraEkonomiNewsFragment()
			else -> AntaraPolitikNewsFragment()
		}
	}

}