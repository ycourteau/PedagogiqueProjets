package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.C0233z;
import android.support.v7.internal.view.menu.C0294k.C0291a;
import android.support.v7.internal.view.menu.C0301e.C0293b;
import android.support.v7.p010b.C0275a.C0267b;
import android.support.v7.p010b.C0275a.C0274i;
import android.support.v7.widget.ActionMenuView.C0292a;
import android.support.v7.widget.C0290c;
import android.support.v7.widget.C0339e;
import android.support.v7.widget.C0339e.C0287b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Toast;

public class ActionMenuItemView extends C0290c implements C0291a, C0292a, OnClickListener, OnLongClickListener {
    private C0303f f535a;
    private CharSequence f536b;
    private Drawable f537c;
    private C0293b f538d;
    private C0287b f539e;
    private C0289b f540f;
    private boolean f541g;
    private boolean f542h;
    private int f543i;
    private int f544j;
    private int f545k;

    private class C0288a extends C0287b {
        final /* synthetic */ ActionMenuItemView f534a;

        public C0288a(ActionMenuItemView actionMenuItemView) {
            this.f534a = actionMenuItemView;
            super(actionMenuItemView);
        }

        public C0339e mo203a() {
            return this.f534a.f540f != null ? this.f534a.f540f.mo309a() : null;
        }

        protected boolean mo204b() {
            if (this.f534a.f538d == null || !this.f534a.f538d.mo211a(this.f534a.f535a)) {
                return false;
            }
            C0339e a = mo203a();
            return a != null && a.m1610b();
        }
    }

    public static abstract class C0289b {
        public abstract C0339e mo309a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f541g = resources.getBoolean(C0267b.abc_config_allowActionMenuItemTextWithIcon);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0274i.ActionMenuItemView, i, 0);
        this.f543i = obtainStyledAttributes.getDimensionPixelSize(C0274i.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f545k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        setOnLongClickListener(this);
        this.f544j = -1;
    }

    private void m1288e() {
        int i = 0;
        int i2 = !TextUtils.isEmpty(this.f536b) ? 1 : 0;
        if (this.f537c == null || (this.f535a.m1410m() && (this.f541g || this.f542h))) {
            i = 1;
        }
        setText((i2 & i) != 0 ? this.f536b : null);
    }

    public void mo205a(C0303f c0303f, int i) {
        this.f535a = c0303f;
        setIcon(c0303f.getIcon());
        setTitle(c0303f.m1390a((C0291a) this));
        setId(c0303f.getItemId());
        setVisibility(c0303f.isVisible() ? 0 : 8);
        setEnabled(c0303f.isEnabled());
        if (c0303f.hasSubMenu() && this.f539e == null) {
            this.f539e = new C0288a(this);
        }
    }

    public boolean mo206a() {
        return true;
    }

    public boolean m1291b() {
        return !TextUtils.isEmpty(getText());
    }

    public boolean mo207c() {
        return m1291b() && this.f535a.getIcon() == null;
    }

    public boolean mo208d() {
        return m1291b();
    }

    public C0303f getItemData() {
        return this.f535a;
    }

    public void onClick(View view) {
        if (this.f538d != null) {
            this.f538d.mo211a(this.f535a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        this.f541g = getContext().getResources().getBoolean(C0267b.abc_config_allowActionMenuItemTextWithIcon);
        m1288e();
    }

    public boolean onLongClick(View view) {
        if (m1291b()) {
            return false;
        }
        int[] iArr = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(iArr);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i = iArr[1] + (height / 2);
        int i2 = iArr[0] + (width / 2);
        if (C0233z.m1090d(view) == 0) {
            i2 = context.getResources().getDisplayMetrics().widthPixels - i2;
        }
        Toast makeText = Toast.makeText(context, this.f535a.getTitle(), 0);
        if (i < rect.height()) {
            makeText.setGravity(8388661, i2, height);
        } else {
            makeText.setGravity(81, 0, height);
        }
        makeText.show();
        return true;
    }

    protected void onMeasure(int i, int i2) {
        boolean b = m1291b();
        if (b && this.f544j >= 0) {
            super.setPadding(this.f544j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        size = mode == Integer.MIN_VALUE ? Math.min(size, this.f543i) : this.f543i;
        if (mode != 1073741824 && this.f543i > 0 && measuredWidth < size) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }
        if (!b && this.f537c != null) {
            super.setPadding((getMeasuredWidth() - this.f537c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.f535a.hasSubMenu() && this.f539e != null && this.f539e.onTouch(this, motionEvent)) ? true : super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f542h != z) {
            this.f542h = z;
            if (this.f535a != null) {
                this.f535a.m1405h();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f537c = drawable;
        if (drawable != null) {
            float f;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.f545k) {
                f = ((float) this.f545k) / ((float) intrinsicWidth);
                intrinsicWidth = this.f545k;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.f545k) {
                f = ((float) this.f545k) / ((float) intrinsicHeight);
                intrinsicHeight = this.f545k;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m1288e();
    }

    public void setItemInvoker(C0293b c0293b) {
        this.f538d = c0293b;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f544j = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0289b c0289b) {
        this.f540f = c0289b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f536b = charSequence;
        setContentDescription(this.f536b);
        m1288e();
    }
}
