package com.bwie.test.utils;

import com.bwie.test.bean.MoonBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface MoonApiService {
    @FormUrlEncoded
    @POST("quarter/getJokes")
    Observable<MoonBean> getMoonCake(@Field("pscid") String pscid);
}
