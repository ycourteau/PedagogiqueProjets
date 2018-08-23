package com.google.android.gms.p032d;

import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class an extends C1546o {
    private static final String f4669a = C0914e.MOBILE_ADWORDS_UNIQUE_ID.toString();
    private final Context f4670b;

    public an(Context context) {
        super(f4669a, new String[0]);
        this.f4670b = context;
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        Object a = m7053a(this.f4670b);
        return a == null ? cj.m7335f() : cj.m7332e(a);
    }

    protected String m7053a(Context context) {
        return Secure.getString(context.getContentResolver(), "android_id");
    }

    public boolean mo973a() {
        return true;
    }
}
