package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.CoverEntity.CoverInfoEntity;
import java.util.HashSet;
import java.util.Set;

public class C1902d implements Creator<CoverInfoEntity> {
    static void m9577a(CoverInfoEntity coverInfoEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        Set set = coverInfoEntity.f5775a;
        if (set.contains(Integer.valueOf(1))) {
            C1295b.m6496a(parcel, 1, coverInfoEntity.f5776b);
        }
        if (set.contains(Integer.valueOf(2))) {
            C1295b.m6496a(parcel, 2, coverInfoEntity.f5777c);
        }
        if (set.contains(Integer.valueOf(3))) {
            C1295b.m6496a(parcel, 3, coverInfoEntity.f5778d);
        }
        C1295b.m6494a(parcel, a);
    }

    public CoverInfoEntity m9578a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        Set hashSet = new HashSet();
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i3 = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    i2 = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    i = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CoverInfoEntity(hashSet, i3, i2, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public CoverInfoEntity[] m9579a(int i) {
        return new CoverInfoEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9578a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9579a(i);
    }
}
