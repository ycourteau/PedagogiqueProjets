package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1697g implements Creator<FullTextSearchFilter> {
    static void m7957a(FullTextSearchFilter fullTextSearchFilter, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1000, fullTextSearchFilter.f5320b);
        C1295b.m6505a(parcel, 1, fullTextSearchFilter.f5319a, false);
        C1295b.m6494a(parcel, a);
    }

    public FullTextSearchFilter m7958a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    str = C1294a.m6479m(parcel, a);
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
            return new FullTextSearchFilter(i, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public FullTextSearchFilter[] m7959a(int i) {
        return new FullTextSearchFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7958a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7959a(i);
    }
}
