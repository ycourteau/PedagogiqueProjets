package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.reward.p030a.C0684b;
import com.google.android.gms.ads.internal.util.client.C0690a;
import com.google.android.gms.p028c.by;
import com.google.android.gms.p028c.fn;

@fn
public class C0526n {
    private static final Object f1441a = new Object();
    private static C0526n f1442b;
    private final C0690a f1443c = new C0690a();
    private final C0518h f1444d = new C0518h();
    private final C0529o f1445e = new C0529o();
    private final C0508b f1446f = new C0508b();
    private final by f1447g = new by();
    private final C0684b f1448h = new C0684b();

    static {
        C0526n.m2401a(new C0526n());
    }

    protected C0526n() {
    }

    public static C0690a m2400a() {
        return C0526n.m2404d().f1443c;
    }

    protected static void m2401a(C0526n c0526n) {
        synchronized (f1441a) {
            f1442b = c0526n;
        }
    }

    public static C0518h m2402b() {
        return C0526n.m2404d().f1444d;
    }

    public static C0529o m2403c() {
        return C0526n.m2404d().f1445e;
    }

    private static C0526n m2404d() {
        C0526n c0526n;
        synchronized (f1441a) {
            c0526n = f1442b;
        }
        return c0526n;
    }
}
