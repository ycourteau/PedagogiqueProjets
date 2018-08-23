package com.google.android.gms.p032d;

class ci extends Number implements Comparable<ci> {
    private double f4827a;
    private long f4828b;
    private boolean f4829c = false;

    private ci(double d) {
        this.f4827a = d;
    }

    private ci(long j) {
        this.f4828b = j;
    }

    public static ci m7308a(long j) {
        return new ci(j);
    }

    public static ci m7309a(Double d) {
        return new ci(d.doubleValue());
    }

    public static ci m7310a(String str) {
        try {
            return new ci(Long.parseLong(str));
        } catch (NumberFormatException e) {
            try {
                return new ci(Double.parseDouble(str));
            } catch (NumberFormatException e2) {
                throw new NumberFormatException(str + " is not a valid TypedNumber");
            }
        }
    }

    public int m7311a(ci ciVar) {
        return (m7313b() && ciVar.m7313b()) ? new Long(this.f4828b).compareTo(Long.valueOf(ciVar.f4828b)) : Double.compare(doubleValue(), ciVar.doubleValue());
    }

    public boolean m7312a() {
        return !m7313b();
    }

    public boolean m7313b() {
        return this.f4829c;
    }

    public byte byteValue() {
        return (byte) ((int) longValue());
    }

    public long m7314c() {
        return m7313b() ? this.f4828b : (long) this.f4827a;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m7311a((ci) obj);
    }

    public int m7315d() {
        return (int) longValue();
    }

    public double doubleValue() {
        return m7313b() ? (double) this.f4828b : this.f4827a;
    }

    public short m7316e() {
        return (short) ((int) longValue());
    }

    public boolean equals(Object obj) {
        return (obj instanceof ci) && m7311a((ci) obj) == 0;
    }

    public float floatValue() {
        return (float) doubleValue();
    }

    public int hashCode() {
        return new Long(longValue()).hashCode();
    }

    public int intValue() {
        return m7315d();
    }

    public long longValue() {
        return m7314c();
    }

    public short shortValue() {
        return m7316e();
    }

    public String toString() {
        return m7313b() ? Long.toString(this.f4828b) : Double.toString(this.f4827a);
    }
}
