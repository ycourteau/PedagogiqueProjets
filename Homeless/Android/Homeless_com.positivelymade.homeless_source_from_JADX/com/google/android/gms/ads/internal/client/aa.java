package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.p017d.C0434b;
import com.google.android.gms.ads.p027f.C0487a;
import com.google.android.gms.p028c.fn;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@fn
public final class aa {
    public static final String f1388a = C0526n.m2400a().m3082a("emulator");
    private final Date f1389b;
    private final String f1390c;
    private final int f1391d;
    private final Set<String> f1392e;
    private final Location f1393f;
    private final boolean f1394g;
    private final Bundle f1395h;
    private final Map<Class<? extends Object>, Object> f1396i;
    private final String f1397j;
    private final String f1398k;
    private final C0487a f1399l;
    private final int f1400m;
    private final Set<String> f1401n;
    private final Bundle f1402o;
    private final Set<String> f1403p;

    public static final class C0506a {
        private final HashSet<String> f1374a = new HashSet();
        private final Bundle f1375b = new Bundle();
        private final HashMap<Class<? extends Object>, Object> f1376c = new HashMap();
        private final HashSet<String> f1377d = new HashSet();
        private final Bundle f1378e = new Bundle();
        private final HashSet<String> f1379f = new HashSet();
        private Date f1380g;
        private String f1381h;
        private int f1382i = -1;
        private Location f1383j;
        private boolean f1384k = false;
        private String f1385l;
        private String f1386m;
        private int f1387n = -1;

        public void m2297a(int i) {
            this.f1382i = i;
        }

        public void m2298a(Location location) {
            this.f1383j = location;
        }

        public void m2299a(Class<? extends C0434b> cls, Bundle bundle) {
            this.f1375b.putBundle(cls.getName(), bundle);
        }

        public void m2300a(String str) {
            this.f1374a.add(str);
        }

        public void m2301a(Date date) {
            this.f1380g = date;
        }

        public void m2302a(boolean z) {
            this.f1387n = z ? 1 : 0;
        }

        public void m2303b(String str) {
            this.f1377d.add(str);
        }

        public void m2304c(String str) {
            this.f1377d.remove(str);
        }
    }

    public aa(C0506a c0506a) {
        this(c0506a, null);
    }

    public aa(C0506a c0506a, C0487a c0487a) {
        this.f1389b = c0506a.f1380g;
        this.f1390c = c0506a.f1381h;
        this.f1391d = c0506a.f1382i;
        this.f1392e = Collections.unmodifiableSet(c0506a.f1374a);
        this.f1393f = c0506a.f1383j;
        this.f1394g = c0506a.f1384k;
        this.f1395h = c0506a.f1375b;
        this.f1396i = Collections.unmodifiableMap(c0506a.f1376c);
        this.f1397j = c0506a.f1385l;
        this.f1398k = c0506a.f1386m;
        this.f1399l = c0487a;
        this.f1400m = c0506a.f1387n;
        this.f1401n = Collections.unmodifiableSet(c0506a.f1377d);
        this.f1402o = c0506a.f1378e;
        this.f1403p = Collections.unmodifiableSet(c0506a.f1379f);
    }

    public Bundle m2305a(Class<? extends C0434b> cls) {
        return this.f1395h.getBundle(cls.getName());
    }

    public Date m2306a() {
        return this.f1389b;
    }

    public boolean m2307a(Context context) {
        return this.f1401n.contains(C0526n.m2400a().m3081a(context));
    }

    public String m2308b() {
        return this.f1390c;
    }

    public int m2309c() {
        return this.f1391d;
    }

    public Set<String> m2310d() {
        return this.f1392e;
    }

    public Location m2311e() {
        return this.f1393f;
    }

    public boolean m2312f() {
        return this.f1394g;
    }

    public String m2313g() {
        return this.f1397j;
    }

    public String m2314h() {
        return this.f1398k;
    }

    public C0487a m2315i() {
        return this.f1399l;
    }

    public Map<Class<? extends Object>, Object> m2316j() {
        return this.f1396i;
    }

    public Bundle m2317k() {
        return this.f1395h;
    }

    public int m2318l() {
        return this.f1400m;
    }

    public Bundle m2319m() {
        return this.f1402o;
    }

    public Set<String> m2320n() {
        return this.f1403p;
    }
}
