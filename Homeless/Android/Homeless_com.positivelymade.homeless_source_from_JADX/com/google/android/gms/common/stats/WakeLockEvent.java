package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public final class WakeLockEvent implements SafeParcelable {
    public static final Creator<WakeLockEvent> CREATOR = new C1537g();
    final int f4574a;
    private final long f4575b;
    private int f4576c;
    private final String f4577d;
    private final int f4578e;
    private final List<String> f4579f;
    private final String f4580g;
    private final long f4581h;
    private int f4582i;
    private final String f4583j;
    private final String f4584k;
    private final float f4585l;
    private long f4586m;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f) {
        this.f4574a = i;
        this.f4575b = j;
        this.f4576c = i2;
        this.f4577d = str;
        this.f4583j = str3;
        this.f4578e = i3;
        this.f4586m = -1;
        this.f4579f = list;
        this.f4580g = str2;
        this.f4581h = j2;
        this.f4582i = i4;
        this.f4584k = str4;
        this.f4585l = f;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f) {
        this(1, j, i, str, i2, list, str2, j2, i3, str3, str4, f);
    }

    public long m6942a() {
        return this.f4575b;
    }

    public int m6943b() {
        return this.f4576c;
    }

    public String m6944c() {
        return this.f4577d;
    }

    public String m6945d() {
        return this.f4583j;
    }

    public int describeContents() {
        return 0;
    }

    public int m6946e() {
        return this.f4578e;
    }

    public List<String> m6947f() {
        return this.f4579f;
    }

    public String m6948g() {
        return this.f4580g;
    }

    public long m6949h() {
        return this.f4581h;
    }

    public int m6950i() {
        return this.f4582i;
    }

    public String m6951j() {
        return this.f4584k;
    }

    public float m6952k() {
        return this.f4585l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1537g.m6972a(this, parcel, i);
    }
}
