package android.support.v7.internal.widget;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.C0178e;
import android.support.v4.view.C0233z;
import android.support.v7.internal.widget.C0320e.C0354b;
import android.support.v7.p010b.C0275a.C0274i;
import android.support.v7.widget.C0339e;
import android.support.v7.widget.C0339e.C0287b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

class SpinnerCompat extends AbsSpinnerCompat implements OnClickListener {
    int f876E;
    private C0287b f877F;
    private C0335d f878G;
    private C0337b f879H;
    private int f880I;
    private boolean f881J;
    private Rect f882K;
    private final C0376p f883L;

    class C03332 implements OnGlobalLayoutListener {
        final /* synthetic */ SpinnerCompat f833a;

        C03332(SpinnerCompat spinnerCompat) {
            this.f833a = spinnerCompat;
        }

        public void onGlobalLayout() {
            if (!this.f833a.f878G.mo268b()) {
                this.f833a.f878G.mo269c();
            }
            ViewTreeObserver viewTreeObserver = this.f833a.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    static class SavedState extends SavedState {
        public static final Creator<SavedState> CREATOR = new C03341();
        boolean f834c;

        static class C03341 implements Creator<SavedState> {
            C03341() {
            }

            public SavedState m1582a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] m1583a(int i) {
                return new SavedState[i];
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1582a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1583a(i);
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f834c = parcel.readByte() != (byte) 0;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte((byte) (this.f834c ? 1 : 0));
        }
    }

    private interface C0335d {
        void mo265a();

        void mo266a(ListAdapter listAdapter);

        void mo267a(CharSequence charSequence);

        boolean mo268b();

        void mo269c();
    }

    private class C0336a implements OnClickListener, C0335d {
        final /* synthetic */ SpinnerCompat f835a;
        private AlertDialog f836b;
        private ListAdapter f837c;
        private CharSequence f838d;

        private C0336a(SpinnerCompat spinnerCompat) {
            this.f835a = spinnerCompat;
        }

        public void mo265a() {
            if (this.f836b != null) {
                this.f836b.dismiss();
                this.f836b = null;
            }
        }

        public void mo266a(ListAdapter listAdapter) {
            this.f837c = listAdapter;
        }

        public void mo267a(CharSequence charSequence) {
            this.f838d = charSequence;
        }

        public boolean mo268b() {
            return this.f836b != null ? this.f836b.isShowing() : false;
        }

        public void mo269c() {
            if (this.f837c != null) {
                Builder builder = new Builder(this.f835a.getContext());
                if (this.f838d != null) {
                    builder.setTitle(this.f838d);
                }
                this.f836b = builder.setSingleChoiceItems(this.f837c, this.f835a.getSelectedItemPosition(), this).create();
                this.f836b.show();
            }
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f835a.setSelection(i);
            if (this.f835a.s != null) {
                this.f835a.m1475a(null, i, this.f837c.getItemId(i));
            }
            mo265a();
        }
    }

    private static class C0337b implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter f839a;
        private ListAdapter f840b;

        public C0337b(SpinnerAdapter spinnerAdapter) {
            this.f839a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f840b = (ListAdapter) spinnerAdapter;
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f840b;
            return listAdapter != null ? listAdapter.areAllItemsEnabled() : true;
        }

        public int getCount() {
            return this.f839a == null ? 0 : this.f839a.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            return this.f839a == null ? null : this.f839a.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            return this.f839a == null ? null : this.f839a.getItem(i);
        }

        public long getItemId(int i) {
            return this.f839a == null ? -1 : this.f839a.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            return this.f839a != null && this.f839a.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f840b;
            return listAdapter != null ? listAdapter.isEnabled(i) : true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f839a != null) {
                this.f839a.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f839a != null) {
                this.f839a.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    private class C0340c extends C0339e implements C0335d {
        final /* synthetic */ SpinnerCompat f873a;
        private CharSequence f874c;
        private ListAdapter f875d;

        public C0340c(final SpinnerCompat spinnerCompat, Context context, AttributeSet attributeSet, int i) {
            this.f873a = spinnerCompat;
            super(context, attributeSet, i);
            m1604a((View) spinnerCompat);
            m1608a(true);
            m1602a(0);
            m1605a(new OnItemClickListener(this) {
                final /* synthetic */ C0340c f842b;

                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    this.f842b.f873a.setSelection(i);
                    if (this.f842b.f873a.s != null) {
                        this.f842b.f873a.m1475a(view, i, this.f842b.f875d.getItemId(i));
                    }
                    this.f842b.m1601a();
                }
            });
        }

        public void mo266a(ListAdapter listAdapter) {
            super.mo266a(listAdapter);
            this.f875d = listAdapter;
        }

        public void mo267a(CharSequence charSequence) {
            this.f874c = charSequence;
        }
    }

    SpinnerCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    SpinnerCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f882K = new Rect();
        C0377q a = C0377q.m1724a(context, attributeSet, C0274i.Spinner, i, 0);
        if (a.m1737d(C0274i.Spinner_android_background)) {
            setBackgroundDrawable(a.m1728a(C0274i.Spinner_android_background));
        }
        if (i2 == -1) {
            i2 = a.m1727a(C0274i.Spinner_spinnerMode, 0);
        }
        switch (i2) {
            case 0:
                this.f878G = new C0336a();
                break;
            case 1:
                final Object c0340c = new C0340c(this, context, attributeSet, i);
                this.f876E = a.m1738e(C0274i.Spinner_android_dropDownWidth, -2);
                c0340c.m1603a(a.m1728a(C0274i.Spinner_android_popupBackground));
                this.f878G = c0340c;
                this.f877F = new C0287b(this, this) {
                    final /* synthetic */ SpinnerCompat f832b;

                    public C0339e mo203a() {
                        return c0340c;
                    }

                    public boolean mo204b() {
                        if (!this.f832b.f878G.mo268b()) {
                            this.f832b.f878G.mo269c();
                        }
                        return true;
                    }
                };
                break;
        }
        this.f880I = a.m1727a(C0274i.Spinner_android_gravity, 17);
        this.f878G.mo267a(a.m1735c(C0274i.Spinner_prompt));
        this.f881J = a.m1729a(C0274i.Spinner_disableChildrenWhenDisabled, false);
        a.m1732b();
        if (this.f879H != null) {
            this.f878G.mo266a(this.f879H);
            this.f879H = null;
        }
        this.f883L = a.m1734c();
    }

