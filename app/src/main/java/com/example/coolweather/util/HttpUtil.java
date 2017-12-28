package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 项目名称：
 * 类描述：
 * 创建人：
 * 创建时间：
 * 修改人：
 * 修改时间：
 * 修改备注：
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
