package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

public class C1869a implements Creator<InvitationEntity> {
    static void m9219a(InvitationEntity invitationEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6501a(parcel, 1, invitationEntity.mo1548c(), i, false);
        C1295b.m6496a(parcel, 1000, invitationEntity.m9237k());
        C1295b.m6505a(parcel, 2, invitationEntity.mo1549d(), false);
        C1295b.m6497a(parcel, 3, invitationEntity.mo1551f());
        C1295b.m6496a(parcel, 4, invitationEntity.mo1552g());
        C1295b.m6501a(parcel, 5, invitationEntity.mo1550e(), i, false);
        C1295b.m6515b(parcel, 6, invitationEntity.mo1555j(), false);
        C1295b.m6496a(parcel, 7, invitationEntity.mo1553h());
        C1295b.m6496a(parcel, 8, invitationEntity.mo1554i());
        C1295b.m6494a(parcel, a);
    }

    public InvitationEntity mo1571a(Parcel parcel) {
        ArrayList arrayList = null;
        int i = 0;
        int b = C1294a.m6465b(parcel);
        long j = 0;
        int i2 = 0;
        ParticipantEntity participantEntity = null;
        int i3 = 0;
        String str = null;
        GameEntity gameEntity = null;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    gameEntity = (GameEntity) C1294a.m6462a(parcel, a, GameEntity.CREATOR);
                    break;
                case 2:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 4:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 5:
                    participantEntity = (ParticipantEntity) C1294a.m6462a(parcel, a, ParticipantEntity.CREATOR);
                    break;
                case 6:
                    arrayList = C1294a.m6468c(parcel, a, ParticipantEntity.CREATOR);
                    break;
                case 7:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 8:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 1000:
                    i4 = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new InvitationEntity(i4, gameEntity, str, j, i3, participantEntity, arrayList, i2, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public InvitationEntity[] m9221a(int i) {
        return new InvitationEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo1571a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9221a(i);
    }
}
