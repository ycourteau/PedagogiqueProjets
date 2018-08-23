package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1635e implements Creator<Contents> {
    static void m7538a(Contents contents, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, contents.f5011a);
        C1295b.m6501a(parcel, 2, contents.f5012b, i, false);
        C1295b.m6496a(parcel, 3, contents.f5013c);
        C1295b.m6496a(parcel, 4, contents.f5014d);
        C1295b.m6501a(parcel, 5, contents.f5015e, i, false);
        C1295b.m6507a(parcel, 7, contents.f5016f);
        C1295b.m6505a(parcel, 8, contents.f5017g, false);
        C1295b.m6494a(parcel, a);
    }

    public Contents m7539a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        DriveId driveId = null;
        int i = 0;
        int i2 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) C1294a.m6462a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                case 3:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 4:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 5:
                    driveId = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    break;
                case 7:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 8:
                    str = C1294a.m6479m(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Contents(i3, parcelFileDescriptor, i2, i, driveId, z, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public Contents[] m7540a(int i) {
        return new Contents[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7539a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7540a(i);
    }
}