    private void m1623a(View view, boolean z) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        if (z) {
            addViewInLayout(view, 0, layoutParams);
        }
        view.setSelected(hasFocus());
        if (this.f881J) {
            view.setEnabled(isEnabled());
        }
        view.measure(ViewGroup.getChildMeasureSpec(this.c, this.h.left + this.h.right, layoutParams.width), ViewGroup.getChildMeasureSpec(this.b, this.h.top + this.h.bottom, layoutParams.height));
        int measuredHeight = this.h.top + ((((getMeasuredHeight() - this.h.bottom) - this.h.top) - view.getMeasuredHeight()) / 2);
        view.layout(0, measuredHeight, view.getMeasuredWidth() + 0, view.getMeasuredHeight() + measuredHeight);
    }

    private View m1624c(int i, boolean z) {
        View a;
        if (!this.u) {
            a = this.i.m1466a(i);
            if (a != null) {
                m1623a(a, z);
                return a;
            }
        }
        a = this.a.getView(i, null, this);
        m1623a(a, z);
        return a;
    }

    int m1625a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view = null;
        int i = 0;
        max = 0;
        while (max2 < min) {
            View view2;
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != max) {
                view2 = null;
            } else {
                itemViewType = max;
                view2 = view;
            }
            view = spinnerAdapter.getView(max2, view2, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i = Math.max(i, view.getMeasuredWidth());
            max2++;
            max = itemViewType;
        }
        if (drawable == null) {
            return i;
        }
        drawable.getPadding(this.f882K);
        return (this.f882K.left + this.f882K.right) + i;
    }

    void mo270a(int i, boolean z) {
        int i2 = this.h.left;
        int right = ((getRight() - getLeft()) - this.h.left) - this.h.right;
        if (this.u) {
            m1480g();
        }
        if (this.z == 0) {
            mo252a();
            return;
        }
        if (this.v >= 0) {
            setSelectedPositionInt(this.v);
        }
        m1491b();
        removeAllViewsInLayout();
        this.j = this.x;
        if (this.a != null) {
            View c = m1624c(this.x, true);
            int measuredWidth = c.getMeasuredWidth();
            switch (C0178e.m910a(this.f880I, C0233z.m1090d(this)) & 7) {
                case 1:
                    i2 = (i2 + (right / 2)) - (measuredWidth / 2);
                    break;
                case 5:
                    i2 = (i2 + right) - measuredWidth;
                    break;
            }
            c.offsetLeftAndRight(i2);
        }
        this.i.m1467a();
        invalidate();
        m1481h();
        this.u = false;
        this.o = false;
        setNextSelectedPositionInt(this.x);
    }

    void m1627a(C0354b c0354b) {
        super.setOnItemClickListener(c0354b);
    }

    public void mo271a(SpinnerAdapter spinnerAdapter) {
        super.mo271a(spinnerAdapter);
        this.i.m1467a();
        if (getContext().getApplicationInfo().targetSdkVersion >= 21 && spinnerAdapter != null && spinnerAdapter.getViewTypeCount() != 1) {
            throw new IllegalArgumentException("Spinner adapter view type count must be 1");
        } else if (this.f878G != null) {
            this.f878G.mo266a(new C0337b(spinnerAdapter));
        } else {
            this.f879H = new C0337b(spinnerAdapter);
        }
    }

    public int getBaseline() {
        View view = null;
        if (getChildCount() > 0) {
            view = getChildAt(0);
        } else if (this.a != null && this.a.getCount() > 0) {
            view = m1624c(0, false);
            this.i.m1468a(0, view);
        }
        if (view == null) {
            return -1;
        }
        int baseline = view.getBaseline();
        return baseline >= 0 ? view.getTop() + baseline : -1;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        setSelection(i);
        dialogInterface.dismiss();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f878G != null && this.f878G.mo268b()) {
            this.f878G.mo265a();
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.q = true;
        mo270a(0, false);
        this.q = false;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f878G != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m1625a(m1492c(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f834c) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new C03332(this));
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        boolean z = this.f878G != null && this.f878G.mo268b();
        savedState.f834c = z;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.f877F == null || !this.f877F.onTouch(this, motionEvent)) ? super.onTouchEvent(motionEvent) : true;
    }

    public boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            performClick = true;
            if (!this.f878G.mo268b()) {
                this.f878G.mo269c();
            }
        }
        return performClick;
    }

    public /* synthetic */ void setAdapter(Adapter adapter) {
        mo271a((SpinnerAdapter) adapter);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f881J) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).setEnabled(z);
            }
        }
    }

    public void setOnItemClickListener(C0354b c0354b) {
        throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
    }
}
