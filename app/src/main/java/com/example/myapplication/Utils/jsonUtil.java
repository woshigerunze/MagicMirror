package com.example.myapplication.Utils;
import org.json.*;
public class jsonUtil {
//    public<T> JSONObject classToJson (T input,String[] names){
//        return new JSONObject(input,names);
//    }
    public static String jsonToString(JSONObject jsonObject){
        return String.valueOf(jsonObject);
    }
}
