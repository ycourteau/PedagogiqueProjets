package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1244i implements Creator<ConnectionResult> {
    static void m6298a(ConnectionResult connectionResult, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, connectionResult.f4087b);
        C1295b.m6496a(parcel, 2, connectionResult.m5962c());
        C1295b.m6501a(parcel, 3, connectionResult.m5963d(), i, false);
        C1295b.m6494a(parcel, a);
    }

    public ConnectionResult m6299a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        PendingIntent pendingIntent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) C1294a.m6462a(parcel, a, PendingIntent.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ConnectionResult(i2, i, pendingIntent);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ConnectionResult[] m6300a(int i) {
        return new ConnectionResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6299a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6300a(i);
    }
}
