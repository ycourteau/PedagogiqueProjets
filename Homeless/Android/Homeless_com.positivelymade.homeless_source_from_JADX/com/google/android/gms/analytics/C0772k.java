package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.C0732f;

public final class C0772k {
    public static String m3650a(int i) {
        return C0772k.m3651a("cd", i);
    }

    private static String m3651a(String str, int i) {
        if (i >= 1) {
            return str + i;
        }
        C0732f.m3385a("index out of range for prefix", str);
        return "";
    }

    public static String m3652b(int i) {
        return C0772k.m3651a("cm", i);
    }

    public static String m3653c(int i) {
        return C0772k.m3651a("&pr", i);
    }

    public static String m3654d(int i) {
        return C0772k.m3651a("pr", i);
    }

    public static String m3655e(int i) {
        return C0772k.m3651a("&promo", i);
    }

    public static String m3656f(int i) {
        return C0772k.m3651a("promo", i);
    }

    public static String m3657g(int i) {
        return C0772k.m3651a("pi", i);
    }

    public static String m3658h(int i) {
        return C0772k.m3651a("&il", i);
    }

    public static String m3659i(int i) {
        return C0772k.m3651a("il", i);
    }

    public static String m3660j(int i) {
        return C0772k.m3651a("cd", i);
    }

    public static String m3661k(int i) {
        return C0772k.m3651a("cm", i);
    }
}
