package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.internal.C0733g;
import com.google.android.gms.analytics.internal.C0741l;
import com.google.android.gms.analytics.internal.C0750r;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.kg;

public final class C0700a extends BroadcastReceiver {
    static Object f1985a = new Object();
    static kg f1986b;
    static Boolean f1987c;

    public static boolean m3140a(Context context) {
        C1305x.m6617a((Object) context);
        if (f1987c != null) {
            return f1987c.booleanValue();
        }
        boolean a = C0741l.m3456a(context, C0700a.class, false);
        f1987c = Boolean.valueOf(a);
        return a;
    }

    public void onReceive(Context context, Intent intent) {
        C0750r a = C0750r.m3487a(context);
        C0733g f = a.m3494f();
        String action = intent.getAction();
        if (a.m3493e().m3282a()) {
            f.m3195a("Device AnalyticsReceiver got", action);
        } else {
            f.m3195a("Local AnalyticsReceiver got", action);
        }
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean a2 = C0703b.m3145a(context);
            Intent intent2 = new Intent(context, C0703b.class);
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (f1985a) {
                context.startService(intent2);
                if (a2) {
                    try {
                        if (f1986b == null) {
                            f1986b = new kg(context, 1, "Analytics WakeLock");
                            f1986b.m5510a(false);
                        }
                        f1986b.m5508a(1000);
                    } catch (SecurityException e) {
                        f.m3208e("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                    return;
                }
            }
        }
    }
}
