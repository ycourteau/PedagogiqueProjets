package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1637b implements Creator<ChangesAvailableEvent> {
    static void m7545a(ChangesAvailableEvent changesAvailableEvent, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, changesAvailableEvent.f5060a);
        C1295b.m6505a(parcel, 2, changesAvailableEvent.f5061b, false);
        C1295b.m6501a(parcel, 3, changesAvailableEvent.f5062c, i, false);
        C1295b.m6494a(parcel, a);
    }

    public ChangesAvailableEvent m7546a(Parcel parcel) {
        ChangesAvailableOptions changesAvailableOptions = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    changesAvailableOptions = (ChangesAvailableOptions) C1294a.m6462a(parcel, a, ChangesAvailableOptions.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ChangesAvailableEvent(i, str, changesAvailableOptions);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ChangesAvailableEvent[] m7547a(int i) {
        return new ChangesAvailableEvent[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m7546a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m7547a(i);
    }
}
