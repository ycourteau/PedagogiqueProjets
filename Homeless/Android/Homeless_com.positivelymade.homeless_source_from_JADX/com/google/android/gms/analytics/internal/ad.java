package com.google.android.gms.analytics.internal;

import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C1253f;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.it;
import java.util.HashSet;
import java.util.Set;

public class ad {
    private final C0750r f2060a;
    private volatile Boolean f2061b;
    private String f2062c;
    private Set<Integer> f2063d;

    protected ad(C0750r c0750r) {
        C1305x.m6617a((Object) c0750r);
        this.f2060a = c0750r;
    }

    public String m3275A() {
        return "google_analytics_v4.db";
    }

    public String m3276B() {
        return "google_analytics2_v4.db";
    }

    public long m3277C() {
        return 86400000;
    }

    public int m3278D() {
        return ((Integer) ak.f2082E.m3343a()).intValue();
    }

    public int m3279E() {
        return ((Integer) ak.f2083F.m3343a()).intValue();
    }

    public long m3280F() {
        return ((Long) ak.f2084G.m3343a()).longValue();
    }

    public long m3281G() {
        return ((Long) ak.f2093P.m3343a()).longValue();
    }

    public boolean m3282a() {
        return C1253f.f4324a;
    }

    public boolean m3283b() {
        if (this.f2061b == null) {
            synchronized (this) {
                if (this.f2061b == null) {
                    ApplicationInfo applicationInfo = this.f2060a.m3490b().getApplicationInfo();
                    String a = it.m5298a(this.f2060a.m3490b(), Process.myPid());
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = str != null && str.equals(a);
                        this.f2061b = Boolean.valueOf(z);
                    }
                    if ((this.f2061b == null || !this.f2061b.booleanValue()) && "com.google.android.gms.analytics".equals(a)) {
                        this.f2061b = Boolean.TRUE;
                    }
                    if (this.f2061b == null) {
                        this.f2061b = Boolean.TRUE;
                        this.f2060a.m3494f().m3210f("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f2061b.booleanValue();
    }

    public boolean m3284c() {
        return ((Boolean) ak.f2096b.m3343a()).booleanValue();
    }

    public int m3285d() {
        return ((Integer) ak.f2115u.m3343a()).intValue();
    }

    public int m3286e() {
        return ((Integer) ak.f2119y.m3343a()).intValue();
    }

    public int m3287f() {
        return ((Integer) ak.f2120z.m3343a()).intValue();
    }

    public int m3288g() {
        return ((Integer) ak.f2078A.m3343a()).intValue();
    }

    public long m3289h() {
        return ((Long) ak.f2104j.m3343a()).longValue();
    }

    public long m3290i() {
        return ((Long) ak.f2103i.m3343a()).longValue();
    }

    public long m3291j() {
        return ((Long) ak.f2107m.m3343a()).longValue();
    }

    public long m3292k() {
        return ((Long) ak.f2108n.m3343a()).longValue();
    }

    public int m3293l() {
        return ((Integer) ak.f2109o.m3343a()).intValue();
    }

    public int m3294m() {
        return ((Integer) ak.f2110p.m3343a()).intValue();
    }

    public long m3295n() {
        return (long) ((Integer) ak.f2080C.m3343a()).intValue();
    }

    public String m3296o() {
        return (String) ak.f2112r.m3343a();
    }

    public String m3297p() {
        return (String) ak.f2111q.m3343a();
    }

    public String m3298q() {
        return (String) ak.f2113s.m3343a();
    }

    public String m3299r() {
        return (String) ak.f2114t.m3343a();
    }

    public C0767y m3300s() {
        return C0767y.m3625a((String) ak.f2116v.m3343a());
    }

    public aa m3301t() {
        return aa.m3267a((String) ak.f2117w.m3343a());
    }

    public Set<Integer> m3302u() {
        String str = (String) ak.f2079B.m3343a();
        if (this.f2063d == null || this.f2062c == null || !this.f2062c.equals(str)) {
            String[] split = TextUtils.split(str, ",");
            Set hashSet = new HashSet();
            for (String parseInt : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(parseInt)));
                } catch (NumberFormatException e) {
                }
            }
            this.f2062c = str;
            this.f2063d = hashSet;
        }
        return this.f2063d;
    }

    public long m3303v() {
        return ((Long) ak.f2088K.m3343a()).longValue();
    }

    public long m3304w() {
        return ((Long) ak.f2089L.m3343a()).longValue();
    }

    public long m3305x() {
        return ((Long) ak.f2092O.m3343a()).longValue();
    }

    public int m3306y() {
        return ((Integer) ak.f2100f.m3343a()).intValue();
    }

    public int m3307z() {
        return ((Integer) ak.f2102h.m3343a()).intValue();
    }
}
