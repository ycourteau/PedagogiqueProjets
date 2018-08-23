package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.internal.view.C0281a;
import android.support.v7.internal.widget.C0320e.C0354b;
import android.support.v7.p009a.C0265a.C0264b;
import android.support.v7.p010b.C0275a.C0266a;
import android.support.v7.widget.C0290c;
import android.support.v7.widget.C0328d;
import android.support.v7.widget.C0328d.C0383a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class C0370l extends HorizontalScrollView implements C0354b {
    private static final Interpolator f953j = new DecelerateInterpolator();
    Runnable f954a;
    int f955b;
    int f956c;
    private C0368b f957d;
    private C0328d f958e;
    private SpinnerCompat f959f;
    private boolean f960g;
    private int f961h;
    private int f962i;

    private class C0367a extends BaseAdapter {
        final /* synthetic */ C0370l f945a;

        private C0367a(C0370l c0370l) {
            this.f945a = c0370l;
        }

        public int getCount() {
            return this.f945a.f958e.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0369c) this.f945a.f958e.getChildAt(i)).m1686b();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return this.f945a.m1687a((C0264b) getItem(i), true);
            }
            ((C0369c) view).m1685a((C0264b) getItem(i));
            return view;
        }
    }

    private class C0368b implements OnClickListener {
        final /* synthetic */ C0370l f946a;

        private C0368b(C0370l c0370l) {
            this.f946a = c0370l;
        }

        public void onClick(View view) {
            ((C0369c) view).m1686b().m1223d();
            int childCount = this.f946a.f958e.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f946a.f958e.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class C0369c extends C0328d implements OnLongClickListener {
        final /* synthetic */ C0370l f947a;
        private final int[] f948b = new int[]{16842964};
        private C0264b f949c;
        private TextView f950d;
        private ImageView f951e;
        private View f952f;

        public C0369c(C0370l c0370l, Context context, C0264b c0264b, boolean z) {
            this.f947a = c0370l;
            super(context, null, C0266a.actionBarTabStyle);
            this.f949c = c0264b;
            C0377q a = C0377q.m1724a(context, null, this.f948b, C0266a.actionBarTabStyle, 0);
            if (a.m1737d(0)) {
                setBackgroundDrawable(a.m1728a(0));
            }
            a.m1732b();
            if (z) {
                setGravity(8388627);
            }
            m1684a();
        }

        public void m1684a() {
            C0264b c0264b = this.f949c;
            View c = c0264b.m1222c();
            if (c != null) {
                C0369c parent = c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        parent.removeView(c);
                    }
                    addView(c);
                }
                this.f952f = c;
                if (this.f950d != null) {
                    this.f950d.setVisibility(8);
                }
                if (this.f951e != null) {
                    this.f951e.setVisibility(8);
                    this.f951e.setImageDrawable(null);
                    return;
                }
                return;
            }
            if (this.f952f != null) {
                removeView(this.f952f);
                this.f952f = null;
            }
            Drawable a = c0264b.m1220a();
            CharSequence b = c0264b.m1221b();
            if (a != null) {
                if (this.f951e == null) {
                    View imageView = new ImageView(getContext());
                    LayoutParams c0383a = new C0383a(-2, -2);
                    c0383a.f1016h = 16;
                    imageView.setLayoutParams(c0383a);
                    addView(imageView, 0);
                    this.f951e = imageView;
                }
                this.f951e.setImageDrawable(a);
                this.f951e.setVisibility(0);
            } else if (this.f951e != null) {
                this.f951e.setVisibility(8);
                this.f951e.setImageDrawable(null);
            }
            boolean z = !TextUtils.isEmpty(b);
            if (z) {
                if (this.f950d == null) {
                    imageView = new C0290c(getContext(), null, C0266a.actionBarTabTextStyle);
                    imageView.setEllipsize(TruncateAt.END);
                    c0383a = new C0383a(-2, -2);
                    c0383a.f1016h = 16;
                    imageView.setLayoutParams(c0383a);
                    addView(imageView);
                    this.f950d = imageView;
                }
                this.f950d.setText(b);
                this.f950d.setVisibility(0);
            } else if (this.f950d != null) {
                this.f950d.setVisibility(8);
                this.f950d.setText(null);
            }
            if (this.f951e != null) {
                this.f951e.setContentDescription(c0264b.m1224e());
            }
            if (z || TextUtils.isEmpty(c0264b.m1224e())) {
                setOnLongClickListener(null);
                setLongClickable(false);
                return;
            }
            setOnLongClickListener(this);
        }

        public void m1685a(C0264b c0264b) {
            this.f949c = c0264b;
            m1684a();
        }

        public C0264b m1686b() {
            return this.f949c;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0264b.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (VERSION.SDK_INT >= 14) {
                accessibilityNodeInfo.setClassName(C0264b.class.getName());
            }
        }

        public boolean onLongClick(View view) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            Context context = getContext();
            int width = getWidth();
            int height = getHeight();
            int i = context.getResources().getDisplayMetrics().widthPixels;
            Toast makeText = Toast.makeText(context, this.f949c.m1224e(), 0);
            makeText.setGravity(49, (iArr[0] + (width / 2)) - (i / 2), height);
            makeText.show();
            return true;
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f947a.f955b > 0 && getMeasuredWidth() > this.f947a.f955b) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(this.f947a.f955b, 1073741824), i2);
            }
        }

        public void setSelected(boolean z) {
            Object obj = isSelected() != z ? 1 : null;
            super.setSelected(z);
            if (obj != null && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private C0369c m1687a(C0264b c0264b, boolean z) {
        C0369c c0369c = new C0369c(this, getContext(), c0264b, z);
        if (z) {
            c0369c.setBackgroundDrawable(null);
            c0369c.setLayoutParams(new AbsListView.LayoutParams(-1, this.f961h));
        } else {
            c0369c.setFocusable(true);
            if (this.f957d == null) {
                this.f957d = new C0368b();
            }
            c0369c.setOnClickListener(this.f957d);
        }
        return c0369c;
    }

    private boolean m1690a() {
        return this.f959f != null && this.f959f.getParent() == this;
    }

    private void m1691b() {
        if (!m1690a()) {
            if (this.f959f == null) {
                this.f959f = m1693d();
            }
            removeView(this.f958e);
            addView(this.f959f, new LayoutParams(-2, -1));
            if (this.f959f.m1492c() == null) {
                this.f959f.mo271a(new C0367a());
            }
            if (this.f954a != null) {
                removeCallbacks(this.f954a);
                this.f954a = null;
            }
            this.f959f.setSelection(this.f962i);
        }
    }

    private boolean m1692c() {
        if (m1690a()) {
            removeView(this.f959f);
            addView(this.f958e, new LayoutParams(-2, -1));
            setTabSelected(this.f959f.getSelectedItemPosition());
        }
        return false;
    }

    private SpinnerCompat m1693d() {
        SpinnerCompat spinnerCompat = new SpinnerCompat(getContext(), null, C0266a.actionDropDownStyle);
        spinnerCompat.setLayoutParams(new C0383a(-2, -1));
        spinnerCompat.m1627a((C0354b) this);
        return spinnerCompat;
    }

    public void m1694a(int i) {
        final View childAt = this.f958e.getChildAt(i);
        if (this.f954a != null) {
            removeCallbacks(this.f954a);
        }
        this.f954a = new Runnable(this) {
            final /* synthetic */ C0370l f944b;

            public void run() {
                this.f944b.smoothScrollTo(childAt.getLeft() - ((this.f944b.getWidth() - childAt.getWidth()) / 2), 0);
                this.f944b.f954a = null;
            }
        };
        post(this.f954a);
    }

    public void mo286a(C0320e<?> c0320e, View view, int i, long j) {
        ((C0369c) view).m1686b().m1223d();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f954a != null) {
            post(this.f954a);
        }
    }

    protected void onConfigurationChanged(Configuration configuration) {
        if (VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        C0281a a = C0281a.m1230a(getContext());
        setContentHeight(a.m1235e());
        this.f956c = a.m1236f();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f954a != null) {
            removeCallbacks(this.f954a);
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = 1;
        int mode = MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f958e.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f955b = -1;
        } else {
            if (childCount > 2) {
                this.f955b = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f955b = MeasureSpec.getSize(i) / 2;
            }
            this.f955b = Math.min(this.f955b, this.f956c);
        }
        mode = MeasureSpec.makeMeasureSpec(this.f961h, 1073741824);
        if (z || !this.f960g) {
            i3 = 0;
        }
        if (i3 != 0) {
            this.f958e.measure(0, mode);
            if (this.f958e.getMeasuredWidth() > MeasureSpec.getSize(i)) {
                m1691b();
            } else {
                m1692c();
            }
        } else {
            m1692c();
        }
        i3 = getMeasuredWidth();
        super.onMeasure(i, mode);
        int measuredWidth = getMeasuredWidth();
        if (z && i3 != measuredWidth) {
            setTabSelected(this.f962i);
        }
    }

    public void setAllowCollapse(boolean z) {
        this.f960g = z;
    }

    public void setContentHeight(int i) {
        this.f961h = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f962i = i;
        int childCount = this.f958e.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f958e.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m1694a(i);
            }
            i2++;
        }
        if (this.f959f != null && i >= 0) {
            this.f959f.setSelection(i);
        }
    }
}
