package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.C0214s;
import android.support.v4.view.C0233z;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class C0237a implements OnTouchListener {
    private static final int f437r = ViewConfiguration.getTapTimeout();
    private final C0235a f438a = new C0235a();
    private final Interpolator f439b = new AccelerateInterpolator();
    private final View f440c;
    private Runnable f441d;
    private float[] f442e = new float[]{0.0f, 0.0f};
    private float[] f443f = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    private int f444g;
    private int f445h;
    private float[] f446i = new float[]{0.0f, 0.0f};
    private float[] f447j = new float[]{0.0f, 0.0f};
    private float[] f448k = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean f449l;
    private boolean f450m;
    private boolean f451n;
    private boolean f452o;
    private boolean f453p;
    private boolean f454q;

    private static class C0235a {
        private int f425a;
        private int f426b;
        private float f427c;
        private float f428d;
        private long f429e = Long.MIN_VALUE;
        private long f430f = 0;
        private int f431g = 0;
        private int f432h = 0;
        private long f433i = -1;
        private float f434j;
        private int f435k;

        private float m1099a(float f) {
            return ((-4.0f * f) * f) + (4.0f * f);
        }

        private float m1100a(long j) {
            if (j < this.f429e) {
                return 0.0f;
            }
            if (this.f433i < 0 || j < this.f433i) {
                return C0237a.m1119b(((float) (j - this.f429e)) / ((float) this.f425a), 0.0f, 1.0f) * 0.5f;
            }
            long j2 = j - this.f433i;
            return (C0237a.m1119b(((float) j2) / ((float) this.f435k), 0.0f, 1.0f) * this.f434j) + (1.0f - this.f434j);
        }

        public void m1101a() {
            this.f429e = AnimationUtils.currentAnimationTimeMillis();
            this.f433i = -1;
            this.f430f = this.f429e;
            this.f434j = 0.5f;
            this.f431g = 0;
            this.f432h = 0;
        }

        public void m1102a(float f, float f2) {
            this.f427c = f;
            this.f428d = f2;
        }

        public void m1103a(int i) {
            this.f425a = i;
        }

        public void m1104b() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f435k = C0237a.m1120b((int) (currentAnimationTimeMillis - this.f429e), 0, this.f426b);
            this.f434j = m1100a(currentAnimationTimeMillis);
            this.f433i = currentAnimationTimeMillis;
        }

        public void m1105b(int i) {
            this.f426b = i;
        }

        public boolean m1106c() {
            return this.f433i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f433i + ((long) this.f435k);
        }

        public void m1107d() {
            if (this.f430f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float a = m1099a(m1100a(currentAnimationTimeMillis));
            long j = currentAnimationTimeMillis - this.f430f;
            this.f430f = currentAnimationTimeMillis;
            this.f431g = (int) ((((float) j) * a) * this.f427c);
            this.f432h = (int) ((((float) j) * a) * this.f428d);
        }

        public int m1108e() {
            return (int) (this.f427c / Math.abs(this.f427c));
        }

        public int m1109f() {
            return (int) (this.f428d / Math.abs(this.f428d));
        }

        public int m1110g() {
            return this.f431g;
        }

        public int m1111h() {
            return this.f432h;
        }
    }

    private class C0236b implements Runnable {
        final /* synthetic */ C0237a f436a;

        private C0236b(C0237a c0237a) {
            this.f436a = c0237a;
        }

        public void run() {
            if (this.f436a.f452o) {
                if (this.f436a.f450m) {
                    this.f436a.f450m = false;
                    this.f436a.f438a.m1101a();
                }
                C0235a c = this.f436a.f438a;
                if (c.m1106c() || !this.f436a.m1116a()) {
                    this.f436a.f452o = false;
                    return;
                }
                if (this.f436a.f451n) {
                    this.f436a.f451n = false;
                    this.f436a.m1127d();
                }
                c.m1107d();
                this.f436a.mo194a(c.m1110g(), c.m1111h());
                C0233z.m1080a(this.f436a.f440c, (Runnable) this);
            }
        }
    }

    public C0237a(View view) {
        this.f440c = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        m1133a((float) i, (float) i);
        m1137b((float) i2, (float) i2);
        m1134a(1);
        m1143e(Float.MAX_VALUE, Float.MAX_VALUE);
        m1141d(0.2f, 0.2f);
        m1139c(1.0f, 1.0f);
        m1138b(f437r);
        m1140c(500);
        m1142d(500);
    }

    private float m1113a(float f, float f2, float f3, float f4) {
        float f5;
        float b = C0237a.m1119b(f * f2, 0.0f, f3);
        b = m1130f(f2 - f4, b) - m1130f(f4, b);
        if (b < 0.0f) {
            f5 = -this.f439b.getInterpolation(-b);
        } else if (b <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f439b.getInterpolation(b);
        }
        return C0237a.m1119b(f5, -1.0f, 1.0f);
    }

    private float m1114a(int i, float f, float f2, float f3) {
        float a = m1113a(this.f442e[i], f2, this.f443f[i], f);
        if (a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f446i[i];
        float f5 = this.f447j[i];
        float f6 = this.f448k[i];
        f4 *= f3;
        return a > 0.0f ? C0237a.m1119b(a * f4, f5, f6) : -C0237a.m1119b((-a) * f4, f5, f6);
    }

    private boolean m1116a() {
        C0235a c0235a = this.f438a;
        int f = c0235a.m1109f();
        int e = c0235a.m1108e();
        return (f != 0 && mo196f(f)) || (e != 0 && mo195e(e));
    }

    private static float m1119b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    private static int m1120b(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    private void m1121b() {
        if (this.f441d == null) {
            this.f441d = new C0236b();
        }
        this.f452o = true;
        this.f450m = true;
        if (this.f449l || this.f445h <= 0) {
            this.f441d.run();
        } else {
            C0233z.m1081a(this.f440c, this.f441d, (long) this.f445h);
        }
        this.f449l = true;
    }

    private void m1125c() {
        if (this.f450m) {
            this.f452o = false;
        } else {
            this.f438a.m1104b();
        }
    }

    private void m1127d() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f440c.onTouchEvent(obtain);
        obtain.recycle();
    }

    private float m1130f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f444g) {
            case 0:
            case 1:
                return f < f2 ? f >= 0.0f ? 1.0f - (f / f2) : (this.f452o && this.f444g == 1) ? 1.0f : 0.0f : 0.0f;
            case 2:
                return f < 0.0f ? f / (-f2) : 0.0f;
            default:
                return 0.0f;
        }
    }

    public C0237a m1133a(float f, float f2) {
        this.f448k[0] = f / 1000.0f;
        this.f448k[1] = f2 / 1000.0f;
        return this;
    }

    public C0237a m1134a(int i) {
        this.f444g = i;
        return this;
    }

    public C0237a m1135a(boolean z) {
        if (this.f453p && !z) {
            m1125c();
        }
        this.f453p = z;
        return this;
    }

    public abstract void mo194a(int i, int i2);

    public C0237a m1137b(float f, float f2) {
        this.f447j[0] = f / 1000.0f;
        this.f447j[1] = f2 / 1000.0f;
        return this;
    }

    public C0237a m1138b(int i) {
        this.f445h = i;
        return this;
    }

    public C0237a m1139c(float f, float f2) {
        this.f446i[0] = f / 1000.0f;
        this.f446i[1] = f2 / 1000.0f;
        return this;
    }

    public C0237a m1140c(int i) {
        this.f438a.m1103a(i);
        return this;
    }

    public C0237a m1141d(float f, float f2) {
        this.f442e[0] = f;
        this.f442e[1] = f2;
        return this;
    }

    public C0237a m1142d(int i) {
        this.f438a.m1105b(i);
        return this;
    }

    public C0237a m1143e(float f, float f2) {
        this.f443f[0] = f;
        this.f443f[1] = f2;
        return this;
    }

    public abstract boolean mo195e(int i);

    public abstract boolean mo196f(int i);

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = true;
        if (!this.f453p) {
            return false;
        }
        switch (C0214s.m981a(motionEvent)) {
            case 0:
                this.f451n = true;
                this.f449l = false;
                break;
            case 1:
            case 3:
                m1125c();
                break;
            case 2:
                break;
        }
        this.f438a.m1102a(m1114a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f440c.getWidth()), m1114a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f440c.getHeight()));
        if (!this.f452o && m1116a()) {
            m1121b();
        }
        if (!(this.f454q && this.f452o)) {
            z = false;
        }
        return z;
    }
}
