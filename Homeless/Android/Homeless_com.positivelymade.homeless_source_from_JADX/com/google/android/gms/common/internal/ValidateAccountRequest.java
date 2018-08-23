package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C1229b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ValidateAccountRequest implements SafeParcelable {
    public static final Creator<ValidateAccountRequest> CREATOR = new C1250c();
    final int f4314a;
    final IBinder f4315b;
    private final int f4316c;
    private final Scope[] f4317d;
    private final Bundle f4318e;
    private final String f4319f;

    ValidateAccountRequest(int i, int i2, IBinder iBinder, Scope[] scopeArr, Bundle bundle, String str) {
        this.f4314a = i;
        this.f4316c = i2;
        this.f4315b = iBinder;
        this.f4317d = scopeArr;
        this.f4318e = bundle;
        this.f4319f = str;
    }

    public ValidateAccountRequest(C1246r c1246r, Scope[] scopeArr, String str, Bundle bundle) {
        this(1, C1229b.f4245a, c1246r == null ? null : c1246r.asBinder(), scopeArr, bundle, str);
    }

    public int m6317a() {
        return this.f4316c;
    }

    public Scope[] m6318b() {
        return this.f4317d;
    }

    public String m6319c() {
        return this.f4319f;
    }

    public Bundle m6320d() {
        return this.f4318e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1250c.m6329a(this, parcel, i);
    }
}
