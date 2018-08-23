package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0680n implements Creator<StringParcel> {
    static void m3046a(StringParcel stringParcel, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, stringParcel.f1900a);
        C1295b.m6505a(parcel, 2, stringParcel.f1901b, false);
        C1295b.m6494a(parcel, a);
    }

    public StringParcel m3047a(Parcel parcel) {
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
            return new StringParcel(i, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public StringParcel[] m3048a(int i) {
        return new StringParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3047a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3048a(i);
    }
}
