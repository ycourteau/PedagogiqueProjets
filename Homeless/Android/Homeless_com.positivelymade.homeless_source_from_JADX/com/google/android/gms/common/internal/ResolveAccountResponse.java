package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C1246r.C1247a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ResolveAccountResponse implements SafeParcelable {
    public static final Creator<ResolveAccountResponse> CREATOR = new C1307z();
    final int f4309a;
    IBinder f4310b;
    private ConnectionResult f4311c;
    private boolean f4312d;
    private boolean f4313e;

    public ResolveAccountResponse(int i) {
        this(new ConnectionResult(i, null));
    }

    ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f4309a = i;
        this.f4310b = iBinder;
        this.f4311c = connectionResult;
        this.f4312d = z;
        this.f4313e = z2;
    }

    public ResolveAccountResponse(ConnectionResult connectionResult) {
        this(1, null, connectionResult, false, false);
    }

    public C1246r m6313a() {
        return C1247a.m6322a(this.f4310b);
    }

    public ConnectionResult m6314b() {
        return this.f4311c;
    }

    public boolean m6315c() {
        return this.f4312d;
    }

    public boolean m6316d() {
        return this.f4313e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f4311c.equals(resolveAccountResponse.f4311c) && m6313a().equals(resolveAccountResponse.m6313a());
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1307z.m6632a(this, parcel, i);
    }
}
