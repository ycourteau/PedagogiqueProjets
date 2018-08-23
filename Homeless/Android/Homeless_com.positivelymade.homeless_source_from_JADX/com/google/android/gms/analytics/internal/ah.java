package com.google.android.gms.analytics.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.analytics.C0700a;
import com.google.android.gms.common.internal.C1305x;

public class ah extends C0717p {
    private boolean f2072a;
    private boolean f2073b;
    private AlarmManager f2074c = ((AlarmManager) m3215o().getSystemService("alarm"));

    protected ah(C0750r c0750r) {
        super(c0750r);
    }

    private PendingIntent m3325f() {
        Intent intent = new Intent(m3215o(), C0700a.class);
        intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        return PendingIntent.getBroadcast(m3215o(), 0, intent, 0);
    }

    protected void mo540a() {
        try {
            this.f2074c.cancel(m3325f());
            if (m3217q().m3291j() > 0) {
                ActivityInfo receiverInfo = m3215o().getPackageManager().getReceiverInfo(new ComponentName(m3215o(), C0700a.class), 2);
                if (receiverInfo != null && receiverInfo.enabled) {
                    m3198b("Receiver registered. Using alarm for local dispatch.");
                    this.f2072a = true;
                }
            }
        } catch (NameNotFoundException e) {
        }
    }

    public boolean m3327b() {
        return this.f2072a;
    }

    public boolean m3328c() {
        return this.f2073b;
    }

    public void m3329d() {
        m3228D();
        C1305x.m6622a(m3327b(), (Object) "Receiver not registered");
        long j = m3217q().m3291j();
        if (j > 0) {
            m3330e();
            long b = m3214n().mo825b() + j;
            this.f2073b = true;
            this.f2074c.setInexactRepeating(2, b, 0, m3325f());
        }
    }

    public void m3330e() {
        m3228D();
        this.f2073b = false;
        this.f2074c.cancel(m3325f());
    }
}
