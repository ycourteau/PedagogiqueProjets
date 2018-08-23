package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.p006e.C0083c;
import android.support.v4.view.C0214s;
import android.support.v4.view.ak;
import android.support.v4.widget.C0250f;
import android.support.v4.widget.C0254g;
import android.support.v7.internal.widget.C0359f;
import android.support.v7.internal.widget.C0363i;
import android.support.v7.p010b.C0275a.C0266a;
import android.support.v7.p010b.C0275a.C0274i;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

public class C0339e {
    private static Method f843a;
    private Handler f844A;
    private Rect f845B;
    private boolean f846C;
    private int f847D;
    int f848b;
    private Context f849c;
    private PopupWindow f850d;
    private ListAdapter f851e;
    private C0411a f852f;
    private int f853g;
    private int f854h;
    private int f855i;
    private int f856j;
    private boolean f857k;
    private int f858l;
    private boolean f859m;
    private boolean f860n;
    private View f861o;
    private int f862p;
    private DataSetObserver f863q;
    private View f864r;
    private Drawable f865s;
    private OnItemClickListener f866t;
    private OnItemSelectedListener f867u;
    private final C0418g f868v;
    private final C0417f f869w;
    private final C0416e f870x;
    private final C0414c f871y;
    private Runnable f872z;

    public static abstract class C0287b implements OnTouchListener {
        private final float f524a;
        private final int f525b;
        private final int f526c;
        private final View f527d;
        private Runnable f528e;
        private Runnable f529f;
        private boolean f530g;
        private boolean f531h;
        private int f532i;
        private final int[] f533j = new int[2];

        private class C0412a implements Runnable {
            final /* synthetic */ C0287b f1171a;

            private C0412a(C0287b c0287b) {
                this.f1171a = c0287b;
            }

            public void run() {
                this.f1171a.f527d.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }

        private class C0413b implements Runnable {
            final /* synthetic */ C0287b f1172a;

            private C0413b(C0287b c0287b) {
                this.f1172a = c0287b;
            }

            public void run() {
                this.f1172a.m1274e();
            }
        }

        public C0287b(View view) {
            this.f527d = view;
            this.f524a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f525b = ViewConfiguration.getTapTimeout();
            this.f526c = (this.f525b + ViewConfiguration.getLongPressTimeout()) / 2;
        }

        private boolean m1267a(MotionEvent motionEvent) {
            View view = this.f527d;
            if (!view.isEnabled()) {
                return false;
            }
            switch (C0214s.m981a(motionEvent)) {
                case 0:
                    this.f532i = motionEvent.getPointerId(0);
                    this.f531h = false;
                    if (this.f528e == null) {
                        this.f528e = new C0412a();
                    }
                    view.postDelayed(this.f528e, (long) this.f525b);
                    if (this.f529f == null) {
                        this.f529f = new C0413b();
                    }
                    view.postDelayed(this.f529f, (long) this.f526c);
                    return false;
                case 1:
                case 3:
                    m1273d();
                    return false;
                case 2:
                    int findPointerIndex = motionEvent.findPointerIndex(this.f532i);
                    if (findPointerIndex < 0 || C0287b.m1268a(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f524a)) {
                        return false;
                    }
                    m1273d();
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                default:
                    return false;
            }
        }

        private static boolean m1268a(View view, float f, float f2, float f3) {
            return f >= (-f3) && f2 >= (-f3) && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
        }

        private boolean m1269a(View view, MotionEvent motionEvent) {
            int[] iArr = this.f533j;
            view.getLocationOnScreen(iArr);
            motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
            return true;
        }

        private boolean m1271b(MotionEvent motionEvent) {
            boolean z = true;
            View view = this.f527d;
            C0339e a = mo203a();
            if (a == null || !a.m1610b()) {
                return false;
            }
            View a2 = a.f852f;
            if (a2 == null || !a2.isShown()) {
                return false;
            }
            MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            m1272b(view, obtainNoHistory);
            m1269a(a2, obtainNoHistory);
            boolean a3 = a2.m1920a(obtainNoHistory, this.f532i);
            obtainNoHistory.recycle();
            int a4 = C0214s.m981a(motionEvent);
            boolean z2 = (a4 == 1 || a4 == 3) ? false : true;
            if (!(a3 && z2)) {
                z = false;
            }
            return z;
        }

