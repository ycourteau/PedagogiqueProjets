package android.support.v4.app;

import android.app.Activity;
import android.os.Build.VERSION;
import android.support.v4.p000a.C0000a;

public class C0007a extends C0000a {
    public static void m27a(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            C0008b.m28a(activity);
        } else {
            activity.finish();
        }
    }
}
