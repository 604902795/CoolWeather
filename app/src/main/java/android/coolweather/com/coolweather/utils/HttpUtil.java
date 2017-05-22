package android.coolweather.com.coolweather.utils;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/5/19.
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String addres, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(addres).build();
        client.newCall(request).enqueue(callback);
    }
}
