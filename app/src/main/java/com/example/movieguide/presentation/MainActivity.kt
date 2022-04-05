package com.example.movieguide.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.movieguide.R
import com.example.movieguide.data.network.NetworkManager
import com.example.movieguide.domain.models.MoviesListResponseModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClicked(view: View) {
        val call = NetworkManager.create().getPopularMovies()
        call.enqueue(object : Callback<MoviesListResponseModel> {
            override fun onResponse(
                call: Call<MoviesListResponseModel>,
                response: Response<MoviesListResponseModel>
            ) {
                Log.d("rowaida", response.message())
                response.body()?.results?.get(0)?.let {
                    it.originalTitle?.let { it1 ->
                        Log.d(
                            "rowaida onResponse",
                            it1
                        )
                    }
                }
            }

            override fun onFailure(call: Call<MoviesListResponseModel>, t: Throwable) {
                Log.d(
                    "rowaida onFailure",
                    t.message.toString()
                )
            }

        })

    }
}