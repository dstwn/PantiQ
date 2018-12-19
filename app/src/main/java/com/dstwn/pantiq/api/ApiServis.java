package com.dstwn.pantiq.api;

import okhttp3.Response;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServis {
    @GET(".php") Call<ResponseListPanti>  req_show_panti();
}
