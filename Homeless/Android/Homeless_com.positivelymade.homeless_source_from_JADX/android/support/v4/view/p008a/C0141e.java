package android.support.v4.view.p008a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

class C0141e {

    interface C0132a {
        Object mo117a(int i);

        List<Object> mo118a(String str, int i);

        boolean mo119a(int i, int i2, Bundle bundle);
    }

    public static Object m761a(final C0132a c0132a) {
        return new AccessibilityNodeProvider() {
            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) c0132a.mo117a(i);
            }

            public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return c0132a.mo118a(str, i);
            }

            public boolean performAction(int i, int i2, Bundle bundle) {
                return c0132a.mo119a(i, i2, bundle);
            }
        };
    }
}
