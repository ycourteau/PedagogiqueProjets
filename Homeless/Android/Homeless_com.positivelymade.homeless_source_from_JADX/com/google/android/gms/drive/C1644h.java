package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1644h implements Creator<DrivePreferences> {
    static void m7563a(DrivePreferences drivePreferences, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, drivePreferences.f5025a);
        C1295b.m6507a(parcel, 2, drivePreferences.f5026b);
        C1295b.m6494a(parcel, a);
    }

    public DrivePreferences m7564a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    z = C1294a.m6469c(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DrivePreferences(i, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public DrivePreferences[] m7565a(int i) {
        return new DrivePreferences[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7564a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7565a(i);
    }
}
