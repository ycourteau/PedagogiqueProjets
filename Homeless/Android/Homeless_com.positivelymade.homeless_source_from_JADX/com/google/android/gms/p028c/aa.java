package com.google.android.gms.p028c;

import java.util.Collections;
import java.util.Map;

public interface aa {

    public static class C0805a {
        public byte[] f2353a;
        public String f2354b;
        public long f2355c;
        public long f2356d;
        public long f2357e;
        public long f2358f;
        public Map<String, String> f2359g = Collections.emptyMap();

        public boolean m3757a() {
            return this.f2357e < System.currentTimeMillis();
        }

        public boolean m3758b() {
            return this.f2358f < System.currentTimeMillis();
        }
    }

    C0805a mo841a(String str);

    void mo842a();

    void mo843a(String str, C0805a c0805a);
}
