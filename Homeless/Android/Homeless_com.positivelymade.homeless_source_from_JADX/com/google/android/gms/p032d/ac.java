package com.google.android.gms.p032d;

import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C0934f;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ac extends C1546o {
    private static final String f4642a = C0914e.JOINER.toString();
    private static final String f4643b = C0934f.ARG0.toString();
    private static final String f4644c = C0934f.ITEM_SEPARATOR.toString();
    private static final String f4645d = C0934f.KEY_VALUE_SEPARATOR.toString();
    private static final String f4646e = C0934f.ESCAPE.toString();

    private enum C1548a {
        NONE,
        URL,
        BACKSLASH
    }

    public ac() {
        super(f4642a, f4643b);
    }

    private String m7009a(String str, C1548a c1548a, Set<Character> set) {
        switch (c1548a) {
            case URL:
                try {
                    return cn.m7365a(str);
                } catch (Throwable e) {
                    aj.m7037a("Joiner: unsupported encoding", e);
                    return str;
                }
            case BACKSLASH:
                String replace = str.replace("\\", "\\\\");
                String str2 = replace;
                for (Character ch : set) {
                    CharSequence ch2 = ch.toString();
                    str2 = str2.replace(ch2, "\\" + ch2);
                }
                return str2;
            default:
                return str;
        }
    }

    private void m7010a(StringBuilder stringBuilder, String str, C1548a c1548a, Set<Character> set) {
        stringBuilder.append(m7009a(str, c1548a, set));
    }

    private void m7011a(Set<Character> set, String str) {
        for (int i = 0; i < str.length(); i++) {
            set.add(Character.valueOf(str.charAt(i)));
        }
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        C1009a c1009a = (C1009a) map.get(f4643b);
        if (c1009a == null) {
            return cj.m7335f();
        }
        C1548a c1548a;
        Set set;
        C1009a c1009a2 = (C1009a) map.get(f4644c);
        String a = c1009a2 != null ? cj.m7319a(c1009a2) : "";
        c1009a2 = (C1009a) map.get(f4645d);
        String a2 = c1009a2 != null ? cj.m7319a(c1009a2) : "=";
        C1548a c1548a2 = C1548a.NONE;
        c1009a2 = (C1009a) map.get(f4646e);
        if (c1009a2 != null) {
            String a3 = cj.m7319a(c1009a2);
            if ("url".equals(a3)) {
                c1548a = C1548a.URL;
                set = null;
            } else if ("backslash".equals(a3)) {
                c1548a = C1548a.BACKSLASH;
                set = new HashSet();
                m7011a(set, a);
                m7011a(set, a2);
                set.remove(Character.valueOf('\\'));
            } else {
                aj.m7036a("Joiner: unsupported escape type: " + a3);
                return cj.m7335f();
            }
        }
        set = null;
        c1548a = c1548a2;
        StringBuilder stringBuilder = new StringBuilder();
        switch (c1009a.f3436a) {
            case 2:
                Object obj = 1;
                C1009a[] c1009aArr = c1009a.f3438c;
                int length = c1009aArr.length;
                int i = 0;
                while (i < length) {
                    C1009a c1009a3 = c1009aArr[i];
                    if (obj == null) {
                        stringBuilder.append(a);
                    }
                    m7010a(stringBuilder, cj.m7319a(c1009a3), c1548a, set);
                    i++;
                    obj = null;
                }
                break;
            case 3:
                for (int i2 = 0; i2 < c1009a.f3439d.length; i2++) {
                    if (i2 > 0) {
                        stringBuilder.append(a);
                    }
                    String a4 = cj.m7319a(c1009a.f3439d[i2]);
                    String a5 = cj.m7319a(c1009a.f3440e[i2]);
                    m7010a(stringBuilder, a4, c1548a, set);
                    stringBuilder.append(a2);
                    m7010a(stringBuilder, a5, c1548a, set);
                }
                break;
            default:
                m7010a(stringBuilder, cj.m7319a(c1009a), c1548a, set);
                break;
        }
        return cj.m7332e(stringBuilder.toString());
    }

    public boolean mo973a() {
        return true;
    }
}
