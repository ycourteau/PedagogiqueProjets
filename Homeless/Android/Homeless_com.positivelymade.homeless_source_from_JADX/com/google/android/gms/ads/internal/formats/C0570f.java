package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import com.google.android.gms.ads.internal.C0586n;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.C1141o;
import com.google.android.gms.p028c.dl;
import com.google.android.gms.p028c.dm;

public class C0570f extends C0569g {
    private dl f1524a;
    private dm f1525b;
    private final C0586n f1526c;
    private C0569g f1527d;
    private boolean f1528e;
    private Object f1529f;

    private C0570f(Context context, C0586n c0586n, C1141o c1141o) {
        super(context, c0586n, null, c1141o, null, null, null);
        this.f1528e = false;
        this.f1529f = new Object();
        this.f1526c = c0586n;
    }

    public C0570f(Context context, C0586n c0586n, C1141o c1141o, dl dlVar) {
        this(context, c0586n, c1141o);
        this.f1524a = dlVar;
    }

    public C0570f(Context context, C0586n c0586n, C1141o c1141o, dm dmVar) {
        this(context, c0586n, c1141o);
        this.f1525b = dmVar;
    }

    public void mo437a() {
        C1305x.m6624b("recordImpression must be called on the main UI thread.");
        synchronized (this.f1529f) {
            m2555a(true);
            if (this.f1527d != null) {
                this.f1527d.mo437a();
            } else {
                try {
                    if (this.f1524a != null && !this.f1524a.mo672k()) {
                        this.f1524a.mo670i();
                    } else if (!(this.f1525b == null || this.f1525b.mo684i())) {
                        this.f1525b.mo682g();
                    }
                } catch (Throwable e) {
                    C0691b.m3102d("Failed to call recordImpression", e);
                }
            }
            this.f1526c.mo382r();
        }
    }
}
