package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p028c.fn;
import java.util.Collections;
import java.util.List;

@fn
public final class AdRequestInfoParcel implements SafeParcelable {
    public static final C0657f CREATOR = new C0657f();
    public final List<String> f1831A;
    public final String f1832B;
    public final NativeAdOptionsParcel f1833C;
    public final List<String> f1834D;
    public final long f1835E;
    public final CapabilityParcel f1836F;
    public final int f1837a;
    public final Bundle f1838b;
    public final AdRequestParcel f1839c;
    public final AdSizeParcel f1840d;
    public final String f1841e;
    public final ApplicationInfo f1842f;
    public final PackageInfo f1843g;
    public final String f1844h;
    public final String f1845i;
    public final String f1846j;
    public final VersionInfoParcel f1847k;
    public final Bundle f1848l;
    public final int f1849m;
    public final List<String> f1850n;
    public final Bundle f1851o;
    public final boolean f1852p;
    public final Messenger f1853q;
    public final int f1854r;
    public final int f1855s;
    public final float f1856t;
    public final String f1857u;
    public final boolean f1858v;
    public final int f1859w;
    public final String f1860x;
    public final long f1861y;
    public final String f1862z;

    @fn
    public static final class C0638a {
        public final NativeAdOptionsParcel f1803A;
        public final CapabilityParcel f1804B;
        public final Bundle f1805a;
        public final AdRequestParcel f1806b;
        public final AdSizeParcel f1807c;
        public final String f1808d;
        public final ApplicationInfo f1809e;
        public final PackageInfo f1810f;
        public final String f1811g;
        public final String f1812h;
        public final Bundle f1813i;
        public final VersionInfoParcel f1814j;
        public final int f1815k;
        public final List<String> f1816l;
        public final List<String> f1817m;
        public final Bundle f1818n;
        public final boolean f1819o;
        public final Messenger f1820p;
        public final int f1821q;
        public final int f1822r;
        public final float f1823s;
        public final String f1824t;
        public final boolean f1825u;
        public final int f1826v;
        public final long f1827w;
        public final String f1828x;
        public final List<String> f1829y;
        public final String f1830z;

        public C0638a(Bundle bundle, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, VersionInfoParcel versionInfoParcel, Bundle bundle2, List<String> list, List<String> list2, Bundle bundle3, boolean z, Messenger messenger, int i, int i2, float f, String str4, boolean z2, int i3, long j, String str5, List<String> list3, String str6, NativeAdOptionsParcel nativeAdOptionsParcel, CapabilityParcel capabilityParcel) {
            this.f1805a = bundle;
            this.f1806b = adRequestParcel;
            this.f1807c = adSizeParcel;
            this.f1808d = str;
            this.f1809e = applicationInfo;
            this.f1810f = packageInfo;
            this.f1811g = str2;
            this.f1812h = str3;
            this.f1814j = versionInfoParcel;
            this.f1813i = bundle2;
            this.f1819o = z;
            this.f1820p = messenger;
            this.f1821q = i;
            this.f1822r = i2;
            this.f1823s = f;
            if (list == null || list.size() <= 0) {
                this.f1815k = 0;
                this.f1816l = null;
                this.f1817m = null;
            } else {
                this.f1815k = 3;
                this.f1816l = list;
                this.f1817m = list2;
            }
            this.f1818n = bundle3;
            this.f1824t = str4;
            this.f1825u = z2;
            this.f1826v = i3;
            this.f1827w = j;
            this.f1828x = str5;
            this.f1829y = list3;
            this.f1830z = str6;
            this.f1803A = nativeAdOptionsParcel;
            this.f1804B = capabilityParcel;
        }
    }

    AdRequestInfoParcel(int i, Bundle bundle, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, VersionInfoParcel versionInfoParcel, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, Messenger messenger, int i3, int i4, float f, String str5, boolean z2, int i5, String str6, long j, String str7, List<String> list2, String str8, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list3, long j2, CapabilityParcel capabilityParcel) {
        this.f1837a = i;
        this.f1838b = bundle;
        this.f1839c = adRequestParcel;
        this.f1840d = adSizeParcel;
        this.f1841e = str;
        this.f1842f = applicationInfo;
        this.f1843g = packageInfo;
        this.f1844h = str2;
        this.f1845i = str3;
        this.f1846j = str4;
        this.f1847k = versionInfoParcel;
        this.f1848l = bundle2;
        this.f1849m = i2;
        this.f1850n = list;
        this.f1834D = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.f1851o = bundle3;
        this.f1852p = z;
        this.f1853q = messenger;
        this.f1854r = i3;
        this.f1855s = i4;
        this.f1856t = f;
        this.f1857u = str5;
        this.f1858v = z2;
        this.f1859w = i5;
        this.f1860x = str6;
        this.f1861y = j;
        this.f1862z = str7;
        this.f1831A = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f1832B = str8;
        this.f1833C = nativeAdOptionsParcel;
        this.f1835E = j2;
        this.f1836F = capabilityParcel;
    }

    public AdRequestInfoParcel(Bundle bundle, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, VersionInfoParcel versionInfoParcel, Bundle bundle2, int i, List<String> list, List<String> list2, Bundle bundle3, boolean z, Messenger messenger, int i2, int i3, float f, String str5, boolean z2, int i4, String str6, long j, String str7, List<String> list3, String str8, NativeAdOptionsParcel nativeAdOptionsParcel, long j2, CapabilityParcel capabilityParcel) {
        this(11, bundle, adRequestParcel, adSizeParcel, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i, list, bundle3, z, messenger, i2, i3, f, str5, z2, i4, str6, j, str7, list3, str8, nativeAdOptionsParcel, list2, j2, capabilityParcel);
    }

    public AdRequestInfoParcel(C0638a c0638a, String str, String str2, long j) {
        this(c0638a.f1805a, c0638a.f1806b, c0638a.f1807c, c0638a.f1808d, c0638a.f1809e, c0638a.f1810f, str, c0638a.f1811g, c0638a.f1812h, c0638a.f1814j, c0638a.f1813i, c0638a.f1815k, c0638a.f1816l, c0638a.f1817m, c0638a.f1818n, c0638a.f1819o, c0638a.f1820p, c0638a.f1821q, c0638a.f1822r, c0638a.f1823s, c0638a.f1824t, c0638a.f1825u, c0638a.f1826v, str2, c0638a.f1827w, c0638a.f1828x, c0638a.f1829y, c0638a.f1830z, c0638a.f1803A, j, c0638a.f1804B);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0657f.m3002a(this, parcel, i);
    }
}
