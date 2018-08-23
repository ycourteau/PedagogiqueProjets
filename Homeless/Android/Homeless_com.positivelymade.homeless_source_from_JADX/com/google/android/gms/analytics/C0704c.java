package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.C0733g;
import com.google.android.gms.analytics.internal.C0741l;
import com.google.android.gms.analytics.internal.C0750r;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.kg;

public class C0704c extends BroadcastReceiver {
    static Object f1995a = new Object();
    static kg f1996b;
    static Boolean f1997c;

    public static boolean m3146a(Context context) {
        C1305x.m6617a((Object) context);
        if (f1997c != null) {
            return f1997c.booleanValue();
        }
        boolean a = C0741l.m3456a(context, C0704c.class, true);
        f1997c = Boolean.valueOf(a);
        return a;
    }

    protected Class<? extends C0708d> m3147a() {
        return C0708d.class;
    }

    protected void m3148a(String str) {
    }

    public void onReceive(Context context, Intent intent) {
        C0750r a = C0750r.m3487a(context);
        C0733g f = a.m3494f();
        String stringExtra = intent.getStringExtra("referrer");
        String action = intent.getAction();
        f.m3195a("CampaignTrackingReceiver received", action);
        if (!"com.android.vending.INSTALL_REFERRER".equals(action) || TextUtils.isEmpty(stringExtra)) {
            f.m3208e("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        boolean a2 = C0708d.m3150a(context);
        if (!a2) {
            f.m3208e("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        m3148a(stringExtra);
        if (a.m3493e().m3282a()) {
            f.m3210f("Received unexpected installation campaign on package side");
            return;
        }
        Object a3 = m3147a();
        C1305x.m6617a(a3);
        Intent intent2 = new Intent(context, a3);
        intent2.putExtra("referrer", stringExtra);
        synchronized (f1995a) {
            context.startService(intent2);
            if (a2) {
                try {
                    if (f1996b == null) {
                        f1996b = new kg(context, 1, "Analytics campaign WakeLock");
                        f1996b.m5510a(false);
                    }
                    f1996b.m5508a(1000);
                } catch (SecurityException e) {
                    f.m3208e("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                }
                return;
            }
        }
    }
}
