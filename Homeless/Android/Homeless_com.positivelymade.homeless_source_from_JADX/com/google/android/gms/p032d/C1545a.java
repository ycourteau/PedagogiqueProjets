package com.google.android.gms.p032d;

import android.content.Context;
import com.google.android.gms.p028c.C1010h.C1009a;
import com.google.android.gms.p028c.kr.C1117c;
import com.google.android.gms.p032d.bf.C1559a;
import com.google.android.gms.p032d.dd.C1542a;
import java.util.HashMap;
import java.util.Map;

public class C1545a {
    private final Context f4622a;
    private final String f4623b;
    private final C1585c f4624c;
    private bs f4625d;
    private Map<String, C1540a> f4626e = new HashMap();
    private Map<String, C1541b> f4627f = new HashMap();
    private volatile long f4628g;
    private volatile String f4629h = "";

    public interface C1540a {
        Object m6981a(String str, Map<String, Object> map);
    }

    public interface C1541b {
        void m6982a(String str, Map<String, Object> map);
    }

    private class C1543c implements C1542a {
        final /* synthetic */ C1545a f4620a;

        private C1543c(C1545a c1545a) {
            this.f4620a = c1545a;
        }

        public Object mo971a(String str, Map<String, Object> map) {
            C1540a c = this.f4620a.m6993c(str);
            return c == null ? null : c.m6981a(str, map);
        }
    }

    private class C1544d implements C1542a {
        final /* synthetic */ C1545a f4621a;

        private C1544d(C1545a c1545a) {
            this.f4621a = c1545a;
        }

        public Object mo971a(String str, Map<String, Object> map) {
            C1541b d = this.f4621a.m6995d(str);
            if (d != null) {
                d.m6982a(str, map);
            }
            return cj.m7334e();
        }
    }

    C1545a(Context context, C1585c c1585c, String str, long j, C1117c c1117c) {
        this.f4622a = context;
        this.f4624c = c1585c;
        this.f4623b = str;
        this.f4628g = j;
        m6986a(c1117c);
    }

    private void m6986a(C1117c c1117c) {
        this.f4629h = c1117c.m5600c();
        C1117c c1117c2 = c1117c;
        m6987a(new bs(this.f4622a, c1117c2, this.f4624c, new C1543c(), new C1544d(), m6997f(this.f4629h)));
        if (m6990a("_gtm.loadEventEnabled")) {
            this.f4624c.m7270a("gtm.load", C1585c.m7253a("gtm.id", this.f4623b));
        }
    }

    private synchronized void m6987a(bs bsVar) {
        this.f4625d = bsVar;
    }

    private synchronized bs m6988d() {
        return this.f4625d;
    }

    public long m6989a() {
        return this.f4628g;
    }

    public boolean m6990a(String str) {
        bs d = m6988d();
        if (d == null) {
            aj.m7036a("getBoolean called for closed container.");
            return cj.m7325c().booleanValue();
        }
        try {
            return cj.m7330d((C1009a) d.m7211b(str).m7111a()).booleanValue();
        } catch (Exception e) {
            aj.m7036a("Calling getBoolean() threw an exception: " + e.getMessage() + " Returning default value.");
            return cj.m7325c().booleanValue();
        }
    }

    public String m6991b(String str) {
        bs d = m6988d();
        if (d == null) {
            aj.m7036a("getString called for closed container.");
            return cj.m7334e();
        }
        try {
            return cj.m7319a((C1009a) d.m7211b(str).m7111a());
        } catch (Exception e) {
            aj.m7036a("Calling getString() threw an exception: " + e.getMessage() + " Returning default value.");
            return cj.m7334e();
        }
    }

    public boolean m6992b() {
        return m6989a() == 0;
    }

    C1540a m6993c(String str) {
        C1540a c1540a;
        synchronized (this.f4626e) {
            c1540a = (C1540a) this.f4626e.get(str);
        }
        return c1540a;
    }

    void m6994c() {
        this.f4625d = null;
    }

    C1541b m6995d(String str) {
        C1541b c1541b;
        synchronized (this.f4627f) {
            c1541b = (C1541b) this.f4627f.get(str);
        }
        return c1541b;
    }

    void m6996e(String str) {
        m6988d().m7210a(str);
    }

    C1551m m6997f(String str) {
        if (bf.m7150a().m7151b().equals(C1559a.CONTAINER_DEBUG)) {
        }
        return new ar();
    }
}
