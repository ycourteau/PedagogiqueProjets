package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.gf;
import org.json.JSONException;
import org.json.JSONObject;

@fn
public class C0633i {
    public int m2879a(Intent intent) {
        if (intent == null) {
            return 5;
        }
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            C0691b.m3103e("Intent with no response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            C0691b.m3103e("Unexpected type for intent response code. " + obj.getClass().getName());
            return 5;
        }
    }

    public int m2880a(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            C0691b.m3103e("Bundle with null response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            C0691b.m3103e("Unexpected type for intent response code. " + obj.getClass().getName());
            return 5;
        }
    }

    public String m2881a(String str) {
        String str2 = null;
        if (str != null) {
            try {
                str2 = new JSONObject(str).getString("developerPayload");
            } catch (JSONException e) {
                C0691b.m3103e("Fail to parse purchase data");
            }
        }
        return str2;
    }

    public void m2882a(final Context context) {
        ServiceConnection c06321 = new ServiceConnection(this) {
            final /* synthetic */ C0633i f1764b;

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                boolean z = false;
                C0620b c0620b = new C0620b(context.getApplicationContext(), false);
                c0620b.m2824a(iBinder);
                int a = c0620b.m2820a(3, context.getPackageName(), "inapp");
                gf h = C0618p.m2799h();
                if (a == 0) {
                    z = true;
                }
                h.m4784b(z);
                context.unbindService(this);
                c0620b.m2823a();
            }

            public void onServiceDisconnected(ComponentName componentName) {
            }
        };
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        context.bindService(intent, c06321, 1);
    }

    public void m2883a(Context context, boolean z, GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.purchase.InAppPurchaseActivity");
        intent.putExtra("com.google.android.gms.ads.internal.purchase.useClientJar", z);
        GInAppPurchaseManagerInfoParcel.m2812a(intent, gInAppPurchaseManagerInfoParcel);
        context.startActivity(intent);
    }

    public String m2884b(Intent intent) {
        return intent == null ? null : intent.getStringExtra("INAPP_PURCHASE_DATA");
    }

    public String m2885b(String str) {
        String str2 = null;
        if (str != null) {
            try {
                str2 = new JSONObject(str).getString("purchaseToken");
            } catch (JSONException e) {
                C0691b.m3103e("Fail to parse purchase data");
            }
        }
        return str2;
    }

    public String m2886c(Intent intent) {
        return intent == null ? null : intent.getStringExtra("INAPP_DATA_SIGNATURE");
    }
}
