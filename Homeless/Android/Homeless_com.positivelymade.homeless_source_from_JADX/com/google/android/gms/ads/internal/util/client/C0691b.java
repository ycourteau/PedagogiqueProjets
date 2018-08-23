package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import com.google.android.gms.p028c.az;
import com.google.android.gms.p028c.fn;

@fn
public final class C0691b {
    public static void m3093a(String str) {
        if (C0691b.m3096a(3)) {
            Log.d("Ads", str);
        }
    }

    public static void m3094a(String str, Throwable th) {
        if (C0691b.m3096a(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static boolean m3095a() {
        return ((Boolean) az.ab.m3878c()).booleanValue();
    }

    public static boolean m3096a(int i) {
        return (i >= 5 || Log.isLoggable("Ads", i)) && (i != 2 || C0691b.m3095a());
    }

    public static void m3097b(String str) {
        if (C0691b.m3096a(6)) {
            Log.e("Ads", str);
        }
    }

    public static void m3098b(String str, Throwable th) {
        if (C0691b.m3096a(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void m3099c(String str) {
        if (C0691b.m3096a(4)) {
            Log.i("Ads", str);
        }
    }

    public static void m3100c(String str, Throwable th) {
        if (C0691b.m3096a(4)) {
            Log.i("Ads", str, th);
        }
    }

    public static void m3101d(String str) {
        if (C0691b.m3096a(2)) {
            Log.v("Ads", str);
        }
    }

    public static void m3102d(String str, Throwable th) {
        if (C0691b.m3096a(5)) {
            Log.w("Ads", str, th);
        }
    }

    public static void m3103e(String str) {
        if (C0691b.m3096a(5)) {
            Log.w("Ads", str);
        }
    }
}
