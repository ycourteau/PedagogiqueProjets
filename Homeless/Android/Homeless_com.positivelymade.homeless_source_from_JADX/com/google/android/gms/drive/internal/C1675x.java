package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;

public class C1675x implements Creator<AddPermissionRequest> {
    static void m7863a(AddPermissionRequest addPermissionRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, addPermissionRequest.f5094a);
        C1295b.m6501a(parcel, 2, addPermissionRequest.f5095b, i, false);
        C1295b.m6501a(parcel, 3, addPermissionRequest.f5096c, i, false);
        C1295b.m6507a(parcel, 4, addPermissionRequest.f5097d);
        C1295b.m6505a(parcel, 5, addPermissionRequest.f5098e, false);
        C1295b.m6507a(parcel, 6, addPermissionRequest.f5099f);
        C1295b.m6505a(parcel, 7, addPermissionRequest.f5100g, false);
        C1295b.m6494a(parcel, a);
    }

    public AddPermissionRequest m7864a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = C1294a.m6465b(parcel);
        String str2 = null;
        boolean z2 = false;
        Permission permission = null;
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
                    permission = (Permission) C1294a.m6462a(parcel, a, Permission.CREATOR);
                    break;
                case 4:
                    z2 = C1294a.m6469c(parcel, a);
                    break;
                case 5:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 6:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 7:
                    str = C1294a.m6479m(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AddPermissionRequest(i, driveId, permission, z2, str2, z, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public AddPermissionRequest[] m7865a(int i) {
        return new AddPermissionRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7864a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7865a(i);
    }
}
