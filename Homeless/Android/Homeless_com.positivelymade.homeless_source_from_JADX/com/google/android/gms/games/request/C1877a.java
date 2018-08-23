package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import java.util.ArrayList;

public class C1877a implements Creator<GameRequestEntity> {
    static void m9326a(GameRequestEntity gameRequestEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6501a(parcel, 1, gameRequestEntity.mo1564d(), i, false);
        C1295b.m6496a(parcel, 1000, gameRequestEntity.m9314a());
        C1295b.m6501a(parcel, 2, gameRequestEntity.mo1565e(), i, false);
        C1295b.m6508a(parcel, 3, gameRequestEntity.mo1566g(), false);
        C1295b.m6505a(parcel, 4, gameRequestEntity.mo1563c(), false);
        C1295b.m6515b(parcel, 5, gameRequestEntity.mo1570k(), false);
        C1295b.m6496a(parcel, 7, gameRequestEntity.mo1567h());
        C1295b.m6497a(parcel, 9, gameRequestEntity.mo1568i());
        C1295b.m6497a(parcel, 10, gameRequestEntity.mo1569j());
        C1295b.m6498a(parcel, 11, gameRequestEntity.m9320f(), false);
        C1295b.m6496a(parcel, 12, gameRequestEntity.m9316b());
        C1295b.m6494a(parcel, a);
    }

    public GameRequestEntity m9327a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        byte[] bArr = null;
        String str = null;
        ArrayList arrayList = null;
        int i2 = 0;
        long j = 0;
        long j2 = 0;
        Bundle bundle = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    gameEntity = (GameEntity) C1294a.m6462a(parcel, a, GameEntity.CREATOR);
                    break;
                case 2:
                    playerEntity = (PlayerEntity) C1294a.m6462a(parcel, a, PlayerEntity.CREATOR);
                    break;
                case 3:
                    bArr = C1294a.m6482p(parcel, a);
                    break;
                case 4:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 5:
                    arrayList = C1294a.m6468c(parcel, a, PlayerEntity.CREATOR);
                    break;
                case 7:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 9:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 10:
                    j2 = C1294a.m6473g(parcel, a);
                    break;
                case 11:
                    bundle = C1294a.m6481o(parcel, a);
                    break;
                case 12:
                    i3 = C1294a.m6471e(parcel, a);
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
            return new GameRequestEntity(i, gameEntity, playerEntity, bArr, str, arrayList, i2, j, j2, bundle, i3);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public GameRequestEntity[] m9328a(int i) {
        return new GameRequestEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9327a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9328a(i);
    }
}
