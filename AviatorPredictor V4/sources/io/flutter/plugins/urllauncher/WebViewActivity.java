package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* renamed from: i, reason: collision with root package name */
    public static String f4795i = "close action";

    /* renamed from: j, reason: collision with root package name */
    private static String f4796j = "url";

    /* renamed from: k, reason: collision with root package name */
    private static String f4797k = "enableJavaScript";

    /* renamed from: l, reason: collision with root package name */
    private static String f4798l = "enableDomStorage";

    /* renamed from: g, reason: collision with root package name */
    private WebView f4801g;

    /* renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f4799e = new a();

    /* renamed from: f, reason: collision with root package name */
    private final WebViewClient f4800f = new b();

    /* renamed from: h, reason: collision with root package name */
    private IntentFilter f4802h = new IntentFilter(f4795i);

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (WebViewActivity.f4795i.equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    class b extends WebViewClient {
        b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (Build.VERSION.SDK_INT < 21) {
                return false;
            }
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (Build.VERSION.SDK_INT >= 21) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            webView.loadUrl(str);
            return false;
        }
    }

    private class c extends WebChromeClient {

        class a extends WebViewClient {
            a() {
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f4801g.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f4801g.loadUrl(str);
                return true;
            }
        }

        private c() {
        }

        /* synthetic */ c(WebViewActivity webViewActivity, a aVar) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z4, boolean z5, Message message) {
            a aVar = new a();
            WebView webView2 = new WebView(WebViewActivity.this.f4801g.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent b(Context context, String str, boolean z4, boolean z5, Bundle bundle) {
        return new Intent(context, (Class<?>) WebViewActivity.class).putExtra(f4796j, str).putExtra(f4797k, z4).putExtra(f4798l, z5).putExtra("com.android.browser.headers", bundle);
    }

    public static Map<String, String> c(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f4801g = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(f4796j);
        boolean booleanExtra = intent.getBooleanExtra(f4797k, false);
        boolean booleanExtra2 = intent.getBooleanExtra(f4798l, false);
        this.f4801g.loadUrl(stringExtra, c(intent.getBundleExtra("com.android.browser.headers")));
        this.f4801g.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f4801g.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f4801g.setWebViewClient(this.f4800f);
        this.f4801g.getSettings().setSupportMultipleWindows(true);
        this.f4801g.setWebChromeClient(new c(this, null));
        registerReceiver(this.f4799e, this.f4802h);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f4799e);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r22, KeyEvent keyEvent) {
        if (r22 != 4 || !this.f4801g.canGoBack()) {
            return super.onKeyDown(r22, keyEvent);
        }
        this.f4801g.goBack();
        return true;
    }
}
