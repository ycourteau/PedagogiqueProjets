package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1641f implements Creator<QueryResultEventParcelable> {
    static void m7557a(QueryResultEventParcelable queryResultEventParcelable, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, queryResultEventParcelable.f5086a);
        C1295b.m6501a(parcel, 2, queryResultEventParcelable.f5087b, i, false);
        C1295b.m6507a(parcel, 3, queryResultEventParcelable.f5088c);
        C1295b.m6496a(parcel, 4, queryResultEventParcelable.f5089d);
        C1295b.m6494a(parcel, a);
    }

    public QueryResultEventParcelable m7558a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        DataHolder dataHolder = null;
        boolean z = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            boolean z2;
            DataHolder dataHolder2;
            int e;
            int a = C1294a.m6460a(parcel);
            int i3;
            switch (C1294a.m6459a(a)) {
                case 1:
                    i3 = i;
                    z2 = z;
                    dataHolder2 = dataHolder;
                    e = C1294a.m6471e(parcel, a);
                    a = i3;
                    break;
                case 2:
                    e = i2;
                    boolean z3 = z;
                    dataHolder2 = (DataHolder) C1294a.m6462a(parcel, a, DataHolder.CREATOR);
                    a = i;
                    z2 = z3;
                    break;
                case 3:
                    dataHolder2 = dataHolder;
                    e = i2;
                    i3 = i;
                    z2 = C1294a.m6469c(parcel, a);
                    a = i3;
                    break;
                case 4:
                    a = C1294a.m6471e(parcel, a);
                    z2 = z;
                    dataHolder2 = dataHolder;
                    e = i2;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    a = i;
                    z2 = z;
                    dataHolder2 = dataHolder;
                    e = i2;
                    break;
            }
            i2 = e;
            dataHolder = dataHolder2;
            z = z2;
            i = a;
        }
        if (parcel.dataPosition() == b) {
            return new QueryResultEventParcelable(i2, dataHolder, z, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public QueryResultEventParcelable[] m7559a(int i) {
        return new QueryResultEventParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7558a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7559a(i);
    }
}
