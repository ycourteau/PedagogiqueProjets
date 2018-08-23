package com.google.android.gms.drive.internal;

import com.google.android.gms.p028c.le;
import com.google.android.gms.p028c.lf;

public final class C1668q extends lf<C1668q> {
    public int f5279a;
    public String f5280b;
    public long f5281c;
    public long f5282d;
    public int f5283e;

    public C1668q() {
        m7842a();
    }

    public C1668q m7842a() {
        this.f5279a = 1;
        this.f5280b = "";
        this.f5281c = -1;
        this.f5282d = -1;
        this.f5283e = -1;
        this.r = null;
        this.s = -1;
        return this;
    }

    public void mo730a(le leVar) {
        leVar.m5710a(1, this.f5279a);
        leVar.m5713a(2, this.f5280b);
        leVar.m5720b(3, this.f5281c);
        leVar.m5720b(4, this.f5282d);
        if (this.f5283e != -1) {
            leVar.m5710a(5, this.f5283e);
        }
        super.mo730a(leVar);
    }

    protected int mo731b() {
        int b = (((super.mo731b() + le.m5687b(1, this.f5279a)) + le.m5689b(2, this.f5280b)) + le.m5699d(3, this.f5281c)) + le.m5699d(4, this.f5282d);
        return this.f5283e != -1 ? b + le.m5687b(5, this.f5283e) : b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1668q)) {
            return false;
        }
        C1668q c1668q = (C1668q) obj;
        if (this.f5279a != c1668q.f5279a) {
            return false;
        }
        if (this.f5280b == null) {
            if (c1668q.f5280b != null) {
                return false;
            }
        } else if (!this.f5280b.equals(c1668q.f5280b)) {
            return false;
        }
        return (this.f5281c == c1668q.f5281c && this.f5282d == c1668q.f5282d && this.f5283e == c1668q.f5283e) ? m4715a((lf) c1668q) : false;
    }

    public int hashCode() {
        return (((((((((this.f5280b == null ? 0 : this.f5280b.hashCode()) + ((this.f5279a + 527) * 31)) * 31) + ((int) (this.f5281c ^ (this.f5281c >>> 32)))) * 31) + ((int) (this.f5282d ^ (this.f5282d >>> 32)))) * 31) + this.f5283e) * 31) + m4717d();
    }
}
