package com.nadhif.akhbar_lakum_v2.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.nadhif.akhbar_lakum_v2.data.model.NewsResponse
import com.nadhif.akhbar_lakum_v2.data.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsRepository {
	private val _AntaraPolitikNews = MutableLiveData<NewsResponse>()
	val AntaraPolitikNews: LiveData<NewsResponse> = _AntaraPolitikNews

	private val _AntaraHukumNews = MutableLiveData<NewsResponse>()
	val AntaraHukumNews: LiveData<NewsResponse> = _AntaraHukumNews

	private val _AntaraEkonomiNews = MutableLiveData<NewsResponse>()
	val AntaraEkonomiNews: LiveData<NewsResponse> = _AntaraEkonomiNews

	private val _CnbcSyariahNews = MutableLiveData<NewsResponse>()
	val CnbcSyariahNews: LiveData<NewsResponse> = _CnbcSyariahNews

	private val _CnbcTechNews = MutableLiveData<NewsResponse>()
	val CnbcTechNews: LiveData<NewsResponse> = _CnbcTechNews

	private val _CnbcLifestyleNews = MutableLiveData<NewsResponse>()
	val CnbcLifestyleNews: LiveData<NewsResponse> = _CnbcLifestyleNews

	private val _CnnNasionalNews = MutableLiveData<NewsResponse>()
	val CnnNasionalNews: LiveData<NewsResponse> = _CnnNasionalNews

	private val _CnnInternasionalNews = MutableLiveData<NewsResponse>()
	val CnnInternasionalNews: LiveData<NewsResponse> = _CnnInternasionalNews

	private val _CnnHiburanNews = MutableLiveData<NewsResponse>()
	val CnnHiburanNews: LiveData<NewsResponse> = _CnnHiburanNews

	private val _isLoading = MutableLiveData<Boolean>()
	val isLoading: LiveData<Boolean> = _isLoading

	fun getAntaraPolitikNews() {
		_isLoading.value = true

		ApiClient.provideApiService().getAntaraPolitikNews()
			.enqueue(object : Callback<NewsResponse> {
				override fun onResponse(
					call: Call<NewsResponse>,
					response: Response<NewsResponse>
				) {
					_isLoading.value = false
					if (response.isSuccessful) {
						val responseBody = response.body()
						if (responseBody != null) {
							_AntaraPolitikNews.postValue(response.body())
						}
					} else {
						Log.e(
							"Repository",
							"onResponse: Call error with HTTP status code" + response.code()
						)
					}
				}

				override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
					Log.e(
						"Repository",
						"onFailure: " + t.localizedMessage
					)
				}

			})
	}

	fun getAntaraHukumNews() {
		_isLoading.value = true

		ApiClient.provideApiService().getAntaraHukumNews()
			.enqueue(object : Callback<NewsResponse> {
				override fun onResponse(
					call: Call<NewsResponse>,
					response: Response<NewsResponse>
				) {
					_isLoading.value = false
					if (response.isSuccessful) {
						val responseBody = response.body()
						if (responseBody != null) {
							_AntaraHukumNews.postValue(response.body())
						}
					} else {
						Log.e(
							"Repository",
							"onResponse: Call error with HTTP status code" + response.code()
						)
					}
				}

				override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
					Log.e(
						"Repository",
						"onFailure: " + t.localizedMessage
					)
				}

			})
	}

	fun getAntaraEkonomiNews() {
		_isLoading.value = true

		ApiClient.provideApiService().getAntaraEkonomiNews()
			.enqueue(object : Callback<NewsResponse> {
				override fun onResponse(
					call: Call<NewsResponse>,
					response: Response<NewsResponse>
				) {
					_isLoading.value = false
					if (response.isSuccessful) {
						val responseBody = response.body()
						if (responseBody != null) {
							_AntaraEkonomiNews.postValue(response.body())
						}
					} else {
						Log.e(
							"Repository",
							"onResponse: Call error with HTTP status code" + response.code()
						)
					}
				}

				override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
					Log.e(
						"Repository",
						"onFailure: " + t.localizedMessage
					)
				}

			})
	}

	fun getCnbcSyariahNews() {
		_isLoading.value = true

		ApiClient.provideApiService().getCnbcSyariahNews()
			.enqueue(object : Callback<NewsResponse> {
				override fun onResponse(
					call: Call<NewsResponse>,
					response: Response<NewsResponse>
				) {
					_isLoading.value = false
					if (response.isSuccessful) {
						val responseBody = response.body()
						if (responseBody != null) {
							_CnbcSyariahNews.postValue(response.body())
						}
					} else {
						Log.e(
							"Repository",
							"onResponse: Call error with HTTP status code" + response.code()
						)
					}
				}

				override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
					Log.e(
						"Repository",
						"onFailure: " + t.localizedMessage
					)
				}

			})
	}

	fun getCnbcTechNews() {
		_isLoading.value = true

		ApiClient.provideApiService().getCnbcTechNews()
			.enqueue(object : Callback<NewsResponse> {
				override fun onResponse(
					call: Call<NewsResponse>,
					response: Response<NewsResponse>
				) {
					_isLoading.value = false
					if (response.isSuccessful) {
						val responseBody = response.body()
						if (responseBody != null) {
							_CnbcTechNews.postValue(response.body())
						}
					} else {
						Log.e(
							"Repository",
							"onResponse: Call error with HTTP status code" + response.code()
						)
					}
				}

				override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
					Log.e(
						"Repository",
						"onFailure: " + t.localizedMessage
					)
				}

			})
	}

	fun getCnbcLifestyleNews() {
		_isLoading.value = true

		ApiClient.provideApiService().getCnbcLifestyleNews()
			.enqueue(object : Callback<NewsResponse> {
				override fun onResponse(
					call: Call<NewsResponse>,
					response: Response<NewsResponse>
				) {
					_isLoading.value = false
					if (response.isSuccessful) {
						val responseBody = response.body()
						if (responseBody != null) {
							_CnbcLifestyleNews.postValue(response.body())
						}
					} else {
						Log.e(
							"Repository",
							"onResponse: Call error with HTTP status code" + response.code()
						)
					}
				}

				override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
					Log.e(
						"Repository",
						"onFailure: " + t.localizedMessage
					)
				}

			})
	}

	fun getCnnNasionalNews() {
		_isLoading.value = true

		ApiClient.provideApiService().getCnnNasionalNews()
			.enqueue(object : Callback<NewsResponse> {
				override fun onResponse(
					call: Call<NewsResponse>,
					response: Response<NewsResponse>
				) {
					_isLoading.value = false
					if (response.isSuccessful) {
						val responseBody = response.body()
						if (responseBody != null) {
							_CnnNasionalNews.postValue(response.body())
						}
					} else {
						Log.e(
							"Repository",
							"onResponse: Call error with HTTP status code" + response.code()
						)
					}
				}

				override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
					Log.e(
						"Repository",
						"onFailure: " + t.localizedMessage
					)
				}

			})
	}

	fun getCnnInternasionalNews() {
		_isLoading.value = true

		ApiClient.provideApiService().getCnnInternasionalNews()
			.enqueue(object : Callback<NewsResponse> {
				override fun onResponse(
					call: Call<NewsResponse>,
					response: Response<NewsResponse>
				) {
					_isLoading.value = false
					if (response.isSuccessful) {
						val responseBody = response.body()
						if (responseBody != null) {
							_CnnInternasionalNews.postValue(response.body())
						}
					} else {
						Log.e(
							"Repository",
							"onResponse: Call error with HTTP status code" + response.code()
						)
					}
				}

				override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
					Log.e(
						"Repository",
						"onFailure: " + t.localizedMessage
					)
				}

			})
	}

	fun getCnnHiburanNews() {
		_isLoading.value = true

		ApiClient.provideApiService().getCnnHiburanNews()
			.enqueue(object : Callback<NewsResponse> {
				override fun onResponse(
					call: Call<NewsResponse>,
					response: Response<NewsResponse>
				) {
					_isLoading.value = false
					if (response.isSuccessful) {
						val responseBody = response.body()
						if (responseBody != null) {
							_CnnHiburanNews.postValue(response.body())
						}
					} else {
						Log.e(
							"Repository",
							"onResponse: Call error with HTTP status code" + response.code()
						)
					}
				}

				override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
					Log.e(
						"Repository",
						"onFailure: " + t.localizedMessage
					)
				}

			})
	}
}