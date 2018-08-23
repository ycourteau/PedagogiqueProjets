package com.google.android.gms.analytics.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.C1305x;

class C0734h extends BroadcastReceiver {
    static final String f2146a = C0734h.class.getName();
    private final C0750r f2147b;
    private boolean f2148c;
    private boolean f2149d;

    C0734h(C0750r c0750r) {
        C1305x.m6617a((Object) c0750r);
        this.f2147b = c0750r;
    }

    private void m3394g() {
        m3396i();
        m3397j();
    }

    private Context m3395h() {
        return this.f2147b.m3490b();
    }

    private C0733g m3396i() {
        return this.f2147b.m3494f();
    }

    private C0747n m3397j() {
        return this.f2147b.m3497i();
    }

    public void m3398a() {
        m3394g();
        if (!this.f2148c) {
            Context h = m3395h();
            h.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
            intentFilter.addCategory(h.getPackageName());
            h.registerReceiver(this, intentFilter);
            this.f2149d = m3403f();
            this.f2147b.m3494f().m3195a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f2149d));
            this.f2148c = true;
        }
    }

    public void m3399b() {
        if (m3401d()) {
            this.f2147b.m3494f().m3198b("Unregistering connectivity change receiver");
            this.f2148c = false;
            this.f2149d = false;
            try {
                m3395h().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                m3396i().m3209e("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public void m3400c() {
        if (VERSION.SDK_INT > 10) {
            Context h = m3395h();
            Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
            intent.addCategory(h.getPackageName());
            intent.putExtra(f2146a, true);
            h.sendOrderedBroadcast(intent, null);
        }
    }

    public boolean m3401d() {
        return this.f2148c;
    }

    public boolean m3402e() {
        if (!this.f2148c) {
            this.f2147b.m3494f().m3208e("Connectivity unknown. Receiver not registered");
        }
        return this.f2149d;
    }

    protected boolean m3403f() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) m3395h().getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (SecurityException e) {
            return false;
        }
    }

    public void onReceive(Context context, Intent intent) {
        m3394g();
        String action = intent.getAction();
        this.f2147b.m3494f().m3195a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean f = m3403f();
            if (this.f2149d != f) {
                this.f2149d = f;
                m3397j().m3480a(f);
            }
        } else if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.f2147b.m3494f().m3206d("NetworkBroadcastReceiver received unknown action", action);
        } else if (!intent.hasExtra(f2146a)) {
            m3397j().m3484e();
        }
    }
}
