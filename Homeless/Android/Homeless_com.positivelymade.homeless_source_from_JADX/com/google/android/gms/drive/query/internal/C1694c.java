package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1694c implements Creator<FieldWithSortOrder> {
    static void m7950a(FieldWithSortOrder fieldWithSortOrder, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1000, fieldWithSortOrder.f5307c);
        C1295b.m6505a(parcel, 1, fieldWithSortOrder.f5305a, false);
        C1295b.m6507a(parcel, 2, fieldWithSortOrder.f5306b);
        C1295b.m6494a(parcel, a);
    }

    public FieldWithSortOrder m7951a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 2:
                    z = C1294a.m6469c(parcel, a);
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
            return new FieldWithSortOrder(i, str, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public FieldWithSortOrder[] m7952a(int i) {
        return new FieldWithSortOrder[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7951a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7952a(i);
    }
}
