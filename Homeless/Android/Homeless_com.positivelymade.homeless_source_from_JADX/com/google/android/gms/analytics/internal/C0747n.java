package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.C0700a;
import com.google.android.gms.analytics.C0703b;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.jk;

public class C0747n extends C0717p {
    private final C0766x f2183a;

    public C0747n(C0750r c0750r, C0751s c0751s) {
        super(c0750r);
        C1305x.m6617a((Object) c0751s);
        this.f2183a = c0751s.m3520j(c0750r);
    }

    public long m3475a(C0752t c0752t) {
        m3228D();
        C1305x.m6617a((Object) c0752t);
        m3213m();
        long a = this.f2183a.m3607a(c0752t, true);
        if (a == 0) {
            this.f2183a.m3612a(c0752t);
        }
        return a;
    }

    protected void mo540a() {
        this.f2183a.m3229E();
    }

    public void m3477a(final ai aiVar) {
        m3228D();
        m3218r().m5378a(new Runnable(this) {
            final /* synthetic */ C0747n f2182b;

            public void run() {
                this.f2182b.f2183a.m3609a(aiVar);
            }
        });
    }

    public void m3478a(final C0727c c0727c) {
        C1305x.m6617a((Object) c0727c);
        m3228D();
        m3199b("Hit delivery requested", c0727c);
        m3218r().m5378a(new Runnable(this) {
            final /* synthetic */ C0747n f2180b;

            public void run() {
                this.f2180b.f2183a.m3611a(c0727c);
            }
        });
    }

    public void m3479a(final String str, final Runnable runnable) {
        C1305x.m6620a(str, (Object) "campaign param can't be empty");
        m3218r().m5378a(new Runnable(this) {
            final /* synthetic */ C0747n f2178c;

            public void run() {
                this.f2178c.f2183a.m3613a(str);
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    public void m3480a(final boolean z) {
        m3195a("Network connectivity status changed", Boolean.valueOf(z));
        m3218r().m5378a(new Runnable(this) {
            final /* synthetic */ C0747n f2175b;

            public void run() {
                this.f2175b.f2183a.m3614a(z);
            }
        });
    }

    public void m3481b() {
        this.f2183a.m3616b();
    }

    public void m3482c() {
        m3228D();
        Context o = m3215o();
        if (C0700a.m3140a(o) && C0703b.m3145a(o)) {
            Intent intent = new Intent(o, C0703b.class);
            intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            o.startService(intent);
            return;
        }
        m3477a(null);
    }

    public void m3483d() {
        m3228D();
        jk.m5374d();
        this.f2183a.m3620f();
    }

    public void m3484e() {
        m3198b("Radio powered up");
        m3482c();
    }

    void m3485f() {
        m3213m();
        this.f2183a.m3619e();
    }

    void m3486g() {
        m3213m();
        this.f2183a.m3618d();
    }
}
