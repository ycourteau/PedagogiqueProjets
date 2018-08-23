package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

public class C1875b implements Creator<RoomEntity> {
    static void m9290a(RoomEntity roomEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6505a(parcel, 1, roomEntity.mo1589a(), false);
        C1295b.m6496a(parcel, 1000, roomEntity.m9308i());
        C1295b.m6505a(parcel, 2, roomEntity.mo1590b(), false);
        C1295b.m6497a(parcel, 3, roomEntity.mo1591c());
        C1295b.m6496a(parcel, 4, roomEntity.mo1592d());
        C1295b.m6505a(parcel, 5, roomEntity.mo1593e(), false);
        C1295b.m6496a(parcel, 6, roomEntity.mo1594f());
        C1295b.m6498a(parcel, 7, roomEntity.mo1595g(), false);
        C1295b.m6515b(parcel, 8, roomEntity.mo1555j(), false);
        C1295b.m6496a(parcel, 9, roomEntity.mo1596h());
        C1295b.m6494a(parcel, a);
    }

    public RoomEntity mo1587a(Parcel parcel) {
        int i = 0;
        ArrayList arrayList = null;
        int b = C1294a.m6465b(parcel);
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        String str = null;
        int i3 = 0;
        String str2 = null;
        String str3 = null;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 2:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 4:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 5:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 6:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 7:
                    bundle = C1294a.m6481o(parcel, a);
                    break;
                case 8:
                    arrayList = C1294a.m6468c(parcel, a, ParticipantEntity.CREATOR);
                    break;
                case 9:
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
            return new RoomEntity(i4, str3, str2, j, i3, str, i2, bundle, arrayList, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public RoomEntity[] m9292a(int i) {
        return new RoomEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo1587a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9292a(i);
    }
}
