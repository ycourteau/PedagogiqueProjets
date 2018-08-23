package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.C0373n;
import android.support.v7.internal.widget.C0374o;
import android.support.v7.internal.widget.C0376p;
import android.support.v7.internal.widget.C0377q;
import android.support.v7.p010b.C0275a.C0266a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AutoCompleteTextView;

public class C0387b extends AutoCompleteTextView {
    private static final int[] f1037a = new int[]{16842964, 16843126};
    private C0374o f1038b;
    private C0374o f1039c;
    private C0376p f1040d;

    public C0387b(Context context) {
        this(context, null);
    }

    public C0387b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0266a.autoCompleteTextViewStyle);
    }

    public C0387b(Context context, AttributeSet attributeSet, int i) {
        super(C0373n.m1701a(context), attributeSet, i);
        if (C0376p.f979a) {
            C0377q a = C0377q.m1724a(getContext(), attributeSet, f1037a, i, 0);
            this.f1040d = a.m1734c();
            if (a.m1737d(0)) {
                ColorStateList c = a.m1734c().m1722c(a.m1739f(0, -1));
                if (c != null) {
                    setInternalBackgroundTint(c);
                }
            }
            if (a.m1737d(1)) {
                setDropDownBackgroundDrawable(a.m1728a(1));
            }
            a.m1732b();
        }
    }

    private void m1794a() {
        if (getBackground() == null) {
            return;
        }
        if (this.f1039c != null) {
            C0376p.m1708a((View) this, this.f1039c);
        } else if (this.f1038b != null) {
            C0376p.m1708a((View) this, this.f1038b);
        }
    }

    private void setInternalBackgroundTint(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1038b == null) {
                this.f1038b = new C0374o();
            }
            this.f1038b.f975a = colorStateList;
            this.f1038b.f978d = true;
        } else {
            this.f1038b = null;
        }
        m1794a();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        m1794a();
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.f1039c != null ? this.f1039c.f975a : null;
    }

    public Mode getSupportBackgroundTintMode() {
        return this.f1039c != null ? this.f1039c.f976b : null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        setInternalBackgroundTint(null);
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        setInternalBackgroundTint(this.f1040d != null ? this.f1040d.m1722c(i) : null);
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(this.f1040d.m1718a(i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1039c == null) {
            this.f1039c = new C0374o();
        }
        this.f1039c.f975a = colorStateList;
        this.f1039c.f978d = true;
        m1794a();
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f1039c == null) {
            this.f1039c = new C0374o();
        }
        this.f1039c.f976b = mode;
        this.f1039c.f977c = true;
        m1794a();
    }
}
