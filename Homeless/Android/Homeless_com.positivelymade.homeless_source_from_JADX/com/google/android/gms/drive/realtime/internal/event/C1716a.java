package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1716a implements Creator<FieldChangedDetails> {
    static void m8002a(FieldChangedDetails fieldChangedDetails, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, fieldChangedDetails.f5369a);
        C1295b.m6496a(parcel, 2, fieldChangedDetails.f5370b);
        C1295b.m6494a(parcel, a);
    }

    public FieldChangedDetails m8003a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FieldChangedDetails(i2, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public FieldChangedDetails[] m8004a(int i) {
        return new FieldChangedDetails[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8003a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8004a(i);
    }
}
