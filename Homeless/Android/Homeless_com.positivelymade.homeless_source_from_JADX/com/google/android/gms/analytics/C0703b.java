package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.analytics.internal.C0733g;
import com.google.android.gms.analytics.internal.C0741l;
import com.google.android.gms.analytics.internal.C0750r;
import com.google.android.gms.analytics.internal.ai;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.kg;

public final class C0703b extends Service {
    private static Boolean f1993b;
    private final Handler f1994a = new Handler();

    private void m3144a() {
        try {
            synchronized (C0700a.f1985a) {
                kg kgVar = C0700a.f1986b;
                if (kgVar != null && kgVar.m5511b()) {
                    kgVar.m5507a();
                }
            }
        } catch (SecurityException e) {
        }
    }

    public static boolean m3145a(Context context) {
        C1305x.m6617a((Object) context);
        if (f1993b != null) {
            return f1993b.booleanValue();
        }
        boolean a = C0741l.m3455a(context, C0703b.class);
        f1993b = Boolean.valueOf(a);
        return a;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C0750r a = C0750r.m3487a((Context) this);
        C0733g f = a.m3494f();
        if (a.m3493e().m3282a()) {
            f.m3198b("Device AnalyticsService is starting up");
        } else {
            f.m3198b("Local AnalyticsService is starting up");
        }
    }

    public void onDestroy() {
        C0750r a = C0750r.m3487a((Context) this);
        C0733g f = a.m3494f();
        if (a.m3493e().m3282a()) {
            f.m3198b("Device AnalyticsService is shutting down");
        } else {
            f.m3198b("Local AnalyticsService is shutting down");
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, final int i2) {
        m3144a();
        final C0750r a = C0750r.m3487a((Context) this);
        final C0733g f = a.m3494f();
        String action = intent.getAction();
        if (a.m3493e().m3282a()) {
            f.m3196a("Device AnalyticsService called. startId, action", Integer.valueOf(i2), action);
        } else {
            f.m3196a("Local AnalyticsService called. startId, action", Integer.valueOf(i2), action);
        }
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            a.m3497i().m3477a(new ai(this) {
                final /* synthetic */ C0703b f1992d;

                class C07011 implements Runnable {
                    final /* synthetic */ C07021 f1988a;

                    C07011(C07021 c07021) {
                        this.f1988a = c07021;
                    }

                    public void run() {
                        if (!this.f1988a.f1992d.stopSelfResult(i2)) {
                            return;
                        }
                        if (a.m3493e().m3282a()) {
                            f.m3198b("Device AnalyticsService processed last dispatch request");
                        } else {
                            f.m3198b("Local AnalyticsService processed last dispatch request");
                        }
                    }
                }

                public void mo536a(Throwable th) {
                    this.f1992d.f1994a.post(new C07011(this));
                }
            });
        }
        return 2;
    }
}
