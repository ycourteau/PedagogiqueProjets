package android.support.v7.internal.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.p003c.p004a.C0068a;
import android.support.v4.view.C0174d;
import android.support.v4.view.C0206p;
import android.support.v7.internal.view.menu.C0303f;
import android.support.v7.internal.view.menu.C0308g;
import android.support.v7.p010b.C0275a.C0274i;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

public class C0284b extends MenuInflater {
    private static final Class<?>[] f509a = new Class[]{Context.class};
    private static final Class<?>[] f510b = f509a;
    private final Object[] f511c;
    private final Object[] f512d = this.f511c;
    private Context f513e;
    private Object f514f;

    private static class C0282a implements OnMenuItemClickListener {
        private static final Class<?>[] f480a = new Class[]{MenuItem.class};
        private Object f481b;
        private Method f482c;

        public C0282a(Object obj, String str) {
            this.f481b = obj;
            Class cls = obj.getClass();
            try {
                this.f482c = cls.getMethod(str, f480a);
            } catch (Throwable e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f482c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f482c.invoke(this.f481b, new Object[]{menuItem})).booleanValue();
                }
                this.f482c.invoke(this.f481b, new Object[]{menuItem});
                return true;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    private class C0283b {
        final /* synthetic */ C0284b f483a;
        private Menu f484b;
        private int f485c;
        private int f486d;
        private int f487e;
        private int f488f;
        private boolean f489g;
        private boolean f490h;
        private boolean f491i;
        private int f492j;
        private int f493k;
        private CharSequence f494l;
        private CharSequence f495m;
        private int f496n;
        private char f497o;
        private char f498p;
        private int f499q;
        private boolean f500r;
        private boolean f501s;
        private boolean f502t;
        private int f503u;
        private int f504v;
        private String f505w;
        private String f506x;
        private String f507y;
        private C0174d f508z;

        public C0283b(C0284b c0284b, Menu menu) {
            this.f483a = c0284b;
            this.f484b = menu;
            m1241a();
        }

        private char m1237a(String str) {
            return str == null ? '\u0000' : str.charAt(0);
        }

        private <T> T m1239a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                return this.f483a.f513e.getClassLoader().loadClass(str).getConstructor(clsArr).newInstance(objArr);
            } catch (Throwable e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        private void m1240a(MenuItem menuItem) {
            boolean z = true;
            menuItem.setChecked(this.f500r).setVisible(this.f501s).setEnabled(this.f502t).setCheckable(this.f499q >= 1).setTitleCondensed(this.f495m).setIcon(this.f496n).setAlphabeticShortcut(this.f497o).setNumericShortcut(this.f498p);
            if (this.f503u >= 0) {
                C0206p.m962a(menuItem, this.f503u);
            }
            if (this.f507y != null) {
                if (this.f483a.f513e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new C0282a(this.f483a.m1253c(), this.f507y));
            }
            if (menuItem instanceof C0303f) {
                C0303f c0303f = (C0303f) menuItem;
            }
            if (this.f499q >= 2) {
                if (menuItem instanceof C0303f) {
                    ((C0303f) menuItem).m1393a(true);
                } else if (menuItem instanceof C0308g) {
                    ((C0308g) menuItem).m1422a(true);
                }
            }
            if (this.f505w != null) {
                C0206p.m961a(menuItem, (View) m1239a(this.f505w, C0284b.f509a, this.f483a.f511c));
            } else {
                z = false;
            }
            if (this.f504v > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    C0206p.m964b(menuItem, this.f504v);
                }
            }
            if (this.f508z != null) {
                C0206p.m960a(menuItem, this.f508z);
            }
        }

        public void m1241a() {
            this.f485c = 0;
            this.f486d = 0;
            this.f487e = 0;
            this.f488f = 0;
            this.f489g = true;
            this.f490h = true;
        }

