package com.google.android.gms.p032d;

import android.os.Build;
import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class C1613g extends C1546o {
    private static final String f4975a = C0914e.DEVICE_NAME.toString();

    public C1613g() {
        super(f4975a, new String[0]);
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        String str = Build.MANUFACTURER;
        Object obj = Build.MODEL;
        if (!(obj.startsWith(str) || str.equals("unknown"))) {
            obj = str + " " + obj;
        }
        return cj.m7332e(obj);
    }

    public boolean mo973a() {
        return true;
    }
}
