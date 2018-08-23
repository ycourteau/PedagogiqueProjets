package com.google.android.gms.p028c;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.C0552d;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0526n;
import com.google.android.gms.ads.internal.overlay.C0608d;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@fn
public class hj extends WebView implements OnGlobalLayoutListener, DownloadListener, hg {
    private final hh f3493a;
    private final C1019a f3494b;
    private final Object f3495c = new Object();
    private final C1141o f3496d;
    private final VersionInfoParcel f3497e;
    private final C0552d f3498f;
    private C0608d f3499g;
    private AdSizeParcel f3500h;
    private boolean f3501i;
    private boolean f3502j;
    private boolean f3503k;
    private boolean f3504l;
    private Boolean f3505m;
    private int f3506n;
    private boolean f3507o = true;
    private String f3508p = "";
    private String f3509q;
    private C0608d f3510r;
    private gy f3511s;
    private int f3512t = -1;
    private int f3513u = -1;
    private int f3514v = -1;
    private int f3515w = -1;
    private Map<String, cr> f3516x;
    private final WindowManager f3517y;

    class C10181 implements Runnable {
        final /* synthetic */ hj f3489a;

        C10181(hj hjVar) {
            this.f3489a = hjVar;
        }

        public void run() {
            super.destroy();
        }
    }

    @fn
    public static class C1019a extends MutableContextWrapper {
        private Activity f3490a;
        private Context f3491b;
        private Context f3492c;

        public C1019a(Context context) {
            super(context);
            setBaseContext(context);
        }

        public Activity m5058a() {
            return this.f3490a;
        }

        public Context m5059b() {
            return this.f3492c;
        }

        public Object getSystemService(String str) {
            return this.f3492c.getSystemService(str);
        }

        public void setBaseContext(Context context) {
            this.f3491b = context.getApplicationContext();
            this.f3490a = context instanceof Activity ? (Activity) context : null;
            this.f3492c = context;
            super.setBaseContext(this.f3491b);
        }

        public void startActivity(Intent intent) {
            if (this.f3490a == null || is.m5294j()) {
                intent.setFlags(268435456);
                this.f3491b.startActivity(intent);
                return;
            }
            this.f3490a.startActivity(intent);
        }
    }

    protected hj(C1019a c1019a, AdSizeParcel adSizeParcel, boolean z, boolean z2, C1141o c1141o, VersionInfoParcel versionInfoParcel, C0552d c0552d) {
        super(c1019a);
        this.f3494b = c1019a;
        this.f3500h = adSizeParcel;
        this.f3503k = z;
        this.f3506n = -1;
        this.f3496d = c1141o;
        this.f3497e = versionInfoParcel;
        this.f3498f = c0552d;
        this.f3517y = (WindowManager) getContext().getSystemService("window");
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        C0618p.m2796e().m4854a((Context) c1019a, versionInfoParcel.f1976b, settings);
        C0618p.m2798g().mo743a(getContext(), settings);
        setDownloadListener(this);
        this.f3493a = C0618p.m2798g().mo741a((hg) this, z2);
        setWebViewClient(this.f3493a);
        setWebChromeClient(C0618p.m2798g().mo740a((hg) this));
        m5063v();
        if (is.m5290f()) {
            addJavascriptInterface(new hk(this), "googleAdsJsInterface");
        }
        this.f3511s = new gy(this.f3494b.m5058a(), this, null);
    }

    static hj m5060a(Context context, AdSizeParcel adSizeParcel, boolean z, boolean z2, C1141o c1141o, VersionInfoParcel versionInfoParcel, C0552d c0552d) {
        return new hj(new C1019a(context), adSizeParcel, z, z2, c1141o, versionInfoParcel, c0552d);
    }

