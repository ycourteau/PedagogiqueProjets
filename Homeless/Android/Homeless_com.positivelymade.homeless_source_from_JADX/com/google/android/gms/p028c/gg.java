package com.google.android.gms.p028c;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;

@fn
public class gg {
    long f3327a = -1;
    long f3328b = -1;
    int f3329c = -1;
    final String f3330d;
    int f3331e = 0;
    int f3332f = 0;
    private final Object f3333g = new Object();

    public gg(String str) {
        this.f3330d = str;
    }

    public static boolean m4797a(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            C0691b.m3099c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                return true;
            }
            C0691b.m3099c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (NameNotFoundException e) {
            C0691b.m3103e("Fail to fetch AdActivity theme");
            C0691b.m3099c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    public long m4798a() {
        return this.f3328b;
    }

    public Bundle m4799a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f3333g) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f3330d);
            bundle.putLong("basets", this.f3328b);
            bundle.putLong("currts", this.f3327a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f3329c);
            bundle.putInt("pclick", this.f3331e);
            bundle.putInt("pimp", this.f3332f);
            bundle.putBoolean("support_transparent_background", gg.m4797a(context));
        }
        return bundle;
    }

    public void m4800a(AdRequestParcel adRequestParcel, long j) {
        synchronized (this.f3333g) {
            if (this.f3328b == -1) {
                this.f3328b = j;
                this.f3327a = this.f3328b;
            } else {
                this.f3327a = j;
            }
            if (adRequestParcel.f1332c == null || adRequestParcel.f1332c.getInt("gw", 2) != 1) {
                this.f3329c++;
                return;
            }
        }
    }

    public void m4801b() {
        synchronized (this.f3333g) {
            this.f3331e++;
        }
    }

    public void m4802c() {
        synchronized (this.f3333g) {
            this.f3332f++;
        }
    }
}
