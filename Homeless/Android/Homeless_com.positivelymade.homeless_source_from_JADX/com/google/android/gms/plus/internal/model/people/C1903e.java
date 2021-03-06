package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.CoverEntity.CoverPhotoEntity;
import java.util.HashSet;
import java.util.Set;

public class C1903e implements Creator<CoverPhotoEntity> {
    static void m9580a(CoverPhotoEntity coverPhotoEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        Set set = coverPhotoEntity.f5780a;
        if (set.contains(Integer.valueOf(1))) {
            C1295b.m6496a(parcel, 1, coverPhotoEntity.f5781b);
        }
        if (set.contains(Integer.valueOf(2))) {
            C1295b.m6496a(parcel, 2, coverPhotoEntity.f5782c);
        }
        if (set.contains(Integer.valueOf(3))) {
            C1295b.m6505a(parcel, 3, coverPhotoEntity.f5783d, true);
        }
        if (set.contains(Integer.valueOf(4))) {
            C1295b.m6496a(parcel, 4, coverPhotoEntity.f5784e);
        }
        C1295b.m6494a(parcel, a);
    }

    public CoverPhotoEntity m9581a(Parcel parcel) {
        int i = 0;
        int b = C1294a.m6465b(parcel);
        Set hashSet = new HashSet();
        String str = null;
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
                    str = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(3));
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
            return new CoverPhotoEntity(hashSet, i3, i2, str, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public CoverPhotoEntity[] m9582a(int i) {
        return new CoverPhotoEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9581a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9582a(i);
    }
}
