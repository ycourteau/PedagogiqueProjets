package com.google.android.gms.p028c;

import android.content.Context;
import java.util.regex.Pattern;

public final class ii {
    private static Pattern f3599a = null;

    public static int m5259a(int i) {
        return i / 1000;
    }

    public static boolean m5260a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static int m5261b(int i) {
        return (i % 1000) / 100;
    }

    public static boolean m5262c(int i) {
        return ii.m5261b(i) == 3;
    }
}
