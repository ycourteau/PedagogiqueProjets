package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0571h implements Creator<NativeAdOptionsParcel> {
    static void m2557a(NativeAdOptionsParcel nativeAdOptionsParcel, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, nativeAdOptionsParcel.f1472a);
        C1295b.m6507a(parcel, 2, nativeAdOptionsParcel.f1473b);
        C1295b.m6496a(parcel, 3, nativeAdOptionsParcel.f1474c);
        C1295b.m6507a(parcel, 4, nativeAdOptionsParcel.f1475d);
        C1295b.m6494a(parcel, a);
    }

    public NativeAdOptionsParcel m2558a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    z2 = C1294a.m6469c(parcel, a);
                    break;
                case 3:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 4:
                    z = C1294a.m6469c(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new NativeAdOptionsParcel(i2, z2, i, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public NativeAdOptionsParcel[] m2559a(int i) {
        return new NativeAdOptionsParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2558a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2559a(i);
    }
}
