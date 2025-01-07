package com.my.aviator.predictor.v8;

import com.google.gson.Gson;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.apache.http.client.methods.HttpGet;

/* loaded from: classes62.dex */
public class ea {
    private static ea b;
    protected OkHttpClient a;

    public static synchronized ea a() {
        ea eaVar;
        synchronized (ea.class) {
            if (b == null) {
                b = new ea();
            }
            eaVar = b;
        }
        return eaVar;
    }

    private OkHttpClient b() {
        if (this.a == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            try {
                TrustManager[] trustManagerArr = {new eb(this)};
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, trustManagerArr, new SecureRandom());
                builder.sslSocketFactory(sSLContext.getSocketFactory(), (X509TrustManager) trustManagerArr[0]);
                builder.connectTimeout(15000L, TimeUnit.MILLISECONDS);
                builder.readTimeout(25000L, TimeUnit.MILLISECONDS);
                builder.writeTimeout(25000L, TimeUnit.MILLISECONDS);
                builder.hostnameVerifier(new ec(this));
            } catch (Exception unused) {
            }
            this.a = builder.build();
        }
        return this.a;
    }

    public void a(dy dyVar, String str, String str2, String str3, dz dzVar) {
        RequestBody create;
        Request.Builder headers;
        Request.Builder headers2;
        Request.Builder builder = new Request.Builder();
        Headers.Builder builder2 = new Headers.Builder();
        if (dyVar.b().size() > 0) {
            for (Map.Entry<String, Object> entry : dyVar.b().entrySet()) {
                builder2.add(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        try {
            if (dyVar.d() != 0) {
                create = RequestBody.create(MediaType.parse("application/json"), new Gson().toJson(dyVar.a()));
                if (str.equals(HttpGet.METHOD_NAME)) {
                    headers2 = builder.url(str2).headers(builder2.build());
                    headers2.get();
                } else {
                    headers = builder.url(str2).headers(builder2.build());
                    headers.method(str, create);
                }
            } else if (str.equals(HttpGet.METHOD_NAME)) {
                try {
                    HttpUrl.Builder newBuilder = HttpUrl.parse(str2).newBuilder();
                    if (dyVar.a().size() > 0) {
                        for (Map.Entry<String, Object> entry2 : dyVar.a().entrySet()) {
                            newBuilder.addQueryParameter(entry2.getKey(), String.valueOf(entry2.getValue()));
                        }
                    }
                    headers2 = builder.url(newBuilder.build()).headers(builder2.build());
                    headers2.get();
                } catch (NullPointerException unused) {
                    throw new NullPointerException("unexpected url: " + str2);
                }
            } else {
                FormBody.Builder builder3 = new FormBody.Builder();
                if (dyVar.a().size() > 0) {
                    for (Map.Entry<String, Object> entry3 : dyVar.a().entrySet()) {
                        builder3.add(entry3.getKey(), String.valueOf(entry3.getValue()));
                    }
                }
                create = builder3.build();
                headers = builder.url(str2).headers(builder2.build());
                headers.method(str, create);
            }
            b().newCall(builder.build()).enqueue(new ed(this, dyVar, dzVar, str3));
        } catch (Exception e) {
            dzVar.a(str3, e.getMessage());
        }
    }
}
