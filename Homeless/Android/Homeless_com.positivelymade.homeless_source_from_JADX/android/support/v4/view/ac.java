package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class ac {
    public static int m790a(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    public static int m791a(View view) {
        return view.getMeasuredState();
    }

    static long m792a() {
        return ValueAnimator.getFrameDelay();
    }

    public static void m793a(View view, float f) {
        view.setTranslationX(f);
    }

    public static void m794a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    public static void m795a(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    public static float m796b(View view) {
        return view.getTranslationY();
    }

    public static void m797b(View view, float f) {
        view.setTranslationY(f);
    }

    public static void m798b(View view, boolean z) {
        view.setActivated(z);
    }

    public static void m799c(View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void m800c(View view, float f) {
        view.setScaleY(f);
    }
}