    private void m5062u() {
        synchronized (this.f3495c) {
            this.f3505m = C0618p.m2799h().m4792i();
            if (this.f3505m == null) {
                try {
                    evaluateJavascript("(function(){})()", null);
                    m5073a(Boolean.valueOf(true));
                } catch (IllegalStateException e) {
                    m5073a(Boolean.valueOf(false));
                }
            }
        }
    }

    private void m5063v() {
        synchronized (this.f3495c) {
            if (this.f3503k || this.f3500h.f1351e) {
                if (VERSION.SDK_INT < 14) {
                    C0691b.m3093a("Disabling hardware acceleration on an overlay.");
                    m5064w();
                } else {
                    C0691b.m3093a("Enabling hardware acceleration on an overlay.");
                    m5065x();
                }
            } else if (VERSION.SDK_INT < 18) {
                C0691b.m3093a("Disabling hardware acceleration on an AdView.");
                m5064w();
            } else {
                C0691b.m3093a("Enabling hardware acceleration on an AdView.");
                m5065x();
            }
        }
    }

    private void m5064w() {
        synchronized (this.f3495c) {
            if (!this.f3504l) {
                C0618p.m2798g().mo748c(this);
            }
            this.f3504l = true;
        }
    }

    private void m5065x() {
        synchronized (this.f3495c) {
            if (this.f3504l) {
                C0618p.m2798g().mo746b((View) this);
            }
            this.f3504l = false;
        }
    }

    private void m5066y() {
        synchronized (this.f3495c) {
            if (this.f3516x != null) {
                for (cr b : this.f3516x.values()) {
                    b.mo627b();
                }
            }
        }
    }

