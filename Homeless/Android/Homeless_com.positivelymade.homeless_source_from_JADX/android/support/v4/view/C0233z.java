package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;
import java.util.WeakHashMap;

public class C0233z {
    static final C0223j f424a;

    interface C0223j {
        int mo159a(int i, int i2, int i3);

        int mo160a(View view);

        void mo161a(View view, float f);

        void mo162a(View view, int i, Paint paint);

        void mo163a(View view, C0105a c0105a);

        void mo164a(View view, Runnable runnable);

        void mo165a(View view, Runnable runnable, long j);

        void mo166a(View view, boolean z);

        boolean mo167a(View view, int i);

        void mo168b(View view);

        void mo169b(View view, float f);

        void mo170b(View view, int i);

        void mo171b(View view, boolean z);

        int mo172c(View view);

        void mo173c(View view, float f);

        int mo174d(View view);

        int mo175e(View view);

        float mo176f(View view);

        int mo177g(View view);

        ak mo178h(View view);

        int mo179i(View view);

        void mo180j(View view);

        void mo181k(View view);
    }

    static class C0224a implements C0223j {
        WeakHashMap<View, ak> f422a = null;

        C0224a() {
        }

        private boolean m1024a(C0217w c0217w, int i) {
            int b = c0217w.m994b();
            int a = c0217w.m993a() - c0217w.m995c();
            return a == 0 ? false : i < 0 ? b > 0 : b < a + -1;
        }

        public int mo159a(int i, int i2, int i3) {
            return View.resolveSize(i, i2);
        }

        public int mo160a(View view) {
            return 2;
        }

        long mo182a() {
            return 10;
        }

        public void mo161a(View view, float f) {
        }

        public void mo162a(View view, int i, Paint paint) {
        }

        public void mo163a(View view, C0105a c0105a) {
        }

        public void mo164a(View view, Runnable runnable) {
            view.postDelayed(runnable, mo182a());
        }

