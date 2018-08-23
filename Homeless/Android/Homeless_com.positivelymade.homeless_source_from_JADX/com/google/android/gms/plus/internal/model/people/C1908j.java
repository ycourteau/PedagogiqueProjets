package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.UrlsEntity;
import java.util.HashSet;
import java.util.Set;

public class C1908j implements Creator<UrlsEntity> {
    static void m9595a(UrlsEntity urlsEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        Set set = urlsEntity.f5822a;
        if (set.contains(Integer.valueOf(1))) {
            C1295b.m6496a(parcel, 1, urlsEntity.f5823b);
        }
        if (set.contains(Integer.valueOf(3))) {
            C1295b.m6496a(parcel, 3, urlsEntity.m9560e());
        }
        if (set.contains(Integer.valueOf(4))) {
            C1295b.m6505a(parcel, 4, urlsEntity.f5826e, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            C1295b.m6505a(parcel, 5, urlsEntity.f5824c, true);
        }
        if (set.contains(Integer.valueOf(6))) {
            C1295b.m6496a(parcel, 6, urlsEntity.f5825d);
        }
        C1295b.m6494a(parcel, a);
    }

    public UrlsEntity m9596a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = C1294a.m6465b(parcel);
        Set hashSet = new HashSet();
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i3 = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 3:
                    i = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    str = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str2 = C1294a.m6479m(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    i2 = C1294a.m6471e(parcel, a);
                    hashSet.add(Integer.valueOf(6));
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new UrlsEntity(hashSet, i3, str2, i2, str, i);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public UrlsEntity[] m9597a(int i) {
        return new UrlsEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9596a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9597a(i);
    }
}
