package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.drive.metadata.C1048a;
import com.google.android.gms.p028c.iy;
import com.google.android.gms.p028c.ja;
import com.google.android.gms.p028c.jc;
import java.util.HashMap;
import java.util.Map;

public final class C1682c {
    private static final Map<String, C1048a<?>> f5286a = new HashMap();

    static {
        C1682c.m7884a(iy.f3632a);
        C1682c.m7884a(iy.f3623G);
        C1682c.m7884a(iy.f3655x);
        C1682c.m7884a(iy.f3621E);
        C1682c.m7884a(iy.f3624H);
        C1682c.m7884a(iy.f3645n);
        C1682c.m7884a(iy.f3644m);
        C1682c.m7884a(iy.f3646o);
        C1682c.m7884a(iy.f3647p);
        C1682c.m7884a(iy.f3648q);
        C1682c.m7884a(iy.f3642k);
        C1682c.m7884a(iy.f3650s);
        C1682c.m7884a(iy.f3651t);
        C1682c.m7884a(iy.f3652u);
        C1682c.m7884a(iy.f3619C);
        C1682c.m7884a(iy.f3633b);
        C1682c.m7884a(iy.f3657z);
        C1682c.m7884a(iy.f3635d);
        C1682c.m7884a(iy.f3643l);
        C1682c.m7884a(iy.f3636e);
        C1682c.m7884a(iy.f3637f);
        C1682c.m7884a(iy.f3638g);
        C1682c.m7884a(iy.f3639h);
        C1682c.m7884a(iy.f3654w);
        C1682c.m7884a(iy.f3649r);
        C1682c.m7884a(iy.f3656y);
        C1682c.m7884a(iy.f3617A);
        C1682c.m7884a(iy.f3618B);
        C1682c.m7884a(iy.f3620D);
        C1682c.m7884a(iy.f3625I);
        C1682c.m7884a(iy.f3626J);
        C1682c.m7884a(iy.f3641j);
        C1682c.m7884a(iy.f3640i);
        C1682c.m7884a(iy.f3622F);
        C1682c.m7884a(iy.f3653v);
        C1682c.m7884a(iy.f3634c);
        C1682c.m7884a(iy.f3627K);
        C1682c.m7884a(iy.f3628L);
        C1682c.m7884a(iy.f3629M);
        C1682c.m7884a(iy.f3630N);
        C1682c.m7884a(iy.f3631O);
        C1682c.m7884a(ja.f3722a);
        C1682c.m7884a(ja.f3724c);
        C1682c.m7884a(ja.f3725d);
        C1682c.m7884a(ja.f3726e);
        C1682c.m7884a(ja.f3723b);
        C1682c.m7884a(jc.f3728a);
        C1682c.m7884a(jc.f3729b);
    }

    public static C1048a<?> m7883a(String str) {
        return (C1048a) f5286a.get(str);
    }

    private static void m7884a(C1048a<?> c1048a) {
        if (f5286a.containsKey(c1048a.mo828a())) {
            throw new IllegalArgumentException("Duplicate field name registered: " + c1048a.mo828a());
        }
        f5286a.put(c1048a.mo828a(), c1048a);
    }
}
