package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;

public class as implements Creator<UpdatePermissionRequest> {
    static void m7630a(UpdatePermissionRequest updatePermissionRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, updatePermissionRequest.f5255a);
        C1295b.m6501a(parcel, 2, updatePermissionRequest.f5256b, i, false);
        C1295b.m6505a(parcel, 3, updatePermissionRequest.f5257c, false);
        C1295b.m6496a(parcel, 4, updatePermissionRequest.f5258d);
        C1295b.m6507a(parcel, 5, updatePermissionRequest.f5259e);
        C1295b.m6505a(parcel, 6, updatePermissionRequest.f5260f, false);
        C1295b.m6494a(parcel, a);
    }

    public UpdatePermissionRequest m7631a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str2 = null;
        DriveId driveId = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    driveId = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    break;
                case 3:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 4:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 5:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 6:
                    str = C1294a.m6479m(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new UpdatePermissionRequest(i2, driveId, str2, i, z, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public UpdatePermissionRequest[] m7632a(int i) {
        return new UpdatePermissionRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7631a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7632a(i);
    }
}
