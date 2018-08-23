package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1671t implements Creator<OnDeviceUsagePreferenceResponse> {
    static void m7851a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, onDeviceUsagePreferenceResponse.f5189a);
        C1295b.m6501a(parcel, 2, onDeviceUsagePreferenceResponse.f5190b, i, false);
        C1295b.m6494a(parcel, a);
    }

    public OnDeviceUsagePreferenceResponse m7852a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        FileUploadPreferencesImpl fileUploadPreferencesImpl = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    fileUploadPreferencesImpl = (FileUploadPreferencesImpl) C1294a.m6462a(parcel, a, FileUploadPreferencesImpl.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OnDeviceUsagePreferenceResponse(i, fileUploadPreferencesImpl);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public OnDeviceUsagePreferenceResponse[] m7853a(int i) {
        return new OnDeviceUsagePreferenceResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7852a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7853a(i);
    }
}
