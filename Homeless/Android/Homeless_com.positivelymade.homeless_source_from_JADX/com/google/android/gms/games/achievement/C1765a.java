package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.games.PlayerEntity;

public class C1765a implements Creator<AchievementEntity> {
    static void m8370a(AchievementEntity achievementEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6505a(parcel, 1, achievementEntity.mo1241a(), false);
        C1295b.m6496a(parcel, 2, achievementEntity.mo1242b());
        C1295b.m6505a(parcel, 3, achievementEntity.mo1243c(), false);
        C1295b.m6505a(parcel, 4, achievementEntity.mo1244d(), false);
        C1295b.m6501a(parcel, 5, achievementEntity.m8362l(), i, false);
        C1295b.m6505a(parcel, 6, achievementEntity.m8363m(), false);
        C1295b.m6501a(parcel, 7, achievementEntity.m8364n(), i, false);
        C1295b.m6505a(parcel, 8, achievementEntity.m8365o(), false);
        C1295b.m6496a(parcel, 9, achievementEntity.m8366p());
        C1295b.m6505a(parcel, 10, achievementEntity.m8367q(), false);
        C1295b.m6501a(parcel, 11, achievementEntity.mo1246f(), i, false);
        C1295b.m6496a(parcel, 12, achievementEntity.mo1247g());
        C1295b.m6496a(parcel, 13, achievementEntity.m8368r());
        C1295b.m6505a(parcel, 14, achievementEntity.m8369s(), false);
        C1295b.m6497a(parcel, 15, achievementEntity.mo1249i());
        C1295b.m6497a(parcel, 16, achievementEntity.mo1250j());
        C1295b.m6496a(parcel, 1000, achievementEntity.m8361k());
        C1295b.m6494a(parcel, a);
    }

    public AchievementEntity m8371a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        Uri uri2 = null;
        String str5 = null;
        int i3 = 0;
        String str6 = null;
        PlayerEntity playerEntity = null;
        int i4 = 0;
        int i5 = 0;
        String str7 = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 2:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 3:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 4:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 5:
                    uri = (Uri) C1294a.m6462a(parcel, a, Uri.CREATOR);
                    break;
                case 6:
                    str4 = C1294a.m6479m(parcel, a);
                    break;
                case 7:
                    uri2 = (Uri) C1294a.m6462a(parcel, a, Uri.CREATOR);
                    break;
                case 8:
                    str5 = C1294a.m6479m(parcel, a);
                    break;
                case 9:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 10:
                    str6 = C1294a.m6479m(parcel, a);
                    break;
                case 11:
                    playerEntity = (PlayerEntity) C1294a.m6462a(parcel, a, PlayerEntity.CREATOR);
                    break;
                case 12:
                    i4 = C1294a.m6471e(parcel, a);
                    break;
                case 13:
                    i5 = C1294a.m6471e(parcel, a);
                    break;
                case 14:
                    str7 = C1294a.m6479m(parcel, a);
                    break;
                case 15:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 16:
                    j2 = C1294a.m6473g(parcel, a);
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
            return new AchievementEntity(i, str, i2, str2, str3, uri, str4, uri2, str5, i3, str6, playerEntity, i4, i5, str7, j, j2);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public AchievementEntity[] m8372a(int i) {
        return new AchievementEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m8371a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8372a(i);
    }
}