        private boolean m1272b(View view, MotionEvent motionEvent) {
            int[] iArr = this.f533j;
            view.getLocationOnScreen(iArr);
            motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
            return true;
        }

        private void m1273d() {
            if (this.f529f != null) {
                this.f527d.removeCallbacks(this.f529f);
            }
            if (this.f528e != null) {
                this.f527d.removeCallbacks(this.f528e);
            }
        }

        private void m1274e() {
            m1273d();
            View view = this.f527d;
            if (view.isEnabled() && !view.isLongClickable() && mo204b()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                this.f530g = true;
                this.f531h = true;
            }
        }

        public abstract C0339e mo203a();

        protected boolean mo204b() {
            C0339e a = mo203a();
            if (!(a == null || a.m1610b())) {
                a.m1611c();
            }
            return true;
        }

        protected boolean mo310c() {
            C0339e a = mo203a();
            if (a != null && a.m1610b()) {
                a.m1601a();
            }
            return true;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean b;
            boolean z = this.f530g;
            if (z) {
                b = this.f531h ? m1271b(motionEvent) : m1271b(motionEvent) || !mo310c();
            } else {
                boolean z2 = m1267a(motionEvent) && mo204b();
                if (z2) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    this.f527d.onTouchEvent(obtain);
                    obtain.recycle();
                }
                b = z2;
            }
            this.f530g = b;
            return b || z;
        }
    }

    class C04081 extends C0287b {
        final /* synthetic */ C0339e f1163a;

        public C0339e mo203a() {
            return this.f1163a;
        }
    }

    class C04092 implements Runnable {
        final /* synthetic */ C0339e f1164a;

        C04092(C0339e c0339e) {
            this.f1164a = c0339e;
        }

        public void run() {
            View d = this.f1164a.m1613d();
            if (d != null && d.getWindowToken() != null) {
                this.f1164a.m1611c();
            }
        }
    }

    class C04103 implements OnItemSelectedListener {
        final /* synthetic */ C0339e f1165a;

