package com.google.android.gms.ads.internal;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.overlay.C0590a;
import com.google.android.gms.ads.internal.overlay.C0609e;
import com.google.android.gms.ads.internal.purchase.C0633i;
import com.google.android.gms.ads.internal.request.C0640a;
import com.google.android.gms.p028c.aw;
import com.google.android.gms.p028c.ax;
import com.google.android.gms.p028c.ay;
import com.google.android.gms.p028c.bd;
import com.google.android.gms.p028c.cq;
import com.google.android.gms.p028c.dg;
import com.google.android.gms.p028c.fd;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.fv;
import com.google.android.gms.p028c.gf;
import com.google.android.gms.p028c.go;
import com.google.android.gms.p028c.gp;
import com.google.android.gms.p028c.gt;
import com.google.android.gms.p028c.hi;
import com.google.android.gms.p028c.ik;
import com.google.android.gms.p028c.il;

@fn
public class C0618p {
    private static final Object f1694a = new Object();
    private static C0618p f1695b;
    private final C0640a f1696c = new C0640a();
    private final C0590a f1697d = new C0590a();
    private final C0609e f1698e = new C0609e();
    private final fd f1699f = new fd();
    private final go f1700g = new go();
    private final hi f1701h = new hi();
    private final gp f1702i = gp.m4888a(VERSION.SDK_INT);
    private final gf f1703j = new gf(this.f1700g);
    private final ik f1704k = new il();
    private final bd f1705l = new bd();
    private final fv f1706m = new fv();
    private final ax f1707n = new ax();
    private final aw f1708o = new aw();
    private final ay f1709p = new ay();
    private final C0633i f1710q = new C0633i();
    private final gt f1711r = new gt();
    private final dg f1712s = new dg();
    private final cq f1713t = new cq();

    static {
        C0618p.m2792a(new C0618p());
    }

    protected C0618p() {
    }

    public static C0640a m2791a() {
        return C0618p.m2810s().f1696c;
    }

    protected static void m2792a(C0618p c0618p) {
        synchronized (f1694a) {
            f1695b = c0618p;
        }
    }

    public static C0590a m2793b() {
        return C0618p.m2810s().f1697d;
    }

    public static C0609e m2794c() {
        return C0618p.m2810s().f1698e;
    }

    public static fd m2795d() {
        return C0618p.m2810s().f1699f;
    }

    public static go m2796e() {
        return C0618p.m2810s().f1700g;
    }

    public static hi m2797f() {
        return C0618p.m2810s().f1701h;
    }

    public static gp m2798g() {
        return C0618p.m2810s().f1702i;
    }

    public static gf m2799h() {
        return C0618p.m2810s().f1703j;
    }

    public static ik m2800i() {
        return C0618p.m2810s().f1704k;
    }

    public static bd m2801j() {
        return C0618p.m2810s().f1705l;
    }

    public static fv m2802k() {
        return C0618p.m2810s().f1706m;
    }

    public static ax m2803l() {
        return C0618p.m2810s().f1707n;
    }

    public static aw m2804m() {
        return C0618p.m2810s().f1708o;
    }

    public static ay m2805n() {
        return C0618p.m2810s().f1709p;
    }

    public static C0633i m2806o() {
        return C0618p.m2810s().f1710q;
    }

    public static gt m2807p() {
        return C0618p.m2810s().f1711r;
    }

    public static dg m2808q() {
        return C0618p.m2810s().f1712s;
    }

    public static cq m2809r() {
        return C0618p.m2810s().f1713t;
    }

    private static C0618p m2810s() {
        C0618p c0618p;
        synchronized (f1694a) {
            c0618p = f1695b;
        }
        return c0618p;
    }
}
