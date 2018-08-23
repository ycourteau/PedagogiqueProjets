package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class C1698h implements Creator<HasFilter> {
    static void m7960a(HasFilter hasFilter, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1000, hasFilter.f5322b);
        C1295b.m6501a(parcel, 1, hasFilter.f5321a, i, false);
        C1295b.m6494a(parcel, a);
    }

    public HasFilter m7961a(Parcel parcel) {
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
            return new HasFilter(i, metadataBundle);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public HasFilter[] m7962a(int i) {
        return new HasFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7961a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7962a(i);
    }
}
