package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.p003c.p004a.C0069b;
import android.support.v4.p003c.p004a.C0070c;
import android.support.v4.p007f.C0087a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

abstract class C0299c<T> extends C0298d<T> {
    final Context f587a;
    private Map<C0069b, MenuItem> f588c;
    private Map<C0070c, SubMenu> f589d;

    C0299c(Context context, T t) {
        super(t);
        this.f587a = context;
    }

    final MenuItem m1333a(MenuItem menuItem) {
        if (!(menuItem instanceof C0069b)) {
            return menuItem;
        }
        C0069b c0069b = (C0069b) menuItem;
        if (this.f588c == null) {
            this.f588c = new C0087a();
        }
        MenuItem menuItem2 = (MenuItem) this.f588c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        menuItem2 = C0314l.m1453a(this.f587a, c0069b);
        this.f588c.put(c0069b, menuItem2);
        return menuItem2;
    }

    final SubMenu m1334a(SubMenu subMenu) {
        if (!(subMenu instanceof C0070c)) {
            return subMenu;
        }
        C0070c c0070c = (C0070c) subMenu;
        if (this.f589d == null) {
            this.f589d = new C0087a();
        }
        SubMenu subMenu2 = (SubMenu) this.f589d.get(c0070c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        subMenu2 = C0314l.m1454a(this.f587a, c0070c);
        this.f589d.put(c0070c, subMenu2);
        return subMenu2;
    }

    final void m1335a() {
        if (this.f588c != null) {
            this.f588c.clear();
        }
        if (this.f589d != null) {
            this.f589d.clear();
        }
    }

    final void m1336a(int i) {
        if (this.f588c != null) {
            Iterator it = this.f588c.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    final void m1337b(int i) {
        if (this.f588c != null) {
            Iterator it = this.f588c.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
