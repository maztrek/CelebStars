package com.example.maztec.celebstars.rest;

import com.example.maztec.celebstars.Pojodata.ItemResponse1;
import com.example.maztec.celebstars.Pojodata.ItemResponse2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("v1/bollywood_wallpaper/bollywood_wallpaper_parent_category_list")
    Call<ItemResponse1>getHeader();

    @GET("v1/bollywood_wallpaper/bollywood_wallpaper_parent_category_list")
    Call <List<ItemResponse2>> getItems(@Query("parent_id") String id);
}
