package com.example.myapplication.Utils;
import okhttp3.*;
import org.json.*;

import java.io.IOException;

public class okhttp {
    private String action;
    private String RequestBody;
    private String ResponseBody;
    public void f(){
        OkHttpClient httpClient = new OkHttpClient.Builder().build();
        String url = "https://www.baidu.com";
        Request request = new Request.Builder()
                .url(url)
                .build();
        try {
            Response response = httpClient.newCall(request).execute();
            if (response.isSuccessful() && response.body() != null) {
                System.out.println(response.body().string());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
