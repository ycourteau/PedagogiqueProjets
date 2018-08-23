package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DrivePreferences;

public class C1674w implements Creator<OnDrivePreferencesResponse> {
    static void m7860a(OnDrivePreferencesResponse onDrivePreferencesResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, onDrivePreferencesResponse.f5196a);
        C1295b.m6501a(parcel, 2, onDrivePreferencesResponse.f5197b, i, false);
        C1295b.m6494a(parcel, a);
    }

    public OnDrivePreferencesResponse m7861a(Parcel parcel) {
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
            return new OnDrivePreferencesResponse(i, drivePreferences);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public OnDrivePreferencesResponse[] m7862a(int i) {
        return new OnDrivePreferencesResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7861a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7862a(i);
    }
}
