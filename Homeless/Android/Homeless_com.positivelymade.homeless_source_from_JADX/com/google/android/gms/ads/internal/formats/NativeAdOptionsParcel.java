package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import com.google.android.gms.ads.p019b.C0466b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p028c.fn;

@fn
public class NativeAdOptionsParcel implements SafeParcelable {
    public static final C0571h CREATOR = new C0571h();
    public final int f1472a;
    public final boolean f1473b;
    public final int f1474c;
    public final boolean f1475d;

    public NativeAdOptionsParcel(int i, boolean z, int i2, boolean z2) {
        this.f1472a = i;
        this.f1473b = z;
        this.f1474c = i2;
        this.f1475d = z2;
    }

    public NativeAdOptionsParcel(C0466b c0466b) {
        this(1, c0466b.m2068a(), c0466b.m2069b(), c0466b.m2070c());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0571h.m2557a(this, parcel, i);
    }
}
