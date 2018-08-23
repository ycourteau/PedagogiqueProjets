package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.CapturedViewProperty;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;

public abstract class C0320e<T extends Adapter> extends ViewGroup {
    int f677A;
    int f678B = -1;
    long f679C = Long.MIN_VALUE;
    boolean f680D = false;
    private int f681a;
    private View f682b;
    private boolean f683c;
    private boolean f684d;
    private C0357e f685e;
    @ExportedProperty(category = "scrolling")
    int f686j = 0;
    int f687k;
    int f688l;
    long f689m = Long.MIN_VALUE;
    long f690n;
    boolean f691o = false;
    int f692p;
    boolean f693q = false;
    C0356d f694r;
    C0354b f695s;
    C0355c f696t;
    boolean f697u;
    @ExportedProperty(category = "list")
    int f698v = -1;
    long f699w = Long.MIN_VALUE;
    @ExportedProperty(category = "list")
    int f700x = -1;
    long f701y = Long.MIN_VALUE;
    @ExportedProperty(category = "list")
    int f702z;

    class C0353a extends DataSetObserver {
        final /* synthetic */ C0320e f918a;
        private Parcelable f919b = null;

        C0353a(C0320e c0320e) {
            this.f918a = c0320e;
        }

        public void onChanged() {
            this.f918a.f697u = true;
            this.f918a.f677A = this.f918a.f702z;
            this.f918a.f702z = this.f918a.getAdapter().getCount();
            if (!this.f918a.getAdapter().hasStableIds() || this.f919b == null || this.f918a.f677A != 0 || this.f918a.f702z <= 0) {
                this.f918a.m1483j();
            } else {
                this.f918a.onRestoreInstanceState(this.f919b);
                this.f919b = null;
            }
            this.f918a.m1478e();
            this.f918a.requestLayout();
        }

        public void onInvalidated() {
            this.f918a.f697u = true;
            if (this.f918a.getAdapter().hasStableIds()) {
                this.f919b = this.f918a.onSaveInstanceState();
            }
            this.f918a.f677A = this.f918a.f702z;
            this.f918a.f702z = 0;
            this.f918a.f700x = -1;
            this.f918a.f701y = Long.MIN_VALUE;
            this.f918a.f698v = -1;
            this.f918a.f699w = Long.MIN_VALUE;
            this.f918a.f691o = false;
            this.f918a.m1478e();
            this.f918a.requestLayout();
        }
    }

    public interface C0354b {
        void mo286a(C0320e<?> c0320e, View view, int i, long j);
    }

    public interface C0355c {
    }

    public interface C0356d {
        void m1657a(C0320e<?> c0320e);

        void m1658a(C0320e<?> c0320e, View view, int i, long j);
    }

    private class C0357e implements Runnable {
        final /* synthetic */ C0320e f920a;

        private C0357e(C0320e c0320e) {
            this.f920a = c0320e;
        }

        public void run() {
            if (!this.f920a.f697u) {
                this.f920a.mo252a();
            } else if (this.f920a.getAdapter() != null) {
                this.f920a.post(this);
            }
        }
    }

    C0320e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void mo252a() {
        if (this.f694r != null) {
            int selectedItemPosition = getSelectedItemPosition();
            if (selectedItemPosition >= 0) {
                View selectedView = getSelectedView();
                this.f694r.m1658a(this, selectedView, selectedItemPosition, getAdapter().getItemId(selectedItemPosition));
                return;
            }
            this.f694r.m1657a(this);
        }
    }

