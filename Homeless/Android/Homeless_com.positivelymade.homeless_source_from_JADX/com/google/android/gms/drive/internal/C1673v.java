package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;

public class C1673v implements Creator<OnDriveIdResponse> {
    static void m7857a(OnDriveIdResponse onDriveIdResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, onDriveIdResponse.f5194a);
        C1295b.m6501a(parcel, 2, onDriveIdResponse.f5195b, i, false);
        C1295b.m6494a(parcel, a);
    }

    public OnDriveIdResponse m7858a(Parcel parcel) {
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
            return new OnDriveIdResponse(i, driveId);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public OnDriveIdResponse[] m7859a(int i) {
        return new OnDriveIdResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7858a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7859a(i);
    }
}
