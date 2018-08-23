package com.google.android.gms.p028c;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@fn
public class hm extends hh {
    public hm(hg hgVar, boolean z) {
        super(hgVar, z);
    }

    protected WebResourceResponse m5113a(Context context, String str, String str2) {
        Map hashMap = new HashMap();
        hashMap.put("User-Agent", C0618p.m2796e().m4841a(context, str));
        hashMap.put("Cache-Control", "max-stale=3600");
        String str3 = (String) new gs(context).m4963a(str2, hashMap).get(60, TimeUnit.SECONDS);
        return str3 == null ? null : new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Exception e;
        try {
            if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
                return super.shouldInterceptRequest(webView, str);
            }
            if (webView instanceof hg) {
                hg hgVar = (hg) webView;
                hgVar.mo788i().m5055g();
                String str2 = hgVar.mo787h().f1351e ? (String) az.f2454F.m3878c() : hgVar.mo795m() ? (String) az.f2453E.m3878c() : (String) az.f2452D.m3878c();
                C0691b.m3101d("shouldInterceptRequest(" + str2 + ")");
                return m5113a(hgVar.getContext(), this.a.mo791l().f1976b, str2);
            }
            C0691b.m3103e("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return super.shouldInterceptRequest(webView, str);
        } catch (IOException e2) {
            e = e2;
            C0691b.m3103e("Could not fetch MRAID JS. " + e.getMessage());
            return super.shouldInterceptRequest(webView, str);
        } catch (ExecutionException e3) {
            e = e3;
            C0691b.m3103e("Could not fetch MRAID JS. " + e.getMessage());
            return super.shouldInterceptRequest(webView, str);
        } catch (InterruptedException e4) {
            e = e4;
            C0691b.m3103e("Could not fetch MRAID JS. " + e.getMessage());
            return super.shouldInterceptRequest(webView, str);
        } catch (TimeoutException e5) {
            e = e5;
            C0691b.m3103e("Could not fetch MRAID JS. " + e.getMessage());
            return super.shouldInterceptRequest(webView, str);
        }
    }
}
