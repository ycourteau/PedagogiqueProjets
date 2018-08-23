package com.google.android.gms.common;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.C1517j.C1308a;
import com.google.android.gms.common.C1517j.ab;

public class C1518k {
    private static final C1518k f4521a = new C1518k();

    private C1518k() {
    }

    public static C1518k m6827a() {
        return f4521a;
    }

    private boolean m6828a(PackageInfo packageInfo, boolean z) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return false;
        }
        C1308a abVar = new ab(packageInfo.signatures[0].toByteArray());
        if ((z ? C1517j.m6823a() : C1517j.m6826b()).contains(abVar)) {
            return true;
        }
        if (Log.isLoggable("GoogleSignatureVerifier", 2)) {
            Log.v("GoogleSignatureVerifier", "Signature not valid.  Found: \n" + Base64.encodeToString(abVar.mo962a(), 0));
        }
        return false;
    }

    C1308a m6829a(PackageInfo packageInfo, C1308a... c1308aArr) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C1308a abVar = new ab(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < c1308aArr.length; i++) {
            if (c1308aArr[i].equals(abVar)) {
                return c1308aArr[i];
            }
        }
        if (Log.isLoggable("GoogleSignatureVerifier", 2)) {
            Log.v("GoogleSignatureVerifier", "Signature not valid.  Found: \n" + Base64.encodeToString(abVar.mo962a(), 0));
        }
        return null;
    }

    public boolean m6830a(PackageManager packageManager, PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (C1241e.m6287b(packageManager)) {
            return m6828a(packageInfo, true);
        }
        boolean a = m6828a(packageInfo, false);
        if (a || !m6828a(packageInfo, true)) {
            return a;
        }
        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        return a;
    }

    public boolean m6831a(PackageManager packageManager, String str) {
        try {
            return m6830a(packageManager, packageManager.getPackageInfo(str, 64));
        } catch (NameNotFoundException e) {
            if (Log.isLoggable("GoogleSignatureVerifier", 3)) {
                Log.d("GoogleSignatureVerifier", "Package manager can't find package " + str + ", defaulting to false");
            }
            return false;
        }
    }
}
