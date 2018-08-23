package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;

public class C1229b {
    public static final int f4245a = C1241e.f4280a;
    private static final C1229b f4246b = new C1229b();

    C1229b() {
    }

    public static C1229b m6224a() {
        return f4246b;
    }

    public int m6225a(Context context) {
        int a = C1241e.m6271a(context);
        return C1241e.m6286b(context, a) ? 18 : a;
    }

    public Intent m6226a(int i) {
        return C1241e.m6274a(i);
    }

    public boolean m6227a(Context context, int i) {
        return C1241e.m6286b(context, i);
    }

    public void m6228b(Context context) {
        C1241e.m6288c(context);
    }
}
