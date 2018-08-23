package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public class C0742m extends C0717p {
    protected String f2166a;
    protected String f2167b;
    protected boolean f2168c;
    protected int f2169d;
    protected boolean f2170e;
    protected int f2171f;
    protected boolean f2172g;
    protected boolean f2173h;

    public C0742m(C0750r c0750r) {
        super(c0750r);
    }

    private static int m3462a(String str) {
        String toLowerCase = str.toLowerCase();
        return "verbose".equals(toLowerCase) ? 0 : "info".equals(toLowerCase) ? 1 : "warning".equals(toLowerCase) ? 2 : "error".equals(toLowerCase) ? 3 : -1;
    }

    protected void mo540a() {
        m3473j();
    }

    void m3464a(C0726b c0726b) {
        int a;
        m3198b("Loading global XML config values");
        if (c0726b.m3350a()) {
            String b = c0726b.m3351b();
            this.f2167b = b;
            m3199b("XML config - app name", b);
        }
        if (c0726b.m3352c()) {
            b = c0726b.m3353d();
            this.f2166a = b;
            m3199b("XML config - app version", b);
        }
        if (c0726b.m3354e()) {
            a = C0742m.m3462a(c0726b.m3355f());
            if (a >= 0) {
                this.f2169d = a;
                m3195a("XML config - log level", Integer.valueOf(a));
            }
        }
        if (c0726b.m3356g()) {
            a = c0726b.m3357h();
            this.f2171f = a;
            this.f2170e = true;
            m3199b("XML config - dispatch period (sec)", Integer.valueOf(a));
        }
        if (c0726b.m3358i()) {
            boolean j = c0726b.m3359j();
            this.f2173h = j;
            this.f2172g = true;
            m3199b("XML config - dry run", Boolean.valueOf(j));
        }
    }

    public String m3465b() {
        m3228D();
        return this.f2166a;
    }

    public String m3466c() {
        m3228D();
        return this.f2167b;
    }

    public boolean m3467d() {
        m3228D();
        return this.f2168c;
    }

    public int m3468e() {
        m3228D();
        return this.f2169d;
    }

    public boolean m3469f() {
        m3228D();
        return this.f2170e;
    }

    public int m3470g() {
        m3228D();
        return this.f2171f;
    }

    public boolean m3471h() {
        m3228D();
        return this.f2172g;
    }

    public boolean m3472i() {
        m3228D();
        return this.f2173h;
    }

    protected void m3473j() {
        ApplicationInfo applicationInfo;
        Context o = m3215o();
        try {
            applicationInfo = o.getPackageManager().getApplicationInfo(o.getPackageName(), 129);
        } catch (NameNotFoundException e) {
            m3206d("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            m3208e("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            int i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource");
            if (i > 0) {
                C0726b c0726b = (C0726b) new al(m3211k()).m3274a(i);
                if (c0726b != null) {
                    m3464a(c0726b);
                }
            }
        }
    }
}
