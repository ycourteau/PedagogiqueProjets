package com.google.android.gms.p032d;

import android.content.Context;
import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C0934f;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class aa extends C1546o {
    private static final String f4632a = C0914e.INSTALL_REFERRER.toString();
    private static final String f4633b = C0934f.COMPONENT.toString();
    private final Context f4634c;

    public aa(Context context) {
        super(f4632a, new String[0]);
        this.f4634c = context;
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        Object a = ab.m7005a(this.f4634c, ((C1009a) map.get(f4633b)) != null ? cj.m7319a((C1009a) map.get(f4633b)) : null);
        return a != null ? cj.m7332e(a) : cj.m7335f();
    }

    public boolean mo973a() {
        return true;
    }
}
