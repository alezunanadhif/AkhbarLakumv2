package com.nadhif.akhbar_lakum_v2.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.nadhif.akhbar_lakum_v2.ui.antara.AntaraEkonomiNewsFragment
import com.nadhif.akhbar_lakum_v2.ui.antara.AntaraHukumNewsFragment
import com.nadhif.akhbar_lakum_v2.ui.antara.AntaraPolitikNewsFragment
import com.nadhif.akhbar_lakum_v2.ui.cnn.CnnFragment
import com.nadhif.akhbar_lakum_v2.ui.cnn.CnnHiburanNewsFragment
import com.nadhif.akhbar_lakum_v2.ui.cnn.CnnInternasionalNewsFragment
import com.nadhif.akhbar_lakum_v2.ui.cnn.CnnNasionalNewsFragment

class SectionPagerAdapterCnn(fa: CnnFragment) : FragmentStateAdapter(fa) {

	override fun getItemCount(): Int = 3

	override fun createFragment(position: Int): Fragment {
		return when(position){
			0 -> CnnNasionalNewsFragment()
			1 -> CnnInternasionalNewsFragment()
			2 -> CnnHiburanNewsFragment()
			else -> CnnNasionalNewsFragment()
		}
	}

}