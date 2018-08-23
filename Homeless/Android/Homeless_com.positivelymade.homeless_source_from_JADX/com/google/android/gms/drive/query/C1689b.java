package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.List;

public class C1689b implements Creator<SortOrder> {
    static void m7900a(SortOrder sortOrder, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1000, sortOrder.f5297c);
        C1295b.m6515b(parcel, 1, sortOrder.f5295a, false);
        C1295b.m6507a(parcel, 2, sortOrder.f5296b);
        C1295b.m6494a(parcel, a);
    }

    public SortOrder m7901a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        List list = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    list = C1294a.m6468c(parcel, a, FieldWithSortOrder.CREATOR);
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
            return new SortOrder(i, list, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public SortOrder[] m7902a(int i) {
        return new SortOrder[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7901a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7902a(i);
    }
}
