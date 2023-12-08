package com.nadhif.akhbar_lakum_v2.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.nadhif.akhbar_lakum_v2.ui.antara.AntaraEkonomiNewsFragment
import com.nadhif.akhbar_lakum_v2.ui.antara.AntaraHukumNewsFragment
import com.nadhif.akhbar_lakum_v2.ui.antara.AntaraPolitikNewsFragment
import com.nadhif.akhbar_lakum_v2.ui.cnbc.CnbcFragment
import com.nadhif.akhbar_lakum_v2.ui.cnbc.CnbcLifestyleNewsFragment
import com.nadhif.akhbar_lakum_v2.ui.cnbc.CnbcSyariahNewsFragment
import com.nadhif.akhbar_lakum_v2.ui.cnbc.CnbcTechNewsFragment

class SectionPagerAdapterCnbc(fa: CnbcFragment) : FragmentStateAdapter(fa) {

	override fun getItemCount(): Int = 3

	override fun createFragment(position: Int): Fragment {
		return when(position){
			0 -> CnbcSyariahNewsFragment()
			1 -> CnbcTechNewsFragment()
			2 -> CnbcLifestyleNewsFragment()
			else -> CnbcSyariahNewsFragment()
		}
	}

}