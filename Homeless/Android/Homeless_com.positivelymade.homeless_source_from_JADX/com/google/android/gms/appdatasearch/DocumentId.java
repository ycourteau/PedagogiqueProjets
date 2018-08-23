package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DocumentId implements SafeParcelable {
    public static final C0790c CREATOR = new C0790c();
    final int f2270a;
    final String f2271b;
    final String f2272c;
    final String f2273d;

    DocumentId(int i, String str, String str2, String str3) {
        this.f2270a = i;
        this.f2271b = str;
        this.f2272c = str2;
        this.f2273d = str3;
    }

    public int describeContents() {
        C0790c c0790c = CREATOR;
        return 0;
    }

    public String toString() {
        return String.format("DocumentId[packageName=%s, corpusName=%s, uri=%s]", new Object[]{this.f2271b, this.f2272c, this.f2273d});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C0790c c0790c = CREATOR;
        C0790c.m3730a(this, parcel, i);
    }
}
