package com.google.android.gms.p028c;

import android.content.Context;
import com.google.android.gms.ads.internal.C0555e;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0428a;
import com.google.android.gms.ads.internal.client.C0526n;
import com.google.android.gms.ads.internal.overlay.C0492n;
import com.google.android.gms.ads.internal.overlay.C0497g;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.p028c.ac.C0806a;
import com.google.android.gms.p028c.hh.C0601a;
import org.json.JSONObject;

@fn
public class ae implements ac {
    private final hg f2383a;

    public ae(Context context, VersionInfoParcel versionInfoParcel, C1141o c1141o) {
        this.f2383a = C0618p.m2797f().m5056a(context, new AdSizeParcel(), false, false, c1141o, versionInfoParcel);
        this.f2383a.setWillNotDraw(true);
    }

    private void m3781a(Runnable runnable) {
        if (C0526n.m2400a().m3088b()) {
            runnable.run();
        } else {
            go.f3361a.post(runnable);
        }
    }

    public void mo577a() {
        this.f2383a.destroy();
    }

    public void mo578a(C0428a c0428a, C0497g c0497g, cd cdVar, C0492n c0492n, boolean z, ci ciVar, ck ckVar, C0555e c0555e, ee eeVar) {
        this.f2383a.mo788i().m5039a(c0428a, c0497g, cdVar, c0492n, z, ciVar, ckVar, new C0555e(false), eeVar);
    }

    public void mo579a(final C0806a c0806a) {
        this.f2383a.mo788i().m5042a(new C0601a(this) {
            final /* synthetic */ ae f2382b;

            public void mo465a(hg hgVar, boolean z) {
                c0806a.mo576a();
            }
        });
    }

    public void mo580a(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str});
        m3781a(new Runnable(this) {
            final /* synthetic */ ae f2376b;

            public void run() {
                this.f2376b.f2383a.loadData(format, "text/html", "UTF-8");
            }
        });
    }

    public void mo581a(String str, cg cgVar) {
        this.f2383a.mo788i().m5044a(str, cgVar);
    }

    public void mo582a(final String str, final String str2) {
        m3781a(new Runnable(this) {
            final /* synthetic */ ae f2374c;

            public void run() {
                this.f2374c.f2383a.mo767a(str, str2);
            }
        });
    }

    public void mo583a(final String str, final JSONObject jSONObject) {
        m3781a(new Runnable(this) {
            final /* synthetic */ ae f2371c;

            public void run() {
                this.f2371c.f2383a.mo774b(str, jSONObject);
            }
        });
    }

    public ag mo584b() {
        return new ah(this);
    }

    public void mo585b(final String str) {
        m3781a(new Runnable(this) {
            final /* synthetic */ ae f2380b;

            public void run() {
                this.f2380b.f2383a.loadUrl(str);
            }
        });
    }

    public void mo586b(String str, cg cgVar) {
        this.f2383a.mo788i().m5049b(str, cgVar);
    }

    public void mo587c(final String str) {
        m3781a(new Runnable(this) {
            final /* synthetic */ ae f2378b;

            public void run() {
                this.f2378b.f2383a.loadData(str, "text/html", "UTF-8");
            }
        });
    }
}
