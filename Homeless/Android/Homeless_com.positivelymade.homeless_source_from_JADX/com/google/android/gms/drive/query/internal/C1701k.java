package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1701k implements Creator<MatchAllFilter> {
    static void m7969a(MatchAllFilter matchAllFilter, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1000, matchAllFilter.f5330a);
        C1295b.m6494a(parcel, a);
    }

    public MatchAllFilter m7970a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1000:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MatchAllFilter(i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public MatchAllFilter[] m7971a(int i) {
        return new MatchAllFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7970a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7971a(i);
    }
}
