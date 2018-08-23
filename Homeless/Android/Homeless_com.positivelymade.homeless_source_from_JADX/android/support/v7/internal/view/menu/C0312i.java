package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.internal.view.menu.C0294k.C0291a;
import android.support.v7.internal.view.menu.C0296j.C0313a;
import android.support.v7.p010b.C0275a.C0266a;
import android.support.v7.p010b.C0275a.C0268c;
import android.support.v7.p010b.C0275a.C0272g;
import android.support.v7.widget.C0339e;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import java.util.ArrayList;

public class C0312i implements C0296j, OnKeyListener, OnGlobalLayoutListener, OnItemClickListener, OnDismissListener {
    static final int f653a = C0272g.abc_popup_menu_item_layout;
    boolean f654b;
    private final Context f655c;
    private final LayoutInflater f656d;
    private final C0301e f657e;
    private final C0311a f658f;
    private final boolean f659g;
    private final int f660h;
    private final int f661i;
    private final int f662j;
    private View f663k;
    private C0339e f664l;
    private ViewTreeObserver f665m;
    private C0313a f666n;
    private ViewGroup f667o;
    private boolean f668p;
    private int f669q;
    private int f670r;

    private class C0311a extends BaseAdapter {
        final /* synthetic */ C0312i f650a;
        private C0301e f651b;
        private int f652c = -1;

        public C0311a(C0312i c0312i, C0301e c0301e) {
            this.f650a = c0312i;
            this.f651b = c0301e;
            m1430a();
        }

        public C0303f m1429a(int i) {
            ArrayList k = this.f650a.f659g ? this.f651b.m1379k() : this.f651b.m1376h();
            if (this.f652c >= 0 && i >= this.f652c) {
                i++;
            }
            return (C0303f) k.get(i);
        }

        void m1430a() {
            C0303f n = this.f650a.f657e.m1382n();
            if (n != null) {
                ArrayList k = this.f650a.f657e.m1379k();
                int size = k.size();
                for (int i = 0; i < size; i++) {
                    if (((C0303f) k.get(i)) == n) {
                        this.f652c = i;
                        return;
                    }
                }
            }
            this.f652c = -1;
        }

        public int getCount() {
            ArrayList k = this.f650a.f659g ? this.f651b.m1379k() : this.f651b.m1376h();
            return this.f652c < 0 ? k.size() : k.size() - 1;
        }

        public /* synthetic */ Object getItem(int i) {
            return m1429a(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = view == null ? this.f650a.f656d.inflate(C0312i.f653a, viewGroup, false) : view;
            C0291a c0291a = (C0291a) inflate;
            if (this.f650a.f654b) {
                ((ListMenuItemView) inflate).setForceShowIcon(true);
            }
            c0291a.mo205a(m1429a(i), 0);
            return inflate;
        }

        public void notifyDataSetChanged() {
            m1430a();
            super.notifyDataSetChanged();
        }
    }

    public C0312i(Context context, C0301e c0301e, View view) {
        this(context, c0301e, view, false, C0266a.popupMenuStyle);
    }

    public C0312i(Context context, C0301e c0301e, View view, boolean z, int i) {
        this(context, c0301e, view, z, i, 0);
    }

