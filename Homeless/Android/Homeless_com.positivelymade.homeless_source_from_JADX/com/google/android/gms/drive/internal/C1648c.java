package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1648c implements Creator<DriveServiceResponse> {
    static void m7680a(DriveServiceResponse driveServiceResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, driveServiceResponse.f5148a);
        C1295b.m6499a(parcel, 2, driveServiceResponse.f5149b, false);
        C1295b.m6494a(parcel, a);
    }

    public DriveServiceResponse m7681a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    iBinder = C1294a.m6480n(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DriveServiceResponse(i, iBinder);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public DriveServiceResponse[] m7682a(int i) {
        return new DriveServiceResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7681a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7682a(i);
    }
}