        C04103(C0339e c0339e) {
            this.f1165a = c0339e;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i != -1) {
                C0411a a = this.f1165a.f852f;
                if (a != null) {
                    a.f1166f = false;
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private static class C0411a extends C0363i {
        private boolean f1166f;
        private boolean f1167g;
        private boolean f1168h;
        private ak f1169i;
        private C0250f f1170j;

        public C0411a(Context context, boolean z) {
            super(context, null, C0266a.dropDownListViewStyle);
            this.f1167g = z;
            setCacheColorHint(0);
        }

        private void m1916a(View view, int i) {
            performItemClick(view, i, getItemIdAtPosition(i));
        }

        private void m1917a(View view, int i, float f, float f2) {
            this.f1168h = true;
            setPressed(true);
            layoutChildren();
            setSelection(i);
            m1672a(i, view, f, f2);
            setSelectorEnabled(false);
            refreshDrawableState();
        }

        private void m1919d() {
            this.f1168h = false;
            setPressed(false);
            drawableStateChanged();
            if (this.f1169i != null) {
                this.f1169i.m867a();
                this.f1169i = null;
            }
        }

        public boolean m1920a(MotionEvent motionEvent, int i) {
            boolean z;
            boolean z2;
            int a = C0214s.m981a(motionEvent);
            switch (a) {
                case 1:
                    z = false;
                    break;
                case 2:
                    z = true;
                    break;
                case 3:
                    z = false;
                    z2 = false;
                    break;
                default:
                    z = false;
                    z2 = true;
                    break;
            }
            int findPointerIndex = motionEvent.findPointerIndex(i);
            if (findPointerIndex < 0) {
                z = false;
                z2 = false;
            } else {
                int x = (int) motionEvent.getX(findPointerIndex);
                findPointerIndex = (int) motionEvent.getY(findPointerIndex);
                int pointToPosition = pointToPosition(x, findPointerIndex);
                if (pointToPosition == -1) {
                    z2 = z;
                    z = true;
                } else {
                    View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                    m1917a(childAt, pointToPosition, (float) x, (float) findPointerIndex);
                    if (a == 1) {
                        m1916a(childAt, pointToPosition);
                    }
                    z = false;
                    z2 = true;
                }
            }
            if (!z2 || r0) {
                m1919d();
            }
            if (z2) {
                if (this.f1170j == null) {
                    this.f1170j = new C0250f(this);
                }
                this.f1170j.m1135a(true);
                this.f1170j.onTouch(this, motionEvent);
            } else if (this.f1170j != null) {
                this.f1170j.m1135a(false);
            }
            return z2;
        }

        protected boolean mo317c() {
            return this.f1168h || super.mo317c();
        }

        public boolean hasFocus() {
            return this.f1167g || super.hasFocus();
        }

        public boolean hasWindowFocus() {
            return this.f1167g || super.hasWindowFocus();
        }

        public boolean isFocused() {
            return this.f1167g || super.isFocused();
        }

        public boolean isInTouchMode() {
            return (this.f1167g && this.f1166f) || super.isInTouchMode();
        }
    }

    private class C0414c implements Runnable {
        final /* synthetic */ C0339e f1173a;

        private C0414c(C0339e c0339e) {
            this.f1173a = c0339e;
        }

        public void run() {
            this.f1173a.m1615e();
        }
    }

    private class C0415d extends DataSetObserver {
        final /* synthetic */ C0339e f1174a;

        private C0415d(C0339e c0339e) {
            this.f1174a = c0339e;
        }

        public void onChanged() {
            if (this.f1174a.m1610b()) {
                this.f1174a.m1611c();
            }
        }

        public void onInvalidated() {
            this.f1174a.m1601a();
        }
    }

    private class C0416e implements OnScrollListener {
        final /* synthetic */ C0339e f1175a;

        private C0416e(C0339e c0339e) {
            this.f1175a = c0339e;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !this.f1175a.m1617f() && this.f1175a.f850d.getContentView() != null) {
                this.f1175a.f844A.removeCallbacks(this.f1175a.f868v);
                this.f1175a.f868v.run();
            }
        }
    }

    private class C0417f implements OnTouchListener {
        final /* synthetic */ C0339e f1176a;

        private C0417f(C0339e c0339e) {
            this.f1176a = c0339e;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && this.f1176a.f850d != null && this.f1176a.f850d.isShowing() && x >= 0 && x < this.f1176a.f850d.getWidth() && y >= 0 && y < this.f1176a.f850d.getHeight()) {
                this.f1176a.f844A.postDelayed(this.f1176a.f868v, 250);
            } else if (action == 1) {
                this.f1176a.f844A.removeCallbacks(this.f1176a.f868v);
            }
            return false;
        }
    }

    private class C0418g implements Runnable {
        final /* synthetic */ C0339e f1177a;

        private C0418g(C0339e c0339e) {
            this.f1177a = c0339e;
        }

        public void run() {
            if (this.f1177a.f852f != null && this.f1177a.f852f.getCount() > this.f1177a.f852f.getChildCount() && this.f1177a.f852f.getChildCount() <= this.f1177a.f848b) {
                this.f1177a.f850d.setInputMethodMode(2);
                this.f1177a.m1611c();
            }
        }
    }

