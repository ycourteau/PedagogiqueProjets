package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1305x;

public abstract class WriteAwareParcelable implements Parcelable {
    private volatile transient boolean f5044a = false;

    protected abstract void mo1046a(Parcel parcel, int i);

    public final boolean m7526a() {
        return this.f5044a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1305x.m6621a(!m7526a());
        this.f5044a = true;
        mo1046a(parcel, i);
    }
}
