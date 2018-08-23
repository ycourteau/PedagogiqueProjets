package android.support.v4.p001b.p002a;

import android.graphics.drawable.Drawable;

class C0060e {
    public static void m394a(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    public static boolean m395a(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static Drawable m396b(Drawable drawable) {
        return !(drawable instanceof C0065j) ? new C0065j(drawable) : drawable;
    }
}
