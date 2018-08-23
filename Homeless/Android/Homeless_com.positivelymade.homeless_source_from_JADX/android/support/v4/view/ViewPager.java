package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p005d.C0074c;
import android.support.v4.p005d.C0075d;
import android.support.v4.view.p008a.C0128a;
import android.support.v4.view.p008a.C0149g;
import android.support.v4.widget.C0248d;
import android.support.v7.p010b.C0275a.C0274i;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    private static final int[] f322a = new int[]{16842931};
    private static final C0111i ah = new C0111i();
    private static final Comparator<C0103b> f323c = new C00981();
    private static final Interpolator f324d = new C00992();
    private boolean f325A;
    private boolean f326B;
    private int f327C;
    private int f328D;
    private int f329E;
    private float f330F;
    private float f331G;
    private float f332H;
    private float f333I;
    private int f334J = -1;
    private VelocityTracker f335K;
    private int f336L;
    private int f337M;
    private int f338N;
    private int f339O;
    private boolean f340P;
    private C0248d f341Q;
    private C0248d f342R;
    private boolean f343S = true;
    private boolean f344T = false;
    private boolean f345U;
    private int f346V;
    private List<C0108f> f347W;
    private C0108f aa;
    private C0108f ab;
    private C0107e ac;
    private C0109g ad;
    private Method ae;
    private int af;
    private ArrayList<View> ag;
    private final Runnable ai = new C01003(this);
    private int aj = 0;
    private int f348b;
    private final ArrayList<C0103b> f349e = new ArrayList();
    private final C0103b f350f = new C0103b();
    private final Rect f351g = new Rect();
    private C0035v f352h;
    private int f353i;
    private int f354j = -1;
    private Parcelable f355k = null;
    private ClassLoader f356l = null;
    private Scroller f357m;
    private C0110h f358n;
    private int f359o;
    private Drawable f360p;
    private int f361q;
    private int f362r;
    private float f363s = -3.4028235E38f;
    private float f364t = Float.MAX_VALUE;
    private int f365u;
    private int f366v;
    private boolean f367w;
    private boolean f368x;
    private boolean f369y;
    private int f370z = 1;

    static class C00981 implements Comparator<C0103b> {
        C00981() {
        }

        public int m498a(C0103b c0103b, C0103b c0103b2) {
            return c0103b.f307b - c0103b2.f307b;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m498a((C0103b) obj, (C0103b) obj2);
        }
    }

    static class C00992 implements Interpolator {
        C00992() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * (((f2 * f2) * f2) * f2)) + 1.0f;
        }
    }

    class C01003 implements Runnable {
        final /* synthetic */ ViewPager f302a;

        C01003(ViewPager viewPager) {
            this.f302a = viewPager;
        }

        public void run() {
            this.f302a.setScrollState(0);
            this.f302a.m561c();
        }
    }

    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = C0074c.m414a(new C01011());
        int f303a;
        Parcelable f304b;
        ClassLoader f305c;

        static class C01011 implements C0075d<SavedState> {
            C01011() {
            }

            public /* synthetic */ Object mo64a(Parcel parcel, ClassLoader classLoader) {
                return m501b(parcel, classLoader);
            }

            public /* synthetic */ Object[] mo65a(int i) {
                return m502b(i);
            }

            public SavedState m501b(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState[] m502b(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            if (classLoader == null) {
                classLoader = getClass().getClassLoader();
            }
            this.f303a = parcel.readInt();
            this.f304b = parcel.readParcelable(classLoader);
            this.f305c = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f303a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f303a);
            parcel.writeParcelable(this.f304b, i);
        }
    }

    interface C0102a {
    }

    static class C0103b {
        Object f306a;
        int f307b;
        boolean f308c;
        float f309d;
        float f310e;

        C0103b() {
        }
    }

    public static class C0104c extends LayoutParams {
        public boolean f311a;
        public int f312b;
        float f313c = 0.0f;
        boolean f314d;
        int f315e;
        int f316f;

        public C0104c() {
            super(-1, -1);
        }

        public C0104c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f322a);
            this.f312b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    class C0106d extends C0105a {
        final /* synthetic */ ViewPager f320b;

        C0106d(ViewPager viewPager) {
            this.f320b = viewPager;
        }

        private boolean m513b() {
            return this.f320b.f352h != null && this.f320b.f352h.mo1671b() > 1;
        }

        public void mo66a(View view, C0128a c0128a) {
            super.mo66a(view, c0128a);
            c0128a.m698a(ViewPager.class.getName());
            c0128a.m699a(m513b());
            if (this.f320b.canScrollHorizontally(1)) {
                c0128a.m696a(4096);
            }
            if (this.f320b.canScrollHorizontally(-1)) {
                c0128a.m696a(8192);
            }
        }

        public boolean mo67a(View view, int i, Bundle bundle) {
            if (super.mo67a(view, i, bundle)) {
                return true;
            }
            switch (i) {
                case 4096:
                    if (!this.f320b.canScrollHorizontally(1)) {
                        return false;
                    }
                    this.f320b.setCurrentItem(this.f320b.f353i + 1);
                    return true;
                case 8192:
                    if (!this.f320b.canScrollHorizontally(-1)) {
                        return false;
                    }
                    this.f320b.setCurrentItem(this.f320b.f353i - 1);
                    return true;
                default:
                    return false;
            }
        }

        public void mo68d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo68d(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            C0149g a = C0149g.m778a();
            a.m780a(m513b());
            if (accessibilityEvent.getEventType() == 4096 && this.f320b.f352h != null) {
                a.m779a(this.f320b.f352h.mo1671b());
                a.m781b(this.f320b.f353i);
                a.m782c(this.f320b.f353i);
            }
        }
    }

    interface C0107e {
        void m517a(C0035v c0035v, C0035v c0035v2);
    }

    public interface C0108f {
        void mo1672a(int i);

        void mo1673a(int i, float f, int i2);

        void mo1674b(int i);
    }

    public interface C0109g {
        void m521a(View view, float f);
    }

    private class C0110h extends DataSetObserver {
        final /* synthetic */ ViewPager f321a;

        private C0110h(ViewPager viewPager) {
            this.f321a = viewPager;
        }

        public void onChanged() {
            this.f321a.m560b();
        }

        public void onInvalidated() {
            this.f321a.m560b();
        }
    }

    static class C0111i implements Comparator<View> {
        C0111i() {
        }

        public int m522a(View view, View view2) {
            C0104c c0104c = (C0104c) view.getLayoutParams();
            C0104c c0104c2 = (C0104c) view2.getLayoutParams();
            return c0104c.f311a != c0104c2.f311a ? c0104c.f311a ? 1 : -1 : c0104c.f315e - c0104c2.f315e;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m522a((View) obj, (View) obj2);
        }
    }

    public ViewPager(Context context) {
        super(context);
        m549a();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m549a();
    }

    private int m523a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f338N || Math.abs(i2) <= this.f336L) {
            i = (int) ((i >= this.f353i ? 0.4f : 0.6f) + (((float) i) + f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f349e.size() <= 0) {
            return i;
        }
        return Math.max(((C0103b) this.f349e.get(0)).f307b, Math.min(i, ((C0103b) this.f349e.get(this.f349e.size() - 1)).f307b));
    }

    private Rect m524a(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewPager parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    private void m526a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f349e.isEmpty()) {
            C0103b b = m558b(this.f353i);
            int min = (int) ((b != null ? Math.min(b.f310e, this.f364t) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m531a(false);
                scrollTo(min, getScrollY());
                return;
            }
            return;
        }
        int paddingLeft = (int) (((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)) * (((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))));
        scrollTo(paddingLeft, getScrollY());
        if (!this.f357m.isFinished()) {
            this.f357m.startScroll(paddingLeft, 0, (int) (m558b(this.f353i).f310e * ((float) i)), 0, this.f357m.getDuration() - this.f357m.timePassed());
        }
    }

    private void m527a(int i, boolean z, int i2, boolean z2) {
        int max;
        C0103b b = m558b(i);
        if (b != null) {
            max = (int) (Math.max(this.f363s, Math.min(b.f310e, this.f364t)) * ((float) getClientWidth()));
        } else {
            max = 0;
        }
        if (z) {
            m552a(max, 0, i2);
            if (z2) {
                m539e(i);
                return;
            }
            return;
        }
        if (z2) {
            m539e(i);
        }
        m531a(false);
        scrollTo(max, 0);
        m538d(max);
    }

    private void m528a(C0103b c0103b, int i, C0103b c0103b2) {
        float f;
        int i2;
        C0103b c0103b3;
        int i3;
        int b = this.f352h.mo1671b();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? ((float) this.f359o) / ((float) clientWidth) : 0.0f;
        if (c0103b2 != null) {
            clientWidth = c0103b2.f307b;
            int i4;
            if (clientWidth < c0103b.f307b) {
                f = (c0103b2.f310e + c0103b2.f309d) + f2;
                i4 = clientWidth + 1;
                i2 = 0;
                while (i4 <= c0103b.f307b && i2 < this.f349e.size()) {
                    c0103b3 = (C0103b) this.f349e.get(i2);
                    while (i4 > c0103b3.f307b && i2 < this.f349e.size() - 1) {
                        i2++;
                        c0103b3 = (C0103b) this.f349e.get(i2);
                    }
                    while (i4 < c0103b3.f307b) {
                        f += this.f352h.m278c(i4) + f2;
                        i4++;
                    }
                    c0103b3.f310e = f;
                    f += c0103b3.f309d + f2;
                    i4++;
                }
            } else if (clientWidth > c0103b.f307b) {
                i2 = this.f349e.size() - 1;
                f = c0103b2.f310e;
                i4 = clientWidth - 1;
                while (i4 >= c0103b.f307b && i2 >= 0) {
                    c0103b3 = (C0103b) this.f349e.get(i2);
                    while (i4 < c0103b3.f307b && i2 > 0) {
                        i2--;
                        c0103b3 = (C0103b) this.f349e.get(i2);
                    }
                    while (i4 > c0103b3.f307b) {
                        f -= this.f352h.m278c(i4) + f2;
                        i4--;
                    }
                    f -= c0103b3.f309d + f2;
                    c0103b3.f310e = f;
                    i4--;
                }
            }
        }
        int size = this.f349e.size();
        float f3 = c0103b.f310e;
        i2 = c0103b.f307b - 1;
        this.f363s = c0103b.f307b == 0 ? c0103b.f310e : -3.4028235E38f;
        this.f364t = c0103b.f307b == b + -1 ? (c0103b.f310e + c0103b.f309d) - 1.0f : Float.MAX_VALUE;
        for (i3 = i - 1; i3 >= 0; i3--) {
            c0103b3 = (C0103b) this.f349e.get(i3);
            f = f3;
            while (i2 > c0103b3.f307b) {
                f -= this.f352h.m278c(i2) + f2;
                i2--;
            }
            f3 = f - (c0103b3.f309d + f2);
            c0103b3.f310e = f3;
            if (c0103b3.f307b == 0) {
                this.f363s = f3;
            }
            i2--;
        }
        f3 = (c0103b.f310e + c0103b.f309d) + f2;
        i2 = c0103b.f307b + 1;
        for (i3 = i + 1; i3 < size; i3++) {
            c0103b3 = (C0103b) this.f349e.get(i3);
            f = f3;
            while (i2 < c0103b3.f307b) {
                f = (this.f352h.m278c(i2) + f2) + f;
                i2++;
            }
            if (c0103b3.f307b == b - 1) {
                this.f364t = (c0103b3.f309d + f) - 1.0f;
            }
            c0103b3.f310e = f;
            f3 = f + (c0103b3.f309d + f2);
            i2++;
        }
        this.f344T = false;
    }

    private void m530a(MotionEvent motionEvent) {
        int b = C0214s.m983b(motionEvent);
        if (C0214s.m984b(motionEvent, b) == this.f334J) {
            b = b == 0 ? 1 : 0;
            this.f330F = C0214s.m985c(motionEvent, b);
            this.f334J = C0214s.m984b(motionEvent, b);
            if (this.f335K != null) {
                this.f335K.clear();
            }
        }
    }

    private void m531a(boolean z) {
        int scrollX;
        boolean z2 = this.aj == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            this.f357m.abortAnimation();
            scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f357m.getCurrX();
            int currY = this.f357m.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
                if (currX != scrollX) {
                    m538d(currX);
                }
            }
        }
        this.f369y = false;
        boolean z3 = z2;
        for (scrollX = 0; scrollX < this.f349e.size(); scrollX++) {
            C0103b c0103b = (C0103b) this.f349e.get(scrollX);
            if (c0103b.f308c) {
                c0103b.f308c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            C0233z.m1080a((View) this, this.ai);
        } else {
            this.ai.run();
        }
    }

    private boolean m532a(float f, float f2) {
        return (f < ((float) this.f328D) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f328D)) && f2 < 0.0f);
    }

    private void m534b(int i, float f, int i2) {
        if (this.aa != null) {
            this.aa.mo1673a(i, f, i2);
        }
        if (this.f347W != null) {
            int size = this.f347W.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0108f c0108f = (C0108f) this.f347W.get(i3);
                if (c0108f != null) {
                    c0108f.mo1673a(i, f, i2);
                }
            }
        }
        if (this.ab != null) {
            this.ab.mo1673a(i, f, i2);
        }
    }

    private void m535b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0233z.m1078a(getChildAt(i), z ? 2 : 0, null);
        }
    }

    private boolean m536b(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        boolean z3 = false;
        float f3 = this.f330F - f;
        this.f330F = f;
        float scrollX = ((float) getScrollX()) + f3;
        int clientWidth = getClientWidth();
        float f4 = ((float) clientWidth) * this.f363s;
        float f5 = ((float) clientWidth) * this.f364t;
        C0103b c0103b = (C0103b) this.f349e.get(0);
        C0103b c0103b2 = (C0103b) this.f349e.get(this.f349e.size() - 1);
        if (c0103b.f307b != 0) {
            f4 = c0103b.f310e * ((float) clientWidth);
            z = false;
        } else {
            z = true;
        }
        if (c0103b2.f307b != this.f352h.mo1671b() - 1) {
            f2 = c0103b2.f310e * ((float) clientWidth);
            z2 = false;
        } else {
            f2 = f5;
        }
        if (scrollX < f4) {
            if (z) {
                z3 = this.f341Q.m1183a(Math.abs(f4 - scrollX) / ((float) clientWidth));
            }
        } else if (scrollX > f2) {
            if (z2) {
                z3 = this.f342R.m1183a(Math.abs(scrollX - f2) / ((float) clientWidth));
            }
            f4 = f2;
        } else {
            f4 = scrollX;
        }
        this.f330F += f4 - ((float) ((int) f4));
        scrollTo((int) f4, getScrollY());
        m538d((int) f4);
        return z3;
    }

    private void m537c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean m538d(int i) {
        if (this.f349e.size() == 0) {
            this.f345U = false;
            m551a(0, 0.0f, 0);
            if (this.f345U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0103b i2 = m544i();
        int clientWidth = getClientWidth();
        int i3 = this.f359o + clientWidth;
        float f = ((float) this.f359o) / ((float) clientWidth);
        int i4 = i2.f307b;
        float f2 = ((((float) i) / ((float) clientWidth)) - i2.f310e) / (i2.f309d + f);
        clientWidth = (int) (((float) i3) * f2);
        this.f345U = false;
        m551a(i4, f2, clientWidth);
        if (this.f345U) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void m539e(int i) {
        if (this.aa != null) {
            this.aa.mo1672a(i);
        }
        if (this.f347W != null) {
            int size = this.f347W.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0108f c0108f = (C0108f) this.f347W.get(i2);
                if (c0108f != null) {
                    c0108f.mo1672a(i);
                }
            }
        }
        if (this.ab != null) {
            this.ab.mo1672a(i);
        }
    }

    private void m540f(int i) {
        if (this.aa != null) {
            this.aa.mo1674b(i);
        }
        if (this.f347W != null) {
            int size = this.f347W.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0108f c0108f = (C0108f) this.f347W.get(i2);
                if (c0108f != null) {
                    c0108f.mo1674b(i);
                }
            }
        }
        if (this.ab != null) {
            this.ab.mo1674b(i);
        }
    }

    private void m542g() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C0104c) getChildAt(i).getLayoutParams()).f311a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void m543h() {
        if (this.af != 0) {
            if (this.ag == null) {
                this.ag = new ArrayList();
            } else {
                this.ag.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ag.add(getChildAt(i));
            }
            Collections.sort(this.ag, ah);
        }
    }

    private C0103b m544i() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.f359o) / ((float) clientWidth) : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = -1;
        int i2 = 0;
        Object obj = 1;
        C0103b c0103b = null;
        while (i2 < this.f349e.size()) {
            int i3;
            C0103b c0103b2;
            C0103b c0103b3 = (C0103b) this.f349e.get(i2);
            C0103b c0103b4;
            if (obj != null || c0103b3.f307b == i + 1) {
                c0103b4 = c0103b3;
                i3 = i2;
                c0103b2 = c0103b4;
            } else {
                c0103b3 = this.f350f;
                c0103b3.f310e = (f2 + f3) + f;
                c0103b3.f307b = i + 1;
                c0103b3.f309d = this.f352h.m278c(c0103b3.f307b);
                c0103b4 = c0103b3;
                i3 = i2 - 1;
                c0103b2 = c0103b4;
            }
            f2 = c0103b2.f310e;
            f3 = (c0103b2.f309d + f2) + f;
            if (obj == null && scrollX < f2) {
                return c0103b;
            }
            if (scrollX < f3 || i3 == this.f349e.size() - 1) {
                return c0103b2;
            }
            f3 = f2;
            i = c0103b2.f307b;
            obj = null;
            f2 = c0103b2.f309d;
            c0103b = c0103b2;
            i2 = i3 + 1;
        }
        return c0103b;
    }

    private void m545j() {
        this.f325A = false;
        this.f326B = false;
        if (this.f335K != null) {
            this.f335K.recycle();
            this.f335K = null;
        }
    }

    private void setScrollState(int i) {
        if (this.aj != i) {
            this.aj = i;
            if (this.ad != null) {
                m535b(i != 0);
            }
            m540f(i);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f368x != z) {
            this.f368x = z;
        }
    }

    float m546a(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    C0103b m547a(int i, int i2) {
        C0103b c0103b = new C0103b();
        c0103b.f307b = i;
        c0103b.f306a = this.f352h.mo28a((ViewGroup) this, i);
        c0103b.f309d = this.f352h.m278c(i);
        if (i2 < 0 || i2 >= this.f349e.size()) {
            this.f349e.add(c0103b);
        } else {
            this.f349e.add(i2, c0103b);
        }
        return c0103b;
    }

    C0103b m548a(View view) {
        for (int i = 0; i < this.f349e.size(); i++) {
            C0103b c0103b = (C0103b) this.f349e.get(i);
            if (this.f352h.mo32a(view, c0103b.f306a)) {
                return c0103b;
            }
        }
        return null;
    }

    void m549a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f357m = new Scroller(context, f324d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f329E = ah.m820a(viewConfiguration);
        this.f336L = (int) (400.0f * f);
        this.f337M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f341Q = new C0248d(context);
        this.f342R = new C0248d(context);
        this.f338N = (int) (25.0f * f);
        this.f339O = (int) (2.0f * f);
        this.f327C = (int) (16.0f * f);
        C0233z.m1079a((View) this, new C0106d(this));
        if (C0233z.m1088c(this) == 0) {
            C0233z.m1086b((View) this, 1);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m550a(int r19) {
        /*
        r18 = this;
        r3 = 0;
        r2 = 2;
        r0 = r18;
        r4 = r0.f353i;
        r0 = r19;
        if (r4 == r0) goto L_0x033f;
    L_0x000a:
        r0 = r18;
        r2 = r0.f353i;
        r0 = r19;
        if (r2 >= r0) goto L_0x0030;
    L_0x0012:
        r2 = 66;
    L_0x0014:
        r0 = r18;
        r3 = r0.f353i;
        r0 = r18;
        r3 = r0.m558b(r3);
        r0 = r19;
        r1 = r18;
        r1.f353i = r0;
        r4 = r3;
        r3 = r2;
    L_0x0026:
        r0 = r18;
        r2 = r0.f352h;
        if (r2 != 0) goto L_0x0033;
    L_0x002c:
        r18.m543h();
    L_0x002f:
        return;
    L_0x0030:
        r2 = 17;
        goto L_0x0014;
    L_0x0033:
        r0 = r18;
        r2 = r0.f369y;
        if (r2 == 0) goto L_0x003d;
    L_0x0039:
        r18.m543h();
        goto L_0x002f;
    L_0x003d:
        r2 = r18.getWindowToken();
        if (r2 == 0) goto L_0x002f;
    L_0x0043:
        r0 = r18;
        r2 = r0.f352h;
        r0 = r18;
        r2.mo30a(r0);
        r0 = r18;
        r2 = r0.f370z;
        r5 = 0;
        r0 = r18;
        r6 = r0.f353i;
        r6 = r6 - r2;
        r11 = java.lang.Math.max(r5, r6);
        r0 = r18;
        r5 = r0.f352h;
        r12 = r5.mo1671b();
        r5 = r12 + -1;
        r0 = r18;
        r6 = r0.f353i;
        r2 = r2 + r6;
        r13 = java.lang.Math.min(r5, r2);
        r0 = r18;
        r2 = r0.f348b;
        if (r12 == r2) goto L_0x00da;
    L_0x0073:
        r2 = r18.getResources();	 Catch:{ NotFoundException -> 0x00d0 }
        r3 = r18.getId();	 Catch:{ NotFoundException -> 0x00d0 }
        r2 = r2.getResourceName(r3);	 Catch:{ NotFoundException -> 0x00d0 }
    L_0x007f:
        r3 = new java.lang.IllegalStateException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ";
        r4 = r4.append(r5);
        r0 = r18;
        r5 = r0.f348b;
        r4 = r4.append(r5);
        r5 = ", found: ";
        r4 = r4.append(r5);
        r4 = r4.append(r12);
        r5 = " Pager id: ";
        r4 = r4.append(r5);
        r2 = r4.append(r2);
        r4 = " Pager class: ";
        r2 = r2.append(r4);
        r4 = r18.getClass();
        r2 = r2.append(r4);
        r4 = " Problematic adapter: ";
        r2 = r2.append(r4);
        r0 = r18;
        r4 = r0.f352h;
        r4 = r4.getClass();
        r2 = r2.append(r4);
        r2 = r2.toString();
        r3.<init>(r2);
        throw r3;
    L_0x00d0:
        r2 = move-exception;
        r2 = r18.getId();
        r2 = java.lang.Integer.toHexString(r2);
        goto L_0x007f;
    L_0x00da:
        r6 = 0;
        r2 = 0;
        r5 = r2;
    L_0x00dd:
        r0 = r18;
        r2 = r0.f349e;
        r2 = r2.size();
        if (r5 >= r2) goto L_0x033c;
    L_0x00e7:
        r0 = r18;
        r2 = r0.f349e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.ViewPager.C0103b) r2;
        r7 = r2.f307b;
        r0 = r18;
        r8 = r0.f353i;
        if (r7 < r8) goto L_0x01cf;
    L_0x00f9:
        r7 = r2.f307b;
        r0 = r18;
        r8 = r0.f353i;
        if (r7 != r8) goto L_0x033c;
    L_0x0101:
        if (r2 != 0) goto L_0x0339;
    L_0x0103:
        if (r12 <= 0) goto L_0x0339;
    L_0x0105:
        r0 = r18;
        r2 = r0.f353i;
        r0 = r18;
        r2 = r0.m547a(r2, r5);
        r10 = r2;
    L_0x0110:
        if (r10 == 0) goto L_0x0180;
    L_0x0112:
        r9 = 0;
        r8 = r5 + -1;
        if (r8 < 0) goto L_0x01d4;
    L_0x0117:
        r0 = r18;
        r2 = r0.f349e;
        r2 = r2.get(r8);
        r2 = (android.support.v4.view.ViewPager.C0103b) r2;
    L_0x0121:
        r14 = r18.getClientWidth();
        if (r14 > 0) goto L_0x01d7;
    L_0x0127:
        r6 = 0;
    L_0x0128:
        r0 = r18;
        r7 = r0.f353i;
        r7 = r7 + -1;
        r16 = r7;
        r7 = r9;
        r9 = r16;
        r17 = r8;
        r8 = r5;
        r5 = r17;
    L_0x0138:
        if (r9 < 0) goto L_0x0142;
    L_0x013a:
        r15 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r15 < 0) goto L_0x0216;
    L_0x013e:
        if (r9 >= r11) goto L_0x0216;
    L_0x0140:
        if (r2 != 0) goto L_0x01e6;
    L_0x0142:
        r6 = r10.f309d;
        r9 = r8 + 1;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x017b;
    L_0x014c:
        r0 = r18;
        r2 = r0.f349e;
        r2 = r2.size();
        if (r9 >= r2) goto L_0x024c;
    L_0x0156:
        r0 = r18;
        r2 = r0.f349e;
        r2 = r2.get(r9);
        r2 = (android.support.v4.view.ViewPager.C0103b) r2;
        r7 = r2;
    L_0x0161:
        if (r14 > 0) goto L_0x024f;
    L_0x0163:
        r2 = 0;
        r5 = r2;
    L_0x0165:
        r0 = r18;
        r2 = r0.f353i;
        r2 = r2 + 1;
        r16 = r2;
        r2 = r7;
        r7 = r9;
        r9 = r16;
    L_0x0171:
        if (r9 >= r12) goto L_0x017b;
    L_0x0173:
        r11 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1));
        if (r11 < 0) goto L_0x029a;
    L_0x0177:
        if (r9 <= r13) goto L_0x029a;
    L_0x0179:
        if (r2 != 0) goto L_0x025c;
    L_0x017b:
        r0 = r18;
        r0.m528a(r10, r8, r4);
    L_0x0180:
        r0 = r18;
        r4 = r0.f352h;
        r0 = r18;
        r5 = r0.f353i;
        if (r10 == 0) goto L_0x02e8;
    L_0x018a:
        r2 = r10.f306a;
    L_0x018c:
        r0 = r18;
        r4.mo34b(r0, r5, r2);
        r0 = r18;
        r2 = r0.f352h;
        r0 = r18;
        r2.mo33b(r0);
        r5 = r18.getChildCount();
        r2 = 0;
        r4 = r2;
    L_0x01a0:
        if (r4 >= r5) goto L_0x02eb;
    L_0x01a2:
        r0 = r18;
        r6 = r0.getChildAt(r4);
        r2 = r6.getLayoutParams();
        r2 = (android.support.v4.view.ViewPager.C0104c) r2;
        r2.f316f = r4;
        r7 = r2.f311a;
        if (r7 != 0) goto L_0x01cb;
    L_0x01b4:
        r7 = r2.f313c;
        r8 = 0;
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 != 0) goto L_0x01cb;
    L_0x01bb:
        r0 = r18;
        r6 = r0.m548a(r6);
        if (r6 == 0) goto L_0x01cb;
    L_0x01c3:
        r7 = r6.f309d;
        r2.f313c = r7;
        r6 = r6.f307b;
        r2.f315e = r6;
    L_0x01cb:
        r2 = r4 + 1;
        r4 = r2;
        goto L_0x01a0;
    L_0x01cf:
        r2 = r5 + 1;
        r5 = r2;
        goto L_0x00dd;
    L_0x01d4:
        r2 = 0;
        goto L_0x0121;
    L_0x01d7:
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = r10.f309d;
        r6 = r6 - r7;
        r7 = r18.getPaddingLeft();
        r7 = (float) r7;
        r15 = (float) r14;
        r7 = r7 / r15;
        r6 = r6 + r7;
        goto L_0x0128;
    L_0x01e6:
        r15 = r2.f307b;
        if (r9 != r15) goto L_0x0210;
    L_0x01ea:
        r15 = r2.f308c;
        if (r15 != 0) goto L_0x0210;
    L_0x01ee:
        r0 = r18;
        r15 = r0.f349e;
        r15.remove(r5);
        r0 = r18;
        r15 = r0.f352h;
        r2 = r2.f306a;
        r0 = r18;
        r15.mo31a(r0, r9, r2);
        r5 = r5 + -1;
        r8 = r8 + -1;
        if (r5 < 0) goto L_0x0214;
    L_0x0206:
        r0 = r18;
        r2 = r0.f349e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.ViewPager.C0103b) r2;
    L_0x0210:
        r9 = r9 + -1;
        goto L_0x0138;
    L_0x0214:
        r2 = 0;
        goto L_0x0210;
    L_0x0216:
        if (r2 == 0) goto L_0x0230;
    L_0x0218:
        r15 = r2.f307b;
        if (r9 != r15) goto L_0x0230;
    L_0x021c:
        r2 = r2.f309d;
        r7 = r7 + r2;
        r5 = r5 + -1;
        if (r5 < 0) goto L_0x022e;
    L_0x0223:
        r0 = r18;
        r2 = r0.f349e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.ViewPager.C0103b) r2;
        goto L_0x0210;
    L_0x022e:
        r2 = 0;
        goto L_0x0210;
    L_0x0230:
        r2 = r5 + 1;
        r0 = r18;
        r2 = r0.m547a(r9, r2);
        r2 = r2.f309d;
        r7 = r7 + r2;
        r8 = r8 + 1;
        if (r5 < 0) goto L_0x024a;
    L_0x023f:
        r0 = r18;
        r2 = r0.f349e;
        r2 = r2.get(r5);
        r2 = (android.support.v4.view.ViewPager.C0103b) r2;
        goto L_0x0210;
    L_0x024a:
        r2 = 0;
        goto L_0x0210;
    L_0x024c:
        r7 = 0;
        goto L_0x0161;
    L_0x024f:
        r2 = r18.getPaddingRight();
        r2 = (float) r2;
        r5 = (float) r14;
        r2 = r2 / r5;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 + r5;
        r5 = r2;
        goto L_0x0165;
    L_0x025c:
        r11 = r2.f307b;
        if (r9 != r11) goto L_0x0332;
    L_0x0260:
        r11 = r2.f308c;
        if (r11 != 0) goto L_0x0332;
    L_0x0264:
        r0 = r18;
        r11 = r0.f349e;
        r11.remove(r7);
        r0 = r18;
        r11 = r0.f352h;
        r2 = r2.f306a;
        r0 = r18;
        r11.mo31a(r0, r9, r2);
        r0 = r18;
        r2 = r0.f349e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x0298;
    L_0x0280:
        r0 = r18;
        r2 = r0.f349e;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.ViewPager.C0103b) r2;
    L_0x028a:
        r16 = r6;
        r6 = r2;
        r2 = r16;
    L_0x028f:
        r9 = r9 + 1;
        r16 = r2;
        r2 = r6;
        r6 = r16;
        goto L_0x0171;
    L_0x0298:
        r2 = 0;
        goto L_0x028a;
    L_0x029a:
        if (r2 == 0) goto L_0x02c1;
    L_0x029c:
        r11 = r2.f307b;
        if (r9 != r11) goto L_0x02c1;
    L_0x02a0:
        r2 = r2.f309d;
        r6 = r6 + r2;
        r7 = r7 + 1;
        r0 = r18;
        r2 = r0.f349e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x02bf;
    L_0x02af:
        r0 = r18;
        r2 = r0.f349e;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.ViewPager.C0103b) r2;
    L_0x02b9:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x028f;
    L_0x02bf:
        r2 = 0;
        goto L_0x02b9;
    L_0x02c1:
        r0 = r18;
        r2 = r0.m547a(r9, r7);
        r7 = r7 + 1;
        r2 = r2.f309d;
        r6 = r6 + r2;
        r0 = r18;
        r2 = r0.f349e;
        r2 = r2.size();
        if (r7 >= r2) goto L_0x02e6;
    L_0x02d6:
        r0 = r18;
        r2 = r0.f349e;
        r2 = r2.get(r7);
        r2 = (android.support.v4.view.ViewPager.C0103b) r2;
    L_0x02e0:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x028f;
    L_0x02e6:
        r2 = 0;
        goto L_0x02e0;
    L_0x02e8:
        r2 = 0;
        goto L_0x018c;
    L_0x02eb:
        r18.m543h();
        r2 = r18.hasFocus();
        if (r2 == 0) goto L_0x002f;
    L_0x02f4:
        r2 = r18.findFocus();
        if (r2 == 0) goto L_0x0330;
    L_0x02fa:
        r0 = r18;
        r2 = r0.m559b(r2);
    L_0x0300:
        if (r2 == 0) goto L_0x030a;
    L_0x0302:
        r2 = r2.f307b;
        r0 = r18;
        r4 = r0.f353i;
        if (r2 == r4) goto L_0x002f;
    L_0x030a:
        r2 = 0;
    L_0x030b:
        r4 = r18.getChildCount();
        if (r2 >= r4) goto L_0x002f;
    L_0x0311:
        r0 = r18;
        r4 = r0.getChildAt(r2);
        r0 = r18;
        r5 = r0.m548a(r4);
        if (r5 == 0) goto L_0x032d;
    L_0x031f:
        r5 = r5.f307b;
        r0 = r18;
        r6 = r0.f353i;
        if (r5 != r6) goto L_0x032d;
    L_0x0327:
        r4 = r4.requestFocus(r3);
        if (r4 != 0) goto L_0x002f;
    L_0x032d:
        r2 = r2 + 1;
        goto L_0x030b;
    L_0x0330:
        r2 = 0;
        goto L_0x0300;
    L_0x0332:
        r16 = r6;
        r6 = r2;
        r2 = r16;
        goto L_0x028f;
    L_0x0339:
        r10 = r2;
        goto L_0x0110;
    L_0x033c:
        r2 = r6;
        goto L_0x0101;
    L_0x033f:
        r4 = r3;
        r3 = r2;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.a(int):void");
    }

    protected void m551a(int i, float f, int i2) {
        int paddingLeft;
        int paddingRight;
        int i3;
        if (this.f346V > 0) {
            int scrollX = getScrollX();
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            i3 = 0;
            while (i3 < childCount) {
                int i4;
                View childAt = getChildAt(i3);
                C0104c c0104c = (C0104c) childAt.getLayoutParams();
                if (c0104c.f311a) {
                    int max;
                    switch (c0104c.f312b & 7) {
                        case 1:
                            max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            i4 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                        case 3:
                            max = childAt.getWidth() + paddingLeft;
                            i4 = paddingLeft;
                            paddingLeft = paddingRight;
                            paddingRight = max;
                            max = i4;
                            break;
                        case 5:
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            i4 = paddingRight + childAt.getMeasuredWidth();
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                        default:
                            max = paddingLeft;
                            i4 = paddingRight;
                            paddingRight = paddingLeft;
                            paddingLeft = i4;
                            break;
                    }
                    max = (max + scrollX) - childAt.getLeft();
                    if (max != 0) {
                        childAt.offsetLeftAndRight(max);
                    }
                } else {
                    i4 = paddingRight;
                    paddingRight = paddingLeft;
                    paddingLeft = i4;
                }
                i3++;
                i4 = paddingLeft;
                paddingLeft = paddingRight;
                paddingRight = i4;
            }
        }
        m534b(i, f, i2);
        if (this.ad != null) {
            paddingRight = getScrollX();
            i3 = getChildCount();
            for (paddingLeft = 0; paddingLeft < i3; paddingLeft++) {
                View childAt2 = getChildAt(paddingLeft);
                if (!((C0104c) childAt2.getLayoutParams()).f311a) {
                    this.ad.m521a(childAt2, ((float) (childAt2.getLeft() - paddingRight)) / ((float) getClientWidth()));
                }
            }
        }
        this.f345U = true;
    }

    void m552a(int i, int i2, int i3) {
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            m531a(false);
            m561c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float a = (((float) i6) * m546a(Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / ((float) clientWidth)))) + ((float) i6);
        int abs = Math.abs(i3);
        if (abs > 0) {
            clientWidth = Math.round(1000.0f * Math.abs(a / ((float) abs))) * 4;
        } else {
            clientWidth = (int) (((((float) Math.abs(i4)) / ((((float) clientWidth) * this.f352h.m278c(this.f353i)) + ((float) this.f359o))) + 1.0f) * 100.0f);
        }
        this.f357m.startScroll(scrollX, scrollY, i4, i5, Math.min(clientWidth, 600));
        C0233z.m1084b(this);
    }

    public void m553a(int i, boolean z) {
        this.f369y = false;
        m554a(i, z, false);
    }

    void m554a(int i, boolean z, boolean z2) {
        m555a(i, z, z2, 0);
    }

    void m555a(int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        if (this.f352h == null || this.f352h.mo1671b() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f353i != i || this.f349e.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f352h.mo1671b()) {
                i = this.f352h.mo1671b() - 1;
            }
            int i3 = this.f370z;
            if (i > this.f353i + i3 || i < this.f353i - i3) {
                for (int i4 = 0; i4 < this.f349e.size(); i4++) {
                    ((C0103b) this.f349e.get(i4)).f308c = true;
                }
            }
            if (this.f353i != i) {
                z3 = true;
            }
            if (this.f343S) {
                this.f353i = i;
                if (z3) {
                    m539e(i);
                }
                requestLayout();
                return;
            }
            m550a(i);
            m527a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public boolean m556a(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                return m562c(17);
            case 22:
                return m562c(66);
            case C0274i.Theme_popupWindowStyle /*61*/:
                return VERSION.SDK_INT >= 11 ? C0184g.m921a(keyEvent) ? m562c(2) : C0184g.m922a(keyEvent, 1) ? m562c(1) : false : false;
            default:
                return false;
        }
    }

    protected boolean m557a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom()) {
                    if (m557a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && C0233z.m1083a(view, -i);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C0103b a = m548a(childAt);
                    if (a != null && a.f307b == this.f353i) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0103b a = m548a(childAt);
                if (a != null && a.f307b == this.f353i) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        LayoutParams generateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        C0104c c0104c = (C0104c) generateLayoutParams;
        c0104c.f311a |= view instanceof C0102a;
        if (!this.f367w) {
            super.addView(view, i, generateLayoutParams);
        } else if (c0104c == null || !c0104c.f311a) {
            c0104c.f314d = true;
            addViewInLayout(view, i, generateLayoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    C0103b m558b(int i) {
        for (int i2 = 0; i2 < this.f349e.size(); i2++) {
            C0103b c0103b = (C0103b) this.f349e.get(i2);
            if (c0103b.f307b == i) {
                return c0103b;
            }
        }
        return null;
    }

    C0103b m559b(View view) {
        while (true) {
            ViewPager parent = view.getParent();
            if (parent == this) {
                return m548a(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = parent;
            }
        }
        return null;
    }

    void m560b() {
        int i;
        int b = this.f352h.mo1671b();
        this.f348b = b;
        boolean z = this.f349e.size() < (this.f370z * 2) + 1 && this.f349e.size() < b;
        boolean z2 = false;
        int i2 = this.f353i;
        boolean z3 = z;
        int i3 = 0;
        while (i3 < this.f349e.size()) {
            int i4;
            boolean z4;
            boolean z5;
            C0103b c0103b = (C0103b) this.f349e.get(i3);
            int a = this.f352h.m261a(c0103b.f306a);
            if (a == -1) {
                i4 = i3;
                z4 = z2;
                i = i2;
                z5 = z3;
            } else if (a == -2) {
                this.f349e.remove(i3);
                i3--;
                if (!z2) {
                    this.f352h.mo30a((ViewGroup) this);
                    z2 = true;
                }
                this.f352h.mo31a((ViewGroup) this, c0103b.f307b, c0103b.f306a);
                if (this.f353i == c0103b.f307b) {
                    i4 = i3;
                    z4 = z2;
                    i = Math.max(0, Math.min(this.f353i, b - 1));
                    z5 = true;
                } else {
                    i4 = i3;
                    z4 = z2;
                    i = i2;
                    z5 = true;
                }
            } else if (c0103b.f307b != a) {
                if (c0103b.f307b == this.f353i) {
                    i2 = a;
                }
                c0103b.f307b = a;
                i4 = i3;
                z4 = z2;
                i = i2;
                z5 = true;
            } else {
                i4 = i3;
                z4 = z2;
                i = i2;
                z5 = z3;
            }
            z3 = z5;
            i2 = i;
            z2 = z4;
            i3 = i4 + 1;
        }
        if (z2) {
            this.f352h.mo33b((ViewGroup) this);
        }
        Collections.sort(this.f349e, f323c);
        if (z3) {
            i = getChildCount();
            for (i3 = 0; i3 < i; i3++) {
                C0104c c0104c = (C0104c) getChildAt(i3).getLayoutParams();
                if (!c0104c.f311a) {
                    c0104c.f313c = 0.0f;
                }
            }
            m554a(i2, false, true);
            requestLayout();
        }
    }

    void m561c() {
        m550a(this.f353i);
    }

    public boolean m562c(int i) {
        View view;
        boolean d;
        View findFocus = findFocus();
        if (findFocus == this) {
            view = null;
        } else {
            if (findFocus != null) {
                Object obj;
                for (ViewPager parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        stringBuilder.append(" => ").append(parent2.getClass().getSimpleName());
                    }
                    Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + stringBuilder.toString());
                    view = null;
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus == null || findNextFocus == view) {
            if (i == 17 || i == 1) {
                d = m563d();
            } else {
                if (i == 66 || i == 2) {
                    d = m564e();
                }
                d = false;
            }
        } else if (i == 17) {
            d = (view == null || m524a(this.f351g, findNextFocus).left < m524a(this.f351g, view).left) ? findNextFocus.requestFocus() : m563d();
        } else {
            if (i == 66) {
                d = (view == null || m524a(this.f351g, findNextFocus).left > m524a(this.f351g, view).left) ? findNextFocus.requestFocus() : m564e();
            }
            d = false;
        }
        if (d) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return d;
    }

    public boolean canScrollHorizontally(int i) {
        boolean z = true;
        if (this.f352h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (((float) clientWidth) * this.f363s))) {
                z = false;
            }
            return z;
        } else if (i <= 0) {
            return false;
        } else {
            if (scrollX >= ((int) (((float) clientWidth) * this.f364t))) {
                z = false;
            }
            return z;
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0104c) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (this.f357m.isFinished() || !this.f357m.computeScrollOffset()) {
            m531a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f357m.getCurrX();
        int currY = this.f357m.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m538d(currX)) {
                this.f357m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C0233z.m1084b(this);
    }

    boolean m563d() {
        if (this.f353i <= 0) {
            return false;
        }
        m553a(this.f353i - 1, true);
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m556a(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C0103b a = m548a(childAt);
                if (a != null && a.f307b == this.f353i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int i = 0;
        int a = C0233z.m1076a(this);
        if (a == 0 || (a == 1 && this.f352h != null && this.f352h.mo1671b() > 1)) {
            int height;
            int width;
            if (!this.f341Q.m1182a()) {
                a = canvas.save();
                height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f363s * ((float) width));
                this.f341Q.m1181a(height, width);
                i = 0 | this.f341Q.m1184a(canvas);
                canvas.restoreToCount(a);
            }
            if (!this.f342R.m1182a()) {
                a = canvas.save();
                height = getWidth();
                width = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f364t + 1.0f)) * ((float) height));
                this.f342R.m1181a(width, height);
                i |= this.f342R.m1184a(canvas);
                canvas.restoreToCount(a);
            }
        } else {
            this.f341Q.m1185b();
            this.f342R.m1185b();
        }
        if (i != 0) {
            C0233z.m1084b(this);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f360p;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    boolean m564e() {
        if (this.f352h == null || this.f353i >= this.f352h.mo1671b() - 1) {
            return false;
        }
        m553a(this.f353i + 1, true);
        return true;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new C0104c();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0104c(getContext(), attributeSet);
    }

    protected LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C0035v getAdapter() {
        return this.f352h;
    }

    protected int getChildDrawingOrder(int i, int i2) {
        if (this.af == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0104c) ((View) this.ag.get(i2)).getLayoutParams()).f316f;
    }

    public int getCurrentItem() {
        return this.f353i;
    }

    public int getOffscreenPageLimit() {
        return this.f370z;
    }

    public int getPageMargin() {
        return this.f359o;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f343S = true;
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.ai);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f359o > 0 && this.f360p != null && this.f349e.size() > 0 && this.f352h != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f = ((float) this.f359o) / ((float) width);
            C0103b c0103b = (C0103b) this.f349e.get(0);
            float f2 = c0103b.f310e;
            int size = this.f349e.size();
            int i = c0103b.f307b;
            int i2 = ((C0103b) this.f349e.get(size - 1)).f307b;
            int i3 = 0;
            int i4 = i;
            while (i4 < i2) {
                float f3;
                while (i4 > c0103b.f307b && i3 < size) {
                    i3++;
                    c0103b = (C0103b) this.f349e.get(i3);
                }
                if (i4 == c0103b.f307b) {
                    f3 = (c0103b.f310e + c0103b.f309d) * ((float) width);
                    f2 = (c0103b.f310e + c0103b.f309d) + f;
                } else {
                    float c = this.f352h.m278c(i4);
                    f3 = (f2 + c) * ((float) width);
                    f2 += c + f;
                }
                if (((float) this.f359o) + f3 > ((float) scrollX)) {
                    this.f360p.setBounds((int) f3, this.f361q, (int) ((((float) this.f359o) + f3) + 0.5f), this.f362r);
                    this.f360p.draw(canvas);
                }
                if (f3 <= ((float) (scrollX + width))) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f325A = false;
            this.f326B = false;
            this.f334J = -1;
            if (this.f335K == null) {
                return false;
            }
            this.f335K.recycle();
            this.f335K = null;
            return false;
        }
        if (action != 0) {
            if (this.f325A) {
                return true;
            }
            if (this.f326B) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.f332H = x;
                this.f330F = x;
                x = motionEvent.getY();
                this.f333I = x;
                this.f331G = x;
                this.f334J = C0214s.m984b(motionEvent, 0);
                this.f326B = false;
                this.f357m.computeScrollOffset();
                if (this.aj == 2 && Math.abs(this.f357m.getFinalX() - this.f357m.getCurrX()) > this.f339O) {
                    this.f357m.abortAnimation();
                    this.f369y = false;
                    m561c();
                    this.f325A = true;
                    m537c(true);
                    setScrollState(1);
                    break;
                }
                m531a(false);
                this.f325A = false;
                break;
                break;
            case 2:
                action = this.f334J;
                if (action != -1) {
                    action = C0214s.m982a(motionEvent, action);
                    float c = C0214s.m985c(motionEvent, action);
                    float f = c - this.f330F;
                    float abs = Math.abs(f);
                    float d = C0214s.m986d(motionEvent, action);
                    float abs2 = Math.abs(d - this.f333I);
                    if (f == 0.0f || m532a(this.f330F, f) || !m557a(this, false, (int) f, (int) c, (int) d)) {
                        if (abs > ((float) this.f329E) && 0.5f * abs > abs2) {
                            this.f325A = true;
                            m537c(true);
                            setScrollState(1);
                            this.f330F = f > 0.0f ? this.f332H + ((float) this.f329E) : this.f332H - ((float) this.f329E);
                            this.f331G = d;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > ((float) this.f329E)) {
                            this.f326B = true;
                        }
                        if (this.f325A && m536b(c)) {
                            C0233z.m1084b(this);
                            break;
                        }
                    }
                    this.f330F = c;
                    this.f331G = d;
                    this.f326B = true;
                    return false;
                }
                break;
            case 6:
                m530a(motionEvent);
                break;
        }
        if (this.f335K == null) {
            this.f335K = VelocityTracker.obtain();
        }
        this.f335K.addMovement(motionEvent);
        return this.f325A;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int max;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        int i8 = 0;
        while (i8 < childCount) {
            C0104c c0104c;
            int measuredWidth;
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                c0104c = (C0104c) childAt.getLayoutParams();
                if (c0104c.f311a) {
                    int i9 = c0104c.f312b & 112;
                    switch (c0104c.f312b & 7) {
                        case 1:
                            max = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 3:
                            max = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case 5:
                            measuredWidth = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            max = measuredWidth;
                            break;
                        default:
                            max = paddingLeft;
                            break;
                    }
                    int i10;
                    switch (i9) {
                        case 16:
                            measuredWidth = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        case C0274i.Theme_homeAsUpIndicator /*48*/:
                            measuredWidth = childAt.getMeasuredHeight() + paddingTop;
                            i10 = paddingTop;
                            paddingTop = paddingBottom;
                            paddingBottom = measuredWidth;
                            measuredWidth = i10;
                            break;
                        case C0274i.Theme_listChoiceBackgroundIndicator /*80*/:
                            measuredWidth = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            i10 = paddingBottom + childAt.getMeasuredHeight();
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                        default:
                            measuredWidth = paddingTop;
                            i10 = paddingBottom;
                            paddingBottom = paddingTop;
                            paddingTop = i10;
                            break;
                    }
                    max += scrollX;
                    childAt.layout(max, measuredWidth, childAt.getMeasuredWidth() + max, childAt.getMeasuredHeight() + measuredWidth);
                    measuredWidth = i7 + 1;
                    i7 = paddingBottom;
                    paddingBottom = paddingTop;
                    paddingTop = paddingRight;
                    paddingRight = paddingLeft;
                    i8++;
                    paddingLeft = paddingRight;
                    paddingRight = paddingTop;
                    paddingTop = i7;
                    i7 = measuredWidth;
                }
            }
            measuredWidth = i7;
            i7 = paddingTop;
            paddingTop = paddingRight;
            paddingRight = paddingLeft;
            i8++;
            paddingLeft = paddingRight;
            paddingRight = paddingTop;
            paddingTop = i7;
            i7 = measuredWidth;
        }
        max = (i5 - paddingLeft) - paddingRight;
        for (paddingRight = 0; paddingRight < childCount; paddingRight++) {
            View childAt2 = getChildAt(paddingRight);
            if (childAt2.getVisibility() != 8) {
                c0104c = (C0104c) childAt2.getLayoutParams();
                if (!c0104c.f311a) {
                    C0103b a = m548a(childAt2);
                    if (a != null) {
                        i5 = ((int) (a.f310e * ((float) max))) + paddingLeft;
                        if (c0104c.f314d) {
                            c0104c.f314d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (c0104c.f313c * ((float) max)), 1073741824), MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                        }
                        childAt2.layout(i5, paddingTop, childAt2.getMeasuredWidth() + i5, childAt2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.f361q = paddingTop;
        this.f362r = i6 - paddingBottom;
        this.f346V = i7;
        if (this.f343S) {
            m527a(this.f353i, false, 0, false);
        }
        this.f343S = false;
    }

    protected void onMeasure(int i, int i2) {
        C0104c c0104c;
        int i3;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.f328D = Math.min(measuredWidth / 10, this.f327C);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            int i5;
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                c0104c = (C0104c) childAt.getLayoutParams();
                if (c0104c != null && c0104c.f311a) {
                    int i6 = c0104c.f312b & 7;
                    int i7 = c0104c.f312b & 112;
                    i3 = Integer.MIN_VALUE;
                    i5 = Integer.MIN_VALUE;
                    Object obj = (i7 == 48 || i7 == 80) ? 1 : null;
                    Object obj2 = (i6 == 3 || i6 == 5) ? 1 : null;
                    if (obj != null) {
                        i3 = 1073741824;
                    } else if (obj2 != null) {
                        i5 = 1073741824;
                    }
                    if (c0104c.width != -2) {
                        i7 = 1073741824;
                        i3 = c0104c.width != -1 ? c0104c.width : paddingLeft;
                    } else {
                        i7 = i3;
                        i3 = paddingLeft;
                    }
                    if (c0104c.height != -2) {
                        i5 = 1073741824;
                        if (c0104c.height != -1) {
                            measuredWidth = c0104c.height;
                            childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                            if (obj != null) {
                                measuredHeight -= childAt.getMeasuredHeight();
                            } else if (obj2 != null) {
                                paddingLeft -= childAt.getMeasuredWidth();
                            }
                        }
                    }
                    measuredWidth = measuredHeight;
                    childAt.measure(MeasureSpec.makeMeasureSpec(i3, i7), MeasureSpec.makeMeasureSpec(measuredWidth, i5));
                    if (obj != null) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (obj2 != null) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
            }
        }
        this.f365u = MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f366v = MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f367w = true;
        m561c();
        this.f367w = false;
        i3 = getChildCount();
        for (i5 = 0; i5 < i3; i5++) {
            View childAt2 = getChildAt(i5);
            if (childAt2.getVisibility() != 8) {
                c0104c = (C0104c) childAt2.getLayoutParams();
                if (c0104c == null || !c0104c.f311a) {
                    childAt2.measure(MeasureSpec.makeMeasureSpec((int) (c0104c.f313c * ((float) paddingLeft)), 1073741824), this.f366v);
                }
            }
        }
    }

    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                C0103b a = m548a(childAt);
                if (a != null && a.f307b == this.f353i && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i2 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (this.f352h != null) {
                this.f352h.mo29a(savedState.f304b, savedState.f305c);
                m554a(savedState.f303a, false, true);
                return;
            }
            this.f354j = savedState.f303a;
            this.f355k = savedState.f304b;
            this.f356l = savedState.f305c;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f303a = this.f353i;
        if (this.f352h != null) {
            savedState.f304b = this.f352h.mo27a();
        }
        return savedState;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m526a(i, i3, this.f359o, this.f359o);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f340P) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.f352h == null || this.f352h.mo1671b() == 0) {
            return false;
        }
        if (this.f335K == null) {
            this.f335K = VelocityTracker.obtain();
        }
        this.f335K.addMovement(motionEvent);
        float x;
        int a;
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.f357m.abortAnimation();
                this.f369y = false;
                m561c();
                x = motionEvent.getX();
                this.f332H = x;
                this.f330F = x;
                x = motionEvent.getY();
                this.f333I = x;
                this.f331G = x;
                this.f334J = C0214s.m984b(motionEvent, 0);
                break;
            case 1:
                if (this.f325A) {
                    VelocityTracker velocityTracker = this.f335K;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f337M);
                    a = (int) C0221x.m999a(velocityTracker, this.f334J);
                    this.f369y = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    C0103b i = m544i();
                    m555a(m523a(i.f307b, ((((float) scrollX) / ((float) clientWidth)) - i.f310e) / i.f309d, a, (int) (C0214s.m985c(motionEvent, C0214s.m982a(motionEvent, this.f334J)) - this.f332H)), true, true, a);
                    this.f334J = -1;
                    m545j();
                    z = this.f342R.m1186c() | this.f341Q.m1186c();
                    break;
                }
                break;
            case 2:
                if (!this.f325A) {
                    a = C0214s.m982a(motionEvent, this.f334J);
                    float c = C0214s.m985c(motionEvent, a);
                    float abs = Math.abs(c - this.f330F);
                    float d = C0214s.m986d(motionEvent, a);
                    x = Math.abs(d - this.f331G);
                    if (abs > ((float) this.f329E) && abs > x) {
                        this.f325A = true;
                        m537c(true);
                        this.f330F = c - this.f332H > 0.0f ? this.f332H + ((float) this.f329E) : this.f332H - ((float) this.f329E);
                        this.f331G = d;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.f325A) {
                    z = false | m536b(C0214s.m985c(motionEvent, C0214s.m982a(motionEvent, this.f334J)));
                    break;
                }
                break;
            case 3:
                if (this.f325A) {
                    m527a(this.f353i, true, 0, false);
                    this.f334J = -1;
                    m545j();
                    z = this.f342R.m1186c() | this.f341Q.m1186c();
                    break;
                }
                break;
            case 5:
                a = C0214s.m983b(motionEvent);
                this.f330F = C0214s.m985c(motionEvent, a);
                this.f334J = C0214s.m984b(motionEvent, a);
                break;
            case 6:
                m530a(motionEvent);
                this.f330F = C0214s.m985c(motionEvent, C0214s.m982a(motionEvent, this.f334J));
                break;
        }
        if (z) {
            C0233z.m1084b(this);
        }
        return true;
    }

    public void removeView(View view) {
        if (this.f367w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(C0035v c0035v) {
        if (this.f352h != null) {
            this.f352h.m273b(this.f358n);
            this.f352h.mo30a((ViewGroup) this);
            for (int i = 0; i < this.f349e.size(); i++) {
                C0103b c0103b = (C0103b) this.f349e.get(i);
                this.f352h.mo31a((ViewGroup) this, c0103b.f307b, c0103b.f306a);
            }
            this.f352h.mo33b((ViewGroup) this);
            this.f349e.clear();
            m542g();
            this.f353i = 0;
            scrollTo(0, 0);
        }
        C0035v c0035v2 = this.f352h;
        this.f352h = c0035v;
        this.f348b = 0;
        if (this.f352h != null) {
            if (this.f358n == null) {
                this.f358n = new C0110h();
            }
            this.f352h.m265a(this.f358n);
            this.f369y = false;
            boolean z = this.f343S;
            this.f343S = true;
            this.f348b = this.f352h.mo1671b();
            if (this.f354j >= 0) {
                this.f352h.mo29a(this.f355k, this.f356l);
                m554a(this.f354j, false, true);
                this.f354j = -1;
                this.f355k = null;
                this.f356l = null;
            } else if (z) {
                requestLayout();
            } else {
                m561c();
            }
        }
        if (this.ac != null && c0035v2 != c0035v) {
            this.ac.m517a(c0035v2, c0035v);
        }
    }

    void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (VERSION.SDK_INT >= 7) {
            if (this.ae == null) {
                try {
                    this.ae = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (Throwable e) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.ae.invoke(this, new Object[]{Boolean.valueOf(z)});
            } catch (Throwable e2) {
                Log.e("ViewPager", "Error changing children drawing order", e2);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f369y = false;
        m554a(i, !this.f343S, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.f370z) {
            this.f370z = i;
            m561c();
        }
    }

    void setOnAdapterChangeListener(C0107e c0107e) {
        this.ac = c0107e;
    }

    @Deprecated
    public void setOnPageChangeListener(C0108f c0108f) {
        this.aa = c0108f;
    }

    public void setPageMargin(int i) {
        int i2 = this.f359o;
        this.f359o = i;
        int width = getWidth();
        m526a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f360p = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f360p;
    }
}
