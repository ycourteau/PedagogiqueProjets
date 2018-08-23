package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.C0018f;
import android.support.v4.app.C0026g;
import android.support.v7.p010b.C0275a.C0274i;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.C0455a.C0452a;
import com.google.android.gms.common.C1517j.aw;
import com.google.android.gms.common.internal.C1253f;
import com.google.android.gms.common.internal.C1267i;
import com.google.android.gms.common.internal.C1268j;
import com.google.android.gms.common.internal.C1287p;
import com.google.android.gms.p028c.ii;
import com.google.android.gms.p028c.is;
import java.util.concurrent.atomic.AtomicBoolean;

public final class C1241e {
    @Deprecated
    public static final int f4280a = C1241e.m6282b();
    public static boolean f4281b = false;
    public static boolean f4282c = false;
    static final AtomicBoolean f4283d = new AtomicBoolean();
    private static int f4284e = -1;
    private static final Object f4285f = new Object();
    private static String f4286g = null;
    private static Integer f4287h = null;

    @Deprecated
    public static int m6271a(Context context) {
        if (C1253f.f4324a) {
            return 0;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            context.getResources().getString(C0452a.common_google_play_services_unknown_issue);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            C1241e.m6293h(context);
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
            C1518k a = C1518k.m6827a();
            if (!ii.m5262c(packageInfo.versionCode) && !ii.m5260a(context)) {
                try {
                    if (a.m6829a(packageManager.getPackageInfo("com.android.vending", 64), aw.f4444a) == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                        return 9;
                    }
                    if (a.m6829a(packageInfo, a.m6829a(packageManager.getPackageInfo("com.android.vending", 64), aw.f4444a)) == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                        return 9;
                    }
                } catch (NameNotFoundException e) {
                    if (C1241e.m6279a(context, "com.android.vending")) {
                        Log.w("GooglePlayServicesUtil", "Google Play Store is updating.");
                        if (a.m6829a(packageInfo, aw.f4444a) == null) {
                            Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                            return 9;
                        }
                    }
                    Log.w("GooglePlayServicesUtil", "Google Play Store is neither installed nor updating.");
                    return 9;
                }
            } else if (a.m6829a(packageInfo, aw.f4444a) == null) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (ii.m5259a(packageInfo.versionCode) < ii.m5259a(f4280a)) {
                Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires " + f4280a + " but found " + packageInfo.versionCode);
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                } catch (NameNotFoundException e2) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
                    e2.printStackTrace();
                    return 1;
                }
            }
            return !applicationInfo.enabled ? 3 : 0;
        } catch (NameNotFoundException e3) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    @Deprecated
    public static Dialog m6272a(int i, Activity activity, int i2) {
        return C1241e.m6273a(i, activity, i2, null);
    }

    @Deprecated
    public static Dialog m6273a(int i, Activity activity, int i2, OnCancelListener onCancelListener) {
        return C1241e.m6283b(i, activity, null, i2, onCancelListener);
    }

    @Deprecated
    public static Intent m6274a(int i) {
        switch (i) {
            case 1:
            case 2:
                return C1287p.m6446b("com.google.android.gms");
            case 3:
                return C1287p.m6445a("com.google.android.gms");
            case C0274i.Theme_dialogTheme /*42*/:
                return C1287p.m6444a();
            default:
                return null;
        }
    }

    public static boolean m6275a() {
        return f4281b ? f4282c : "user".equals(Build.TYPE);
    }

    public static boolean m6276a(int i, Activity activity, C0018f c0018f, int i2, OnCancelListener onCancelListener) {
        boolean z = false;
        Dialog b = C1241e.m6283b(i, activity, c0018f, i2, onCancelListener);
        if (b == null) {
            return z;
        }
        try {
            z = activity instanceof C0026g;
        } catch (NoClassDefFoundError e) {
        }
        if (z) {
            C1242f.m6294a(b, onCancelListener).mo900a(((C0026g) activity).m187f(), "GooglePlayServicesErrorDialog");
        } else if (is.m5284a()) {
            C1163a.m5964a(b, onCancelListener).show(activity.getFragmentManager(), "GooglePlayServicesErrorDialog");
        } else {
            throw new RuntimeException("This Activity does not support Fragments.");
        }
        return true;
    }

    public static boolean m6277a(Context context, int i) {
        return C1241e.m6278a(context, i, "com.google.android.gms") && C1241e.m6281a(context.getPackageManager(), "com.google.android.gms");
    }

    public static boolean m6278a(Context context, int i, String str) {
        if (is.m5292h()) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException e) {
                return false;
            }
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        if (str == null || packagesForUid == null) {
            return false;
        }
        for (Object equals : packagesForUid) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m6279a(Context context, String str) {
        if (is.m5295k()) {
            for (SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if (str.equals(appPackageName.getAppPackageName())) {
                    return true;
                }
            }
        }
        try {
            if (context.getPackageManager().getApplicationInfo(str, 8192).enabled) {
                return true;
            }
        } catch (NameNotFoundException e) {
        }
        return false;
    }

    public static boolean m6280a(PackageManager packageManager) {
        synchronized (f4285f) {
            if (f4284e == -1) {
                try {
                    if (C1518k.m6827a().m6829a(packageManager.getPackageInfo("com.google.android.gms", 64), C1517j.f4518b[1]) != null) {
                        f4284e = 1;
                    } else {
                        f4284e = 0;
                    }
                } catch (NameNotFoundException e) {
                    f4284e = 0;
                }
            }
        }
        return f4284e != 0;
    }

    @Deprecated
    public static boolean m6281a(PackageManager packageManager, String str) {
        return C1518k.m6827a().m6831a(packageManager, str);
    }

    private static int m6282b() {
        return 7895000;
    }

    private static Dialog m6283b(int i, Activity activity, C0018f c0018f, int i2, OnCancelListener onCancelListener) {
        Builder builder = null;
        if (i == 0) {
            return null;
        }
        if (ii.m5260a((Context) activity) && i == 2) {
            i = 42;
        }
        if (is.m5288d()) {
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(16843529, typedValue, true);
            if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
                builder = new Builder(activity, 5);
            }
        }
        if (builder == null) {
            builder = new Builder(activity);
        }
        builder.setMessage(C1267i.m6378a(activity, i, C1241e.m6291f(activity)));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Intent a = C1241e.m6274a(i);
        OnClickListener c1268j = c0018f == null ? new C1268j(activity, a, i2) : new C1268j(c0018f, a, i2);
        CharSequence b = C1267i.m6379b(activity, i);
        if (b != null) {
            builder.setPositiveButton(b, c1268j);
        }
        CharSequence a2 = C1267i.m6377a(activity, i);
        if (a2 != null) {
            builder.setTitle(a2);
        }
        return builder.create();
    }

    @Deprecated
    public static void m6284b(Context context) {
        int a = C1241e.m6271a(context);
        if (a != 0) {
            Intent a2 = C1241e.m6274a(a);
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + a);
            if (a2 == null) {
                throw new C1230c(a);
            }
            throw new C1232d(a, "Google Play Services not available", a2);
        }
    }

    @Deprecated
    public static boolean m6285b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 9:
                return true;
            default:
                return false;
        }
    }

    @Deprecated
    public static boolean m6286b(Context context, int i) {
        return i == 18 ? true : i == 1 ? C1241e.m6279a(context, "com.google.android.gms") : false;
    }

    public static boolean m6287b(PackageManager packageManager) {
        return C1241e.m6280a(packageManager) || !C1241e.m6275a();
    }

    @Deprecated
    public static void m6288c(Context context) {
        if (!f4283d.getAndSet(true)) {
            try {
                ((NotificationManager) context.getSystemService("notification")).cancel(10436);
            } catch (SecurityException e) {
            }
        }
    }

    public static Resources m6289d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public static Context m6290e(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public static String m6291f(Context context) {
        Object obj = context.getApplicationInfo().name;
        if (!TextUtils.isEmpty(obj)) {
            return obj;
        }
        ApplicationInfo applicationInfo;
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            applicationInfo = null;
        }
        return applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo).toString() : packageName;
    }

    public static boolean m6292g(Context context) {
        return is.m5295k() && context.getPackageManager().hasSystemFeature("com.google.sidewinder");
    }

    private static void m6293h(Context context) {
        synchronized (f4285f) {
            if (f4286g == null) {
                f4286g = context.getPackageName();
                try {
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f4287h = Integer.valueOf(bundle.getInt("com.google.android.gms.version"));
                    } else {
                        f4287h = null;
                    }
                } catch (Throwable e) {
                    Log.wtf("GooglePlayServicesUtil", "This should never happen.", e);
                }
            } else if (!f4286g.equals(context.getPackageName())) {
                throw new IllegalArgumentException("isGooglePlayServicesAvailable should only be called with Context from your application's package. A previous call used package '" + f4286g + "' and this call used package '" + context.getPackageName() + "'.");
            }
            Integer num = f4287h;
        }
        if (num == null) {
            throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        } else if (num.intValue() != f4280a) {
            throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + f4280a + " but" + " found " + num + ".  You must have the" + " following declaration within the <application> element: " + "    <meta-data android:name=\"" + "com.google.android.gms.version" + "\" android:value=\"@integer/google_play_services_version\" />");
        }
    }
}
