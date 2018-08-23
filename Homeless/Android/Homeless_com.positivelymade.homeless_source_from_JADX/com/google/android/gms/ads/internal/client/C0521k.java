package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0521k implements Creator<AdSizeParcel> {
    static void m2391a(AdSizeParcel adSizeParcel, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, adSizeParcel.f1347a);
        C1295b.m6505a(parcel, 2, adSizeParcel.f1348b, false);
        C1295b.m6496a(parcel, 3, adSizeParcel.f1349c);
        C1295b.m6496a(parcel, 4, adSizeParcel.f1350d);
        C1295b.m6507a(parcel, 5, adSizeParcel.f1351e);
        C1295b.m6496a(parcel, 6, adSizeParcel.f1352f);
        C1295b.m6496a(parcel, 7, adSizeParcel.f1353g);
        C1295b.m6510a(parcel, 8, adSizeParcel.f1354h, i, false);
        C1295b.m6507a(parcel, 9, adSizeParcel.f1355i);
        C1295b.m6494a(parcel, a);
    }

    public AdSizeParcel m2392a(Parcel parcel) {
        AdSizeParcel[] adSizeParcelArr = null;
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i5 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    i4 = C1294a.m6471e(parcel, a);
                    break;
                case 4:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 5:
                    z2 = C1294a.m6469c(parcel, a);
                    break;
                case 6:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 7:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 8:
                    adSizeParcelArr = (AdSizeParcel[]) C1294a.m6467b(parcel, a, AdSizeParcel.CREATOR);
                    break;
                case 9:
                    z = C1294a.m6469c(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AdSizeParcel(i5, str, i4, i3, z2, i2, i, adSizeParcelArr, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public AdSizeParcel[] m2393a(int i) {
        return new AdSizeParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2392a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2393a(i);
    }
}
