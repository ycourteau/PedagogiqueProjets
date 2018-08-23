package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ResolveAccountRequest implements SafeParcelable {
    public static final Creator<ResolveAccountRequest> CREATOR = new C1306y();
    final int f4306a;
    private final Account f4307b;
    private final int f4308c;

    ResolveAccountRequest(int i, Account account, int i2) {
        this.f4306a = i;
        this.f4307b = account;
        this.f4308c = i2;
    }

    public ResolveAccountRequest(Account account, int i) {
        this(1, account, i);
    }

    public Account m6311a() {
        return this.f4307b;
    }

    public int m6312b() {
        return this.f4308c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1306y.m6629a(this, parcel, i);
    }
}
