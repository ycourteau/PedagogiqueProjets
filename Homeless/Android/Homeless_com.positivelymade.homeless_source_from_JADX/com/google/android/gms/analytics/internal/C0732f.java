package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.C0714g;

@Deprecated
public class C0732f {
    private static volatile C0714g f2142a;

    static {
        C0732f.m3383a(new ae());
    }

    public static C0714g m3382a() {
        return f2142a;
    }

    public static void m3383a(C0714g c0714g) {
        f2142a = c0714g;
    }

    public static void m3384a(String str) {
        C0733g b = C0733g.m3387b();
        if (b != null) {
            b.m3208e(str);
        } else if (C0732f.m3386a(2)) {
            Log.w((String) ak.f2097c.m3343a(), str);
        }
        C0714g c0714g = f2142a;
        if (c0714g != null) {
            c0714g.mo543a(str);
        }
    }

    public static void m3385a(String str, Object obj) {
        C0733g b = C0733g.m3387b();
        if (b != null) {
            b.m3209e(str, obj);
        } else if (C0732f.m3386a(3)) {
            Log.e((String) ak.f2097c.m3343a(), obj != null ? str + ":" + obj : str);
        }
        C0714g c0714g = f2142a;
        if (c0714g != null) {
            c0714g.mo544b(str);
        }
    }

    public static boolean m3386a(int i) {
        return C0732f.m3382a() != null && C0732f.m3382a().mo541a() <= i;
    }
}
