package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.az;
import com.google.android.gms.p028c.be;
import com.google.android.gms.p028c.bf;
import com.google.android.gms.p028c.eg.C0606a;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.gq;
import com.google.android.gms.p028c.hg;
import com.google.android.gms.p028c.hh.C0601a;
import java.util.Collections;

@fn
public class C0608d extends C0606a implements C0607o {
    static final int f1642a = Color.argb(0, 0, 0, 0);
    AdOverlayInfoParcel f1643b;
    C0613k f1644c;
    hg f1645d;
    C0605c f1646e;
    C0615m f1647f;
    boolean f1648g = false;
    FrameLayout f1649h;
    CustomViewCallback f1650i;
    boolean f1651j = false;
    boolean f1652k = false;
    RelativeLayout f1653l;
    boolean f1654m = false;
    int f1655n = 0;
    private final Activity f1656o;
    private final bf f1657p;
    private final be f1658q;
    private boolean f1659r;
    private boolean f1660s = false;
    private boolean f1661t = true;

    class C06021 implements C0601a {
        final /* synthetic */ C0608d f1636a;

        C06021(C0608d c0608d) {
            this.f1636a = c0608d;
        }

        public void mo465a(hg hgVar, boolean z) {
            hgVar.mo771b();
        }
    }

    @fn
    private static final class C0603a extends Exception {
        public C0603a(String str) {
            super(str);
        }
    }

    @fn
    static final class C0604b extends RelativeLayout {
        gq f1637a;

        public C0604b(Context context, String str) {
            super(context);
            this.f1637a = new gq(context, str);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.f1637a.m4935a(motionEvent);
            return false;
        }
    }

    @fn
    public static class C0605c {
        public final int f1638a;
        public final LayoutParams f1639b;
        public final ViewGroup f1640c;
        public final Context f1641d;

        public C0605c(hg hgVar) {
            this.f1639b = hgVar.getLayoutParams();
            ViewParent parent = hgVar.getParent();
            this.f1641d = hgVar.mo779d();
            if (parent == null || !(parent instanceof ViewGroup)) {
                throw new C0603a("Could not get the parent of the WebView for an overlay.");
            }
            this.f1640c = (ViewGroup) parent;
            this.f1638a = this.f1640c.indexOfChild(hgVar.getWebView());
            this.f1640c.removeView(hgVar.getWebView());
            hgVar.mo770a(true);
        }
    }

    public C0608d(Activity activity) {
        this.f1656o = activity;
        this.f1657p = new bf(((Boolean) az.f2455G.m3878c()).booleanValue(), "show_interstitial", "interstitial");
        this.f1658q = this.f1657p.m3916a();
    }

    public void m2711a() {
        this.f1655n = 2;
        this.f1656o.finish();
    }

    public void m2712a(int i) {
        this.f1656o.setRequestedOrientation(i);
    }

    public void m2713a(int i, int i2, int i3, int i4) {
        if (this.f1644c != null) {
            this.f1644c.m2761a(i, i2, i3, i4);
        }
    }

    public void m2714a(int i, int i2, int i3, int i4, int i5) {
        this.f1657p.m3920a(this.f1658q, "vpr");
        be a = this.f1657p.m3916a();
        if (this.f1644c == null) {
            this.f1644c = new C0613k(this.f1656o, this.f1645d, i5, this.f1657p, a);
            this.f1653l.addView(this.f1644c, 0, new LayoutParams(-1, -1));
            this.f1644c.m2761a(i, i2, i3, i4);
            this.f1645d.mo788i().m5045a(false);
        }
    }

