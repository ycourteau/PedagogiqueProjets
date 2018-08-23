package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

public class C1762f implements Creator<PlayerEntity> {
    static void m8288a(PlayerEntity playerEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6505a(parcel, 1, playerEntity.mo1227a(), false);
        C1295b.m6505a(parcel, 2, playerEntity.mo1228b(), false);
        C1295b.m6501a(parcel, 3, playerEntity.mo1230d(), i, false);
        C1295b.m6501a(parcel, 4, playerEntity.mo1232f(), i, false);
        C1295b.m6497a(parcel, 5, playerEntity.mo1234h());
        C1295b.m6496a(parcel, 6, playerEntity.mo1236j());
        C1295b.m6497a(parcel, 7, playerEntity.mo1235i());
        C1295b.m6505a(parcel, 8, playerEntity.mo1231e(), false);
        C1295b.m6505a(parcel, 9, playerEntity.mo1233g(), false);
        C1295b.m6505a(parcel, 14, playerEntity.mo1238l(), false);
        C1295b.m6501a(parcel, 15, playerEntity.mo1240n(), i, false);
        C1295b.m6501a(parcel, 16, playerEntity.mo1239m(), i, false);
        C1295b.m6496a(parcel, 1000, playerEntity.m8312o());
        C1295b.m6507a(parcel, 19, playerEntity.mo1229c());
        C1295b.m6507a(parcel, 18, playerEntity.mo1237k());
        C1295b.m6494a(parcel, a);
    }

    public PlayerEntity mo1225a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        long j = 0;
        int i2 = 0;
        long j2 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        PlayerLevelInfo playerLevelInfo = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 2:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    uri = (Uri) C1294a.m6462a(parcel, a, Uri.CREATOR);
                    break;
                case 4:
                    uri2 = (Uri) C1294a.m6462a(parcel, a, Uri.CREATOR);
                    break;
                case 5:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 6:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 7:
                    j2 = C1294a.m6473g(parcel, a);
                    break;
                case 8:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 9:
                    str4 = C1294a.m6479m(parcel, a);
                    break;
                case 14:
                    str5 = C1294a.m6479m(parcel, a);
                    break;
                case 15:
                    mostRecentGameInfoEntity = (MostRecentGameInfoEntity) C1294a.m6462a(parcel, a, (Creator) MostRecentGameInfoEntity.CREATOR);
                    break;
                case 16:
                    playerLevelInfo = (PlayerLevelInfo) C1294a.m6462a(parcel, a, PlayerLevelInfo.CREATOR);
                    break;
                case 18:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 19:
                    z2 = C1294a.m6469c(parcel, a);
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
            return new PlayerEntity(i, str, str2, uri, uri2, j, i2, j2, str3, str4, str5, mostRecentGameInfoEntity, playerLevelInfo, z, z2);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public PlayerEntity[] m8290a(int i) {
        return new PlayerEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo1225a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8290a(i);
    }
}
