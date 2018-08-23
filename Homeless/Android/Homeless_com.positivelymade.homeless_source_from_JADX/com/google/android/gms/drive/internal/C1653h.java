package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;

public class C1653h implements Creator<GetMetadataRequest> {
    static void m7695a(GetMetadataRequest getMetadataRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, getMetadataRequest.f5164a);
        C1295b.m6501a(parcel, 2, getMetadataRequest.f5165b, i, false);
        C1295b.m6507a(parcel, 3, getMetadataRequest.f5166c);
        C1295b.m6494a(parcel, a);
    }

    public GetMetadataRequest m7696a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        DriveId driveId = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            DriveId driveId2;
            int e;
            boolean z2;
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    boolean z3 = z;
                    driveId2 = driveId;
                    e = C1294a.m6471e(parcel, a);
                    z2 = z3;
                    break;
                case 2:
                    e = i;
                    DriveId driveId3 = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    z2 = z;
                    driveId2 = driveId3;
                    break;
                case 3:
                    z2 = C1294a.m6469c(parcel, a);
                    driveId2 = driveId;
                    e = i;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    z2 = z;
                    driveId2 = driveId;
                    e = i;
                    break;
            }
            i = e;
            driveId = driveId2;
            z = z2;
        }
        if (parcel.dataPosition() == b) {
            return new GetMetadataRequest(i, driveId, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public GetMetadataRequest[] m7697a(int i) {
        return new GetMetadataRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7696a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7697a(i);
    }
}
