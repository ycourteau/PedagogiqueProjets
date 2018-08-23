package com.google.android.gms.p028c;

import com.google.android.gms.p028c.C1010h.C1009a;

public interface C0972g {

    public static final class C0963a extends lf<C0963a> {
        public int f3202a;
        public int f3203b;
        public int f3204c;

        public C0963a() {
            m4720a();
        }

        public C0963a m4720a() {
            this.f3202a = 1;
            this.f3203b = 0;
            this.f3204c = 0;
            this.r = null;
            this.s = -1;
            return this;
        }

        public void mo730a(le leVar) {
            if (this.f3202a != 1) {
                leVar.m5710a(1, this.f3202a);
            }
            if (this.f3203b != 0) {
                leVar.m5710a(2, this.f3203b);
            }
            if (this.f3204c != 0) {
                leVar.m5710a(3, this.f3204c);
            }
            super.mo730a(leVar);
        }

        protected int mo731b() {
            int b = super.mo731b();
            if (this.f3202a != 1) {
                b += le.m5687b(1, this.f3202a);
            }
            if (this.f3203b != 0) {
                b += le.m5687b(2, this.f3203b);
            }
            return this.f3204c != 0 ? b + le.m5687b(3, this.f3204c) : b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0963a)) {
                return false;
            }
            C0963a c0963a = (C0963a) obj;
            return (this.f3202a == c0963a.f3202a && this.f3203b == c0963a.f3203b && this.f3204c == c0963a.f3204c) ? m4715a((lf) c0963a) : false;
        }

        public int hashCode() {
            return ((((((this.f3202a + 527) * 31) + this.f3203b) * 31) + this.f3204c) * 31) + m4717d();
        }
    }

    public static final class C0964b extends lf<C0964b> {
        private static volatile C0964b[] f3205f;
        public int[] f3206a;
        public int f3207b;
        public int f3208c;
        public boolean f3209d;
        public boolean f3210e;

        public C0964b() {
            m4726c();
        }

        public static C0964b[] m4723a() {
            if (f3205f == null) {
                synchronized (lj.f3956a) {
                    if (f3205f == null) {
                        f3205f = new C0964b[0];
                    }
                }
            }
            return f3205f;
        }

        public void mo730a(le leVar) {
            if (this.f3210e) {
                leVar.m5714a(1, this.f3210e);
            }
            leVar.m5710a(2, this.f3207b);
            if (this.f3206a != null && this.f3206a.length > 0) {
                for (int a : this.f3206a) {
                    leVar.m5710a(3, a);
                }
            }
            if (this.f3208c != 0) {
                leVar.m5710a(4, this.f3208c);
            }
            if (this.f3209d) {
                leVar.m5714a(6, this.f3209d);
            }
            super.mo730a(leVar);
        }

        protected int mo731b() {
            int i = 0;
            int b = super.mo731b();
            if (this.f3210e) {
                b += le.m5690b(1, this.f3210e);
            }
            int b2 = le.m5687b(2, this.f3207b) + b;
            if (this.f3206a == null || this.f3206a.length <= 0) {
                b = b2;
            } else {
                for (int b3 : this.f3206a) {
                    i += le.m5685b(b3);
                }
                b = (b2 + i) + (this.f3206a.length * 1);
            }
            if (this.f3208c != 0) {
                b += le.m5687b(4, this.f3208c);
            }
            return this.f3209d ? b + le.m5690b(6, this.f3209d) : b;
        }

        public C0964b m4726c() {
            this.f3206a = lo.f3967a;
            this.f3207b = 0;
            this.f3208c = 0;
            this.f3209d = false;
            this.f3210e = false;
            this.r = null;
            this.s = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0964b)) {
                return false;
            }
            C0964b c0964b = (C0964b) obj;
            return (lj.m5752a(this.f3206a, c0964b.f3206a) && this.f3207b == c0964b.f3207b && this.f3208c == c0964b.f3208c && this.f3209d == c0964b.f3209d && this.f3210e == c0964b.f3210e) ? m4715a((lf) c0964b) : false;
        }

        public int hashCode() {
            int i = 1231;
            int a = ((this.f3209d ? 1231 : 1237) + ((((((lj.m5749a(this.f3206a) + 527) * 31) + this.f3207b) * 31) + this.f3208c) * 31)) * 31;
            if (!this.f3210e) {
                i = 1237;
            }
            return ((a + i) * 31) + m4717d();
        }
    }

    public static final class C0965c extends lf<C0965c> {
        private static volatile C0965c[] f3211f;
        public String f3212a;
        public long f3213b;
        public long f3214c;
        public boolean f3215d;
        public long f3216e;

        public C0965c() {
            m4730c();
        }

        public static C0965c[] m4727a() {
            if (f3211f == null) {
                synchronized (lj.f3956a) {
                    if (f3211f == null) {
                        f3211f = new C0965c[0];
                    }
                }
            }
            return f3211f;
        }

        public void mo730a(le leVar) {
            if (!this.f3212a.equals("")) {
                leVar.m5713a(1, this.f3212a);
            }
            if (this.f3213b != 0) {
                leVar.m5711a(2, this.f3213b);
            }
            if (this.f3214c != 2147483647L) {
                leVar.m5711a(3, this.f3214c);
            }
            if (this.f3215d) {
                leVar.m5714a(4, this.f3215d);
            }
            if (this.f3216e != 0) {
                leVar.m5711a(5, this.f3216e);
            }
            super.mo730a(leVar);
        }

        protected int mo731b() {
            int b = super.mo731b();
            if (!this.f3212a.equals("")) {
                b += le.m5689b(1, this.f3212a);
            }
            if (this.f3213b != 0) {
                b += le.m5694c(2, this.f3213b);
            }
            if (this.f3214c != 2147483647L) {
                b += le.m5694c(3, this.f3214c);
            }
            if (this.f3215d) {
                b += le.m5690b(4, this.f3215d);
            }
            return this.f3216e != 0 ? b + le.m5694c(5, this.f3216e) : b;
        }

        public C0965c m4730c() {
            this.f3212a = "";
            this.f3213b = 0;
            this.f3214c = 2147483647L;
            this.f3215d = false;
            this.f3216e = 0;
            this.r = null;
            this.s = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0965c)) {
                return false;
            }
            C0965c c0965c = (C0965c) obj;
            if (this.f3212a == null) {
                if (c0965c.f3212a != null) {
                    return false;
                }
            } else if (!this.f3212a.equals(c0965c.f3212a)) {
                return false;
            }
            return (this.f3213b == c0965c.f3213b && this.f3214c == c0965c.f3214c && this.f3215d == c0965c.f3215d && this.f3216e == c0965c.f3216e) ? m4715a((lf) c0965c) : false;
        }

        public int hashCode() {
            return (((((this.f3215d ? 1231 : 1237) + (((((((this.f3212a == null ? 0 : this.f3212a.hashCode()) + 527) * 31) + ((int) (this.f3213b ^ (this.f3213b >>> 32)))) * 31) + ((int) (this.f3214c ^ (this.f3214c >>> 32)))) * 31)) * 31) + ((int) (this.f3216e ^ (this.f3216e >>> 32)))) * 31) + m4717d();
        }
    }

    public static final class C0966d extends lf<C0966d> {
        public C1009a[] f3217a;
        public C1009a[] f3218b;
        public C0965c[] f3219c;

        public C0966d() {
            m4731a();
        }

        public C0966d m4731a() {
            this.f3217a = C1009a.m4978a();
            this.f3218b = C1009a.m4978a();
            this.f3219c = C0965c.m4727a();
            this.r = null;
            this.s = -1;
            return this;
        }

        public void mo730a(le leVar) {
            int i = 0;
            if (this.f3217a != null && this.f3217a.length > 0) {
                for (lk lkVar : this.f3217a) {
                    if (lkVar != null) {
                        leVar.m5712a(1, lkVar);
                    }
                }
            }
            if (this.f3218b != null && this.f3218b.length > 0) {
                for (lk lkVar2 : this.f3218b) {
                    if (lkVar2 != null) {
                        leVar.m5712a(2, lkVar2);
                    }
                }
            }
            if (this.f3219c != null && this.f3219c.length > 0) {
                while (i < this.f3219c.length) {
                    lk lkVar3 = this.f3219c[i];
                    if (lkVar3 != null) {
                        leVar.m5712a(3, lkVar3);
                    }
                    i++;
                }
            }
            super.mo730a(leVar);
        }

        protected int mo731b() {
            int i;
            int i2 = 0;
            int b = super.mo731b();
            if (this.f3217a != null && this.f3217a.length > 0) {
                i = b;
                for (lk lkVar : this.f3217a) {
                    if (lkVar != null) {
                        i += le.m5695c(1, lkVar);
                    }
                }
                b = i;
            }
            if (this.f3218b != null && this.f3218b.length > 0) {
                i = b;
                for (lk lkVar2 : this.f3218b) {
                    if (lkVar2 != null) {
                        i += le.m5695c(2, lkVar2);
                    }
                }
                b = i;
            }
            if (this.f3219c != null && this.f3219c.length > 0) {
                while (i2 < this.f3219c.length) {
                    lk lkVar3 = this.f3219c[i2];
                    if (lkVar3 != null) {
                        b += le.m5695c(3, lkVar3);
                    }
                    i2++;
                }
            }
            return b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0966d)) {
                return false;
            }
            C0966d c0966d = (C0966d) obj;
            return (lj.m5753a(this.f3217a, c0966d.f3217a) && lj.m5753a(this.f3218b, c0966d.f3218b) && lj.m5753a(this.f3219c, c0966d.f3219c)) ? m4715a((lf) c0966d) : false;
        }

        public int hashCode() {
            return ((((((lj.m5750a(this.f3217a) + 527) * 31) + lj.m5750a(this.f3218b)) * 31) + lj.m5750a(this.f3219c)) * 31) + m4717d();
        }
    }

    public static final class C0967e extends lf<C0967e> {
        private static volatile C0967e[] f3220c;
        public int f3221a;
        public int f3222b;

        public C0967e() {
            m4737c();
        }

        public static C0967e[] m4734a() {
            if (f3220c == null) {
                synchronized (lj.f3956a) {
                    if (f3220c == null) {
                        f3220c = new C0967e[0];
                    }
                }
            }
            return f3220c;
        }

        public void mo730a(le leVar) {
            leVar.m5710a(1, this.f3221a);
            leVar.m5710a(2, this.f3222b);
            super.mo730a(leVar);
        }

        protected int mo731b() {
            return (super.mo731b() + le.m5687b(1, this.f3221a)) + le.m5687b(2, this.f3222b);
        }

        public C0967e m4737c() {
            this.f3221a = 0;
            this.f3222b = 0;
            this.r = null;
            this.s = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0967e)) {
                return false;
            }
            C0967e c0967e = (C0967e) obj;
            return (this.f3221a == c0967e.f3221a && this.f3222b == c0967e.f3222b) ? m4715a((lf) c0967e) : false;
        }

        public int hashCode() {
            return ((((this.f3221a + 527) * 31) + this.f3222b) * 31) + m4717d();
        }
    }

    public static final class C0968f extends lf<C0968f> {
        public String[] f3223a;
        public String[] f3224b;
        public C1009a[] f3225c;
        public C0967e[] f3226d;
        public C0964b[] f3227e;
        public C0964b[] f3228f;
        public C0964b[] f3229g;
        public C0969g[] f3230h;
        public String f3231i;
        public String f3232j;
        public String f3233k;
        public String f3234l;
        public C0963a f3235m;
        public float f3236n;
        public boolean f3237o;
        public String[] f3238p;
        public int f3239q;

        public C0968f() {
            m4738a();
        }

        public C0968f m4738a() {
            this.f3223a = lo.f3972f;
            this.f3224b = lo.f3972f;
            this.f3225c = C1009a.m4978a();
            this.f3226d = C0967e.m4734a();
            this.f3227e = C0964b.m4723a();
            this.f3228f = C0964b.m4723a();
            this.f3229g = C0964b.m4723a();
            this.f3230h = C0969g.m4741a();
            this.f3231i = "";
            this.f3232j = "";
            this.f3233k = "0";
            this.f3234l = "";
            this.f3235m = null;
            this.f3236n = 0.0f;
            this.f3237o = false;
            this.f3238p = lo.f3972f;
            this.f3239q = 0;
            this.r = null;
            this.s = -1;
            return this;
        }

        public void mo730a(le leVar) {
            int i = 0;
            if (this.f3224b != null && this.f3224b.length > 0) {
                for (String str : this.f3224b) {
                    if (str != null) {
                        leVar.m5713a(1, str);
                    }
                }
            }
            if (this.f3225c != null && this.f3225c.length > 0) {
                for (lk lkVar : this.f3225c) {
                    if (lkVar != null) {
                        leVar.m5712a(2, lkVar);
                    }
                }
            }
            if (this.f3226d != null && this.f3226d.length > 0) {
                for (lk lkVar2 : this.f3226d) {
                    if (lkVar2 != null) {
                        leVar.m5712a(3, lkVar2);
                    }
                }
            }
            if (this.f3227e != null && this.f3227e.length > 0) {
                for (lk lkVar22 : this.f3227e) {
                    if (lkVar22 != null) {
                        leVar.m5712a(4, lkVar22);
                    }
                }
            }
            if (this.f3228f != null && this.f3228f.length > 0) {
                for (lk lkVar222 : this.f3228f) {
                    if (lkVar222 != null) {
                        leVar.m5712a(5, lkVar222);
                    }
                }
            }
            if (this.f3229g != null && this.f3229g.length > 0) {
                for (lk lkVar2222 : this.f3229g) {
                    if (lkVar2222 != null) {
                        leVar.m5712a(6, lkVar2222);
                    }
                }
            }
            if (this.f3230h != null && this.f3230h.length > 0) {
                for (lk lkVar22222 : this.f3230h) {
                    if (lkVar22222 != null) {
                        leVar.m5712a(7, lkVar22222);
                    }
                }
            }
            if (!this.f3231i.equals("")) {
                leVar.m5713a(9, this.f3231i);
            }
            if (!this.f3232j.equals("")) {
                leVar.m5713a(10, this.f3232j);
            }
            if (!this.f3233k.equals("0")) {
                leVar.m5713a(12, this.f3233k);
            }
            if (!this.f3234l.equals("")) {
                leVar.m5713a(13, this.f3234l);
            }
            if (this.f3235m != null) {
                leVar.m5712a(14, this.f3235m);
            }
            if (Float.floatToIntBits(this.f3236n) != Float.floatToIntBits(0.0f)) {
                leVar.m5709a(15, this.f3236n);
            }
            if (this.f3238p != null && this.f3238p.length > 0) {
                for (String str2 : this.f3238p) {
                    if (str2 != null) {
                        leVar.m5713a(16, str2);
                    }
                }
            }
            if (this.f3239q != 0) {
                leVar.m5710a(17, this.f3239q);
            }
            if (this.f3237o) {
                leVar.m5714a(18, this.f3237o);
            }
            if (this.f3223a != null && this.f3223a.length > 0) {
                while (i < this.f3223a.length) {
                    String str3 = this.f3223a[i];
                    if (str3 != null) {
                        leVar.m5713a(19, str3);
                    }
                    i++;
                }
            }
            super.mo730a(leVar);
        }

        protected int mo731b() {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            int b = super.mo731b();
            if (this.f3224b == null || this.f3224b.length <= 0) {
                i = b;
            } else {
                i2 = 0;
                i3 = 0;
                for (String str : this.f3224b) {
                    if (str != null) {
                        i3++;
                        i2 += le.m5691b(str);
                    }
                }
                i = (b + i2) + (i3 * 1);
            }
            if (this.f3225c != null && this.f3225c.length > 0) {
                i2 = i;
                for (lk lkVar : this.f3225c) {
                    if (lkVar != null) {
                        i2 += le.m5695c(2, lkVar);
                    }
                }
                i = i2;
            }
            if (this.f3226d != null && this.f3226d.length > 0) {
                i2 = i;
                for (lk lkVar2 : this.f3226d) {
                    if (lkVar2 != null) {
                        i2 += le.m5695c(3, lkVar2);
                    }
                }
                i = i2;
            }
            if (this.f3227e != null && this.f3227e.length > 0) {
                i2 = i;
                for (lk lkVar22 : this.f3227e) {
                    if (lkVar22 != null) {
                        i2 += le.m5695c(4, lkVar22);
                    }
                }
                i = i2;
            }
            if (this.f3228f != null && this.f3228f.length > 0) {
                i2 = i;
                for (lk lkVar222 : this.f3228f) {
                    if (lkVar222 != null) {
                        i2 += le.m5695c(5, lkVar222);
                    }
                }
                i = i2;
            }
            if (this.f3229g != null && this.f3229g.length > 0) {
                i2 = i;
                for (lk lkVar2222 : this.f3229g) {
                    if (lkVar2222 != null) {
                        i2 += le.m5695c(6, lkVar2222);
                    }
                }
                i = i2;
            }
            if (this.f3230h != null && this.f3230h.length > 0) {
                i2 = i;
                for (lk lkVar22222 : this.f3230h) {
                    if (lkVar22222 != null) {
                        i2 += le.m5695c(7, lkVar22222);
                    }
                }
                i = i2;
            }
            if (!this.f3231i.equals("")) {
                i += le.m5689b(9, this.f3231i);
            }
            if (!this.f3232j.equals("")) {
                i += le.m5689b(10, this.f3232j);
            }
            if (!this.f3233k.equals("0")) {
                i += le.m5689b(12, this.f3233k);
            }
            if (!this.f3234l.equals("")) {
                i += le.m5689b(13, this.f3234l);
            }
            if (this.f3235m != null) {
                i += le.m5695c(14, this.f3235m);
            }
            if (Float.floatToIntBits(this.f3236n) != Float.floatToIntBits(0.0f)) {
                i += le.m5686b(15, this.f3236n);
            }
            if (this.f3238p != null && this.f3238p.length > 0) {
                i3 = 0;
                b = 0;
                for (String str2 : this.f3238p) {
                    if (str2 != null) {
                        b++;
                        i3 += le.m5691b(str2);
                    }
                }
                i = (i + i3) + (b * 2);
            }
            if (this.f3239q != 0) {
                i += le.m5687b(17, this.f3239q);
            }
            if (this.f3237o) {
                i += le.m5690b(18, this.f3237o);
            }
            if (this.f3223a == null || this.f3223a.length <= 0) {
                return i;
            }
            i2 = 0;
            i3 = 0;
            while (i4 < this.f3223a.length) {
                String str3 = this.f3223a[i4];
                if (str3 != null) {
                    i3++;
                    i2 += le.m5691b(str3);
                }
                i4++;
            }
            return (i + i2) + (i3 * 2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0968f)) {
                return false;
            }
            C0968f c0968f = (C0968f) obj;
            if (!lj.m5753a(this.f3223a, c0968f.f3223a) || !lj.m5753a(this.f3224b, c0968f.f3224b) || !lj.m5753a(this.f3225c, c0968f.f3225c) || !lj.m5753a(this.f3226d, c0968f.f3226d) || !lj.m5753a(this.f3227e, c0968f.f3227e) || !lj.m5753a(this.f3228f, c0968f.f3228f) || !lj.m5753a(this.f3229g, c0968f.f3229g) || !lj.m5753a(this.f3230h, c0968f.f3230h)) {
                return false;
            }
            if (this.f3231i == null) {
                if (c0968f.f3231i != null) {
                    return false;
                }
            } else if (!this.f3231i.equals(c0968f.f3231i)) {
                return false;
            }
            if (this.f3232j == null) {
                if (c0968f.f3232j != null) {
                    return false;
                }
            } else if (!this.f3232j.equals(c0968f.f3232j)) {
                return false;
            }
            if (this.f3233k == null) {
                if (c0968f.f3233k != null) {
                    return false;
                }
            } else if (!this.f3233k.equals(c0968f.f3233k)) {
                return false;
            }
            if (this.f3234l == null) {
                if (c0968f.f3234l != null) {
                    return false;
                }
            } else if (!this.f3234l.equals(c0968f.f3234l)) {
                return false;
            }
            if (this.f3235m == null) {
                if (c0968f.f3235m != null) {
                    return false;
                }
            } else if (!this.f3235m.equals(c0968f.f3235m)) {
                return false;
            }
            return (Float.floatToIntBits(this.f3236n) == Float.floatToIntBits(c0968f.f3236n) && this.f3237o == c0968f.f3237o && lj.m5753a(this.f3238p, c0968f.f3238p) && this.f3239q == c0968f.f3239q) ? m4715a((lf) c0968f) : false;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f3234l == null ? 0 : this.f3234l.hashCode()) + (((this.f3233k == null ? 0 : this.f3233k.hashCode()) + (((this.f3232j == null ? 0 : this.f3232j.hashCode()) + (((this.f3231i == null ? 0 : this.f3231i.hashCode()) + ((((((((((((((((lj.m5750a(this.f3223a) + 527) * 31) + lj.m5750a(this.f3224b)) * 31) + lj.m5750a(this.f3225c)) * 31) + lj.m5750a(this.f3226d)) * 31) + lj.m5750a(this.f3227e)) * 31) + lj.m5750a(this.f3228f)) * 31) + lj.m5750a(this.f3229g)) * 31) + lj.m5750a(this.f3230h)) * 31)) * 31)) * 31)) * 31)) * 31;
            if (this.f3235m != null) {
                i = this.f3235m.hashCode();
            }
            return (((((((this.f3237o ? 1231 : 1237) + ((((hashCode + i) * 31) + Float.floatToIntBits(this.f3236n)) * 31)) * 31) + lj.m5750a(this.f3238p)) * 31) + this.f3239q) * 31) + m4717d();
        }
    }

    public static final class C0969g extends lf<C0969g> {
        private static volatile C0969g[] f3240k;
        public int[] f3241a;
        public int[] f3242b;
        public int[] f3243c;
        public int[] f3244d;
        public int[] f3245e;
        public int[] f3246f;
        public int[] f3247g;
        public int[] f3248h;
        public int[] f3249i;
        public int[] f3250j;

        public C0969g() {
            m4744c();
        }

        public static C0969g[] m4741a() {
            if (f3240k == null) {
                synchronized (lj.f3956a) {
                    if (f3240k == null) {
                        f3240k = new C0969g[0];
                    }
                }
            }
            return f3240k;
        }

        public void mo730a(le leVar) {
            int i = 0;
            if (this.f3241a != null && this.f3241a.length > 0) {
                for (int a : this.f3241a) {
                    leVar.m5710a(1, a);
                }
            }
            if (this.f3242b != null && this.f3242b.length > 0) {
                for (int a2 : this.f3242b) {
                    leVar.m5710a(2, a2);
                }
            }
            if (this.f3243c != null && this.f3243c.length > 0) {
                for (int a22 : this.f3243c) {
                    leVar.m5710a(3, a22);
                }
            }
            if (this.f3244d != null && this.f3244d.length > 0) {
                for (int a222 : this.f3244d) {
                    leVar.m5710a(4, a222);
                }
            }
            if (this.f3245e != null && this.f3245e.length > 0) {
                for (int a2222 : this.f3245e) {
                    leVar.m5710a(5, a2222);
                }
            }
            if (this.f3246f != null && this.f3246f.length > 0) {
                for (int a22222 : this.f3246f) {
                    leVar.m5710a(6, a22222);
                }
            }
            if (this.f3247g != null && this.f3247g.length > 0) {
                for (int a222222 : this.f3247g) {
                    leVar.m5710a(7, a222222);
                }
            }
            if (this.f3248h != null && this.f3248h.length > 0) {
                for (int a2222222 : this.f3248h) {
                    leVar.m5710a(8, a2222222);
                }
            }
            if (this.f3249i != null && this.f3249i.length > 0) {
                for (int a22222222 : this.f3249i) {
                    leVar.m5710a(9, a22222222);
                }
            }
            if (this.f3250j != null && this.f3250j.length > 0) {
                while (i < this.f3250j.length) {
                    leVar.m5710a(10, this.f3250j[i]);
                    i++;
                }
            }
            super.mo730a(leVar);
        }

        protected int mo731b() {
            int i;
            int i2;
            int i3 = 0;
            int b = super.mo731b();
            if (this.f3241a == null || this.f3241a.length <= 0) {
                i = b;
            } else {
                i2 = 0;
                for (int b2 : this.f3241a) {
                    i2 += le.m5685b(b2);
                }
                i = (b + i2) + (this.f3241a.length * 1);
            }
            if (this.f3242b != null && this.f3242b.length > 0) {
                b = 0;
                for (int b22 : this.f3242b) {
                    b += le.m5685b(b22);
                }
                i = (i + b) + (this.f3242b.length * 1);
            }
            if (this.f3243c != null && this.f3243c.length > 0) {
                b = 0;
                for (int b222 : this.f3243c) {
                    b += le.m5685b(b222);
                }
                i = (i + b) + (this.f3243c.length * 1);
            }
            if (this.f3244d != null && this.f3244d.length > 0) {
                b = 0;
                for (int b2222 : this.f3244d) {
                    b += le.m5685b(b2222);
                }
                i = (i + b) + (this.f3244d.length * 1);
            }
            if (this.f3245e != null && this.f3245e.length > 0) {
                b = 0;
                for (int b22222 : this.f3245e) {
                    b += le.m5685b(b22222);
                }
                i = (i + b) + (this.f3245e.length * 1);
            }
            if (this.f3246f != null && this.f3246f.length > 0) {
                b = 0;
                for (int b222222 : this.f3246f) {
                    b += le.m5685b(b222222);
                }
                i = (i + b) + (this.f3246f.length * 1);
            }
            if (this.f3247g != null && this.f3247g.length > 0) {
                b = 0;
                for (int b2222222 : this.f3247g) {
                    b += le.m5685b(b2222222);
                }
                i = (i + b) + (this.f3247g.length * 1);
            }
            if (this.f3248h != null && this.f3248h.length > 0) {
                b = 0;
                for (int b22222222 : this.f3248h) {
                    b += le.m5685b(b22222222);
                }
                i = (i + b) + (this.f3248h.length * 1);
            }
            if (this.f3249i != null && this.f3249i.length > 0) {
                b = 0;
                for (int b222222222 : this.f3249i) {
                    b += le.m5685b(b222222222);
                }
                i = (i + b) + (this.f3249i.length * 1);
            }
            if (this.f3250j == null || this.f3250j.length <= 0) {
                return i;
            }
            i2 = 0;
            while (i3 < this.f3250j.length) {
                i2 += le.m5685b(this.f3250j[i3]);
                i3++;
            }
            return (i + i2) + (this.f3250j.length * 1);
        }

        public C0969g m4744c() {
            this.f3241a = lo.f3967a;
            this.f3242b = lo.f3967a;
            this.f3243c = lo.f3967a;
            this.f3244d = lo.f3967a;
            this.f3245e = lo.f3967a;
            this.f3246f = lo.f3967a;
            this.f3247g = lo.f3967a;
            this.f3248h = lo.f3967a;
            this.f3249i = lo.f3967a;
            this.f3250j = lo.f3967a;
            this.r = null;
            this.s = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0969g)) {
                return false;
            }
            C0969g c0969g = (C0969g) obj;
            return (lj.m5752a(this.f3241a, c0969g.f3241a) && lj.m5752a(this.f3242b, c0969g.f3242b) && lj.m5752a(this.f3243c, c0969g.f3243c) && lj.m5752a(this.f3244d, c0969g.f3244d) && lj.m5752a(this.f3245e, c0969g.f3245e) && lj.m5752a(this.f3246f, c0969g.f3246f) && lj.m5752a(this.f3247g, c0969g.f3247g) && lj.m5752a(this.f3248h, c0969g.f3248h) && lj.m5752a(this.f3249i, c0969g.f3249i) && lj.m5752a(this.f3250j, c0969g.f3250j)) ? m4715a((lf) c0969g) : false;
        }

        public int hashCode() {
            return ((((((((((((((((((((lj.m5749a(this.f3241a) + 527) * 31) + lj.m5749a(this.f3242b)) * 31) + lj.m5749a(this.f3243c)) * 31) + lj.m5749a(this.f3244d)) * 31) + lj.m5749a(this.f3245e)) * 31) + lj.m5749a(this.f3246f)) * 31) + lj.m5749a(this.f3247g)) * 31) + lj.m5749a(this.f3248h)) * 31) + lj.m5749a(this.f3249i)) * 31) + lj.m5749a(this.f3250j)) * 31) + m4717d();
        }
    }

    public static final class C0970h extends lf<C0970h> {
        private static volatile C0970h[] f3251d;
        public String f3252a;
        public C1009a f3253b;
        public C0966d f3254c;

        public C0970h() {
            m4748c();
        }

        public static C0970h[] m4745a() {
            if (f3251d == null) {
                synchronized (lj.f3956a) {
                    if (f3251d == null) {
                        f3251d = new C0970h[0];
                    }
                }
            }
            return f3251d;
        }

        public void mo730a(le leVar) {
            if (!this.f3252a.equals("")) {
                leVar.m5713a(1, this.f3252a);
            }
            if (this.f3253b != null) {
                leVar.m5712a(2, this.f3253b);
            }
            if (this.f3254c != null) {
                leVar.m5712a(3, this.f3254c);
            }
            super.mo730a(leVar);
        }

        protected int mo731b() {
            int b = super.mo731b();
            if (!this.f3252a.equals("")) {
                b += le.m5689b(1, this.f3252a);
            }
            if (this.f3253b != null) {
                b += le.m5695c(2, this.f3253b);
            }
            return this.f3254c != null ? b + le.m5695c(3, this.f3254c) : b;
        }

        public C0970h m4748c() {
            this.f3252a = "";
            this.f3253b = null;
            this.f3254c = null;
            this.r = null;
            this.s = -1;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0970h)) {
                return false;
            }
            C0970h c0970h = (C0970h) obj;
            if (this.f3252a == null) {
                if (c0970h.f3252a != null) {
                    return false;
                }
            } else if (!this.f3252a.equals(c0970h.f3252a)) {
                return false;
            }
            if (this.f3253b == null) {
                if (c0970h.f3253b != null) {
                    return false;
                }
            } else if (!this.f3253b.equals(c0970h.f3253b)) {
                return false;
            }
            if (this.f3254c == null) {
                if (c0970h.f3254c != null) {
                    return false;
                }
            } else if (!this.f3254c.equals(c0970h.f3254c)) {
                return false;
            }
            return m4715a((lf) c0970h);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f3253b == null ? 0 : this.f3253b.hashCode()) + (((this.f3252a == null ? 0 : this.f3252a.hashCode()) + 527) * 31)) * 31;
            if (this.f3254c != null) {
                i = this.f3254c.hashCode();
            }
            return ((hashCode + i) * 31) + m4717d();
        }
    }

    public static final class C0971i extends lf<C0971i> {
        public C0970h[] f3255a;
        public C0968f f3256b;
        public String f3257c;

        public C0971i() {
            m4749a();
        }

        public C0971i m4749a() {
            this.f3255a = C0970h.m4745a();
            this.f3256b = null;
            this.f3257c = "";
            this.r = null;
            this.s = -1;
            return this;
        }

        public void mo730a(le leVar) {
            if (this.f3255a != null && this.f3255a.length > 0) {
                for (lk lkVar : this.f3255a) {
                    if (lkVar != null) {
                        leVar.m5712a(1, lkVar);
                    }
                }
            }
            if (this.f3256b != null) {
                leVar.m5712a(2, this.f3256b);
            }
            if (!this.f3257c.equals("")) {
                leVar.m5713a(3, this.f3257c);
            }
            super.mo730a(leVar);
        }

        protected int mo731b() {
            int b = super.mo731b();
            if (this.f3255a != null && this.f3255a.length > 0) {
                for (lk lkVar : this.f3255a) {
                    if (lkVar != null) {
                        b += le.m5695c(1, lkVar);
                    }
                }
            }
            if (this.f3256b != null) {
                b += le.m5695c(2, this.f3256b);
            }
            return !this.f3257c.equals("") ? b + le.m5689b(3, this.f3257c) : b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0971i)) {
                return false;
            }
            C0971i c0971i = (C0971i) obj;
            if (!lj.m5753a(this.f3255a, c0971i.f3255a)) {
                return false;
            }
            if (this.f3256b == null) {
                if (c0971i.f3256b != null) {
                    return false;
                }
            } else if (!this.f3256b.equals(c0971i.f3256b)) {
                return false;
            }
            if (this.f3257c == null) {
                if (c0971i.f3257c != null) {
                    return false;
                }
            } else if (!this.f3257c.equals(c0971i.f3257c)) {
                return false;
            }
            return m4715a((lf) c0971i);
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((this.f3256b == null ? 0 : this.f3256b.hashCode()) + ((lj.m5750a(this.f3255a) + 527) * 31)) * 31;
            if (this.f3257c != null) {
                i = this.f3257c.hashCode();
            }
            return ((hashCode + i) * 31) + m4717d();
        }
    }
}
