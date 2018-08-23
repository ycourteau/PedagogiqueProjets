package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1650e implements Creator<FileUploadPreferencesImpl> {
    static void m7686a(FileUploadPreferencesImpl fileUploadPreferencesImpl, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, fileUploadPreferencesImpl.f5152a);
        C1295b.m6496a(parcel, 2, fileUploadPreferencesImpl.f5153b);
        C1295b.m6496a(parcel, 3, fileUploadPreferencesImpl.f5154c);
        C1295b.m6507a(parcel, 4, fileUploadPreferencesImpl.f5155d);
        C1295b.m6494a(parcel, a);
    }

    public FileUploadPreferencesImpl m7687a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        int i = 0;
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
                    z = C1294a.m6469c(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FileUploadPreferencesImpl(i3, i2, i, z);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public FileUploadPreferencesImpl[] m7688a(int i) {
        return new FileUploadPreferencesImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7687a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7688a(i);
    }
}
