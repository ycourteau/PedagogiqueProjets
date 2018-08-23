package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class CheckResourceIdsExistRequest implements SafeParcelable {
    public static final Creator<CheckResourceIdsExistRequest> CREATOR = new av();
    private final int f5106a;
    private final List<String> f5107b;

    CheckResourceIdsExistRequest(int i, List<String> list) {
        this.f5106a = i;
        this.f5107b = list;
    }

    public int m7566a() {
        return this.f5106a;
    }

    public List<String> m7567b() {
        return this.f5107b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        av.m7639a(this, parcel, i);
    }
}
