package android.support.v7.internal.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.p000a.C0000a;
import android.support.v4.p003c.p004a.C0068a;
import android.support.v4.view.C0174d;
import android.support.v7.p010b.C0275a.C0267b;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class C0301e implements C0068a {
    private static final int[] f590d = new int[]{1, 4, 5, 3, 2, 0};
    CharSequence f591a;
    Drawable f592b;
    View f593c;
    private final Context f594e;
    private final Resources f595f;
    private boolean f596g;
    private boolean f597h;
    private C0300a f598i;
    private ArrayList<C0303f> f599j;
    private ArrayList<C0303f> f600k;
    private boolean f601l;
    private ArrayList<C0303f> f602m;
    private ArrayList<C0303f> f603n;
    private boolean f604o;
    private int f605p = 0;
    private ContextMenuInfo f606q;
    private boolean f607r = false;
    private boolean f608s = false;
    private boolean f609t = false;
    private boolean f610u = false;
    private ArrayList<C0303f> f611v = new ArrayList();
    private CopyOnWriteArrayList<WeakReference<C0296j>> f612w = new CopyOnWriteArrayList();
    private C0303f f613x;
    private boolean f614y;

    public interface C0293b {
        boolean mo211a(C0303f c0303f);
    }

    public interface C0300a {
        void mo297a(C0301e c0301e);

        boolean mo298a(C0301e c0301e, MenuItem menuItem);
    }

    public C0301e(Context context) {
        this.f594e = context;
        this.f595f = context.getResources();
        this.f599j = new ArrayList();
        this.f600k = new ArrayList();
        this.f601l = true;
        this.f602m = new ArrayList();
        this.f603n = new ArrayList();
        this.f604o = true;
        m1348d(true);
    }

    private static int m1340a(ArrayList<C0303f> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0303f) arrayList.get(size)).m1397c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    private C0303f m1341a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0303f(this, i, i2, i3, i4, charSequence, i5);
    }

    private MenuItem m1342a(int i, int i2, int i3, CharSequence charSequence) {
        int c = C0301e.m1346c(i3);
        MenuItem a = m1341a(i, i2, i3, c, charSequence, this.f605p);
        if (this.f606q != null) {
            a.m1392a(this.f606q);
        }
        this.f599j.add(C0301e.m1340a(this.f599j, c), a);
        m1367b(true);
        return a;
    }

    private void m1343a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources c = m1369c();
        if (view != null) {
            this.f593c = view;
            this.f591a = null;
            this.f592b = null;
        } else {
            if (i > 0) {
                this.f591a = c.getText(i);
            } else if (charSequence != null) {
                this.f591a = charSequence;
            }
            if (i2 > 0) {
                this.f592b = C0000a.m0a(m1371d(), i2);
            } else if (drawable != null) {
                this.f592b = drawable;
            }
            this.f593c = null;
        }
        m1367b(false);
    }

    private void m1344a(int i, boolean z) {
        if (i >= 0 && i < this.f599j.size()) {
            this.f599j.remove(i);
            if (z) {
                m1367b(true);
            }
        }
    }

    private boolean m1345a(C0316n c0316n, C0296j c0296j) {
        boolean z = false;
        if (this.f612w.isEmpty()) {
            return false;
        }
        if (c0296j != null) {
            z = c0296j.mo226a(c0316n);
        }
        Iterator it = this.f612w.iterator();
        boolean z2 = z;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0296j c0296j2 = (C0296j) weakReference.get();
            if (c0296j2 == null) {
                this.f612w.remove(weakReference);
                z = z2;
            } else {
                z = !z2 ? c0296j2.mo226a(c0316n) : z2;
            }
            z2 = z;
        }
        return z2;
    }

    private static int m1346c(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0 && i2 < f590d.length) {
            return (f590d[i2] << 16) | (65535 & i);
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void m1347c(boolean z) {
        if (!this.f612w.isEmpty()) {
            m1374f();
            Iterator it = this.f612w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0296j c0296j = (C0296j) weakReference.get();
                if (c0296j == null) {
                    this.f612w.remove(weakReference);
                } else {
                    c0296j.mo227b(z);
                }
            }
            m1375g();
        }
    }

    private void m1348d(boolean z) {
        boolean z2 = true;
        if (!(z && this.f595f.getConfiguration().keyboard != 1 && this.f595f.getBoolean(C0267b.abc_config_showMenuShortcutsWhenKeyboardPresent))) {
            z2 = false;
        }
        this.f597h = z2;
    }

    public int m1349a(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0303f) this.f599j.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public int m1350a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        for (int i3 = i2; i3 < size; i3++) {
            if (((C0303f) this.f599j.get(i3)).getGroupId() == i) {
                return i3;
            }
        }
        return -1;
    }

    protected C0301e m1351a(Drawable drawable) {
        m1343a(0, null, 0, drawable, null);
        return this;
    }

    protected C0301e m1352a(View view) {
        m1343a(0, null, 0, null, view);
        return this;
    }

    protected C0301e m1353a(CharSequence charSequence) {
        m1343a(0, charSequence, 0, null, null);
        return this;
    }

    C0303f m1354a(int i, KeyEvent keyEvent) {
        List list = this.f611v;
        list.clear();
        m1359a(list, i, keyEvent);
        if (list.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = list.size();
        if (size == 1) {
            return (C0303f) list.get(0);
        }
        boolean a = mo245a();
        for (int i2 = 0; i2 < size; i2++) {
            C0303f c0303f = (C0303f) list.get(i2);
            char alphabeticShortcut = a ? c0303f.getAlphabeticShortcut() : c0303f.getNumericShortcut();
            if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return c0303f;
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return c0303f;
            }
            if (a && alphabeticShortcut == '\b' && i == 67) {
                return c0303f;
            }
        }
        return null;
    }

    public void mo244a(C0300a c0300a) {
        this.f598i = c0300a;
    }

    void m1356a(C0303f c0303f) {
        this.f601l = true;
        m1367b(true);
    }

    public void m1357a(C0296j c0296j, Context context) {
        this.f612w.add(new WeakReference(c0296j));
        c0296j.mo223a(context, this);
        this.f604o = true;
    }

    void m1358a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f599j.size();
        for (int i = 0; i < size; i++) {
            MenuItem menuItem2 = (C0303f) this.f599j.get(i);
            if (menuItem2.getGroupId() == groupId && menuItem2.m1404g() && menuItem2.isCheckable()) {
                menuItem2.m1395b(menuItem2 == menuItem);
            }
        }
    }

    void m1359a(List<C0303f> list, int i, KeyEvent keyEvent) {
        boolean a = mo245a();
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f599j.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0303f c0303f = (C0303f) this.f599j.get(i2);
                if (c0303f.hasSubMenu()) {
                    ((C0301e) c0303f.getSubMenu()).m1359a((List) list, i, keyEvent);
                }
                char alphabeticShortcut = a ? c0303f.getAlphabeticShortcut() : c0303f.getNumericShortcut();
                if ((metaState & 5) == 0 && alphabeticShortcut != '\u0000' && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (a && alphabeticShortcut == '\b' && i == 67)) && c0303f.isEnabled())) {
                    list.add(c0303f);
                }
            }
        }
    }

    public final void m1360a(boolean z) {
        if (!this.f610u) {
            this.f610u = true;
            Iterator it = this.f612w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0296j c0296j = (C0296j) weakReference.get();
                if (c0296j == null) {
                    this.f612w.remove(weakReference);
                } else {
                    c0296j.mo224a(this, z);
                }
            }
            this.f610u = false;
        }
    }

    boolean mo245a() {
        return this.f596g;
    }

    boolean mo246a(C0301e c0301e, MenuItem menuItem) {
        return this.f598i != null && this.f598i.mo298a(c0301e, menuItem);
    }

    public boolean m1363a(MenuItem menuItem, int i) {
        return m1364a(menuItem, null, i);
    }

    public boolean m1364a(MenuItem menuItem, C0296j c0296j, int i) {
        C0303f c0303f = (C0303f) menuItem;
        if (c0303f == null || !c0303f.isEnabled()) {
            return false;
        }
        boolean b = c0303f.m1396b();
        C0174d a = c0303f.mo214a();
        boolean z = a != null && a.mo234e();
        boolean expandActionView;
        if (c0303f.m1411n()) {
            expandActionView = c0303f.expandActionView() | b;
            if (!expandActionView) {
                return expandActionView;
            }
            m1360a(true);
            return expandActionView;
        } else if (c0303f.hasSubMenu() || z) {
            m1360a(false);
            if (!c0303f.hasSubMenu()) {
                c0303f.m1391a(new C0316n(m1371d(), this, c0303f));
            }
            C0316n c0316n = (C0316n) c0303f.getSubMenu();
            if (z) {
                a.mo232a((SubMenu) c0316n);
            }
            expandActionView = m1345a(c0316n, c0296j) | b;
            if (expandActionView) {
                return expandActionView;
            }
            m1360a(true);
            return expandActionView;
        } else {
            if ((i & 1) == 0) {
                m1360a(true);
            }
            return b;
        }
    }

    public MenuItem add(int i) {
        return m1342a(0, 0, 0, this.f595f.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m1342a(i, i2, i3, this.f595f.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m1342a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return m1342a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f594e.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f595f.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f595f.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0303f c0303f = (C0303f) m1342a(i, i2, i3, charSequence);
        C0316n c0316n = new C0316n(this.f594e, this, c0303f);
        c0303f.m1391a(c0316n);
        return c0316n;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public int m1365b(int i) {
        return m1350a(i, 0);
    }

    void m1366b(C0303f c0303f) {
        this.f604o = true;
        m1367b(true);
    }

    public void m1367b(boolean z) {
        if (this.f607r) {
            this.f608s = true;
            return;
        }
        if (z) {
            this.f601l = true;
            this.f604o = true;
        }
        m1347c(z);
    }

    public boolean mo247b() {
        return this.f597h;
    }

    Resources m1369c() {
        return this.f595f;
    }

    public boolean mo248c(C0303f c0303f) {
        boolean z = false;
        if (!this.f612w.isEmpty()) {
            m1374f();
            Iterator it = this.f612w.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0296j c0296j = (C0296j) weakReference.get();
                if (c0296j == null) {
                    this.f612w.remove(weakReference);
                    z = z2;
                } else {
                    z = c0296j.mo225a(this, c0303f);
                    if (z) {
                        break;
                    }
                }
                z2 = z;
            }
            z = z2;
            m1375g();
            if (z) {
                this.f613x = c0303f;
            }
        }
        return z;
    }

    public void clear() {
        if (this.f613x != null) {
            mo249d(this.f613x);
        }
        this.f599j.clear();
        m1367b(true);
    }

    public void clearHeader() {
        this.f592b = null;
        this.f591a = null;
        this.f593c = null;
        m1367b(false);
    }

    public void close() {
        m1360a(true);
    }

    public Context m1371d() {
        return this.f594e;
    }

    public boolean mo249d(C0303f c0303f) {
        boolean z = false;
        if (!this.f612w.isEmpty() && this.f613x == c0303f) {
            m1374f();
            Iterator it = this.f612w.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0296j c0296j = (C0296j) weakReference.get();
                if (c0296j == null) {
                    this.f612w.remove(weakReference);
                    z = z2;
                } else {
                    z = c0296j.mo229b(this, c0303f);
                    if (z) {
                        break;
                    }
                }
                z2 = z;
            }
            z = z2;
            m1375g();
            if (z) {
                this.f613x = null;
            }
        }
        return z;
    }

    public void m1373e() {
        if (this.f598i != null) {
            this.f598i.mo297a(this);
        }
    }

    public void m1374f() {
        if (!this.f607r) {
            this.f607r = true;
            this.f608s = false;
        }
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0303f c0303f = (C0303f) this.f599j.get(i2);
            if (c0303f.getItemId() == i) {
                return c0303f;
            }
            if (c0303f.hasSubMenu()) {
                MenuItem findItem = c0303f.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    public void m1375g() {
        this.f607r = false;
        if (this.f608s) {
            this.f608s = false;
            m1367b(true);
        }
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f599j.get(i);
    }

    public ArrayList<C0303f> m1376h() {
        if (!this.f601l) {
            return this.f600k;
        }
        this.f600k.clear();
        int size = this.f599j.size();
        for (int i = 0; i < size; i++) {
            C0303f c0303f = (C0303f) this.f599j.get(i);
            if (c0303f.isVisible()) {
                this.f600k.add(c0303f);
            }
        }
        this.f601l = false;
        this.f604o = true;
        return this.f600k;
    }

    public boolean hasVisibleItems() {
        if (this.f614y) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0303f) this.f599j.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void m1377i() {
        ArrayList h = m1376h();
        if (this.f604o) {
            Iterator it = this.f612w.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2;
                WeakReference weakReference = (WeakReference) it.next();
                C0296j c0296j = (C0296j) weakReference.get();
                if (c0296j == null) {
                    this.f612w.remove(weakReference);
                    i2 = i;
                } else {
                    i2 = c0296j.mo228b() | i;
                }
                i = i2;
            }
            if (i != 0) {
                this.f602m.clear();
                this.f603n.clear();
                i = h.size();
                for (int i3 = 0; i3 < i; i3++) {
                    C0303f c0303f = (C0303f) h.get(i3);
                    if (c0303f.m1407j()) {
                        this.f602m.add(c0303f);
                    } else {
                        this.f603n.add(c0303f);
                    }
                }
            } else {
                this.f602m.clear();
                this.f603n.clear();
                this.f603n.addAll(m1376h());
            }
            this.f604o = false;
        }
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m1354a(i, keyEvent) != null;
    }

    public ArrayList<C0303f> m1378j() {
        m1377i();
        return this.f602m;
    }

    public ArrayList<C0303f> m1379k() {
        m1377i();
        return this.f603n;
    }

    public C0301e mo250l() {
        return this;
    }

    boolean m1381m() {
        return this.f609t;
    }

    public C0303f m1382n() {
        return this.f613x;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return m1363a(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItem a = m1354a(i, keyEvent);
        boolean z = false;
        if (a != null) {
            z = m1363a(a, i2);
        }
        if ((i2 & 2) != 0) {
            m1360a(true);
        }
        return z;
    }

    public void removeGroup(int i) {
        int b = m1365b(i);
        if (b >= 0) {
            int size = this.f599j.size() - b;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((C0303f) this.f599j.get(b)).getGroupId() != i) {
                    m1367b(true);
                } else {
                    m1344a(b, false);
                    i2 = i3;
                }
            }
            m1367b(true);
        }
    }

    public void removeItem(int i) {
        m1344a(m1349a(i), true);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f599j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0303f c0303f = (C0303f) this.f599j.get(i2);
            if (c0303f.getGroupId() == i) {
                c0303f.m1393a(z2);
                c0303f.setCheckable(z);
            }
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f599j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0303f c0303f = (C0303f) this.f599j.get(i2);
            if (c0303f.getGroupId() == i) {
                c0303f.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f599j.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            C0303f c0303f = (C0303f) this.f599j.get(i2);
            boolean z3 = (c0303f.getGroupId() == i && c0303f.m1398c(z)) ? true : z2;
            i2++;
            z2 = z3;
        }
        if (z2) {
            m1367b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f596g = z;
        m1367b(false);
    }

    public int size() {
        return this.f599j.size();
    }
}
