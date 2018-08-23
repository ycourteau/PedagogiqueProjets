package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1866a implements Creator<MostRecentGameInfoEntity> {
    static void m9191a(MostRecentGameInfoEntity mostRecentGameInfoEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6505a(parcel, 1, mostRecentGameInfoEntity.mo1556a(), false);
        C1295b.m6496a(parcel, 1000, mostRecentGameInfoEntity.m9183g());
        C1295b.m6505a(parcel, 2, mostRecentGameInfoEntity.mo1557b(), false);
        C1295b.m6497a(parcel, 3, mostRecentGameInfoEntity.mo1558c());
        C1295b.m6501a(parcel, 4, mostRecentGameInfoEntity.mo1559d(), i, false);
        C1295b.m6501a(parcel, 5, mostRecentGameInfoEntity.mo1560e(), i, false);
        C1295b.m6501a(parcel, 6, mostRecentGameInfoEntity.mo1561f(), i, false);
        C1295b.m6494a(parcel, a);
    }

    public MostRecentGameInfoEntity m9192a(Parcel parcel) {
        Uri uri = null;
        int b = C1294a.m6465b(parcel);
        int i = 0;
        long j = 0;
        Uri uri2 = null;
        Uri uri3 = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 2:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 4:
                    uri3 = (Uri) C1294a.m6462a(parcel, a, Uri.CREATOR);
                    break;
                case 5:
                    uri2 = (Uri) C1294a.m6462a(parcel, a, Uri.CREATOR);
                    break;
                case 6:
                    uri = (Uri) C1294a.m6462a(parcel, a, Uri.CREATOR);
                    break;
                case 1000:
                    i = C1294a.m6471e(parcel, a);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MostRecentGameInfoEntity(i, str2, str, j, uri3, uri2, uri);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public MostRecentGameInfoEntity[] m9193a(int i) {
        return new MostRecentGameInfoEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m9192a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m9193a(i);
    }
}
