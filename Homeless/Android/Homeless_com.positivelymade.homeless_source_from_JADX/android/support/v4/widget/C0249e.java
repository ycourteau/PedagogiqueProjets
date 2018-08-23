package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

class C0249e {
    public static Object m1187a(Context context) {
        return new EdgeEffect(context);
    }

    public static void m1188a(Object obj, int i, int i2) {
        ((EdgeEffect) obj).setSize(i, i2);
    }

    public static boolean m1189a(Object obj) {
        return ((EdgeEffect) obj).isFinished();
    }

    public static boolean m1190a(Object obj, float f) {
        ((EdgeEffect) obj).onPull(f);
        return true;
    }

    public static boolean m1191a(Object obj, Canvas canvas) {
        return ((EdgeEffect) obj).draw(canvas);
    }

    public static void m1192b(Object obj) {
        ((EdgeEffect) obj).finish();
    }

    public static boolean m1193c(Object obj) {
        EdgeEffect edgeEffect = (EdgeEffect) obj;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }
}
