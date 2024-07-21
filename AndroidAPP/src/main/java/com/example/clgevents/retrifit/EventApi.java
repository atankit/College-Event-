package com.example.clgevents.retrifit;


import com.example.clgevents.model.Events;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface EventApi {

    @GET("/cems/event")
    Call<List<Events>> getAllEvent();

    @POST("/cems/event")
    Call<Events> save(@Body Events events);
}
