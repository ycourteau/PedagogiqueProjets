package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1237c implements Creator<BitmapTeleporter> {
    static void m6256a(BitmapTeleporter bitmapTeleporter, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, bitmapTeleporter.f4250a);
        C1295b.m6501a(parcel, 2, bitmapTeleporter.f4251b, i, false);
        C1295b.m6496a(parcel, 3, bitmapTeleporter.f4252c);
        C1295b.m6494a(parcel, a);
    }

    public BitmapTeleporter m6257a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            ParcelFileDescriptor parcelFileDescriptor2;
            int e;
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    int i3 = i;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    e = C1294a.m6471e(parcel, a);
                    a = i3;
                    break;
                case 2:
                    e = i2;
                    ParcelFileDescriptor parcelFileDescriptor3 = (ParcelFileDescriptor) C1294a.m6462a(parcel, a, ParcelFileDescriptor.CREATOR);
                    a = i;
                    parcelFileDescriptor2 = parcelFileDescriptor3;
                    break;
                case 3:
                    a = C1294a.m6471e(parcel, a);
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    e = i2;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    a = i;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    e = i2;
                    break;
            }
            i2 = e;
            parcelFileDescriptor = parcelFileDescriptor2;
            i = a;
        }
        if (parcel.dataPosition() == b) {
            return new BitmapTeleporter(i2, parcelFileDescriptor, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public BitmapTeleporter[] m6258a(int i) {
        return new BitmapTeleporter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6257a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6258a(i);
    }
}
