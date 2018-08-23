package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1883e implements Creator<SnapshotMetadataChangeEntity> {
    static void m9413a(SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6505a(parcel, 1, snapshotMetadataChangeEntity.m9366c(), false);
        C1295b.m6496a(parcel, 1000, snapshotMetadataChangeEntity.m9365b());
        C1295b.m6504a(parcel, 2, snapshotMetadataChangeEntity.m9367d(), false);
        C1295b.m6501a(parcel, 4, snapshotMetadataChangeEntity.m9369f(), i, false);
        C1295b.m6501a(parcel, 5, snapshotMetadataChangeEntity.mo1604a(), i, false);
        C1295b.m6504a(parcel, 6, snapshotMetadataChangeEntity.m9368e(), false);
        C1295b.m6494a(parcel, a);
    }

    public SnapshotMetadataChangeEntity m9414a(Parcel parcel) {
        Long l = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        Uri uri = null;
        BitmapTeleporter bitmapTeleporter = null;
        Long l2 = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 2:
                    l2 = C1294a.m6474h(parcel, a);
                    break;
                case 4:
                    uri = (Uri) C1294a.m6462a(parcel, a, Uri.CREATOR);
                    break;
                case 5:
                    bitmapTeleporter = (BitmapTeleporter) C1294a.m6462a(parcel, a, BitmapTeleporter.CREATOR);
                    break;
                case 6:
                    l = C1294a.m6474h(parcel, a);
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
            return new SnapshotMetadataChangeEntity(i, str, l2, bitmapTeleporter, uri, l);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public SnapshotMetadataChangeEntity[] m9415a(int i) {
        return new SnapshotMetadataChangeEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9414a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9415a(i);
    }
}
