package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.ImageEntity;
import java.util.HashSet;
import java.util.Set;

public class C1904f implements Creator<ImageEntity> {
    static void m9583a(ImageEntity imageEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        Set set = imageEntity.f5792a;
        if (set.contains(Integer.valueOf(1))) {
            C1295b.m6496a(parcel, 1, imageEntity.f5793b);
        }
        if (set.contains(Integer.valueOf(2))) {
            C1295b.m6505a(parcel, 2, imageEntity.f5794c, true);
        }
        C1295b.m6494a(parcel, a);
    }

    public ImageEntity m9584a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        Set hashSet = new HashSet();
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ImageEntity(hashSet, i, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public ImageEntity[] m9585a(int i) {
        return new ImageEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9584a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9585a(i);
    }
}
