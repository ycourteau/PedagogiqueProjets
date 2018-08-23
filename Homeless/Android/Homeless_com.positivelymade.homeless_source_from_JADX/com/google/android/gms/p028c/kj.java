package com.google.android.gms.p028c;

import android.content.Context;
import com.google.android.gms.common.api.C0774g;
import com.google.android.gms.common.api.C1105h;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p032d.C1554b;
import com.google.android.gms.p032d.C1601d;
import java.util.HashSet;
import java.util.Set;

public class kj {
    private static kj f3832a;
    private ki f3833b;
    private final Set<C0580a> f3834c = new HashSet();
    private C1601d f3835d = null;
    private boolean f3836e;
    private Context f3837f;

    public interface C0580a {
        void mo449b();
    }

    class C11061 implements C1105h<C1554b> {
        final /* synthetic */ kj f3831a;

        C11061(kj kjVar) {
            this.f3831a = kjVar;
        }

        public /* synthetic */ void mo833a(C0774g c0774g) {
            m5533a((C1554b) c0774g);
        }

        public void m5533a(C1554b c1554b) {
            this.f3831a.f3833b = new kh(this.f3831a.f3837f, c1554b.mo558a().m5971e() ? c1554b.mo1032c() : null, this.f3831a.m5539a()).m5517a();
            this.f3831a.m5538c();
        }
    }

    kj(Context context, C1601d c1601d) {
        this.f3837f = context;
        this.f3835d = c1601d;
    }

    public static kj m5536a(Context context) {
        C1305x.m6617a((Object) context);
        if (f3832a == null) {
            synchronized (kj.class) {
                if (f3832a == null) {
                    f3832a = new kj(context, C1601d.m7410a(context.getApplicationContext()));
                }
            }
        }
        return f3832a;
    }

    private void m5538c() {
        synchronized (this) {
            for (C0580a b : this.f3834c) {
                b.mo449b();
            }
        }
    }

    public ki m5539a() {
        ki kiVar;
        synchronized (this) {
            kiVar = this.f3833b;
        }
        return kiVar;
    }

    public void m5540a(ki kiVar) {
        synchronized (this) {
            if (this.f3836e) {
                throw new IllegalStateException("Settings can't be changed after TagManager has been started");
            }
            this.f3833b = kiVar;
        }
    }

    public void m5541a(C0580a c0580a) {
        synchronized (this) {
            this.f3834c.add(c0580a);
        }
    }

    public void m5542b() {
        synchronized (this) {
            if (this.f3836e) {
                throw new IllegalStateException("Method start() has already been called");
            } else if (this.f3833b == null) {
                throw new IllegalStateException("No settings configured");
            } else {
                this.f3836e = true;
                this.f3835d.m7414a(this.f3833b.m5527a(), -1, "admob").mo565a(new C11061(this));
            }
        }
    }
}
