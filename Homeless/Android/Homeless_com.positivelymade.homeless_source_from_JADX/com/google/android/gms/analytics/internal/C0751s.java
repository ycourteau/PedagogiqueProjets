package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.analytics.C0710e;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.ik;
import com.google.android.gms.p028c.il;
import com.google.android.gms.p028c.jk;

public class C0751s {
    private final Context f2203a;
    private final Context f2204b;

    public C0751s(Context context) {
        C1305x.m6617a((Object) context);
        Object applicationContext = context.getApplicationContext();
        C1305x.m6618a(applicationContext, (Object) "Application context can't be null");
        this.f2203a = applicationContext;
        this.f2204b = applicationContext;
    }

    public Context m3508a() {
        return this.f2203a;
    }

    protected ag m3509a(C0750r c0750r) {
        return new ag(c0750r);
    }

    protected jk m3510a(Context context) {
        return jk.m5369a(context);
    }

    public Context m3511b() {
        return this.f2204b;
    }

    protected C0760w m3512b(C0750r c0750r) {
        return new C0760w(c0750r);
    }

    protected C0721a m3513c(C0750r c0750r) {
        return new C0721a(c0750r);
    }

    protected C0770z m3514d(C0750r c0750r) {
        return new C0770z(c0750r);
    }

    protected C0742m m3515e(C0750r c0750r) {
        return new C0742m(c0750r);
    }

    protected C0733g m3516f(C0750r c0750r) {
        return new C0733g(c0750r);
    }

    protected ad m3517g(C0750r c0750r) {
        return new ad(c0750r);
    }

    protected ik m3518h(C0750r c0750r) {
        return il.m5268d();
    }

    protected C0710e m3519i(C0750r c0750r) {
        return new C0710e(c0750r);
    }

    C0766x m3520j(C0750r c0750r) {
        return new C0766x(c0750r, this);
    }

    C0734h m3521k(C0750r c0750r) {
        return new C0734h(c0750r);
    }

    protected C0747n m3522l(C0750r c0750r) {
        return new C0747n(c0750r, this);
    }

    public C0759v m3523m(C0750r c0750r) {
        return new C0759v(c0750r);
    }

    public C0736i m3524n(C0750r c0750r) {
        return new C0736i(c0750r);
    }

    public C0757u m3525o(C0750r c0750r) {
        return new C0757u(c0750r);
    }

    public ah m3526p(C0750r c0750r) {
        return new ah(c0750r);
    }

    public C0739j m3527q(C0750r c0750r) {
        return new C0739j(c0750r);
    }
}
