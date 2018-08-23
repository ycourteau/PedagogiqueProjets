package android.support.v4.view;

import android.os.Build.VERSION;

public class C0178e {
    static final C0175a f410a;

    interface C0175a {
        int mo143a(int i, int i2);
    }

    static class C0176b implements C0175a {
        C0176b() {
        }

        public int mo143a(int i, int i2) {
            return -8388609 & i;
        }
    }

    static class C0177c implements C0175a {
        C0177c() {
        }

        public int mo143a(int i, int i2) {
            return C0179f.m911a(i, i2);
        }
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            f410a = new C0177c();
        } else {
            f410a = new C0176b();
        }
    }

    public static int m910a(int i, int i2) {
        return f410a.mo143a(i, i2);
    }
}
