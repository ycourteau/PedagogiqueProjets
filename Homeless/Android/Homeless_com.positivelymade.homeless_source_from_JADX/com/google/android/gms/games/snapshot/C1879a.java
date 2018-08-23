package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.Contents;

public class C1879a implements Creator<SnapshotContentsEntity> {
    static void m9401a(SnapshotContentsEntity snapshotContentsEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6501a(parcel, 1, snapshotContentsEntity.mo1597a(), i, false);
        C1295b.m6496a(parcel, 1000, snapshotContentsEntity.m9342e());
        C1295b.m6494a(parcel, a);
    }

    public SnapshotContentsEntity m9402a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        Contents contents = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    contents = (Contents) C1294a.m6462a(parcel, a, Contents.CREATOR);
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
            return new SnapshotContentsEntity(i, contents);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public SnapshotContentsEntity[] m9403a(int i) {
        return new SnapshotContentsEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9402a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9403a(i);
    }
}
