package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class Scope implements SafeParcelable {
    public static final Creator<Scope> CREATOR = new C1219t();
    final int f4092a;
    private final String f4093b;

    Scope(int i, String str) {
        C1305x.m6620a(str, (Object) "scopeUri must not be null or empty");
        this.f4092a = i;
        this.f4093b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public String m5965a() {
        return this.f4093b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj ? true : !(obj instanceof Scope) ? false : this.f4093b.equals(((Scope) obj).f4093b);
    }

    public int hashCode() {
        return this.f4093b.hashCode();
    }

    public String toString() {
        return this.f4093b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1219t.m6170a(this, parcel, i);
    }
}
