package com.google.android.gms.drive.internal;

import com.google.android.gms.p028c.le;
import com.google.android.gms.p028c.lf;

public final class C1667p extends lf<C1667p> {
    public int f5275a;
    public long f5276b;
    public long f5277c;
    public long f5278d;

    public C1667p() {
        m7839a();
    }

    public C1667p m7839a() {
        this.f5275a = 1;
        this.f5276b = -1;
        this.f5277c = -1;
        this.f5278d = -1;
        this.r = null;
        this.s = -1;
        return this;
    }

    public void mo730a(le leVar) {
        leVar.m5710a(1, this.f5275a);
        leVar.m5720b(2, this.f5276b);
        leVar.m5720b(3, this.f5277c);
        leVar.m5720b(4, this.f5278d);
        super.mo730a(leVar);
    }

    protected int mo731b() {
        return (((super.mo731b() + le.m5687b(1, this.f5275a)) + le.m5699d(2, this.f5276b)) + le.m5699d(3, this.f5277c)) + le.m5699d(4, this.f5278d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1667p)) {
            return false;
        }
        C1667p c1667p = (C1667p) obj;
        return (this.f5275a == c1667p.f5275a && this.f5276b == c1667p.f5276b && this.f5277c == c1667p.f5277c && this.f5278d == c1667p.f5278d) ? m4715a((lf) c1667p) : false;
    }

    public int hashCode() {
        return ((((((((this.f5275a + 527) * 31) + ((int) (this.f5276b ^ (this.f5276b >>> 32)))) * 31) + ((int) (this.f5277c ^ (this.f5277c >>> 32)))) * 31) + ((int) (this.f5278d ^ (this.f5278d >>> 32)))) * 31) + m4717d();
    }
}
