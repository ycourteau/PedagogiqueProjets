package com.google.android.gms.common.internal;

public final class C1251d {
    public static void m6332a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    public static void m6333a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void m6334a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
