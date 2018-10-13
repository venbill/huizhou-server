package com.superstar.util;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalTime;

/**
 * @Author: BillYu
 * @Description:懒汉式单例模式获取gson实体
 * @Date: Created in 下午2:29 2018/4/28.
 */
public class GsonUtil {
    private static Gson gson = null;

    /**
     * 获取Gson实例，由于Gson是线程安全的，这里共同使用同一个Gson实例
     */
    public static Gson getGsonInstance() {
        if (gson == null) {
            gson = new GsonBuilder().registerTypeAdapter(LocalTime.class, new LocalTimeAdapter()).create();
        }
        return gson;
    }


    public static <T> T toObj(String jsonStr, Class<T> valueType) {
        return getGsonInstance().fromJson(jsonStr, valueType);
    }

    public static String toJson(Object obj) {
        return getGsonInstance().toJson(obj);
    }

}
