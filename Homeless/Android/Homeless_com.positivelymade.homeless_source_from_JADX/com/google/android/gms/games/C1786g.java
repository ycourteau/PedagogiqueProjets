package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1786g implements Creator<PlayerLevel> {
    static void m8396a(PlayerLevel playerLevel, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, playerLevel.m8314b());
        C1295b.m6496a(parcel, 1000, playerLevel.m8313a());
        C1295b.m6497a(parcel, 2, playerLevel.m8315c());
        C1295b.m6497a(parcel, 3, playerLevel.m8316d());
        C1295b.m6494a(parcel, a);
    }

    public PlayerLevel m8397a(Parcel parcel) {
        long j = 0;
        int i = 0;
        int b = C1294a.m6465b(parcel);
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    j2 = C1294a.m6473g(parcel, a);
                    break;
                case 3:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 1000:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlayerLevel(i2, i, j2, j);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public PlayerLevel[] m8398a(int i) {
        return new PlayerLevel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8397a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8398a(i);
    }
}
