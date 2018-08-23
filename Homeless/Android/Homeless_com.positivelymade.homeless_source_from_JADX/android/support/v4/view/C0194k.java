package android.support.v4.view;

import android.content.Context;
import android.support.v4.view.C0192j.C0191a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import java.lang.reflect.Field;

class C0194k {
    private static Field f414a;
    private static boolean f415b;

    static class C0193a extends C0191a implements Factory2 {
        C0193a(C0033m c0033m) {
            super(c0033m);
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.a.mo22a(view, str, context, attributeSet);
        }
    }

    static void m932a(LayoutInflater layoutInflater, C0033m c0033m) {
        Factory2 c0193a = c0033m != null ? new C0193a(c0033m) : null;
        layoutInflater.setFactory2(c0193a);
        Factory factory = layoutInflater.getFactory();
        if (factory instanceof Factory2) {
            C0194k.m933a(layoutInflater, (Factory2) factory);
        } else {
            C0194k.m933a(layoutInflater, c0193a);
        }
    }

    static void m933a(LayoutInflater layoutInflater, Factory2 factory2) {
        if (!f415b) {
            try {
                f414a = LayoutInflater.class.getDeclaredField("mFactory2");
                f414a.setAccessible(true);
            } catch (Throwable e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f415b = true;
        }
        if (f414a != null) {
            try {
                f414a.set(layoutInflater, factory2);
            } catch (Throwable e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }
}
