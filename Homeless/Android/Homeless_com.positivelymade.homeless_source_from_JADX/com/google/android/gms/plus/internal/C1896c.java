package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C1180c.C0650b;
import com.google.android.gms.common.api.C1180c.C0651c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0655l;
import com.google.android.gms.common.internal.C1266h;
import com.google.android.gms.plus.C1889d;
import com.google.android.gms.plus.internal.C1893b.C1895a;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.p043a.p044a.C1886a;
import java.util.Set;

public class C1896c extends C0655l<C1893b> {
    private C1886a f5767a;
    private final PlusSession f5768e;

    public C1896c(Context context, Looper looper, C1266h c1266h, PlusSession plusSession, C0650b c0650b, C0651c c0651c) {
        super(context, looper, 2, c1266h, c0650b, c0651c);
        this.f5768e = plusSession;
    }

    public static boolean m9505b(Set<Scope> set) {
        return (set == null || set.isEmpty()) ? false : (set.size() == 1 && set.contains(new Scope("plus_one_placeholder_scope"))) ? false : true;
    }

    private Bundle m9506t() {
        Bundle k = this.f5768e.m9440k();
        k.putStringArray("request_visible_actions", this.f5768e.m9433d());
        k.putString("auth_package", this.f5768e.m9435f());
        return k;
    }

    protected C1893b m9507a(IBinder iBinder) {
        return C1895a.m9504a(iBinder);
    }

    protected String mo514a() {
        return "com.google.android.gms.plus.service.START";
    }

    protected void mo1047a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person")) {
            this.f5767a = PersonEntity.m9561a(bundle.getByteArray("loaded_person"));
        }
        super.mo1047a(i, iBinder, bundle, i2);
    }

    protected /* synthetic */ IInterface mo515b(IBinder iBinder) {
        return m9507a(iBinder);
    }

    protected String mo516b() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    public C1886a mo517c() {
        m2993o();
        return this.f5767a;
    }

    public boolean mo513f() {
        return C1896c.m9505b(m2991m().m6365a(C1889d.f5744c));
    }

    protected Bundle mo1048n() {
        return m9506t();
    }

    protected Bundle mo1650q() {
        return m9506t();
    }

    public void mo1342s() {
        m2993o();
        try {
            this.f5767a = null;
            ((C1893b) m2994p()).mo1641b();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
