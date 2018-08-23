package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1684f implements Creator<MetadataBundle> {
    static void m7887a(MetadataBundle metadataBundle, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, metadataBundle.f5284a);
        C1295b.m6498a(parcel, 2, metadataBundle.f5285b, false);
        C1295b.m6494a(parcel, a);
    }

    public MetadataBundle m7888a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    bundle = C1294a.m6481o(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MetadataBundle(i, bundle);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public MetadataBundle[] m7889a(int i) {
        return new MetadataBundle[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7888a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7889a(i);
    }
}
