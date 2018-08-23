package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1726k implements Creator<ValuesSetDetails> {
    static void m8032a(ValuesSetDetails valuesSetDetails, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, valuesSetDetails.f5423a);
        C1295b.m6496a(parcel, 2, valuesSetDetails.f5424b);
        C1295b.m6496a(parcel, 3, valuesSetDetails.f5425c);
        C1295b.m6496a(parcel, 4, valuesSetDetails.f5426d);
        C1295b.m6494a(parcel, a);
    }

    public ValuesSetDetails m8033a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i4 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 3:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 4:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ValuesSetDetails(i4, i3, i2, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ValuesSetDetails[] m8034a(int i) {
        return new ValuesSetDetails[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8033a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8034a(i);
    }
}
