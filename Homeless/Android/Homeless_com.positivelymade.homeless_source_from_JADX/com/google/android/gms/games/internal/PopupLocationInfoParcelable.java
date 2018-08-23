package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.internal.C1862i.C1861a;

public final class PopupLocationInfoParcelable implements SafeParcelable {
    public static final C1859h CREATOR = new C1859h();
    private final int f5547a;
    private final Bundle f5548b;
    private final IBinder f5549c;

    PopupLocationInfoParcelable(int i, Bundle bundle, IBinder iBinder) {
        this.f5547a = i;
        this.f5548b = bundle;
        this.f5549c = iBinder;
    }

    public PopupLocationInfoParcelable(C1861a c1861a) {
        this.f5547a = 1;
        this.f5548b = c1861a.m9134a();
        this.f5549c = c1861a.f5607a;
    }

    public int m8402a() {
        return this.f5547a;
    }

    public Bundle m8403b() {
        return this.f5548b;
    }

    public IBinder m8404c() {
        return this.f5549c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1859h.m9131a(this, parcel, i);
    }
}
