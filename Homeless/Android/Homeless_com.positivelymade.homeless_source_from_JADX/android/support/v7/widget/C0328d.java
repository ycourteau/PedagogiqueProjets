package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.C0178e;
import android.support.v4.view.C0233z;
import android.support.v7.internal.widget.C0377q;
import android.support.v7.internal.widget.C0380s;
import android.support.v7.p010b.C0275a.C0274i;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class C0328d extends ViewGroup {
    private boolean f783a;
    private int f784b;
    private int f785c;
    private int f786d;
    private int f787e;
    private int f788f;
    private float f789g;
    private boolean f790h;
    private int[] f791i;
    private int[] f792j;
    private Drawable f793k;
    private int f794l;
    private int f795m;
    private int f796n;
    private int f797o;

    public static class C0383a extends MarginLayoutParams {
        public float f1015g;
        public int f1016h;

        public C0383a(int i, int i2) {
            super(i, i2);
            this.f1016h = -1;
            this.f1015g = 0.0f;
        }

        public C0383a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1016h = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0274i.LinearLayoutCompat_Layout);
            this.f1015g = obtainStyledAttributes.getFloat(C0274i.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f1016h = obtainStyledAttributes.getInt(C0274i.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public C0383a(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1016h = -1;
        }
    }

    public C0328d(Context context) {
        this(context, null);
    }

    public C0328d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0328d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f783a = true;
        this.f784b = -1;
        this.f785c = 0;
        this.f787e = 8388659;
        C0377q a = C0377q.m1724a(context, attributeSet, C0274i.LinearLayoutCompat, i, 0);
        int a2 = a.m1727a(C0274i.LinearLayoutCompat_android_orientation, -1);
        if (a2 >= 0) {
            setOrientation(a2);
        }
        a2 = a.m1727a(C0274i.LinearLayoutCompat_android_gravity, -1);
        if (a2 >= 0) {
            setGravity(a2);
        }
        boolean a3 = a.m1729a(C0274i.LinearLayoutCompat_android_baselineAligned, true);
        if (!a3) {
            setBaselineAligned(a3);
        }
        this.f789g = a.m1725a(C0274i.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f784b = a.m1727a(C0274i.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f790h = a.m1729a(C0274i.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.m1728a(C0274i.LinearLayoutCompat_divider));
        this.f796n = a.m1727a(C0274i.LinearLayoutCompat_showDividers, 0);
        this.f797o = a.m1736d(C0274i.LinearLayoutCompat_dividerPadding, 0);
        a.m1732b();
    }

    private void m1535a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    private void m1536c(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = m1548b(i3);
            if (b.getVisibility() != 8) {
                C0383a c0383a = (C0383a) b.getLayoutParams();
                if (c0383a.width == -1) {
                    int i4 = c0383a.height;
                    c0383a.height = b.getMeasuredHeight();
                    measureChildWithMargins(b, makeMeasureSpec, 0, i2, 0);
                    c0383a.height = i4;
                }
            }
        }
    }

    private void m1537d(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = m1548b(i3);
            if (b.getVisibility() != 8) {
                C0383a c0383a = (C0383a) b.getLayoutParams();
                if (c0383a.height == -1) {
                    int i4 = c0383a.width;
                    c0383a.width = b.getMeasuredWidth();
                    measureChildWithMargins(b, i2, 0, makeMeasureSpec, 0);
                    c0383a.width = i4;
                }
            }
        }
    }

    int m1538a(View view) {
        return 0;
    }

    int m1539a(View view, int i) {
        return 0;
    }

    void m1540a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        View b;
        this.f788f = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        Object obj = 1;
        float f = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        Object obj2 = null;
        Object obj3 = null;
        int i10 = this.f784b;
        boolean z = this.f790h;
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        while (i12 < virtualChildCount) {
            Object obj4;
            Object obj5;
            int i13;
            View b2 = m1548b(i12);
            if (b2 == null) {
                this.f788f += m1554d(i12);
                i3 = i11;
                obj4 = obj3;
                obj5 = obj;
                i4 = i7;
                i13 = i6;
            } else if (b2.getVisibility() == 8) {
                i12 += m1539a(b2, i12);
                i3 = i11;
                obj4 = obj3;
                obj5 = obj;
                i4 = i7;
                i13 = i6;
            } else {
                if (m1553c(i12)) {
                    this.f788f += this.f795m;
                }
                C0383a c0383a = (C0383a) b2.getLayoutParams();
                float f2 = f + c0383a.f1015g;
                if (mode2 == 1073741824 && c0383a.height == 0 && c0383a.f1015g > 0.0f) {
                    i3 = this.f788f;
                    this.f788f = Math.max(i3, (c0383a.topMargin + i3) + c0383a.bottomMargin);
                    obj3 = 1;
                } else {
                    i3 = Integer.MIN_VALUE;
                    if (c0383a.height == 0 && c0383a.f1015g > 0.0f) {
                        i3 = 0;
                        c0383a.height = -2;
                    }
                    int i14 = i3;
                    m1544a(b2, i12, i, 0, i2, f2 == 0.0f ? this.f788f : 0);
                    if (i14 != Integer.MIN_VALUE) {
                        c0383a.height = i14;
                    }
                    i3 = b2.getMeasuredHeight();
                    int i15 = this.f788f;
                    this.f788f = Math.max(i15, (((i15 + i3) + c0383a.topMargin) + c0383a.bottomMargin) + m1545b(b2));
                    if (z) {
                        i11 = Math.max(i3, i11);
                    }
                }
                if (i10 >= 0 && i10 == i12 + 1) {
                    this.f785c = this.f788f;
                }
                if (i12 >= i10 || c0383a.f1015g <= 0.0f) {
                    Object obj6;
                    Object obj7 = null;
                    if (mode == 1073741824 || c0383a.width != -1) {
                        obj6 = obj2;
                    } else {
                        obj6 = 1;
                        obj7 = 1;
                    }
                    i4 = c0383a.rightMargin + c0383a.leftMargin;
                    i13 = b2.getMeasuredWidth() + i4;
                    i6 = Math.max(i6, i13);
                    int a = C0380s.m1767a(i7, C0233z.m1091e(b2));
                    obj5 = (obj == null || c0383a.width != -1) ? null : 1;
                    if (c0383a.f1015g > 0.0f) {
                        i3 = Math.max(i9, obj7 != null ? i4 : i13);
                        i4 = i8;
                    } else {
                        if (obj7 == null) {
                            i4 = i13;
                        }
                        i4 = Math.max(i8, i4);
                        i3 = i9;
                    }
                    i12 += m1539a(b2, i12);
                    obj4 = obj3;
                    i9 = i3;
                    i8 = i4;
                    i13 = i6;
                    i3 = i11;
                    i4 = a;
                    obj2 = obj6;
                    f = f2;
                } else {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
            }
            i12++;
            i11 = i3;
            obj3 = obj4;
            obj = obj5;
            i7 = i4;
            i6 = i13;
        }
        if (this.f788f > 0 && m1553c(virtualChildCount)) {
            this.f788f += this.f795m;
        }
        if (z && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.f788f = 0;
            i5 = 0;
            while (i5 < virtualChildCount) {
                b = m1548b(i5);
                if (b == null) {
                    this.f788f += m1554d(i5);
                    i3 = i5;
                } else if (b.getVisibility() == 8) {
                    i3 = m1539a(b, i5) + i5;
                } else {
                    C0383a c0383a2 = (C0383a) b.getLayoutParams();
                    int i16 = this.f788f;
                    this.f788f = Math.max(i16, (c0383a2.bottomMargin + ((i16 + i11) + c0383a2.topMargin)) + m1545b(b));
                    i3 = i5;
                }
                i5 = i3 + 1;
            }
        }
        this.f788f += getPaddingTop() + getPaddingBottom();
        int a2 = C0233z.m1075a(Math.max(this.f788f, getSuggestedMinimumHeight()), i2, 0);
        i5 = (16777215 & a2) - this.f788f;
        int i17;
        if (obj3 != null || (i5 != 0 && f > 0.0f)) {
            if (this.f789g > 0.0f) {
                f = this.f789g;
            }
            this.f788f = 0;
            i11 = 0;
            float f3 = f;
            Object obj8 = obj;
            i17 = i8;
            i16 = i7;
            i9 = i6;
            i15 = i5;
            while (i11 < virtualChildCount) {
                View b3 = m1548b(i11);
                if (b3.getVisibility() == 8) {
                    i3 = i17;
                    i5 = i16;
                    i4 = i9;
                    obj5 = obj8;
                } else {
                    float f4;
                    float f5;
                    c0383a2 = (C0383a) b3.getLayoutParams();
                    float f6 = c0383a2.f1015g;
                    if (f6 > 0.0f) {
                        i5 = (int) ((((float) i15) * f6) / f3);
                        f3 -= f6;
                        i15 -= i5;
                        i4 = C0328d.getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + c0383a2.leftMargin) + c0383a2.rightMargin, c0383a2.width);
                        if (c0383a2.height == 0 && mode2 == 1073741824) {
                            if (i5 <= 0) {
                                i5 = 0;
                            }
                            b3.measure(i4, MeasureSpec.makeMeasureSpec(i5, 1073741824));
                        } else {
                            i5 += b3.getMeasuredHeight();
                            if (i5 < 0) {
                                i5 = 0;
                            }
                            b3.measure(i4, MeasureSpec.makeMeasureSpec(i5, 1073741824));
                        }
                        f4 = f3;
                        i12 = i15;
                        i15 = C0380s.m1767a(i16, C0233z.m1091e(b3) & -256);
                        f5 = f4;
                    } else {
                        f5 = f3;
                        i12 = i15;
                        i15 = i16;
                    }
                    i16 = c0383a2.leftMargin + c0383a2.rightMargin;
                    i4 = b3.getMeasuredWidth() + i16;
                    i9 = Math.max(i9, i4);
                    Object obj9 = (mode == 1073741824 || c0383a2.width != -1) ? null : 1;
                    if (obj9 == null) {
                        i16 = i4;
                    }
                    i4 = Math.max(i17, i16);
                    obj5 = (obj8 == null || c0383a2.width != -1) ? null : 1;
                    i13 = this.f788f;
                    this.f788f = Math.max(i13, (c0383a2.bottomMargin + ((b3.getMeasuredHeight() + i13) + c0383a2.topMargin)) + m1545b(b3));
                    i3 = i4;
                    i4 = i9;
                    f4 = f5;
                    i5 = i15;
                    i15 = i12;
                    f3 = f4;
                }
                i11++;
                i17 = i3;
                i9 = i4;
                obj8 = obj5;
                i16 = i5;
            }
            this.f788f += getPaddingTop() + getPaddingBottom();
            obj = obj8;
            i3 = i17;
            i7 = i16;
            i5 = i9;
        } else {
            i17 = Math.max(i8, i9);
            if (z && mode2 != 1073741824) {
                for (i5 = 0; i5 < virtualChildCount; i5++) {
                    b = m1548b(i5);
                    if (!(b == null || b.getVisibility() == 8 || ((C0383a) b.getLayoutParams()).f1015g <= 0.0f)) {
                        b.measure(MeasureSpec.makeMeasureSpec(b.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    }
                }
            }
            i3 = i17;
            i5 = i6;
        }
        if (obj != null || mode == 1073741824) {
            i3 = i5;
        }
        setMeasuredDimension(C0233z.m1075a(Math.max(i3 + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i, i7), a2);
        if (obj2 != null) {
            m1536c(virtualChildCount, i2);
        }
    }

    void m1541a(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int i5 = i3 - i;
        int paddingRight = i5 - getPaddingRight();
        int paddingRight2 = (i5 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i6 = this.f787e & 8388615;
        switch (this.f787e & 112) {
            case 16:
                i5 = getPaddingTop() + (((i4 - i2) - this.f788f) / 2);
                break;
            case C0274i.Theme_listChoiceBackgroundIndicator /*80*/:
                i5 = ((getPaddingTop() + i4) - i2) - this.f788f;
                break;
            default:
                i5 = getPaddingTop();
                break;
        }
        int i7 = 0;
        int i8 = i5;
        while (i7 < virtualChildCount) {
            View b = m1548b(i7);
            if (b == null) {
                i8 += m1554d(i7);
                i5 = i7;
            } else if (b.getVisibility() != 8) {
                int i9;
                int measuredWidth = b.getMeasuredWidth();
                int measuredHeight = b.getMeasuredHeight();
                C0383a c0383a = (C0383a) b.getLayoutParams();
                i5 = c0383a.f1016h;
                if (i5 < 0) {
                    i5 = i6;
                }
                switch (C0178e.m910a(i5, C0233z.m1090d(this)) & 7) {
                    case 1:
                        i9 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + c0383a.leftMargin) - c0383a.rightMargin;
                        break;
                    case 5:
                        i9 = (paddingRight - measuredWidth) - c0383a.rightMargin;
                        break;
                    default:
                        i9 = paddingLeft + c0383a.leftMargin;
                        break;
                }
                int i10 = (m1553c(i7) ? this.f795m + i8 : i8) + c0383a.topMargin;
                m1535a(b, i9, i10 + m1538a(b), measuredWidth, measuredHeight);
                i8 = i10 + ((c0383a.bottomMargin + measuredHeight) + m1545b(b));
                i5 = m1539a(b, i7) + i7;
            } else {
                i5 = i7;
            }
            i7 = i5 + 1;
        }
    }

    void m1542a(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        int i = 0;
        while (i < virtualChildCount) {
            View b = m1548b(i);
            if (!(b == null || b.getVisibility() == 8 || !m1553c(i))) {
                m1543a(canvas, (b.getTop() - ((C0383a) b.getLayoutParams()).topMargin) - this.f795m);
            }
            i++;
        }
        if (m1553c(virtualChildCount)) {
            int height;
            View b2 = m1548b(virtualChildCount - 1);
            if (b2 == null) {
                height = (getHeight() - getPaddingBottom()) - this.f795m;
            } else {
                C0383a c0383a = (C0383a) b2.getLayoutParams();
                height = c0383a.bottomMargin + b2.getBottom();
            }
            m1543a(canvas, height);
        }
    }

    void m1543a(Canvas canvas, int i) {
        this.f793k.setBounds(getPaddingLeft() + this.f797o, i, (getWidth() - getPaddingRight()) - this.f797o, this.f795m + i);
        this.f793k.draw(canvas);
    }

    void m1544a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    int m1545b(View view) {
        return 0;
    }

    public C0383a mo299b(AttributeSet attributeSet) {
        return new C0383a(getContext(), attributeSet);
    }

    protected C0383a mo300b(LayoutParams layoutParams) {
        return new C0383a(layoutParams);
    }

    View m1548b(int i) {
        return getChildAt(i);
    }

    void m1549b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        C0383a c0383a;
        this.f788f = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        Object obj = 1;
        float f = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        Object obj2 = null;
        Object obj3 = null;
        if (this.f791i == null || this.f792j == null) {
            this.f791i = new int[4];
            this.f792j = new int[4];
        }
        int[] iArr = this.f791i;
        int[] iArr2 = this.f792j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z = this.f783a;
        boolean z2 = this.f790h;
        Object obj4 = mode == 1073741824 ? 1 : null;
        int i10 = Integer.MIN_VALUE;
        int i11 = 0;
        while (i11 < virtualChildCount) {
            Object obj5;
            Object obj6;
            int i12;
            View b = m1548b(i11);
            if (b == null) {
                this.f788f += m1554d(i11);
                i3 = i10;
                obj5 = obj3;
                obj6 = obj;
                i12 = i7;
                i4 = i6;
            } else if (b.getVisibility() == 8) {
                i11 += m1539a(b, i11);
                i3 = i10;
                obj5 = obj3;
                obj6 = obj;
                i12 = i7;
                i4 = i6;
            } else {
                Object obj7;
                if (m1553c(i11)) {
                    this.f788f += this.f794l;
                }
                C0383a c0383a2 = (C0383a) b.getLayoutParams();
                float f2 = f + c0383a2.f1015g;
                if (mode == 1073741824 && c0383a2.width == 0 && c0383a2.f1015g > 0.0f) {
                    if (obj4 != null) {
                        this.f788f += c0383a2.leftMargin + c0383a2.rightMargin;
                    } else {
                        i3 = this.f788f;
                        this.f788f = Math.max(i3, (c0383a2.leftMargin + i3) + c0383a2.rightMargin);
                    }
                    if (z) {
                        i3 = MeasureSpec.makeMeasureSpec(0, 0);
                        b.measure(i3, i3);
                    } else {
                        obj3 = 1;
                    }
                } else {
                    i3 = Integer.MIN_VALUE;
                    if (c0383a2.width == 0 && c0383a2.f1015g > 0.0f) {
                        i3 = 0;
                        c0383a2.width = -2;
                    }
                    int i13 = i3;
                    m1544a(b, i11, i, f2 == 0.0f ? this.f788f : 0, i2, 0);
                    if (i13 != Integer.MIN_VALUE) {
                        c0383a2.width = i13;
                    }
                    i3 = b.getMeasuredWidth();
                    if (obj4 != null) {
                        this.f788f += ((c0383a2.leftMargin + i3) + c0383a2.rightMargin) + m1545b(b);
                    } else {
                        int i14 = this.f788f;
                        this.f788f = Math.max(i14, (((i14 + i3) + c0383a2.leftMargin) + c0383a2.rightMargin) + m1545b(b));
                    }
                    if (z2) {
                        i10 = Math.max(i3, i10);
                    }
                }
                Object obj8 = null;
                if (mode2 == 1073741824 || c0383a2.height != -1) {
                    obj7 = obj2;
                } else {
                    obj7 = 1;
                    obj8 = 1;
                }
                i12 = c0383a2.bottomMargin + c0383a2.topMargin;
                i4 = b.getMeasuredHeight() + i12;
                int a = C0380s.m1767a(i7, C0233z.m1091e(b));
                if (z) {
                    i7 = b.getBaseline();
                    if (i7 != -1) {
                        int i15 = ((((c0383a2.f1016h < 0 ? this.f787e : c0383a2.f1016h) & 112) >> 4) & -2) >> 1;
                        iArr[i15] = Math.max(iArr[i15], i7);
                        iArr2[i15] = Math.max(iArr2[i15], i4 - i7);
                    }
                }
                i7 = Math.max(i6, i4);
                obj6 = (obj == null || c0383a2.height != -1) ? null : 1;
                if (c0383a2.f1015g > 0.0f) {
                    i3 = Math.max(i9, obj8 != null ? i12 : i4);
                    i12 = i8;
                } else {
                    if (obj8 == null) {
                        i12 = i4;
                    }
                    i12 = Math.max(i8, i12);
                    i3 = i9;
                }
                i11 += m1539a(b, i11);
                obj5 = obj3;
                i9 = i3;
                i8 = i12;
                i4 = i7;
                i3 = i10;
                i12 = a;
                obj2 = obj7;
                f = f2;
            }
            i11++;
            i10 = i3;
            obj3 = obj5;
            obj = obj6;
            i7 = i12;
            i6 = i4;
        }
        if (this.f788f > 0 && m1553c(virtualChildCount)) {
            this.f788f += this.f794l;
        }
        i11 = (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) ? i6 : Math.max(i6, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        if (z2 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f788f = 0;
            i5 = 0;
            while (i5 < virtualChildCount) {
                View b2 = m1548b(i5);
                if (b2 == null) {
                    this.f788f += m1554d(i5);
                    i3 = i5;
                } else if (b2.getVisibility() == 8) {
                    i3 = m1539a(b2, i5) + i5;
                } else {
                    c0383a = (C0383a) b2.getLayoutParams();
                    if (obj4 != null) {
                        this.f788f = ((c0383a.rightMargin + (c0383a.leftMargin + i10)) + m1545b(b2)) + this.f788f;
                        i3 = i5;
                    } else {
                        i12 = this.f788f;
                        this.f788f = Math.max(i12, (c0383a.rightMargin + ((i12 + i10) + c0383a.leftMargin)) + m1545b(b2));
                        i3 = i5;
                    }
                }
                i5 = i3 + 1;
            }
        }
        this.f788f += getPaddingLeft() + getPaddingRight();
        int a2 = C0233z.m1075a(Math.max(this.f788f, getSuggestedMinimumWidth()), i, 0);
        i5 = (16777215 & a2) - this.f788f;
        int i16;
        if (obj3 != null || (i5 != 0 && f > 0.0f)) {
            if (this.f789g > 0.0f) {
                f = this.f789g;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f788f = 0;
            i10 = 0;
            float f3 = f;
            Object obj9 = obj;
            i16 = i8;
            i15 = i7;
            i14 = i5;
            i8 = -1;
            while (i10 < virtualChildCount) {
                float f4;
                Object obj10;
                View b3 = m1548b(i10);
                if (b3 == null) {
                    f4 = f3;
                    i5 = i14;
                    i12 = i8;
                    i14 = i16;
                    obj10 = obj9;
                } else if (b3.getVisibility() == 8) {
                    f4 = f3;
                    i5 = i14;
                    i12 = i8;
                    i14 = i16;
                    obj10 = obj9;
                } else {
                    float f5;
                    c0383a = (C0383a) b3.getLayoutParams();
                    float f6 = c0383a.f1015g;
                    if (f6 > 0.0f) {
                        i5 = (int) ((((float) i14) * f6) / f3);
                        f3 -= f6;
                        i12 = i14 - i5;
                        i14 = C0328d.getChildMeasureSpec(i2, ((getPaddingTop() + getPaddingBottom()) + c0383a.topMargin) + c0383a.bottomMargin, c0383a.height);
                        if (c0383a.width == 0 && mode == 1073741824) {
                            if (i5 <= 0) {
                                i5 = 0;
                            }
                            b3.measure(MeasureSpec.makeMeasureSpec(i5, 1073741824), i14);
                        } else {
                            i5 += b3.getMeasuredWidth();
                            if (i5 < 0) {
                                i5 = 0;
                            }
                            b3.measure(MeasureSpec.makeMeasureSpec(i5, 1073741824), i14);
                        }
                        i9 = C0380s.m1767a(i15, C0233z.m1091e(b3) & -16777216);
                        f5 = f3;
                    } else {
                        i12 = i14;
                        i9 = i15;
                        f5 = f3;
                    }
                    if (obj4 != null) {
                        this.f788f += ((b3.getMeasuredWidth() + c0383a.leftMargin) + c0383a.rightMargin) + m1545b(b3);
                    } else {
                        i5 = this.f788f;
                        this.f788f = Math.max(i5, (((b3.getMeasuredWidth() + i5) + c0383a.leftMargin) + c0383a.rightMargin) + m1545b(b3));
                    }
                    obj5 = (mode2 == 1073741824 || c0383a.height != -1) ? null : 1;
                    i11 = c0383a.topMargin + c0383a.bottomMargin;
                    i14 = b3.getMeasuredHeight() + i11;
                    i8 = Math.max(i8, i14);
                    i11 = Math.max(i16, obj5 != null ? i11 : i14);
                    obj5 = (obj9 == null || c0383a.height != -1) ? null : 1;
                    if (z) {
                        i4 = b3.getBaseline();
                        if (i4 != -1) {
                            i3 = ((((c0383a.f1016h < 0 ? this.f787e : c0383a.f1016h) & 112) >> 4) & -2) >> 1;
                            iArr[i3] = Math.max(iArr[i3], i4);
                            iArr2[i3] = Math.max(iArr2[i3], i14 - i4);
                        }
                    }
                    f4 = f5;
                    i14 = i11;
                    obj10 = obj5;
                    i15 = i9;
                    i5 = i12;
                    i12 = i8;
                }
                i10++;
                i16 = i14;
                i8 = i12;
                obj9 = obj10;
                i14 = i5;
                f3 = f4;
            }
            this.f788f += getPaddingLeft() + getPaddingRight();
            if (!(iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1)) {
                i8 = Math.max(i8, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            obj = obj9;
            i3 = i16;
            i7 = i15;
            i5 = i8;
        } else {
            i16 = Math.max(i8, i9);
            if (z2 && mode != 1073741824) {
                for (i5 = 0; i5 < virtualChildCount; i5++) {
                    View b4 = m1548b(i5);
                    if (!(b4 == null || b4.getVisibility() == 8 || ((C0383a) b4.getLayoutParams()).f1015g <= 0.0f)) {
                        b4.measure(MeasureSpec.makeMeasureSpec(i10, 1073741824), MeasureSpec.makeMeasureSpec(b4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = i16;
            i5 = i11;
        }
        if (obj != null || mode2 == 1073741824) {
            i3 = i5;
        }
        setMeasuredDimension((-16777216 & i7) | a2, C0233z.m1075a(Math.max(i3 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight()), i2, i7 << 16));
        if (obj2 != null) {
            m1537d(virtualChildCount, i);
        }
    }

    void m1550b(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        boolean a = C0380s.m1769a(this);
        int paddingTop = getPaddingTop();
        int i7 = i4 - i2;
        int paddingBottom = i7 - getPaddingBottom();
        int paddingBottom2 = (i7 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        i7 = this.f787e & 8388615;
        int i8 = this.f787e & 112;
        boolean z = this.f783a;
        int[] iArr = this.f791i;
        int[] iArr2 = this.f792j;
        switch (C0178e.m910a(i7, C0233z.m1090d(this))) {
            case 1:
                paddingLeft = getPaddingLeft() + (((i3 - i) - this.f788f) / 2);
                break;
            case 5:
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.f788f;
                break;
            default:
                paddingLeft = getPaddingLeft();
                break;
        }
        if (a) {
            i5 = -1;
            i6 = virtualChildCount - 1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i9 = 0;
        while (i9 < virtualChildCount) {
            int i10 = i6 + (i5 * i9);
            View b = m1548b(i10);
            if (b == null) {
                paddingLeft += m1554d(i10);
                i7 = i9;
            } else if (b.getVisibility() != 8) {
                int i11;
                int measuredWidth = b.getMeasuredWidth();
                int measuredHeight = b.getMeasuredHeight();
                C0383a c0383a = (C0383a) b.getLayoutParams();
                i7 = (!z || c0383a.height == -1) ? -1 : b.getBaseline();
                int i12 = c0383a.f1016h;
                if (i12 < 0) {
                    i12 = i8;
                }
                switch (i12 & 112) {
                    case 16:
                        i11 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + c0383a.topMargin) - c0383a.bottomMargin;
                        break;
                    case C0274i.Theme_homeAsUpIndicator /*48*/:
                        i11 = paddingTop + c0383a.topMargin;
                        if (i7 != -1) {
                            i11 += iArr[1] - i7;
                            break;
                        }
                        break;
                    case C0274i.Theme_listChoiceBackgroundIndicator /*80*/:
                        i11 = (paddingBottom - measuredHeight) - c0383a.bottomMargin;
                        if (i7 != -1) {
                            i11 -= iArr2[2] - (b.getMeasuredHeight() - i7);
                            break;
                        }
                        break;
                    default:
                        i11 = paddingTop;
                        break;
                }
                paddingLeft = (m1553c(i10) ? this.f794l + paddingLeft : paddingLeft) + c0383a.leftMargin;
                m1535a(b, paddingLeft + m1538a(b), i11, measuredWidth, measuredHeight);
                paddingLeft += (c0383a.rightMargin + measuredWidth) + m1545b(b);
                i7 = m1539a(b, i10) + i9;
            } else {
                i7 = i9;
            }
            i9 = i7 + 1;
        }
    }

    void m1551b(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        boolean a = C0380s.m1769a(this);
        int i = 0;
        while (i < virtualChildCount) {
            View b = m1548b(i);
            if (!(b == null || b.getVisibility() == 8 || !m1553c(i))) {
                C0383a c0383a = (C0383a) b.getLayoutParams();
                m1552b(canvas, a ? c0383a.rightMargin + b.getRight() : (b.getLeft() - c0383a.leftMargin) - this.f794l);
            }
            i++;
        }
        if (m1553c(virtualChildCount)) {
            int paddingLeft;
            View b2 = m1548b(virtualChildCount - 1);
            if (b2 == null) {
                paddingLeft = a ? getPaddingLeft() : (getWidth() - getPaddingRight()) - this.f794l;
            } else {
                c0383a = (C0383a) b2.getLayoutParams();
                paddingLeft = a ? (b2.getLeft() - c0383a.leftMargin) - this.f794l : c0383a.rightMargin + b2.getRight();
            }
            m1552b(canvas, paddingLeft);
        }
    }

    void m1552b(Canvas canvas, int i) {
        this.f793k.setBounds(i, getPaddingTop() + this.f797o, this.f794l + i, (getHeight() - getPaddingBottom()) - this.f797o);
        this.f793k.draw(canvas);
    }

    protected boolean m1553c(int i) {
        if (i == 0) {
            return (this.f796n & 1) != 0;
        } else {
            if (i == getChildCount()) {
                return (this.f796n & 4) != 0;
            } else {
                if ((this.f796n & 2) == 0) {
                    return false;
                }
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    if (getChildAt(i2).getVisibility() != 8) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0383a;
    }

    int m1554d(int i) {
        return 0;
    }

    protected C0383a mo302g() {
        return this.f786d == 0 ? new C0383a(-2, -2) : this.f786d == 1 ? new C0383a(-1, -2) : null;
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return mo302g();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return mo299b(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return mo300b(layoutParams);
    }

    public int getBaseline() {
        if (this.f784b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.f784b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.f784b);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i;
            int i2 = this.f785c;
            if (this.f786d == 1) {
                i = this.f787e & 112;
                if (i != 48) {
                    switch (i) {
                        case 16:
                            i = i2 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f788f) / 2);
                            break;
                        case C0274i.Theme_listChoiceBackgroundIndicator /*80*/:
                            i = ((getBottom() - getTop()) - getPaddingBottom()) - this.f788f;
                            break;
                    }
                }
            }
            i = i2;
            return (((C0383a) childAt.getLayoutParams()).topMargin + i) + baseline;
        } else if (this.f784b == 0) {
            return -1;
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f784b;
    }

    public Drawable getDividerDrawable() {
        return this.f793k;
    }

    public int getDividerPadding() {
        return this.f797o;
    }

    public int getDividerWidth() {
        return this.f794l;
    }

    public int getOrientation() {
        return this.f786d;
    }

    public int getShowDividers() {
        return this.f796n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f789g;
    }

    protected void onDraw(Canvas canvas) {
        if (this.f793k != null) {
            if (this.f786d == 1) {
                m1542a(canvas);
            } else {
                m1551b(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0328d.class.getName());
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0328d.class.getName());
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f786d == 1) {
            m1541a(i, i2, i3, i4);
        } else {
            m1550b(i, i2, i3, i4);
        }
    }

    protected void onMeasure(int i, int i2) {
        if (this.f786d == 1) {
            m1540a(i, i2);
        } else {
            m1549b(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f783a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f784b = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        boolean z = false;
        if (drawable != this.f793k) {
            this.f793k = drawable;
            if (drawable != null) {
                this.f794l = drawable.getIntrinsicWidth();
                this.f795m = drawable.getIntrinsicHeight();
            } else {
                this.f794l = 0;
                this.f795m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f797o = i;
    }

    public void setGravity(int i) {
        if (this.f787e != i) {
            int i2 = (8388615 & i) == 0 ? 8388611 | i : i;
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f787e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        if ((this.f787e & 8388615) != i2) {
            this.f787e = i2 | (this.f787e & -8388616);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f790h = z;
    }

    public void setOrientation(int i) {
        if (this.f786d != i) {
            this.f786d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f796n) {
            requestLayout();
        }
        this.f796n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        if ((this.f787e & 112) != i2) {
            this.f787e = i2 | (this.f787e & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f789g = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
