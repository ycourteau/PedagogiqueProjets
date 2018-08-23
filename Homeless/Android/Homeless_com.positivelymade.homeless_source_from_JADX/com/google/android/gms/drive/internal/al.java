package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DrivePreferences;

public class al implements Creator<SetDrivePreferencesRequest> {
    static void m7609a(SetDrivePreferencesRequest setDrivePreferencesRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, setDrivePreferencesRequest.f5239a);
        C1295b.m6501a(parcel, 2, setDrivePreferencesRequest.f5240b, i, false);
        C1295b.m6494a(parcel, a);
    }

    public SetDrivePreferencesRequest m7610a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        DrivePreferences drivePreferences = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    drivePreferences = (DrivePreferences) C1294a.m6462a(parcel, a, DrivePreferences.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SetDrivePreferencesRequest(i, drivePreferences);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public SetDrivePreferencesRequest[] m7611a(int i) {
        return new SetDrivePreferencesRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7610a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7611a(i);
    }
}
