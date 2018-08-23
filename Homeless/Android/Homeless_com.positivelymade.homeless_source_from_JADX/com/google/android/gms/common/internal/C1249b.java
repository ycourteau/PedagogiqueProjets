package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C1173a.C1170e;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;

public class C1249b<T extends IInterface> extends C0655l<T> {
    private final C1170e<T> f4323a;

    public C1249b(Context context, Looper looper, int i, C0650b c0650b, C0651c c0651c, C1266h c1266h, C1170e c1170e) {
        super(context, looper, i, c1266h, c0650b, c0651c);
        this.f4323a = c1170e;
    }

    protected String mo514a() {
        return this.f4323a.m5974a();
    }

    protected void mo904a(int i, T t) {
        this.f4323a.m5975a(i, t);
    }

    protected T mo515b(IBinder iBinder) {
        return this.f4323a.m5973a(iBinder);
    }

    protected String mo516b() {
        return this.f4323a.m5976b();
    }
}
