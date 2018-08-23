package com.google.android.gms.p032d;

import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class C1612f extends C1546o {
    private static final String f4973a = C0914e.DEVICE_ID.toString();
    private final Context f4974b;

    public C1612f(Context context) {
        super(f4973a, new String[0]);
        this.f4974b = context;
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        Object a = m7477a(this.f4974b);
        return a == null ? cj.m7335f() : cj.m7332e(a);
    }

    protected String m7477a(Context context) {
        return Secure.getString(context.getContentResolver(), "android_id");
    }

    public boolean mo973a() {
        return true;
    }
}
