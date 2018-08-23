package android.support.v7.p009a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.p010b.C0275a.C0274i;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public abstract class C0265a {

    public static class C0263a extends MarginLayoutParams {
        public int f476a;

        public C0263a(int i, int i2) {
            super(i, i2);
            this.f476a = 0;
            this.f476a = 8388627;
        }

        public C0263a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f476a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0274i.ActionBarLayout);
            this.f476a = obtainStyledAttributes.getInt(C0274i.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0263a(C0263a c0263a) {
            super(c0263a);
            this.f476a = 0;
            this.f476a = c0263a.f476a;
        }

        public C0263a(LayoutParams layoutParams) {
            super(layoutParams);
            this.f476a = 0;
        }
    }

    public static abstract class C0264b {
        public abstract Drawable m1220a();

        public abstract CharSequence m1221b();

        public abstract View m1222c();

        public abstract void m1223d();

        public abstract CharSequence m1224e();
    }
}
