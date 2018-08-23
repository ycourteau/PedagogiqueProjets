package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;

public class ak implements Creator<RemovePermissionRequest> {
    static void m7606a(RemovePermissionRequest removePermissionRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, removePermissionRequest.f5234a);
        C1295b.m6501a(parcel, 2, removePermissionRequest.f5235b, i, false);
        C1295b.m6505a(parcel, 3, removePermissionRequest.f5236c, false);
        C1295b.m6507a(parcel, 4, removePermissionRequest.f5237d);
        C1295b.m6505a(parcel, 5, removePermissionRequest.f5238e, false);
        C1295b.m6494a(parcel, a);
    }

    public RemovePermissionRequest m7607a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = C1294a.m6465b(parcel);
        String str2 = null;
        DriveId driveId = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    driveId = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    break;
                case 3:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 4:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 5:
                    str = C1294a.m6479m(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RemovePermissionRequest(i, driveId, str2, z, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public RemovePermissionRequest[] m7608a(int i) {
        return new RemovePermissionRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7607a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7608a(i);
    }
}
