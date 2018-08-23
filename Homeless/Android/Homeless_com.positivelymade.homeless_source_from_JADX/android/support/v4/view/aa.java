package android.support.v4.view;

import android.view.View;
import java.lang.reflect.Field;

class aa {
    private static Field f387a;
    private static boolean f388b;

    static int m788a(View view) {
        if (!f388b) {
            try {
                f387a = View.class.getDeclaredField("mMinHeight");
                f387a.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f388b = true;
        }
        if (f387a != null) {
            try {
                return ((Integer) f387a.get(view)).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }
}
