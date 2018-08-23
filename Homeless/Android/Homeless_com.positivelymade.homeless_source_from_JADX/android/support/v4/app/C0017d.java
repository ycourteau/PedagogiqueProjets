package android.support.v4.app;

import android.os.Build.VERSION;
import android.support.v4.app.C0042m.C0010b;
import android.support.v4.app.C0042m.C0041a;
import android.support.v4.p007f.C0087a;
import android.support.v4.p007f.C0090d;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

final class C0017d extends C0016l implements Runnable {
    static final boolean f62a = (VERSION.SDK_INT >= 21);
    final C0034j f63b;
    C0014a f64c;
    C0014a f65d;
    int f66e;
    int f67f;
    int f68g;
    int f69h;
    int f70i;
    int f71j;
    int f72k;
    boolean f73l;
    boolean f74m = true;
    String f75n;
    boolean f76o;
    int f77p = -1;
    int f78q;
    CharSequence f79r;
    int f80s;
    CharSequence f81t;
    ArrayList<String> f82u;
    ArrayList<String> f83v;

    static final class C0014a {
        C0014a f48a;
        C0014a f49b;
        int f50c;
        C0018f f51d;
        int f52e;
        int f53f;
        int f54g;
        int f55h;
        ArrayList<C0018f> f56i;

        C0014a() {
        }
    }

    public class C0015b {
        public C0087a<String, String> f57a = new C0087a();
        public ArrayList<View> f58b = new ArrayList();
        public C0041a f59c = new C0041a();
        public View f60d;
        final /* synthetic */ C0017d f61e;

        public C0015b(C0017d c0017d) {
            this.f61e = c0017d;
        }
    }

    public C0017d(C0034j c0034j) {
        this.f63b = c0034j;
    }

    private C0015b m39a(SparseArray<C0018f> sparseArray, SparseArray<C0018f> sparseArray2, boolean z) {
        int i = 0;
        C0015b c0015b = new C0015b(this);
        c0015b.f60d = new View(this.f63b.f183o);
        int i2 = 0;
        int i3 = 0;
        while (i2 < sparseArray.size()) {
            int i4 = m60a(sparseArray.keyAt(i2), c0015b, z, (SparseArray) sparseArray, (SparseArray) sparseArray2) ? 1 : i3;
            i2++;
            i3 = i4;
        }
        while (i < sparseArray2.size()) {
            i4 = sparseArray2.keyAt(i);
            if (sparseArray.get(i4) == null && m60a(i4, c0015b, z, (SparseArray) sparseArray, (SparseArray) sparseArray2)) {
                i3 = 1;
            }
            i++;
        }
        return i3 == 0 ? null : c0015b;
    }

    private C0087a<String, View> m40a(C0015b c0015b, C0018f c0018f, boolean z) {
        C0087a c0087a = new C0087a();
        if (this.f82u != null) {
            C0042m.m302a((Map) c0087a, c0018f.m143o());
            if (z) {
                c0087a.m469a(this.f83v);
            } else {
                c0087a = C0017d.m43a(this.f82u, this.f83v, c0087a);
            }
        }
        if (z) {
            if (c0018f.ah != null) {
                c0018f.ah.m346a(this.f83v, c0087a);
            }
            m50a(c0015b, c0087a, false);
        } else {
            if (c0018f.ai != null) {
                c0018f.ai.m346a(this.f83v, c0087a);
            }
            m63b(c0015b, c0087a, false);
        }
        return c0087a;
    }

    private C0087a<String, View> m41a(C0015b c0015b, boolean z, C0018f c0018f) {
        C0087a b = m61b(c0015b, c0018f, z);
        if (z) {
            if (c0018f.ai != null) {
                c0018f.ai.m346a(this.f83v, b);
            }
            m50a(c0015b, b, true);
        } else {
            if (c0018f.ah != null) {
                c0018f.ah.m346a(this.f83v, b);
            }
            m63b(c0015b, b, true);
        }
        return b;
    }

