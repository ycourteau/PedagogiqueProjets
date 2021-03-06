package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;

public class ay implements Creator<ControlProgressRequest> {
    static void m7648a(ControlProgressRequest controlProgressRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, controlProgressRequest.f5121a);
        C1295b.m6496a(parcel, 2, controlProgressRequest.f5122b);
        C1295b.m6496a(parcel, 3, controlProgressRequest.f5123c);
        C1295b.m6501a(parcel, 4, controlProgressRequest.f5124d, i, false);
        C1295b.m6494a(parcel, a);
    }

    public ControlProgressRequest m7649a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        DriveId driveId = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 3:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 4:
                    driveId = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ControlProgressRequest(i3, i2, i, driveId);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ControlProgressRequest[] m7650a(int i) {
        return new ControlProgressRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7649a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7650a(i);
    }
}
