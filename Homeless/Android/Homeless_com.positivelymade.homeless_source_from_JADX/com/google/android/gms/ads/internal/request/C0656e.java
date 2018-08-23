package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.request.C0663j.C0665a;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.internal.C0655l;
import com.google.android.gms.common.internal.C1266h;
import com.google.android.gms.p028c.fn;

@fn
public class C0656e extends C0655l<C0663j> {
    final int f1945a;

    public C0656e(Context context, Looper looper, C0650b c0650b, C0651c c0651c, int i) {
        super(context, looper, 8, C1266h.m6363a(context), c0650b, c0651c);
        this.f1945a = i;
    }

    protected C0663j m2997a(IBinder iBinder) {
        return C0665a.m3018a(iBinder);
    }

    protected String mo514a() {
        return "com.google.android.gms.ads.service.START";
    }

    protected /* synthetic */ IInterface mo515b(IBinder iBinder) {
        return m2997a(iBinder);
    }

    protected String mo516b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public C0663j mo517c() {
        return (C0663j) super.m2994p();
    }
}
