package com.google.android.gms.p032d;

import android.content.Context;
import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C0934f;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class co extends C1546o {
    private static final String f4859a = C0914e.ADWORDS_CLICK_REFERRER.toString();
    private static final String f4860b = C0934f.COMPONENT.toString();
    private static final String f4861c = C0934f.CONVERSION_ID.toString();
    private final Context f4862d;

    public co(Context context) {
        super(f4859a, f4861c);
        this.f4862d = context;
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        C1009a c1009a = (C1009a) map.get(f4861c);
        if (c1009a == null) {
            return cj.m7335f();
        }
        String a = cj.m7319a(c1009a);
        c1009a = (C1009a) map.get(f4860b);
        Object a2 = ab.m7006a(this.f4862d, a, c1009a != null ? cj.m7319a(c1009a) : null);
        return a2 != null ? cj.m7332e(a2) : cj.m7335f();
    }

    public boolean mo973a() {
        return true;
    }
}
