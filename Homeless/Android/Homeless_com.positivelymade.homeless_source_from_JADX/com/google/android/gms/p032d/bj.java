package com.google.android.gms.p032d;

import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C0934f;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class bj extends cc {
    private static final String f4711a = C0914e.REGEX.toString();
    private static final String f4712b = C0934f.IGNORE_CASE.toString();

    public bj() {
        super(f4711a);
    }

    protected boolean mo1014a(String str, String str2, Map<String, C1009a> map) {
        try {
            return Pattern.compile(str2, cj.m7330d((C1009a) map.get(f4712b)).booleanValue() ? 66 : 64).matcher(str).find();
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}
