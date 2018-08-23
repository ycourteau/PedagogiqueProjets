package com.google.android.gms.p032d;

import android.util.Log;

public class di implements ak {
    private int f4953a = 5;

    public void mo1035a(String str) {
        if (this.f4953a <= 6) {
            Log.e("GoogleTagManager", str);
        }
    }

    public void mo1036a(String str, Throwable th) {
        if (this.f4953a <= 6) {
            Log.e("GoogleTagManager", str, th);
        }
    }

    public void mo1037b(String str) {
        if (this.f4953a <= 5) {
            Log.w("GoogleTagManager", str);
        }
    }

    public void mo1038b(String str, Throwable th) {
        if (this.f4953a <= 5) {
            Log.w("GoogleTagManager", str, th);
        }
    }

    public void mo1039c(String str) {
        if (this.f4953a <= 4) {
            Log.i("GoogleTagManager", str);
        }
    }

    public void mo1040d(String str) {
        if (this.f4953a <= 2) {
            Log.v("GoogleTagManager", str);
        }
    }
}
