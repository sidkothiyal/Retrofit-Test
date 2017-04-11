package com.example.vrushank.multibhashi.Rest;

import com.example.vrushank.multibhashi.Model.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by vrushank on 10/4/17.
 */

public interface ApiInterface {
    @GET("bins/hoo8n/")
    Call<ApiResponse> getData();
}
