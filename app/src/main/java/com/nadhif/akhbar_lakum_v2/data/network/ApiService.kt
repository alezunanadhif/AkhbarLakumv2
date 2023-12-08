package com.nadhif.akhbar_lakum_v2.data.network

import com.nadhif.akhbar_lakum_v2.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
	@GET("/antara/politik")
	fun getAntaraPolitikNews(
	) : Call<NewsResponse>

	@GET("/antara/hukum")
	fun getAntaraHukumNews(
	) : Call<NewsResponse>

	@GET("/antara/ekonomi")
	fun getAntaraEkonomiNews(
	) : Call<NewsResponse>

	@GET("/cnbc/syariah")
	fun getCnbcSyariahNews(
	) : Call<NewsResponse>

	@GET("/cnbc/tech")
	fun getCnbcTechNews(
	) : Call<NewsResponse>

	@GET("/cnbc/lifestyle")
	fun getCnbcLifestyleNews(
	) : Call<NewsResponse>

	@GET("/cnn/nasional")
	fun getCnnNasionalNews(
	) : Call<NewsResponse>

	@GET("/cnn/internasional")
	fun getCnnInternasionalNews(
	) : Call<NewsResponse>

	@GET("/cnn/hiburan")
	fun getCnnHiburanNews(
	) : Call<NewsResponse>
}