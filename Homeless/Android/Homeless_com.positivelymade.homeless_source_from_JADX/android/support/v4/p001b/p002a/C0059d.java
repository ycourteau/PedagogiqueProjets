package android.support.v4.p001b.p002a;

import android.graphics.drawable.Drawable;

class C0059d {
    public static void m392a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static Drawable m393b(Drawable drawable) {
        return !(drawable instanceof C0064i) ? new C0064i(drawable) : drawable;
    }
}
