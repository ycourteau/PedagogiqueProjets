package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0511p;
import com.google.android.gms.ads.internal.client.C0514q;
import com.google.android.gms.ads.internal.client.C0522w;
import com.google.android.gms.ads.internal.client.C0526n;
import com.google.android.gms.ads.internal.client.C0527x;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.purchase.C0634k;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p028c.C1042if;
import com.google.android.gms.p028c.C1141o;
import com.google.android.gms.p028c.az;
import com.google.android.gms.p028c.bj;
import com.google.android.gms.p028c.bu;
import com.google.android.gms.p028c.bv;
import com.google.android.gms.p028c.bw;
import com.google.android.gms.p028c.bx;
import com.google.android.gms.p028c.eo;
import com.google.android.gms.p028c.es;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.gd;
import com.google.android.gms.p028c.gd.C0973a;
import com.google.android.gms.p028c.ge;
import com.google.android.gms.p028c.gi;
import com.google.android.gms.p028c.gk;
import com.google.android.gms.p028c.gq;
import com.google.android.gms.p028c.gw;
import com.google.android.gms.p028c.gy;
import com.google.android.gms.p028c.hg;
import com.google.android.gms.p028c.hh;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@fn
public final class C0637q implements OnGlobalLayoutListener, OnScrollChangedListener {
    public gi f1768A;
    View f1769B;
    public int f1770C;
    boolean f1771D;
    boolean f1772E;
    private HashSet<ge> f1773F;
    private int f1774G;
    private int f1775H;
    private gw f1776I;
    final String f1777a;
    public String f1778b;
    public final Context f1779c;
    final C1141o f1780d;
    public final VersionInfoParcel f1781e;
    C0636a f1782f;
    public gk f1783g;
    public gk f1784h;
    public AdSizeParcel f1785i;
    public gd f1786j;
    public C0973a f1787k;
    public ge f1788l;
    C0511p f1789m;
    C0514q f1790n;
    C0522w f1791o;
    C0527x f1792p;
    eo f1793q;
    es f1794r;
    bu f1795s;
    bv f1796t;
    C1042if<String, bw> f1797u;
    C1042if<String, bx> f1798v;
    NativeAdOptionsParcel f1799w;
    bj f1800x;
    List<String> f1801y;
    C0634k f1802z;

    public static final class C0636a extends ViewSwitcher {
        private final gq f1766a;
        private final gy f1767b;

        public C0636a(Context context, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
            super(context);
            this.f1766a = new gq(context);
            if (context instanceof Activity) {
                this.f1767b = new gy((Activity) context, onGlobalLayoutListener, onScrollChangedListener);
                this.f1767b.m4973a();
                return;
            }
            this.f1767b = null;
        }

        public gq m2892a() {
            return this.f1766a;
        }

