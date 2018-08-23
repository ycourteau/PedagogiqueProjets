package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ConnectionEvent implements SafeParcelable {
    public static final Creator<ConnectionEvent> CREATOR = new C1529a();
    final int f4562a;
    private final long f4563b;
    private int f4564c;
    private final String f4565d;
    private final String f4566e;
    private final String f4567f;
    private final String f4568g;
    private final String f4569h;
    private final String f4570i;
    private final long f4571j;
    private final long f4572k;
    private long f4573l;

    ConnectionEvent(int i, long j, int i2, String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
        this.f4562a = i;
        this.f4563b = j;
        this.f4564c = i2;
        this.f4565d = str;
        this.f4566e = str2;
        this.f4567f = str3;
        this.f4568g = str4;
        this.f4573l = -1;
        this.f4569h = str5;
        this.f4570i = str6;
        this.f4571j = j2;
        this.f4572k = j3;
    }

    public ConnectionEvent(long j, int i, String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3) {
        this(1, j, i, str, str2, str3, str4, str5, str6, j2, j3);
    }

    public long m6932a() {
        return this.f4563b;
    }

    public int m6933b() {
        return this.f4564c;
    }

    public String m6934c() {
        return this.f4565d;
    }

    public String m6935d() {
        return this.f4566e;
    }

    public int describeContents() {
        return 0;
    }

    public String m6936e() {
        return this.f4567f;
    }

    public String m6937f() {
        return this.f4568g;
    }

    public String m6938g() {
        return this.f4569h;
    }

    public String m6939h() {
        return this.f4570i;
    }

    public long m6940i() {
        return this.f4572k;
    }

    public long m6941j() {
        return this.f4571j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1529a.m6953a(this, parcel, i);
    }
}
