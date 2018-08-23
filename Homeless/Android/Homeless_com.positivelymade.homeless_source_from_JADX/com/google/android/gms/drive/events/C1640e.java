package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;

public class C1640e implements Creator<ProgressEvent> {
    static void m7554a(ProgressEvent progressEvent, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, progressEvent.f5080a);
        C1295b.m6501a(parcel, 2, progressEvent.f5081b, i, false);
        C1295b.m6496a(parcel, 3, progressEvent.f5082c);
        C1295b.m6497a(parcel, 4, progressEvent.f5083d);
        C1295b.m6497a(parcel, 5, progressEvent.f5084e);
        C1295b.m6496a(parcel, 6, progressEvent.f5085f);
        C1295b.m6494a(parcel, a);
    }

    public ProgressEvent m7555a(Parcel parcel) {
        long j = 0;
        int i = 0;
        int b = C1294a.m6465b(parcel);
        DriveId driveId = null;
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    driveId = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    break;
                case 3:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 4:
                    j2 = C1294a.m6473g(parcel, a);
                    break;
                case 5:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 6:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ProgressEvent(i3, driveId, i2, j2, j, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ProgressEvent[] m7556a(int i) {
        return new ProgressEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7555a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7556a(i);
    }
}
