package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C1229b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1246r.C1247a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;

public class GetServiceRequest implements SafeParcelable {
    public static final Creator<GetServiceRequest> CREATOR = new C1269k();
    final int f4298a;
    final int f4299b;
    int f4300c;
    String f4301d;
    IBinder f4302e;
    Scope[] f4303f;
    Bundle f4304g;
    Account f4305h;

    public GetServiceRequest(int i) {
        this.f4298a = 2;
        this.f4300c = C1229b.f4245a;
        this.f4299b = i;
    }

    GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account) {
        this.f4298a = i;
        this.f4299b = i2;
        this.f4300c = i3;
        this.f4301d = str;
        if (i < 2) {
            this.f4305h = m6305a(iBinder);
        } else {
            this.f4302e = iBinder;
            this.f4305h = account;
        }
        this.f4303f = scopeArr;
        this.f4304g = bundle;
    }

    private Account m6305a(IBinder iBinder) {
        return iBinder != null ? C1248a.m6323a(C1247a.m6322a(iBinder)) : null;
    }

    public GetServiceRequest m6306a(Account account) {
        this.f4305h = account;
        return this;
    }

    public GetServiceRequest m6307a(Bundle bundle) {
        this.f4304g = bundle;
        return this;
    }

    public GetServiceRequest m6308a(C1246r c1246r) {
        if (c1246r != null) {
            this.f4302e = c1246r.asBinder();
        }
        return this;
    }

    public GetServiceRequest m6309a(String str) {
        this.f4301d = str;
        return this;
    }

    public GetServiceRequest m6310a(Collection<Scope> collection) {
        this.f4303f = (Scope[]) collection.toArray(new Scope[collection.size()]);
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1269k.m6380a(this, parcel, i);
    }
}
