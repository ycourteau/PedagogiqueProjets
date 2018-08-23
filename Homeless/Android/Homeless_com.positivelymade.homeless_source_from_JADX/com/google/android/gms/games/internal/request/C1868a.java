package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;

public class C1868a implements Creator<GameRequestCluster> {
    static void m9216a(GameRequestCluster gameRequestCluster, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6515b(parcel, 1, gameRequestCluster.m9206b(), false);
        C1295b.m6496a(parcel, 1000, gameRequestCluster.m9204a());
        C1295b.m6494a(parcel, a);
    }

    public GameRequestCluster m9217a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    arrayList = C1294a.m6468c(parcel, a, GameRequestEntity.CREATOR);
                    break;
                case 1000:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GameRequestCluster(i, arrayList);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public GameRequestCluster[] m9218a(int i) {
        return new GameRequestCluster[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9217a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9218a(i);
    }
}
