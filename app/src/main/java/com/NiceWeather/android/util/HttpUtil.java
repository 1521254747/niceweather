package com.NiceWeather.android.util;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        Request request = new Request.Builder().url(address).build();

        OkHttpClient client = new OkHttpClient().newBuilder().connectTimeout(60000, TimeUnit.MILLISECONDS)
                .readTimeout(60000, TimeUnit.MILLISECONDS)
                .build();

        client.newCall(request).enqueue(callback);
    }
}
