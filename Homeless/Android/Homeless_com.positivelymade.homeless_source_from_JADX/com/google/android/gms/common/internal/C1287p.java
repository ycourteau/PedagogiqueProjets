package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;

public class C1287p {
    private static final Uri f4406a = Uri.parse("http://plus.google.com/");
    private static final Uri f4407b = f4406a.buildUpon().appendPath("circles").appendPath("find").build();

    public static Intent m6444a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    public static Intent m6445a(String str) {
        Uri fromParts = Uri.fromParts("package", str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    public static Intent m6446b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(C1287p.m6447c(str));
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    private static Uri m6447c(String str) {
        return Uri.parse("market://details").buildUpon().appendQueryParameter("id", str).build();
    }
}
