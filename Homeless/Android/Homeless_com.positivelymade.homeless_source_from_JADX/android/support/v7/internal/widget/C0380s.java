package android.support.v7.internal.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.C0233z;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

public class C0380s {
    private static Method f1013a;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                f1013a = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                if (!f1013a.isAccessible()) {
                    f1013a.setAccessible(true);
                }
            } catch (NoSuchMethodException e) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    public static int m1767a(int i, int i2) {
        return i | i2;
    }

    public static void m1768a(View view, Rect rect, Rect rect2) {
        if (f1013a != null) {
            try {
                f1013a.invoke(view, new Object[]{rect, rect2});
            } catch (Throwable e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    public static boolean m1769a(View view) {
        return C0233z.m1090d(view) == 1;
    }
}
