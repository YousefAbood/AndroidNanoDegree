package com.example.android.news;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("v1/latest-news?language=en&apiKey=B1hb-hYrlXY20HAnVhFpjGpE3LA6I60HqOAf0GiC0H4UWMgY")
    Call<List<Post>> getPosts();
}
