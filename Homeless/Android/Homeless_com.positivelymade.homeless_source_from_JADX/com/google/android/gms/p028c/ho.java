package com.google.android.gms.p028c;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.common.internal.C1304w;
import java.net.URI;
import java.net.URISyntaxException;

@fn
public class ho extends WebViewClient {
    private final String f3529a;
    private boolean f3530b = false;
    private final hg f3531c;
    private final ez f3532d;

    public ho(ez ezVar, hg hgVar, String str) {
        this.f3529a = m5114b(str);
        this.f3531c = hgVar;
        this.f3532d = ezVar;
    }

    private String m5114b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (str.endsWith("/")) {
                    str = str.substring(0, str.length() - 1);
                }
            } catch (IndexOutOfBoundsException e) {
                C0691b.m3097b(e.getMessage());
            }
        }
        return str;
    }

    protected boolean m5115a(String str) {
        Object b = m5114b(str);
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        try {
            URI uri = new URI(b);
            if ("passback".equals(uri.getScheme())) {
                C0691b.m3093a("Passback received");
                this.f3532d.m4552b();
                return true;
            } else if (TextUtils.isEmpty(this.f3529a)) {
                return false;
            } else {
                URI uri2 = new URI(this.f3529a);
                String host = uri2.getHost();
                String host2 = uri.getHost();
                String path = uri2.getPath();
                String path2 = uri.getPath();
                if (!C1304w.m6615a(host, host2) || !C1304w.m6615a(path, path2)) {
                    return false;
                }
                C0691b.m3093a("Passback received");
                this.f3532d.m4552b();
                return true;
            }
        } catch (URISyntaxException e) {
            C0691b.m3097b(e.getMessage());
            return false;
        }
    }

    public void onLoadResource(WebView webView, String str) {
        C0691b.m3093a("JavascriptAdWebViewClient::onLoadResource: " + str);
        if (!m5115a(str)) {
            this.f3531c.mo788i().onLoadResource(this.f3531c.getWebView(), str);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        C0691b.m3093a("JavascriptAdWebViewClient::onPageFinished: " + str);
        if (!this.f3530b) {
            this.f3532d.m4549a();
            this.f3530b = true;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C0691b.m3093a("JavascriptAdWebViewClient::shouldOverrideUrlLoading: " + str);
        if (!m5115a(str)) {
            return this.f3531c.mo788i().shouldOverrideUrlLoading(this.f3531c.getWebView(), str);
        }
        C0691b.m3093a("shouldOverrideUrlLoading: received passback url");
        return true;
    }
}
