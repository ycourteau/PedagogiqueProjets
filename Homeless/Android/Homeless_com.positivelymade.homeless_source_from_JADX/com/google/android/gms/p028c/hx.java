package com.google.android.gms.p028c;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.internal.C0655l;
import com.google.android.gms.common.internal.C1266h;
import com.google.android.gms.p028c.hu.C1028a;

public class hx extends C0655l<hu> {
    public hx(Context context, Looper looper, C1266h c1266h, C0650b c0650b, C0651c c0651c) {
        super(context, looper, 19, c1266h, c0650b, c0651c);
    }

    protected hu m5166a(IBinder iBinder) {
        return C1028a.m5161a(iBinder);
    }

    protected String mo514a() {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    protected /* synthetic */ IInterface mo515b(IBinder iBinder) {
        return m5166a(iBinder);
    }

    protected String mo516b() {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    public hu mo517c() {
        return (hu) m2994p();
    }
}
