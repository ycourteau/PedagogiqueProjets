package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.common.stats.C1530b;
import com.google.android.gms.p028c.es;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.gk;
import com.google.android.gms.p028c.go;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@fn
public class C0622c extends gk implements ServiceConnection {
    private final Object f1727a;
    private boolean f1728b;
    private Context f1729c;
    private es f1730d;
    private C0620b f1731e;
    private C0631h f1732f;
    private List<C0627f> f1733g;
    private C0634k f1734h;

    public C0622c(Context context, es esVar, C0634k c0634k) {
        this(context, esVar, c0634k, new C0620b(context), C0631h.m2870a(context.getApplicationContext()));
    }

    C0622c(Context context, es esVar, C0634k c0634k, C0620b c0620b, C0631h c0631h) {
        this.f1727a = new Object();
        this.f1728b = false;
        this.f1733g = null;
        this.f1729c = context;
        this.f1730d = esVar;
        this.f1734h = c0634k;
        this.f1731e = c0620b;
        this.f1732f = c0631h;
        this.f1733g = this.f1732f.m2874a(10);
    }

    private void m2833a(long j) {
        do {
            if (!m2835b(j)) {
                C0691b.m3101d("Timeout waiting for pending transaction to be processed.");
            }
        } while (!this.f1728b);
    }

    private boolean m2835b(long j) {
        long elapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.f1727a.wait(elapsedRealtime);
        } catch (InterruptedException e) {
            C0691b.m3103e("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    public void mo486a() {
        synchronized (this.f1727a) {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            C1530b.m6956a().m6965a(this.f1729c, intent, (ServiceConnection) this, 1);
            m2833a(SystemClock.elapsedRealtime());
            C1530b.m6956a().m6963a(this.f1729c, (ServiceConnection) this);
            this.f1731e.m2823a();
        }
    }

    protected void m2838a(final C0627f c0627f, String str, String str2) {
        final Intent intent = new Intent();
        C0618p.m2806o();
        intent.putExtra("RESPONSE_CODE", 0);
        C0618p.m2806o();
        intent.putExtra("INAPP_PURCHASE_DATA", str);
        C0618p.m2806o();
        intent.putExtra("INAPP_DATA_SIGNATURE", str2);
        go.f3361a.post(new Runnable(this) {
            final /* synthetic */ C0622c f1724c;

            public void run() {
                try {
                    if (this.f1724c.f1734h.m2888a(c0627f.f1749b, -1, intent)) {
                        this.f1724c.f1730d.mo719a(new C0629g(this.f1724c.f1729c, c0627f.f1750c, true, -1, intent, c0627f));
                    } else {
                        this.f1724c.f1730d.mo719a(new C0629g(this.f1724c.f1729c, c0627f.f1750c, false, -1, intent, c0627f));
                    }
                } catch (RemoteException e) {
                    C0691b.m3103e("Fail to verify and dispatch pending transaction");
                }
            }
        });
    }

    public void mo487b() {
        synchronized (this.f1727a) {
            C1530b.m6956a().m6963a(this.f1729c, (ServiceConnection) this);
            this.f1731e.m2823a();
        }
    }

    protected void m2840c() {
        if (!this.f1733g.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (C0627f c0627f : this.f1733g) {
                hashMap.put(c0627f.f1750c, c0627f);
            }
            String str = null;
            while (true) {
                Bundle b = this.f1731e.m2825b(this.f1729c.getPackageName(), str);
                if (b == null || C0618p.m2806o().m2880a(b) != 0) {
                    break;
                }
                ArrayList stringArrayList = b.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList stringArrayList2 = b.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList stringArrayList3 = b.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                String string = b.getString("INAPP_CONTINUATION_TOKEN");
                for (int i = 0; i < stringArrayList.size(); i++) {
                    if (hashMap.containsKey(stringArrayList.get(i))) {
                        str = (String) stringArrayList.get(i);
                        String str2 = (String) stringArrayList2.get(i);
                        String str3 = (String) stringArrayList3.get(i);
                        C0627f c0627f2 = (C0627f) hashMap.get(str);
                        if (c0627f2.f1749b.equals(C0618p.m2806o().m2881a(str2))) {
                            m2838a(c0627f2, str2, str3);
                            hashMap.remove(str);
                        }
                    }
                }
                if (string == null || hashMap.isEmpty()) {
                    break;
                }
                str = string;
            }
            for (String str4 : hashMap.keySet()) {
                this.f1732f.m2875a((C0627f) hashMap.get(str4));
            }
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f1727a) {
            this.f1731e.m2824a(iBinder);
            m2840c();
            this.f1728b = true;
            this.f1727a.notify();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C0691b.m3099c("In-app billing service disconnected.");
        this.f1731e.m2823a();
    }
}
