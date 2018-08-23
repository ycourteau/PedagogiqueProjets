package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class C1692a implements Creator<ComparisonFilter> {
    static void m7944a(ComparisonFilter comparisonFilter, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1000, comparisonFilter.f5300c);
        C1295b.m6501a(parcel, 1, comparisonFilter.f5298a, i, false);
        C1295b.m6501a(parcel, 2, comparisonFilter.f5299b, i, false);
        C1295b.m6494a(parcel, a);
    }

    public ComparisonFilter m7945a(Parcel parcel) {
        MetadataBundle metadataBundle = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        Operator operator = null;
        while (parcel.dataPosition() < b) {
            int i2;
            MetadataBundle metadataBundle2;
            Operator operator2;
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i2 = i;
                    Operator operator3 = (Operator) C1294a.m6462a(parcel, a, Operator.CREATOR);
                    metadataBundle2 = metadataBundle;
                    operator2 = operator3;
                    break;
                case 2:
                    metadataBundle2 = (MetadataBundle) C1294a.m6462a(parcel, a, MetadataBundle.CREATOR);
                    operator2 = operator;
                    i2 = i;
                    break;
                case 1000:
                    MetadataBundle metadataBundle3 = metadataBundle;
                    operator2 = operator;
                    i2 = C1294a.m6471e(parcel, a);
                    metadataBundle2 = metadataBundle3;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    metadataBundle2 = metadataBundle;
                    operator2 = operator;
                    i2 = i;
                    break;
            }
            i = i2;
            operator = operator2;
            metadataBundle = metadataBundle2;
        }
        if (parcel.dataPosition() == b) {
            return new ComparisonFilter(i, operator, metadataBundle);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ComparisonFilter[] m7946a(int i) {
        return new ComparisonFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7945a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7946a(i);
    }
}
