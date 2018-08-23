package com.google.android.gms.p032d;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class cr extends C1546o {
    private static final String f4867a = C0914e.APP_VERSION.toString();
    private final Context f4868b;

    public cr(Context context) {
        super(f4867a, new String[0]);
        this.f4868b = context;
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        try {
            return cj.m7332e(Integer.valueOf(this.f4868b.getPackageManager().getPackageInfo(this.f4868b.getPackageName(), 0).versionCode));
        } catch (NameNotFoundException e) {
            aj.m7036a("Package name " + this.f4868b.getPackageName() + " not found. " + e.getMessage());
            return cj.m7335f();
        }
    }

    public boolean mo973a() {
        return true;
    }
}
