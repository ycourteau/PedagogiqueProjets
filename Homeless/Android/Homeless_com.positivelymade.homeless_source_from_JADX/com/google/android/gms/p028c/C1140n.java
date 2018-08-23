package com.google.android.gms.p028c;

import android.content.Context;
import com.google.android.gms.ads.p023c.C0475a;
import com.google.android.gms.ads.p023c.C0475a.C0473a;
import com.google.android.gms.common.C1230c;
import com.google.android.gms.common.C1232d;
import com.google.android.gms.p028c.C1137m.C1136a;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class C1140n extends C1137m {
    private static C0475a f4024e = null;
    private static CountDownLatch f4025f = new CountDownLatch(1);
    private static boolean f4026g;
    private boolean f4027h;

    class C1138a {
        final /* synthetic */ C1140n f4020a;
        private String f4021b;
        private boolean f4022c;

        public C1138a(C1140n c1140n, String str, boolean z) {
            this.f4020a = c1140n;
            this.f4021b = str;
            this.f4022c = z;
        }

        public String m5841a() {
            return this.f4021b;
        }

        public boolean m5842b() {
            return this.f4022c;
        }
    }

    private static final class C1139b implements Runnable {
        private Context f4023a;

        public C1139b(Context context) {
            this.f4023a = context.getApplicationContext();
            if (this.f4023a == null) {
                this.f4023a = context;
            }
        }

        public void run() {
            try {
                C0475a c0475a = new C0475a(this.f4023a);
                c0475a.m2105a();
                synchronized (C1140n.class) {
                    if (C1140n.f4024e == null) {
                        C1140n.f4024e = c0475a;
                    } else {
                        c0475a.m2108c();
                    }
                }
            } catch (C1230c e) {
                C1140n.f4026g = true;
            } catch (IOException e2) {
            } catch (C1232d e3) {
            }
            C1140n.f4025f.countDown();
        }
    }

    protected C1140n(Context context, C1032q c1032q, C1143r c1143r, boolean z) {
        super(context, c1032q, c1143r);
        this.f4027h = z;
    }

    public static C1140n m5844a(String str, Context context, boolean z) {
        C1032q c1033i = new C1033i();
        C1137m.m5825a(str, context, c1033i);
        if (z) {
            synchronized (C1140n.class) {
                if (f4024e == null) {
                    new Thread(new C1139b(context)).start();
                }
            }
        }
        return new C1140n(context, c1033i, new C1146t(239), z);
    }

    protected void mo845b(Context context) {
        super.mo845b(context);
        try {
            if (f4026g || !this.f4027h) {
                m5668a(24, C1137m.m5831d(context));
                return;
            }
            C1138a e = m5849e();
            String a = e.m5841a();
            if (a != null) {
                m5667a(28, e.m5842b() ? 1 : 0);
                m5667a(26, 5);
                m5668a(24, a);
            }
        } catch (IOException e2) {
        } catch (C1136a e3) {
        }
    }

    C1138a m5849e() {
        synchronized (C1140n.class) {
            try {
                C1138a c1138a;
                if (!f4025f.await(2, TimeUnit.SECONDS)) {
                    c1138a = new C1138a(this, null, false);
                    return c1138a;
                } else if (f4024e == null) {
                    c1138a = new C1138a(this, null, false);
                    return c1138a;
                } else {
                    C0473a b = f4024e.m2107b();
                    return new C1138a(this, m5664a(b.m2096a()), b.m2097b());
                }
            } catch (InterruptedException e) {
                return new C1138a(this, null, false);
            }
        }
    }
}
