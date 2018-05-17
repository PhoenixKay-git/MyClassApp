package com.bwie.test.utils;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class MyInterceptor implements Interceptor{
    @Override
    public Response intercept(Chain chain) throws IOException {
        FormBody.Builder builder = new FormBody.Builder();
        Request originalRequest = chain.request();
        FormBody formBody = (FormBody) originalRequest.body();
        //获取原始请求
        for (int i = 0; i<formBody.size(); i++){
            builder.add(formBody.name(i), formBody.value(i));
        }
        builder.add("source","android");
        builder.add("appVersion","100");
        FormBody body = builder.build();

        //创建一个新的Request
        Request request = new Request.Builder()
                .url(originalRequest.url())
                .post(body)
                .build();
        Response response = chain.proceed(request);
        return response;
    }
}
