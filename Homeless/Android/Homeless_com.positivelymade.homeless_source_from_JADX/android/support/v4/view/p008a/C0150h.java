package android.support.v4.view.p008a;

import android.view.accessibility.AccessibilityRecord;

class C0150h {
    public static Object m783a() {
        return AccessibilityRecord.obtain();
    }

    public static void m784a(Object obj, int i) {
        ((AccessibilityRecord) obj).setFromIndex(i);
    }

    public static void m785a(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setScrollable(z);
    }

    public static void m786b(Object obj, int i) {
        ((AccessibilityRecord) obj).setItemCount(i);
    }

    public static void m787c(Object obj, int i) {
        ((AccessibilityRecord) obj).setToIndex(i);
    }
}
