package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1679k implements Creator<Permission> {
    static void m7875a(Permission permission, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, permission.f5034a);
        C1295b.m6505a(parcel, 2, permission.m7519a(), false);
        C1295b.m6496a(parcel, 3, permission.m7520b());
        C1295b.m6505a(parcel, 4, permission.m7521c(), false);
        C1295b.m6505a(parcel, 5, permission.m7522d(), false);
        C1295b.m6496a(parcel, 6, permission.m7523e());
        C1295b.m6507a(parcel, 7, permission.m7524f());
        C1295b.m6494a(parcel, a);
    }

    public Permission m7876a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str2 = null;
        int i2 = 0;
        String str3 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 4:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 5:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 6:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 7:
                    z = C1294a.m6469c(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Permission(i3, str3, i2, str2, str, i, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public Permission[] m7877a(int i) {
        return new Permission[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7876a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7877a(i);
    }
}
