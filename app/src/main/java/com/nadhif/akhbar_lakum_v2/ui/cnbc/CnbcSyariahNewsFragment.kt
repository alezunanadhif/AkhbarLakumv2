package com.nadhif.akhbar_lakum_v2.ui.cnbc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.nadhif.akhbar_lakum_v2.adapter.NewsAdapter
import com.nadhif.akhbar_lakum_v2.data.repository.NewsRepository
import com.nadhif.akhbar_lakum_v2.databinding.FragmentCnbcSyariahNewsBinding
import com.nadhif.akhbar_lakum_v2.ui.NewsViewModel
import com.nadhif.akhbar_lakum_v2.utils.NewsViewModelFactory

class CnbcSyariahNewsFragment : Fragment() {
	private lateinit var binding: FragmentCnbcSyariahNewsBinding
	private val commonViewModel: NewsViewModel by viewModels {
		NewsViewModelFactory(NewsRepository())
	}

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		binding = FragmentCnbcSyariahNewsBinding.inflate(inflater, container, false)
		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		val mAdapter = NewsAdapter()
		commonViewModel.getCnbcSyariahNews()
		commonViewModel.CnbcSyariahNews.observe(viewLifecycleOwner) { newsResponse ->
			val articles = newsResponse.data?.posts
			articles?.let {
				mAdapter.setData(it.filterNotNull())
				binding.rvNews.apply {
					adapter = mAdapter
					layoutManager = LinearLayoutManager(requireContext())
				}
			}
		}
	}
}