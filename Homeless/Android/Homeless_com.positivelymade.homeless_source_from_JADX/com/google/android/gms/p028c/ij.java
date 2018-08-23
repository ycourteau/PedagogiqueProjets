package com.google.android.gms.p028c;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Process;
import com.google.android.gms.common.internal.C1253f;

public class ij {
    public static boolean m5263a() {
        return C1253f.f4324a && ia.m5182b() && ia.m5176a() == Process.myUid();
    }

    public static boolean m5264a(Context context, String str) {
        try {
            return (context.getPackageManager().getApplicationInfo(str, 0).flags & 2097152) != 0;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
