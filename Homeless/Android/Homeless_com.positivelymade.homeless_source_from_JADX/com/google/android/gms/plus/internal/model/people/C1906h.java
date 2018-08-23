package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.OrganizationsEntity;
import java.util.HashSet;
import java.util.Set;

public class C1906h implements Creator<OrganizationsEntity> {
    static void m9589a(OrganizationsEntity organizationsEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        Set set = organizationsEntity.f5805a;
        if (set.contains(Integer.valueOf(1))) {
            C1295b.m6496a(parcel, 1, organizationsEntity.f5806b);
        }
        if (set.contains(Integer.valueOf(2))) {
            C1295b.m6505a(parcel, 2, organizationsEntity.f5807c, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            C1295b.m6505a(parcel, 3, organizationsEntity.f5808d, true);
        }
        if (set.contains(Integer.valueOf(4))) {
            C1295b.m6505a(parcel, 4, organizationsEntity.f5809e, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            C1295b.m6505a(parcel, 5, organizationsEntity.f5810f, true);
        }
        if (set.contains(Integer.valueOf(6))) {
            C1295b.m6505a(parcel, 6, organizationsEntity.f5811g, true);
        }
        if (set.contains(Integer.valueOf(7))) {
            C1295b.m6507a(parcel, 7, organizationsEntity.f5812h);
        }
        if (set.contains(Integer.valueOf(8))) {
            C1295b.m6505a(parcel, 8, organizationsEntity.f5813i, true);
        }
        if (set.contains(Integer.valueOf(9))) {
            C1295b.m6505a(parcel, 9, organizationsEntity.f5814j, true);
        }
        if (set.contains(Integer.valueOf(10))) {
            C1295b.m6496a(parcel, 10, organizationsEntity.f5815k);
        }
        C1295b.m6494a(parcel, a);
    }

    public OrganizationsEntity m9590a(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = C1294a.m6465b(parcel);
        Set hashSet = new HashSet();
        String str2 = null;
        boolean z = false;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i2 = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str7 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    str6 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    str5 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str4 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    str3 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case 7:
                    z = C1294a.m6469c(parcel, a);
                    hashSet.add(Integer.valueOf(7));
                    break;
                case 8:
                    str2 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(8));
                    break;
                case 9:
                    str = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(9));
                    break;
                case 10:
                    i = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(10));
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OrganizationsEntity(hashSet, i2, str7, str6, str5, str4, str3, z, str2, str, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public OrganizationsEntity[] m9591a(int i) {
        return new OrganizationsEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9590a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9591a(i);
    }
}