        public void m1242a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = this.f483a.f513e.obtainStyledAttributes(attributeSet, C0274i.MenuGroup);
            this.f485c = obtainStyledAttributes.getResourceId(C0274i.MenuGroup_android_id, 0);
            this.f486d = obtainStyledAttributes.getInt(C0274i.MenuGroup_android_menuCategory, 0);
            this.f487e = obtainStyledAttributes.getInt(C0274i.MenuGroup_android_orderInCategory, 0);
            this.f488f = obtainStyledAttributes.getInt(C0274i.MenuGroup_android_checkableBehavior, 0);
            this.f489g = obtainStyledAttributes.getBoolean(C0274i.MenuGroup_android_visible, true);
            this.f490h = obtainStyledAttributes.getBoolean(C0274i.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public void m1243b() {
            this.f491i = true;
            m1240a(this.f484b.add(this.f485c, this.f492j, this.f493k, this.f494l));
        }

        public void m1244b(AttributeSet attributeSet) {
            boolean z = true;
            TypedArray obtainStyledAttributes = this.f483a.f513e.obtainStyledAttributes(attributeSet, C0274i.MenuItem);
            this.f492j = obtainStyledAttributes.getResourceId(C0274i.MenuItem_android_id, 0);
            this.f493k = (obtainStyledAttributes.getInt(C0274i.MenuItem_android_menuCategory, this.f486d) & -65536) | (obtainStyledAttributes.getInt(C0274i.MenuItem_android_orderInCategory, this.f487e) & 65535);
            this.f494l = obtainStyledAttributes.getText(C0274i.MenuItem_android_title);
            this.f495m = obtainStyledAttributes.getText(C0274i.MenuItem_android_titleCondensed);
            this.f496n = obtainStyledAttributes.getResourceId(C0274i.MenuItem_android_icon, 0);
            this.f497o = m1237a(obtainStyledAttributes.getString(C0274i.MenuItem_android_alphabeticShortcut));
            this.f498p = m1237a(obtainStyledAttributes.getString(C0274i.MenuItem_android_numericShortcut));
            if (obtainStyledAttributes.hasValue(C0274i.MenuItem_android_checkable)) {
                this.f499q = obtainStyledAttributes.getBoolean(C0274i.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f499q = this.f488f;
            }
            this.f500r = obtainStyledAttributes.getBoolean(C0274i.MenuItem_android_checked, false);
            this.f501s = obtainStyledAttributes.getBoolean(C0274i.MenuItem_android_visible, this.f489g);
            this.f502t = obtainStyledAttributes.getBoolean(C0274i.MenuItem_android_enabled, this.f490h);
            this.f503u = obtainStyledAttributes.getInt(C0274i.MenuItem_showAsAction, -1);
            this.f507y = obtainStyledAttributes.getString(C0274i.MenuItem_android_onClick);
            this.f504v = obtainStyledAttributes.getResourceId(C0274i.MenuItem_actionLayout, 0);
            this.f505w = obtainStyledAttributes.getString(C0274i.MenuItem_actionViewClass);
            this.f506x = obtainStyledAttributes.getString(C0274i.MenuItem_actionProviderClass);
            if (this.f506x == null) {
                z = false;
            }
            if (z && this.f504v == 0 && this.f505w == null) {
                this.f508z = (C0174d) m1239a(this.f506x, C0284b.f510b, this.f483a.f512d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f508z = null;
            }
            obtainStyledAttributes.recycle();
            this.f491i = false;
        }

        public SubMenu m1245c() {
            this.f491i = true;
            SubMenu addSubMenu = this.f484b.addSubMenu(this.f485c, this.f492j, this.f493k, this.f494l);
            m1240a(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean m1246d() {
            return this.f491i;
        }
    }

    public C0284b(Context context) {
        super(context);
        this.f513e = context;
        this.f511c = new Object[]{context};
    }

    private Object m1248a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m1248a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1249a(org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.view.Menu r13) {
        /*
        r10 = this;
        r4 = 0;
        r1 = 1;
        r6 = 0;
        r7 = new android.support.v7.internal.view.b$b;
        r7.<init>(r10, r13);
        r0 = r11.getEventType();
    L_0x000c:
        r2 = 2;
        if (r0 != r2) goto L_0x004a;
    L_0x000f:
        r0 = r11.getName();
        r2 = "menu";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0031;
    L_0x001b:
        r0 = r11.next();
    L_0x001f:
        r2 = r4;
        r5 = r6;
        r3 = r0;
        r0 = r6;
    L_0x0023:
        if (r0 != 0) goto L_0x00e1;
    L_0x0025:
        switch(r3) {
            case 1: goto L_0x00d9;
            case 2: goto L_0x0051;
            case 3: goto L_0x0087;
            default: goto L_0x0028;
        };
    L_0x0028:
        r3 = r5;
    L_0x0029:
        r5 = r11.next();
        r9 = r3;
        r3 = r5;
        r5 = r9;
        goto L_0x0023;
    L_0x0031:
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Expecting menu, got ";
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x004a:
        r0 = r11.next();
        if (r0 != r1) goto L_0x000c;
    L_0x0050:
        goto L_0x001f;
    L_0x0051:
        if (r5 == 0) goto L_0x0055;
    L_0x0053:
        r3 = r5;
        goto L_0x0029;
    L_0x0055:
        r3 = r11.getName();
        r8 = "group";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x0066;
    L_0x0061:
        r7.m1242a(r12);
        r3 = r5;
        goto L_0x0029;
    L_0x0066:
        r8 = "item";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x0073;
    L_0x006e:
        r7.m1244b(r12);
        r3 = r5;
        goto L_0x0029;
    L_0x0073:
        r8 = "menu";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x0084;
    L_0x007b:
        r3 = r7.m1245c();
        r10.m1249a(r11, r12, r3);
        r3 = r5;
        goto L_0x0029;
    L_0x0084:
        r2 = r3;
        r3 = r1;
        goto L_0x0029;
    L_0x0087:
        r3 = r11.getName();
        if (r5 == 0) goto L_0x0096;
    L_0x008d:
        r8 = r3.equals(r2);
        if (r8 == 0) goto L_0x0096;
    L_0x0093:
        r2 = r4;
        r3 = r6;
        goto L_0x0029;
    L_0x0096:
        r8 = "group";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x00a3;
    L_0x009e:
        r7.m1241a();
        r3 = r5;
        goto L_0x0029;
    L_0x00a3:
        r8 = "item";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x00cd;
    L_0x00ab:
        r3 = r7.m1246d();
        if (r3 != 0) goto L_0x0028;
    L_0x00b1:
        r3 = r7.f508z;
        if (r3 == 0) goto L_0x00c7;
    L_0x00b7:
        r3 = r7.f508z;
        r3 = r3.mo234e();
        if (r3 == 0) goto L_0x00c7;
    L_0x00c1:
        r7.m1245c();
        r3 = r5;
        goto L_0x0029;
    L_0x00c7:
        r7.m1243b();
        r3 = r5;
        goto L_0x0029;
    L_0x00cd:
        r8 = "menu";
        r3 = r3.equals(r8);
        if (r3 == 0) goto L_0x0028;
    L_0x00d5:
        r0 = r1;
        r3 = r5;
        goto L_0x0029;
    L_0x00d9:
        r0 = new java.lang.RuntimeException;
        r1 = "Unexpected end of document";
        r0.<init>(r1);
        throw r0;
    L_0x00e1:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.internal.view.b.a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    private Object m1253c() {
        if (this.f514f == null) {
            this.f514f = m1248a(this.f513e);
        }
        return this.f514f;
    }

    public void inflate(int i, Menu menu) {
        if (menu instanceof C0068a) {
            XmlResourceParser xmlResourceParser = null;
            try {
                xmlResourceParser = this.f513e.getResources().getLayout(i);
                m1249a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            } catch (Throwable e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (Throwable e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (Throwable th) {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            }
        } else {
            super.inflate(i, menu);
        }
    }
}
