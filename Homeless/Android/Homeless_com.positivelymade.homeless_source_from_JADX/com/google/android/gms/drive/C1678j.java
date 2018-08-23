package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1678j implements Creator<DriveSpace> {
    static void m7872a(DriveSpace driveSpace, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, driveSpace.f5032f);
        C1295b.m6505a(parcel, 2, driveSpace.m7516a(), false);
        C1295b.m6494a(parcel, a);
    }

    public DriveSpace m7873a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    str = C1294a.m6479m(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DriveSpace(i, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public DriveSpace[] m7874a(int i) {
        return new DriveSpace[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7873a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7874a(i);
    }
}
