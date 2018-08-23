package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.AgeRangeEntity;
import java.util.HashSet;
import java.util.Set;

public class C1900b implements Creator<AgeRangeEntity> {
    static void m9571a(AgeRangeEntity ageRangeEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        Set set = ageRangeEntity.f5770a;
        if (set.contains(Integer.valueOf(1))) {
            C1295b.m6496a(parcel, 1, ageRangeEntity.f5771b);
        }
        if (set.contains(Integer.valueOf(2))) {
            C1295b.m6496a(parcel, 2, ageRangeEntity.f5772c);
        }
        if (set.contains(Integer.valueOf(3))) {
            C1295b.m6496a(parcel, 3, ageRangeEntity.f5773d);
        }
        C1295b.m6494a(parcel, a);
    }

    public AgeRangeEntity m9572a(Parcel parcel) {
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
            return new AgeRangeEntity(hashSet, i3, i2, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public AgeRangeEntity[] m9573a(int i) {
        return new AgeRangeEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9572a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9573a(i);
    }
}
