package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.C0564c;
import com.google.android.gms.ads.internal.formats.C0566d;
import com.google.android.gms.ads.internal.formats.C0568e;
import com.google.android.gms.ads.internal.formats.C0569g.C0563a;
import com.google.android.gms.ads.internal.formats.C0570f;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.C1042if;
import com.google.android.gms.p028c.bf;
import com.google.android.gms.p028c.bj;
import com.google.android.gms.p028c.bu;
import com.google.android.gms.p028c.bv;
import com.google.android.gms.p028c.bw;
import com.google.android.gms.p028c.bx;
import com.google.android.gms.p028c.di;
import com.google.android.gms.p028c.dl;
import com.google.android.gms.p028c.dm;
import com.google.android.gms.p028c.eo;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.gd;
import com.google.android.gms.p028c.gd.C0973a;
import com.google.android.gms.p028c.go;
import java.util.List;

@fn
public class C0586n extends C0499b {
    public C0586n(Context context, AdSizeParcel adSizeParcel, String str, di diVar, VersionInfoParcel versionInfoParcel) {
        super(context, adSizeParcel, str, diVar, versionInfoParcel, null);
    }

    private static C0564c m2620a(dl dlVar) {
        return new C0564c(dlVar.mo660a(), dlVar.mo662b(), dlVar.mo664c(), dlVar.mo665d() != null ? dlVar.mo665d() : null, dlVar.mo666e(), dlVar.mo667f(), dlVar.mo668g(), dlVar.mo669h(), null, dlVar.mo673l());
    }

    private static C0566d m2621a(dm dmVar) {
        return new C0566d(dmVar.mo674a(), dmVar.mo676b(), dmVar.mo678c(), dmVar.mo679d() != null ? dmVar.mo679d() : null, dmVar.mo680e(), dmVar.mo681f(), null, dmVar.mo685j());
    }

    private void m2622a(final C0564c c0564c) {
        go.f3361a.post(new Runnable(this) {
            final /* synthetic */ C0586n f1571b;

            public void run() {
                try {
                    this.f1571b.c.f1795s.mo616a(c0564c);
                } catch (Throwable e) {
                    C0691b.m3102d("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", e);
                }
            }
        });
    }

    private void m2623a(final C0566d c0566d) {
        go.f3361a.post(new Runnable(this) {
            final /* synthetic */ C0586n f1573b;

            public void run() {
                try {
                    this.f1573b.c.f1796t.mo617a(c0566d);
                } catch (Throwable e) {
                    C0691b.m3102d("Could not call OnContentAdLoadedListener.onContentAdLoaded().", e);
                }
            }
        });
    }

    private void m2624a(final gd gdVar, final String str) {
        go.f3361a.post(new Runnable(this) {
            final /* synthetic */ C0586n f1576c;

            public void run() {
                try {
                    ((bx) this.f1576c.c.f1798v.get(str)).mo619a((C0568e) gdVar.f3288w);
                } catch (Throwable e) {
                    C0691b.m3102d("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", e);
                }
            }
        });
    }

    public void m2625a(NativeAdOptionsParcel nativeAdOptionsParcel) {
        C1305x.m6624b("setNativeAdOptions must be called on the main UI thread.");
        this.c.f1799w = nativeAdOptionsParcel;
    }

    public void mo345a(bj bjVar) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public void m2627a(bu buVar) {
        C1305x.m6624b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        this.c.f1795s = buVar;
    }

    public void m2628a(bv bvVar) {
        C1305x.m6624b("setOnContentAdLoadedListener must be called on the main UI thread.");
        this.c.f1796t = bvVar;
    }

    public void mo346a(eo eoVar) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public void mo380a(final C0973a c0973a, bf bfVar) {
        if (c0973a.f3261d != null) {
            this.c.f1785i = c0973a.f3261d;
        }
        if (c0973a.f3262e != -2) {
            go.f3361a.post(new Runnable(this) {
                final /* synthetic */ C0586n f1569b;

                public void run() {
                    this.f1569b.mo354b(new gd(c0973a, null, null, null, null, null, null));
                }
            });
            return;
        }
        this.c.f1770C = 0;
        this.c.f1784h = C0618p.m2795d().m4560a(this.c.f1779c, this, c0973a, this.c.f1780d, null, this.g, this, bfVar);
        C0691b.m3093a("AdRenderer: " + this.c.f1784h.getClass().getName());
    }

    public void m2631a(C1042if<String, bx> c1042if) {
        C1305x.m6624b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        this.c.f1798v = c1042if;
    }

    public void m2632a(List<String> list) {
        C1305x.m6624b("setNativeTemplates must be called on the main UI thread.");
        this.c.f1801y = list;
    }

    protected boolean mo443a(AdRequestParcel adRequestParcel, gd gdVar, boolean z) {
        return this.b.m2651d();
    }

    protected boolean mo367a(gd gdVar, gd gdVar2) {
        m2632a(null);
        if (this.c.m2901e()) {
            if (gdVar2.f3276k) {
                try {
                    dl h = gdVar2.f3278m.mo658h();
                    dm i = gdVar2.f3278m.mo659i();
                    if (h != null) {
                        C0564c a = C0586n.m2620a(h);
                        a.mo412a(new C0570f(this.c.f1779c, this, this.c.f1780d, h));
                        m2622a(a);
                    } else if (i != null) {
                        C0566d a2 = C0586n.m2621a(i);
                        a2.mo412a(new C0570f(this.c.f1779c, this, this.c.f1780d, i));
                        m2623a(a2);
                    } else {
                        C0691b.m3103e("No matching mapper for retrieved native ad template.");
                        m2210a(0);
                        return false;
                    }
                } catch (Throwable e) {
                    C0691b.m3102d("Failed to get native ad mapper", e);
                }
            } else {
                C0563a c0563a = gdVar2.f3288w;
                if ((c0563a instanceof C0566d) && this.c.f1796t != null) {
                    m2623a((C0566d) gdVar2.f3288w);
                } else if ((c0563a instanceof C0564c) && this.c.f1795s != null) {
                    m2622a((C0564c) gdVar2.f3288w);
                } else if (!(c0563a instanceof C0568e) || this.c.f1798v == null || this.c.f1798v.get(((C0568e) c0563a).mo422k()) == null) {
                    C0691b.m3103e("No matching listener for retrieved native ad template.");
                    m2210a(0);
                    return false;
                } else {
                    m2624a(gdVar2, ((C0568e) c0563a).mo422k());
                }
            }
            return super.mo367a(gdVar, gdVar2);
        }
        throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    }

    public bw m2635b(String str) {
        C1305x.m6624b("getOnCustomClickListener must be called on the main UI thread.");
        return (bw) this.c.f1797u.get(str);
    }

    public void m2636b(C1042if<String, bw> c1042if) {
        C1305x.m6624b("setOnCustomClickListener must be called on the main UI thread.");
        this.c.f1797u = c1042if;
    }

    public void mo356d() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public void mo357f() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    public void mo371g() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public void mo382r() {
        m2244a(this.c.f1786j, false);
    }

    public C1042if<String, bx> m2641y() {
        C1305x.m6624b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.c.f1798v;
    }
}
