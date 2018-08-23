package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0662i implements Creator<CapabilityParcel> {
    static void m3011a(CapabilityParcel capabilityParcel, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, capabilityParcel.f1890a);
        C1295b.m6507a(parcel, 2, capabilityParcel.f1891b);
        C1295b.m6507a(parcel, 3, capabilityParcel.f1892c);
        C1295b.m6494a(parcel, a);
    }

    public CapabilityParcel m3012a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    z2 = C1294a.m6469c(parcel, a);
                    break;
                case 3:
                    z = C1294a.m6469c(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CapabilityParcel(i, z2, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public CapabilityParcel[] m3013a(int i) {
        return new CapabilityParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3012a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3013a(i);
    }
}
