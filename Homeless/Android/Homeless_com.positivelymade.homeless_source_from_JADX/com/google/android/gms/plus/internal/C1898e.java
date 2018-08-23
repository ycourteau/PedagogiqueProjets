package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1898e implements Creator<PlusSession> {
    static void m9520a(PlusSession plusSession, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6505a(parcel, 1, plusSession.m9431b(), false);
        C1295b.m6496a(parcel, 1000, plusSession.m9430a());
        C1295b.m6511a(parcel, 2, plusSession.m9432c(), false);
        C1295b.m6511a(parcel, 3, plusSession.m9433d(), false);
        C1295b.m6511a(parcel, 4, plusSession.m9434e(), false);
        C1295b.m6505a(parcel, 5, plusSession.m9435f(), false);
        C1295b.m6505a(parcel, 6, plusSession.m9436g(), false);
        C1295b.m6505a(parcel, 7, plusSession.m9437h(), false);
        C1295b.m6505a(parcel, 8, plusSession.m9438i(), false);
        C1295b.m6501a(parcel, 9, plusSession.m9439j(), i, false);
        C1295b.m6494a(parcel, a);
    }

    public PlusSession m9521a(Parcel parcel) {
        PlusCommonExtras plusCommonExtras = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str5 = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    str5 = C1294a.m6479m(parcel, a);
                    break;
                case 2:
                    strArr3 = C1294a.m6490x(parcel, a);
                    break;
                case 3:
                    strArr2 = C1294a.m6490x(parcel, a);
                    break;
                case 4:
                    strArr = C1294a.m6490x(parcel, a);
                    break;
                case 5:
                    str4 = C1294a.m6479m(parcel, a);
                    break;
                case 6:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 7:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 8:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 9:
                    plusCommonExtras = (PlusCommonExtras) C1294a.m6462a(parcel, a, PlusCommonExtras.CREATOR);
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
            return new PlusSession(i, str5, strArr3, strArr2, strArr, str4, str3, str2, str, plusCommonExtras);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public PlusSession[] m9522a(int i) {
        return new PlusSession[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9521a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9522a(i);
    }
}
