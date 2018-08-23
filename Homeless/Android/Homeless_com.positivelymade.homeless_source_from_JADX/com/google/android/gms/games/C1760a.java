package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C1760a implements Creator<GameEntity> {
    static void m8211a(GameEntity gameEntity, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6505a(parcel, 1, gameEntity.mo1198a(), false);
        C1295b.m6505a(parcel, 2, gameEntity.mo1199b(), false);
        C1295b.m6505a(parcel, 3, gameEntity.mo1200c(), false);
        C1295b.m6505a(parcel, 4, gameEntity.mo1201d(), false);
        C1295b.m6505a(parcel, 5, gameEntity.mo1202e(), false);
        C1295b.m6505a(parcel, 6, gameEntity.mo1203f(), false);
        C1295b.m6501a(parcel, 7, gameEntity.mo1204g(), i, false);
        C1295b.m6501a(parcel, 8, gameEntity.mo1206i(), i, false);
        C1295b.m6501a(parcel, 9, gameEntity.mo1208k(), i, false);
        C1295b.m6507a(parcel, 10, gameEntity.mo1210m());
        C1295b.m6507a(parcel, 11, gameEntity.mo1213p());
        C1295b.m6505a(parcel, 12, gameEntity.mo1214q(), false);
        C1295b.m6496a(parcel, 13, gameEntity.mo1215r());
        C1295b.m6496a(parcel, 14, gameEntity.mo1216s());
        C1295b.m6496a(parcel, 15, gameEntity.mo1217t());
        C1295b.m6507a(parcel, 17, gameEntity.mo1219v());
        C1295b.m6507a(parcel, 16, gameEntity.mo1218u());
        C1295b.m6496a(parcel, 1000, gameEntity.m8247z());
        C1295b.m6505a(parcel, 19, gameEntity.mo1207j(), false);
        C1295b.m6505a(parcel, 18, gameEntity.mo1205h(), false);
        C1295b.m6507a(parcel, 21, gameEntity.mo1211n());
        C1295b.m6505a(parcel, 20, gameEntity.mo1209l(), false);
        C1295b.m6507a(parcel, 23, gameEntity.mo1220w());
        C1295b.m6507a(parcel, 22, gameEntity.mo1212o());
        C1295b.m6507a(parcel, 25, gameEntity.mo1222y());
        C1295b.m6505a(parcel, 24, gameEntity.mo1221x(), false);
        C1295b.m6494a(parcel, a);
    }

    public GameEntity mo1196a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        boolean z = false;
        boolean z2 = false;
        String str7 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        boolean z4 = false;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        String str11 = null;
        boolean z8 = false;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 2:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 3:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 4:
                    str4 = C1294a.m6479m(parcel, a);
                    break;
                case 5:
                    str5 = C1294a.m6479m(parcel, a);
                    break;
                case 6:
                    str6 = C1294a.m6479m(parcel, a);
                    break;
                case 7:
                    uri = (Uri) C1294a.m6462a(parcel, a, Uri.CREATOR);
                    break;
                case 8:
                    uri2 = (Uri) C1294a.m6462a(parcel, a, Uri.CREATOR);
                    break;
                case 9:
                    uri3 = (Uri) C1294a.m6462a(parcel, a, Uri.CREATOR);
                    break;
                case 10:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 11:
                    z2 = C1294a.m6469c(parcel, a);
                    break;
                case 12:
                    str7 = C1294a.m6479m(parcel, a);
                    break;
                case 13:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 14:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 15:
                    i4 = C1294a.m6471e(parcel, a);
                    break;
                case 16:
                    z3 = C1294a.m6469c(parcel, a);
                    break;
                case 17:
                    z4 = C1294a.m6469c(parcel, a);
                    break;
                case 18:
                    str8 = C1294a.m6479m(parcel, a);
                    break;
                case 19:
                    str9 = C1294a.m6479m(parcel, a);
                    break;
                case 20:
                    str10 = C1294a.m6479m(parcel, a);
                    break;
                case 21:
                    z5 = C1294a.m6469c(parcel, a);
                    break;
                case 22:
                    z6 = C1294a.m6469c(parcel, a);
                    break;
                case 23:
                    z7 = C1294a.m6469c(parcel, a);
                    break;
                case 24:
                    str11 = C1294a.m6479m(parcel, a);
                    break;
                case 25:
                    z8 = C1294a.m6469c(parcel, a);
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
            return new GameEntity(i, str, str2, str3, str4, str5, str6, uri, uri2, uri3, z, z2, str7, i2, i3, i4, z3, z4, str8, str9, str10, z5, z6, z7, str11, z8);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public GameEntity[] m8213a(int i) {
        return new GameEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo1196a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m8213a(i);
    }
}
