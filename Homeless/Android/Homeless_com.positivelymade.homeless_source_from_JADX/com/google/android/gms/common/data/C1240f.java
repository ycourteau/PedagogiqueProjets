package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1240f implements Creator<DataHolder> {
    static void m6268a(DataHolder dataHolder, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6511a(parcel, 1, dataHolder.m6241c(), false);
        C1295b.m6496a(parcel, 1000, dataHolder.m6238b());
        C1295b.m6510a(parcel, 2, dataHolder.m6243d(), i, false);
        C1295b.m6496a(parcel, 3, dataHolder.m6245e());
        C1295b.m6498a(parcel, 4, dataHolder.m6247f(), false);
        C1295b.m6494a(parcel, a);
    }

    public DataHolder m6269a(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int b = C1294a.m6465b(parcel);
        CursorWindow[] cursorWindowArr = null;
        String[] strArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    strArr = C1294a.m6490x(parcel, a);
                    break;
                case 2:
                    cursorWindowArr = (CursorWindow[]) C1294a.m6467b(parcel, a, CursorWindow.CREATOR);
                    break;
                case 3:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 4:
                    bundle = C1294a.m6481o(parcel, a);
                    break;
                case 1000:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() != b) {
            throw new C1293a("Overread allowed size end=" + b, parcel);
        }
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i, bundle);
        dataHolder.m6235a();
        return dataHolder;
    }

    public DataHolder[] m6270a(int i) {
        return new DataHolder[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6269a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6270a(i);
    }
}
