package com.example.myapplication.Utils;
import android.util.Log;

import okhttp3.*;
import org.json.*;

import java.io.IOException;

public class okhttp3Impl {
    public static void sendRequestImpl(String url,String requestContent){
        OkHttpClient okHttpClient = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        RequestBody requestBody   = RequestBody.create(mediaType,requestContent);
        Request request = new Request.Builder().url(url).post(requestBody).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d("okhttp3", "onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.d("okhttp3", "onResponse: " + response.body().string());
            }
        });
    }
}
