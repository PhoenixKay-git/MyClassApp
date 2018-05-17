package com.bwie.test.utils;

import com.bwie.test.bean.MoonBean;

import io.reactivex.Observable;

public class MoonApi {
    private static MoonApi moonApi;
    private MoonApiService moonApiService;

    public MoonApi(MoonApiService moonApiService) {
        this.moonApiService = moonApiService;
    }

    public static MoonApi getMoonCakeApi(MoonApiService moonApiService){
        if (moonApi == null){
            moonApi = new MoonApi(moonApiService);
        }
        return moonApi;
    }

    public Observable<MoonBean> getMoonCake(String pscid){
        return moonApiService.getMoonCake(pscid);
    }
}
