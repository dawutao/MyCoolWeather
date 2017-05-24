package com.mycoolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by wutao on 2017/05/23.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request requset = new Request.Builder().url(address).build();
        client.newCall(requset).enqueue(callback);
    }
}
