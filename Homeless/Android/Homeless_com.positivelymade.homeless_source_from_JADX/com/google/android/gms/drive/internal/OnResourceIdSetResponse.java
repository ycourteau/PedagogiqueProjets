package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class OnResourceIdSetResponse implements SafeParcelable {
    public static final Creator<OnResourceIdSetResponse> CREATOR = new ae();
    private final int f5216a;
    private final List<String> f5217b;

    OnResourceIdSetResponse(int i, List<String> list) {
        this.f5216a = i;
        this.f5217b = list;
    }

    public int m7571a() {
        return this.f5216a;
    }

    public List<String> m7572b() {
        return this.f5217b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ae.m7588a(this, parcel, i);
    }
}
