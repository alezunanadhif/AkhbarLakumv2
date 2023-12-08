package com.nadhif.akhbar_lakum_v2.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.nadhif.akhbar_lakum_v2.data.model.NewsResponse
import com.nadhif.akhbar_lakum_v2.data.repository.NewsRepository

class NewsViewModel(private val repository: NewsRepository) : ViewModel() {

	val AntaraPolitikNews: LiveData<NewsResponse> = repository.AntaraPolitikNews
	val AntaraHukumNews: LiveData<NewsResponse> = repository.AntaraHukumNews
	val AntaraEkonomiNews: LiveData<NewsResponse> = repository.AntaraEkonomiNews
	val CnbcSyariahNews: LiveData<NewsResponse> = repository.CnbcSyariahNews
	val CnbcLifestyleNews: LiveData<NewsResponse> = repository.CnbcLifestyleNews
	val CnbcTechNews: LiveData<NewsResponse> = repository.CnbcTechNews
	val CnnNasionalNews: LiveData<NewsResponse> = repository.CnnNasionalNews
	val CnnInternasionalNews: LiveData<NewsResponse> = repository.CnnInternasionalNews
	val CnnHiburanNews: LiveData<NewsResponse> = repository.CnnHiburanNews
	val isLoading: LiveData<Boolean> = repository.isLoading

	fun getAntaraPolitikNews() {
		repository.getAntaraPolitikNews()
	}

	fun getAntaraHukumNews() {
		repository.getAntaraHukumNews()
	}

	fun getAntaraEkonomiNews() {
		repository.getAntaraEkonomiNews()
	}

	fun getCnbcSyariahNews() {
		repository.getCnbcSyariahNews()
	}

	fun getCnbcLifestyleNews() {
		repository.getCnbcLifestyleNews()
	}

	fun getCnbcTechNews() {
		repository.getCnbcTechNews()
	}

	fun getCnnNasionalNews() {
		repository.getCnnNasionalNews()
	}

	fun getCnnInternasionalNews() {
		repository.getCnnInternasionalNews()
	}

	fun getCnnHiburanNews() {
		repository.getCnnHiburanNews()
	}
}