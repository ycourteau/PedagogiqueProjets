package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v7.p010b.C0275a.C0274i;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import java.util.List;

public class C0657f implements Creator<AdRequestInfoParcel> {
    static void m3002a(AdRequestInfoParcel adRequestInfoParcel, Parcel parcel, int i) {
        int a = C1295b.m6493a(parcel);
        C1295b.m6496a(parcel, 1, adRequestInfoParcel.f1837a);
        C1295b.m6498a(parcel, 2, adRequestInfoParcel.f1838b, false);
        C1295b.m6501a(parcel, 3, adRequestInfoParcel.f1839c, i, false);
        C1295b.m6501a(parcel, 4, adRequestInfoParcel.f1840d, i, false);
        C1295b.m6505a(parcel, 5, adRequestInfoParcel.f1841e, false);
        C1295b.m6501a(parcel, 6, adRequestInfoParcel.f1842f, i, false);
        C1295b.m6501a(parcel, 7, adRequestInfoParcel.f1843g, i, false);
        C1295b.m6505a(parcel, 8, adRequestInfoParcel.f1844h, false);
        C1295b.m6505a(parcel, 9, adRequestInfoParcel.f1845i, false);
        C1295b.m6505a(parcel, 10, adRequestInfoParcel.f1846j, false);
        C1295b.m6501a(parcel, 11, adRequestInfoParcel.f1847k, i, false);
        C1295b.m6498a(parcel, 12, adRequestInfoParcel.f1848l, false);
        C1295b.m6496a(parcel, 13, adRequestInfoParcel.f1849m);
        C1295b.m6506a(parcel, 14, adRequestInfoParcel.f1850n, false);
        C1295b.m6498a(parcel, 15, adRequestInfoParcel.f1851o, false);
        C1295b.m6501a(parcel, 17, adRequestInfoParcel.f1853q, i, false);
        C1295b.m6507a(parcel, 16, adRequestInfoParcel.f1852p);
        C1295b.m6496a(parcel, 19, adRequestInfoParcel.f1855s);
        C1295b.m6496a(parcel, 18, adRequestInfoParcel.f1854r);
        C1295b.m6505a(parcel, 21, adRequestInfoParcel.f1857u, false);
        C1295b.m6495a(parcel, 20, adRequestInfoParcel.f1856t);
        C1295b.m6496a(parcel, 23, adRequestInfoParcel.f1859w);
        C1295b.m6507a(parcel, 22, adRequestInfoParcel.f1858v);
        C1295b.m6497a(parcel, 25, adRequestInfoParcel.f1861y);
        C1295b.m6505a(parcel, 24, adRequestInfoParcel.f1860x, false);
        C1295b.m6506a(parcel, 27, adRequestInfoParcel.f1831A, false);
        C1295b.m6505a(parcel, 26, adRequestInfoParcel.f1862z, false);
        C1295b.m6501a(parcel, 29, adRequestInfoParcel.f1833C, i, false);
        C1295b.m6505a(parcel, 28, adRequestInfoParcel.f1832B, false);
        C1295b.m6497a(parcel, 31, adRequestInfoParcel.f1835E);
        C1295b.m6506a(parcel, 30, adRequestInfoParcel.f1834D, false);
        C1295b.m6501a(parcel, 32, adRequestInfoParcel.f1836F, i, false);
        C1295b.m6494a(parcel, a);
    }

