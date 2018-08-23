package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;

public class ag implements Creator<OpenContentsRequest> {
    static void m7594a(OpenContentsRequest openContentsRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, openContentsRequest.f5220a);
        C1295b.m6501a(parcel, 2, openContentsRequest.f5221b, i, false);
        C1295b.m6496a(parcel, 3, openContentsRequest.f5222c);
        C1295b.m6496a(parcel, 4, openContentsRequest.f5223d);
        C1295b.m6494a(parcel, a);
    }

    public OpenContentsRequest m7595a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        DriveId driveId = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            DriveId driveId2;
            int e;
            int a = C1294a.m6460a(parcel);
            int i4;
            switch (C1294a.m6459a(a)) {
                case 1:
                    i4 = i;
                    i = i2;
                    driveId2 = driveId;
                    e = C1294a.m6471e(parcel, a);
                    a = i4;
                    break;
                case 2:
                    e = i3;
                    i4 = i2;
                    driveId2 = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    a = i;
                    i = i4;
                    break;
                case 3:
                    driveId2 = driveId;
                    e = i3;
                    i4 = i;
                    i = C1294a.m6471e(parcel, a);
                    a = i4;
                    break;
                case 4:
                    a = C1294a.m6471e(parcel, a);
                    i = i2;
                    driveId2 = driveId;
                    e = i3;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    a = i;
                    i = i2;
                    driveId2 = driveId;
                    e = i3;
                    break;
            }
            i3 = e;
            driveId = driveId2;
            i2 = i;
            i = a;
        }
        if (parcel.dataPosition() == b) {
            return new OpenContentsRequest(i3, driveId, i2, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public OpenContentsRequest[] m7596a(int i) {
        return new OpenContentsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7595a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7596a(i);
    }
}
