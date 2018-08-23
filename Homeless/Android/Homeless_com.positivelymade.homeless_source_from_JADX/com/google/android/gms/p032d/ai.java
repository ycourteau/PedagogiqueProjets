package com.google.android.gms.p032d;

import com.google.android.gms.p028c.ik;

class ai implements bh {
    private final long f4657a;
    private final long f4658b;
    private final int f4659c;
    private double f4660d;
    private long f4661e;
    private final Object f4662f = new Object();
    private final String f4663g;
    private final ik f4664h;

    public ai(int i, long j, long j2, String str, ik ikVar) {
        this.f4659c = i;
        this.f4660d = (double) this.f4659c;
        this.f4657a = j;
        this.f4658b = j2;
        this.f4663g = str;
        this.f4664h = ikVar;
    }

    public boolean mo980a() {
        boolean z = false;
        synchronized (this.f4662f) {
            long a = this.f4664h.mo824a();
            if (a - this.f4661e < this.f4658b) {
                aj.m7038b("Excessive " + this.f4663g + " detected; call ignored.");
            } else {
                if (this.f4660d < ((double) this.f4659c)) {
                    double d = ((double) (a - this.f4661e)) / ((double) this.f4657a);
                    if (d > 0.0d) {
                        this.f4660d = Math.min((double) this.f4659c, d + this.f4660d);
                    }
                }
                this.f4661e = a;
                if (this.f4660d >= 1.0d) {
                    this.f4660d -= 1.0d;
                    z = true;
                } else {
                    aj.m7038b("Excessive " + this.f4663g + " detected; call ignored.");
                }
            }
        }
        return z;
    }
}
