package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;

public abstract class C1282n {
    private static final Object f4388a = new Object();
    private static C1282n f4389b;

    public static C1282n m6418a(Context context) {
        synchronized (f4388a) {
            if (f4389b == null) {
                f4389b = new C1286o(context.getApplicationContext());
            }
        }
        return f4389b;
    }

    public abstract boolean mo914a(String str, ServiceConnection serviceConnection, String str2);

    public abstract void mo915b(String str, ServiceConnection serviceConnection, String str2);
}
