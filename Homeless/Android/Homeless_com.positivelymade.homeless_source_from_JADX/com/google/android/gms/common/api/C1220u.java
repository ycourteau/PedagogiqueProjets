package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1220u implements Creator<Status> {
    static void m6173a(Status status, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, status.m5972f());
        C1295b.m6496a(parcel, 1000, status.m5970d());
        C1295b.m6505a(parcel, 2, status.m5969c(), false);
        C1295b.m6501a(parcel, 3, status.m5968b(), i, false);
        C1295b.m6494a(parcel, a);
    }

    public Status m6174a(Parcel parcel) {
        PendingIntent pendingIntent = null;
        int i = 0;
        int b = C1294a.m6465b(parcel);
        String str = null;
        int i2 = 0;
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
                    pendingIntent = (PendingIntent) C1294a.m6462a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 1000:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Status(i2, i, str, pendingIntent);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public Status[] m6175a(int i) {
        return new Status[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m6174a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m6175a(i);
    }
}
