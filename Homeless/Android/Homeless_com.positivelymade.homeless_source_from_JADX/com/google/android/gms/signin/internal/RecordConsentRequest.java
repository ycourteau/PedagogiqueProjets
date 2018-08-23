package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class RecordConsentRequest implements SafeParcelable {
    public static final Creator<RecordConsentRequest> CREATOR = new C1926g();
    final int f5883a;
    private final Account f5884b;
    private final Scope[] f5885c;
    private final String f5886d;

    RecordConsentRequest(int i, Account account, Scope[] scopeArr, String str) {
        this.f5883a = i;
        this.f5884b = account;
        this.f5885c = scopeArr;
        this.f5886d = str;
    }

    public Account m9623a() {
        return this.f5884b;
    }

    public Scope[] m9624b() {
        return this.f5885c;
    }

    public String m9625c() {
        return this.f5886d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1926g.m9657a(this, parcel, i);
    }
}
