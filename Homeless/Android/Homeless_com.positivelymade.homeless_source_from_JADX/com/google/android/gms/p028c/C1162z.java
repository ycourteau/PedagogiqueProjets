package com.google.android.gms.p028c;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p028c.cv.C0886d;
import com.google.android.gms.p028c.he.C0669c;
import com.google.android.gms.p028c.he.C0671a;
import com.google.android.gms.p028c.he.C1012b;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@fn
public class C1162z implements OnGlobalLayoutListener, OnScrollChangedListener {
    private final Object f4062a = new Object();
    private final WeakReference<gd> f4063b;
    private WeakReference<ViewTreeObserver> f4064c;
    private final WeakReference<View> f4065d;
    private final C1151x f4066e;
    private final Context f4067f;
    private final cv f4068g;
    private final C0886d f4069h;
    private boolean f4070i;
    private final WindowManager f4071j;
    private final PowerManager f4072k;
    private final KeyguardManager f4073l;
    private ab f4074m;
    private boolean f4075n;
    private boolean f4076o = false;
    private boolean f4077p = false;
    private boolean f4078q;
    private boolean f4079r;
    private BroadcastReceiver f4080s;
    private final HashSet<C1014w> f4081t = new HashSet();
    private gw f4082u;
    private final cg f4083v = new C11586(this);
    private final cg f4084w = new C11597(this);
    private final cg f4085x = new C11608(this);

    class C11542 implements C0671a {
        final /* synthetic */ C1162z f4053a;

        C11542(C1162z c1162z) {
            this.f4053a = c1162z;
        }

        public void mo522a() {
        }
    }

    class C11553 implements C0669c<af> {
        final /* synthetic */ C1162z f4054a;

        C11553(C1162z c1162z) {
            this.f4054a = c1162z;
        }

        public void m5923a(af afVar) {
            this.f4054a.f4070i = true;
            this.f4054a.m5938a(afVar);
            this.f4054a.m5935a();
            this.f4054a.m5944b(false);
        }

        public /* synthetic */ void mo521a(Object obj) {
            m5923a((af) obj);
        }
    }

    class C11564 implements C0671a {
        final /* synthetic */ C1162z f4055a;

        C11564(C1162z c1162z) {
            this.f4055a = c1162z;
        }

        public void mo522a() {
            this.f4055a.m5946c();
        }
    }

    class C11575 extends BroadcastReceiver {
        final /* synthetic */ C1162z f4056a;

        C11575(C1162z c1162z) {
            this.f4056a = c1162z;
        }

        public void onReceive(Context context, Intent intent) {
            this.f4056a.m5944b(false);
        }
    }

    class C11586 implements cg {
        final /* synthetic */ C1162z f4057a;

        C11586(C1162z c1162z) {
            this.f4057a = c1162z;
        }

        public void mo524a(hg hgVar, Map<String, String> map) {
            if (this.f4057a.m5942a((Map) map)) {
                this.f4057a.m5936a(hgVar.getWebView(), (Map) map);
            }
        }
    }

    class C11597 implements cg {
        final /* synthetic */ C1162z f4058a;

        C11597(C1162z c1162z) {
            this.f4058a = c1162z;
        }

        public void mo524a(hg hgVar, Map<String, String> map) {
            if (this.f4058a.m5942a((Map) map)) {
                C0691b.m3093a("Received request to untrack: " + this.f4058a.f4066e.m5910d());
                this.f4058a.m5946c();
            }
        }
    }

    class C11608 implements cg {
        final /* synthetic */ C1162z f4059a;

        C11608(C1162z c1162z) {
            this.f4059a = c1162z;
        }

