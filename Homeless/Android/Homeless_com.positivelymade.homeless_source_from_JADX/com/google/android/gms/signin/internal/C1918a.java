package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1918a implements Creator<AuthAccountResult> {
    static void m9626a(AuthAccountResult authAccountResult, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, authAccountResult.f5879a);
        C1295b.m6494a(parcel, a);
    }

    public AuthAccountResult m9627a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AuthAccountResult(i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public AuthAccountResult[] m9628a(int i) {
        return new AuthAccountResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9627a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9628a(i);
    }
}