    public AdRequestInfoParcel m3003a(Parcel parcel) {
        int b = C1294a.m6465b(parcel);
        int i = 0;
        Bundle bundle = null;
        AdRequestParcel adRequestParcel = null;
        AdSizeParcel adSizeParcel = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        VersionInfoParcel versionInfoParcel = null;
        Bundle bundle2 = null;
        int i2 = 0;
        List list = null;
        Bundle bundle3 = null;
        boolean z = false;
        Messenger messenger = null;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        String str5 = null;
        boolean z2 = false;
        int i5 = 0;
        String str6 = null;
        long j = 0;
        String str7 = null;
        List list2 = null;
        String str8 = null;
        NativeAdOptionsParcel nativeAdOptionsParcel = null;
        List list3 = null;
        long j2 = 0;
        CapabilityParcel capabilityParcel = null;
        while (parcel.dataPosition() < b) {
            int a = C1294a.m6460a(parcel);
            switch (C1294a.m6459a(a)) {
                case 1:
                    i = C1294a.m6471e(parcel, a);
                    break;
                case 2:
                    bundle = C1294a.m6481o(parcel, a);
                    break;
                case 3:
                    adRequestParcel = (AdRequestParcel) C1294a.m6462a(parcel, a, AdRequestParcel.CREATOR);
                    break;
                case 4:
                    adSizeParcel = (AdSizeParcel) C1294a.m6462a(parcel, a, AdSizeParcel.CREATOR);
                    break;
                case 5:
                    str = C1294a.m6479m(parcel, a);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) C1294a.m6462a(parcel, a, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) C1294a.m6462a(parcel, a, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = C1294a.m6479m(parcel, a);
                    break;
                case 9:
                    str3 = C1294a.m6479m(parcel, a);
                    break;
                case 10:
                    str4 = C1294a.m6479m(parcel, a);
                    break;
                case 11:
                    versionInfoParcel = (VersionInfoParcel) C1294a.m6462a(parcel, a, VersionInfoParcel.CREATOR);
                    break;
                case 12:
                    bundle2 = C1294a.m6481o(parcel, a);
                    break;
                case 13:
                    i2 = C1294a.m6471e(parcel, a);
                    break;
                case 14:
                    list = C1294a.m6491y(parcel, a);
                    break;
                case 15:
                    bundle3 = C1294a.m6481o(parcel, a);
                    break;
                case 16:
                    z = C1294a.m6469c(parcel, a);
                    break;
                case 17:
                    messenger = (Messenger) C1294a.m6462a(parcel, a, Messenger.CREATOR);
                    break;
                case 18:
                    i3 = C1294a.m6471e(parcel, a);
                    break;
                case 19:
                    i4 = C1294a.m6471e(parcel, a);
                    break;
                case 20:
                    f = C1294a.m6476j(parcel, a);
                    break;
                case 21:
                    str5 = C1294a.m6479m(parcel, a);
                    break;
                case 22:
                    z2 = C1294a.m6469c(parcel, a);
                    break;
                case 23:
                    i5 = C1294a.m6471e(parcel, a);
                    break;
                case 24:
                    str6 = C1294a.m6479m(parcel, a);
                    break;
                case 25:
                    j = C1294a.m6473g(parcel, a);
                    break;
                case 26:
                    str7 = C1294a.m6479m(parcel, a);
                    break;
                case C0274i.Theme_actionModeStyle /*27*/:
                    list2 = C1294a.m6491y(parcel, a);
                    break;
                case C0274i.Theme_actionModeCloseButtonStyle /*28*/:
                    str8 = C1294a.m6479m(parcel, a);
                    break;
                case C0274i.Theme_actionModeBackground /*29*/:
                    nativeAdOptionsParcel = (NativeAdOptionsParcel) C1294a.m6462a(parcel, a, (Creator) NativeAdOptionsParcel.CREATOR);
                    break;
                case C0274i.Theme_actionModeSplitBackground /*30*/:
                    list3 = C1294a.m6491y(parcel, a);
                    break;
                case C0274i.Theme_actionModeCloseDrawable /*31*/:
                    j2 = C1294a.m6473g(parcel, a);
                    break;
                case C0274i.Theme_actionModeCutDrawable /*32*/:
                    capabilityParcel = (CapabilityParcel) C1294a.m6462a(parcel, a, CapabilityParcel.CREATOR);
                    break;
                default:
                    C1294a.m6466b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AdRequestInfoParcel(i, bundle, adRequestParcel, adSizeParcel, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i2, list, bundle3, z, messenger, i3, i4, f, str5, z2, i5, str6, j, str7, list2, str8, nativeAdOptionsParcel, list3, j2, capabilityParcel);
        }
        throw new C1293a("Overread allowed size end=" + b, parcel);
    }

    public AdRequestInfoParcel[] m3004a(int i) {
        return new AdRequestInfoParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3003a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3004a(i);
    }
}
