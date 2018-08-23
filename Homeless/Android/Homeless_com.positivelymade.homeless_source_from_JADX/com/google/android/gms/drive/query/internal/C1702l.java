package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1702l implements Creator<NotFilter> {
    static void m7972a(NotFilter notFilter, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1000, notFilter.f5332b);
        C1295b.m6501a(parcel, 1, notFilter.f5331a, i, false);
        C1295b.m6494a(parcel, a);
    }

    public NotFilter m7973a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        FilterHolder filterHolder = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    filterHolder = (FilterHolder) C1294a.m6462a(parcel, a, FilterHolder.CREATOR);
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
            return new NotFilter(i, filterHolder);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public NotFilter[] m7974a(int i) {
        return new NotFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7973a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7974a(i);
    }
}
