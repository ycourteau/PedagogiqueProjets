package android.support.v4.p001b.p002a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;

class C0058c {
    public static Drawable m388a(Drawable drawable) {
        return !(drawable instanceof C0063h) ? new C0063h(drawable) : drawable;
    }

    public static void m389a(Drawable drawable, int i) {
        if (drawable instanceof C0062g) {
            ((C0062g) drawable).setTint(i);
        }
    }

    public static void m390a(Drawable drawable, ColorStateList colorStateList) {
        if (drawable instanceof C0062g) {
            ((C0062g) drawable).setTintList(colorStateList);
        }
    }

    public static void m391a(Drawable drawable, Mode mode) {
        if (drawable instanceof C0062g) {
            ((C0062g) drawable).setTintMode(mode);
        }
    }
}
