package com.google.android.gms.p032d;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C0934f;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class cf extends C1546o {
    private static final String f4812a = C0914e.TIMER_LISTENER.toString();
    private static final String f4813b = C0934f.NAME.toString();
    private static final String f4814c = C0934f.INTERVAL.toString();
    private static final String f4815d = C0934f.LIMIT.toString();
    private static final String f4816e = C0934f.UNIQUE_TRIGGER_ID.toString();
    private boolean f4817f;
    private boolean f4818g;
    private final Context f4819h;
    private C1585c f4820i;
    private final HandlerThread f4821j;
    private Handler f4822k;
    private final Set<String> f4823l = new HashSet();

    private final class C1587a implements Runnable {
        final /* synthetic */ cf f4805a;
        private final String f4806b;
        private final String f4807c;
        private final long f4808d;
        private final long f4809e;
        private final long f4810f = System.currentTimeMillis();
        private long f4811g;

        C1587a(cf cfVar, String str, String str2, long j, long j2) {
            this.f4805a = cfVar;
            this.f4806b = str;
            this.f4807c = str2;
            this.f4808d = j;
            this.f4809e = j2;
        }

        protected boolean m7289a() {
            if (this.f4805a.f4818g) {
                return this.f4805a.f4817f;
            }
            KeyguardManager keyguardManager = (KeyguardManager) this.f4805a.f4819h.getSystemService("keyguard");
            PowerManager powerManager = (PowerManager) this.f4805a.f4819h.getSystemService("power");
            for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.f4805a.f4819h.getSystemService("activity")).getRunningAppProcesses()) {
                if (Process.myPid() == runningAppProcessInfo.pid && runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && powerManager.isScreenOn()) {
                    return true;
                }
            }
            return false;
        }

        public void run() {
            if (this.f4809e <= 0 || this.f4811g < this.f4809e) {
                this.f4811g++;
                if (m7289a()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f4805a.f4820i.m7272a(C1585c.m7253a("event", this.f4806b, "gtm.timerInterval", String.valueOf(this.f4808d), "gtm.timerLimit", String.valueOf(this.f4809e), "gtm.timerStartTime", String.valueOf(this.f4810f), "gtm.timerCurrentTime", String.valueOf(currentTimeMillis), "gtm.timerElapsedTime", String.valueOf(currentTimeMillis - this.f4810f), "gtm.timerEventNumber", String.valueOf(this.f4811g), "gtm.triggers", this.f4807c));
                }
                this.f4805a.f4822k.postDelayed(this, this.f4808d);
            } else if (!"0".equals(this.f4807c)) {
                this.f4805a.f4823l.remove(this.f4807c);
            }
        }
    }

    public cf(Context context, C1585c c1585c) {
        super(f4812a, f4814c, f4813b);
        this.f4819h = context;
        this.f4820i = c1585c;
        this.f4821j = new HandlerThread("Google GTM SDK Timer", 10);
        this.f4821j.start();
        this.f4822k = new Handler(this.f4821j.getLooper());
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        long parseLong;
        long parseLong2;
        Object a = cj.m7319a((C1009a) map.get(f4813b));
        String a2 = cj.m7319a((C1009a) map.get(f4816e));
        String a3 = cj.m7319a((C1009a) map.get(f4814c));
        String a4 = cj.m7319a((C1009a) map.get(f4815d));
        try {
            parseLong = Long.parseLong(a3);
        } catch (NumberFormatException e) {
            parseLong = 0;
        }
        try {
            parseLong2 = Long.parseLong(a4);
        } catch (NumberFormatException e2) {
            parseLong2 = 0;
        }
        if (parseLong > 0 && !TextUtils.isEmpty(a)) {
            if (a2 == null || a2.isEmpty()) {
                a2 = "0";
            }
            if (!this.f4823l.contains(a2)) {
                if (!"0".equals(a2)) {
                    this.f4823l.add(a2);
                }
                this.f4822k.postDelayed(new C1587a(this, a, a2, parseLong, parseLong2), parseLong);
            }
        }
        return cj.m7335f();
    }

    public boolean mo973a() {
        return false;
    }
}
