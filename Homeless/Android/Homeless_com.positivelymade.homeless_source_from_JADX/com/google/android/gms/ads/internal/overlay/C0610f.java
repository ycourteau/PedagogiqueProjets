package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;

public class C0610f implements Creator<AdOverlayInfoParcel> {
    static void m2740a(AdOverlayInfoParcel adOverlayInfoParcel, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, adOverlayInfoParcel.f1594a);
        C1295b.m6501a(parcel, 2, adOverlayInfoParcel.f1595b, i, false);
        C1295b.m6499a(parcel, 3, adOverlayInfoParcel.m2654a(), false);
        C1295b.m6499a(parcel, 4, adOverlayInfoParcel.m2655b(), false);
        C1295b.m6499a(parcel, 5, adOverlayInfoParcel.m2656c(), false);
        C1295b.m6499a(parcel, 6, adOverlayInfoParcel.m2657d(), false);
        C1295b.m6505a(parcel, 7, adOverlayInfoParcel.f1600g, false);
        C1295b.m6507a(parcel, 8, adOverlayInfoParcel.f1601h);
        C1295b.m6505a(parcel, 9, adOverlayInfoParcel.f1602i, false);
        C1295b.m6499a(parcel, 10, adOverlayInfoParcel.m2659f(), false);
        C1295b.m6496a(parcel, 11, adOverlayInfoParcel.f1604k);
        C1295b.m6496a(parcel, 12, adOverlayInfoParcel.f1605l);
        C1295b.m6505a(parcel, 13, adOverlayInfoParcel.f1606m, false);
        C1295b.m6501a(parcel, 14, adOverlayInfoParcel.f1607n, i, false);
        C1295b.m6499a(parcel, 15, adOverlayInfoParcel.m2658e(), false);
        C1295b.m6501a(parcel, 17, adOverlayInfoParcel.f1610q, i, false);
        C1295b.m6505a(parcel, 16, adOverlayInfoParcel.f1609p, false);
        C1295b.m6494a(parcel, a);
    }

    public AdOverlayInfoParcel m2741a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        AdLauncherIntentInfoParcel adLauncherIntentInfoParcel = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        IBinder iBinder5 = null;
        int i2 = 0;
        int i3 = 0;
        String str3 = null;
        VersionInfoParcel versionInfoParcel = null;
        IBinder iBinder6 = null;
        String str4 = null;
        InterstitialAdParameterParcel interstitialAdParameterParcel = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    adLauncherIntentInfoParcel = (AdLauncherIntentInfoParcel) C1294a.m6462a(parcel, a, AdLauncherIntentInfoParcel.CREATOR);
                    break;
                case 3:
                    iBinder = C1294a.m6480n(parcel, a);
                    break;
                case 4:
                    iBinder2 = C1294a.m6480n(parcel, a);
                    break;
                case 5:
                    iBinder3 = C1294a.m6480n(parcel, a);
                    break;
                case 6:
                    iBinder4 = C1294a.m6480n(parcel, a);
                    break;
                case 7:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 8:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 9:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 10:
                    iBinder5 = C1294a.m6480n(parcel, a);
                    break;
                case 11:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 12:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 13:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) C1294a.m6462a(parcel, a, (Creator) VersionInfoParcel.CREATOR);
                    break;
                case 15:
                    iBinder6 = C1294a.m6480n(parcel, a);
                    break;
                case 16:
                    str4 = C1294a.m6479m(parcel, a);
                    break;
                case 17:
                    interstitialAdParameterParcel = (InterstitialAdParameterParcel) C1294a.m6462a(parcel, a, (Creator) InterstitialAdParameterParcel.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AdOverlayInfoParcel(i, adLauncherIntentInfoParcel, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i2, i3, str3, versionInfoParcel, iBinder6, str4, interstitialAdParameterParcel);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public AdOverlayInfoParcel[] m2742a(int i) {
        return new AdOverlayInfoParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m2741a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m2742a(i);
    }
}
