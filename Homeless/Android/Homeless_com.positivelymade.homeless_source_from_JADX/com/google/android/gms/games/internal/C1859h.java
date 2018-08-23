package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1859h implements Creator<PopupLocationInfoParcelable> {
    static void m9131a(PopupLocationInfoParcelable popupLocationInfoParcelable, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6498a(parcel, 1, popupLocationInfoParcelable.m8403b(), false);
        C1295b.m6496a(parcel, 1000, popupLocationInfoParcelable.m8402a());
        C1295b.m6499a(parcel, 2, popupLocationInfoParcelable.m8404c(), false);
        C1295b.m6494a(parcel, a);
    }

    public PopupLocationInfoParcelable m9132a(Parcel parcel) {
        IBinder iBinder = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    bundle = C1294a.m6481o(parcel, a);
                    break;
                case 2:
                    iBinder = C1294a.m6480n(parcel, a);
                    break;
                case 1000:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PopupLocationInfoParcelable(i, bundle, iBinder);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public PopupLocationInfoParcelable[] m9133a(int i) {
        return new PopupLocationInfoParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9132a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9133a(i);
    }
}
