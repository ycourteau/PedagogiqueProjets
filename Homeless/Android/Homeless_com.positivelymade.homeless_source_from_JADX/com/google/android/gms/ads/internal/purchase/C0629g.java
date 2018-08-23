package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.common.stats.C1530b;
import com.google.android.gms.p028c.er.C0628a;
import com.google.android.gms.p028c.fn;

@fn
public final class C0629g extends C0628a implements ServiceConnection {
    C0620b f1751a;
    private boolean f1752b = false;
    private Context f1753c;
    private int f1754d;
    private Intent f1755e;
    private C0627f f1756f;
    private String f1757g;

    public C0629g(Context context, String str, boolean z, int i, Intent intent, C0627f c0627f) {
        this.f1757g = str;
        this.f1754d = i;
        this.f1755e = intent;
        this.f1752b = z;
        this.f1753c = context;
        this.f1756f = c0627f;
    }

    public boolean mo494a() {
        return this.f1752b;
    }

    public String mo495b() {
        return this.f1757g;
    }

    public Intent mo496c() {
        return this.f1755e;
    }

    public int mo497d() {
        return this.f1754d;
    }

    public void mo498e() {
        int a = C0618p.m2806o().m2879a(this.f1755e);
        if (this.f1754d == -1 && a == 0) {
            this.f1751a = new C0620b(this.f1753c);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            C1530b.m6956a().m6965a(this.f1753c, intent, (ServiceConnection) this, 1);
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0691b.m3099c("In-app billing service connected.");
        this.f1751a.m2824a(iBinder);
        String b = C0618p.m2806o().m2885b(C0618p.m2806o().m2884b(this.f1755e));
        if (b != null) {
            if (this.f1751a.m2821a(this.f1753c.getPackageName(), b) == 0) {
                C0631h.m2870a(this.f1753c).m2875a(this.f1756f);
            }
            C1530b.m6956a().m6963a(this.f1753c, (ServiceConnection) this);
            this.f1751a.m2823a();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C0691b.m3099c("In-app billing service disconnected.");
        this.f1751a.m2823a();
    }
}
