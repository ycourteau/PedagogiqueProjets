package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class C0377q {
    private final Context f992a;
    private final TypedArray f993b;
    private C0376p f994c;

    private C0377q(Context context, TypedArray typedArray) {
        this.f992a = context;
        this.f993b = typedArray;
    }

    public static C0377q m1723a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0377q(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static C0377q m1724a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0377q(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public float m1725a(int i, float f) {
        return this.f993b.getFloat(i, f);
    }

    public int m1726a() {
        return this.f993b.length();
    }

    public int m1727a(int i, int i2) {
        return this.f993b.getInt(i, i2);
    }

    public Drawable m1728a(int i) {
        if (this.f993b.hasValue(i)) {
            int resourceId = this.f993b.getResourceId(i, 0);
            if (resourceId != 0) {
                return m1734c().m1718a(resourceId);
            }
        }
        return this.f993b.getDrawable(i);
    }

    public boolean m1729a(int i, boolean z) {
        return this.f993b.getBoolean(i, z);
    }

    public int m1730b(int i, int i2) {
        return this.f993b.getInteger(i, i2);
    }

    public CharSequence m1731b(int i) {
        return this.f993b.getText(i);
    }

    public void m1732b() {
        this.f993b.recycle();
    }

    public int m1733c(int i, int i2) {
        return this.f993b.getDimensionPixelOffset(i, i2);
    }

    public C0376p m1734c() {
        if (this.f994c == null) {
            this.f994c = C0376p.m1706a(this.f992a);
        }
        return this.f994c;
    }

    public String m1735c(int i) {
        return this.f993b.getString(i);
    }

    public int m1736d(int i, int i2) {
        return this.f993b.getDimensionPixelSize(i, i2);
    }

    public boolean m1737d(int i) {
        return this.f993b.hasValue(i);
    }

    public int m1738e(int i, int i2) {
        return this.f993b.getLayoutDimension(i, i2);
    }

    public int m1739f(int i, int i2) {
        return this.f993b.getResourceId(i, i2);
    }
}
