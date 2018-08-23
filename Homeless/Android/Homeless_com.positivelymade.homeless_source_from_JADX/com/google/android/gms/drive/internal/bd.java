package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;

public class bd implements Creator<DeleteResourceRequest> {
    static void m7663a(DeleteResourceRequest deleteResourceRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, deleteResourceRequest.f5145a);
        C1295b.m6501a(parcel, 2, deleteResourceRequest.f5146b, i, false);
        C1295b.m6494a(parcel, a);
    }

    public DeleteResourceRequest m7664a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        DriveId driveId = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    driveId = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DeleteResourceRequest(i, driveId);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public DeleteResourceRequest[] m7665a(int i) {
        return new DeleteResourceRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7664a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7665a(i);
    }
}
