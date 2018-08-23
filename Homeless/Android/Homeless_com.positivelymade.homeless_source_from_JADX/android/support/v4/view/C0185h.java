package android.support.v4.view;

import android.view.KeyEvent;

class C0185h {
    public static int m923a(int i) {
        return KeyEvent.normalizeMetaState(i);
    }

    public static boolean m924a(int i, int i2) {
        return KeyEvent.metaStateHasModifiers(i, i2);
    }

    public static boolean m925b(int i) {
        return KeyEvent.metaStateHasNoModifiers(i);
    }
}