    public void mo466a(Bundle bundle) {
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        this.f1651j = z;
        try {
            this.f1643b = AdOverlayInfoParcel.m2652a(this.f1656o.getIntent());
            if (this.f1643b == null) {
                throw new C0603a("Could not get info for ad overlay.");
            }
            if (this.f1643b.f1607n.f1978d > 7500000) {
                this.f1655n = 3;
            }
            if (this.f1656o.getIntent() != null) {
                this.f1661t = this.f1656o.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.f1643b.f1610q != null) {
                this.f1652k = this.f1643b.f1610q.f1305b;
            } else {
                this.f1652k = false;
            }
            if (bundle == null) {
                if (this.f1643b.f1597d != null && this.f1661t) {
                    this.f1643b.f1597d.c_();
                }
                if (!(this.f1643b.f1605l == 1 || this.f1643b.f1596c == null)) {
                    this.f1643b.f1596c.mo327e();
                }
            }
            this.f1653l = new C0604b(this.f1656o, this.f1643b.f1609p);
            switch (this.f1643b.f1605l) {
                case 1:
                    m2722b(false);
                    return;
                case 2:
                    this.f1646e = new C0605c(this.f1643b.f1598e);
                    m2722b(false);
                    return;
                case 3:
                    m2722b(true);
                    return;
                case 4:
                    if (this.f1651j) {
                        this.f1655n = 3;
                        this.f1656o.finish();
                        return;
                    } else if (!C0618p.m2793b().m2660a(this.f1656o, this.f1643b.f1595b, this.f1643b.f1603j)) {
                        this.f1655n = 3;
                        this.f1656o.finish();
                        return;
                    } else {
                        return;
                    }
                default:
                    throw new C0603a("Could not determine ad overlay type.");
            }
        } catch (C0603a e) {
            C0691b.m3103e(e.getMessage());
            this.f1655n = 3;
            this.f1656o.finish();
        }
    }

    public void m2716a(View view, CustomViewCallback customViewCallback) {
        this.f1649h = new FrameLayout(this.f1656o);
        this.f1649h.setBackgroundColor(-16777216);
        this.f1649h.addView(view, -1, -1);
        this.f1656o.setContentView(this.f1649h);
        mo477m();
        this.f1650i = customViewCallback;
        this.f1648g = true;
    }

    public void m2717a(boolean z) {
        this.f1647f = new C0615m(this.f1656o, z ? 50 : 32, this);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        this.f1647f.m2779a(z, this.f1643b.f1601h);
        this.f1653l.addView(this.f1647f, layoutParams);
    }

    public void m2718a(boolean z, boolean z2) {
        if (this.f1647f != null) {
            this.f1647f.m2779a(z, z2);
        }
    }

    public C0613k m2719b() {
        return this.f1644c;
    }

    protected void m2720b(int i) {
        this.f1645d.mo761a(i);
    }

