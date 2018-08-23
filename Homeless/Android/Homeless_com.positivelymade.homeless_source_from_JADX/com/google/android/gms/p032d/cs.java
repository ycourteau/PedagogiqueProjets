package com.google.android.gms.p032d;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class cs extends C1546o {
    private static final String f4869a = C0914e.APP_VERSION_NAME.toString();
    private final Context f4870b;

    public cs(Context context) {
        super(f4869a, new String[0]);
        this.f4870b = context;
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        try {
            return cj.m7332e(this.f4870b.getPackageManager().getPackageInfo(this.f4870b.getPackageName(), 0).versionName);
        } catch (NameNotFoundException e) {
            aj.m7036a("Package name " + this.f4870b.getPackageName() + " not found. " + e.getMessage());
            return cj.m7335f();
        }
    }

    public boolean mo973a() {
        return true;
    }
}
