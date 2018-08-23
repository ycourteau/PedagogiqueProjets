package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Set;

public class AuthAccountRequest implements SafeParcelable {
    public static final Creator<AuthAccountRequest> CREATOR = new C1252e();
    final int f4290a;
    final IBinder f4291b;
    final Scope[] f4292c;

    AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr) {
        this.f4290a = i;
        this.f4291b = iBinder;
        this.f4292c = scopeArr;
    }

    public AuthAccountRequest(C1246r c1246r, Set<Scope> set) {
        this(1, c1246r.asBinder(), (Scope[]) set.toArray(new Scope[set.size()]));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1252e.m6335a(this, parcel, i);
    }
}
