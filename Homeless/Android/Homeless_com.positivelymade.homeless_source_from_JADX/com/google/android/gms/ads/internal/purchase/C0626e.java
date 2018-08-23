package com.google.android.gms.ads.internal.purchase;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.en;
import com.google.android.gms.p028c.ep.C0625a;
import com.google.android.gms.p028c.fn;

@fn
public class C0626e extends C0625a implements ServiceConnection {
    C0631h f1739a;
    private final Activity f1740b;
    private Context f1741c;
    private en f1742d;
    private C0620b f1743e;
    private C0627f f1744f;
    private C0498j f1745g;
    private C0634k f1746h;
    private String f1747i = null;

    public C0626e(Activity activity) {
        this.f1740b = activity;
        this.f1739a = C0631h.m2870a(this.f1740b.getApplicationContext());
    }

    public void mo491a() {
        GInAppPurchaseManagerInfoParcel a = GInAppPurchaseManagerInfoParcel.m2811a(this.f1740b.getIntent());
        this.f1745g = a.f1718e;
        this.f1746h = a.f1715b;
        this.f1742d = a.f1716c;
        this.f1743e = new C0620b(this.f1740b.getApplicationContext());
        this.f1741c = a.f1717d;
        if (this.f1740b.getResources().getConfiguration().orientation == 2) {
            this.f1740b.setRequestedOrientation(C0618p.m2798g().mo737a());
        } else {
            this.f1740b.setRequestedOrientation(C0618p.m2798g().mo739b());
        }
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        this.f1740b.bindService(intent, this, 1);
    }

    public void mo492a(int i, int i2, Intent intent) {
        if (i == 1001) {
            boolean z = false;
            try {
                int a = C0618p.m2806o().m2879a(intent);
                if (i2 == -1) {
                    C0618p.m2806o();
                    if (a == 0) {
                        if (this.f1746h.m2888a(this.f1747i, i2, intent)) {
                            z = true;
                        }
                        this.f1742d.mo490c(a);
                        this.f1740b.finish();
                        m2857a(this.f1742d.mo488a(), z, i2, intent);
                    }
                }
                this.f1739a.m2875a(this.f1744f);
                this.f1742d.mo490c(a);
                this.f1740b.finish();
                m2857a(this.f1742d.mo488a(), z, i2, intent);
            } catch (RemoteException e) {
                C0691b.m3103e("Fail to process purchase result.");
                this.f1740b.finish();
            } finally {
                this.f1747i = null;
            }
        }
    }

    protected void m2857a(String str, boolean z, int i, Intent intent) {
        if (this.f1745g != null) {
            this.f1745g.mo364a(str, z, i, intent, this.f1744f);
        }
    }

    public void mo493b() {
        this.f1740b.unbindService(this);
        this.f1743e.m2823a();
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Throwable e;
        this.f1743e.m2824a(iBinder);
        try {
            this.f1747i = this.f1746h.m2887a();
            Bundle a = this.f1743e.m2822a(this.f1740b.getPackageName(), this.f1742d.mo488a(), this.f1747i);
            PendingIntent pendingIntent = (PendingIntent) a.getParcelable("BUY_INTENT");
            if (pendingIntent == null) {
                int a2 = C0618p.m2806o().m2880a(a);
                this.f1742d.mo490c(a2);
                m2857a(this.f1742d.mo488a(), false, a2, null);
                this.f1740b.finish();
                return;
            }
            this.f1744f = new C0627f(this.f1742d.mo488a(), this.f1747i);
            this.f1739a.m2877b(this.f1744f);
            this.f1740b.startIntentSenderForResult(pendingIntent.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        } catch (RemoteException e2) {
            e = e2;
            C0691b.m3102d("Error when connecting in-app billing service", e);
            this.f1740b.finish();
        } catch (SendIntentException e3) {
            e = e3;
            C0691b.m3102d("Error when connecting in-app billing service", e);
            this.f1740b.finish();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C0691b.m3099c("In-app billing service disconnected.");
        this.f1743e.m2823a();
    }
}
