package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1873e implements Creator<ParticipantResult> {
    static void m9277a(ParticipantResult participantResult, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6505a(parcel, 1, participantResult.m9274b(), false);
        C1295b.m6496a(parcel, 1000, participantResult.m9273a());
        C1295b.m6496a(parcel, 2, participantResult.m9275c());
        C1295b.m6496a(parcel, 3, participantResult.m9276d());
        C1295b.m6494a(parcel, a);
    }

    public ParticipantResult m9278a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 2:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 3:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 1000:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ParticipantResult(i3, str, i2, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ParticipantResult[] m9279a(int i) {
        return new ParticipantResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9278a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9279a(i);
    }
}
