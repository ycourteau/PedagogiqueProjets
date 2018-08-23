package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.C0721a;
import com.google.android.gms.analytics.internal.C0750r;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.ht;
import com.google.android.gms.p028c.jg;
import com.google.android.gms.p028c.jj;
import com.google.android.gms.p028c.jm;
import java.util.ListIterator;

public class C0709i extends jj<C0709i> {
    private final C0750r f2014b;
    private boolean f2015c;

    public C0709i(C0750r c0750r) {
        super(c0750r.m3496h(), c0750r.m3492d());
        this.f2014b = c0750r;
    }

    protected void mo537a(jg jgVar) {
        ht htVar = (ht) jgVar.m5357b(ht.class);
        if (TextUtils.isEmpty(htVar.m5137b())) {
            htVar.m5138b(this.f2014b.m3504p().m3633b());
        }
        if (this.f2015c && TextUtils.isEmpty(htVar.m5142d())) {
            C0721a o = this.f2014b.m3503o();
            htVar.m5143d(o.m3264c());
            htVar.m5136a(o.m3263b());
        }
    }

    public void m3160b(String str) {
        C1305x.m6619a(str);
        m3162c(str);
        m3157l().add(new C0771j(this.f2014b, str));
    }

    public void m3161b(boolean z) {
        this.f2015c = z;
    }

    public void m3162c(String str) {
        Uri a = C0771j.m3639a(str);
        ListIterator listIterator = m3157l().listIterator();
        while (listIterator.hasNext()) {
            if (a.equals(((jm) listIterator.next()).mo556a())) {
                listIterator.remove();
            }
        }
    }

    C0750r m3163i() {
        return this.f2014b;
    }

    public jg mo538j() {
        jg a = m3156k().m5353a();
        a.m5356a(this.f2014b.m3505q().m3587c());
        a.m5356a(this.f2014b.m3506r().m3323b());
        m3154b(a);
        return a;
    }
}
