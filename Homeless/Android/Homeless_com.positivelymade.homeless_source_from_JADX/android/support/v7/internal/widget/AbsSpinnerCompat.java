package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.C0233z;
import android.support.v7.internal.widget.C0320e.C0353a;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.Adapter;
import android.widget.SpinnerAdapter;

abstract class AbsSpinnerCompat extends C0320e<SpinnerAdapter> {
    private DataSetObserver f703E;
    SpinnerAdapter f704a;
    int f705b;
    int f706c;
    int f707d = 0;
    int f708e = 0;
    int f709f = 0;
    int f710g = 0;
    final Rect f711h = new Rect();
    final C0319a f712i = new C0319a(this);

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C03181();
        long f673a;
        int f674b;

        static class C03181 implements Creator<SavedState> {
            C03181() {
            }

            public SavedState m1464a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] m1465a(int i) {
                return new SavedState[i];
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1464a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1465a(i);
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f673a = parcel.readLong();
            this.f674b = parcel.readInt();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "AbsSpinner.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " selectedId=" + this.f673a + " position=" + this.f674b + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.f673a);
            parcel.writeInt(this.f674b);
        }
    }

    class C0319a {
        final /* synthetic */ AbsSpinnerCompat f675a;
        private final SparseArray<View> f676b = new SparseArray();

        C0319a(AbsSpinnerCompat absSpinnerCompat) {
            this.f675a = absSpinnerCompat;
        }

        View m1466a(int i) {
            View view = (View) this.f676b.get(i);
            if (view != null) {
                this.f676b.delete(i);
            }
            return view;
        }

        void m1467a() {
            SparseArray sparseArray = this.f676b;
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                View view = (View) sparseArray.valueAt(i);
                if (view != null) {
                    this.f675a.removeDetachedView(view, true);
                }
            }
            sparseArray.clear();
        }

        public void m1468a(int i, View view) {
            this.f676b.put(i, view);
        }
    }

    AbsSpinnerCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1485k();
    }

    private void m1485k() {
        setFocusable(true);
        setWillNotDraw(false);
    }

    int m1486a(View view) {
        return view.getMeasuredHeight();
    }

    void mo252a() {
        this.u = false;
        this.o = false;
        removeAllViewsInLayout();
        this.B = -1;
        this.C = Long.MIN_VALUE;
        setSelectedPositionInt(-1);
        setNextSelectedPositionInt(-1);
        invalidate();
    }

    abstract void mo270a(int i, boolean z);

    public void mo271a(SpinnerAdapter spinnerAdapter) {
        int i = -1;
        if (this.f704a != null) {
            this.f704a.unregisterDataSetObserver(this.f703E);
            mo252a();
        }
        this.f704a = spinnerAdapter;
        this.B = -1;
        this.C = Long.MIN_VALUE;
        if (this.f704a != null) {
            this.A = this.z;
            this.z = this.f704a.getCount();
            m1478e();
            this.f703E = new C0353a(this);
            this.f704a.registerDataSetObserver(this.f703E);
            if (this.z > 0) {
                i = 0;
            }
            setSelectedPositionInt(i);
            setNextSelectedPositionInt(i);
            if (this.z == 0) {
                m1481h();
            }
        } else {
            m1478e();
            mo252a();
            m1481h();
        }
        requestLayout();
    }

    int m1490b(View view) {
        return view.getMeasuredWidth();
    }

    void m1491b() {
        int childCount = getChildCount();
        C0319a c0319a = this.f712i;
        int i = this.j;
        for (int i2 = 0; i2 < childCount; i2++) {
            c0319a.m1468a(i + i2, getChildAt(i2));
        }
    }

    public SpinnerAdapter m1492c() {
        return this.f704a;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    public /* synthetic */ Adapter getAdapter() {
        return m1492c();
    }

    public int getCount() {
        return this.z;
    }

    public View getSelectedView() {
        return (this.z <= 0 || this.x < 0) ? null : getChildAt(this.x - this.j);
    }

    protected void onMeasure(int i, int i2) {
        boolean z;
        int mode = MeasureSpec.getMode(i);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        Rect rect = this.f711h;
        if (paddingLeft <= this.f707d) {
            paddingLeft = this.f707d;
        }
        rect.left = paddingLeft;
        this.f711h.top = paddingTop > this.f708e ? paddingTop : this.f708e;
        this.f711h.right = paddingRight > this.f709f ? paddingRight : this.f709f;
        this.f711h.bottom = paddingBottom > this.f710g ? paddingBottom : this.f710g;
        if (this.u) {
            m1480g();
        }
        paddingTop = getSelectedItemPosition();
        if (paddingTop >= 0 && this.f704a != null && paddingTop < this.f704a.getCount()) {
            View a = this.f712i.m1466a(paddingTop);
            if (a == null) {
                a = this.f704a.getView(paddingTop, null, this);
            }
            if (a != null) {
                this.f712i.m1468a(paddingTop, a);
                if (a.getLayoutParams() == null) {
                    this.D = true;
                    a.setLayoutParams(generateDefaultLayoutParams());
                    this.D = false;
                }
                measureChild(a, i, i2);
                paddingTop = (m1486a(a) + this.f711h.top) + this.f711h.bottom;
                paddingLeft = (m1490b(a) + this.f711h.left) + this.f711h.right;
                z = false;
                if (z) {
                    paddingTop = this.f711h.top + this.f711h.bottom;
                    if (mode == 0) {
                        paddingLeft = this.f711h.left + this.f711h.right;
                    }
                }
                setMeasuredDimension(C0233z.m1075a(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, 0), C0233z.m1075a(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0));
                this.f705b = i2;
                this.f706c = i;
            }
        }
        z = true;
        paddingLeft = 0;
        paddingTop = 0;
        if (z) {
            paddingTop = this.f711h.top + this.f711h.bottom;
            if (mode == 0) {
                paddingLeft = this.f711h.left + this.f711h.right;
            }
        }
        setMeasuredDimension(C0233z.m1075a(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, 0), C0233z.m1075a(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0));
        this.f705b = i2;
        this.f706c = i;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f673a >= 0) {
            this.u = true;
            this.o = true;
            this.m = savedState.f673a;
            this.l = savedState.f674b;
            this.p = 0;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        Object savedState = new SavedState(super.onSaveInstanceState());
        savedState.f673a = getSelectedItemId();
        if (savedState.f673a >= 0) {
            savedState.f674b = getSelectedItemPosition();
        } else {
            savedState.f674b = -1;
        }
        return savedState;
    }

    public void requestLayout() {
        if (!this.D) {
            super.requestLayout();
        }
    }

    public /* synthetic */ void setAdapter(Adapter adapter) {
        mo271a((SpinnerAdapter) adapter);
    }

    public void setSelection(int i) {
        setNextSelectedPositionInt(i);
        requestLayout();
        invalidate();
    }
}
