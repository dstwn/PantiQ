package com.dstwn.pantiq.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class InitApi {
    public static String API_URL = "";

    public static Retrofit setInit(){
        return new Retrofit.Builder().baseUrl(API_URL).addConverterFactory(GsonConverterFactory.create()).build();
    }
    public static ApiServis getInstance(){
        return setInit().create(ApiServis.class);
    }
 }
