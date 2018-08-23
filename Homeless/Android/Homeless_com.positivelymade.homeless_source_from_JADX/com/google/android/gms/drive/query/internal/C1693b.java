package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class C1693b implements Creator<FieldOnlyFilter> {
    static void m7947a(FieldOnlyFilter fieldOnlyFilter, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1000, fieldOnlyFilter.f5303b);
        C1295b.m6501a(parcel, 1, fieldOnlyFilter.f5302a, i, false);
        C1295b.m6494a(parcel, a);
    }

    public FieldOnlyFilter m7948a(Parcel parcel) {
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
            return new FieldOnlyFilter(i, metadataBundle);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public FieldOnlyFilter[] m7949a(int i) {
        return new FieldOnlyFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7948a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7949a(i);
    }
}
