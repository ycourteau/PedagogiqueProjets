package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class aw implements Creator<CloseContentsAndUpdateMetadataRequest> {
    static void m7642a(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, closeContentsAndUpdateMetadataRequest.f5108a);
        C1295b.m6501a(parcel, 2, closeContentsAndUpdateMetadataRequest.f5109b, i, false);
        C1295b.m6501a(parcel, 3, closeContentsAndUpdateMetadataRequest.f5110c, i, false);
        C1295b.m6501a(parcel, 4, closeContentsAndUpdateMetadataRequest.f5111d, i, false);
        C1295b.m6507a(parcel, 5, closeContentsAndUpdateMetadataRequest.f5112e);
        C1295b.m6505a(parcel, 6, closeContentsAndUpdateMetadataRequest.f5113f, false);
        C1295b.m6496a(parcel, 7, closeContentsAndUpdateMetadataRequest.f5114g);
        C1295b.m6496a(parcel, 8, closeContentsAndUpdateMetadataRequest.f5115h);
        C1295b.m6507a(parcel, 9, closeContentsAndUpdateMetadataRequest.f5116i);
        C1295b.m6494a(parcel, a);
    }

    public CloseContentsAndUpdateMetadataRequest m7643a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        Contents contents = null;
        MetadataBundle metadataBundle = null;
        DriveId driveId = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    driveId = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    break;
                case 3:
                    metadataBundle = (MetadataBundle) C1294a.m6462a(parcel, a, MetadataBundle.CREATOR);
                    break;
                case 4:
                    contents = (Contents) C1294a.m6462a(parcel, a, Contents.CREATOR);
                    break;
                case 5:
                    z2 = C1294a.m6469c(parcel, a);
                    break;
                case 6:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 7:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 8:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 9:
                    z = C1294a.m6469c(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CloseContentsAndUpdateMetadataRequest(i3, driveId, metadataBundle, contents, z2, str, i2, i, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public CloseContentsAndUpdateMetadataRequest[] m7644a(int i) {
        return new CloseContentsAndUpdateMetadataRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7643a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7644a(i);
    }
}
