package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.widget.Scroller;

public class C0261j {
    Object f474a;
    C0257a f475b;

    interface C0257a {
        int mo200a(Object obj);

        Object mo201a(Context context, Interpolator interpolator);

        void mo202a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);
    }

    static class C0258b implements C0257a {
        C0258b() {
        }

        public int mo200a(Object obj) {
            return ((Scroller) obj).getFinalY();
        }

        public Object mo201a(Context context, Interpolator interpolator) {
            return interpolator != null ? new Scroller(context, interpolator) : new Scroller(context);
        }

        public void mo202a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ((Scroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8);
        }
    }

    static class C0259c implements C0257a {
        C0259c() {
        }

        public int mo200a(Object obj) {
            return C0262k.m1217a(obj);
        }

        public Object mo201a(Context context, Interpolator interpolator) {
            return C0262k.m1218a(context, interpolator);
        }

        public void mo202a(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C0262k.m1219a(obj, i, i2, i3, i4, i5, i6, i7, i8);
        }
    }

    static class C0260d extends C0259c {
        C0260d() {
        }
    }

    private C0261j(int i, Context context, Interpolator interpolator) {
        if (i >= 14) {
            this.f475b = new C0260d();
        } else if (i >= 9) {
            this.f475b = new C0259c();
        } else {
            this.f475b = new C0258b();
        }
        this.f474a = this.f475b.mo201a(context, interpolator);
    }

    C0261j(Context context, Interpolator interpolator) {
        this(VERSION.SDK_INT, context, interpolator);
    }

    public static C0261j m1213a(Context context) {
        return C0261j.m1214a(context, null);
    }

    public static C0261j m1214a(Context context, Interpolator interpolator) {
        return new C0261j(context, interpolator);
    }

    public int m1215a() {
        return this.f475b.mo200a(this.f474a);
    }

    public void m1216a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f475b.mo202a(this.f474a, i, i2, i3, i4, i5, i6, i7, i8);
    }
}
