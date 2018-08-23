package com.google.android.gms.p032d;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class cq extends C1546o {
    private static final String f4865a = C0914e.APP_NAME.toString();
    private final Context f4866b;

    public cq(Context context) {
        super(f4865a, new String[0]);
        this.f4866b = context;
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        try {
            PackageManager packageManager = this.f4866b.getPackageManager();
            return cj.m7332e(packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f4866b.getPackageName(), 0)).toString());
        } catch (Throwable e) {
            aj.m7037a("App name is not found.", e);
            return cj.m7335f();
        }
    }

    public boolean mo973a() {
        return true;
    }
}
