package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public abstract class DowngradeableSafeParcel implements SafeParcelable {
    private static final Object f4294a = new Object();
    private static ClassLoader f4295b = null;
    private static Integer f4296c = null;
    private boolean f4297d = false;

    private static boolean m6303a(Class<?> cls) {
        boolean z = false;
        try {
            z = SafeParcelable.NULL.equals(cls.getField("NULL").get(null));
        } catch (NoSuchFieldException e) {
        } catch (IllegalAccessException e2) {
        }
        return z;
    }

    protected static boolean m6304a(String str) {
        ClassLoader d_ = d_();
        if (d_ == null) {
            return true;
        }
        try {
            return m6303a(d_.loadClass(str));
        } catch (Exception e) {
            return false;
        }
    }

    protected static ClassLoader d_() {
        ClassLoader classLoader;
        synchronized (f4294a) {
            classLoader = f4295b;
        }
        return classLoader;
    }

    protected static Integer e_() {
        Integer num;
        synchronized (f4294a) {
            num = f4296c;
        }
        return num;
    }

    protected boolean f_() {
        return this.f4297d;
    }
}