        public void mo524a(hg hgVar, Map<String, String> map) {
            if (this.f4059a.m5942a((Map) map) && map.containsKey("isVisible")) {
                boolean z = "1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible"));
                this.f4059a.m5941a(Boolean.valueOf(z).booleanValue());
            }
        }
    }

    public C1162z(AdSizeParcel adSizeParcel, gd gdVar, VersionInfoParcel versionInfoParcel, View view, cv cvVar) {
        this.f4068g = cvVar;
        this.f4063b = new WeakReference(gdVar);
        this.f4065d = new WeakReference(view);
        this.f4064c = new WeakReference(null);
        this.f4078q = true;
        this.f4082u = new gw(200);
        this.f4066e = new C1151x(UUID.randomUUID().toString(), versionInfoParcel, adSizeParcel.f1348b, gdVar.f3275j, gdVar.m4755a());
        this.f4069h = this.f4068g.m4175b();
        this.f4071j = (WindowManager) view.getContext().getSystemService("window");
        this.f4072k = (PowerManager) view.getContext().getApplicationContext().getSystemService("power");
        this.f4073l = (KeyguardManager) view.getContext().getSystemService("keyguard");
        this.f4067f = view.getContext().getApplicationContext();
        try {
            final JSONObject a = m5934a(view);
            this.f4069h.m4147a(new C0669c<af>(this) {
                final /* synthetic */ C1162z f4052b;

                public void m5920a(af afVar) {
                    this.f4052b.m5940a(a);
                }

                public /* synthetic */ void mo521a(Object obj) {
                    m5920a((af) obj);
                }
            }, new C11542(this));
        } catch (JSONException e) {
        } catch (Throwable e2) {
            C0691b.m3098b("Failure while processing active view data.", e2);
        }
        this.f4069h.m4147a(new C11553(this), new C11564(this));
        C0691b.m3093a("Tracking ad unit: " + this.f4066e.m5910d());
    }

    protected int m5933a(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    protected JSONObject m5934a(View view) {
        boolean a = C0618p.m2798g().mo753a(view);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view.getLocationOnScreen(iArr);
            view.getLocationInWindow(iArr2);
        } catch (Throwable e) {
            C0691b.m3098b("Failure getting view location.", e);
        }
        DisplayMetrics displayMetrics = view.getContext().getResources().getDisplayMetrics();
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        rect2.right = this.f4071j.getDefaultDisplay().getWidth();
        rect2.bottom = this.f4071j.getDefaultDisplay().getHeight();
        Rect rect3 = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect3, null);
        Rect rect4 = new Rect();
        boolean localVisibleRect = view.getLocalVisibleRect(rect4);
        Rect rect5 = new Rect();
        view.getHitRect(rect5);
        JSONObject i = m5952i();
        i.put("windowVisibility", view.getWindowVisibility()).put("isStopped", this.f4077p).put("isPaused", this.f4076o).put("isAttachedToWindow", a).put("viewBox", new JSONObject().put("top", m5933a(rect2.top, displayMetrics)).put("bottom", m5933a(rect2.bottom, displayMetrics)).put("left", m5933a(rect2.left, displayMetrics)).put("right", m5933a(rect2.right, displayMetrics))).put("adBox", new JSONObject().put("top", m5933a(rect.top, displayMetrics)).put("bottom", m5933a(rect.bottom, displayMetrics)).put("left", m5933a(rect.left, displayMetrics)).put("right", m5933a(rect.right, displayMetrics))).put("globalVisibleBox", new JSONObject().put("top", m5933a(rect3.top, displayMetrics)).put("bottom", m5933a(rect3.bottom, displayMetrics)).put("left", m5933a(rect3.left, displayMetrics)).put("right", m5933a(rect3.right, displayMetrics))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", m5933a(rect4.top, displayMetrics)).put("bottom", m5933a(rect4.bottom, displayMetrics)).put("left", m5933a(rect4.left, displayMetrics)).put("right", m5933a(rect4.right, displayMetrics))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", m5933a(rect5.top, displayMetrics)).put("bottom", m5933a(rect5.bottom, displayMetrics)).put("left", m5933a(rect5.left, displayMetrics)).put("right", m5933a(rect5.right, displayMetrics))).put("screenDensity", (double) displayMetrics.density).put("isVisible", m5945b(view));
        return i;
    }

    protected void m5935a() {
        synchronized (this.f4062a) {
            if (this.f4080s != null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.f4080s = new C11575(this);
            this.f4067f.registerReceiver(this.f4080s, intentFilter);
        }
    }

    protected void m5936a(View view, Map<String, String> map) {
        m5944b(false);
    }

    public void m5937a(ab abVar) {
        synchronized (this.f4062a) {
            this.f4074m = abVar;
        }
    }

    protected void m5938a(af afVar) {
        afVar.mo581a("/updateActiveView", this.f4083v);
        afVar.mo581a("/untrackActiveViewUnit", this.f4084w);
        afVar.mo581a("/visibilityChanged", this.f4085x);
    }

    public void m5939a(C1014w c1014w) {
        this.f4081t.add(c1014w);
    }

    protected void m5940a(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = new JSONArray();
            final JSONObject jSONObject2 = new JSONObject();
            jSONArray.put(jSONObject);
            jSONObject2.put("units", jSONArray);
            this.f4069h.m4147a(new C0669c<af>(this) {
                final /* synthetic */ C1162z f4061b;

                public void m5929a(af afVar) {
                    afVar.mo583a("AFMA_updateActiveView", jSONObject2);
                }

                public /* synthetic */ void mo521a(Object obj) {
                    m5929a((af) obj);
                }
            }, new C1012b());
        } catch (Throwable th) {
            C0691b.m3098b("Skipping active view message.", th);
        }
    }

    protected void m5941a(boolean z) {
        Iterator it = this.f4081t.iterator();
        while (it.hasNext()) {
            ((C1014w) it.next()).mo765a(this, z);
        }
    }

    protected boolean m5942a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        boolean z = !TextUtils.isEmpty(str) && str.equals(this.f4066e.m5910d());
        return z;
    }

    protected void m5943b() {
        synchronized (this.f4062a) {
            if (this.f4080s != null) {
                this.f4067f.unregisterReceiver(this.f4080s);
                this.f4080s = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void m5944b(boolean r4) {
        /*
        r3 = this;
        r2 = r3.f4062a;
        monitor-enter(r2);
        r0 = r3.f4070i;	 Catch:{ all -> 0x0019 }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r3.f4078q;	 Catch:{ all -> 0x0019 }
        if (r0 != 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r2);	 Catch:{ all -> 0x0019 }
    L_0x000c:
        return;
    L_0x000d:
        if (r4 == 0) goto L_0x001c;
    L_0x000f:
        r0 = r3.f4082u;	 Catch:{ all -> 0x0019 }
        r0 = r0.m4968a();	 Catch:{ all -> 0x0019 }
        if (r0 != 0) goto L_0x001c;
    L_0x0017:
        monitor-exit(r2);	 Catch:{ all -> 0x0019 }
        goto L_0x000c;
    L_0x0019:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0019 }
        throw r0;
    L_0x001c:
        r0 = r3.f4063b;	 Catch:{ all -> 0x0019 }
        r0 = r0.get();	 Catch:{ all -> 0x0019 }
        r0 = (com.google.android.gms.p028c.gd) r0;	 Catch:{ all -> 0x0019 }
        r1 = r3.f4065d;	 Catch:{ all -> 0x0019 }
        r1 = r1.get();	 Catch:{ all -> 0x0019 }
        r1 = (android.view.View) r1;	 Catch:{ all -> 0x0019 }
        if (r1 == 0) goto L_0x0030;
    L_0x002e:
        if (r0 != 0) goto L_0x0038;
    L_0x0030:
        r0 = 1;
    L_0x0031:
        if (r0 == 0) goto L_0x003a;
    L_0x0033:
        r3.m5947d();	 Catch:{ all -> 0x0019 }
        monitor-exit(r2);	 Catch:{ all -> 0x0019 }
        goto L_0x000c;
    L_0x0038:
        r0 = 0;
        goto L_0x0031;
    L_0x003a:
        r0 = r3.m5934a(r1);	 Catch:{ JSONException -> 0x0050, RuntimeException -> 0x0049 }
        r3.m5940a(r0);	 Catch:{ JSONException -> 0x0050, RuntimeException -> 0x0049 }
    L_0x0041:
        r3.m5950g();	 Catch:{ all -> 0x0019 }
        r3.m5948e();	 Catch:{ all -> 0x0019 }
        monitor-exit(r2);	 Catch:{ all -> 0x0019 }
        goto L_0x000c;
    L_0x0049:
        r0 = move-exception;
    L_0x004a:
        r1 = "Active view update failed.";
        com.google.android.gms.ads.internal.util.client.C0691b.m3094a(r1, r0);	 Catch:{ all -> 0x0019 }
        goto L_0x0041;
    L_0x0050:
        r0 = move-exception;
        goto L_0x004a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.z.b(boolean):void");
    }

    protected boolean m5945b(View view) {
        return view.getVisibility() == 0 && view.isShown() && m5953j() && (!this.f4073l.inKeyguardRestrictedInputMode() || C0618p.m2796e().m4862a());
    }

    protected void m5946c() {
        synchronized (this.f4062a) {
            m5951h();
            m5943b();
            this.f4078q = false;
            m5948e();
            this.f4069h.m4152a();
        }
    }

    public void m5947d() {
        synchronized (this.f4062a) {
            if (this.f4078q) {
                this.f4079r = true;
                try {
                    m5940a(m5954k());
                } catch (Throwable e) {
                    C0691b.m3098b("JSON failure while processing active view data.", e);
                } catch (Throwable e2) {
                    C0691b.m3098b("Failure while processing active view data.", e2);
                }
                C0691b.m3093a("Untracking ad unit: " + this.f4066e.m5910d());
            }
        }
    }

    protected void m5948e() {
        if (this.f4074m != null) {
            this.f4074m.mo855a(this);
        }
    }

    public boolean m5949f() {
        boolean z;
        synchronized (this.f4062a) {
            z = this.f4078q;
        }
        return z;
    }

    protected void m5950g() {
        View view = (View) this.f4065d.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f4064c.get();
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2 != viewTreeObserver) {
                m5951h();
                if (!this.f4075n || (viewTreeObserver != null && viewTreeObserver.isAlive())) {
                    this.f4075n = true;
                    viewTreeObserver2.addOnScrollChangedListener(this);
                    viewTreeObserver2.addOnGlobalLayoutListener(this);
                }
                this.f4064c = new WeakReference(viewTreeObserver2);
            }
        }
    }

    protected void m5951h() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f4064c.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    protected JSONObject m5952i() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.f4066e.m5908b()).put("activeViewJSON", this.f4066e.m5909c()).put("timestamp", C0618p.m2800i().mo825b()).put("adFormat", this.f4066e.m5907a()).put("hashCode", this.f4066e.m5910d()).put("isMraid", this.f4066e.m5911e());
        return jSONObject;
    }

    boolean m5953j() {
        return this.f4072k.isScreenOn();
    }

    protected JSONObject m5954k() {
        JSONObject i = m5952i();
        i.put("doneReasonCode", "u");
        return i;
    }

    public void m5955l() {
        synchronized (this.f4062a) {
            this.f4077p = true;
            m5944b(false);
        }
    }

    public void m5956m() {
        synchronized (this.f4062a) {
            this.f4076o = true;
            m5944b(false);
        }
    }

    public void m5957n() {
        synchronized (this.f4062a) {
            this.f4076o = false;
            m5944b(false);
        }
    }

    public void onGlobalLayout() {
        m5944b(false);
    }

    public void onScrollChanged() {
        m5944b(true);
    }
}
