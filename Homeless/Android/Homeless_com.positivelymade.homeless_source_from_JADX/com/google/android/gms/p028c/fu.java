package com.google.android.gms.p028c;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.client.C0526n;
import com.google.android.gms.common.C1241e;
import java.util.Locale;

@fn
public final class fu {
    public final int f3168a;
    public final boolean f3169b;
    public final boolean f3170c;
    public final String f3171d;
    public final String f3172e;
    public final boolean f3173f;
    public final boolean f3174g;
    public final boolean f3175h;
    public final boolean f3176i;
    public final String f3177j;
    public final String f3178k;
    public final int f3179l;
    public final int f3180m;
    public final int f3181n;
    public final int f3182o;
    public final int f3183p;
    public final int f3184q;
    public final float f3185r;
    public final int f3186s;
    public final int f3187t;
    public final double f3188u;
    public final boolean f3189v;
    public final boolean f3190w;
    public final int f3191x;
    public final String f3192y;

    public static final class C0960a {
        private int f3143a;
        private boolean f3144b;
        private boolean f3145c;
        private int f3146d;
        private int f3147e;
        private int f3148f;
        private String f3149g;
        private int f3150h;
        private int f3151i;
        private int f3152j;
        private boolean f3153k;
        private int f3154l;
        private double f3155m;
        private boolean f3156n;
        private String f3157o;
        private boolean f3158p;
        private boolean f3159q;
        private String f3160r;
        private boolean f3161s;
        private boolean f3162t;
        private String f3163u;
        private String f3164v;
        private float f3165w;
        private int f3166x;
        private int f3167y;

        public C0960a(Context context) {
            boolean z = true;
            PackageManager packageManager = context.getPackageManager();
            m4697a(context);
            m4698a(context, packageManager);
            m4699b(context);
            Locale locale = Locale.getDefault();
            this.f3158p = C0960a.m4695a(packageManager, "geo:0,0?q=donuts") != null;
            if (C0960a.m4695a(packageManager, "http://www.google.com") == null) {
                z = false;
            }
            this.f3159q = z;
            this.f3160r = locale.getCountry();
            this.f3161s = C0526n.m2400a().m3085a();
            this.f3162t = C1241e.m6292g(context);
            this.f3163u = locale.getLanguage();
            this.f3164v = C0960a.m4696a(packageManager);
            Resources resources = context.getResources();
            if (resources != null) {
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (displayMetrics != null) {
                    this.f3165w = displayMetrics.density;
                    this.f3166x = displayMetrics.widthPixels;
                    this.f3167y = displayMetrics.heightPixels;
                }
            }
        }

        public C0960a(Context context, fu fuVar) {
            PackageManager packageManager = context.getPackageManager();
            m4697a(context);
            m4698a(context, packageManager);
            m4699b(context);
            m4700c(context);
            this.f3158p = fuVar.f3169b;
            this.f3159q = fuVar.f3170c;
            this.f3160r = fuVar.f3172e;
            this.f3161s = fuVar.f3173f;
            this.f3162t = fuVar.f3174g;
            this.f3163u = fuVar.f3177j;
            this.f3164v = fuVar.f3178k;
            this.f3165w = fuVar.f3185r;
            this.f3166x = fuVar.f3186s;
            this.f3167y = fuVar.f3187t;
        }

        private static int m4694a(Context context, ConnectivityManager connectivityManager, PackageManager packageManager) {
            if (!C0618p.m2796e().m4864a(packageManager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
                return -2;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null ? activeNetworkInfo.getType() : -1;
        }

        private static ResolveInfo m4695a(PackageManager packageManager, String str) {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        }

        private static String m4696a(PackageManager packageManager) {
            String str = null;
            ResolveInfo a = C0960a.m4695a(packageManager, "market://details?id=com.google.android.gms.ads");
            if (a != null) {
                ActivityInfo activityInfo = a.activityInfo;
                if (activityInfo != null) {
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(activityInfo.packageName, 0);
                        if (packageInfo != null) {
                            str = packageInfo.versionCode + "." + activityInfo.packageName;
                        }
                    } catch (NameNotFoundException e) {
                    }
                }
            }
            return str;
        }

        private void m4697a(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.f3143a = audioManager.getMode();
            this.f3144b = audioManager.isMusicActive();
            this.f3145c = audioManager.isSpeakerphoneOn();
            this.f3146d = audioManager.getStreamVolume(3);
            this.f3147e = audioManager.getRingerMode();
            this.f3148f = audioManager.getStreamVolume(2);
        }

        private void m4698a(Context context, PackageManager packageManager) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            this.f3149g = telephonyManager.getNetworkOperator();
            this.f3150h = C0960a.m4694a(context, connectivityManager, packageManager);
            this.f3151i = telephonyManager.getNetworkType();
            this.f3152j = telephonyManager.getPhoneType();
            if (VERSION.SDK_INT >= 16) {
                this.f3153k = connectivityManager.isActiveNetworkMetered();
                if (connectivityManager.getActiveNetworkInfo() != null) {
                    this.f3154l = connectivityManager.getActiveNetworkInfo().getDetailedState().ordinal();
                    return;
                } else {
                    this.f3154l = -1;
                    return;
                }
            }
            this.f3153k = false;
            this.f3154l = -1;
        }

        private void m4699b(Context context) {
            boolean z = false;
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("status", -1);
                this.f3155m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
                if (intExtra == 2 || intExtra == 5) {
                    z = true;
                }
                this.f3156n = z;
                return;
            }
            this.f3155m = -1.0d;
            this.f3156n = false;
        }

        private void m4700c(Context context) {
            this.f3157o = Build.FINGERPRINT;
        }

        public fu m4701a() {
            return new fu(this.f3143a, this.f3158p, this.f3159q, this.f3149g, this.f3160r, this.f3161s, this.f3162t, this.f3144b, this.f3145c, this.f3163u, this.f3164v, this.f3146d, this.f3150h, this.f3151i, this.f3152j, this.f3147e, this.f3148f, this.f3165w, this.f3166x, this.f3167y, this.f3155m, this.f3156n, this.f3153k, this.f3154l, this.f3157o);
        }
    }

    fu(int i, boolean z, boolean z2, String str, String str2, boolean z3, boolean z4, boolean z5, boolean z6, String str3, String str4, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, double d, boolean z7, boolean z8, int i10, String str5) {
        this.f3168a = i;
        this.f3169b = z;
        this.f3170c = z2;
        this.f3171d = str;
        this.f3172e = str2;
        this.f3173f = z3;
        this.f3174g = z4;
        this.f3175h = z5;
        this.f3176i = z6;
        this.f3177j = str3;
        this.f3178k = str4;
        this.f3179l = i2;
        this.f3180m = i3;
        this.f3181n = i4;
        this.f3182o = i5;
        this.f3183p = i6;
        this.f3184q = i7;
        this.f3185r = f;
        this.f3186s = i8;
        this.f3187t = i9;
        this.f3188u = d;
        this.f3189v = z7;
        this.f3190w = z8;
        this.f3191x = i10;
        this.f3192y = str5;
    }
}
