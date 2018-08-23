package android.support.v7.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p003c.p004a.C0070c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

class C0317o extends C0315m implements SubMenu {
    C0317o(Context context, C0070c c0070c) {
        super(context, c0070c);
    }

    public C0070c m1463b() {
        return (C0070c) this.b;
    }

    public void clearHeader() {
        m1463b().clearHeader();
    }

    public MenuItem getItem() {
        return m1333a(m1463b().getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        m1463b().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        m1463b().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        m1463b().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m1463b().setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        m1463b().setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        m1463b().setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        m1463b().setIcon(drawable);
        return this;
    }
}
