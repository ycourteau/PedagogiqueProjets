package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.C0733g;
import com.google.android.gms.analytics.internal.C0741l;
import com.google.android.gms.analytics.internal.C0750r;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.kg;

public class C0708d extends Service {
    private static Boolean f2009b;
    private Handler f2010a;

    private void m3149a() {
        try {
            synchronized (C0704c.f1995a) {
                kg kgVar = C0704c.f1996b;
                if (kgVar != null && kgVar.m5511b()) {
                    kgVar.m5507a();
                }
            }
        } catch (SecurityException e) {
        }
    }

    public static boolean m3150a(Context context) {
        C1305x.m6617a((Object) context);
        if (f2009b != null) {
            return f2009b.booleanValue();
        }
        boolean a = C0741l.m3455a(context, C0708d.class);
        f2009b = Boolean.valueOf(a);
        return a;
    }

    private Handler m3151b() {
        Handler handler = this.f2010a;
        if (handler != null) {
            return handler;
        }
        handler = new Handler(getMainLooper());
        this.f2010a = handler;
        return handler;
    }

    protected void m3152a(final C0733g c0733g, Handler handler, final int i) {
        handler.post(new Runnable(this) {
            final /* synthetic */ C0708d f2008c;

            public void run() {
                boolean stopSelfResult = this.f2008c.stopSelfResult(i);
                if (stopSelfResult) {
                    c0733g.m3195a("Install campaign broadcast processed", Boolean.valueOf(stopSelfResult));
                }
            }
        });
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C0750r.m3487a((Context) this).m3494f().m3198b("CampaignTrackingService is starting up");
    }

    public void onDestroy() {
        C0750r.m3487a((Context) this).m3494f().m3198b("CampaignTrackingService is shutting down");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, final int i2) {
        m3149a();
        C0750r a = C0750r.m3487a((Context) this);
        final C0733g f = a.m3494f();
        String str = null;
        if (a.m3493e().m3282a()) {
            f.m3210f("Unexpected installation campaign (package side)");
        } else {
            str = intent.getStringExtra("referrer");
        }
        final Handler b = m3151b();
        if (TextUtils.isEmpty(str)) {
            if (!a.m3493e().m3282a()) {
                f.m3208e("No campaign found on com.android.vending.INSTALL_REFERRER \"referrer\" extra");
            }
            a.m3496h().m5378a(new Runnable(this) {
                final /* synthetic */ C0708d f2001d;

                public void run() {
                    this.f2001d.m3152a(f, b, i2);
                }
            });
        } else {
            int e = a.m3493e().m3286e();
            if (str.length() > e) {
                f.m3204c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(str.length()), Integer.valueOf(e));
                str = str.substring(0, e);
            }
            f.m3196a("CampaignTrackingService called. startId, campaign", Integer.valueOf(i2), str);
            a.m3497i().m3479a(str, new Runnable(this) {
                final /* synthetic */ C0708d f2005d;

                public void run() {
                    this.f2005d.m3152a(f, b, i2);
                }
            });
        }
        return 2;
    }
}
