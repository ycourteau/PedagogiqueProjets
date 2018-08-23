package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import java.util.ArrayList;

public class C1865a implements Creator<ZInvitationCluster> {
    static void m9165a(ZInvitationCluster zInvitationCluster, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6515b(parcel, 1, zInvitationCluster.m9156b(), false);
        C1295b.m6496a(parcel, 1000, zInvitationCluster.m9155a());
        C1295b.m6494a(parcel, a);
    }

    public ZInvitationCluster m9166a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    arrayList = C1294a.m6468c(parcel, a, InvitationEntity.CREATOR);
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
            return new ZInvitationCluster(i, arrayList);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ZInvitationCluster[] m9167a(int i) {
        return new ZInvitationCluster[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9166a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9167a(i);
    }
}
