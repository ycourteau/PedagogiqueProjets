package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1722g implements Creator<TextInsertedDetails> {
    static void m8020a(TextInsertedDetails textInsertedDetails, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, textInsertedDetails.f5406a);
        C1295b.m6496a(parcel, 2, textInsertedDetails.f5407b);
        C1295b.m6496a(parcel, 3, textInsertedDetails.f5408c);
        C1295b.m6494a(parcel, a);
    }

    public TextInsertedDetails m8021a(Parcel parcel) {
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
            return new TextInsertedDetails(i3, i2, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public TextInsertedDetails[] m8022a(int i) {
        return new TextInsertedDetails[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8021a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8022a(i);
    }
}
