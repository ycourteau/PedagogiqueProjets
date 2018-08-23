package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class C1699i implements Creator<InFilter> {
    static void m7963a(InFilter inFilter, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1000, inFilter.f5325b);
        C1295b.m6501a(parcel, 1, inFilter.f5324a, i, false);
        C1295b.m6494a(parcel, a);
    }

    public InFilter m7964a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        MetadataBundle metadataBundle = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    metadataBundle = (MetadataBundle) C1294a.m6462a(parcel, a, MetadataBundle.CREATOR);
                    break;
                case 1000:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new InFilter(i, metadataBundle);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public InFilter[] m7965a(int i) {
        return new InFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7964a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7965a(i);
    }
}
