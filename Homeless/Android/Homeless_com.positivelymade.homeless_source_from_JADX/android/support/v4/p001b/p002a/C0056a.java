package android.support.v4.p001b.p002a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

public class C0056a {
    static final C0050b f244a;

    interface C0050b {
        void mo41a(Drawable drawable);

        void mo42a(Drawable drawable, float f, float f2);

        void mo43a(Drawable drawable, int i);

        void mo44a(Drawable drawable, int i, int i2, int i3, int i4);

        void mo45a(Drawable drawable, ColorStateList colorStateList);

        void mo46a(Drawable drawable, Mode mode);

        void mo47a(Drawable drawable, boolean z);

        boolean mo48b(Drawable drawable);

        Drawable mo49c(Drawable drawable);
    }

    static class C0051a implements C0050b {
        C0051a() {
        }

        public void mo41a(Drawable drawable) {
        }

        public void mo42a(Drawable drawable, float f, float f2) {
        }

        public void mo43a(Drawable drawable, int i) {
            C0058c.m389a(drawable, i);
        }

        public void mo44a(Drawable drawable, int i, int i2, int i3, int i4) {
        }

        public void mo45a(Drawable drawable, ColorStateList colorStateList) {
            C0058c.m390a(drawable, colorStateList);
        }

        public void mo46a(Drawable drawable, Mode mode) {
            C0058c.m391a(drawable, mode);
        }

        public void mo47a(Drawable drawable, boolean z) {
        }

        public boolean mo48b(Drawable drawable) {
            return false;
        }

        public Drawable mo49c(Drawable drawable) {
            return C0058c.m388a(drawable);
        }
    }

    static class C0052c extends C0051a {
        C0052c() {
        }

        public void mo41a(Drawable drawable) {
            C0059d.m392a(drawable);
        }

        public Drawable mo49c(Drawable drawable) {
            return C0059d.m393b(drawable);
        }
    }

    static class C0053d extends C0052c {
        C0053d() {
        }

        public void mo47a(Drawable drawable, boolean z) {
            C0060e.m394a(drawable, z);
        }

        public boolean mo48b(Drawable drawable) {
            return C0060e.m395a(drawable);
        }

        public Drawable mo49c(Drawable drawable) {
            return C0060e.m396b(drawable);
        }
    }

    static class C0054e extends C0053d {
        C0054e() {
        }

        public void mo42a(Drawable drawable, float f, float f2) {
            C0061f.m398a(drawable, f, f2);
        }

        public void mo43a(Drawable drawable, int i) {
            C0061f.m399a(drawable, i);
        }

        public void mo44a(Drawable drawable, int i, int i2, int i3, int i4) {
            C0061f.m400a(drawable, i, i2, i3, i4);
        }

        public void mo45a(Drawable drawable, ColorStateList colorStateList) {
            C0061f.m401a(drawable, colorStateList);
        }

        public void mo46a(Drawable drawable, Mode mode) {
            C0061f.m402a(drawable, mode);
        }

        public Drawable mo49c(Drawable drawable) {
            return C0061f.m397a(drawable);
        }
    }

    static class C0055f extends C0054e {
        C0055f() {
        }

        public Drawable mo49c(Drawable drawable) {
            return C0057b.m387a(drawable);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 22) {
            f244a = new C0055f();
        } else if (i >= 21) {
            f244a = new C0054e();
        } else if (i >= 19) {
            f244a = new C0053d();
        } else if (i >= 11) {
            f244a = new C0052c();
        } else {
            f244a = new C0051a();
        }
    }

    public static void m378a(Drawable drawable) {
        f244a.mo41a(drawable);
    }

    public static void m379a(Drawable drawable, float f, float f2) {
        f244a.mo42a(drawable, f, f2);
    }

    public static void m380a(Drawable drawable, int i) {
        f244a.mo43a(drawable, i);
    }

    public static void m381a(Drawable drawable, int i, int i2, int i3, int i4) {
        f244a.mo44a(drawable, i, i2, i3, i4);
    }

    public static void m382a(Drawable drawable, ColorStateList colorStateList) {
        f244a.mo45a(drawable, colorStateList);
    }

    public static void m383a(Drawable drawable, Mode mode) {
        f244a.mo46a(drawable, mode);
    }

    public static void m384a(Drawable drawable, boolean z) {
        f244a.mo47a(drawable, z);
    }

    public static boolean m385b(Drawable drawable) {
        return f244a.mo48b(drawable);
    }

    public static Drawable m386c(Drawable drawable) {
        return f244a.mo49c(drawable);
    }
}
