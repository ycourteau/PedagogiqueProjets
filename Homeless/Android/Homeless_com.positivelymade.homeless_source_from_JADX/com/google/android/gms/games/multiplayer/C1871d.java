package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.games.PlayerEntity;

public class C1871d implements Creator<ParticipantEntity> {
    static void m9250a(ParticipantEntity participantEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6505a(parcel, 1, participantEntity.mo1584j(), false);
        C1295b.m6496a(parcel, 1000, participantEntity.m9272m());
        C1295b.m6505a(parcel, 2, participantEntity.mo1579e(), false);
        C1295b.m6501a(parcel, 3, participantEntity.mo1580f(), i, false);
        C1295b.m6501a(parcel, 4, participantEntity.mo1582h(), i, false);
        C1295b.m6496a(parcel, 5, participantEntity.mo1575a());
        C1295b.m6505a(parcel, 6, participantEntity.mo1576b(), false);
        C1295b.m6507a(parcel, 7, participantEntity.mo1578d());
        C1295b.m6501a(parcel, 8, participantEntity.mo1585k(), i, false);
        C1295b.m6496a(parcel, 9, participantEntity.mo1577c());
        C1295b.m6501a(parcel, 10, participantEntity.mo1586l(), i, false);
        C1295b.m6505a(parcel, 11, participantEntity.mo1581g(), false);
        C1295b.m6505a(parcel, 12, participantEntity.mo1583i(), false);
        C1295b.m6494a(parcel, a);
    }

    public ParticipantEntity mo1573a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        int i2 = 0;
        String str3 = null;
        boolean z = false;
        PlayerEntity playerEntity = null;
        int i3 = 0;
        ParticipantResult participantResult = null;
        String str4 = null;
        String str5 = null;
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
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 6:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 7:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 8:
                    playerEntity = (PlayerEntity) C1294a.m6462a(parcel, a, PlayerEntity.CREATOR);
                    break;
                case 9:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 10:
                    participantResult = (ParticipantResult) C1294a.m6462a(parcel, a, ParticipantResult.CREATOR);
                    break;
                case 11:
                    str4 = C1294a.m6479m(parcel, a);
                    break;
                case 12:
                    str5 = C1294a.m6479m(parcel, a);
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
            return new ParticipantEntity(i, str, str2, uri, uri2, i2, str3, z, playerEntity, i3, participantResult, str4, str5);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ParticipantEntity[] m9252a(int i) {
        return new ParticipantEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo1573a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9252a(i);
    }
}