    static {
        try {
            f843a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
    }

    public C0339e(Context context) {
        this(context, null, C0266a.listPopupWindowStyle);
    }

    public C0339e(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0339e(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f853g = -2;
        this.f854h = -2;
        this.f858l = 0;
        this.f859m = false;
        this.f860n = false;
        this.f848b = Integer.MAX_VALUE;
        this.f862p = 0;
        this.f868v = new C0418g();
        this.f869w = new C0417f();
        this.f870x = new C0416e();
        this.f871y = new C0414c();
        this.f844A = new Handler();
        this.f845B = new Rect();
        this.f849c = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0274i.ListPopupWindow, i, i2);
        this.f855i = obtainStyledAttributes.getDimensionPixelOffset(C0274i.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f856j = obtainStyledAttributes.getDimensionPixelOffset(C0274i.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f856j != 0) {
            this.f857k = true;
        }
        obtainStyledAttributes.recycle();
        this.f850d = new C0359f(context, attributeSet, i);
        this.f850d.setInputMethodMode(1);
        this.f847D = C0083c.m428a(this.f849c.getResources().getConfiguration().locale);
    }

    private void m1596b(boolean z) {
        if (f843a != null) {
            try {
                f843a.invoke(this.f850d, new Object[]{Boolean.valueOf(z)});
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private void m1599h() {
        if (this.f861o != null) {
            ViewParent parent = this.f861o.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f861o);
            }
        }
    }

    private int m1600i() {
        int measuredHeight;
        int i;
        int i2;
        int maxAvailableHeight;
        LayoutParams layoutParams;
        View view;
        if (this.f852f == null) {
            Context context = this.f849c;
            this.f872z = new C04092(this);
            this.f852f = new C0411a(context, !this.f846C);
            if (this.f865s != null) {
                this.f852f.setSelector(this.f865s);
            }
            this.f852f.setAdapter(this.f851e);
            this.f852f.setOnItemClickListener(this.f866t);
            this.f852f.setFocusable(true);
            this.f852f.setFocusableInTouchMode(true);
            this.f852f.setOnItemSelectedListener(new C04103(this));
            this.f852f.setOnScrollListener(this.f870x);
            if (this.f867u != null) {
                this.f852f.setOnItemSelectedListener(this.f867u);
            }
            View view2 = this.f852f;
            View view3 = this.f861o;
            if (view3 != null) {
                View linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams2 = new LayoutParams(-1, 0, 1.0f);
                switch (this.f862p) {
                    case 0:
                        linearLayout.addView(view3);
                        linearLayout.addView(view2, layoutParams2);
                        break;
                    case 1:
                        linearLayout.addView(view2, layoutParams2);
                        linearLayout.addView(view3);
                        break;
                    default:
                        Log.e("ListPopupWindow", "Invalid hint position " + this.f862p);
                        break;
                }
                view3.measure(MeasureSpec.makeMeasureSpec(this.f854h, Integer.MIN_VALUE), 0);
                layoutParams = (LayoutParams) view3.getLayoutParams();
                measuredHeight = layoutParams.bottomMargin + (view3.getMeasuredHeight() + layoutParams.topMargin);
                view = linearLayout;
            } else {
                view = view2;
                measuredHeight = 0;
            }
            this.f850d.setContentView(view);
            i = measuredHeight;
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f850d.getContentView();
            view = this.f861o;
            if (view != null) {
                layoutParams = (LayoutParams) view.getLayoutParams();
                i = layoutParams.bottomMargin + (view.getMeasuredHeight() + layoutParams.topMargin);
            } else {
                i = 0;
            }
        }
        Drawable background = this.f850d.getBackground();
        if (background != null) {
            background.getPadding(this.f845B);
            measuredHeight = this.f845B.top + this.f845B.bottom;
            if (this.f857k) {
                i2 = measuredHeight;
            } else {
                this.f856j = -this.f845B.top;
                i2 = measuredHeight;
            }
        } else {
            this.f845B.setEmpty();
            i2 = 0;
        }
        if (this.f850d.getInputMethodMode() == 2) {
            maxAvailableHeight = this.f850d.getMaxAvailableHeight(m1613d(), this.f856j);
        } else {
            maxAvailableHeight = this.f850d.getMaxAvailableHeight(m1613d(), this.f856j);
        }
        if (this.f859m || this.f853g == -1) {
            return maxAvailableHeight + i2;
        }
        int makeMeasureSpec;
        switch (this.f854h) {
            case -2:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f849c.getResources().getDisplayMetrics().widthPixels - (this.f845B.left + this.f845B.right), Integer.MIN_VALUE);
                break;
            case -1:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f849c.getResources().getDisplayMetrics().widthPixels - (this.f845B.left + this.f845B.right), 1073741824);
                break;
            default:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f854h, 1073741824);
                break;
        }
        measuredHeight = this.f852f.m1669a(makeMeasureSpec, 0, -1, maxAvailableHeight - i, -1);
        if (measuredHeight > 0) {
            i += i2;
        }
        return measuredHeight + i;
    }

    public void m1601a() {
        this.f850d.dismiss();
        m1599h();
        this.f850d.setContentView(null);
        this.f852f = null;
        this.f844A.removeCallbacks(this.f868v);
    }

