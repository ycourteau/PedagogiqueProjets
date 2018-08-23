package com.google.android.gms.p028c;

import com.google.android.gms.common.internal.C1304w;
import java.util.ArrayList;
import java.util.List;

public class gr {
    private final String[] f3390a;
    private final double[] f3391b;
    private final double[] f3392c;
    private final int[] f3393d;
    private int f3394e;

    public static class C0999a {
        public final String f3382a;
        public final double f3383b;
        public final double f3384c;
        public final double f3385d;
        public final int f3386e;

        public C0999a(String str, double d, double d2, double d3, int i) {
            this.f3382a = str;
            this.f3384c = d;
            this.f3383b = d2;
            this.f3385d = d3;
            this.f3386e = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0999a)) {
                return false;
            }
            C0999a c0999a = (C0999a) obj;
            return C1304w.m6615a(this.f3382a, c0999a.f3382a) && this.f3383b == c0999a.f3383b && this.f3384c == c0999a.f3384c && this.f3386e == c0999a.f3386e && Double.compare(this.f3385d, c0999a.f3385d) == 0;
        }

        public int hashCode() {
            return C1304w.m6613a(this.f3382a, Double.valueOf(this.f3383b), Double.valueOf(this.f3384c), Double.valueOf(this.f3385d), Integer.valueOf(this.f3386e));
        }

        public String toString() {
            return C1304w.m6614a((Object) this).m6612a("name", this.f3382a).m6612a("minBound", Double.valueOf(this.f3384c)).m6612a("maxBound", Double.valueOf(this.f3383b)).m6612a("percent", Double.valueOf(this.f3385d)).m6612a("count", Integer.valueOf(this.f3386e)).toString();
        }
    }

    public static class C1000b {
        private final List<String> f3387a = new ArrayList();
        private final List<Double> f3388b = new ArrayList();
        private final List<Double> f3389c = new ArrayList();

        public C1000b m4940a(String str, double d, double d2) {
            int i = 0;
            while (i < this.f3387a.size()) {
                double doubleValue = ((Double) this.f3389c.get(i)).doubleValue();
                double doubleValue2 = ((Double) this.f3388b.get(i)).doubleValue();
                if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                    break;
                }
                i++;
            }
            this.f3387a.add(i, str);
            this.f3389c.add(i, Double.valueOf(d));
            this.f3388b.add(i, Double.valueOf(d2));
            return this;
        }

        public gr m4941a() {
            return new gr();
        }
    }

    private gr(C1000b c1000b) {
        int size = c1000b.f3388b.size();
        this.f3390a = (String[]) c1000b.f3387a.toArray(new String[size]);
        this.f3391b = m4942a(c1000b.f3388b);
        this.f3392c = m4942a(c1000b.f3389c);
        this.f3393d = new int[size];
        this.f3394e = 0;
    }

    private double[] m4942a(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    public List<C0999a> m4943a() {
        List<C0999a> arrayList = new ArrayList(this.f3390a.length);
        for (int i = 0; i < this.f3390a.length; i++) {
            arrayList.add(new C0999a(this.f3390a[i], this.f3392c[i], this.f3391b[i], ((double) this.f3393d[i]) / ((double) this.f3394e), this.f3393d[i]));
        }
        return arrayList;
    }

    public void m4944a(double d) {
        this.f3394e++;
        int i = 0;
        while (i < this.f3392c.length) {
            if (this.f3392c[i] <= d && d < this.f3391b[i]) {
                int[] iArr = this.f3393d;
                iArr[i] = iArr[i] + 1;
            }
            if (d >= this.f3392c[i]) {
                i++;
            } else {
                return;
            }
        }
    }
}