    public void mo760a() {
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.f3497e.f1976b);
        mo768a("onhide", hashMap);
    }

    public void mo761a(int i) {
        Map hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f3497e.f1976b);
        mo768a("onhide", hashMap);
    }

    public void mo762a(Context context, AdSizeParcel adSizeParcel) {
        synchronized (this.f3495c) {
            this.f3511s.m4975b();
            setContext(context);
            this.f3499g = null;
            this.f3500h = adSizeParcel;
            this.f3503k = false;
            this.f3501i = false;
            this.f3508p = "";
            this.f3506n = -1;
            C0618p.m2798g().mo747b((WebView) this);
            loadUrl("about:blank");
            this.f3493a.m5054f();
            setOnTouchListener(null);
            setOnClickListener(null);
            this.f3507o = true;
        }
    }

    public void mo763a(AdSizeParcel adSizeParcel) {
        synchronized (this.f3495c) {
            this.f3500h = adSizeParcel;
            requestLayout();
        }
    }

    public void mo764a(C0608d c0608d) {
        synchronized (this.f3495c) {
            this.f3499g = c0608d;
        }
    }

    public void mo765a(C1162z c1162z, boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        mo768a("onAdVisibilityChanged", hashMap);
    }

    void m5073a(Boolean bool) {
        this.f3505m = bool;
        C0618p.m2799h().m4778a(bool);
    }

    public void mo766a(String str) {
        synchronized (this.f3495c) {
            super.loadUrl(str);
        }
    }

    protected void m5075a(String str, ValueCallback<String> valueCallback) {
        synchronized (this.f3495c) {
            if (mo796n()) {
                C0691b.m3103e("The webview is destroyed. Ignoring action.");
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
            } else {
                evaluateJavascript(str, valueCallback);
            }
        }
    }

    public void mo767a(String str, String str2) {
        m5091e(str + "(" + str2 + ");");
    }

    public void mo768a(String str, Map<String, ?> map) {
        try {
            mo769a(str, C0618p.m2796e().m4851a((Map) map));
        } catch (JSONException e) {
            C0691b.m3103e("Could not convert parameters to JSON.");
        }
    }

    public void mo769a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AFMA_ReceiveMessage('");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(",");
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        C0691b.m3101d("Dispatching AFMA event: " + stringBuilder.toString());
        m5091e(stringBuilder.toString());
    }

    public void mo770a(boolean z) {
        synchronized (this.f3495c) {
            this.f3503k = z;
            m5063v();
        }
    }

    public void mo771b() {
        Map hashMap = new HashMap(1);
        hashMap.put("version", this.f3497e.f1976b);
        mo768a("onshow", hashMap);
    }

    public void mo772b(C0608d c0608d) {
        synchronized (this.f3495c) {
            this.f3510r = c0608d;
        }
    }

    public void mo773b(String str) {
        synchronized (this.f3495c) {
            if (str == null) {
                str = "";
            }
            this.f3508p = str;
        }
    }

    public void mo774b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        mo767a(str, jSONObject.toString());
    }

    public void mo775b(boolean z) {
        synchronized (this.f3495c) {
            if (this.f3499g != null) {
                this.f3499g.m2718a(this.f3493a.m5050b(), z);
            } else {
                this.f3501i = z;
            }
        }
    }

    public Activity mo776c() {
        return this.f3494b.m5058a();
    }

    public void mo777c(String str) {
        synchronized (this.f3495c) {
            this.f3509q = str;
        }
    }

    public void mo778c(boolean z) {
        synchronized (this.f3495c) {
            this.f3507o = z;
        }
    }

    public Context mo779d() {
        return this.f3494b.m5059b();
    }

    protected void m5089d(String str) {
        synchronized (this.f3495c) {
            if (mo796n()) {
                C0691b.m3103e("The webview is destroyed. Ignoring action.");
            } else {
                loadUrl(str);
            }
        }
    }

    public void destroy() {
        synchronized (this.f3495c) {
            this.f3511s.m4975b();
            if (this.f3499g != null) {
                this.f3499g.m2711a();
                this.f3499g.mo476l();
                this.f3499g = null;
            }
            this.f3493a.m5054f();
            if (this.f3502j) {
                return;
            }
            C0618p.m2809r().m4117a((hg) this);
            m5066y();
            this.f3502j = true;
            C0691b.m3101d("Initiating WebView self destruct sequence in 3...");
            this.f3493a.m5052d();
        }
    }

    public C0552d mo781e() {
        return this.f3498f;
    }

    protected void m5091e(String str) {
        if (is.m5292h()) {
            if (m5106t() == null) {
                m5062u();
            }
            if (m5106t().booleanValue()) {
                m5075a(str, null);
                return;
            } else {
                m5089d("javascript:" + str);
                return;
            }
        }
        m5089d("javascript:" + str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void evaluateJavascript(java.lang.String r3, android.webkit.ValueCallback<java.lang.String> r4) {
        /*
        r2 = this;
        r1 = r2.f3495c;
        monitor-enter(r1);
        r0 = r2.mo796n();	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0016;
    L_0x0009:
        r0 = "The webview is destroyed. Ignoring action.";
        com.google.android.gms.ads.internal.util.client.C0691b.m3103e(r0);	 Catch:{ all -> 0x001b }
        if (r4 == 0) goto L_0x0014;
    L_0x0010:
        r0 = 0;
        r4.onReceiveValue(r0);	 Catch:{ all -> 0x001b }
    L_0x0014:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
    L_0x0015:
        return;
    L_0x0016:
        super.evaluateJavascript(r3, r4);	 Catch:{ all -> 0x001b }
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        goto L_0x0015;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.hj.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    public C0608d mo782f() {
        C0608d c0608d;
        synchronized (this.f3495c) {
            c0608d = this.f3499g;
        }
        return c0608d;
    }

    public C0608d mo783g() {
        C0608d c0608d;
        synchronized (this.f3495c) {
            c0608d = this.f3510r;
        }
        return c0608d;
    }

    public String getRequestId() {
        String str;
        synchronized (this.f3495c) {
            str = this.f3508p;
        }
        return str;
    }

    public int getRequestedOrientation() {
        int i;
        synchronized (this.f3495c) {
            i = this.f3506n;
        }
        return i;
    }

    public WebView getWebView() {
        return this;
    }

    public AdSizeParcel mo787h() {
        AdSizeParcel adSizeParcel;
        synchronized (this.f3495c) {
            adSizeParcel = this.f3500h;
        }
        return adSizeParcel;
    }

    public hh mo788i() {
        return this.f3493a;
    }

    public boolean mo789j() {
        return this.f3501i;
    }

    public C1141o mo790k() {
        return this.f3496d;
    }

    public VersionInfoParcel mo791l() {
        return this.f3497e;
    }

    public void loadData(String str, String str2, String str3) {
        synchronized (this.f3495c) {
            if (mo796n()) {
                C0691b.m3103e("The webview is destroyed. Ignoring action.");
            } else {
                super.loadData(str, str2, str3);
            }
        }
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        synchronized (this.f3495c) {
            if (mo796n()) {
                C0691b.m3103e("The webview is destroyed. Ignoring action.");
            } else {
                super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            }
        }
    }

    public void loadUrl(String str) {
        synchronized (this.f3495c) {
            if (mo796n()) {
                C0691b.m3103e("The webview is destroyed. Ignoring action.");
            } else {
                super.loadUrl(str);
            }
        }
    }

    public boolean mo795m() {
        boolean z;
        synchronized (this.f3495c) {
            z = this.f3503k;
        }
        return z;
    }

    public boolean mo796n() {
        boolean z;
        synchronized (this.f3495c) {
            z = this.f3502j;
        }
        return z;
    }

    public void mo797o() {
        synchronized (this.f3495c) {
            C0691b.m3101d("Destroying WebView!");
            go.f3361a.post(new C10181(this));
        }
    }

    protected void onAttachedToWindow() {
        synchronized (this.f3495c) {
            super.onAttachedToWindow();
            if (!mo796n()) {
                this.f3511s.m4976c();
            }
        }
    }

    protected void onDetachedFromWindow() {
        synchronized (this.f3495c) {
            if (!mo796n()) {
                this.f3511s.m4977d();
            }
            super.onDetachedFromWindow();
        }
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            getContext().startActivity(intent);
        } catch (ActivityNotFoundException e) {
            C0691b.m3093a("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    protected void onDraw(Canvas canvas) {
        if (!mo796n()) {
            if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
            }
        }
    }

    public void onGlobalLayout() {
        boolean s = m5105s();
        C0608d f = mo782f();
        if (f != null && s) {
            f.m2736p();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r10, int r11) {
        /*
        r9 = this;
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = 8;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4 = r9.f3495c;
        monitor-enter(r4);
        r1 = r9.mo796n();	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0019;
    L_0x0012:
        r0 = 0;
        r1 = 0;
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
    L_0x0018:
        return;
    L_0x0019:
        r1 = r9.isInEditMode();	 Catch:{ all -> 0x002e }
        if (r1 != 0) goto L_0x0029;
    L_0x001f:
        r1 = r9.f3503k;	 Catch:{ all -> 0x002e }
        if (r1 != 0) goto L_0x0029;
    L_0x0023:
        r1 = r9.f3500h;	 Catch:{ all -> 0x002e }
        r1 = r1.f1355i;	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0031;
    L_0x0029:
        super.onMeasure(r10, r11);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x002e:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        throw r0;
    L_0x0031:
        r1 = r9.f3500h;	 Catch:{ all -> 0x002e }
        r1 = r1.f1351e;	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x004e;
    L_0x0037:
        r0 = new android.util.DisplayMetrics;	 Catch:{ all -> 0x002e }
        r0.<init>();	 Catch:{ all -> 0x002e }
        r1 = r9.f3517y;	 Catch:{ all -> 0x002e }
        r1 = r1.getDefaultDisplay();	 Catch:{ all -> 0x002e }
        r1.getMetrics(r0);	 Catch:{ all -> 0x002e }
        r1 = r0.widthPixels;	 Catch:{ all -> 0x002e }
        r0 = r0.heightPixels;	 Catch:{ all -> 0x002e }
        r9.setMeasuredDimension(r1, r0);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x004e:
        r2 = android.view.View.MeasureSpec.getMode(r10);	 Catch:{ all -> 0x002e }
        r3 = android.view.View.MeasureSpec.getSize(r10);	 Catch:{ all -> 0x002e }
        r5 = android.view.View.MeasureSpec.getMode(r11);	 Catch:{ all -> 0x002e }
        r1 = android.view.View.MeasureSpec.getSize(r11);	 Catch:{ all -> 0x002e }
        if (r2 == r6) goto L_0x0062;
    L_0x0060:
        if (r2 != r8) goto L_0x00f7;
    L_0x0062:
        r2 = r3;
    L_0x0063:
        if (r5 == r6) goto L_0x0067;
    L_0x0065:
        if (r5 != r8) goto L_0x0068;
    L_0x0067:
        r0 = r1;
    L_0x0068:
        r5 = r9.f3500h;	 Catch:{ all -> 0x002e }
        r5 = r5.f1353g;	 Catch:{ all -> 0x002e }
        if (r5 > r2) goto L_0x0074;
    L_0x006e:
        r2 = r9.f3500h;	 Catch:{ all -> 0x002e }
        r2 = r2.f1350d;	 Catch:{ all -> 0x002e }
        if (r2 <= r0) goto L_0x00e1;
    L_0x0074:
        r0 = r9.f3494b;	 Catch:{ all -> 0x002e }
        r0 = r0.getResources();	 Catch:{ all -> 0x002e }
        r0 = r0.getDisplayMetrics();	 Catch:{ all -> 0x002e }
        r0 = r0.density;	 Catch:{ all -> 0x002e }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002e }
        r2.<init>();	 Catch:{ all -> 0x002e }
        r5 = "Not enough space to show ad. Needs ";
        r2 = r2.append(r5);	 Catch:{ all -> 0x002e }
        r5 = r9.f3500h;	 Catch:{ all -> 0x002e }
        r5 = r5.f1353g;	 Catch:{ all -> 0x002e }
        r5 = (float) r5;	 Catch:{ all -> 0x002e }
        r5 = r5 / r0;
        r5 = (int) r5;	 Catch:{ all -> 0x002e }
        r2 = r2.append(r5);	 Catch:{ all -> 0x002e }
        r5 = "x";
        r2 = r2.append(r5);	 Catch:{ all -> 0x002e }
        r5 = r9.f3500h;	 Catch:{ all -> 0x002e }
        r5 = r5.f1350d;	 Catch:{ all -> 0x002e }
        r5 = (float) r5;	 Catch:{ all -> 0x002e }
        r5 = r5 / r0;
        r5 = (int) r5;	 Catch:{ all -> 0x002e }
        r2 = r2.append(r5);	 Catch:{ all -> 0x002e }
        r5 = " dp, but only has ";
        r2 = r2.append(r5);	 Catch:{ all -> 0x002e }
        r3 = (float) r3;	 Catch:{ all -> 0x002e }
        r3 = r3 / r0;
        r3 = (int) r3;	 Catch:{ all -> 0x002e }
        r2 = r2.append(r3);	 Catch:{ all -> 0x002e }
        r3 = "x";
        r2 = r2.append(r3);	 Catch:{ all -> 0x002e }
        r1 = (float) r1;	 Catch:{ all -> 0x002e }
        r0 = r1 / r0;
        r0 = (int) r0;	 Catch:{ all -> 0x002e }
        r0 = r2.append(r0);	 Catch:{ all -> 0x002e }
        r1 = " dp.";
        r0 = r0.append(r1);	 Catch:{ all -> 0x002e }
        r0 = r0.toString();	 Catch:{ all -> 0x002e }
        com.google.android.gms.ads.internal.util.client.C0691b.m3103e(r0);	 Catch:{ all -> 0x002e }
        r0 = r9.getVisibility();	 Catch:{ all -> 0x002e }
        if (r0 == r7) goto L_0x00d9;
    L_0x00d5:
        r0 = 4;
        r9.setVisibility(r0);	 Catch:{ all -> 0x002e }
    L_0x00d9:
        r0 = 0;
        r1 = 0;
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x002e }
    L_0x00de:
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x00e1:
        r0 = r9.getVisibility();	 Catch:{ all -> 0x002e }
        if (r0 == r7) goto L_0x00eb;
    L_0x00e7:
        r0 = 0;
        r9.setVisibility(r0);	 Catch:{ all -> 0x002e }
    L_0x00eb:
        r0 = r9.f3500h;	 Catch:{ all -> 0x002e }
        r0 = r0.f1353g;	 Catch:{ all -> 0x002e }
        r1 = r9.f3500h;	 Catch:{ all -> 0x002e }
        r1 = r1.f1350d;	 Catch:{ all -> 0x002e }
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x002e }
        goto L_0x00de;
    L_0x00f7:
        r2 = r0;
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.hj.onMeasure(int, int):void");
    }

    public void onPause() {
        if (!mo796n()) {
            try {
                super.onPause();
            } catch (Throwable e) {
                C0691b.m3098b("Could not pause webview.", e);
            }
        }
    }

    public void onResume() {
        if (!mo796n()) {
            try {
                super.onResume();
            } catch (Throwable e) {
                C0691b.m3098b("Could not resume webview.", e);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3496d != null) {
            this.f3496d.m5855a(motionEvent);
        }
        return mo796n() ? false : super.onTouchEvent(motionEvent);
    }

    public boolean mo798p() {
        boolean z;
        synchronized (this.f3495c) {
            z = this.f3507o;
        }
        return z;
    }

    public void mo799q() {
        this.f3511s.m4973a();
    }

    public String mo800r() {
        String str;
        synchronized (this.f3495c) {
            str = this.f3509q;
        }
        return str;
    }

    public boolean m5105s() {
        if (!mo788i().m5050b()) {
            return false;
        }
        int i;
        int i2;
        DisplayMetrics a = C0618p.m2796e().m4837a(this.f3517y);
        int b = C0526n.m2400a().m3087b(a, a.widthPixels);
        int b2 = C0526n.m2400a().m3087b(a, a.heightPixels);
        Activity c = mo776c();
        if (c == null || c.getWindow() == null) {
            i = b2;
            i2 = b;
        } else {
            int[] a2 = C0618p.m2796e().m4866a(c);
            i2 = C0526n.m2400a().m3087b(a, a2[0]);
            i = C0526n.m2400a().m3087b(a, a2[1]);
        }
        if (this.f3513u == b && this.f3512t == b2 && this.f3514v == i2 && this.f3515w == i) {
            return false;
        }
        boolean z = (this.f3513u == b && this.f3512t == b2) ? false : true;
        this.f3513u = b;
        this.f3512t = b2;
        this.f3514v = i2;
        this.f3515w = i;
        new ed(this).m4423a(b, b2, i2, i, a.density, this.f3517y.getDefaultDisplay().getRotation());
        return z;
    }

    public void setContext(Context context) {
        this.f3494b.setBaseContext(context);
        this.f3511s.m4974a(this.f3494b.m5058a());
    }

    public void setRequestedOrientation(int i) {
        synchronized (this.f3495c) {
            this.f3506n = i;
            if (this.f3499g != null) {
                this.f3499g.m2712a(this.f3506n);
            }
        }
    }

    public void stopLoading() {
        if (!mo796n()) {
            try {
                super.stopLoading();
            } catch (Throwable e) {
                C0691b.m3098b("Could not stop loading webview.", e);
            }
        }
    }

    Boolean m5106t() {
        Boolean bool;
        synchronized (this.f3495c) {
            bool = this.f3505m;
        }
        return bool;
    }
}
