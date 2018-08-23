package com.google.android.gms.p028c;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.C0691b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@fn
public class em implements ek {
    final Set<WebView> f2913a = Collections.synchronizedSet(new HashSet());
    private final Context f2914b;

    public em(Context context) {
        this.f2914b = context;
    }

    public WebView m4499a() {
        WebView webView = new WebView(this.f2914b);
        webView.getSettings().setJavaScriptEnabled(true);
        return webView;
    }

    public void mo716a(String str, final String str2, final String str3) {
        C0691b.m3093a("Fetching assets for the given html");
        go.f3361a.post(new Runnable(this) {
            final /* synthetic */ em f2912c;

            public void run() {
                final WebView a = this.f2912c.m4499a();
                a.setWebViewClient(new WebViewClient(this) {
                    final /* synthetic */ C09221 f2909b;

                    public void onPageFinished(WebView webView, String str) {
                        C0691b.m3093a("Loading assets have finished");
                        this.f2909b.f2912c.f2913a.remove(a);
                    }

                    public void onReceivedError(WebView webView, int i, String str, String str2) {
                        C0691b.m3103e("Loading assets have failed.");
                        this.f2909b.f2912c.f2913a.remove(a);
                    }
                });
                this.f2912c.f2913a.add(a);
                a.loadDataWithBaseURL(str2, str3, "text/html", "UTF-8", null);
                C0691b.m3093a("Fetching assets finished.");
            }
        });
    }
}
