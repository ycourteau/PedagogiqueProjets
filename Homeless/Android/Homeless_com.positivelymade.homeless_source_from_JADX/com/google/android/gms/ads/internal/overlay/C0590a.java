package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.fn;

@fn
public class C0590a {
    public boolean m2660a(Context context, AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, C0492n c0492n) {
        if (adLauncherIntentInfoParcel == null) {
            C0691b.m3103e("No intent data for launcher overlay.");
            return false;
        }
        Intent intent = new Intent();
        if (TextUtils.isEmpty(adLauncherIntentInfoParcel.f1588c)) {
            C0691b.m3103e("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(adLauncherIntentInfoParcel.f1589d)) {
            intent.setData(Uri.parse(adLauncherIntentInfoParcel.f1588c));
        } else {
            intent.setDataAndType(Uri.parse(adLauncherIntentInfoParcel.f1588c), adLauncherIntentInfoParcel.f1589d);
        }
        intent.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(adLauncherIntentInfoParcel.f1590e)) {
            intent.setPackage(adLauncherIntentInfoParcel.f1590e);
        }
        if (!TextUtils.isEmpty(adLauncherIntentInfoParcel.f1591f)) {
            String[] split = adLauncherIntentInfoParcel.f1591f.split("/", 2);
            if (split.length < 2) {
                C0691b.m3103e("Could not parse component name from open GMSG: " + adLauncherIntentInfoParcel.f1591f);
                return false;
            }
            intent.setClassName(split[0], split[1]);
        }
        Object obj = adLauncherIntentInfoParcel.f1592g;
        if (!TextUtils.isEmpty(obj)) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(obj);
            } catch (NumberFormatException e) {
                C0691b.m3103e("Could not parse intent flags.");
                parseInt = 0;
            }
            intent.addFlags(parseInt);
        }
        try {
            C0691b.m3101d("Launching an intent: " + intent.toURI());
            context.startActivity(intent);
            if (c0492n != null) {
                c0492n.mo362m();
            }
            return true;
        } catch (ActivityNotFoundException e2) {
            C0691b.m3103e(e2.getMessage());
            return false;
        }
    }
}
