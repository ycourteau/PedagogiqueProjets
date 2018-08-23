package com.google.android.gms.p032d;

import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C0934f;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class bi extends C1546o {
    private static final String f4706a = C0914e.REGEX_GROUP.toString();
    private static final String f4707b = C0934f.ARG0.toString();
    private static final String f4708c = C0934f.ARG1.toString();
    private static final String f4709d = C0934f.IGNORE_CASE.toString();
    private static final String f4710e = C0934f.GROUP.toString();

    public bi() {
        super(f4706a, f4707b, f4708c);
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        C1009a c1009a = (C1009a) map.get(f4707b);
        C1009a c1009a2 = (C1009a) map.get(f4708c);
        if (c1009a == null || c1009a == cj.m7335f() || c1009a2 == null || c1009a2 == cj.m7335f()) {
            return cj.m7335f();
        }
        int intValue;
        int i = 64;
        if (cj.m7330d((C1009a) map.get(f4709d)).booleanValue()) {
            i = 66;
        }
        C1009a c1009a3 = (C1009a) map.get(f4710e);
        if (c1009a3 != null) {
            Long c = cj.m7327c(c1009a3);
            if (c == cj.m7323b()) {
                return cj.m7335f();
            }
            intValue = c.intValue();
            if (intValue < 0) {
                return cj.m7335f();
            }
        }
        intValue = 1;
        try {
            CharSequence a = cj.m7319a(c1009a);
            Object obj = null;
            Matcher matcher = Pattern.compile(cj.m7319a(c1009a2), i).matcher(a);
            if (matcher.find() && matcher.groupCount() >= intValue) {
                obj = matcher.group(intValue);
            }
            return obj == null ? cj.m7335f() : cj.m7332e(obj);
        } catch (PatternSyntaxException e) {
            return cj.m7335f();
        }
    }

    public boolean mo973a() {
        return true;
    }
}
