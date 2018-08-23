package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.cv.C0886d;
import java.util.Map;
import java.util.concurrent.Future;

@fn
public final class fr {
    hg f3106a;
    C0886d f3107b;
    public final cg f3108c = new C09581(this);
    public final cg f3109d = new C09592(this);
    private final Object f3110e = new Object();
    private String f3111f;
    private String f3112g;
    private gz<ft> f3113h = new gz();

    class C09581 implements cg {
        final /* synthetic */ fr f3104a;

        C09581(fr frVar) {
            this.f3104a = frVar;
        }

        public void mo524a(hg hgVar, Map<String, String> map) {
            synchronized (this.f3104a.f3110e) {
                if (this.f3104a.f3113h.isDone()) {
                } else if (this.f3104a.f3111f.equals(map.get("request_id"))) {
                    ft ftVar = new ft(1, map);
                    C0691b.m3103e("Invalid " + ftVar.m4691e() + " request error: " + ftVar.m4688b());
                    this.f3104a.f3113h.m4958b(ftVar);
                }
            }
        }
    }

    class C09592 implements cg {
        final /* synthetic */ fr f3105a;

        C09592(fr frVar) {
            this.f3105a = frVar;
        }

        public void mo524a(hg hgVar, Map<String, String> map) {
            synchronized (this.f3105a.f3110e) {
                if (this.f3105a.f3113h.isDone()) {
                    return;
                }
                ft ftVar = new ft(-2, map);
                if (this.f3105a.f3111f.equals(ftVar.m4693g())) {
                    String d = ftVar.m4690d();
                    if (d == null) {
                        C0691b.m3103e("URL missing in loadAdUrl GMSG.");
                        return;
                    }
                    if (d.contains("%40mediation_adapters%40")) {
                        String replaceAll = d.replaceAll("%40mediation_adapters%40", gj.m4806a(hgVar.getContext(), (String) map.get("check_adapters"), this.f3105a.f3112g));
                        ftVar.m4687a(replaceAll);
                        C0691b.m3101d("Ad request URL modified to " + replaceAll);
                    }
                    this.f3105a.f3113h.m4958b(ftVar);
                    return;
                }
                C0691b.m3103e(ftVar.m4693g() + " ==== " + this.f3105a.f3111f);
            }
        }
    }

    public fr(String str, String str2) {
        this.f3112g = str2;
        this.f3111f = str;
    }

    public C0886d m4657a() {
        return this.f3107b;
    }

    public void m4658a(C0886d c0886d) {
        this.f3107b = c0886d;
    }

    public void m4659a(hg hgVar) {
        this.f3106a = hgVar;
    }

    public Future<ft> m4660b() {
        return this.f3113h;
    }

    public void m4661c() {
        if (this.f3106a != null) {
            this.f3106a.destroy();
            this.f3106a = null;
        }
    }
}
