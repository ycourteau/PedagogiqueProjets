package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v7.p010b.C0275a.C0274i;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.AgeRangeEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity.CoverEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity.ImageEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity.NameEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity.OrganizationsEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity.PlacesLivedEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity.UrlsEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C1899a implements Creator<PersonEntity> {
    static void m9568a(PersonEntity personEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        Set set = personEntity.f5829a;
        if (set.contains(Integer.valueOf(1))) {
            C1295b.m6496a(parcel, 1, personEntity.f5830b);
        }
        if (set.contains(Integer.valueOf(2))) {
            C1295b.m6505a(parcel, 2, personEntity.f5831c, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            C1295b.m6501a(parcel, 3, personEntity.f5832d, i, true);
        }
        if (set.contains(Integer.valueOf(4))) {
            C1295b.m6505a(parcel, 4, personEntity.f5833e, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            C1295b.m6505a(parcel, 5, personEntity.f5834f, true);
        }
        if (set.contains(Integer.valueOf(6))) {
            C1295b.m6496a(parcel, 6, personEntity.f5835g);
        }
        if (set.contains(Integer.valueOf(7))) {
            C1295b.m6501a(parcel, 7, personEntity.f5836h, i, true);
        }
        if (set.contains(Integer.valueOf(8))) {
            C1295b.m6505a(parcel, 8, personEntity.f5837i, true);
        }
        if (set.contains(Integer.valueOf(9))) {
            C1295b.m6505a(parcel, 9, personEntity.f5838j, true);
        }
        if (set.contains(Integer.valueOf(12))) {
            C1295b.m6496a(parcel, 12, personEntity.f5839k);
        }
        if (set.contains(Integer.valueOf(14))) {
            C1295b.m6505a(parcel, 14, personEntity.f5840l, true);
        }
        if (set.contains(Integer.valueOf(15))) {
            C1295b.m6501a(parcel, 15, personEntity.f5841m, i, true);
        }
        if (set.contains(Integer.valueOf(16))) {
            C1295b.m6507a(parcel, 16, personEntity.f5842n);
        }
        if (set.contains(Integer.valueOf(19))) {
            C1295b.m6501a(parcel, 19, personEntity.f5844p, i, true);
        }
        if (set.contains(Integer.valueOf(18))) {
            C1295b.m6505a(parcel, 18, personEntity.f5843o, true);
        }
        if (set.contains(Integer.valueOf(21))) {
            C1295b.m6496a(parcel, 21, personEntity.f5846r);
        }
        if (set.contains(Integer.valueOf(20))) {
            C1295b.m6505a(parcel, 20, personEntity.f5845q, true);
        }
        if (set.contains(Integer.valueOf(23))) {
            C1295b.m6515b(parcel, 23, personEntity.f5848t, true);
        }
        if (set.contains(Integer.valueOf(22))) {
            C1295b.m6515b(parcel, 22, personEntity.f5847s, true);
        }
        if (set.contains(Integer.valueOf(25))) {
            C1295b.m6496a(parcel, 25, personEntity.f5850v);
        }
        if (set.contains(Integer.valueOf(24))) {
            C1295b.m6496a(parcel, 24, personEntity.f5849u);
        }
        if (set.contains(Integer.valueOf(27))) {
            C1295b.m6505a(parcel, 27, personEntity.f5852x, true);
        }
        if (set.contains(Integer.valueOf(26))) {
            C1295b.m6505a(parcel, 26, personEntity.f5851w, true);
        }
        if (set.contains(Integer.valueOf(29))) {
            C1295b.m6507a(parcel, 29, personEntity.f5854z);
        }
        if (set.contains(Integer.valueOf(28))) {
            C1295b.m6515b(parcel, 28, personEntity.f5853y, true);
        }
        C1295b.m6494a(parcel, a);
    }

    public PersonEntity m9569a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        Set hashSet = new HashSet();
        int i = 0;
        String str = null;
        AgeRangeEntity ageRangeEntity = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        CoverEntity coverEntity = null;
        String str4 = null;
        String str5 = null;
        int i3 = 0;
        String str6 = null;
        ImageEntity imageEntity = null;
        boolean z = false;
        String str7 = null;
        NameEntity nameEntity = null;
        String str8 = null;
        int i4 = 0;
        List list = null;
        List list2 = null;
        int i5 = 0;
        int i6 = 0;
        String str9 = null;
        String str10 = null;
        List list3 = null;
        boolean z2 = false;
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
                case 3:
                    AgeRangeEntity ageRangeEntity2 = (AgeRangeEntity) C1294a.m6462a(parcel, a, AgeRangeEntity.CREATOR);
                    hashSet.add(Integer.valueOf(3));
                    ageRangeEntity = ageRangeEntity2;
                    break;
                case 4:
                    str2 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str3 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    i2 = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case 7:
                    CoverEntity coverEntity2 = (CoverEntity) C1294a.m6462a(parcel, a, CoverEntity.CREATOR);
                    hashSet.add(Integer.valueOf(7));
                    coverEntity = coverEntity2;
                    break;
                case 8:
                    str4 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(8));
                    break;
                case 9:
                    str5 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(9));
                    break;
                case 12:
                    i3 = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(12));
                    break;
                case 14:
                    str6 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(14));
                    break;
                case 15:
                    ImageEntity imageEntity2 = (ImageEntity) C1294a.m6462a(parcel, a, ImageEntity.CREATOR);
                    hashSet.add(Integer.valueOf(15));
                    imageEntity = imageEntity2;
                    break;
                case 16:
                    z = C1294a.m6469c(parcel, a);
                    hashSet.add(Integer.valueOf(16));
                    break;
                case 18:
                    str7 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(18));
                    break;
                case 19:
                    NameEntity nameEntity2 = (NameEntity) C1294a.m6462a(parcel, a, (Creator) NameEntity.CREATOR);
                    hashSet.add(Integer.valueOf(19));
                    nameEntity = nameEntity2;
                    break;
                case 20:
                    str8 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(20));
                    break;
                case 21:
                    i4 = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(21));
                    break;
                case 22:
                    list = C1294a.m6468c(parcel, a, OrganizationsEntity.CREATOR);
                    hashSet.add(Integer.valueOf(22));
                    break;
                case 23:
                    list2 = C1294a.m6468c(parcel, a, PlacesLivedEntity.CREATOR);
                    hashSet.add(Integer.valueOf(23));
                    break;
                case 24:
                    i5 = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(24));
                    break;
                case 25:
                    i6 = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(25));
                    break;
                case 26:
                    str9 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(26));
                    break;
                case C0274i.Theme_actionModeStyle /*27*/:
                    str10 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(27));
                    break;
                case C0274i.Theme_actionModeCloseButtonStyle /*28*/:
                    list3 = C1294a.m6468c(parcel, a, UrlsEntity.CREATOR);
                    hashSet.add(Integer.valueOf(28));
                    break;
                case C0274i.Theme_actionModeBackground /*29*/:
                    z2 = C1294a.m6469c(parcel, a);
                    hashSet.add(Integer.valueOf(29));
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PersonEntity(hashSet, i, str, ageRangeEntity, str2, str3, i2, coverEntity, str4, str5, i3, str6, imageEntity, z, str7, nameEntity, str8, i4, list, list2, i5, i6, str9, str10, list3, z2);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public PersonEntity[] m9570a(int i) {
        return new PersonEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9569a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9570a(i);
    }
}
