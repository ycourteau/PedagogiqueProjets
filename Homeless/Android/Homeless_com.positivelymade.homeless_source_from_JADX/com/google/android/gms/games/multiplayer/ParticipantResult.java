package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.internal.p041b.C1831a;

public final class ParticipantResult implements SafeParcelable {
    public static final Creator<ParticipantResult> CREATOR = new C1873e();
    private final int f5678a;
    private final String f5679b;
    private final int f5680c;
    private final int f5681d;

    public ParticipantResult(int i, String str, int i2, int i3) {
        this.f5678a = i;
        this.f5679b = (String) C1305x.m6617a((Object) str);
        C1305x.m6621a(C1831a.m8599a(i2));
        this.f5680c = i2;
        this.f5681d = i3;
    }

    public int m9273a() {
        return this.f5678a;
    }

    public String m9274b() {
        return this.f5679b;
    }

    public int m9275c() {
        return this.f5680c;
    }

    public int m9276d() {
        return this.f5681d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1873e.m9277a(this, parcel, i);
    }
}
