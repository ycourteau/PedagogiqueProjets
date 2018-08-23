package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.drive.Contents;

public class ax implements Creator<CloseContentsRequest> {
    static void m7645a(CloseContentsRequest closeContentsRequest, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, closeContentsRequest.f5117a);
        C1295b.m6501a(parcel, 2, closeContentsRequest.f5118b, i, false);
        C1295b.m6502a(parcel, 3, closeContentsRequest.f5119c, false);
        C1295b.m6496a(parcel, 4, closeContentsRequest.f5120d);
        C1295b.m6494a(parcel, a);
    }

    public CloseContentsRequest m7646a(Parcel parcel) {
        Boolean bool = null;
        int i = 0;
        int b = C1294a.m6465b(parcel);
        Contents contents = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            Boolean bool2;
            Contents contents2;
            int e;
            int a = C1294a.m6460a(parcel);
            int i3;
            switch (C1294a.m6459a(a)) {
                case 1:
                    i3 = i;
                    bool2 = bool;
                    contents2 = contents;
                    e = C1294a.m6471e(parcel, a);
                    a = i3;
                    break;
                case 2:
                    e = i2;
                    Boolean bool3 = bool;
                    contents2 = (Contents) C1294a.m6462a(parcel, a, Contents.CREATOR);
                    a = i;
                    bool2 = bool3;
                    break;
                case 3:
                    contents2 = contents;
                    e = i2;
                    i3 = i;
                    bool2 = C1294a.m6470d(parcel, a);
                    a = i3;
                    break;
                case 4:
                    a = C1294a.m6471e(parcel, a);
                    bool2 = bool;
                    contents2 = contents;
                    e = i2;
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    a = i;
                    bool2 = bool;
                    contents2 = contents;
                    e = i2;
                    break;
            }
            i2 = e;
            contents = contents2;
            bool = bool2;
            i = a;
        }
        if (parcel.dataPosition() == b) {
            return new CloseContentsRequest(i2, contents, bool, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public CloseContentsRequest[] m7647a(int i) {
        return new CloseContentsRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7646a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7647a(i);
    }
}
