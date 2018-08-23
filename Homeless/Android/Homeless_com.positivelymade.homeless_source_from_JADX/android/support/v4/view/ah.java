package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public class ah {
    static final C0151e f389a;

    interface C0151e {
        int mo130a(ViewConfiguration viewConfiguration);

        boolean mo131b(ViewConfiguration viewConfiguration);
    }

    static class C0152a implements C0151e {
        C0152a() {
        }

        public int mo130a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledTouchSlop();
        }

        public boolean mo131b(ViewConfiguration viewConfiguration) {
            return true;
        }
    }

    static class C0153b extends C0152a {
        C0153b() {
        }

        public int mo130a(ViewConfiguration viewConfiguration) {
            return ai.m822a(viewConfiguration);
        }
    }

    static class C0154c extends C0153b {
        C0154c() {
        }

        public boolean mo131b(ViewConfiguration viewConfiguration) {
            return false;
        }
    }

    static class C0155d extends C0154c {
        C0155d() {
        }

        public boolean mo131b(ViewConfiguration viewConfiguration) {
            return aj.m823a(viewConfiguration);
        }
    }

    static {
        if (VERSION.SDK_INT >= 14) {
            f389a = new C0155d();
        } else if (VERSION.SDK_INT >= 11) {
            f389a = new C0154c();
        } else if (VERSION.SDK_INT >= 8) {
            f389a = new C0153b();
        } else {
            f389a = new C0152a();
        }
    }

    public static int m820a(ViewConfiguration viewConfiguration) {
        return f389a.mo130a(viewConfiguration);
    }

    public static boolean m821b(ViewConfiguration viewConfiguration) {
        return f389a.mo131b(viewConfiguration);
    }
}
