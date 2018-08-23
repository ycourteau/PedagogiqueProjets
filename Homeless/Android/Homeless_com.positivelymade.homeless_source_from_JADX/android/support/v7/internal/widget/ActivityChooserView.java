package android.support.v7.internal.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0174d;
import android.support.v4.view.C0233z;
import android.support.v7.p010b.C0275a.C0270e;
import android.support.v7.p010b.C0275a.C0272g;
import android.support.v7.p010b.C0275a.C0273h;
import android.support.v7.widget.C0328d;
import android.support.v7.widget.C0339e;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

public class ActivityChooserView extends ViewGroup {
    C0174d f806a;
    private final C0329a f807b;
    private final C0330b f808c;
    private final C0328d f809d;
    private final FrameLayout f810e;
    private final ImageView f811f;
    private final FrameLayout f812g;
    private final int f813h;
    private final DataSetObserver f814i;
    private final OnGlobalLayoutListener f815j;
    private C0339e f816k;
    private OnDismissListener f817l;
    private boolean f818m;
    private int f819n;
    private boolean f820o;
    private int f821p;

    public static class InnerLayout extends C0328d {
        private static final int[] f798a = new int[]{16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0377q a = C0377q.m1723a(context, attributeSet, f798a);
            setBackgroundDrawable(a.m1728a(0));
            a.m1732b();
        }
    }

    private class C0329a extends BaseAdapter {
        final /* synthetic */ ActivityChooserView f799a;
        private C0351d f800b;
        private int f801c;
        private boolean f802d;
        private boolean f803e;
        private boolean f804f;

