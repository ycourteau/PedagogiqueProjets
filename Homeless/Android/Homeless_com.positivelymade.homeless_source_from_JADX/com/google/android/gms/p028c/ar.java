package com.google.android.gms.p028c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import com.google.android.gms.common.internal.C1305x;

@fn
public class ar {
    private final Context f2438a;

    public ar(Context context) {
        C1305x.m6618a((Object) context, (Object) "Context can not be null");
        this.f2438a = context;
    }

    public static boolean m3858e() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public boolean m3859a() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return m3860a(intent);
    }

    public boolean m3860a(Intent intent) {
        C1305x.m6618a((Object) intent, (Object) "Intent can not be null");
        return !this.f2438a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public boolean m3861b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return m3860a(intent);
    }

    public boolean m3862c() {
        return ar.m3858e() && this.f2438a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public boolean m3863d() {
        return true;
    }

    public boolean m3864f() {
        return VERSION.SDK_INT >= 14 && m3860a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
