package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

class C0171c {

    public interface C0117a {
        Object mo87a(View view);

        void mo88a(View view, int i);

        void mo89a(View view, Object obj);

        boolean mo90a(View view, int i, Bundle bundle);

        boolean mo91a(View view, AccessibilityEvent accessibilityEvent);

        boolean mo92a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        void mo93b(View view, AccessibilityEvent accessibilityEvent);

        void mo94c(View view, AccessibilityEvent accessibilityEvent);

        void mo95d(View view, AccessibilityEvent accessibilityEvent);
    }

    public static Object m892a(final C0117a c0117a) {
        return new AccessibilityDelegate() {
            public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                return c0117a.mo91a(view, accessibilityEvent);
            }

            public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                return (AccessibilityNodeProvider) c0117a.mo87a(view);
            }

            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                c0117a.mo93b(view, accessibilityEvent);
            }

            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                c0117a.mo89a(view, (Object) accessibilityNodeInfo);
            }

            public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                c0117a.mo94c(view, accessibilityEvent);
            }

            public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return c0117a.mo92a(viewGroup, view, accessibilityEvent);
            }

            public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                return c0117a.mo90a(view, i, bundle);
            }

            public void sendAccessibilityEvent(View view, int i) {
                c0117a.mo88a(view, i);
            }

            public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                c0117a.mo95d(view, accessibilityEvent);
            }
        };
    }

    public static Object m893a(Object obj, View view) {
        return ((AccessibilityDelegate) obj).getAccessibilityNodeProvider(view);
    }

    public static boolean m894a(Object obj, View view, int i, Bundle bundle) {
        return ((AccessibilityDelegate) obj).performAccessibilityAction(view, i, bundle);
    }
}
