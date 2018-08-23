package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class bb implements Creator<CreateFileRequest> {
    static void m7657a(CreateFileRequest createFileRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, createFileRequest.f5133a);
        C1295b.m6501a(parcel, 2, createFileRequest.f5134b, i, false);
        C1295b.m6501a(parcel, 3, createFileRequest.f5135c, i, false);
        C1295b.m6501a(parcel, 4, createFileRequest.f5136d, i, false);
        C1295b.m6503a(parcel, 5, createFileRequest.f5137e, false);
        C1295b.m6507a(parcel, 6, createFileRequest.f5138f);
        C1295b.m6505a(parcel, 7, createFileRequest.f5139g, false);
        C1295b.m6496a(parcel, 8, createFileRequest.f5140h);
        C1295b.m6496a(parcel, 9, createFileRequest.f5141i);
        C1295b.m6494a(parcel, a);
    }

    public CreateFileRequest m7658a(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = C1294a.m6465b(parcel);
        int i2 = 0;
        boolean z = false;
        Integer num = null;
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
                    num = C1294a.m6472f(parcel, a);
                    break;
                case 6:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 7:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 8:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 9:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CreateFileRequest(i3, driveId, metadataBundle, contents, num, z, str, i2, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public CreateFileRequest[] m7659a(int i) {
        return new CreateFileRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7658a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7659a(i);
    }
}
