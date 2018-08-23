package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.List;

public class C1639d implements Creator<CompletionEvent> {
    static void m7551a(CompletionEvent completionEvent, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, completionEvent.f5068a);
        C1295b.m6501a(parcel, 2, completionEvent.f5069b, i, false);
        C1295b.m6505a(parcel, 3, completionEvent.f5070c, false);
        C1295b.m6501a(parcel, 4, completionEvent.f5071d, i, false);
        C1295b.m6501a(parcel, 5, completionEvent.f5072e, i, false);
        C1295b.m6501a(parcel, 6, completionEvent.f5073f, i, false);
        C1295b.m6506a(parcel, 7, completionEvent.f5074g, false);
        C1295b.m6496a(parcel, 8, completionEvent.f5075h);
        C1295b.m6499a(parcel, 9, completionEvent.f5076i, false);
        C1295b.m6494a(parcel, a);
    }

    public CompletionEvent m7552a(Parcel parcel) {
        int i = 0;
        IBinder iBinder = null;
        int b = C1294a.m6465b(parcel);
        List list = null;
        MetadataBundle metadataBundle = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        String str = null;
        DriveId driveId = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    driveId = (DriveId) C1294a.m6462a(parcel, a, DriveId.CREATOR);
                    break;
                case 3:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 4:
                    parcelFileDescriptor2 = (ParcelFileDescriptor) C1294a.m6462a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    parcelFileDescriptor = (ParcelFileDescriptor) C1294a.m6462a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                case 6:
                    metadataBundle = (MetadataBundle) C1294a.m6462a(parcel, a, MetadataBundle.CREATOR);
                    break;
                case 7:
                    list = C1294a.m6491y(parcel, a);
                    break;
                case 8:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 9:
                    iBinder = C1294a.m6480n(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CompletionEvent(i2, driveId, str, parcelFileDescriptor2, parcelFileDescriptor, metadataBundle, list, i, iBinder);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public CompletionEvent[] m7553a(int i) {
        return new CompletionEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7552a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7553a(i);
    }
}
