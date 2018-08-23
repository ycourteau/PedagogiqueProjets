package com.google.android.gms.ads.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.ep;
import com.google.android.gms.p028c.eu;

public class InAppPurchaseActivity extends Activity {
    private ep f1981a;

    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            if (this.f1981a != null) {
                this.f1981a.mo492a(i, i2, intent);
            }
        } catch (Throwable e) {
            C0691b.m3102d("Could not forward onActivityResult to in-app purchase manager:", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1981a = eu.m4524a((Activity) this);
        if (this.f1981a == null) {
            C0691b.m3103e("Could not create in-app purchase manager.");
            finish();
            return;
        }
        try {
            this.f1981a.mo491a();
        } catch (Throwable e) {
            C0691b.m3102d("Could not forward onCreate to in-app purchase manager:", e);
            finish();
        }
    }

    protected void onDestroy() {
        try {
            if (this.f1981a != null) {
                this.f1981a.mo493b();
            }
        } catch (Throwable e) {
            C0691b.m3102d("Could not forward onDestroy to in-app purchase manager:", e);
        }
        super.onDestroy();
    }
}
