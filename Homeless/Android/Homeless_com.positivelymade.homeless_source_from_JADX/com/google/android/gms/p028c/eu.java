package com.google.android.gms.p028c;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.ads.internal.purchase.C0626e;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.ep.C0625a;
import com.google.android.gms.p028c.eq.C0928a;
import com.google.android.gms.p029b.C0507c;
import com.google.android.gms.p029b.C0802b;

@fn
public final class eu extends C0507c<eq> {
    private static final eu f2922a = new eu();

    private static final class C0932a extends Exception {
        public C0932a(String str) {
            super(str);
        }
    }

    private eu() {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    public static ep m4524a(Activity activity) {
        try {
            if (!eu.m4525b(activity)) {
                return f2922a.m4526c(activity);
            }
            C0691b.m3093a("Using AdOverlay from the client jar.");
            return new C0626e(activity);
        } catch (C0932a e) {
            C0691b.m3103e(e.getMessage());
            return null;
        }
    }

    private static boolean m4525b(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar")) {
            return intent.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false);
        }
        throw new C0932a("InAppPurchaseManager requires the useClientJar flag in intent extras.");
    }

    private ep m4526c(Activity activity) {
        try {
            return C0625a.m2854a(((eq) m2353a(activity)).mo718a(C0802b.m3754a((Object) activity)));
        } catch (Throwable e) {
            C0691b.m3102d("Could not create remote InAppPurchaseManager.", e);
            return null;
        } catch (Throwable e2) {
            C0691b.m3102d("Could not create remote InAppPurchaseManager.", e2);
            return null;
        }
    }

    protected eq m4527a(IBinder iBinder) {
        return C0928a.m4512a(iBinder);
    }

    protected /* synthetic */ Object mo385b(IBinder iBinder) {
        return m4527a(iBinder);
    }
}
