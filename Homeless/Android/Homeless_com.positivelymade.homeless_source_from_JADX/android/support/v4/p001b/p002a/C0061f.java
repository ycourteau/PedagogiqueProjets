package android.support.v4.p001b.p002a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

class C0061f {
    public static Drawable m397a(Drawable drawable) {
        return drawable instanceof GradientDrawable ? new C0066k(drawable) : drawable;
    }

    public static void m398a(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void m399a(Drawable drawable, int i) {
        if (drawable instanceof C0066k) {
            C0058c.m389a(drawable, i);
        } else {
            drawable.setTint(i);
        }
    }

    public static void m400a(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void m401a(Drawable drawable, ColorStateList colorStateList) {
        if (drawable instanceof C0066k) {
            C0058c.m390a(drawable, colorStateList);
        } else {
            drawable.setTintList(colorStateList);
        }
    }

    public static void m402a(Drawable drawable, Mode mode) {
        if (drawable instanceof C0066k) {
            C0058c.m391a(drawable, mode);
        } else {
            drawable.setTintMode(mode);
        }
    }
}