    public C0312i(Context context, C0301e c0301e, View view, boolean z, int i, int i2) {
        this.f670r = 0;
        this.f655c = context;
        this.f656d = LayoutInflater.from(context);
        this.f657e = c0301e;
        this.f658f = new C0311a(this, this.f657e);
        this.f659g = z;
        this.f661i = i;
        this.f662j = i2;
        Resources resources = context.getResources();
        this.f660h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0268c.abc_config_prefDialogWidth));
        this.f663k = view;
        c0301e.m1357a((C0296j) this, context);
    }

    private int m1434g() {
        ListAdapter listAdapter = this.f658f;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i = 0;
        int i2 = 0;
        View view = null;
        int i3 = 0;
        while (i < count) {
            View view2;
            int itemViewType = listAdapter.getItemViewType(i);
            if (itemViewType != i2) {
                i2 = itemViewType;
                view2 = null;
            } else {
                view2 = view;
            }
            if (this.f667o == null) {
                this.f667o = new FrameLayout(this.f655c);
            }
            view = listAdapter.getView(i, view2, this.f667o);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            itemViewType = view.getMeasuredWidth();
            if (itemViewType >= this.f660h) {
                return this.f660h;
            }
            if (itemViewType <= i3) {
                itemViewType = i3;
            }
            i++;
            i3 = itemViewType;
        }
        return i3;
    }

    public void m1435a() {
        if (!m1448d()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void m1436a(int i) {
        this.f670r = i;
    }

    public void mo223a(Context context, C0301e c0301e) {
    }

    public void mo224a(C0301e c0301e, boolean z) {
        if (c0301e == this.f657e) {
            m1449e();
            if (this.f666n != null) {
                this.f666n.mo295a(c0301e, z);
            }
        }
    }

    public void m1439a(C0313a c0313a) {
        this.f666n = c0313a;
    }

    public void m1440a(View view) {
        this.f663k = view;
    }

    public void m1441a(boolean z) {
        this.f654b = z;
    }

    public boolean mo225a(C0301e c0301e, C0303f c0303f) {
        return false;
    }

    public boolean mo226a(C0316n c0316n) {
        if (c0316n.hasVisibleItems()) {
            boolean z;
            C0312i c0312i = new C0312i(this.f655c, c0316n, this.f663k);
            c0312i.m1439a(this.f666n);
            int size = c0316n.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = c0316n.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
            }
            z = false;
            c0312i.m1441a(z);
            if (c0312i.m1448d()) {
                if (this.f666n == null) {
                    return true;
                }
                this.f666n.mo296a(c0316n);
                return true;
            }
        }
        return false;
    }

    public void mo227b(boolean z) {
        this.f668p = false;
        if (this.f658f != null) {
            this.f658f.notifyDataSetChanged();
        }
    }

    public boolean mo228b() {
        return false;
    }

    public boolean mo229b(C0301e c0301e, C0303f c0303f) {
        return false;
    }

    public C0339e m1447c() {
        return this.f664l;
    }

    public boolean m1448d() {
        boolean z = false;
        this.f664l = new C0339e(this.f655c, null, this.f661i, this.f662j);
        this.f664l.m1607a((OnDismissListener) this);
        this.f664l.m1605a((OnItemClickListener) this);
        this.f664l.mo266a(this.f658f);
        this.f664l.m1608a(true);
        View view = this.f663k;
        if (view == null) {
            return false;
        }
        if (this.f665m == null) {
            z = true;
        }
        this.f665m = view.getViewTreeObserver();
        if (z) {
            this.f665m.addOnGlobalLayoutListener(this);
        }
        this.f664l.m1604a(view);
        this.f664l.m1609b(this.f670r);
        if (!this.f668p) {
            this.f669q = m1434g();
            this.f668p = true;
        }
        this.f664l.m1614d(this.f669q);
        this.f664l.m1616e(2);
        this.f664l.m1611c();
        this.f664l.m1618g().setOnKeyListener(this);
        return true;
    }

    public void m1449e() {
        if (m1450f()) {
            this.f664l.m1601a();
        }
    }

    public boolean m1450f() {
        return this.f664l != null && this.f664l.m1610b();
    }

    public void onDismiss() {
        this.f664l = null;
        this.f657e.close();
        if (this.f665m != null) {
            if (!this.f665m.isAlive()) {
                this.f665m = this.f663k.getViewTreeObserver();
            }
            this.f665m.removeGlobalOnLayoutListener(this);
            this.f665m = null;
        }
    }

    public void onGlobalLayout() {
        if (m1450f()) {
            View view = this.f663k;
            if (view == null || !view.isShown()) {
                m1449e();
            } else if (m1450f()) {
                this.f664l.m1611c();
            }
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0311a c0311a = this.f658f;
        c0311a.f651b.m1363a(c0311a.m1429a(i), 0);
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        m1449e();
        return true;
    }
}
