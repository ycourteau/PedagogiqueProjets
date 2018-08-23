package com.google.android.gms.p028c;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.p010b.C0275a.C0274i;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C0555e;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.client.C0428a;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C0492n;
import com.google.android.gms.ads.internal.overlay.C0497g;
import com.google.android.gms.ads.internal.overlay.C0608d;
import com.google.android.gms.ads.internal.overlay.C0609e;
import com.google.android.gms.ads.internal.util.client.C0691b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@fn
public class hh extends WebViewClient {
    private static final String[] f3464b = new String[]{"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    private static final String[] f3465c = new String[]{"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    protected final hg f3466a;
    private final HashMap<String, List<cg>> f3467d;
    private final Object f3468e;
    private C0428a f3469f;
    private C0497g f3470g;
    private C0601a f3471h;
    private cd f3472i;
    private C0556b f3473j;
    private boolean f3474k;
    private ci f3475l;
    private ck f3476m;
    private boolean f3477n;
    private boolean f3478o;
    private C0492n f3479p;
    private final ec f3480q;
    private C0555e f3481r;
    private dx f3482s;
    private ee f3483t;
    private boolean f3484u;
    private boolean f3485v;
    private boolean f3486w;
    private boolean f3487x;
    private int f3488y;

    public interface C0556b {
        void mo408a();
    }

    public interface C0601a {
        void mo465a(hg hgVar, boolean z);
    }

    class C10151 implements Runnable {
        final /* synthetic */ hh f3460a;

        C10151(hh hhVar) {
            this.f3460a = hhVar;
        }

        public void run() {
            this.f3460a.f3466a.mo799q();
            C0608d f = this.f3460a.f3466a.mo782f();
            if (f != null) {
                f.m2734n();
            }
            if (this.f3460a.f3473j != null) {
                this.f3460a.f3473j.mo408a();
                this.f3460a.f3473j = null;
            }
        }
    }

    private static class C1016c implements C0497g {
        private hg f3461a;
        private C0497g f3462b;

        public C1016c(hg hgVar, C0497g c0497g) {
            this.f3461a = hgVar;
            this.f3462b = c0497g;
        }

        public void b_() {
            this.f3462b.b_();
            this.f3461a.mo760a();
        }

        public void c_() {
            this.f3462b.c_();
            this.f3461a.mo771b();
        }
    }

    private class C1017d implements cg {
        final /* synthetic */ hh f3463a;

        private C1017d(hh hhVar) {
            this.f3463a = hhVar;
        }

        public void mo524a(hg hgVar, Map<String, String> map) {
            if (map.keySet().contains("start")) {
                this.f3463a.m5032h();
            } else if (map.keySet().contains("stop")) {
                this.f3463a.m5033i();
            } else if (map.keySet().contains("cancel")) {
                this.f3463a.m5034j();
            }
        }
    }

    public hh(hg hgVar, boolean z) {
        this(hgVar, z, new ec(hgVar, hgVar.mo779d(), new ar(hgVar.getContext())), null);
    }

    hh(hg hgVar, boolean z, ec ecVar, dx dxVar) {
        this.f3467d = new HashMap();
        this.f3468e = new Object();
        this.f3474k = false;
        this.f3466a = hgVar;
        this.f3477n = z;
        this.f3480q = ecVar;
        this.f3482s = dxVar;
    }

    private String m5025a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        return parse.getHost() != null ? parse.getHost() : "";
    }

    private void m5026a(Context context, String str, String str2, String str3) {
        if (((Boolean) az.af.m3878c()).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            bundle.putString("host", m5025a(str3));
            C0618p.m2796e().m4856a(context, this.f3466a.mo791l().f1976b, "gmob-apps", bundle, true);
        }
    }

    private static boolean m5029b(Uri uri) {
        String scheme = uri.getScheme();
        return "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme);
    }

    private void m5032h() {
        synchronized (this.f3468e) {
            this.f3478o = true;
        }
        this.f3488y++;
        m5053e();
    }

    private void m5033i() {
        this.f3488y--;
        m5053e();
    }

    private void m5034j() {
        this.f3487x = true;
        m5053e();
    }

    public C0555e m5035a() {
        return this.f3481r;
    }

    public void m5036a(int i, int i2) {
        if (this.f3482s != null) {
            this.f3482s.m4443c(i, i2);
        }
    }

    public void m5037a(int i, int i2, boolean z) {
        this.f3480q.m4467a(i, i2);
        if (this.f3482s != null) {
            this.f3482s.m4437a(i, i2, z);
        }
    }

