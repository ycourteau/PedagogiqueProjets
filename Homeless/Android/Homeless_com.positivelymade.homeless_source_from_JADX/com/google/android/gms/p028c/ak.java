package com.google.android.gms.p028c;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;

@fn
public class ak implements ActivityLifecycleCallbacks {
    private Activity f2400a;
    private Context f2401b;
    private final Object f2402c = new Object();

    public ak(Application application, Activity activity) {
        application.registerActivityLifecycleCallbacks(this);
        m3817a(activity);
        this.f2401b = application.getApplicationContext();
    }

    private void m3817a(Activity activity) {
        synchronized (this.f2402c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f2400a = activity;
            }
        }
    }

    public Activity m3818a() {
        return this.f2400a;
    }

    public Context m3819b() {
        return this.f2401b;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityDestroyed(android.app.Activity r3) {
        /*
        r2 = this;
        r1 = r2.f2402c;
        monitor-enter(r1);
        r0 = r2.f2400a;	 Catch:{ all -> 0x0016 }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
    L_0x0008:
        return;
    L_0x0009:
        r0 = r2.f2400a;	 Catch:{ all -> 0x0016 }
        r0 = r0.equals(r3);	 Catch:{ all -> 0x0016 }
        if (r0 == 0) goto L_0x0014;
    L_0x0011:
        r0 = 0;
        r2.f2400a = r0;	 Catch:{ all -> 0x0016 }
    L_0x0014:
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        goto L_0x0008;
    L_0x0016:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.ak.onActivityDestroyed(android.app.Activity):void");
    }

    public void onActivityPaused(Activity activity) {
        m3817a(activity);
    }

    public void onActivityResumed(Activity activity) {
        m3817a(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        m3817a(activity);
    }

    public void onActivityStopped(Activity activity) {
    }
}
