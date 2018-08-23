package com.google.android.gms.p028c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.kz.C1124a;
import com.google.android.gms.p032d.aj;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

public class la implements Runnable {
    private final Context f3931a;
    private final kz f3932b;
    private final ky f3933c;
    private final kp f3934d;
    private final ku f3935e;

    public la(Context context, kp kpVar, kz kzVar) {
        this(context, kpVar, kzVar, new ky(), new ku());
    }

    la(Context context, kp kpVar, kz kzVar, ky kyVar, ku kuVar) {
        C1305x.m6617a((Object) context);
        C1305x.m6617a((Object) kzVar);
        this.f3931a = context;
        this.f3934d = kpVar;
        this.f3932b = kzVar;
        this.f3933c = kyVar;
        this.f3935e = kuVar;
    }

    public la(Context context, kp kpVar, kz kzVar, String str) {
        this(context, kpVar, kzVar, new ky(), new ku());
        this.f3935e.m5640a(str);
    }

    void m5673a() {
        String a;
        if (m5675b()) {
            aj.m7041d("NetworkLoader: Starting to load resource from Network.");
            kx a2 = this.f3933c.m5654a();
            try {
                a = this.f3935e.m5639a(this.f3934d.m5581a());
                InputStream a3 = a2.mo838a(a);
                try {
                    OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    io.m5275a(a3, byteArrayOutputStream);
                    this.f3932b.m5564a(byteArrayOutputStream.toByteArray());
                    aj.m7041d("NetworkLoader: Resource loaded.");
                } catch (Throwable e) {
                    aj.m7037a("NetworkLoader: Error when parsing downloaded resources from url: " + a + " " + e.getMessage(), e);
                    this.f3932b.m5563a(C1124a.SERVER_ERROR);
                    a2.mo839a();
                }
            } catch (FileNotFoundException e2) {
                aj.m7036a("NetworkLoader: No data is retrieved from the given url: " + a);
                this.f3932b.m5563a(C1124a.SERVER_ERROR);
            } catch (Throwable e3) {
                aj.m7037a("NetworkLoader: Error when loading resource from url: " + a + " " + e3.getMessage(), e3);
                this.f3932b.m5563a(C1124a.IO_ERROR);
            } finally {
                a2.mo839a();
            }
        } else {
            this.f3932b.m5563a(C1124a.NOT_AVAILABLE);
        }
    }

    boolean m5674a(String str) {
        return this.f3931a.getPackageManager().checkPermission(str, this.f3931a.getPackageName()) == 0;
    }

    boolean m5675b() {
        if (!m5674a("android.permission.INTERNET")) {
            aj.m7036a("Missing android.permission.INTERNET. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.INTERNET\" />");
            return false;
        } else if (m5674a("android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f3931a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
            aj.m7038b("NetworkLoader: No network connectivity - Offline");
            return false;
        } else {
            aj.m7036a("Missing android.permission.ACCESS_NETWORK_STATE. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />");
            return false;
        }
    }

    public void run() {
        m5673a();
    }
}
