package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public class C0221x {
    static final C0218c f421a;

    interface C0218c {
        float mo158a(VelocityTracker velocityTracker, int i);
    }

    static class C0219a implements C0218c {
        C0219a() {
        }

        public float mo158a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getXVelocity();
        }
    }

    static class C0220b implements C0218c {
        C0220b() {
        }

        public float mo158a(VelocityTracker velocityTracker, int i) {
            return C0222y.m1000a(velocityTracker, i);
        }
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            f421a = new C0220b();
        } else {
            f421a = new C0219a();
        }
    }

    public static float m999a(VelocityTracker velocityTracker, int i) {
        return f421a.mo158a(velocityTracker, i);
    }
}
