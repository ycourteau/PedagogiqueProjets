package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class am implements Creator<SetFileUploadPreferencesRequest> {
    static void m7612a(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, setFileUploadPreferencesRequest.f5241a);
        C1295b.m6501a(parcel, 2, setFileUploadPreferencesRequest.f5242b, i, false);
        C1295b.m6494a(parcel, a);
    }

    public SetFileUploadPreferencesRequest m7613a(Parcel parcel) {
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
            return new SetFileUploadPreferencesRequest(i, fileUploadPreferencesImpl);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public SetFileUploadPreferencesRequest[] m7614a(int i) {
        return new SetFileUploadPreferencesRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7613a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7614a(i);
    }
}