        public int m1556a() {
            int i = 0;
            int i2 = this.f801c;
            this.f801c = Integer.MAX_VALUE;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i3 = 0;
            while (i < count) {
                view = getView(i, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i3 = Math.max(i3, view.getMeasuredWidth());
                i++;
            }
            this.f801c = i2;
            return i3;
        }

        public void m1557a(int i) {
            if (this.f801c != i) {
                this.f801c = i;
                notifyDataSetChanged();
            }
        }

        public void m1558a(C0351d c0351d) {
            C0351d d = this.f799a.f807b.m1563d();
            if (d != null && this.f799a.isShown()) {
                d.unregisterObserver(this.f799a.f814i);
            }
            this.f800b = c0351d;
            if (c0351d != null && this.f799a.isShown()) {
                c0351d.registerObserver(this.f799a.f814i);
            }
            notifyDataSetChanged();
        }

        public void m1559a(boolean z) {
            if (this.f804f != z) {
                this.f804f = z;
                notifyDataSetChanged();
            }
        }

        public void m1560a(boolean z, boolean z2) {
            if (this.f802d != z || this.f803e != z2) {
                this.f802d = z;
                this.f803e = z2;
                notifyDataSetChanged();
            }
        }

        public ResolveInfo m1561b() {
            return this.f800b.m1654b();
        }

        public int m1562c() {
            return this.f800b.m1650a();
        }

        public C0351d m1563d() {
            return this.f800b;
        }

        public boolean m1564e() {
            return this.f802d;
        }

        public int getCount() {
            int a = this.f800b.m1650a();
            if (!(this.f802d || this.f800b.m1654b() == null)) {
                a--;
            }
            a = Math.min(a, this.f801c);
            return this.f804f ? a + 1 : a;
        }

        public Object getItem(int i) {
            switch (getItemViewType(i)) {
                case 0:
                    if (!(this.f802d || this.f800b.m1654b() == null)) {
                        i++;
                    }
                    return this.f800b.m1652a(i);
                case 1:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return (this.f804f && i == getCount() - 1) ? 1 : 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            switch (getItemViewType(i)) {
                case 0:
                    if (view == null || view.getId() != C0270e.list_item) {
                        view = LayoutInflater.from(this.f799a.getContext()).inflate(C0272g.abc_activity_chooser_view_list_item, viewGroup, false);
                    }
                    PackageManager packageManager = this.f799a.getContext().getPackageManager();
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    ((ImageView) view.findViewById(C0270e.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                    ((TextView) view.findViewById(C0270e.title)).setText(resolveInfo.loadLabel(packageManager));
                    if (this.f802d && i == 0 && this.f803e) {
                        C0233z.m1087b(view, true);
                        return view;
                    }
                    C0233z.m1087b(view, false);
                    return view;
                case 1:
                    if (view != null && view.getId() == 1) {
                        return view;
                    }
                    view = LayoutInflater.from(this.f799a.getContext()).inflate(C0272g.abc_activity_chooser_view_list_item, viewGroup, false);
                    view.setId(1);
                    ((TextView) view.findViewById(C0270e.title)).setText(this.f799a.getContext().getString(C0273h.abc_activity_chooser_view_see_all));
                    return view;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public int getViewTypeCount() {
            return 3;
        }
    }

    private class C0330b implements OnClickListener, OnLongClickListener, OnItemClickListener, OnDismissListener {
        final /* synthetic */ ActivityChooserView f805a;

        private void m1565a() {
            if (this.f805a.f817l != null) {
                this.f805a.f817l.onDismiss();
            }
        }

        public void onClick(View view) {
            if (view == this.f805a.f812g) {
                this.f805a.m1577b();
                Intent b = this.f805a.f807b.m1563d().m1653b(this.f805a.f807b.m1563d().m1651a(this.f805a.f807b.m1561b()));
                if (b != null) {
                    b.addFlags(524288);
                    this.f805a.getContext().startActivity(b);
                }
            } else if (view == this.f805a.f810e) {
                this.f805a.f818m = false;
                this.f805a.m1567a(this.f805a.f819n);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            m1565a();
            if (this.f805a.f806a != null) {
                this.f805a.f806a.m902a(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (((C0329a) adapterView.getAdapter()).getItemViewType(i)) {
                case 0:
                    this.f805a.m1577b();
                    if (!this.f805a.f818m) {
                        if (!this.f805a.f807b.m1564e()) {
                            i++;
                        }
                        Intent b = this.f805a.f807b.m1563d().m1653b(i);
                        if (b != null) {
                            b.addFlags(524288);
                            this.f805a.getContext().startActivity(b);
                            return;
                        }
                        return;
                    } else if (i > 0) {
                        this.f805a.f807b.m1563d().m1655c(i);
                        return;
                    } else {
                        return;
                    }
                case 1:
                    this.f805a.m1567a(Integer.MAX_VALUE);
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            if (view == this.f805a.f812g) {
                if (this.f805a.f807b.getCount() > 0) {
                    this.f805a.f818m = true;
                    this.f805a.m1567a(this.f805a.f819n);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    private void m1567a(int i) {
        if (this.f807b.m1563d() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f815j);
        boolean z = this.f812g.getVisibility() == 0;
        int c = this.f807b.m1562c();
        int i2 = z ? 1 : 0;
        if (i == Integer.MAX_VALUE || c <= i2 + i) {
            this.f807b.m1559a(false);
            this.f807b.m1557a(i);
        } else {
            this.f807b.m1559a(true);
            this.f807b.m1557a(i - 1);
        }
        C0339e listPopupWindow = getListPopupWindow();
        if (!listPopupWindow.m1610b()) {
            if (this.f818m || !z) {
                this.f807b.m1560a(true, z);
            } else {
                this.f807b.m1560a(false, false);
            }
            listPopupWindow.m1614d(Math.min(this.f807b.m1556a(), this.f813h));
            listPopupWindow.m1611c();
            if (this.f806a != null) {
                this.f806a.m902a(true);
            }
            listPopupWindow.m1618g().setContentDescription(getContext().getString(C0273h.abc_activitychooserview_choose_application));
        }
    }

    private C0339e getListPopupWindow() {
        if (this.f816k == null) {
            this.f816k = new C0339e(getContext());
            this.f816k.mo266a(this.f807b);
            this.f816k.m1604a((View) this);
            this.f816k.m1608a(true);
            this.f816k.m1605a(this.f808c);
            this.f816k.m1607a(this.f808c);
        }
        return this.f816k;
    }

    public boolean m1576a() {
        if (m1578c() || !this.f820o) {
            return false;
        }
        this.f818m = false;
        m1567a(this.f819n);
        return true;
    }

    public boolean m1577b() {
        if (m1578c()) {
            getListPopupWindow().m1601a();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f815j);
            }
        }
        return true;
    }

    public boolean m1578c() {
        return getListPopupWindow().m1610b();
    }

    public C0351d getDataModel() {
        return this.f807b.m1563d();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0351d d = this.f807b.m1563d();
        if (d != null) {
            d.registerObserver(this.f814i);
        }
        this.f820o = true;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0351d d = this.f807b.m1563d();
        if (d != null) {
            d.unregisterObserver(this.f814i);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f815j);
        }
        if (m1578c()) {
            m1577b();
        }
        this.f820o = false;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f809d.layout(0, 0, i3 - i, i4 - i2);
        if (!m1578c()) {
            m1577b();
        }
    }

    protected void onMeasure(int i, int i2) {
        View view = this.f809d;
        if (this.f812g.getVisibility() != 0) {
            i2 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(C0351d c0351d) {
        this.f807b.m1558a(c0351d);
        if (m1578c()) {
            m1577b();
            m1576a();
        }
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f821p = i;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f811f.setContentDescription(getContext().getString(i));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f811f.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i) {
        this.f819n = i;
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.f817l = onDismissListener;
    }

    public void setProvider(C0174d c0174d) {
        this.f806a = c0174d;
    }
}
