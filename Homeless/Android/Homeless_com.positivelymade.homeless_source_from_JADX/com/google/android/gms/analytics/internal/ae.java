package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.C0714g;

class ae implements C0714g {
    private int f2064a = 2;
    private boolean f2065b;

    ae() {
    }

    public int mo541a() {
        return this.f2064a;
    }

    public void mo542a(int i) {
        this.f2064a = i;
        if (!this.f2065b) {
            Log.i((String) ak.f2097c.m3343a(), "Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag." + ((String) ak.f2097c.m3343a()) + " DEBUG");
            this.f2065b = true;
        }
    }

    public void mo543a(String str) {
    }

    public void mo544b(String str) {
    }
}
