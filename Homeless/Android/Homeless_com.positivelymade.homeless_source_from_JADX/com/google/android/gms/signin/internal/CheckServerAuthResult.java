package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CheckServerAuthResult implements SafeParcelable {
    public static final Creator<CheckServerAuthResult> CREATOR = new C1919c();
    final int f5880a;
    final boolean f5881b;
    final List<Scope> f5882c;

    CheckServerAuthResult(int i, boolean z, List<Scope> list) {
        this.f5880a = i;
        this.f5881b = z;
        this.f5882c = list;
    }

    public CheckServerAuthResult(boolean z, Set<Scope> set) {
        this(1, z, m9622a(set));
    }

    private static List<Scope> m9622a(Set<Scope> set) {
        return set == null ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(set));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1919c.m9629a(this, parcel, i);
    }
}
