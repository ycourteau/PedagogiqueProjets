package android.support.v4.view;

import android.view.View;
import android.view.View.AccessibilityDelegate;

class ad {
    public static void m801a(View view, Object obj) {
        view.setAccessibilityDelegate((AccessibilityDelegate) obj);
    }

    public static boolean m802a(View view, int i) {
        return view.canScrollHorizontally(i);
    }
}
