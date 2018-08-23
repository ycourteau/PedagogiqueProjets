package com.google.android.gms.p028c;

import com.google.android.gms.common.internal.C1305x;
import java.util.ArrayList;
import java.util.List;

public abstract class jj<T extends jj> {
    protected final jg f2011a;
    private final jk f2012b;
    private final List<jh> f2013c = new ArrayList();

    protected jj(jk jkVar, ik ikVar) {
        C1305x.m6617a((Object) jkVar);
        this.f2012b = jkVar;
        jg jgVar = new jg(this, ikVar);
        jgVar.m5367k();
        this.f2011a = jgVar;
    }

    protected void mo537a(jg jgVar) {
    }

    protected void m3154b(jg jgVar) {
        for (jh a : this.f2013c) {
            a.m5368a(this, jgVar);
        }
    }

    public jg mo538j() {
        jg a = this.f2011a.m5353a();
        m3154b(a);
        return a;
    }

    public jg m3156k() {
        return this.f2011a;
    }

    public List<jm> m3157l() {
        return this.f2011a.m5359c();
    }

    protected jk m3158m() {
        return this.f2012b;
    }
}
