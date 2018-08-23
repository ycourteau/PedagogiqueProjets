package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1787h implements Creator<PlayerLevelInfo> {
    static void m8399a(PlayerLevelInfo playerLevelInfo, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6497a(parcel, 1, playerLevelInfo.m8318b());
        C1295b.m6496a(parcel, 1000, playerLevelInfo.m8317a());
        C1295b.m6497a(parcel, 2, playerLevelInfo.m8319c());
        C1295b.m6501a(parcel, 3, playerLevelInfo.m8320d(), i, false);
        C1295b.m6501a(parcel, 4, playerLevelInfo.m8321e(), i, false);
        C1295b.m6494a(parcel, a);
    }

    public PlayerLevelInfo m8400a(Parcel parcel) {
        long j = 0;
        PlayerLevel playerLevel = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        PlayerLevel playerLevel2 = null;
        long j2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    j2 = C1294a.m6473g(parcel, a);
                    break;
                case 2:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 3:
                    playerLevel2 = (PlayerLevel) C1294a.m6462a(parcel, a, PlayerLevel.CREATOR);
                    break;
                case 4:
                    playerLevel = (PlayerLevel) C1294a.m6462a(parcel, a, PlayerLevel.CREATOR);
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
            return new PlayerLevelInfo(i, j2, j, playerLevel2, playerLevel);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public PlayerLevelInfo[] m8401a(int i) {
        return new PlayerLevelInfo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8400a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8401a(i);
    }
}
