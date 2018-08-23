package com.google.android.gms.p032d;

import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class C1546o {
    private final Set<String> f4630a;
    private final String f4631b;

    public C1546o(String str, String... strArr) {
        this.f4631b = str;
        this.f4630a = new HashSet(strArr.length);
        for (Object add : strArr) {
            this.f4630a.add(add);
        }
    }

    public abstract C1009a mo972a(Map<String, C1009a> map);

    public abstract boolean mo973a();

    boolean m7000a(Set<String> set) {
        return set.containsAll(this.f4630a);
    }

    public String mo976b() {
        return this.f4631b;
    }

    public Set<String> mo977c() {
        return this.f4630a;
    }
}
