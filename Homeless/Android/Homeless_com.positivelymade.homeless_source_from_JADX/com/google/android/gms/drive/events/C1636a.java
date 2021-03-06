package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;

public class C1636a implements Creator<ChangeEvent> {
    static void m7542a(ChangeEvent changeEvent, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, changeEvent.f5057a);
        C1295b.m6501a(parcel, 2, changeEvent.f5058b, i, false);
        C1295b.m6496a(parcel, 3, changeEvent.f5059c);
        C1295b.m6494a(parcel, a);
    }

    public ChangeEvent m7543a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        DriveId driveId = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            DriveId driveId2;
            int e;
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    int i3 = i;
                    driveId2 = driveId;
                    e = C1294a.m6471e(parcel, a);
                    a = i3;
                    break;
                case 2:
                    e = i2;
                    DriveId driveId3 = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    a = i;
                    driveId2 = driveId3;
                    break;
                case 3:
                    a = C1294a.m6471e(parcel, a);
                    driveId2 = driveId;
                    e = i2;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    a = i;
                    driveId2 = driveId;
                    e = i2;
                    break;
            }
            i2 = e;
            driveId = driveId2;
            i = a;
        }
        if (parcel.dataPosition() == b) {
            return new ChangeEvent(i2, driveId, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ChangeEvent[] m7544a(int i) {
        return new ChangeEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7543a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7544a(i);
    }
}
