package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1721f implements Creator<TextDeletedDetails> {
    static void m8017a(TextDeletedDetails textDeletedDetails, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, textDeletedDetails.f5403a);
        C1295b.m6496a(parcel, 2, textDeletedDetails.f5404b);
        C1295b.m6496a(parcel, 3, textDeletedDetails.f5405c);
        C1295b.m6494a(parcel, a);
    }

    public TextDeletedDetails m8018a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 3:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new TextDeletedDetails(i3, i2, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public TextDeletedDetails[] m8019a(int i) {
        return new TextDeletedDetails[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8018a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8019a(i);
    }
}
