package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1897d implements Creator<PlusCommonExtras> {
    static void m9517a(PlusCommonExtras plusCommonExtras, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6505a(parcel, 1, plusCommonExtras.m9428b(), false);
        C1295b.m6496a(parcel, 1000, plusCommonExtras.m9426a());
        C1295b.m6505a(parcel, 2, plusCommonExtras.m9429c(), false);
        C1295b.m6494a(parcel, a);
    }

    public PlusCommonExtras m9518a(Parcel parcel) {
        String str = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 2:
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
            return new PlusCommonExtras(i, str2, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public PlusCommonExtras[] m9519a(int i) {
        return new PlusCommonExtras[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9518a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9519a(i);
    }
}
