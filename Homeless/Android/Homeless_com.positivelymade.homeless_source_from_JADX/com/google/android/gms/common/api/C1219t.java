package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1219t implements Creator<Scope> {
    static void m6170a(Scope scope, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, scope.f4092a);
        C1295b.m6505a(parcel, 2, scope.m5965a(), false);
        C1295b.m6494a(parcel, a);
    }

    public Scope m6171a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    str = C1294a.m6479m(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Scope(i, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public Scope[] m6172a(int i) {
        return new Scope[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6171a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6172a(i);
    }
}
