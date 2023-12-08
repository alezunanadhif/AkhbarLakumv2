package com.nadhif.akhbar_lakum_v2.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nadhif.akhbar_lakum_v2.data.repository.NewsRepository
import com.nadhif.akhbar_lakum_v2.ui.NewsViewModel

class NewsViewModelFactory(private val repository: NewsRepository): ViewModelProvider.Factory {
	override fun <T : ViewModel> create(modelClass: Class<T>): T {
		if (modelClass.isAssignableFrom(NewsViewModel::class.java)) {
			return NewsViewModel(repository) as T
		}
		throw IllegalArgumentException("Unknown ViewModel Class")
	}
}