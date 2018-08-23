package com.google.android.gms.p028c;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0618p;
import java.math.BigInteger;
import java.util.Locale;

@fn
public final class gj {
    private static final Object f3339a = new Object();
    private static String f3340b;

    public static String m4805a() {
        String str;
        synchronized (f3339a) {
            str = f3340b;
        }
        return str;
    }

    public static String m4806a(Context context, String str, String str2) {
        String str3;
        synchronized (f3339a) {
            if (f3340b == null && !TextUtils.isEmpty(str)) {
                gj.m4807b(context, str, str2);
            }
            str3 = f3340b;
        }
        return str3;
    }

    private static void m4807b(Context context, String str, String str2) {
        try {
            ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
            Class cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
            BigInteger bigInteger = new BigInteger(new byte[1]);
            String[] split = str.split(",");
            BigInteger bigInteger2 = bigInteger;
            for (int i = 0; i < split.length; i++) {
                if (C0618p.m2796e().m4865a(classLoader, cls, split[i])) {
                    bigInteger2 = bigInteger2.setBit(i);
                }
            }
            f3340b = String.format(Locale.US, "%X", new Object[]{bigInteger2});
        } catch (Throwable th) {
            f3340b = "err";
        }
    }
}
