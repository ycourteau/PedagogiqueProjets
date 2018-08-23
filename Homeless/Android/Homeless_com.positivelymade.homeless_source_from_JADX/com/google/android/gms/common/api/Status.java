package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class Status implements C0774g, SafeParcelable {
    public static final Creator<Status> CREATOR = new C1220u();
    public static final Status f4094a = new Status(0);
    public static final Status f4095b = new Status(14);
    public static final Status f4096c = new Status(8);
    public static final Status f4097d = new Status(15);
    public static final Status f4098e = new Status(16);
    private final int f4099f;
    private final int f4100g;
    private final String f4101h;
    private final PendingIntent f4102i;

    public Status(int i) {
        this(i, null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f4099f = i;
        this.f4100g = i2;
        this.f4101h = str;
        this.f4102i = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    private String m5966g() {
        return this.f4101h != null ? this.f4101h : C1174b.m5984a(this.f4100g);
    }

    public Status mo558a() {
        return this;
    }

    PendingIntent m5968b() {
        return this.f4102i;
    }

    public String m5969c() {
        return this.f4101h;
    }

    int m5970d() {
        return this.f4099f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean m5971e() {
        return this.f4100g <= 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4099f == status.f4099f && this.f4100g == status.f4100g && C1304w.m6615a(this.f4101h, status.f4101h) && C1304w.m6615a(this.f4102i, status.f4102i);
    }

    public int m5972f() {
        return this.f4100g;
    }

    public int hashCode() {
        return C1304w.m6613a(Integer.valueOf(this.f4099f), Integer.valueOf(this.f4100g), this.f4101h, this.f4102i);
    }

    public String toString() {
        return C1304w.m6614a((Object) this).m6612a("statusCode", m5966g()).m6612a("resolution", this.f4102i).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1220u.m6173a(this, parcel, i);
    }
}