        public void m2893b() {
            C0691b.m3101d("Disable position monitoring on adFrame.");
            if (this.f1767b != null) {
                this.f1767b.m4975b();
            }
        }

        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.f1767b != null) {
                this.f1767b.m4976c();
            }
        }

        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f1767b != null) {
                this.f1767b.m4977d();
            }
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.f1766a.m4935a(motionEvent);
            return false;
        }

        public void removeAllViews() {
            List<hg> arrayList = new ArrayList();
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt != null && (childAt instanceof hg)) {
                    arrayList.add((hg) childAt);
                }
            }
            super.removeAllViews();
            for (hg destroy : arrayList) {
                destroy.destroy();
            }
        }
    }

    public C0637q(Context context, AdSizeParcel adSizeParcel, String str, VersionInfoParcel versionInfoParcel) {
        this(context, adSizeParcel, str, versionInfoParcel, null);
    }

    C0637q(Context context, AdSizeParcel adSizeParcel, String str, VersionInfoParcel versionInfoParcel, C1141o c1141o) {
        this.f1768A = null;
        this.f1769B = null;
        this.f1770C = 0;
        this.f1771D = false;
        this.f1772E = false;
        this.f1773F = null;
        this.f1774G = -1;
        this.f1775H = -1;
        az.m3895a(context);
        if (C0618p.m2799h().m4788e() != null) {
            List a = az.m3894a();
            if (versionInfoParcel.f1977c != 0) {
                a.add(Integer.toString(versionInfoParcel.f1977c));
            }
            C0618p.m2799h().m4788e().m3909a(a);
        }
        this.f1777a = UUID.randomUUID().toString();
        if (adSizeParcel.f1351e || adSizeParcel.f1355i) {
            this.f1782f = null;
        } else {
            this.f1782f = new C0636a(context, this, this);
            this.f1782f.setMinimumWidth(adSizeParcel.f1353g);
            this.f1782f.setMinimumHeight(adSizeParcel.f1350d);
            this.f1782f.setVisibility(4);
        }
        this.f1785i = adSizeParcel;
        this.f1778b = str;
        this.f1779c = context;
        this.f1781e = versionInfoParcel;
        if (c1141o == null) {
            c1141o = new C1141o(new C0573h(this));
        }
        this.f1780d = c1141o;
        this.f1776I = new gw(200);
        this.f1798v = new C1042if();
    }

    private void m2894b(boolean z) {
        boolean z2 = true;
        if (this.f1782f != null && this.f1786j != null && this.f1786j.f3267b != null && this.f1786j.f3267b.mo788i().m5050b()) {
            if (!z || this.f1776I.m4968a()) {
                int[] iArr = new int[2];
                this.f1782f.getLocationOnScreen(iArr);
                int b = C0526n.m2400a().m3086b(this.f1779c, iArr[0]);
                int b2 = C0526n.m2400a().m3086b(this.f1779c, iArr[1]);
                if (b != this.f1774G || b2 != this.f1775H) {
                    this.f1774G = b;
                    this.f1775H = b2;
                    hh i = this.f1786j.f3267b.mo788i();
                    b = this.f1774G;
                    int i2 = this.f1775H;
                    if (z) {
                        z2 = false;
                    }
                    i.m5037a(b, i2, z2);
                }
            }
        }
    }

    public HashSet<ge> m2895a() {
        return this.f1773F;
    }

    public void m2896a(HashSet<ge> hashSet) {
        this.f1773F = hashSet;
    }

    public void m2897a(boolean z) {
        if (this.f1770C == 0) {
            m2899c();
        }
        if (this.f1783g != null) {
            this.f1783g.m2831i();
        }
        if (this.f1784h != null) {
            this.f1784h.m2831i();
        }
        if (z) {
            this.f1786j = null;
        }
    }

    public void m2898b() {
        if (this.f1786j != null && this.f1786j.f3267b != null) {
            this.f1786j.f3267b.destroy();
        }
    }

    public void m2899c() {
        if (this.f1786j != null && this.f1786j.f3267b != null) {
            this.f1786j.f3267b.stopLoading();
        }
    }

    public void m2900d() {
        if (this.f1786j != null && this.f1786j.f3278m != null) {
            try {
                this.f1786j.f3278m.mo653c();
            } catch (RemoteException e) {
                C0691b.m3103e("Could not destroy mediation adapter.");
            }
        }
    }

    public boolean m2901e() {
        return this.f1770C == 0;
    }

    public boolean m2902f() {
        return this.f1770C == 1;
    }

    public void m2903g() {
        if (this.f1782f != null) {
            this.f1782f.m2893b();
        }
    }

    public void m2904h() {
        this.f1788l.m4761a(this.f1786j.f3285t);
        this.f1788l.m4765b(this.f1786j.f3286u);
        this.f1788l.m4763a(this.f1785i.f1351e);
        this.f1788l.m4766b(this.f1786j.f3276k);
    }

    public void m2905i() {
        m2903g();
        this.f1790n = null;
        this.f1791o = null;
        this.f1794r = null;
        this.f1793q = null;
        this.f1800x = null;
        this.f1792p = null;
        m2897a(false);
        if (this.f1782f != null) {
            this.f1782f.removeAllViews();
        }
        m2898b();
        m2900d();
        this.f1786j = null;
    }

    public void onGlobalLayout() {
        m2894b(false);
    }

    public void onScrollChanged() {
        m2894b(true);
    }
}
