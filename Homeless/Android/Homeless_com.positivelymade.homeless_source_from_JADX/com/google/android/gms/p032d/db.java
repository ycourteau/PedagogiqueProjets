package com.google.android.gms.p032d;

import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class db extends cc {
    private static final String f4923a = C0914e.CONTAINS.toString();

    public db() {
        super(f4923a);
    }

    protected boolean mo1014a(String str, String str2, Map<String, C1009a> map) {
        return str.contains(str2);
    }
}
