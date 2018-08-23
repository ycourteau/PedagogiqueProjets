package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;

public class C0184g {
    static final C0180d f411a;

    interface C0180d {
        boolean mo144a(int i, int i2);

        boolean mo145b(int i);
    }

    static class C0181a implements C0180d {
        C0181a() {
        }

        private static int m914a(int i, int i2, int i3, int i4, int i5) {
            Object obj = 1;
            Object obj2 = (i2 & i3) != 0 ? 1 : null;
            int i6 = i4 | i5;
            if ((i2 & i6) == 0) {
                obj = null;
            }
            if (obj2 == null) {
                return obj != null ? i & (i3 ^ -1) : i;
            } else {
                if (obj == null) {
                    return i & (i6 ^ -1);
                }
                throw new IllegalArgumentException("bad arguments");
            }
        }

        public int mo146a(int i) {
            int i2 = (i & 192) != 0 ? i | 1 : i;
            if ((i2 & 48) != 0) {
                i2 |= 2;
            }
            return i2 & 247;
        }

        public boolean mo144a(int i, int i2) {
            return C0181a.m914a(C0181a.m914a(mo146a(i) & 247, i2, 1, 64, 128), i2, 2, 16, 32) == i2;
        }

        public boolean mo145b(int i) {
            return (mo146a(i) & 247) == 0;
        }
    }

    static class C0182b extends C0181a {
        C0182b() {
        }
    }

    static class C0183c extends C0182b {
        C0183c() {
        }

        public int mo146a(int i) {
            return C0185h.m923a(i);
        }

        public boolean mo144a(int i, int i2) {
            return C0185h.m924a(i, i2);
        }

        public boolean mo145b(int i) {
            return C0185h.m925b(i);
        }
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            f411a = new C0183c();
        } else {
            f411a = new C0181a();
        }
    }

    public static boolean m921a(KeyEvent keyEvent) {
        return f411a.mo145b(keyEvent.getMetaState());
    }

    public static boolean m922a(KeyEvent keyEvent, int i) {
        return f411a.mo144a(keyEvent.getMetaState(), i);
    }
}
