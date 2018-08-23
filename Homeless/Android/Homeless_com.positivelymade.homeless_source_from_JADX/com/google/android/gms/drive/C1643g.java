package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1643g implements Creator<DriveId> {
    static void m7560a(DriveId driveId, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, driveId.f5018a);
        C1295b.m6505a(parcel, 2, driveId.f5019b, false);
        C1295b.m6497a(parcel, 3, driveId.f5020c);
        C1295b.m6497a(parcel, 4, driveId.f5021d);
        C1295b.m6496a(parcel, 5, driveId.f5022e);
        C1295b.m6494a(parcel, a);
    }

    public DriveId m7561a(Parcel parcel) {
        long j = 0;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str = null;
        int i2 = -1;
        long j2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    j2 = C1294a.m6473g(parcel, a);
                    break;
                case 4:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 5:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DriveId(i, str, j2, j, i2);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public DriveId[] m7562a(int i) {
        return new DriveId[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7561a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7562a(i);
    }
}
