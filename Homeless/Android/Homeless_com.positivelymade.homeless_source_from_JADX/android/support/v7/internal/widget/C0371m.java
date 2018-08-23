package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.p001b.C0067a;
import android.util.TypedValue;

public class C0371m {
    static final int[] f963a = new int[]{-16842910};
    static final int[] f964b = new int[]{16842908};
    static final int[] f965c = new int[]{16843518};
    static final int[] f966d = new int[]{16842919};
    static final int[] f967e = new int[]{16842912};
    static final int[] f968f = new int[]{16842913};
    static final int[] f969g = new int[]{-16842919, -16842908};
    static final int[] f970h = new int[0];
    private static final ThreadLocal<TypedValue> f971i = new ThreadLocal();
    private static final int[] f972j = new int[1];

    public static int m1696a(Context context, int i) {
        f972j[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f972j);
        try {
            int color = obtainStyledAttributes.getColor(0, 0);
            return color;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    static int m1697a(Context context, int i, float f) {
        int a = C0371m.m1696a(context, i);
        return C0067a.m407b(a, Math.round(((float) Color.alpha(a)) * f));
    }

    private static TypedValue m1698a() {
        TypedValue typedValue = (TypedValue) f971i.get();
        if (typedValue != null) {
            return typedValue;
        }
        typedValue = new TypedValue();
        f971i.set(typedValue);
        return typedValue;
    }

    public static ColorStateList m1699b(Context context, int i) {
        f972j[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f972j);
        try {
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int m1700c(Context context, int i) {
        ColorStateList b = C0371m.m1699b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f963a, b.getDefaultColor());
        }
        TypedValue a = C0371m.m1698a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return C0371m.m1697a(context, i, a.getFloat());
    }
}
