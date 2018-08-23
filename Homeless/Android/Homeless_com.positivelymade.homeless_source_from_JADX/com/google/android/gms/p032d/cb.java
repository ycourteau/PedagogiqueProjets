package com.google.android.gms.p032d;

import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class cb extends cc {
    private static final String f4802a = C0914e.STARTS_WITH.toString();

    public cb() {
        super(f4802a);
    }

    protected boolean mo1014a(String str, String str2, Map<String, C1009a> map) {
        return str.startsWith(str2);
    }
}
