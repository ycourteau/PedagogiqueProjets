package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class UsageInfo implements SafeParcelable {
    public static final C0797j CREATOR = new C0797j();
    final int f2333a;
    final DocumentId f2334b;
    final long f2335c;
    int f2336d;
    public final String f2337e;
    final DocumentContents f2338f;
    final boolean f2339g;
    int f2340h;
    int f2341i;

    UsageInfo(int i, DocumentId documentId, long j, int i2, String str, DocumentContents documentContents, boolean z, int i3, int i4) {
        this.f2333a = i;
        this.f2334b = documentId;
        this.f2335c = j;
        this.f2336d = i2;
        this.f2337e = str;
        this.f2338f = documentContents;
        this.f2339g = z;
        this.f2340h = i3;
        this.f2341i = i4;
    }

    public DocumentContents m3721a() {
        return this.f2338f;
    }

    public int describeContents() {
        C0797j c0797j = CREATOR;
        return 0;
    }

    public String toString() {
        return String.format("UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", new Object[]{this.f2334b, Long.valueOf(this.f2335c), Integer.valueOf(this.f2336d), Integer.valueOf(this.f2341i)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0797j c0797j = CREATOR;
        C0797j.m3749a(this, parcel, i);
    }
}
