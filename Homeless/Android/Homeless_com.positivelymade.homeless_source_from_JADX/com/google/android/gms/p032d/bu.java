package com.google.android.gms.p032d;

import android.os.Build.VERSION;
import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class bu extends C1546o {
    private static final String f4758a = C0914e.SDK_VERSION.toString();

    public bu() {
        super(f4758a, new String[0]);
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        return cj.m7332e(Integer.valueOf(VERSION.SDK_INT));
    }

    public boolean mo973a() {
        return true;
    }
}
