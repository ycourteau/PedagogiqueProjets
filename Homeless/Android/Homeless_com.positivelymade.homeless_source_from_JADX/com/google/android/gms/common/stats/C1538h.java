package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.stats.C1533c.C1532b;
import com.google.android.gms.p028c.ij;
import com.google.android.gms.p028c.is;
import java.util.List;

public class C1538h {
    private static String f4615a = "WakeLockTracker";
    private static C1538h f4616b = new C1538h();
    private static final ComponentName f4617c = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    private static IntentFilter f4618d = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static Integer f4619e;

    private int m6975a(Context context) {
        int i = 1;
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f4618d);
        int i2 = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & 7) != 0 ? 1 : 0;
        int i3 = (is.m5293i() ? ((PowerManager) context.getSystemService("power")).isInteractive() : ((PowerManager) context.getSystemService("power")).isScreenOn() ? 1 : 0) << 1;
        if (i2 == 0) {
            i = 0;
        }
        return i3 | i;
    }

    public static C1538h m6976a() {
        return f4616b;
    }

    private float m6977b(Context context) {
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return Float.NaN;
        }
        return ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
    }

    private static int m6978b() {
        try {
            return ij.m5263a() ? ((Integer) C1532b.f4602a.m5185c()).intValue() : C1534d.f4605a;
        } catch (SecurityException e) {
            return C1534d.f4605a;
        }
    }

    private static boolean m6979c(Context context) {
        if (f4619e == null) {
            f4619e = Integer.valueOf(C1538h.m6978b());
        }
        return f4619e.intValue() != C1534d.f4605a;
    }

    public void m6980a(Context context, String str, int i, String str2, String str3, int i2, List<String> list) {
        if (!C1538h.m6979c(context)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            Log.e(f4615a, "missing wakeLock key. " + str);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (7 == i || 8 == i || 10 == i || 11 == i) {
            try {
                context.startService(new Intent().setComponent(f4617c).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", new WakeLockEvent(currentTimeMillis, i, str2, i2, list, str, SystemClock.elapsedRealtime(), m6975a(context), str3, context.getPackageName(), m6977b(context))));
            } catch (Throwable e) {
                Log.wtf(f4615a, e);
            }
        }
    }
}
