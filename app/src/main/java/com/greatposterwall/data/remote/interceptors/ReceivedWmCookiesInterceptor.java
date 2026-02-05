package com.greatposterwall.data.remote.interceptors;

import android.content.Context;
import java.io.IOException;

import com.greatposterwall.GPWApplication;
import okhttp3.Interceptor;
import okhttp3.Response;

public class ReceivedWmCookiesInterceptor implements Interceptor {
    private Context context;

    public ReceivedWmCookiesInterceptor(Context context) {
        this.context = context;
    } // AddCookiesInterceptor()

    @Override
    public Response intercept(Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());

        if (!originalResponse.headers("Set-Cookie").isEmpty()) {
            String cookie = originalResponse.header("Set-Cookie");
            GPWApplication.get(context).getComponent().preferencesHelper().setWmSession(cookie);
        }

        return originalResponse;
    }
}