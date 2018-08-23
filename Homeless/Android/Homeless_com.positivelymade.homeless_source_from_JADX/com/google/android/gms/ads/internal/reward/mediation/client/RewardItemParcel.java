package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p028c.fn;

@fn
public final class RewardItemParcel implements SafeParcelable {
    public static final C0689c CREATOR = new C0689c();
    public final int f1970a;
    public final String f1971b;
    public final int f1972c;

    public RewardItemParcel(int i, String str, int i2) {
        this.f1970a = i;
        this.f1971b = str;
        this.f1972c = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0689c.m3075a(this, parcel, i);
    }
}
