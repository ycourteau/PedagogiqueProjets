package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1725j implements Creator<ValuesRemovedDetails> {
    static void m8029a(ValuesRemovedDetails valuesRemovedDetails, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, valuesRemovedDetails.f5417a);
        C1295b.m6496a(parcel, 2, valuesRemovedDetails.f5418b);
        C1295b.m6496a(parcel, 3, valuesRemovedDetails.f5419c);
        C1295b.m6496a(parcel, 4, valuesRemovedDetails.f5420d);
        C1295b.m6505a(parcel, 5, valuesRemovedDetails.f5421e, false);
        C1295b.m6496a(parcel, 6, valuesRemovedDetails.f5422f);
        C1295b.m6494a(parcel, a);
    }

    public ValuesRemovedDetails m8030a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        String str = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i5 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    i4 = C1294a.m6471e(parcel, a);
                    break;
                case 3:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 4:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 5:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 6:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ValuesRemovedDetails(i5, i4, i3, i2, str, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ValuesRemovedDetails[] m8031a(int i) {
        return new ValuesRemovedDetails[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8030a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8031a(i);
    }
}
