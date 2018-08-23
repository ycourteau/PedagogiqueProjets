package com.google.android.gms.common.data;

import android.net.Uri;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.C1305x;

public abstract class C1239e {
    protected final DataHolder f4277a;
    protected int f4278b;
    private int f4279c;

    public C1239e(DataHolder dataHolder, int i) {
        this.f4277a = (DataHolder) C1305x.m6617a((Object) dataHolder);
        m6259a(i);
    }

    protected void m6259a(int i) {
        boolean z = i >= 0 && i < this.f4277a.m6248g();
        C1305x.m6621a(z);
        this.f4278b = i;
        this.f4279c = this.f4277a.m6233a(this.f4278b);
    }

    public boolean m6260a(String str) {
        return this.f4277a.m6237a(str);
    }

    protected long m6261b(String str) {
        return this.f4277a.m6234a(str, this.f4278b, this.f4279c);
    }

    protected int m6262c(String str) {
        return this.f4277a.m6239b(str, this.f4278b, this.f4279c);
    }

    protected boolean m6263d(String str) {
        return this.f4277a.m6242d(str, this.f4278b, this.f4279c);
    }

    protected String m6264e(String str) {
        return this.f4277a.m6240c(str, this.f4278b, this.f4279c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1239e)) {
            return false;
        }
        C1239e c1239e = (C1239e) obj;
        return C1304w.m6615a(Integer.valueOf(c1239e.f4278b), Integer.valueOf(this.f4278b)) && C1304w.m6615a(Integer.valueOf(c1239e.f4279c), Integer.valueOf(this.f4279c)) && c1239e.f4277a == this.f4277a;
    }

    protected float m6265f(String str) {
        return this.f4277a.m6244e(str, this.f4278b, this.f4279c);
    }

    protected Uri m6266g(String str) {
        return this.f4277a.m6246f(str, this.f4278b, this.f4279c);
    }

    protected boolean m6267h(String str) {
        return this.f4277a.m6249g(str, this.f4278b, this.f4279c);
    }

    public int hashCode() {
        return C1304w.m6613a(Integer.valueOf(this.f4278b), Integer.valueOf(this.f4279c), this.f4277a);
    }
}