    public void m1602a(int i) {
        this.f862p = i;
    }

    public void m1603a(Drawable drawable) {
        this.f850d.setBackgroundDrawable(drawable);
    }

    public void m1604a(View view) {
        this.f864r = view;
    }

    public void m1605a(OnItemClickListener onItemClickListener) {
        this.f866t = onItemClickListener;
    }

    public void mo266a(ListAdapter listAdapter) {
        if (this.f863q == null) {
            this.f863q = new C0415d();
        } else if (this.f851e != null) {
            this.f851e.unregisterDataSetObserver(this.f863q);
        }
        this.f851e = listAdapter;
        if (this.f851e != null) {
            listAdapter.registerDataSetObserver(this.f863q);
        }
        if (this.f852f != null) {
            this.f852f.setAdapter(this.f851e);
        }
    }

    public void m1607a(OnDismissListener onDismissListener) {
        this.f850d.setOnDismissListener(onDismissListener);
    }

    public void m1608a(boolean z) {
        this.f846C = z;
        this.f850d.setFocusable(z);
    }

    public void m1609b(int i) {
        this.f858l = i;
    }

    public boolean m1610b() {
        return this.f850d.isShowing();
    }

    public void m1611c() {
        boolean z = true;
        boolean z2 = false;
        int i = -1;
        int i2 = m1600i();
        boolean f = m1617f();
        if (this.f850d.isShowing()) {
            int width = this.f854h == -1 ? -1 : this.f854h == -2 ? m1613d().getWidth() : this.f854h;
            if (this.f853g == -1) {
                if (!f) {
                    i2 = -1;
                }
                if (f) {
                    PopupWindow popupWindow = this.f850d;
                    if (this.f854h != -1) {
                        i = 0;
                    }
                    popupWindow.setWindowLayoutMode(i, 0);
                } else {
                    this.f850d.setWindowLayoutMode(this.f854h == -1 ? -1 : 0, -1);
                }
            } else if (this.f853g != -2) {
                i2 = this.f853g;
            }
            PopupWindow popupWindow2 = this.f850d;
            if (!(this.f860n || this.f859m)) {
                z2 = true;
            }
            popupWindow2.setOutsideTouchable(z2);
            this.f850d.update(m1613d(), this.f855i, this.f856j, width, i2);
            return;
        }
        int i3;
        if (this.f854h == -1) {
            i3 = -1;
        } else if (this.f854h == -2) {
            this.f850d.setWidth(m1613d().getWidth());
            i3 = 0;
        } else {
            this.f850d.setWidth(this.f854h);
            i3 = 0;
        }
        if (this.f853g == -1) {
            width = -1;
        } else if (this.f853g == -2) {
            this.f850d.setHeight(i2);
            width = 0;
        } else {
            this.f850d.setHeight(this.f853g);
            width = 0;
        }
        this.f850d.setWindowLayoutMode(i3, width);
        m1596b(true);
        popupWindow = this.f850d;
        if (this.f860n || this.f859m) {
            z = false;
        }
        popupWindow.setOutsideTouchable(z);
        this.f850d.setTouchInterceptor(this.f869w);
        C0254g.m1200a(this.f850d, m1613d(), this.f855i, this.f856j, this.f858l);
        this.f852f.setSelection(-1);
        if (!this.f846C || this.f852f.isInTouchMode()) {
            m1615e();
        }
        if (!this.f846C) {
            this.f844A.post(this.f871y);
        }
    }

    public void m1612c(int i) {
        this.f854h = i;
    }

    public View m1613d() {
        return this.f864r;
    }

    public void m1614d(int i) {
        Drawable background = this.f850d.getBackground();
        if (background != null) {
            background.getPadding(this.f845B);
            this.f854h = (this.f845B.left + this.f845B.right) + i;
            return;
        }
        m1612c(i);
    }

    public void m1615e() {
        C0411a c0411a = this.f852f;
        if (c0411a != null) {
            c0411a.f1166f = true;
            c0411a.requestLayout();
        }
    }

    public void m1616e(int i) {
        this.f850d.setInputMethodMode(i);
    }

    public boolean m1617f() {
        return this.f850d.getInputMethodMode() == 2;
    }

    public ListView m1618g() {
        return this.f852f;
    }
}
