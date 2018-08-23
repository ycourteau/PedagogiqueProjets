package com.google.android.gms.p028c;

import com.google.android.gms.p028c.he.C0669c;
import com.google.android.gms.p028c.he.C0671a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@fn
public class hf<T> implements he<T> {
    protected int f2672a = 0;
    protected final BlockingQueue<C1013a> f2673b = new LinkedBlockingQueue();
    protected T f2674c;
    private final Object f2675d = new Object();

    class C1013a {
        public final C0669c<T> f3457a;
        public final C0671a f3458b;
        final /* synthetic */ hf f3459c;

        public C1013a(hf hfVar, C0669c<T> c0669c, C0671a c0671a) {
            this.f3459c = hfVar;
            this.f3457a = c0669c;
            this.f3458b = c0671a;
        }
    }

    public void m4147a(C0669c<T> c0669c, C0671a c0671a) {
        synchronized (this.f2675d) {
            if (this.f2672a == 1) {
                c0669c.mo521a(this.f2674c);
            } else if (this.f2672a == -1) {
                c0671a.mo522a();
            } else if (this.f2672a == 0) {
                this.f2673b.add(new C1013a(this, c0669c, c0671a));
            }
        }
    }

    public void m4148a(T t) {
        synchronized (this.f2675d) {
            if (this.f2672a != 0) {
                throw new UnsupportedOperationException();
            }
            this.f2674c = t;
            this.f2672a = 1;
            for (C1013a c1013a : this.f2673b) {
                c1013a.f3457a.mo521a(t);
            }
            this.f2673b.clear();
        }
    }

    public void m4149e() {
        synchronized (this.f2675d) {
            if (this.f2672a != 0) {
                throw new UnsupportedOperationException();
            }
            this.f2672a = -1;
            for (C1013a c1013a : this.f2673b) {
                c1013a.f3458b.mo522a();
            }
            this.f2673b.clear();
        }
    }

    public int m4150f() {
        return this.f2672a;
    }
}