        public void mo165a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, mo182a() + j);
        }

        public void mo166a(View view, boolean z) {
        }

        public boolean mo167a(View view, int i) {
            return (view instanceof C0217w) && m1024a((C0217w) view, i);
        }

        public void mo168b(View view) {
            view.invalidate();
        }

        public void mo169b(View view, float f) {
        }

        public void mo170b(View view, int i) {
        }

        public void mo171b(View view, boolean z) {
        }

        public int mo172c(View view) {
            return 0;
        }

        public void mo173c(View view, float f) {
        }

        public int mo174d(View view) {
            return 0;
        }

        public int mo175e(View view) {
            return 0;
        }

        public float mo176f(View view) {
            return 0.0f;
        }

        public int mo177g(View view) {
            return aa.m788a(view);
        }

        public ak mo178h(View view) {
            return new ak(view);
        }

        public int mo179i(View view) {
            return 0;
        }

        public void mo180j(View view) {
        }

        public void mo181k(View view) {
        }
    }

    static class C0225b extends C0224a {
        C0225b() {
        }
    }

    static class C0226c extends C0225b {
        C0226c() {
        }

        public int mo160a(View view) {
            return ab.m789a(view);
        }
    }

    static class C0227d extends C0226c {
        C0227d() {
        }

        public int mo159a(int i, int i2, int i3) {
            return ac.m790a(i, i2, i3);
        }

        long mo182a() {
            return ac.m792a();
        }

        public void mo161a(View view, float f) {
            ac.m793a(view, f);
        }

        public void mo162a(View view, int i, Paint paint) {
            ac.m794a(view, i, paint);
        }

        public void mo166a(View view, boolean z) {
            ac.m795a(view, z);
        }

        public void mo169b(View view, float f) {
            ac.m797b(view, f);
        }

        public void mo171b(View view, boolean z) {
            ac.m798b(view, z);
        }

        public void mo173c(View view, float f) {
            ac.m800c(view, f);
        }

        public int mo175e(View view) {
            return ac.m791a(view);
        }

        public float mo176f(View view) {
            return ac.m796b(view);
        }

        public void mo181k(View view) {
            ac.m799c(view);
        }
    }

    static class C0228e extends C0227d {
        static boolean f423b = false;

        C0228e() {
        }

        public void mo163a(View view, C0105a c0105a) {
            ad.m801a(view, c0105a == null ? null : c0105a.m504a());
        }

        public boolean mo167a(View view, int i) {
            return ad.m802a(view, i);
        }

        public ak mo178h(View view) {
            if (this.a == null) {
                this.a = new WeakHashMap();
            }
            ak akVar = (ak) this.a.get(view);
            if (akVar != null) {
                return akVar;
            }
            akVar = new ak(view);
            this.a.put(view, akVar);
            return akVar;
        }
    }

    static class C0229f extends C0228e {
        C0229f() {
        }

        public void mo164a(View view, Runnable runnable) {
            ae.m805a(view, runnable);
        }

        public void mo165a(View view, Runnable runnable, long j) {
            ae.m806a(view, runnable, j);
        }

        public void mo168b(View view) {
            ae.m803a(view);
        }

        public void mo170b(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            ae.m804a(view, i);
        }

        public int mo172c(View view) {
            return ae.m807b(view);
        }

        public int mo177g(View view) {
            return ae.m808c(view);
        }

        public void mo180j(View view) {
            ae.m809d(view);
        }
    }

    static class C0230g extends C0229f {
        C0230g() {
        }

        public int mo174d(View view) {
            return af.m810a(view);
        }

        public int mo179i(View view) {
            return af.m811b(view);
        }
    }

    static class C0231h extends C0230g {
        C0231h() {
        }

        public void mo170b(View view, int i) {
            ae.m804a(view, i);
        }
    }

    static class C0232i extends C0231h {
        C0232i() {
        }

        public void mo180j(View view) {
            ag.m812a(view);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f424a = new C0232i();
        } else if (i >= 19) {
            f424a = new C0231h();
        } else if (i >= 17) {
            f424a = new C0230g();
        } else if (i >= 16) {
            f424a = new C0229f();
        } else if (i >= 14) {
            f424a = new C0228e();
        } else if (i >= 11) {
            f424a = new C0227d();
        } else if (i >= 9) {
            f424a = new C0226c();
        } else if (i >= 7) {
            f424a = new C0225b();
        } else {
            f424a = new C0224a();
        }
    }

    public static int m1075a(int i, int i2, int i3) {
        return f424a.mo159a(i, i2, i3);
    }

    public static int m1076a(View view) {
        return f424a.mo160a(view);
    }

    public static void m1077a(View view, float f) {
        f424a.mo161a(view, f);
    }

    public static void m1078a(View view, int i, Paint paint) {
        f424a.mo162a(view, i, paint);
    }

    public static void m1079a(View view, C0105a c0105a) {
        f424a.mo163a(view, c0105a);
    }

    public static void m1080a(View view, Runnable runnable) {
        f424a.mo164a(view, runnable);
    }

    public static void m1081a(View view, Runnable runnable, long j) {
        f424a.mo165a(view, runnable, j);
    }

    public static void m1082a(View view, boolean z) {
        f424a.mo166a(view, z);
    }

    public static boolean m1083a(View view, int i) {
        return f424a.mo167a(view, i);
    }

    public static void m1084b(View view) {
        f424a.mo168b(view);
    }

    public static void m1085b(View view, float f) {
        f424a.mo169b(view, f);
    }

    public static void m1086b(View view, int i) {
        f424a.mo170b(view, i);
    }

    public static void m1087b(View view, boolean z) {
        f424a.mo171b(view, z);
    }

    public static int m1088c(View view) {
        return f424a.mo172c(view);
    }

    public static void m1089c(View view, float f) {
        f424a.mo173c(view, f);
    }

    public static int m1090d(View view) {
        return f424a.mo174d(view);
    }

    public static int m1091e(View view) {
        return f424a.mo175e(view);
    }

    public static float m1092f(View view) {
        return f424a.mo176f(view);
    }

    public static int m1093g(View view) {
        return f424a.mo177g(view);
    }

    public static ak m1094h(View view) {
        return f424a.mo178h(view);
    }

    public static int m1095i(View view) {
        return f424a.mo179i(view);
    }

    public static void m1096j(View view) {
        f424a.mo180j(view);
    }

    public static void m1097k(View view) {
        f424a.mo181k(view);
    }
}
