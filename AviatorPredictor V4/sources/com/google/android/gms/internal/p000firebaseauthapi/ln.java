package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;
import w.r;

/* loaded from: classes.dex */
public final class ln {
    public static void a(String str, nm nmVar, hn hnVar, Type type, rm rmVar) {
        String str2;
        try {
            r.i(nmVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = nmVar.a().getBytes(Charset.defaultCharset());
            int length = bytes.length;
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            rmVar.a(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
            try {
                bufferedOutputStream.write(bytes, 0, length);
                bufferedOutputStream.close();
                b(httpURLConnection, hnVar, type);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            str2 = e.getMessage();
            hnVar.d(str2);
        } catch (NullPointerException e6) {
            e = e6;
            str2 = e.getMessage();
            hnVar.d(str2);
        } catch (SocketTimeoutException unused) {
            str2 = "TIMEOUT";
            hnVar.d(str2);
        } catch (UnknownHostException unused2) {
            str2 = "<<Network Error>>";
            hnVar.d(str2);
        } catch (JSONException e7) {
            e = e7;
            str2 = e.getMessage();
            hnVar.d(str2);
        }
    }

    private static void b(HttpURLConnection httpURLConnection, hn hnVar, Type type) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = c(responseCode) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            sb.append(readLine);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String sb2 = sb.toString();
                if (c(responseCode)) {
                    hnVar.a((om) mm.a(sb2, type));
                } else {
                    hnVar.d((String) mm.a(sb2, String.class));
                }
                httpURLConnection.disconnect();
            } catch (jk e5) {
                e = e5;
                hnVar.d(e.getMessage());
                httpURLConnection.disconnect();
            } catch (SocketTimeoutException unused) {
                hnVar.d("TIMEOUT");
                httpURLConnection.disconnect();
            } catch (IOException e6) {
                e = e6;
                hnVar.d(e.getMessage());
                httpURLConnection.disconnect();
            }
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    private static final boolean c(int r12) {
        return r12 >= 200 && r12 < 300;
    }
}