    public void m5038a(Uri uri) {
        String path = uri.getPath();
        List<cg> list = (List) this.f3467d.get(path);
        if (list != null) {
            Map a = C0618p.m2796e().m4849a(uri);
            if (C0691b.m3096a(2)) {
                C0691b.m3101d("Received GMSG: " + path);
                for (String path2 : a.keySet()) {
                    C0691b.m3101d("  " + path2 + ": " + ((String) a.get(path2)));
                }
            }
            for (cg a2 : list) {
                a2.mo524a(this.f3466a, a);
            }
            return;
        }
        C0691b.m3101d("No GMSG handler found for GMSG: " + uri);
    }

    public void m5039a(C0428a c0428a, C0497g c0497g, cd cdVar, C0492n c0492n, boolean z, ci ciVar, ck ckVar, C0555e c0555e, ee eeVar) {
        if (c0555e == null) {
            c0555e = new C0555e(false);
        }
        this.f3482s = new dx(this.f3466a, eeVar);
        m5044a("/appEvent", new cc(cdVar));
        m5044a("/backButton", cf.f2588j);
        m5044a("/canOpenURLs", cf.f2580b);
        m5044a("/canOpenIntents", cf.f2581c);
        m5044a("/click", cf.f2582d);
        m5044a("/close", cf.f2583e);
        m5044a("/customClose", cf.f2584f);
        m5044a("/delayPageLoaded", new C1017d());
        m5044a("/httpTrack", cf.f2585g);
        m5044a("/log", cf.f2586h);
        m5044a("/mraid", new cm(c0555e, this.f3482s));
        m5044a("/mraidLoaded", this.f3480q);
        m5044a("/open", new cn(ciVar, c0555e, this.f3482s));
        m5044a("/precache", cf.f2590l);
        m5044a("/touch", cf.f2587i);
        m5044a("/video", cf.f2589k);
        if (ckVar != null) {
            m5044a("/setInterstitialProperties", new cj(ckVar));
        }
        this.f3469f = c0428a;
        this.f3470g = c0497g;
        this.f3472i = cdVar;
        this.f3475l = ciVar;
        this.f3479p = c0492n;
        this.f3481r = c0555e;
        this.f3483t = eeVar;
        this.f3476m = ckVar;
        m5045a(z);
        this.f3484u = false;
    }

    public final void m5040a(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel) {
        C0497g c0497g = null;
        boolean m = this.f3466a.mo795m();
        C0428a c0428a = (!m || this.f3466a.mo787h().f1351e) ? this.f3469f : null;
        if (!m) {
            c0497g = this.f3470g;
        }
        m5041a(new AdOverlayInfoParcel(adLauncherIntentInfoParcel, c0428a, c0497g, this.f3479p, this.f3466a.mo791l()));
    }

