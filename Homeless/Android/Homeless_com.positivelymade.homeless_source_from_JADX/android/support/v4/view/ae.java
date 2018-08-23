package android.support.v4.view;

import android.view.View;

class ae {
    public static void m803a(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void m804a(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static void m805a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void m806a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static int m807b(View view) {
        return view.getImportantForAccessibility();
    }

    public static int m808c(View view) {
        return view.getMinimumHeight();
    }

    public static void m809d(View view) {
        view.requestFitSystemWindows();
    }
}
