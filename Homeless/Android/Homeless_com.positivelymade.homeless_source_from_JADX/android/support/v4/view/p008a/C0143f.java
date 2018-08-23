package android.support.v4.view.p008a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

class C0143f {

    interface C0136a {
        Object mo121a(int i);

        List<Object> mo122a(String str, int i);

        boolean mo123a(int i, int i2, Bundle bundle);

        Object mo124b(int i);
    }

    public static Object m762a(final C0136a c0136a) {
        return new AccessibilityNodeProvider() {
            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) c0136a.mo121a(i);
            }

            public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return c0136a.mo122a(str, i);
            }

            public AccessibilityNodeInfo findFocus(int i) {
                return (AccessibilityNodeInfo) c0136a.mo124b(i);
            }

            public boolean performAction(int i, int i2, Bundle bundle) {
                return c0136a.mo123a(i, i2, bundle);
            }
        };
    }
}
