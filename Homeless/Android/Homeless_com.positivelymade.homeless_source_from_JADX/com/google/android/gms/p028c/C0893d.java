package com.google.android.gms.p028c;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import java.io.File;

public class C0893d {
    public static ib m4182a(Context context) {
        return C0893d.m4183a(context, null);
    }

    public static ib m4183a(Context context, lu luVar) {
        File file = new File(context.getCacheDir(), "volley");
        String str = "volley/0";
        try {
            String packageName = context.getPackageName();
            str = packageName + "/" + context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (NameNotFoundException e) {
        }
        if (luVar == null) {
            luVar = VERSION.SDK_INT >= 9 ? new lv() : new ls(AndroidHttpClient.newInstance(str));
        }
        ib ibVar = new ib(new lr(file), new lp(luVar));
        ibVar.m5204a();
        return ibVar;
    }
}