    public void mo467b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f1651j);
    }

    protected void m2722b(boolean z) {
        if (!this.f1659r) {
            this.f1656o.requestWindowFeature(1);
        }
        Window window = this.f1656o.getWindow();
        if (window == null) {
            throw new C0603a("Invalid activity, no window available.");
        }
        if (!this.f1652k || (this.f1643b.f1610q != null && this.f1643b.f1610q.f1306c)) {
            window.setFlags(1024, 1024);
        }
        boolean b = this.f1643b.f1598e.mo788i().m5050b();
        this.f1654m = false;
        if (b) {
            if (this.f1643b.f1604k == C0618p.m2798g().mo737a()) {
                this.f1654m = this.f1656o.getResources().getConfiguration().orientation == 1;
            } else if (this.f1643b.f1604k == C0618p.m2798g().mo739b()) {
                this.f1654m = this.f1656o.getResources().getConfiguration().orientation == 2;
            }
        }
        C0691b.m3093a("Delay onShow to next orientation change: " + this.f1654m);
        m2712a(this.f1643b.f1604k);
        if (C0618p.m2798g().mo744a(window)) {
            C0691b.m3093a("Hardware acceleration on the AdActivity window enabled.");
        }
        if (this.f1652k) {
            this.f1653l.setBackgroundColor(f1642a);
        } else {
            this.f1653l.setBackgroundColor(-16777216);
        }
        this.f1656o.setContentView(this.f1653l);
        mo477m();
        if (z) {
            this.f1645d = C0618p.m2797f().m5056a(this.f1656o, this.f1643b.f1598e.mo787h(), true, b, null, this.f1643b.f1607n);
            this.f1645d.mo788i().m5039a(null, null, this.f1643b.f1599f, this.f1643b.f1603j, true, this.f1643b.f1608o, null, this.f1643b.f1598e.mo788i().m5035a(), null);
            this.f1645d.mo788i().m5042a(new C06021(this));
            if (this.f1643b.f1606m != null) {
                this.f1645d.loadUrl(this.f1643b.f1606m);
            } else if (this.f1643b.f1602i != null) {
                this.f1645d.loadDataWithBaseURL(this.f1643b.f1600g, this.f1643b.f1602i, "text/html", "UTF-8", null);
            } else {
                throw new C0603a("No URL or HTML to display in ad overlay.");
            }
            if (this.f1643b.f1598e != null) {
                this.f1643b.f1598e.mo772b(this);
            }
        } else {
            this.f1645d = this.f1643b.f1598e;
            this.f1645d.setContext(this.f1656o);
        }
        this.f1645d.mo764a(this);
        ViewParent parent = this.f1645d.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.f1645d.getWebView());
        }
        if (this.f1652k) {
            this.f1645d.setBackgroundColor(f1642a);
        }
        this.f1653l.addView(this.f1645d.getWebView(), -1, -1);
        if (!(z || this.f1654m)) {
            m2737q();
        }
        m2717a(b);
        if (this.f1645d.mo789j()) {
            m2718a(b, true);
        }
    }

    public void m2723c() {
        if (this.f1643b != null && this.f1648g) {
            m2712a(this.f1643b.f1604k);
        }
        if (this.f1649h != null) {
            this.f1656o.setContentView(this.f1653l);
            mo477m();
            this.f1649h.removeAllViews();
            this.f1649h = null;
        }
        if (this.f1650i != null) {
            this.f1650i.onCustomViewHidden();
            this.f1650i = null;
        }
        this.f1648g = false;
    }

    public void mo468d() {
        this.f1655n = 1;
        this.f1656o.finish();
    }

    public void mo469e() {
        this.f1655n = 0;
    }

    public boolean mo470f() {
        this.f1655n = 0;
        if (this.f1645d == null) {
            return true;
        }
        boolean p = this.f1645d.mo798p();
        if (p) {
            return p;
        }
        this.f1645d.mo768a("onbackblocked", Collections.emptyMap());
        return p;
    }

    public void mo471g() {
    }

    public void mo472h() {
    }

    public void mo473i() {
        if (this.f1643b != null && this.f1643b.f1605l == 4) {
            if (this.f1651j) {
                this.f1655n = 3;
                this.f1656o.finish();
            } else {
                this.f1651j = true;
            }
        }
        if (this.f1645d == null || this.f1645d.mo796n()) {
            C0691b.m3103e("The webview does not exit. Ignoring action.");
        } else {
            C0618p.m2798g().mo747b(this.f1645d.getWebView());
        }
    }

    public void mo474j() {
        if (this.f1644c != null) {
            this.f1644c.m2771h();
        }
        m2723c();
        if (this.f1645d != null && (!this.f1656o.isFinishing() || this.f1646e == null)) {
            C0618p.m2798g().mo745a(this.f1645d.getWebView());
        }
        m2735o();
    }

    public void mo475k() {
        m2735o();
    }

    public void mo476l() {
        if (this.f1644c != null) {
            this.f1644c.m2776m();
        }
        if (this.f1645d != null) {
            this.f1653l.removeView(this.f1645d.getWebView());
        }
        m2735o();
    }

    public void mo477m() {
        this.f1659r = true;
    }

    public void m2734n() {
        this.f1653l.removeView(this.f1647f);
        m2717a(true);
    }

    protected void m2735o() {
        if (this.f1656o.isFinishing() && !this.f1660s) {
            this.f1660s = true;
            if (C0618p.m2799h().m4788e() != null) {
                C0618p.m2799h().m4788e().m3910a(this.f1657p);
            }
            if (this.f1645d != null) {
                m2720b(this.f1655n);
                this.f1653l.removeView(this.f1645d.getWebView());
                if (this.f1646e != null) {
                    this.f1645d.setContext(this.f1646e.f1641d);
                    this.f1645d.mo770a(false);
                    this.f1646e.f1640c.addView(this.f1645d.getWebView(), this.f1646e.f1638a, this.f1646e.f1639b);
                    this.f1646e = null;
                }
                this.f1645d = null;
            }
            if (this.f1643b != null && this.f1643b.f1597d != null) {
                this.f1643b.f1597d.b_();
            }
        }
    }

    public void m2736p() {
        if (this.f1654m) {
            this.f1654m = false;
            m2737q();
        }
    }

    protected void m2737q() {
        this.f1645d.mo771b();
    }
}
