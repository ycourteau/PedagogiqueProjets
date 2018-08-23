package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1880b implements Creator<SnapshotEntity> {
    static void m9404a(SnapshotEntity snapshotEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6501a(parcel, 1, snapshotEntity.mo1602a(), i, false);
        C1295b.m6496a(parcel, 1000, snapshotEntity.m9349c());
        C1295b.m6501a(parcel, 3, snapshotEntity.mo1603b(), i, false);
        C1295b.m6494a(parcel, a);
    }

    public SnapshotEntity m9405a(Parcel parcel) {
        SnapshotContentsEntity snapshotContentsEntity = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        SnapshotMetadata snapshotMetadata = null;
        while (parcel.dataPosition() < b) {
            int i2;
            SnapshotContentsEntity snapshotContentsEntity2;
            SnapshotMetadata snapshotMetadata2;
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i2 = i;
                    SnapshotMetadataEntity snapshotMetadataEntity = (SnapshotMetadataEntity) C1294a.m6462a(parcel, a, SnapshotMetadataEntity.CREATOR);
                    snapshotContentsEntity2 = snapshotContentsEntity;
                    Object obj = snapshotMetadataEntity;
                    break;
                case 3:
                    snapshotContentsEntity2 = (SnapshotContentsEntity) C1294a.m6462a(parcel, a, SnapshotContentsEntity.CREATOR);
                    snapshotMetadata2 = snapshotMetadata;
                    i2 = i;
                    break;
                case 1000:
                    SnapshotContentsEntity snapshotContentsEntity3 = snapshotContentsEntity;
                    snapshotMetadata2 = snapshotMetadata;
                    i2 = C1294a.m6471e(parcel, a);
                    snapshotContentsEntity2 = snapshotContentsEntity3;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    snapshotContentsEntity2 = snapshotContentsEntity;
                    snapshotMetadata2 = snapshotMetadata;
                    i2 = i;
                    break;
            }
            i = i2;
            snapshotMetadata = snapshotMetadata2;
            snapshotContentsEntity = snapshotContentsEntity2;
        }
        if (parcel.dataPosition() == b) {
            return new SnapshotEntity(i, snapshotMetadata, snapshotContentsEntity);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public SnapshotEntity[] m9406a(int i) {
        return new SnapshotEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9405a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9406a(i);
    }
}
