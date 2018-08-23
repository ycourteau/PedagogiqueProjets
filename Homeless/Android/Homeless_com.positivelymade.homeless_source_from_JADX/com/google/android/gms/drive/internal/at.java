package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;

public class at implements Creator<AuthorizeAccessRequest> {
    static void m7633a(AuthorizeAccessRequest authorizeAccessRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, authorizeAccessRequest.f5101a);
        C1295b.m6497a(parcel, 2, authorizeAccessRequest.f5102b);
        C1295b.m6501a(parcel, 3, authorizeAccessRequest.f5103c, i, false);
        C1295b.m6494a(parcel, a);
    }

    public AuthorizeAccessRequest m7634a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        long j = 0;
        DriveId driveId = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 3:
                    driveId = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AuthorizeAccessRequest(i, j, driveId);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public AuthorizeAccessRequest[] m7635a(int i) {
        return new AuthorizeAccessRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7634a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7635a(i);
    }
}