    private void m1472a(boolean z) {
        if (m1477d()) {
            z = false;
        }
        if (z) {
            if (this.f682b != null) {
                this.f682b.setVisibility(0);
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            if (this.f697u) {
                onLayout(false, getLeft(), getTop(), getRight(), getBottom());
                return;
            }
            return;
        }
        if (this.f682b != null) {
            this.f682b.setVisibility(8);
        }
        setVisibility(0);
    }

    public long m1474a(int i) {
        Adapter adapter = getAdapter();
        return (adapter == null || i < 0) ? Long.MIN_VALUE : adapter.getItemId(i);
    }

    public boolean m1475a(View view, int i, long j) {
        if (this.f695s == null) {
            return false;
        }
        playSoundEffect(0);
        if (view != null) {
            view.sendAccessibilityEvent(1);
        }
        this.f695s.mo286a(this, view, i, j);
        return true;
    }

    public void addView(View view) {
        throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
    }

    public void addView(View view, int i) {
        throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
    }

    public void addView(View view, LayoutParams layoutParams) {
        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
    }

    int m1476b(int i, boolean z) {
        return i;
    }

    protected boolean canAnimate() {
        return super.canAnimate() && this.f702z > 0;
    }

    boolean m1477d() {
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        View selectedView = getSelectedView();
        return selectedView != null && selectedView.getVisibility() == 0 && selectedView.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    void m1478e() {
        boolean z = false;
        Adapter adapter = getAdapter();
        boolean z2 = adapter == null || adapter.getCount() == 0;
        boolean z3 = !z2 || m1477d();
        z2 = z3 && this.f684d;
        super.setFocusableInTouchMode(z2);
        z2 = z3 && this.f683c;
        super.setFocusable(z2);
        if (this.f682b != null) {
            if (adapter == null || adapter.isEmpty()) {
                z = true;
            }
            m1472a(z);
        }
    }

    void m1479f() {
        if (this.f694r != null) {
            if (this.f693q || this.f680D) {
                if (this.f685e == null) {
                    this.f685e = new C0357e();
                }
                post(this.f685e);
            } else {
                mo252a();
            }
        }
        if (this.f700x != -1 && isShown() && !isInTouchMode()) {
            sendAccessibilityEvent(4);
        }
    }

    void m1480g() {
        boolean z;
        int i = this.f702z;
        if (i > 0) {
            int i2;
            boolean z2;
            if (this.f691o) {
                this.f691o = false;
                i2 = m1482i();
                if (i2 >= 0 && m1476b(i2, true) == i2) {
                    setNextSelectedPositionInt(i2);
                    z2 = true;
                    if (!z2) {
                        i2 = getSelectedItemPosition();
                        if (i2 >= i) {
                            i2 = i - 1;
                        }
                        if (i2 < 0) {
                            i2 = 0;
                        }
                        i = m1476b(i2, true);
                        i2 = i >= 0 ? m1476b(i2, false) : i;
                        if (i2 >= 0) {
                            setNextSelectedPositionInt(i2);
                            m1481h();
                            z = true;
                        }
                    }
                    z = z2;
                }
            }
            z2 = false;
            if (z2) {
                i2 = getSelectedItemPosition();
                if (i2 >= i) {
                    i2 = i - 1;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                i = m1476b(i2, true);
                if (i >= 0) {
                }
                if (i2 >= 0) {
                    setNextSelectedPositionInt(i2);
                    m1481h();
                    z = true;
                }
            }
            z = z2;
        } else {
            z = false;
        }
        if (!z) {
            this.f700x = -1;
            this.f701y = Long.MIN_VALUE;
            this.f698v = -1;
            this.f699w = Long.MIN_VALUE;
            this.f691o = false;
            m1481h();
        }
    }

    public abstract T getAdapter();

    @CapturedViewProperty
    public int getCount() {
        return this.f702z;
    }

    public View getEmptyView() {
        return this.f682b;
    }

    public int getFirstVisiblePosition() {
        return this.f686j;
    }

    public int getLastVisiblePosition() {
        return (this.f686j + getChildCount()) - 1;
    }

    public final C0354b getOnItemClickListener() {
        return this.f695s;
    }

    public final C0355c getOnItemLongClickListener() {
        return this.f696t;
    }

    public final C0356d getOnItemSelectedListener() {
        return this.f694r;
    }

    public Object getSelectedItem() {
        Adapter adapter = getAdapter();
        int selectedItemPosition = getSelectedItemPosition();
        return (adapter == null || adapter.getCount() <= 0 || selectedItemPosition < 0) ? null : adapter.getItem(selectedItemPosition);
    }

    @CapturedViewProperty
    public long getSelectedItemId() {
        return this.f699w;
    }

    @CapturedViewProperty
    public int getSelectedItemPosition() {
        return this.f698v;
    }

    public abstract View getSelectedView();

    void m1481h() {
        if (this.f700x != this.f678B || this.f701y != this.f679C) {
            m1479f();
            this.f678B = this.f700x;
            this.f679C = this.f701y;
        }
    }

    int m1482i() {
        int i = this.f702z;
        if (i == 0) {
            return -1;
        }
        long j = this.f689m;
        int i2 = this.f688l;
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        int min = Math.min(i - 1, Math.max(0, i2));
        long uptimeMillis = SystemClock.uptimeMillis() + 100;
        Object obj = null;
        Adapter adapter = getAdapter();
        if (adapter == null) {
            return -1;
        }
        int i3 = min;
        int i4 = min;
        while (SystemClock.uptimeMillis() <= uptimeMillis) {
            if (adapter.getItemId(i4) != j) {
                Object obj2 = min == i + -1 ? 1 : null;
                Object obj3 = i3 == 0 ? 1 : null;
                if (obj2 != null && obj3 != null) {
                    break;
                } else if (obj3 != null || (r0 != null && obj2 == null)) {
                    min++;
                    obj = null;
                    i4 = min;
                } else if (obj2 != null || (r0 == null && obj3 == null)) {
                    i3--;
                    obj = 1;
                    i4 = i3;
                }
            } else {
                return i4;
            }
        }
        return -1;
    }

    void m1483j() {
        if (getChildCount() > 0) {
            this.f691o = true;
            this.f690n = (long) this.f681a;
            View childAt;
            if (this.f700x >= 0) {
                childAt = getChildAt(this.f700x - this.f686j);
                this.f689m = this.f699w;
                this.f688l = this.f698v;
                if (childAt != null) {
                    this.f687k = childAt.getTop();
                }
                this.f692p = 0;
                return;
            }
            childAt = getChildAt(0);
            Adapter adapter = getAdapter();
            if (this.f686j < 0 || this.f686j >= adapter.getCount()) {
                this.f689m = -1;
            } else {
                this.f689m = adapter.getItemId(this.f686j);
            }
            this.f688l = this.f686j;
            if (childAt != null) {
                this.f687k = childAt.getTop();
            }
            this.f692p = 1;
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f685e);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f681a = getHeight();
    }

    public void removeAllViews() {
        throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
    }

    public void removeView(View view) {
        throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
    }

    public void removeViewAt(int i) {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
    }

    public abstract void setAdapter(T t);

    public void setEmptyView(View view) {
        this.f682b = view;
        Adapter adapter = getAdapter();
        boolean z = adapter == null || adapter.isEmpty();
        m1472a(z);
    }

    public void setFocusable(boolean z) {
        boolean z2 = true;
        Adapter adapter = getAdapter();
        boolean z3 = adapter == null || adapter.getCount() == 0;
        this.f683c = z;
        if (!z) {
            this.f684d = false;
        }
        if (!z || (z3 && !m1477d())) {
            z2 = false;
        }
        super.setFocusable(z2);
    }

    public void setFocusableInTouchMode(boolean z) {
        boolean z2 = true;
        Adapter adapter = getAdapter();
        boolean z3 = adapter == null || adapter.getCount() == 0;
        this.f684d = z;
        if (z) {
            this.f683c = true;
        }
        if (!z || (z3 && !m1477d())) {
            z2 = false;
        }
        super.setFocusableInTouchMode(z2);
    }

    void setNextSelectedPositionInt(int i) {
        this.f698v = i;
        this.f699w = m1474a(i);
        if (this.f691o && this.f692p == 0 && i >= 0) {
            this.f688l = i;
            this.f689m = this.f699w;
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }

    public void setOnItemClickListener(C0354b c0354b) {
        this.f695s = c0354b;
    }

    public void setOnItemLongClickListener(C0355c c0355c) {
        if (!isLongClickable()) {
            setLongClickable(true);
        }
        this.f696t = c0355c;
    }

    public void setOnItemSelectedListener(C0356d c0356d) {
        this.f694r = c0356d;
    }

    void setSelectedPositionInt(int i) {
        this.f700x = i;
        this.f701y = m1474a(i);
    }

    public abstract void setSelection(int i);
}
