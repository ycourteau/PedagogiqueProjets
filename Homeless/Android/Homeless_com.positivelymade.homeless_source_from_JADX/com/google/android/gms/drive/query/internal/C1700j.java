package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import java.util.ArrayList;
import java.util.List;

public class C1700j implements Creator<LogicalFilter> {
    static void m7966a(LogicalFilter logicalFilter, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1000, logicalFilter.f5329c);
        C1295b.m6501a(parcel, 1, logicalFilter.f5327a, i, false);
        C1295b.m6515b(parcel, 2, logicalFilter.f5328b, false);
        C1295b.m6494a(parcel, a);
    }

    public LogicalFilter m7967a(Parcel parcel) {
        List list = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        Operator operator = null;
        while (parcel.dataPosition() < b) {
            int i2;
            Operator operator2;
            ArrayList c;
            int a = C1294a.m6460a(parcel);
            List list2;
            switch (C1294a.m6459a(a)) {
                case 1:
                    i2 = i;
                    Operator operator3 = (Operator) C1294a.m6462a(parcel, a, Operator.CREATOR);
                    list2 = list;
                    operator2 = operator3;
                    break;
                case 2:
                    c = C1294a.m6468c(parcel, a, FilterHolder.CREATOR);
                    operator2 = operator;
                    i2 = i;
                    break;
                case 1000:
                    List list3 = list;
                    operator2 = operator;
                    i2 = C1294a.m6471e(parcel, a);
                    list2 = list3;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    c = list;
                    operator2 = operator;
                    i2 = i;
                    break;
            }
            i = i2;
            operator = operator2;
            Object obj = c;
        }
        if (parcel.dataPosition() == b) {
            return new LogicalFilter(i, operator, list);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public LogicalFilter[] m7968a(int i) {
        return new LogicalFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7967a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7968a(i);
    }
}
