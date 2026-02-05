package com.greatposterwall.data.remote.interceptors;

import android.content.Context;

import java.io.IOException;

import com.greatposterwall.GPWApplication;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * This interceptor put all the Cookies in Preferences in the Request.
 * Your implementation on how to get the Preferences may ary, but this will work 99% of the time.
 */
public class AddWmCookiesInterceptor implements Interceptor {
    private Context context;

    public AddWmCookiesInterceptor(Context context) {
        this.context = context;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request.Builder builder = chain.request().newBuilder();
        String session = GPWApplication.get(context).getComponent().preferencesHelper().getWmSession();
        builder.addHeader("Cookie", session);

        return chain.proceed(builder.build());
    }
}
