package com.google.android.gms.p028c;

class lh implements Cloneable {
    private static final li f3948a = new li();
    private boolean f3949b;
    private int[] f3950c;
    private li[] f3951d;
    private int f3952e;

    public lh() {
        this(10);
    }

    public lh(int i) {
        this.f3949b = false;
        int b = m5738b(i);
        this.f3950c = new int[b];
        this.f3951d = new li[b];
        this.f3952e = 0;
    }

    private boolean m5736a(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private boolean m5737a(li[] liVarArr, li[] liVarArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!liVarArr[i2].equals(liVarArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    private int m5738b(int i) {
        return m5739c(i * 4) / 4;
    }

    private int m5739c(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
        }
        return i;
    }

    private void m5740d() {
        int i = this.f3952e;
        int[] iArr = this.f3950c;
        li[] liVarArr = this.f3951d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            li liVar = liVarArr[i3];
            if (liVar != f3948a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    liVarArr[i2] = liVar;
                    liVarArr[i3] = null;
                }
                i2++;
            }
        }
        this.f3949b = false;
        this.f3952e = i2;
    }

    public int m5741a() {
        if (this.f3949b) {
            m5740d();
        }
        return this.f3952e;
    }

    public li m5742a(int i) {
        if (this.f3949b) {
            m5740d();
        }
        return this.f3951d[i];
    }

    public boolean m5743b() {
        return m5741a() == 0;
    }

    public final lh m5744c() {
        int i = 0;
        int a = m5741a();
        lh lhVar = new lh(a);
        System.arraycopy(this.f3950c, 0, lhVar.f3950c, 0, a);
        while (i < a) {
            if (this.f3951d[i] != null) {
                lhVar.f3951d[i] = this.f3951d[i].m5748b();
            }
            i++;
        }
        lhVar.f3952e = a;
        return lhVar;
    }

    public /* synthetic */ Object clone() {
        return m5744c();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lh)) {
            return false;
        }
        lh lhVar = (lh) obj;
        return m5741a() != lhVar.m5741a() ? false : m5736a(this.f3950c, lhVar.f3950c, this.f3952e) && m5737a(this.f3951d, lhVar.f3951d, this.f3952e);
    }

    public int hashCode() {
        if (this.f3949b) {
            m5740d();
        }
        int i = 17;
        for (int i2 = 0; i2 < this.f3952e; i2++) {
            i = (((i * 31) + this.f3950c[i2]) * 31) + this.f3951d[i2].hashCode();
        }
        return i;
    }
}
