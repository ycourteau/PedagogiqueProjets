package com.google.android.gms.p028c;

public abstract class lf<M extends lf<M>> extends lk {
    protected lh f3201r;

    public void mo730a(le leVar) {
        if (this.f3201r != null) {
            for (int i = 0; i < this.f3201r.m5741a(); i++) {
                this.f3201r.m5742a(i).m5747a(leVar);
            }
        }
    }

    protected final boolean m4715a(M m) {
        return (this.f3201r == null || this.f3201r.m5743b()) ? m.f3201r == null || m.f3201r.m5743b() : this.f3201r.equals(m.f3201r);
    }

    protected int mo731b() {
        int i = 0;
        if (this.f3201r == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.f3201r.m5741a()) {
            i2 += this.f3201r.m5742a(i).m5746a();
            i++;
        }
        return i2;
    }

    public /* synthetic */ Object clone() {
        return m4718e();
    }

    protected final int m4717d() {
        return (this.f3201r == null || this.f3201r.m5743b()) ? 0 : this.f3201r.hashCode();
    }

    public M m4718e() {
        lf lfVar = (lf) super.mo733f();
        lj.m5751a(this, lfVar);
        return lfVar;
    }

    public /* synthetic */ lk mo733f() {
        return m4718e();
    }
}
