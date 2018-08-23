package com.google.android.gms.p028c;

public interface C1010h {

    public static final class C1009a extends lf<C1009a> {
        private static volatile C1009a[] f3435m;
        public int f3436a;
        public String f3437b;
        public C1009a[] f3438c;
        public C1009a[] f3439d;
        public C1009a[] f3440e;
        public String f3441f;
        public String f3442g;
        public long f3443h;
        public boolean f3444i;
        public C1009a[] f3445j;
        public int[] f3446k;
        public boolean f3447l;

        public C1009a() {
            m4981c();
        }

        public static C1009a[] m4978a() {
            if (f3435m == null) {
                synchronized (lj.f3956a) {
                    if (f3435m == null) {
                        f3435m = new C1009a[0];
                    }
                }
            }
            return f3435m;
        }

        public void mo730a(le leVar) {
            int i = 0;
            leVar.m5710a(1, this.f3436a);
            if (!this.f3437b.equals("")) {
                leVar.m5713a(2, this.f3437b);
            }
            if (this.f3438c != null && this.f3438c.length > 0) {
                for (lk lkVar : this.f3438c) {
                    if (lkVar != null) {
                        leVar.m5712a(3, lkVar);
                    }
                }
            }
            if (this.f3439d != null && this.f3439d.length > 0) {
                for (lk lkVar2 : this.f3439d) {
                    if (lkVar2 != null) {
                        leVar.m5712a(4, lkVar2);
                    }
                }
            }
            if (this.f3440e != null && this.f3440e.length > 0) {
                for (lk lkVar22 : this.f3440e) {
                    if (lkVar22 != null) {
                        leVar.m5712a(5, lkVar22);
                    }
                }
            }
            if (!this.f3441f.equals("")) {
                leVar.m5713a(6, this.f3441f);
            }
            if (!this.f3442g.equals("")) {
                leVar.m5713a(7, this.f3442g);
            }
            if (this.f3443h != 0) {
                leVar.m5711a(8, this.f3443h);
            }
            if (this.f3447l) {
                leVar.m5714a(9, this.f3447l);
            }
            if (this.f3446k != null && this.f3446k.length > 0) {
                for (int a : this.f3446k) {
                    leVar.m5710a(10, a);
                }
            }
            if (this.f3445j != null && this.f3445j.length > 0) {
                while (i < this.f3445j.length) {
                    lk lkVar3 = this.f3445j[i];
                    if (lkVar3 != null) {
                        leVar.m5712a(11, lkVar3);
                    }
                    i++;
                }
            }
            if (this.f3444i) {
                leVar.m5714a(12, this.f3444i);
            }
            super.mo730a(leVar);
        }

        protected int mo731b() {
            int i;
            int i2 = 0;
            int b = super.mo731b() + le.m5687b(1, this.f3436a);
            if (!this.f3437b.equals("")) {
                b += le.m5689b(2, this.f3437b);
            }
            if (this.f3438c != null && this.f3438c.length > 0) {
                i = b;
                for (lk lkVar : this.f3438c) {
                    if (lkVar != null) {
                        i += le.m5695c(3, lkVar);
                    }
                }
                b = i;
            }
            if (this.f3439d != null && this.f3439d.length > 0) {
                i = b;
                for (lk lkVar2 : this.f3439d) {
                    if (lkVar2 != null) {
                        i += le.m5695c(4, lkVar2);
                    }
                }
                b = i;
            }
            if (this.f3440e != null && this.f3440e.length > 0) {
                i = b;
                for (lk lkVar22 : this.f3440e) {
                    if (lkVar22 != null) {
                        i += le.m5695c(5, lkVar22);
                    }
                }
                b = i;
            }
            if (!this.f3441f.equals("")) {
                b += le.m5689b(6, this.f3441f);
            }
            if (!this.f3442g.equals("")) {
                b += le.m5689b(7, this.f3442g);
            }
            if (this.f3443h != 0) {
                b += le.m5694c(8, this.f3443h);
            }
            if (this.f3447l) {
                b += le.m5690b(9, this.f3447l);
            }
            if (this.f3446k != null && this.f3446k.length > 0) {
                int i3 = 0;
                for (int b2 : this.f3446k) {
                    i3 += le.m5685b(b2);
                }
                b = (b + i3) + (this.f3446k.length * 1);
            }
            if (this.f3445j != null && this.f3445j.length > 0) {
                while (i2 < this.f3445j.length) {
                    lk lkVar3 = this.f3445j[i2];
                    if (lkVar3 != null) {
                        b += le.m5695c(11, lkVar3);
                    }
                    i2++;
                }
            }
            return this.f3444i ? b + le.m5690b(12, this.f3444i) : b;
        }

        public C1009a m4981c() {
            this.f3436a = 1;
            this.f3437b = "";
            this.f3438c = C1009a.m4978a();
            this.f3439d = C1009a.m4978a();
            this.f3440e = C1009a.m4978a();
            this.f3441f = "";
            this.f3442g = "";
            this.f3443h = 0;
            this.f3444i = false;
            this.f3445j = C1009a.m4978a();
            this.f3446k = lo.f3967a;
            this.f3447l = false;
            this.r = null;
            this.s = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1009a)) {
                return false;
            }
            C1009a c1009a = (C1009a) obj;
            if (this.f3436a != c1009a.f3436a) {
                return false;
            }
            if (this.f3437b == null) {
                if (c1009a.f3437b != null) {
                    return false;
                }
            } else if (!this.f3437b.equals(c1009a.f3437b)) {
                return false;
            }
            if (!lj.m5753a(this.f3438c, c1009a.f3438c) || !lj.m5753a(this.f3439d, c1009a.f3439d) || !lj.m5753a(this.f3440e, c1009a.f3440e)) {
                return false;
            }
            if (this.f3441f == null) {
                if (c1009a.f3441f != null) {
                    return false;
                }
            } else if (!this.f3441f.equals(c1009a.f3441f)) {
                return false;
            }
            if (this.f3442g == null) {
                if (c1009a.f3442g != null) {
                    return false;
                }
            } else if (!this.f3442g.equals(c1009a.f3442g)) {
                return false;
            }
            return (this.f3443h == c1009a.f3443h && this.f3444i == c1009a.f3444i && lj.m5753a(this.f3445j, c1009a.f3445j) && lj.m5752a(this.f3446k, c1009a.f3446k) && this.f3447l == c1009a.f3447l) ? m4715a((lf) c1009a) : false;
        }

        public int hashCode() {
            int i = 1231;
            int i2 = 0;
            int hashCode = ((this.f3441f == null ? 0 : this.f3441f.hashCode()) + (((((((((this.f3437b == null ? 0 : this.f3437b.hashCode()) + ((this.f3436a + 527) * 31)) * 31) + lj.m5750a(this.f3438c)) * 31) + lj.m5750a(this.f3439d)) * 31) + lj.m5750a(this.f3440e)) * 31)) * 31;
            if (this.f3442g != null) {
                i2 = this.f3442g.hashCode();
            }
            hashCode = ((((((this.f3444i ? 1231 : 1237) + ((((hashCode + i2) * 31) + ((int) (this.f3443h ^ (this.f3443h >>> 32)))) * 31)) * 31) + lj.m5750a(this.f3445j)) * 31) + lj.m5749a(this.f3446k)) * 31;
            if (!this.f3447l) {
                i = 1237;
            }
            return ((hashCode + i) * 31) + m4717d();
        }
    }
}
