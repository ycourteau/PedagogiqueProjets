package com.google.android.gms.ads.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.go;
import java.lang.ref.WeakReference;

@fn
public class C0589o {
    private final C0588a f1580a;
    private final Runnable f1581b;
    private AdRequestParcel f1582c;
    private boolean f1583d;
    private boolean f1584e;
    private long f1585f;

    public static class C0588a {
        private final Handler f1579a;

        public C0588a(Handler handler) {
            this.f1579a = handler;
        }

        public void m2642a(Runnable runnable) {
            this.f1579a.removeCallbacks(runnable);
        }

        public boolean m2643a(Runnable runnable, long j) {
            return this.f1579a.postDelayed(runnable, j);
        }
    }

    public C0589o(C0495a c0495a) {
        this(c0495a, new C0588a(go.f3361a));
    }

    C0589o(C0495a c0495a, C0588a c0588a) {
        this.f1583d = false;
        this.f1584e = false;
        this.f1585f = 0;
        this.f1580a = c0588a;
        final WeakReference weakReference = new WeakReference(c0495a);
        this.f1581b = new Runnable(this) {
            final /* synthetic */ C0589o f1578b;

            public void run() {
                this.f1578b.f1583d = false;
                C0495a c0495a = (C0495a) weakReference.get();
                if (c0495a != null) {
                    c0495a.m2218c(this.f1578b.f1582c);
                }
            }
        };
    }

    public void m2646a() {
        this.f1583d = false;
        this.f1580a.m2642a(this.f1581b);
    }

    public void m2647a(AdRequestParcel adRequestParcel) {
        m2648a(adRequestParcel, 60000);
    }

    public void m2648a(AdRequestParcel adRequestParcel, long j) {
        if (this.f1583d) {
            C0691b.m3103e("An ad refresh is already scheduled.");
            return;
        }
        this.f1582c = adRequestParcel;
        this.f1583d = true;
        this.f1585f = j;
        if (!this.f1584e) {
            C0691b.m3099c("Scheduling ad refresh " + j + " milliseconds from now.");
            this.f1580a.m2643a(this.f1581b, j);
        }
    }

    public void m2649b() {
        this.f1584e = true;
        if (this.f1583d) {
            this.f1580a.m2642a(this.f1581b);
        }
    }

    public void m2650c() {
        this.f1584e = false;
        if (this.f1583d) {
            this.f1583d = false;
            m2648a(this.f1582c, this.f1585f);
        }
    }

    public boolean m2651d() {
        return this.f1583d;
    }
}
