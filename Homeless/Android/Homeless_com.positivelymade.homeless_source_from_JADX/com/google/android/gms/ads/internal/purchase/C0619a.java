package com.google.android.gms.ads.internal.purchase;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0619a implements Creator<GInAppPurchaseManagerInfoParcel> {
    static void m2817a(GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, gInAppPurchaseManagerInfoParcel.f1714a);
        C1295b.m6499a(parcel, 3, gInAppPurchaseManagerInfoParcel.m2814b(), false);
        C1295b.m6499a(parcel, 4, gInAppPurchaseManagerInfoParcel.m2815c(), false);
        C1295b.m6499a(parcel, 5, gInAppPurchaseManagerInfoParcel.m2816d(), false);
        C1295b.m6499a(parcel, 6, gInAppPurchaseManagerInfoParcel.m2813a(), false);
        C1295b.m6494a(parcel, a);
    }

    public GInAppPurchaseManagerInfoParcel m2818a(Parcel parcel) {
        IBinder iBinder = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 3:
                    iBinder4 = C1294a.m6480n(parcel, a);
                    break;
                case 4:
                    iBinder3 = C1294a.m6480n(parcel, a);
                    break;
                case 5:
                    iBinder2 = C1294a.m6480n(parcel, a);
                    break;
                case 6:
                    iBinder = C1294a.m6480n(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GInAppPurchaseManagerInfoParcel(i, iBinder4, iBinder3, iBinder2, iBinder);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public GInAppPurchaseManagerInfoParcel[] m2819a(int i) {
        return new GInAppPurchaseManagerInfoParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2818a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2819a(i);
    }
}