    public void m5041a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean b = this.f3482s != null ? this.f3482s.m4442b() : false;
        C0609e c = C0618p.m2794c();
        Context context = this.f3466a.getContext();
        if (!b) {
            z = true;
        }
        c.m2739a(context, adOverlayInfoParcel, z);
    }

    public void m5042a(C0601a c0601a) {
        this.f3471h = c0601a;
    }

    public void m5043a(C0556b c0556b) {
        this.f3473j = c0556b;
    }

    public final void m5044a(String str, cg cgVar) {
        synchronized (this.f3468e) {
            List list = (List) this.f3467d.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f3467d.put(str, list);
            }
            list.add(cgVar);
        }
    }

    public void m5045a(boolean z) {
        this.f3474k = z;
    }

    public final void m5046a(boolean z, int i) {
        C0428a c0428a = (!this.f3466a.mo795m() || this.f3466a.mo787h().f1351e) ? this.f3469f : null;
        m5041a(new AdOverlayInfoParcel(c0428a, this.f3470g, this.f3479p, this.f3466a, z, i, this.f3466a.mo791l()));
    }

    public final void m5047a(boolean z, int i, String str) {
        C0497g c0497g = null;
        boolean m = this.f3466a.mo795m();
        C0428a c0428a = (!m || this.f3466a.mo787h().f1351e) ? this.f3469f : null;
        if (!m) {
            c0497g = new C1016c(this.f3466a, this.f3470g);
        }
        m5041a(new AdOverlayInfoParcel(c0428a, c0497g, this.f3472i, this.f3479p, this.f3466a, z, i, str, this.f3466a.mo791l(), this.f3475l));
    }

    public final void m5048a(boolean z, int i, String str, String str2) {
        boolean m = this.f3466a.mo795m();
        C0428a c0428a = (!m || this.f3466a.mo787h().f1351e) ? this.f3469f : null;
        m5041a(new AdOverlayInfoParcel(c0428a, m ? null : new C1016c(this.f3466a, this.f3470g), this.f3472i, this.f3479p, this.f3466a, z, i, str, str2, this.f3466a.mo791l(), this.f3475l));
    }

    public final void m5049b(String str, cg cgVar) {
        synchronized (this.f3468e) {
            List list = (List) this.f3467d.get(str);
            if (list == null) {
                return;
            }
            list.remove(cgVar);
        }
    }

    public boolean m5050b() {
        boolean z;
        synchronized (this.f3468e) {
            z = this.f3477n;
        }
        return z;
    }

    public boolean m5051c() {
        boolean z;
        synchronized (this.f3468e) {
            z = this.f3478o;
        }
        return z;
    }

    public void m5052d() {
        synchronized (this.f3468e) {
            C0691b.m3101d("Loading blank page in WebView, 2...");
            this.f3485v = true;
            this.f3466a.mo766a("about:blank");
        }
    }

    public final void m5053e() {
        if (this.f3471h == null) {
            return;
        }
        if ((this.f3486w && this.f3488y <= 0) || this.f3487x) {
            this.f3471h.mo465a(this.f3466a, !this.f3487x);
            this.f3471h = null;
        }
    }

    public final void m5054f() {
        synchronized (this.f3468e) {
            this.f3467d.clear();
            this.f3469f = null;
            this.f3470g = null;
            this.f3471h = null;
            this.f3472i = null;
            this.f3474k = false;
            this.f3477n = false;
            this.f3478o = false;
            this.f3475l = null;
            this.f3479p = null;
            this.f3473j = null;
            if (this.f3482s != null) {
                this.f3482s.m4439a(true);
                this.f3482s = null;
            }
            this.f3484u = false;
        }
    }

    public final void m5055g() {
        synchronized (this.f3468e) {
            this.f3474k = false;
            this.f3477n = true;
            go.m4830a(new C10151(this));
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        C0691b.m3101d("Loading resource: " + str);
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m5038a(parse);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r3, java.lang.String r4) {
        /*
        r2 = this;
        r1 = r2.f3468e;
        monitor-enter(r1);
        r0 = r2.f3485v;	 Catch:{ all -> 0x0023 }
        if (r0 == 0) goto L_0x001b;
    L_0x0007:
        r0 = "about:blank";
        r0 = r0.equals(r4);	 Catch:{ all -> 0x0023 }
        if (r0 == 0) goto L_0x001b;
    L_0x000f:
        r0 = "Blank page loaded, 1...";
        com.google.android.gms.ads.internal.util.client.C0691b.m3101d(r0);	 Catch:{ all -> 0x0023 }
        r0 = r2.f3466a;	 Catch:{ all -> 0x0023 }
        r0.mo797o();	 Catch:{ all -> 0x0023 }
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
    L_0x001a:
        return;
    L_0x001b:
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        r0 = 1;
        r2.f3486w = r0;
        r2.m5053e();
        goto L_0x001a;
    L_0x0023:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.hh.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String valueOf = (i >= 0 || (-i) - 1 >= f3464b.length) ? String.valueOf(i) : f3464b[(-i) - 1];
        m5026a(this.f3466a.getContext(), "http_err", valueOf, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            String valueOf = (primaryError < 0 || primaryError >= f3465c.length) ? String.valueOf(primaryError) : f3465c[primaryError];
            m5026a(this.f3466a.getContext(), "ssl_err", valueOf, C0618p.m2798g().mo749a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case C0274i.Theme_panelMenuListTheme /*79*/:
            case C0274i.Theme_colorControlActivated /*85*/:
            case C0274i.Theme_colorControlHighlight /*86*/:
            case C0274i.Theme_colorButtonNormal /*87*/:
            case C0274i.Theme_colorSwitchThumbNormal /*88*/:
            case C0274i.Theme_alertDialogStyle /*89*/:
            case C0274i.Theme_alertDialogButtonGroupStyle /*90*/:
            case C0274i.Theme_alertDialogCenterButtons /*91*/:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 222:
                return true;
            default:
                return false;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C0691b.m3101d("AdWebView shouldOverrideUrlLoading: " + str);
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m5038a(parse);
        } else if (this.f3474k && webView == this.f3466a && hh.m5029b(parse)) {
            if (!this.f3484u) {
                this.f3484u = true;
                if (this.f3469f != null && ((Boolean) az.f2468T.m3878c()).booleanValue()) {
                    this.f3469f.mo327e();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        } else if (this.f3466a.willNotDraw()) {
            C0691b.m3103e("AdWebView unable to handle URL: " + str);
        } else {
            Uri uri;
            try {
                C1141o k = this.f3466a.mo790k();
                if (k != null && k.m5857b(parse)) {
                    parse = k.m5853a(parse, this.f3466a.getContext());
                }
                uri = parse;
            } catch (C1142p e) {
                C0691b.m3103e("Unable to append parameter to URL: " + str);
                uri = parse;
            }
            if (this.f3481r == null || this.f3481r.m2476b()) {
                m5040a(new AdLauncherIntentInfoParcel("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
            } else {
                this.f3481r.m2475a(str);
            }
        }
        return true;
    }
}
