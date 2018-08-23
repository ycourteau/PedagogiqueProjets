package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class FileUploadPreferencesImpl implements SafeParcelable {
    public static final Creator<FileUploadPreferencesImpl> CREATOR = new C1650e();
    final int f5152a;
    int f5153b;
    int f5154c;
    boolean f5155d;

    FileUploadPreferencesImpl(int i, int i2, int i3, boolean z) {
        this.f5152a = i;
        this.f5153b = i2;
        this.f5154c = i3;
        this.f5155d = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1650e.m7686a(this, parcel, i);
    }
}
