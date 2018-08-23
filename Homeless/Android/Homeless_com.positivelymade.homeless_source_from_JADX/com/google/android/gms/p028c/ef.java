package com.google.android.gms.p028c;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.ads.internal.overlay.C0608d;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.eg.C0606a;
import com.google.android.gms.p028c.eh.C0920a;
import com.google.android.gms.p029b.C0507c;
import com.google.android.gms.p029b.C0802b;

@fn
public final class ef extends C0507c<eh> {
    private static final ef f2904a = new ef();

    private static final class C0917a extends Exception {
        public C0917a(String str) {
            super(str);
        }
    }

    private ef() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public static eg m4474a(Activity activity) {
        try {
            if (!ef.m4475b(activity)) {
                return f2904a.m4476c(activity);
            }
            C0691b.m3093a("Using AdOverlay from the client jar.");
            return new C0608d(activity);
        } catch (C0917a e) {
            C0691b.m3103e(e.getMessage());
            return null;
        }
    }

    private static boolean m4475b(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            return intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        throw new C0917a("Ad overlay requires the useClientJar flag in intent extras.");
    }

    private eg m4476c(Activity activity) {
        try {
            return C0606a.m2709a(((eh) m2353a(activity)).mo713a(C0802b.m3754a((Object) activity)));
        } catch (Throwable e) {
            C0691b.m3102d("Could not create remote AdOverlay.", e);
            return null;
        } catch (Throwable e2) {
            C0691b.m3102d("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    protected eh m4477a(IBinder iBinder) {
        return C0920a.m4492a(iBinder);
    }

    protected /* synthetic */ Object mo385b(IBinder iBinder) {
        return m4477a(iBinder);
    }
}
