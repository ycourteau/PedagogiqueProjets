package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1634d implements Creator<ChangeSequenceNumber> {
    static void m7535a(ChangeSequenceNumber changeSequenceNumber, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, changeSequenceNumber.f5006a);
        C1295b.m6497a(parcel, 2, changeSequenceNumber.f5007b);
        C1295b.m6497a(parcel, 3, changeSequenceNumber.f5008c);
        C1295b.m6497a(parcel, 4, changeSequenceNumber.f5009d);
        C1295b.m6494a(parcel, a);
    }

    public ChangeSequenceNumber m7536a(Parcel parcel) {
        long j = 0;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    j3 = C1294a.m6473g(parcel, a);
                    break;
                case 3:
                    j2 = C1294a.m6473g(parcel, a);
                    break;
                case 4:
                    j = C1294a.m6473g(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ChangeSequenceNumber(i, j3, j2, j);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ChangeSequenceNumber[] m7537a(int i) {
        return new ChangeSequenceNumber[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7536a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7537a(i);
    }
}
