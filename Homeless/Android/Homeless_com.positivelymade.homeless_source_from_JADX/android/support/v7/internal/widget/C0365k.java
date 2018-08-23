package android.support.v7.internal.widget;

public class C0365k {
    private int f935a = 0;
    private int f936b = 0;
    private int f937c = Integer.MIN_VALUE;
    private int f938d = Integer.MIN_VALUE;
    private int f939e = 0;
    private int f940f = 0;
    private boolean f941g = false;
    private boolean f942h = false;

    public int m1677a() {
        return this.f935a;
    }

    public void m1678a(int i, int i2) {
        this.f937c = i;
        this.f938d = i2;
        this.f942h = true;
        if (this.f941g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f935a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f936b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f935a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f936b = i2;
        }
    }

    public void m1679a(boolean z) {
        if (z != this.f941g) {
            this.f941g = z;
            if (!this.f942h) {
                this.f935a = this.f939e;
                this.f936b = this.f940f;
            } else if (z) {
                this.f935a = this.f938d != Integer.MIN_VALUE ? this.f938d : this.f939e;
                this.f936b = this.f937c != Integer.MIN_VALUE ? this.f937c : this.f940f;
            } else {
                this.f935a = this.f937c != Integer.MIN_VALUE ? this.f937c : this.f939e;
                this.f936b = this.f938d != Integer.MIN_VALUE ? this.f938d : this.f940f;
            }
        }
    }

    public int m1680b() {
        return this.f936b;
    }

    public void m1681b(int i, int i2) {
        this.f942h = false;
        if (i != Integer.MIN_VALUE) {
            this.f939e = i;
            this.f935a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f940f = i2;
            this.f936b = i2;
        }
    }

    public int m1682c() {
        return this.f941g ? this.f936b : this.f935a;
    }

    public int m1683d() {
        return this.f941g ? this.f935a : this.f936b;
    }
}
