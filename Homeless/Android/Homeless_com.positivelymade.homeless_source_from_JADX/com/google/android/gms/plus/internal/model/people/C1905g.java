package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.NameEntity;
import java.util.HashSet;
import java.util.Set;

public class C1905g implements Creator<NameEntity> {
    static void m9586a(NameEntity nameEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        Set set = nameEntity.f5796a;
        if (set.contains(Integer.valueOf(1))) {
            C1295b.m6496a(parcel, 1, nameEntity.f5797b);
        }
        if (set.contains(Integer.valueOf(2))) {
            C1295b.m6505a(parcel, 2, nameEntity.f5798c, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            C1295b.m6505a(parcel, 3, nameEntity.f5799d, true);
        }
        if (set.contains(Integer.valueOf(4))) {
            C1295b.m6505a(parcel, 4, nameEntity.f5800e, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            C1295b.m6505a(parcel, 5, nameEntity.f5801f, true);
        }
        if (set.contains(Integer.valueOf(6))) {
            C1295b.m6505a(parcel, 6, nameEntity.f5802g, true);
        }
        if (set.contains(Integer.valueOf(7))) {
            C1295b.m6505a(parcel, 7, nameEntity.f5803h, true);
        }
        C1295b.m6494a(parcel, a);
    }

    public NameEntity m9587a(Parcel parcel) {
        String str = null;
        int b = C1294a.m6465b(parcel);
        Set hashSet = new HashSet();
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str6 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    str5 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    str4 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str3 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    str2 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case 7:
                    str = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(7));
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new NameEntity(hashSet, i, str6, str5, str4, str3, str2, str);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public NameEntity[] m9588a(int i) {
        return new NameEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9587a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9588a(i);
    }
}
