package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p028c.en;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p029b.C0799a.C0801a;
import com.google.android.gms.p029b.C0802b;

@fn
public final class GInAppPurchaseManagerInfoParcel implements SafeParcelable {
    public static final C0619a CREATOR = new C0619a();
    public final int f1714a;
    public final C0634k f1715b;
    public final en f1716c;
    public final Context f1717d;
    public final C0498j f1718e;

    GInAppPurchaseManagerInfoParcel(int i, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4) {
        this.f1714a = i;
        this.f1715b = (C0634k) C0802b.m3755a(C0801a.m3753a(iBinder));
        this.f1716c = (en) C0802b.m3755a(C0801a.m3753a(iBinder2));
        this.f1717d = (Context) C0802b.m3755a(C0801a.m3753a(iBinder3));
        this.f1718e = (C0498j) C0802b.m3755a(C0801a.m3753a(iBinder4));
    }

    public GInAppPurchaseManagerInfoParcel(Context context, C0634k c0634k, en enVar, C0498j c0498j) {
        this.f1714a = 2;
        this.f1717d = context;
        this.f1715b = c0634k;
        this.f1716c = enVar;
        this.f1718e = c0498j;
    }

    public static GInAppPurchaseManagerInfoParcel m2811a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            bundleExtra.setClassLoader(GInAppPurchaseManagerInfoParcel.class.getClassLoader());
            return (GInAppPurchaseManagerInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
        } catch (Exception e) {
            return null;
        }
    }

    public static void m2812a(Intent intent, GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", gInAppPurchaseManagerInfoParcel);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    IBinder m2813a() {
        return C0802b.m3754a(this.f1718e).asBinder();
    }

    IBinder m2814b() {
        return C0802b.m3754a(this.f1715b).asBinder();
    }

    IBinder m2815c() {
        return C0802b.m3754a(this.f1716c).asBinder();
    }

    IBinder m2816d() {
        return C0802b.m3754a(this.f1717d).asBinder();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0619a.m2817a(this, parcel, i);
    }
}
