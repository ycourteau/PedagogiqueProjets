package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1724i implements Creator<ValuesAddedDetails> {
    static void m8026a(ValuesAddedDetails valuesAddedDetails, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, valuesAddedDetails.f5411a);
        C1295b.m6496a(parcel, 2, valuesAddedDetails.f5412b);
        C1295b.m6496a(parcel, 3, valuesAddedDetails.f5413c);
        C1295b.m6496a(parcel, 4, valuesAddedDetails.f5414d);
        C1295b.m6505a(parcel, 5, valuesAddedDetails.f5415e, false);
        C1295b.m6496a(parcel, 6, valuesAddedDetails.f5416f);
        C1295b.m6494a(parcel, a);
    }

    public ValuesAddedDetails m8027a(Parcel parcel) {
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
            return new ValuesAddedDetails(i5, i4, i3, i2, str, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ValuesAddedDetails[] m8028a(int i) {
        return new ValuesAddedDetails[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8027a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8028a(i);
    }
}
