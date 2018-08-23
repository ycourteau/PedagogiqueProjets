package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0689c implements Creator<RewardItemParcel> {
    static void m3075a(RewardItemParcel rewardItemParcel, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, rewardItemParcel.f1970a);
        C1295b.m6505a(parcel, 2, rewardItemParcel.f1971b, false);
        C1295b.m6496a(parcel, 3, rewardItemParcel.f1972c);
        C1295b.m6494a(parcel, a);
    }

    public RewardItemParcel m3076a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RewardItemParcel(i2, str, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public RewardItemParcel[] m3077a(int i) {
        return new RewardItemParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3076a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3077a(i);
    }
}
