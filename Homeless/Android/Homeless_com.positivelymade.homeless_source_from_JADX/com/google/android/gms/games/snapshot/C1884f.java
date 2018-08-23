package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;

public class C1884f implements Creator<SnapshotMetadataEntity> {
    static void m9416a(SnapshotMetadataEntity snapshotMetadataEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6501a(parcel, 1, snapshotMetadataEntity.mo1605a(), i, false);
        C1295b.m6496a(parcel, 1000, snapshotMetadataEntity.m9386n());
        C1295b.m6501a(parcel, 2, snapshotMetadataEntity.mo1606b(), i, false);
        C1295b.m6505a(parcel, 3, snapshotMetadataEntity.mo1607c(), false);
        C1295b.m6501a(parcel, 5, snapshotMetadataEntity.mo1608d(), i, false);
        C1295b.m6505a(parcel, 6, snapshotMetadataEntity.mo1609e(), false);
        C1295b.m6505a(parcel, 7, snapshotMetadataEntity.mo1612h(), false);
        C1295b.m6505a(parcel, 8, snapshotMetadataEntity.mo1613i(), false);
        C1295b.m6497a(parcel, 9, snapshotMetadataEntity.mo1614j());
        C1295b.m6497a(parcel, 10, snapshotMetadataEntity.mo1615k());
        C1295b.m6495a(parcel, 11, snapshotMetadataEntity.mo1610f());
        C1295b.m6505a(parcel, 12, snapshotMetadataEntity.mo1611g(), false);
        C1295b.m6507a(parcel, 13, snapshotMetadataEntity.mo1616l());
        C1295b.m6497a(parcel, 14, snapshotMetadataEntity.mo1617m());
        C1295b.m6494a(parcel, a);
    }

    public SnapshotMetadataEntity m9417a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        String str = null;
        Uri uri = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        long j2 = 0;
        float f = 0.0f;
        String str5 = null;
        boolean z = false;
        long j3 = 0;
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
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 5:
                    uri = (Uri) C1294a.m6462a(parcel, a, Uri.CREATOR);
                    break;
                case 6:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 7:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 8:
                    str4 = C1294a.m6479m(parcel, a);
                    break;
                case 9:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 10:
                    j2 = C1294a.m6473g(parcel, a);
                    break;
                case 11:
                    f = C1294a.m6476j(parcel, a);
                    break;
                case 12:
                    str5 = C1294a.m6479m(parcel, a);
                    break;
                case 13:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 14:
                    j3 = C1294a.m6473g(parcel, a);
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
            return new SnapshotMetadataEntity(i, gameEntity, playerEntity, str, uri, str2, str3, str4, j, j2, f, str5, z, j3);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public SnapshotMetadataEntity[] m9418a(int i) {
        return new SnapshotMetadataEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9417a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9418a(i);
    }
}
