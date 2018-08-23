package com.google.android.gms.p028c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class li implements Cloneable {
    private lg<?, ?> f3953a;
    private Object f3954b;
    private List<lm> f3955c = new ArrayList();

    li() {
    }

    private byte[] m5745c() {
        byte[] bArr = new byte[m5746a()];
        m5747a(le.m5681a(bArr));
        return bArr;
    }

    int m5746a() {
        if (this.f3954b != null) {
            return this.f3953a.m5730a(this.f3954b);
        }
        int i = 0;
        for (lm a : this.f3955c) {
            i = a.m5760a() + i;
        }
        return i;
    }

    void m5747a(le leVar) {
        if (this.f3954b != null) {
            this.f3953a.m5731a(this.f3954b, leVar);
            return;
        }
        for (lm a : this.f3955c) {
            a.m5761a(leVar);
        }
    }

    public final li m5748b() {
        int i = 0;
        li liVar = new li();
        try {
            liVar.f3953a = this.f3953a;
            if (this.f3955c == null) {
                liVar.f3955c = null;
            } else {
                liVar.f3955c.addAll(this.f3955c);
            }
            if (this.f3954b != null) {
                if (this.f3954b instanceof lk) {
                    liVar.f3954b = ((lk) this.f3954b).mo733f();
                } else if (this.f3954b instanceof byte[]) {
                    liVar.f3954b = ((byte[]) this.f3954b).clone();
                } else if (this.f3954b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.f3954b;
                    Object obj = new byte[bArr.length][];
                    liVar.f3954b = obj;
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        obj[i2] = (byte[]) bArr[i2].clone();
                    }
                } else if (this.f3954b instanceof boolean[]) {
                    liVar.f3954b = ((boolean[]) this.f3954b).clone();
                } else if (this.f3954b instanceof int[]) {
                    liVar.f3954b = ((int[]) this.f3954b).clone();
                } else if (this.f3954b instanceof long[]) {
                    liVar.f3954b = ((long[]) this.f3954b).clone();
                } else if (this.f3954b instanceof float[]) {
                    liVar.f3954b = ((float[]) this.f3954b).clone();
                } else if (this.f3954b instanceof double[]) {
                    liVar.f3954b = ((double[]) this.f3954b).clone();
                } else if (this.f3954b instanceof lk[]) {
                    lk[] lkVarArr = (lk[]) this.f3954b;
                    Object obj2 = new lk[lkVarArr.length];
                    liVar.f3954b = obj2;
                    while (i < lkVarArr.length) {
                        obj2[i] = lkVarArr[i].mo733f();
                        i++;
                    }
                }
            }
            return liVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public /* synthetic */ Object clone() {
        return m5748b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof li)) {
            return false;
        }
        li liVar = (li) obj;
        if (this.f3954b != null && liVar.f3954b != null) {
            return this.f3953a == liVar.f3953a ? !this.f3953a.f3945b.isArray() ? this.f3954b.equals(liVar.f3954b) : this.f3954b instanceof byte[] ? Arrays.equals((byte[]) this.f3954b, (byte[]) liVar.f3954b) : this.f3954b instanceof int[] ? Arrays.equals((int[]) this.f3954b, (int[]) liVar.f3954b) : this.f3954b instanceof long[] ? Arrays.equals((long[]) this.f3954b, (long[]) liVar.f3954b) : this.f3954b instanceof float[] ? Arrays.equals((float[]) this.f3954b, (float[]) liVar.f3954b) : this.f3954b instanceof double[] ? Arrays.equals((double[]) this.f3954b, (double[]) liVar.f3954b) : this.f3954b instanceof boolean[] ? Arrays.equals((boolean[]) this.f3954b, (boolean[]) liVar.f3954b) : Arrays.deepEquals((Object[]) this.f3954b, (Object[]) liVar.f3954b) : false;
        } else {
            if (this.f3955c != null && liVar.f3955c != null) {
                return this.f3955c.equals(liVar.f3955c);
            }
            try {
                return Arrays.equals(m5745c(), liVar.m5745c());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public int hashCode() {
        try {
            return Arrays.hashCode(m5745c()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
