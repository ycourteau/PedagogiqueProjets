package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.PlacesLivedEntity;
import java.util.HashSet;
import java.util.Set;

public class C1907i implements Creator<PlacesLivedEntity> {
    static void m9592a(PlacesLivedEntity placesLivedEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        Set set = placesLivedEntity.f5817a;
        if (set.contains(Integer.valueOf(1))) {
            C1295b.m6496a(parcel, 1, placesLivedEntity.f5818b);
        }
        if (set.contains(Integer.valueOf(2))) {
            C1295b.m6507a(parcel, 2, placesLivedEntity.f5819c);
        }
        if (set.contains(Integer.valueOf(3))) {
            C1295b.m6505a(parcel, 3, placesLivedEntity.f5820d, true);
        }
        C1295b.m6494a(parcel, a);
    }

    public PlacesLivedEntity m9593a(Parcel parcel) {
        boolean z = false;
        int b = C1294a.m6465b(parcel);
        Set hashSet = new HashSet();
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    z = C1294a.m6469c(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    str = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlacesLivedEntity(hashSet, i, z, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public PlacesLivedEntity[] m9594a(int i) {
        return new PlacesLivedEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9593a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9594a(i);
    }
}
