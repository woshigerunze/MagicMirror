package com.example.myapplication.Utils;
import okhttp3.*;
import org.json.*;

import java.io.IOException;
import com.example.myapplication.Utils.okhttp3Impl;
public class okhttp {
    public void sendRequest(String url,JSONObject jsonObject){
        okhttp3Impl.sendRequestImpl(url,jsonUtil.jsonToString(jsonObject));

    }
}
