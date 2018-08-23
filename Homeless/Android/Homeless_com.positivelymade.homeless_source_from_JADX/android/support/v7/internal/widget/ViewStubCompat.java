package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v7.p010b.C0275a.C0274i;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
    private int f886a;
    private int f887b;
    private WeakReference<View> f888c;
    private LayoutInflater f889d;
    private C0341a f890e;

    public interface C0341a {
        void m1629a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f886a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0274i.ViewStubCompat, i, 0);
        this.f887b = obtainStyledAttributes.getResourceId(C0274i.ViewStubCompat_android_inflatedId, -1);
        this.f886a = obtainStyledAttributes.getResourceId(C0274i.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C0274i.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View m1630a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f886a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            View inflate = (this.f889d != null ? this.f889d : LayoutInflater.from(getContext())).inflate(this.f886a, viewGroup, false);
            if (this.f887b != -1) {
                inflate.setId(this.f887b);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f888c = new WeakReference(inflate);
            if (this.f890e != null) {
                this.f890e.m1629a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    protected void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f887b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f889d;
    }

    public int getLayoutResource() {
        return this.f886a;
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f887b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f889d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f886a = i;
    }

    public void setOnInflateListener(C0341a c0341a) {
        this.f890e = c0341a;
    }

    public void setVisibility(int i) {
        if (this.f888c != null) {
            View view = (View) this.f888c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m1630a();
        }
    }
}