    private static C0087a<String, View> m43a(ArrayList<String> arrayList, ArrayList<String> arrayList2, C0087a<String, View> c0087a) {
        if (c0087a.isEmpty()) {
            return c0087a;
        }
        C0087a<String, View> c0087a2 = new C0087a();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) c0087a.get(arrayList.get(i));
            if (view != null) {
                c0087a2.put(arrayList2.get(i), view);
            }
        }
        return c0087a2;
    }

    private static Object m44a(C0018f c0018f, C0018f c0018f2, boolean z) {
        if (c0018f == null || c0018f2 == null) {
            return null;
        }
        return C0042m.m290a(z ? c0018f2.m154z() : c0018f.m153y());
    }

    private static Object m45a(C0018f c0018f, boolean z) {
        if (c0018f == null) {
            return null;
        }
        return C0042m.m290a(z ? c0018f.m152x() : c0018f.m149u());
    }

    private static Object m46a(Object obj, C0018f c0018f, ArrayList<View> arrayList, C0087a<String, View> c0087a, View view) {
        return obj != null ? C0042m.m291a(obj, c0018f.m143o(), arrayList, c0087a, view) : obj;
    }

    private void m47a(int i, C0018f c0018f, String str, int i2) {
        c0018f.f88C = this.f63b;
        if (str != null) {
            if (c0018f.f94I == null || str.equals(c0018f.f94I)) {
                c0018f.f94I = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + c0018f + ": was " + c0018f.f94I + " now " + str);
            }
        }
        if (i != 0) {
            if (c0018f.f92G == 0 || c0018f.f92G == i) {
                c0018f.f92G = i;
                c0018f.f93H = i;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + c0018f + ": was " + c0018f.f92G + " now " + i);
            }
        }
        C0014a c0014a = new C0014a();
        c0014a.f50c = i2;
        c0014a.f51d = c0018f;
        m73a(c0014a);
    }

    private void m48a(C0015b c0015b, int i, Object obj) {
        if (this.f63b.f175g != null) {
            for (int i2 = 0; i2 < this.f63b.f175g.size(); i2++) {
                C0018f c0018f = (C0018f) this.f63b.f175g.get(i2);
                if (!(c0018f.f104S == null || c0018f.f103R == null || c0018f.f93H != i)) {
                    if (!c0018f.f95J) {
                        C0042m.m298a(obj, c0018f.f104S, false);
                        c0015b.f58b.remove(c0018f.f104S);
                    } else if (!c0015b.f58b.contains(c0018f.f104S)) {
                        C0042m.m298a(obj, c0018f.f104S, true);
                        c0015b.f58b.add(c0018f.f104S);
                    }
                }
            }
        }
    }

    private void m49a(C0015b c0015b, C0018f c0018f, C0018f c0018f2, boolean z, C0087a<String, View> c0087a) {
        C0048q c0048q = z ? c0018f2.ah : c0018f.ah;
        if (c0048q != null) {
            c0048q.m347b(new ArrayList(c0087a.keySet()), new ArrayList(c0087a.values()), null);
        }
    }

    private void m50a(C0015b c0015b, C0087a<String, View> c0087a, boolean z) {
        int size = this.f83v == null ? 0 : this.f83v.size();
        for (int i = 0; i < size; i++) {
            String str = (String) this.f82u.get(i);
            View view = (View) c0087a.get((String) this.f83v.get(i));
            if (view != null) {
                String a = C0042m.m293a(view);
                if (z) {
                    C0017d.m57a(c0015b.f57a, str, a);
                } else {
                    C0017d.m57a(c0015b.f57a, a, str);
                }
            }
        }
    }

    private void m51a(C0015b c0015b, View view, Object obj, C0018f c0018f, C0018f c0018f2, boolean z, ArrayList<View> arrayList) {
        final View view2 = view;
        final Object obj2 = obj;
        final ArrayList<View> arrayList2 = arrayList;
        final C0015b c0015b2 = c0015b;
        final boolean z2 = z;
        final C0018f c0018f3 = c0018f;
        final C0018f c0018f4 = c0018f2;
        view.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener(this) {
            final /* synthetic */ C0017d f42h;

            public boolean onPreDraw() {
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                if (obj2 != null) {
                    C0042m.m300a(obj2, arrayList2);
                    arrayList2.clear();
                    C0087a a = this.f42h.m41a(c0015b2, z2, c0018f3);
                    arrayList2.add(c0015b2.f60d);
                    arrayList2.addAll(a.values());
                    C0042m.m306b(obj2, arrayList2);
                    this.f42h.m56a(a, c0015b2);
                    this.f42h.m49a(c0015b2, c0018f3, c0018f4, z2, a);
                }
                return true;
            }
        });
    }

    private static void m52a(C0015b c0015b, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                C0017d.m57a(c0015b.f57a, (String) arrayList.get(i), (String) arrayList2.get(i));
            }
        }
    }

    private void m56a(C0087a<String, View> c0087a, C0015b c0015b) {
        if (this.f83v != null && !c0087a.isEmpty()) {
            View view = (View) c0087a.get(this.f83v.get(0));
            if (view != null) {
                c0015b.f59c.f219a = view;
            }
        }
    }

    private static void m57a(C0087a<String, String> c0087a, String str, String str2) {
        if (str != null && str2 != null && !str.equals(str2)) {
            for (int i = 0; i < c0087a.size(); i++) {
                if (str.equals(c0087a.m466c(i))) {
                    c0087a.m462a(i, (Object) str2);
                    return;
                }
            }
            c0087a.put(str, str2);
        }
    }

    private static void m58a(SparseArray<C0018f> sparseArray, C0018f c0018f) {
        if (c0018f != null) {
            int i = c0018f.f93H;
            if (i != 0 && !c0018f.m141m() && c0018f.m139k() && c0018f.m143o() != null && sparseArray.get(i) == null) {
                sparseArray.put(i, c0018f);
            }
        }
    }

    private void m59a(View view, C0015b c0015b, int i, Object obj) {
        final View view2 = view;
        final C0015b c0015b2 = c0015b;
        final int i2 = i;
        final Object obj2 = obj;
        view.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener(this) {
            final /* synthetic */ C0017d f47e;

            public boolean onPreDraw() {
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                this.f47e.m48a(c0015b2, i2, obj2);
                return true;
            }
        });
    }

    private boolean m60a(int i, C0015b c0015b, boolean z, SparseArray<C0018f> sparseArray, SparseArray<C0018f> sparseArray2) {
        View view = (ViewGroup) this.f63b.f184p.mo18a(i);
        if (view == null) {
            return false;
        }
        final C0018f c0018f = (C0018f) sparseArray2.get(i);
        C0018f c0018f2 = (C0018f) sparseArray.get(i);
        Object a = C0017d.m45a(c0018f, z);
        Object a2 = C0017d.m44a(c0018f, c0018f2, z);
        Object b = C0017d.m62b(c0018f2, z);
        if (a == null && a2 == null && b == null) {
            return false;
        }
        C0087a c0087a = null;
        ArrayList arrayList = new ArrayList();
        if (a2 != null) {
            c0087a = m40a(c0015b, c0018f2, z);
            arrayList.add(c0015b.f60d);
            arrayList.addAll(c0087a.values());
            C0048q c0048q = z ? c0018f2.ah : c0018f.ah;
            if (c0048q != null) {
                c0048q.m345a(new ArrayList(c0087a.keySet()), new ArrayList(c0087a.values()), null);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Object a3 = C0017d.m46a(b, c0018f2, arrayList2, c0087a, c0015b.f60d);
        if (!(this.f83v == null || c0087a == null)) {
            View view2 = (View) c0087a.get(this.f83v.get(0));
            if (view2 != null) {
                if (a3 != null) {
                    C0042m.m297a(a3, view2);
                }
                if (a2 != null) {
                    C0042m.m297a(a2, view2);
                }
            }
        }
        C0010b c00111 = new C0010b(this) {
            final /* synthetic */ C0017d f34b;

            public View mo1a() {
                return c0018f.m143o();
            }
        };
        if (a2 != null) {
            m51a(c0015b, view, a2, c0018f, c0018f2, z, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Map c0087a2 = new C0087a();
        Object a4 = C0042m.m292a(a, a3, a2, z ? c0018f.m85B() : c0018f.m84A());
        if (a4 != null) {
            C0042m.m299a(a, a2, view, c00111, c0015b.f60d, c0015b.f59c, c0015b.f57a, arrayList3, c0087a2, arrayList);
            m59a(view, c0015b, i, a4);
            C0042m.m298a(a4, c0015b.f60d, true);
            m48a(c0015b, i, a4);
            C0042m.m296a((ViewGroup) view, a4);
            C0042m.m295a(view, c0015b.f60d, a, arrayList3, a3, arrayList2, a2, arrayList, a4, c0015b.f58b, c0087a2);
        }
        return a4 != null;
    }

    private C0087a<String, View> m61b(C0015b c0015b, C0018f c0018f, boolean z) {
        C0087a c0087a = new C0087a();
        View o = c0018f.m143o();
        if (o == null || this.f82u == null) {
            return c0087a;
        }
        C0042m.m302a((Map) c0087a, o);
        if (z) {
            return C0017d.m43a(this.f82u, this.f83v, c0087a);
        }
        c0087a.m469a(this.f83v);
        return c0087a;
    }

    private static Object m62b(C0018f c0018f, boolean z) {
        if (c0018f == null) {
            return null;
        }
        return C0042m.m290a(z ? c0018f.m150v() : c0018f.m151w());
    }

    private void m63b(C0015b c0015b, C0087a<String, View> c0087a, boolean z) {
        int size = c0087a.size();
        for (int i = 0; i < size; i++) {
            String str = (String) c0087a.m465b(i);
            String a = C0042m.m293a((View) c0087a.m466c(i));
            if (z) {
                C0017d.m57a(c0015b.f57a, str, a);
            } else {
                C0017d.m57a(c0015b.f57a, a, str);
            }
        }
    }

    private void m64b(SparseArray<C0018f> sparseArray, C0018f c0018f) {
        if (c0018f != null) {
            int i = c0018f.f93H;
            if (i != 0) {
                sparseArray.put(i, c0018f);
            }
        }
    }

    private void m65b(SparseArray<C0018f> sparseArray, SparseArray<C0018f> sparseArray2) {
        if (this.f63b.f184p.mo19a()) {
            for (C0014a c0014a = this.f64c; c0014a != null; c0014a = c0014a.f48a) {
                switch (c0014a.f50c) {
                    case 1:
                        m64b((SparseArray) sparseArray2, c0014a.f51d);
                        break;
                    case 2:
                        C0018f c0018f;
                        C0018f c0018f2 = c0014a.f51d;
                        if (this.f63b.f175g != null) {
                            c0018f = c0018f2;
                            for (int i = 0; i < this.f63b.f175g.size(); i++) {
                                C0018f c0018f3 = (C0018f) this.f63b.f175g.get(i);
                                if (c0018f == null || c0018f3.f93H == c0018f.f93H) {
                                    if (c0018f3 == c0018f) {
                                        c0018f = null;
                                    } else {
                                        C0017d.m58a((SparseArray) sparseArray, c0018f3);
                                    }
                                }
                            }
                        } else {
                            c0018f = c0018f2;
                        }
                        m64b((SparseArray) sparseArray2, c0018f);
                        break;
                    case 3:
                        C0017d.m58a((SparseArray) sparseArray, c0014a.f51d);
                        break;
                    case 4:
                        C0017d.m58a((SparseArray) sparseArray, c0014a.f51d);
                        break;
                    case 5:
                        m64b((SparseArray) sparseArray2, c0014a.f51d);
                        break;
                    case 6:
                        C0017d.m58a((SparseArray) sparseArray, c0014a.f51d);
                        break;
                    case 7:
                        m64b((SparseArray) sparseArray2, c0014a.f51d);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public int mo2a() {
        return m67a(false);
    }

    int m67a(boolean z) {
        if (this.f76o) {
            throw new IllegalStateException("commit already called");
        }
        if (C0034j.f168a) {
            Log.v("FragmentManager", "Commit: " + this);
            m75a("  ", null, new PrintWriter(new C0090d("FragmentManager")), null);
        }
        this.f76o = true;
        if (this.f73l) {
            this.f77p = this.f63b.m202a(this);
        } else {
            this.f77p = -1;
        }
        this.f63b.m221a((Runnable) this, z);
        return this.f77p;
    }

    public C0015b m68a(boolean z, C0015b c0015b, SparseArray<C0018f> sparseArray, SparseArray<C0018f> sparseArray2) {
        if (C0034j.f168a) {
            Log.v("FragmentManager", "popFromBackStack: " + this);
            m75a("  ", null, new PrintWriter(new C0090d("FragmentManager")), null);
        }
        if (f62a) {
            if (c0015b == null) {
                if (!(sparseArray.size() == 0 && sparseArray2.size() == 0)) {
                    c0015b = m39a((SparseArray) sparseArray, (SparseArray) sparseArray2, true);
                }
            } else if (!z) {
                C0017d.m52a(c0015b, this.f83v, this.f82u);
            }
        }
        m72a(-1);
        int i = c0015b != null ? 0 : this.f72k;
        int i2 = c0015b != null ? 0 : this.f71j;
        C0014a c0014a = this.f65d;
        while (c0014a != null) {
            int i3 = c0015b != null ? 0 : c0014a.f54g;
            int i4 = c0015b != null ? 0 : c0014a.f55h;
            C0018f c0018f;
            C0018f c0018f2;
            switch (c0014a.f50c) {
                case 1:
                    c0018f = c0014a.f51d;
                    c0018f.f102Q = i4;
                    this.f63b.m217a(c0018f, C0034j.m200c(i2), i);
                    break;
                case 2:
                    c0018f = c0014a.f51d;
                    if (c0018f != null) {
                        c0018f.f102Q = i4;
                        this.f63b.m217a(c0018f, C0034j.m200c(i2), i);
                    }
                    if (c0014a.f56i == null) {
                        break;
                    }
                    for (int i5 = 0; i5 < c0014a.f56i.size(); i5++) {
                        c0018f2 = (C0018f) c0014a.f56i.get(i5);
                        c0018f2.f102Q = i3;
                        this.f63b.m219a(c0018f2, false);
                    }
                    break;
                case 3:
                    c0018f2 = c0014a.f51d;
                    c0018f2.f102Q = i3;
                    this.f63b.m219a(c0018f2, false);
                    break;
                case 4:
                    c0018f2 = c0014a.f51d;
                    c0018f2.f102Q = i3;
                    this.f63b.m236c(c0018f2, C0034j.m200c(i2), i);
                    break;
                case 5:
                    c0018f = c0014a.f51d;
                    c0018f.f102Q = i4;
                    this.f63b.m230b(c0018f, C0034j.m200c(i2), i);
                    break;
                case 6:
                    c0018f2 = c0014a.f51d;
                    c0018f2.f102Q = i3;
                    this.f63b.m241e(c0018f2, C0034j.m200c(i2), i);
                    break;
                case 7:
                    c0018f2 = c0014a.f51d;
                    c0018f2.f102Q = i3;
                    this.f63b.m238d(c0018f2, C0034j.m200c(i2), i);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0014a.f50c);
            }
            c0014a = c0014a.f49b;
        }
        if (z) {
            this.f63b.m210a(this.f63b.f182n, C0034j.m200c(i2), i, true);
            c0015b = null;
        }
        if (this.f77p >= 0) {
            this.f63b.m227b(this.f77p);
            this.f77p = -1;
        }
        return c0015b;
    }

    public C0016l mo3a(int i, C0018f c0018f, String str) {
        m47a(i, c0018f, str, 1);
        return this;
    }

    public C0016l mo4a(C0018f c0018f) {
        C0014a c0014a = new C0014a();
        c0014a.f50c = 3;
        c0014a.f51d = c0018f;
        m73a(c0014a);
        return this;
    }

    public C0016l mo5a(C0018f c0018f, String str) {
        m47a(0, c0018f, str, 1);
        return this;
    }

    void m72a(int i) {
        if (this.f73l) {
            if (C0034j.f168a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            for (C0014a c0014a = this.f64c; c0014a != null; c0014a = c0014a.f48a) {
                C0018f c0018f;
                if (c0014a.f51d != null) {
                    c0018f = c0014a.f51d;
                    c0018f.f87B += i;
                    if (C0034j.f168a) {
                        Log.v("FragmentManager", "Bump nesting of " + c0014a.f51d + " to " + c0014a.f51d.f87B);
                    }
                }
                if (c0014a.f56i != null) {
                    for (int size = c0014a.f56i.size() - 1; size >= 0; size--) {
                        c0018f = (C0018f) c0014a.f56i.get(size);
                        c0018f.f87B += i;
                        if (C0034j.f168a) {
                            Log.v("FragmentManager", "Bump nesting of " + c0018f + " to " + c0018f.f87B);
                        }
                    }
                }
            }
        }
    }

    void m73a(C0014a c0014a) {
        if (this.f64c == null) {
            this.f65d = c0014a;
            this.f64c = c0014a;
        } else {
            c0014a.f49b = this.f65d;
            this.f65d.f48a = c0014a;
            this.f65d = c0014a;
        }
        c0014a.f52e = this.f67f;
        c0014a.f53f = this.f68g;
        c0014a.f54g = this.f69h;
        c0014a.f55h = this.f70i;
        this.f66e++;
    }

    public void m74a(SparseArray<C0018f> sparseArray, SparseArray<C0018f> sparseArray2) {
        if (this.f63b.f184p.mo19a()) {
            for (C0014a c0014a = this.f64c; c0014a != null; c0014a = c0014a.f48a) {
                switch (c0014a.f50c) {
                    case 1:
                        C0017d.m58a((SparseArray) sparseArray, c0014a.f51d);
                        break;
                    case 2:
                        if (c0014a.f56i != null) {
                            for (int size = c0014a.f56i.size() - 1; size >= 0; size--) {
                                m64b((SparseArray) sparseArray2, (C0018f) c0014a.f56i.get(size));
                            }
                        }
                        C0017d.m58a((SparseArray) sparseArray, c0014a.f51d);
                        break;
                    case 3:
                        m64b((SparseArray) sparseArray2, c0014a.f51d);
                        break;
                    case 4:
                        m64b((SparseArray) sparseArray2, c0014a.f51d);
                        break;
                    case 5:
                        C0017d.m58a((SparseArray) sparseArray, c0014a.f51d);
                        break;
                    case 6:
                        m64b((SparseArray) sparseArray2, c0014a.f51d);
                        break;
                    case 7:
                        C0017d.m58a((SparseArray) sparseArray, c0014a.f51d);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public void m75a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        m76a(str, printWriter, true);
    }

    public void m76a(String str, PrintWriter printWriter, boolean z) {
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f75n);
            printWriter.print(" mIndex=");
            printWriter.print(this.f77p);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f76o);
            if (this.f71j != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f71j));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f72k));
            }
            if (!(this.f67f == 0 && this.f68g == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f67f));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f68g));
            }
            if (!(this.f69h == 0 && this.f70i == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f69h));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f70i));
            }
            if (!(this.f78q == 0 && this.f79r == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f78q));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f79r);
            }
            if (!(this.f80s == 0 && this.f81t == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f80s));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f81t);
            }
        }
        if (this.f64c != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str2 = str + "    ";
            int i = 0;
            C0014a c0014a = this.f64c;
            while (c0014a != null) {
                String str3;
                switch (c0014a.f50c) {
                    case 0:
                        str3 = "NULL";
                        break;
                    case 1:
                        str3 = "ADD";
                        break;
                    case 2:
                        str3 = "REPLACE";
                        break;
                    case 3:
                        str3 = "REMOVE";
                        break;
                    case 4:
                        str3 = "HIDE";
                        break;
                    case 5:
                        str3 = "SHOW";
                        break;
                    case 6:
                        str3 = "DETACH";
                        break;
                    case 7:
                        str3 = "ATTACH";
                        break;
                    default:
                        str3 = "cmd=" + c0014a.f50c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str3);
                printWriter.print(" ");
                printWriter.println(c0014a.f51d);
                if (z) {
                    if (!(c0014a.f52e == 0 && c0014a.f53f == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0014a.f52e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0014a.f53f));
                    }
                    if (!(c0014a.f54g == 0 && c0014a.f55h == 0)) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0014a.f54g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0014a.f55h));
                    }
                }
                if (c0014a.f56i != null && c0014a.f56i.size() > 0) {
                    for (int i2 = 0; i2 < c0014a.f56i.size(); i2++) {
                        printWriter.print(str2);
                        if (c0014a.f56i.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            if (i2 == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(str2);
                            printWriter.print("  #");
                            printWriter.print(i2);
                            printWriter.print(": ");
                        }
                        printWriter.println(c0014a.f56i.get(i2));
                    }
                }
                c0014a = c0014a.f48a;
                i++;
            }
        }
    }

    public int mo6b() {
        return m67a(true);
    }

    public C0016l mo7b(C0018f c0018f) {
        C0014a c0014a = new C0014a();
        c0014a.f50c = 6;
        c0014a.f51d = c0018f;
        m73a(c0014a);
        return this;
    }

    public C0016l mo8c(C0018f c0018f) {
        C0014a c0014a = new C0014a();
        c0014a.f50c = 7;
        c0014a.f51d = c0018f;
        m73a(c0014a);
        return this;
    }

    public String m80c() {
        return this.f75n;
    }

    public void run() {
        if (C0034j.f168a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        if (!this.f73l || this.f77p >= 0) {
            C0015b a;
            m72a(1);
            if (f62a) {
                SparseArray sparseArray = new SparseArray();
                SparseArray sparseArray2 = new SparseArray();
                m65b(sparseArray, sparseArray2);
                a = m39a(sparseArray, sparseArray2, false);
            } else {
                Object obj = null;
            }
            int i = a != null ? 0 : this.f72k;
            int i2 = a != null ? 0 : this.f71j;
            C0014a c0014a = this.f64c;
            while (c0014a != null) {
                int i3 = a != null ? 0 : c0014a.f52e;
                int i4 = a != null ? 0 : c0014a.f53f;
                C0018f c0018f;
                switch (c0014a.f50c) {
                    case 1:
                        c0018f = c0014a.f51d;
                        c0018f.f102Q = i3;
                        this.f63b.m219a(c0018f, false);
                        break;
                    case 2:
                        C0018f c0018f2;
                        c0018f = c0014a.f51d;
                        if (this.f63b.f175g != null) {
                            c0018f2 = c0018f;
                            for (int i5 = 0; i5 < this.f63b.f175g.size(); i5++) {
                                c0018f = (C0018f) this.f63b.f175g.get(i5);
                                if (C0034j.f168a) {
                                    Log.v("FragmentManager", "OP_REPLACE: adding=" + c0018f2 + " old=" + c0018f);
                                }
                                if (c0018f2 == null || c0018f.f93H == c0018f2.f93H) {
                                    if (c0018f == c0018f2) {
                                        c0014a.f51d = null;
                                        c0018f2 = null;
                                    } else {
                                        if (c0014a.f56i == null) {
                                            c0014a.f56i = new ArrayList();
                                        }
                                        c0014a.f56i.add(c0018f);
                                        c0018f.f102Q = i4;
                                        if (this.f73l) {
                                            c0018f.f87B++;
                                            if (C0034j.f168a) {
                                                Log.v("FragmentManager", "Bump nesting of " + c0018f + " to " + c0018f.f87B);
                                            }
                                        }
                                        this.f63b.m217a(c0018f, i2, i);
                                    }
                                }
                            }
                        } else {
                            c0018f2 = c0018f;
                        }
                        if (c0018f2 == null) {
                            break;
                        }
                        c0018f2.f102Q = i3;
                        this.f63b.m219a(c0018f2, false);
                        break;
                    case 3:
                        c0018f = c0014a.f51d;
                        c0018f.f102Q = i4;
                        this.f63b.m217a(c0018f, i2, i);
                        break;
                    case 4:
                        c0018f = c0014a.f51d;
                        c0018f.f102Q = i4;
                        this.f63b.m230b(c0018f, i2, i);
                        break;
                    case 5:
                        c0018f = c0014a.f51d;
                        c0018f.f102Q = i3;
                        this.f63b.m236c(c0018f, i2, i);
                        break;
                    case 6:
                        c0018f = c0014a.f51d;
                        c0018f.f102Q = i4;
                        this.f63b.m238d(c0018f, i2, i);
                        break;
                    case 7:
                        c0018f = c0014a.f51d;
                        c0018f.f102Q = i3;
                        this.f63b.m241e(c0018f, i2, i);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + c0014a.f50c);
                }
                c0014a = c0014a.f48a;
            }
            this.f63b.m210a(this.f63b.f182n, i2, i, true);
            if (this.f73l) {
                this.f63b.m228b(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("addToBackStack() called after commit()");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f77p >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f77p);
        }
        if (this.f75n != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f75n);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
