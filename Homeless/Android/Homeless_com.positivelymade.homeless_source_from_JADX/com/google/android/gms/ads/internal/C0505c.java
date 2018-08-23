package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.ads.internal.C0555e.C0554b;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.bf;
import com.google.android.gms.p028c.bg;
import com.google.android.gms.p028c.bi;
import com.google.android.gms.p028c.bj;
import com.google.android.gms.p028c.di;
import com.google.android.gms.p028c.ee;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.gd;
import com.google.android.gms.p028c.gd.C0973a;
import com.google.android.gms.p028c.go;
import com.google.android.gms.p028c.hg;

@fn
public abstract class C0505c extends C0499b implements C0504g, ee {
    public C0505c(Context context, AdSizeParcel adSizeParcel, String str, di diVar, VersionInfoParcel versionInfoParcel, C0552d c0552d) {
        super(context, adSizeParcel, str, diVar, versionInfoParcel, c0552d);
    }

    protected hg mo442a(C0973a c0973a, C0555e c0555e) {
        hg hgVar;
        View nextView = this.c.f1782f.getNextView();
        hg hgVar2;
        if (nextView instanceof hg) {
            C0691b.m3093a("Reusing webview...");
            hgVar2 = (hg) nextView;
            hgVar2.mo762a(this.c.f1779c, this.c.f1785i);
            hgVar = hgVar2;
        } else {
            if (nextView != null) {
                this.c.f1782f.removeView(nextView);
            }
            hgVar2 = C0618p.m2797f().m5057a(this.c.f1779c, this.c.f1785i, false, false, this.c.f1780d, this.c.f1781e, this.f);
            if (this.c.f1785i.f1354h == null) {
                m2196a(hgVar2.getWebView());
            }
            hgVar = hgVar2;
        }
        hgVar.mo788i().m5039a(this, this, this, this, false, this, null, c0555e, this);
        hgVar.mo773b(c0973a.f3258a.f1862z);
        hgVar.mo777c(c0973a.f3258a.f1860x);
        return hgVar;
    }

    public void mo379a(int i, int i2, int i3, int i4) {
        m2231p();
    }

    public void mo345a(bj bjVar) {
        C1305x.m6624b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.c.f1800x = bjVar;
    }

    protected void mo380a(final C0973a c0973a, final bf bfVar) {
        if (c0973a.f3262e != -2) {
            go.f3361a.post(new Runnable(this) {
                final /* synthetic */ C0505c f1322b;

                public void run() {
                    this.f1322b.mo354b(new gd(c0973a, null, null, null, null, null, null));
                }
            });
            return;
        }
        if (c0973a.f3261d != null) {
            this.c.f1785i = c0973a.f3261d;
        }
        if (c0973a.f3259b.f1871h) {
            this.c.f1770C = 0;
            this.c.f1784h = C0618p.m2795d().m4560a(this.c.f1779c, this, c0973a, this.c.f1780d, null, this.g, this, bfVar);
            return;
        }
        go.f3361a.post(new Runnable(this) {
            final /* synthetic */ C0505c f1329c;

            public void run() {
                if (c0973a.f3259b.f1882s && this.f1329c.c.f1800x != null) {
                    String str = null;
                    if (c0973a.f3259b.f1865b != null) {
                        str = C0618p.m2796e().m4845a(c0973a.f3259b.f1865b);
                    }
                    bi bgVar = new bg(this.f1329c, str, c0973a.f3259b.f1866c);
                    this.f1329c.c.f1770C = 1;
                    try {
                        this.f1329c.c.f1800x.mo597a(bgVar);
                        return;
                    } catch (Throwable e) {
                        C0691b.m3102d("Could not call the onCustomRenderedAdLoadedListener.", e);
                    }
                }
                final C0555e c0555e = new C0555e();
                hg a = this.f1329c.mo442a(c0973a, c0555e);
                c0555e.m2474a(new C0554b(c0973a, a));
                a.setOnTouchListener(new OnTouchListener(this) {
                    final /* synthetic */ C05032 f1324b;

                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        c0555e.m2473a();
                        return false;
                    }
                });
                a.setOnClickListener(new OnClickListener(this) {
                    final /* synthetic */ C05032 f1326b;

                    public void onClick(View view) {
                        c0555e.m2473a();
                    }
                });
                this.f1329c.c.f1770C = 0;
                this.f1329c.c.f1784h = C0618p.m2795d().m4560a(this.f1329c.c.f1779c, this.f1329c, c0973a, this.f1329c.c.f1780d, a, this.f1329c.g, this.f1329c, bfVar);
            }
        });
    }

    protected boolean mo367a(gd gdVar, gd gdVar2) {
        if (this.c.m2901e() && this.c.f1782f != null) {
            this.c.f1782f.m2892a().m4936a(gdVar2.f3287v);
        }
        return super.mo367a(gdVar, gdVar2);
    }

    public void mo381b(View view) {
        this.c.f1769B = view;
        mo354b(new gd(this.c.f1787k, null, null, null, null, null, null));
    }

    public void mo382r() {
        m2244a(this.c.f1786j, false);
    }

    public void mo383y() {
        mo327e();
    }

    public void mo384z() {
        m2230o();
    }
}
