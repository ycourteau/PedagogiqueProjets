package com.google.android.gms.p032d;

import android.content.Context;
import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class cp extends C1546o {
    private static final String f4863a = C0914e.APP_ID.toString();
    private final Context f4864b;

    public cp(Context context) {
        super(f4863a, new String[0]);
        this.f4864b = context;
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        return cj.m7332e(this.f4864b.getPackageName());
    }

    public boolean mo973a() {
        return true;
    }
}
