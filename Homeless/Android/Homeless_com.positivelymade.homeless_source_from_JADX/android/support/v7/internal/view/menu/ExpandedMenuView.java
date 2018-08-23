package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v7.internal.view.menu.C0301e.C0293b;
import android.support.v7.internal.widget.C0377q;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements C0293b, C0294k, OnItemClickListener {
    private static final int[] f546a = new int[]{16842964, 16843049};
    private C0301e f547b;
    private int f548c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0377q a = C0377q.m1724a(context, attributeSet, f546a, i, 0);
        if (a.m1737d(0)) {
            setBackgroundDrawable(a.m1728a(0));
        }
        if (a.m1737d(1)) {
            setDivider(a.m1728a(1));
        }
        a.m1732b();
    }

    public void mo210a(C0301e c0301e) {
        this.f547b = c0301e;
    }

    public boolean mo211a(C0303f c0303f) {
        return this.f547b.m1363a((MenuItem) c0303f, 0);
    }

    public int getWindowAnimations() {
        return this.f548c;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo211a((C0303f) getAdapter().getItem(i));
    }
}
