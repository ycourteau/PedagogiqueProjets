package com.google.android.gms.p028c;

public class cb implements je {
    private int f2574a;
    private int f2575b;
    private final int f2576c;
    private final float f2577d;

    public cb() {
        this(2500, 1, 1.0f);
    }

    public cb(int i, int i2, float f) {
        this.f2574a = i;
        this.f2576c = i2;
        this.f2577d = f;
    }

    public int mo623a() {
        return this.f2574a;
    }

    public void mo624a(lc lcVar) {
        this.f2575b++;
        this.f2574a = (int) (((float) this.f2574a) + (((float) this.f2574a) * this.f2577d));
        if (!m4059c()) {
            throw lcVar;
        }
    }

    public int mo625b() {
        return this.f2575b;
    }

    protected boolean m4059c() {
        return this.f2575b <= this.f2576c;
    }
}
