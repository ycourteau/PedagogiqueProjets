package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class ba implements Creator<CreateFileIntentSenderRequest> {
    static void m7654a(CreateFileIntentSenderRequest createFileIntentSenderRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, createFileIntentSenderRequest.f5127a);
        C1295b.m6501a(parcel, 2, createFileIntentSenderRequest.f5128b, i, false);
        C1295b.m6496a(parcel, 3, createFileIntentSenderRequest.f5129c);
        C1295b.m6505a(parcel, 4, createFileIntentSenderRequest.f5130d, false);
        C1295b.m6501a(parcel, 5, createFileIntentSenderRequest.f5131e, i, false);
        C1295b.m6503a(parcel, 6, createFileIntentSenderRequest.f5132f, false);
        C1295b.m6494a(parcel, a);
    }

    public CreateFileIntentSenderRequest m7655a(Parcel parcel) {
        int i = 0;
        Integer num = null;
        int b = C1294a.m6465b(parcel);
        DriveId driveId = null;
        String str = null;
        MetadataBundle metadataBundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    metadataBundle = (MetadataBundle) C1294a.m6462a(parcel, a, MetadataBundle.CREATOR);
                    break;
                case 3:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 4:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 5:
                    driveId = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    break;
                case 6:
                    num = C1294a.m6472f(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CreateFileIntentSenderRequest(i2, metadataBundle, i, str, driveId, num);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public CreateFileIntentSenderRequest[] m7656a(int i) {
        return new CreateFileIntentSenderRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7655a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7656a(i);
    }
}
