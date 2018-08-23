package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class ar implements Creator<UpdateMetadataRequest> {
    static void m7627a(UpdateMetadataRequest updateMetadataRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, updateMetadataRequest.f5252a);
        C1295b.m6501a(parcel, 2, updateMetadataRequest.f5253b, i, false);
        C1295b.m6501a(parcel, 3, updateMetadataRequest.f5254c, i, false);
        C1295b.m6494a(parcel, a);
    }

    public UpdateMetadataRequest m7628a(Parcel parcel) {
        MetadataBundle metadataBundle = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        DriveId driveId = null;
        while (parcel.dataPosition() < b) {
            DriveId driveId2;
            int e;
            MetadataBundle metadataBundle2;
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    MetadataBundle metadataBundle3 = metadataBundle;
                    driveId2 = driveId;
                    e = C1294a.m6471e(parcel, a);
                    metadataBundle2 = metadataBundle3;
                    break;
                case 2:
                    e = i;
                    DriveId driveId3 = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    metadataBundle2 = metadataBundle;
                    driveId2 = driveId3;
                    break;
                case 3:
                    metadataBundle2 = (MetadataBundle) C1294a.m6462a(parcel, a, MetadataBundle.CREATOR);
                    driveId2 = driveId;
                    e = i;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    metadataBundle2 = metadataBundle;
                    driveId2 = driveId;
                    e = i;
                    break;
            }
            i = e;
            driveId = driveId2;
            metadataBundle = metadataBundle2;
        }
        if (parcel.dataPosition() == b) {
            return new UpdateMetadataRequest(i, driveId, metadataBundle);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public UpdateMetadataRequest[] m7629a(int i) {
        return new UpdateMetadataRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7628a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7629a(i);
    }
}
