package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0792e implements Creator<Feature> {
    static void m3736a(Feature feature, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, feature.f2282b);
        C1295b.m6496a(parcel, 1000, feature.f2281a);
        C1295b.m6498a(parcel, 2, feature.f2283c, false);
        C1295b.m6494a(parcel, a);
    }

    public Feature m3737a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    bundle = C1294a.m6481o(parcel, a);
                    break;
                case 1000:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Feature(i2, i, bundle);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public Feature[] m3738a(int i) {
        return new Feature[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3737a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3738a(i);
    }
}
