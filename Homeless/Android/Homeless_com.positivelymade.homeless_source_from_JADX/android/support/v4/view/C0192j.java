package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.View;

class C0192j {

    static class C0191a implements Factory {
        final C0033m f413a;

        C0191a(C0033m c0033m) {
            this.f413a = c0033m;
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f413a.mo22a(null, str, context, attributeSet);
        }

        public String toString() {
            return getClass().getName() + "{" + this.f413a + "}";
        }
    }

    static void m931a(LayoutInflater layoutInflater, C0033m c0033m) {
        layoutInflater.setFactory(c0033m != null ? new C0191a(c0033m) : null);
    }
}
