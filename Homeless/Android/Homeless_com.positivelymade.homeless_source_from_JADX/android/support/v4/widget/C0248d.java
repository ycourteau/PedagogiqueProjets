package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

public class C0248d {
    private static final C0244c f467b;
    private Object f468a;

    interface C0244c {
        Object mo187a(Context context);

        void mo188a(Object obj, int i, int i2);

        boolean mo189a(Object obj);

        boolean mo190a(Object obj, float f);

        boolean mo191a(Object obj, Canvas canvas);

        void mo192b(Object obj);

        boolean mo193c(Object obj);
    }

    static class C0245a implements C0244c {
        C0245a() {
        }

        public Object mo187a(Context context) {
            return null;
        }

        public void mo188a(Object obj, int i, int i2) {
        }

        public boolean mo189a(Object obj) {
            return true;
        }

        public boolean mo190a(Object obj, float f) {
            return false;
        }

        public boolean mo191a(Object obj, Canvas canvas) {
            return false;
        }

        public void mo192b(Object obj) {
        }

        public boolean mo193c(Object obj) {
            return false;
        }
    }

    static class C0246b implements C0244c {
        C0246b() {
        }

        public Object mo187a(Context context) {
            return C0249e.m1187a(context);
        }

        public void mo188a(Object obj, int i, int i2) {
            C0249e.m1188a(obj, i, i2);
        }

        public boolean mo189a(Object obj) {
            return C0249e.m1189a(obj);
        }

        public boolean mo190a(Object obj, float f) {
            return C0249e.m1190a(obj, f);
        }

        public boolean mo191a(Object obj, Canvas canvas) {
            return C0249e.m1191a(obj, canvas);
        }

        public void mo192b(Object obj) {
            C0249e.m1192b(obj);
        }

        public boolean mo193c(Object obj) {
            return C0249e.m1193c(obj);
        }
    }

    static class C0247d extends C0246b {
        C0247d() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f467b = new C0247d();
        } else if (VERSION.SDK_INT >= 14) {
            f467b = new C0246b();
        } else {
            f467b = new C0245a();
        }
    }

    public C0248d(Context context) {
        this.f468a = f467b.mo187a(context);
    }

    public void m1181a(int i, int i2) {
        f467b.mo188a(this.f468a, i, i2);
    }

    public boolean m1182a() {
        return f467b.mo189a(this.f468a);
    }

    public boolean m1183a(float f) {
        return f467b.mo190a(this.f468a, f);
    }

    public boolean m1184a(Canvas canvas) {
        return f467b.mo191a(this.f468a, canvas);
    }

    public void m1185b() {
        f467b.mo192b(this.f468a);
    }

    public boolean m1186c() {
        return f467b.mo193c(this.f468a);
    }
}
