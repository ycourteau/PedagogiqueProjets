package com.google.android.gms.p028c;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.C0618p;
import java.util.LinkedHashMap;
import java.util.Map;

public class ba {
    private boolean f2502a;
    private String f2503b;
    private Map<String, String> f2504c;
    private Context f2505d = null;
    private String f2506e = null;

    public ba(Context context, String str) {
        this.f2505d = context;
        this.f2506e = str;
        this.f2502a = ((Boolean) az.f2455G.m3878c()).booleanValue();
        this.f2503b = (String) az.f2456H.m3878c();
        this.f2504c = new LinkedHashMap();
        this.f2504c.put("s", "gmob_sdk");
        this.f2504c.put("v", "3");
        this.f2504c.put("os", VERSION.RELEASE);
        this.f2504c.put("sdk", VERSION.SDK);
        this.f2504c.put("device", C0618p.m2796e().m4881d());
        this.f2504c.put("ua", C0618p.m2796e().m4841a(context, str));
        this.f2504c.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        if (C0618p.m2796e().m4864a(context.getPackageManager(), context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
            fu a = C0618p.m2802k().m4703a(this.f2505d);
            this.f2504c.put("network_coarse", Integer.toString(a.f3180m));
            this.f2504c.put("network_fine", Integer.toString(a.f3181n));
        }
    }

    boolean m3897a() {
        return this.f2502a;
    }

    String m3898b() {
        return this.f2503b;
    }

    Context m3899c() {
        return this.f2505d;
    }

    String m3900d() {
        return this.f2506e;
    }

    Map<String, String> m3901e() {
        return this.f2504c;
    }
}
