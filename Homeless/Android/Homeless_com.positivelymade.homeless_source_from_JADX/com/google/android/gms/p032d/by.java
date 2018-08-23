package com.google.android.gms.p032d;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;

class by {
    static void m7240a(Context context, String str, String str2, String str3) {
        Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        by.m7241a(edit);
    }

    static void m7241a(final Editor editor) {
        if (VERSION.SDK_INT >= 9) {
            editor.apply();
        } else {
            new Thread(new Runnable() {
                public void run() {
                    editor.commit();
                }
            }).start();
        }
    }
}
