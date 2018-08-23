package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.CoverEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity.CoverEntity.CoverInfoEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity.CoverEntity.CoverPhotoEntity;
import java.util.HashSet;
import java.util.Set;

public class C1901c implements Creator<CoverEntity> {
    static void m9574a(CoverEntity coverEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        Set set = coverEntity.f5786a;
        if (set.contains(Integer.valueOf(1))) {
            C1295b.m6496a(parcel, 1, coverEntity.f5787b);
        }
        if (set.contains(Integer.valueOf(2))) {
            C1295b.m6501a(parcel, 2, coverEntity.f5788c, i, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            C1295b.m6501a(parcel, 3, coverEntity.f5789d, i, true);
        }
        if (set.contains(Integer.valueOf(4))) {
            C1295b.m6496a(parcel, 4, coverEntity.f5790e);
        }
        C1295b.m6494a(parcel, a);
    }

    public CoverEntity m9575a(Parcel parcel) {
        CoverPhotoEntity coverPhotoEntity = null;
        int i = 0;
        int b = C1294a.m6465b(parcel);
        Set hashSet = new HashSet();
        CoverInfoEntity coverInfoEntity = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i2 = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    CoverInfoEntity coverInfoEntity2 = (CoverInfoEntity) C1294a.m6462a(parcel, a, CoverInfoEntity.CREATOR);
                    hashSet.add(Integer.valueOf(2));
                    coverInfoEntity = coverInfoEntity2;
                    break;
                case 3:
                    CoverPhotoEntity coverPhotoEntity2 = (CoverPhotoEntity) C1294a.m6462a(parcel, a, CoverPhotoEntity.CREATOR);
                    hashSet.add(Integer.valueOf(3));
                    coverPhotoEntity = coverPhotoEntity2;
                    break;
                case 4:
                    i = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CoverEntity(hashSet, i2, coverInfoEntity, coverPhotoEntity, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public CoverEntity[] m9576a(int i) {
        return new CoverEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9575a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9576a(i);
    }
}
