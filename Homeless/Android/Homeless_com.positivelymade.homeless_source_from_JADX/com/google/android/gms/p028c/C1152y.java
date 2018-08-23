package com.google.android.gms.p028c;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@fn
public class C1152y implements ab {
    private final Object f4045a = new Object();
    private final WeakHashMap<gd, C1162z> f4046b = new WeakHashMap();
    private final ArrayList<C1162z> f4047c = new ArrayList();
    private final Context f4048d;
    private final VersionInfoParcel f4049e;
    private final cv f4050f;

    public C1152y(Context context, VersionInfoParcel versionInfoParcel, cv cvVar) {
        this.f4048d = context.getApplicationContext();
        this.f4049e = versionInfoParcel;
        this.f4050f = cvVar;
    }

    public C1162z m5912a(AdSizeParcel adSizeParcel, gd gdVar) {
        return m5913a(adSizeParcel, gdVar, gdVar.f3267b.getWebView());
    }

    public C1162z m5913a(AdSizeParcel adSizeParcel, gd gdVar, View view) {
        C1162z c1162z;
        synchronized (this.f4045a) {
            if (m5915a(gdVar)) {
                c1162z = (C1162z) this.f4046b.get(gdVar);
            } else {
                c1162z = new C1162z(adSizeParcel, gdVar, this.f4049e, view, this.f4050f);
                c1162z.m5937a((ab) this);
                this.f4046b.put(gdVar, c1162z);
                this.f4047c.add(c1162z);
            }
        }
        return c1162z;
    }

    public void mo855a(C1162z c1162z) {
        synchronized (this.f4045a) {
            if (!c1162z.m5949f()) {
                this.f4047c.remove(c1162z);
                Iterator it = this.f4046b.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Entry) it.next()).getValue() == c1162z) {
                        it.remove();
                    }
                }
            }
        }
    }

    public boolean m5915a(gd gdVar) {
        boolean z;
        synchronized (this.f4045a) {
            C1162z c1162z = (C1162z) this.f4046b.get(gdVar);
            z = c1162z != null && c1162z.m5949f();
        }
        return z;
    }

    public void m5916b(gd gdVar) {
        synchronized (this.f4045a) {
            C1162z c1162z = (C1162z) this.f4046b.get(gdVar);
            if (c1162z != null) {
                c1162z.m5947d();
            }
        }
    }

    public void m5917c(gd gdVar) {
        synchronized (this.f4045a) {
            C1162z c1162z = (C1162z) this.f4046b.get(gdVar);
            if (c1162z != null) {
                c1162z.m5955l();
            }
        }
    }

    public void m5918d(gd gdVar) {
        synchronized (this.f4045a) {
            C1162z c1162z = (C1162z) this.f4046b.get(gdVar);
            if (c1162z != null) {
                c1162z.m5956m();
            }
        }
    }

    public void m5919e(gd gdVar) {
        synchronized (this.f4045a) {
            C1162z c1162z = (C1162z) this.f4046b.get(gdVar);
            if (c1162z != null) {
                c1162z.m5957n();
            }
        }
    }
}
