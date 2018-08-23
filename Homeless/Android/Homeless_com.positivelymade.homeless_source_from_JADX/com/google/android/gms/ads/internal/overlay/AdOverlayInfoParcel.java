package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.client.C0428a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p028c.cd;
import com.google.android.gms.p028c.ci;
import com.google.android.gms.p028c.fn;
import com.google.android.gms.p028c.hg;
import com.google.android.gms.p029b.C0799a.C0801a;
import com.google.android.gms.p029b.C0802b;

@fn
public final class AdOverlayInfoParcel implements SafeParcelable {
    public static final C0610f CREATOR = new C0610f();
    public final int f1594a;
    public final AdLauncherIntentInfoParcel f1595b;
    public final C0428a f1596c;
    public final C0497g f1597d;
    public final hg f1598e;
    public final cd f1599f;
    public final String f1600g;
    public final boolean f1601h;
    public final String f1602i;
    public final C0492n f1603j;
    public final int f1604k;
    public final int f1605l;
    public final String f1606m;
    public final VersionInfoParcel f1607n;
    public final ci f1608o;
    public final String f1609p;
    public final InterstitialAdParameterParcel f1610q;

    AdOverlayInfoParcel(int i, AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, VersionInfoParcel versionInfoParcel, IBinder iBinder6, String str4, InterstitialAdParameterParcel interstitialAdParameterParcel) {
        this.f1594a = i;
        this.f1595b = adLauncherIntentInfoParcel;
        this.f1596c = (C0428a) C0802b.m3755a(C0801a.m3753a(iBinder));
        this.f1597d = (C0497g) C0802b.m3755a(C0801a.m3753a(iBinder2));
        this.f1598e = (hg) C0802b.m3755a(C0801a.m3753a(iBinder3));
        this.f1599f = (cd) C0802b.m3755a(C0801a.m3753a(iBinder4));
        this.f1600g = str;
        this.f1601h = z;
        this.f1602i = str2;
        this.f1603j = (C0492n) C0802b.m3755a(C0801a.m3753a(iBinder5));
        this.f1604k = i2;
        this.f1605l = i3;
        this.f1606m = str3;
        this.f1607n = versionInfoParcel;
        this.f1608o = (ci) C0802b.m3755a(C0801a.m3753a(iBinder6));
        this.f1609p = str4;
        this.f1610q = interstitialAdParameterParcel;
    }

    public AdOverlayInfoParcel(C0428a c0428a, C0497g c0497g, C0492n c0492n, hg hgVar, int i, VersionInfoParcel versionInfoParcel, String str, InterstitialAdParameterParcel interstitialAdParameterParcel) {
        this.f1594a = 4;
        this.f1595b = null;
        this.f1596c = c0428a;
        this.f1597d = c0497g;
        this.f1598e = hgVar;
        this.f1599f = null;
        this.f1600g = null;
        this.f1601h = false;
        this.f1602i = null;
        this.f1603j = c0492n;
        this.f1604k = i;
        this.f1605l = 1;
        this.f1606m = null;
        this.f1607n = versionInfoParcel;
        this.f1608o = null;
        this.f1609p = str;
        this.f1610q = interstitialAdParameterParcel;
    }

    public AdOverlayInfoParcel(C0428a c0428a, C0497g c0497g, C0492n c0492n, hg hgVar, boolean z, int i, VersionInfoParcel versionInfoParcel) {
        this.f1594a = 4;
        this.f1595b = null;
        this.f1596c = c0428a;
        this.f1597d = c0497g;
        this.f1598e = hgVar;
        this.f1599f = null;
        this.f1600g = null;
        this.f1601h = z;
        this.f1602i = null;
        this.f1603j = c0492n;
        this.f1604k = i;
        this.f1605l = 2;
        this.f1606m = null;
        this.f1607n = versionInfoParcel;
        this.f1608o = null;
        this.f1609p = null;
        this.f1610q = null;
    }

    public AdOverlayInfoParcel(C0428a c0428a, C0497g c0497g, cd cdVar, C0492n c0492n, hg hgVar, boolean z, int i, String str, VersionInfoParcel versionInfoParcel, ci ciVar) {
        this.f1594a = 4;
        this.f1595b = null;
        this.f1596c = c0428a;
        this.f1597d = c0497g;
        this.f1598e = hgVar;
        this.f1599f = cdVar;
        this.f1600g = null;
        this.f1601h = z;
        this.f1602i = null;
        this.f1603j = c0492n;
        this.f1604k = i;
        this.f1605l = 3;
        this.f1606m = str;
        this.f1607n = versionInfoParcel;
        this.f1608o = ciVar;
        this.f1609p = null;
        this.f1610q = null;
    }

    public AdOverlayInfoParcel(C0428a c0428a, C0497g c0497g, cd cdVar, C0492n c0492n, hg hgVar, boolean z, int i, String str, String str2, VersionInfoParcel versionInfoParcel, ci ciVar) {
        this.f1594a = 4;
        this.f1595b = null;
        this.f1596c = c0428a;
        this.f1597d = c0497g;
        this.f1598e = hgVar;
        this.f1599f = cdVar;
        this.f1600g = str2;
        this.f1601h = z;
        this.f1602i = str;
        this.f1603j = c0492n;
        this.f1604k = i;
        this.f1605l = 3;
        this.f1606m = null;
        this.f1607n = versionInfoParcel;
        this.f1608o = ciVar;
        this.f1609p = null;
        this.f1610q = null;
    }

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, C0428a c0428a, C0497g c0497g, C0492n c0492n, VersionInfoParcel versionInfoParcel) {
        this.f1594a = 4;
        this.f1595b = adLauncherIntentInfoParcel;
        this.f1596c = c0428a;
        this.f1597d = c0497g;
        this.f1598e = null;
        this.f1599f = null;
        this.f1600g = null;
        this.f1601h = false;
        this.f1602i = null;
        this.f1603j = c0492n;
        this.f1604k = -1;
        this.f1605l = 4;
        this.f1606m = null;
        this.f1607n = versionInfoParcel;
        this.f1608o = null;
        this.f1609p = null;
        this.f1610q = null;
    }

    public static AdOverlayInfoParcel m2652a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            return null;
        }
    }

    public static void m2653a(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    IBinder m2654a() {
        return C0802b.m3754a(this.f1596c).asBinder();
    }

    IBinder m2655b() {
        return C0802b.m3754a(this.f1597d).asBinder();
    }

    IBinder m2656c() {
        return C0802b.m3754a(this.f1598e).asBinder();
    }

    IBinder m2657d() {
        return C0802b.m3754a(this.f1599f).asBinder();
    }

    public int describeContents() {
        return 0;
    }

    IBinder m2658e() {
        return C0802b.m3754a(this.f1608o).asBinder();
    }

    IBinder m2659f() {
        return C0802b.m3754a(this.f1603j).asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0610f.m2740a(this, parcel, i);
    }
}
