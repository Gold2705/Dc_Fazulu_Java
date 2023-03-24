package com.crezo.dc.retrofit;

import com.crezo.dc.pojo.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIInterface {

    @POST("/api/users")
    Call<User> createUser(@Body User user);

}
