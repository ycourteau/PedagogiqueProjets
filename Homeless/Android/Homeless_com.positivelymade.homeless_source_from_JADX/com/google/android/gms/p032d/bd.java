package com.google.android.gms.p032d;

import android.content.Context;
import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class bd extends C1546o {
    private static final String f4692a = C0914e.ADVERTISING_TRACKING_ENABLED.toString();
    private final C1611e f4693b;

    public bd(Context context) {
        this(C1611e.m7468a(context));
    }

    bd(C1611e c1611e) {
        super(f4692a, new String[0]);
        this.f4693b = c1611e;
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        return cj.m7332e(Boolean.valueOf(!this.f4693b.m7473b()));
    }

    public boolean mo973a() {
        return false;
    }
}
