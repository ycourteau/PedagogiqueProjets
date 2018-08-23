package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C1305x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class C0727c {
    private final Map<String, String> f2128a;
    private final List<Command> f2129b;
    private final long f2130c;
    private final long f2131d;
    private final int f2132e;
    private final boolean f2133f;
    private final String f2134g;

    public C0727c(C0716o c0716o, Map<String, String> map, long j, boolean z) {
        this(c0716o, map, j, z, 0, 0, null);
    }

    public C0727c(C0716o c0716o, Map<String, String> map, long j, boolean z, long j2, int i) {
        this(c0716o, map, j, z, j2, i, null);
    }

    public C0727c(C0716o c0716o, Map<String, String> map, long j, boolean z, long j2, int i, List<Command> list) {
        String a;
        C1305x.m6617a((Object) c0716o);
        C1305x.m6617a((Object) map);
        this.f2131d = j;
        this.f2133f = z;
        this.f2130c = j2;
        this.f2132e = i;
        this.f2129b = list != null ? list : Collections.EMPTY_LIST;
        this.f2134g = C0727c.m3363a((List) list);
        Map hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            if (C0727c.m3364a(entry.getKey())) {
                a = C0727c.m3361a(c0716o, entry.getKey());
                if (a != null) {
                    hashMap.put(a, C0727c.m3365b(c0716o, entry.getValue()));
                }
            }
        }
        for (Entry entry2 : map.entrySet()) {
            if (!C0727c.m3364a(entry2.getKey())) {
                a = C0727c.m3361a(c0716o, entry2.getKey());
                if (a != null) {
                    hashMap.put(a, C0727c.m3365b(c0716o, entry2.getValue()));
                }
            }
        }
        if (!TextUtils.isEmpty(this.f2134g)) {
            C0741l.m3451a(hashMap, "_v", this.f2134g);
            if (this.f2134g.equals("ma4.0.0") || this.f2134g.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.f2128a = Collections.unmodifiableMap(hashMap);
    }

    public static C0727c m3360a(C0716o c0716o, C0727c c0727c, Map<String, String> map) {
        return new C0727c(c0716o, map, c0727c.m3369d(), c0727c.m3371f(), c0727c.m3368c(), c0727c.m3366a(), c0727c.m3370e());
    }

    private static String m3361a(C0716o c0716o, Object obj) {
        if (obj == null) {
            return null;
        }
        Object obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            c0716o.m3204c("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        return TextUtils.isEmpty(obj2) ? null : obj2;
    }

    private String m3362a(String str, String str2) {
        C1305x.m6619a(str);
        C1305x.m6626b(!str.startsWith("&"), "Short param name required");
        String str3 = (String) this.f2128a.get(str);
        return str3 != null ? str3 : str2;
    }

    private static String m3363a(List<Command> list) {
        CharSequence b;
        if (list != null) {
            for (Command command : list) {
                if ("appendVersion".equals(command.m3256a())) {
                    b = command.m3257b();
                    break;
                }
            }
        }
        b = null;
        return TextUtils.isEmpty(b) ? null : b;
    }

    private static boolean m3364a(Object obj) {
        return obj == null ? false : obj.toString().startsWith("&");
    }

    private static String m3365b(C0716o c0716o, Object obj) {
        String obj2 = obj == null ? "" : obj.toString();
        int length = obj2.length();
        if (length <= 8192) {
            return obj2;
        }
        obj2 = obj2.substring(0, 8192);
        c0716o.m3204c("Hit param value is too long and will be trimmed", Integer.valueOf(length), obj2);
        return obj2;
    }

    public int m3366a() {
        return this.f2132e;
    }

    public Map<String, String> m3367b() {
        return this.f2128a;
    }

    public long m3368c() {
        return this.f2130c;
    }

    public long m3369d() {
        return this.f2131d;
    }

    public List<Command> m3370e() {
        return this.f2129b;
    }

    public boolean m3371f() {
        return this.f2133f;
    }

    public long m3372g() {
        return C0741l.m3448a(m3362a("_s", "0"));
    }

    public String m3373h() {
        return m3362a("_m", "");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ht=").append(this.f2131d);
        if (this.f2130c != 0) {
            stringBuffer.append(", dbId=").append(this.f2130c);
        }
        if (((long) this.f2132e) != 0) {
            stringBuffer.append(", appUID=").append(this.f2132e);
        }
        List<String> arrayList = new ArrayList(this.f2128a.keySet());
        Collections.sort(arrayList);
        for (String str : arrayList) {
            stringBuffer.append(", ");
            stringBuffer.append(str);
            stringBuffer.append("=");
            stringBuffer.append((String) this.f2128a.get(str));
        }
        return stringBuffer.toString();
    }
}
