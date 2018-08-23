package com.google.android.gms.p032d;

import android.content.Context;
import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class ad extends C1546o {
    private static final String f4647a = C0914e.ADVERTISER_ID.toString();
    private final C1611e f4648b;

    public ad(Context context) {
        this(C1611e.m7468a(context));
    }

    ad(C1611e c1611e) {
        super(f4647a, new String[0]);
        this.f4648b = c1611e;
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        Object a = this.f4648b.m7472a();
        return a == null ? cj.m7335f() : cj.m7332e(a);
    }

    public boolean mo973a() {
        return false;
    }
}
