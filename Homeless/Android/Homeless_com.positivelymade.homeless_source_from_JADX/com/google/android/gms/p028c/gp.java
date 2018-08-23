package com.google.android.gms.p028c;

import android.app.Activity;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

@fn
public class gp {

    static class C0989a extends gp {
        C0989a() {
            super();
        }

        public int mo737a() {
            return 6;
        }

        public boolean mo738a(Request request) {
            request.setShowRunningNotification(true);
            return true;
        }

        public int mo739b() {
            return 7;
        }
    }

    static class C0990b extends C0989a {
        C0990b() {
        }

        public WebChromeClient mo740a(hg hgVar) {
            return new hl(hgVar);
        }

        public hh mo741a(hg hgVar, boolean z) {
            return new hm(hgVar, z);
        }

        public Set<String> mo742a(Uri uri) {
            return uri.getQueryParameterNames();
        }

        public boolean mo738a(Request request) {
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            return true;
        }

        public boolean mo743a(Context context, WebSettings webSettings) {
            if (context.getCacheDir() != null) {
                webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
                webSettings.setAppCacheMaxSize(0);
                webSettings.setAppCacheEnabled(true);
            }
            webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
            webSettings.setDatabaseEnabled(true);
            webSettings.setDomStorageEnabled(true);
            webSettings.setDisplayZoomControls(false);
            webSettings.setBuiltInZoomControls(true);
            webSettings.setSupportZoom(true);
            return true;
        }

        public boolean mo744a(Window window) {
            window.setFlags(16777216, 16777216);
            return true;
        }

        public boolean mo745a(WebView webView) {
            webView.onPause();
            return true;
        }

        public boolean mo746b(View view) {
            view.setLayerType(0, null);
            return true;
        }

        public boolean mo747b(WebView webView) {
            webView.onResume();
            return true;
        }

        public boolean mo748c(View view) {
            view.setLayerType(1, null);
            return true;
        }
    }

    static class C0991c extends C0990b {
        C0991c() {
        }

        public WebChromeClient mo740a(hg hgVar) {
            return new hn(hgVar);
        }

        public String mo749a(SslError sslError) {
            return sslError.getUrl();
        }
    }

    static class C0992f extends C0991c {
        C0992f() {
        }

        public void mo750a(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener) {
            Window window = activity.getWindow();
            if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
                mo751a(window.getDecorView().getViewTreeObserver(), onGlobalLayoutListener);
            }
        }

        public void mo751a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    static class C0993d extends C0992f {
        C0993d() {
        }

        public String mo752a(Context context) {
            return WebSettings.getDefaultUserAgent(context);
        }

        public boolean mo743a(Context context, WebSettings webSettings) {
            super.mo743a(context, webSettings);
            webSettings.setMediaPlaybackRequiresUserGesture(false);
            return true;
        }
    }

    static class C0994e extends C0993d {
        C0994e() {
        }

        public boolean mo753a(View view) {
            return super.mo753a(view) || view.getWindowId() != null;
        }

        public int mo754c() {
            return 14;
        }
    }

    static class C0995g extends C0994e {
        C0995g() {
        }

        public boolean mo753a(View view) {
            return view.isAttachedToWindow();
        }

        public LayoutParams mo755d() {
            return new LayoutParams(-1, -1);
        }
    }

    private gp() {
    }

    public static gp m4888a(int i) {
        return i >= 19 ? new C0995g() : i >= 18 ? new C0994e() : i >= 17 ? new C0993d() : i >= 16 ? new C0992f() : i >= 14 ? new C0991c() : i >= 11 ? new C0990b() : i >= 9 ? new C0989a() : new gp();
    }

    public int mo737a() {
        return 0;
    }

    public WebChromeClient mo740a(hg hgVar) {
        return null;
    }

    public hh mo741a(hg hgVar, boolean z) {
        return new hh(hgVar, z);
    }

    public String mo752a(Context context) {
        return "";
    }

    public String mo749a(SslError sslError) {
        return "";
    }

    public Set<String> mo742a(Uri uri) {
        if (uri.isOpaque()) {
            return Collections.emptySet();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        Set linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public void mo750a(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            mo751a(window.getDecorView().getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public void mo751a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    public boolean mo738a(Request request) {
        return false;
    }

    public boolean mo743a(Context context, WebSettings webSettings) {
        return false;
    }

    public boolean mo753a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public boolean mo744a(Window window) {
        return false;
    }

    public boolean mo745a(WebView webView) {
        return false;
    }

    public int mo739b() {
        return 1;
    }

    public boolean mo746b(View view) {
        return false;
    }

    public boolean mo747b(WebView webView) {
        return false;
    }

    public int mo754c() {
        return 5;
    }

    public boolean mo748c(View view) {
        return false;
    }

    public LayoutParams mo755d() {
        return new LayoutParams(-2, -2);
    }
}
