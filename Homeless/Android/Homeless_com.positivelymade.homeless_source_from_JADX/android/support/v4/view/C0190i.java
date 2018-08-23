package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.LayoutInflater;

public class C0190i {
    static final C0186a f412a;

    interface C0186a {
        void mo147a(LayoutInflater layoutInflater, C0033m c0033m);
    }

    static class C0187b implements C0186a {
        C0187b() {
        }

        public void mo147a(LayoutInflater layoutInflater, C0033m c0033m) {
            C0192j.m931a(layoutInflater, c0033m);
        }
    }

    static class C0188c extends C0187b {
        C0188c() {
        }

        public void mo147a(LayoutInflater layoutInflater, C0033m c0033m) {
            C0194k.m932a(layoutInflater, c0033m);
        }
    }

    static class C0189d extends C0188c {
        C0189d() {
        }

        public void mo147a(LayoutInflater layoutInflater, C0033m c0033m) {
            C0195l.m934a(layoutInflater, c0033m);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f412a = new C0189d();
        } else if (i >= 11) {
            f412a = new C0188c();
        } else {
            f412a = new C0187b();
        }
    }

    public static void m930a(LayoutInflater layoutInflater, C0033m c0033m) {
        f412a.mo147a(layoutInflater, c0033m);
    }
}
