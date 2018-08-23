package android.support.v7.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p000a.C0000a;
import android.support.v7.internal.view.menu.C0301e.C0300a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class C0316n extends C0301e implements SubMenu {
    private C0301e f671d;
    private C0303f f672e;

    public C0316n(Context context, C0301e c0301e, C0303f c0303f) {
        super(context);
        this.f671d = c0301e;
        this.f672e = c0303f;
    }

    public void mo244a(C0300a c0300a) {
        this.f671d.mo244a(c0300a);
    }

    public boolean mo245a() {
        return this.f671d.mo245a();
    }

    boolean mo246a(C0301e c0301e, MenuItem menuItem) {
        return super.mo246a(c0301e, menuItem) || this.f671d.mo246a(c0301e, menuItem);
    }

    public boolean mo247b() {
        return this.f671d.mo247b();
    }

    public boolean mo248c(C0303f c0303f) {
        return this.f671d.mo248c(c0303f);
    }

    public boolean mo249d(C0303f c0303f) {
        return this.f671d.mo249d(c0303f);
    }

    public MenuItem getItem() {
        return this.f672e;
    }

    public C0301e mo250l() {
        return this.f671d;
    }

    public Menu m1462o() {
        return this.f671d;
    }

    public SubMenu setHeaderIcon(int i) {
        super.m1351a(C0000a.m0a(m1371d(), i));
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.m1351a(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.m1353a(m1371d().getResources().getString(i));
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.m1353a(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.m1352a(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f672e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f672e.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f671d.setQwertyMode(z);
    }
}
