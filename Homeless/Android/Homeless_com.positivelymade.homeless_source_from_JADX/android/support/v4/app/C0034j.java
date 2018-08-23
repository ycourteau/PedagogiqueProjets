package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.C0017d.C0015b;
import android.support.v4.app.C0028i.C0027a;
import android.support.v4.p007f.C0089c;
import android.support.v4.p007f.C0090d;
import android.support.v4.view.C0033m;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class C0034j extends C0028i implements C0033m {
    static final Interpolator f165A = new DecelerateInterpolator(1.5f);
    static final Interpolator f166B = new AccelerateInterpolator(2.5f);
    static final Interpolator f167C = new AccelerateInterpolator(1.5f);
    static boolean f168a = false;
    static final boolean f169b;
    static final Interpolator f170z = new DecelerateInterpolator(2.5f);
    ArrayList<Runnable> f171c;
    Runnable[] f172d;
    boolean f173e;
    ArrayList<C0018f> f174f;
    ArrayList<C0018f> f175g;
    ArrayList<Integer> f176h;
    ArrayList<C0017d> f177i;
    ArrayList<C0018f> f178j;
    ArrayList<C0017d> f179k;
    ArrayList<Integer> f180l;
    ArrayList<C0027a> f181m;
    int f182n = 0;
    C0026g f183o;
    C0020h f184p;
    C0018f f185q;
    boolean f186r;
    boolean f187s;
    boolean f188t;
    String f189u;
    boolean f190v;
    Bundle f191w = null;
    SparseArray<Parcelable> f192x = null;
    Runnable f193y = new C00291(this);

    class C00291 implements Runnable {
        final /* synthetic */ C0034j f158a;

        C00291(C0034j c0034j) {
            this.f158a = c0034j;
        }

        public void run() {
            this.f158a.m245g();
        }
    }

    static class C0032a {
        public static final int[] f164a = new int[]{16842755, 16842960, 16842961};
    }

    static {
        boolean z = false;
        if (VERSION.SDK_INT >= 11) {
            z = true;
        }
        f169b = z;
    }

    C0034j() {
    }

    static Animation m196a(Context context, float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f165A);
        alphaAnimation.setDuration(220);
        return alphaAnimation;
    }

    static Animation m197a(Context context, float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        Animation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f170z);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        scaleAnimation = new AlphaAnimation(f3, f4);
        scaleAnimation.setInterpolator(f165A);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    private void m198a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0090d("FragmentManager"));
        if (this.f183o != null) {
            try {
                this.f183o.dump("  ", null, printWriter, new String[0]);
            } catch (Throwable e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                m222a("  ", null, printWriter, new String[0]);
            } catch (Throwable e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    public static int m199b(int i, boolean z) {
        switch (i) {
            case 4097:
                return z ? 1 : 2;
            case 4099:
                return z ? 5 : 6;
            case 8194:
                return z ? 3 : 4;
            default:
                return -1;
        }
    }

    public static int m200c(int i) {
        switch (i) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    private void m201w() {
        if (this.f187s) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f189u != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f189u);
        }
    }

    public int m202a(C0017d c0017d) {
        int size;
        synchronized (this) {
            if (this.f180l == null || this.f180l.size() <= 0) {
                if (this.f179k == null) {
                    this.f179k = new ArrayList();
                }
                size = this.f179k.size();
                if (f168a) {
                    Log.v("FragmentManager", "Setting back stack index " + size + " to " + c0017d);
                }
                this.f179k.add(c0017d);
            } else {
                size = ((Integer) this.f180l.remove(this.f180l.size() - 1)).intValue();
                if (f168a) {
                    Log.v("FragmentManager", "Adding back stack index " + size + " with " + c0017d);
                }
                this.f179k.set(size, c0017d);
            }
        }
        return size;
    }

    public C0018f m203a(int i) {
        int size;
        C0018f c0018f;
        if (this.f175g != null) {
            for (size = this.f175g.size() - 1; size >= 0; size--) {
                c0018f = (C0018f) this.f175g.get(size);
                if (c0018f != null && c0018f.f92G == i) {
                    return c0018f;
                }
            }
        }
        if (this.f174f != null) {
            for (size = this.f174f.size() - 1; size >= 0; size--) {
                c0018f = (C0018f) this.f174f.get(size);
                if (c0018f != null && c0018f.f92G == i) {
                    return c0018f;
                }
            }
        }
        return null;
    }

    public C0018f m204a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.f174f.size()) {
            m198a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        C0018f c0018f = (C0018f) this.f174f.get(i);
        if (c0018f != null) {
            return c0018f;
        }
        m198a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        return c0018f;
    }

    public C0018f mo20a(String str) {
        int size;
        C0018f c0018f;
        if (!(this.f175g == null || str == null)) {
            for (size = this.f175g.size() - 1; size >= 0; size--) {
                c0018f = (C0018f) this.f175g.get(size);
                if (c0018f != null && str.equals(c0018f.f94I)) {
                    return c0018f;
                }
            }
        }
        if (!(this.f174f == null || str == null)) {
            for (size = this.f174f.size() - 1; size >= 0; size--) {
                c0018f = (C0018f) this.f174f.get(size);
                if (c0018f != null && str.equals(c0018f.f94I)) {
                    return c0018f;
                }
            }
        }
        return null;
    }

    public C0016l mo21a() {
        return new C0017d(this);
    }

    public View mo22a(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0032a.f164a);
        String string = attributeValue == null ? obtainStyledAttributes.getString(0) : attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!C0018f.m83b(this.f183o, string)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string2 == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + string);
        }
        C0018f c0018f;
        C0018f a = resourceId != -1 ? m203a(resourceId) : null;
        if (a == null && string2 != null) {
            a = mo20a(string2);
        }
        if (a == null && id != -1) {
            a = m203a(id);
        }
        if (f168a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + string + " existing=" + a);
        }
        if (a == null) {
            C0018f a2 = C0018f.m81a(context, string);
            a2.f126y = true;
            a2.f92G = resourceId != 0 ? resourceId : id;
            a2.f93H = id;
            a2.f94I = string2;
            a2.f127z = true;
            a2.f88C = this;
            a2.m101a(this.f183o, attributeSet, a2.f115n);
            m219a(a2, true);
            c0018f = a2;
        } else if (a.f127z) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + string);
        } else {
            a.f127z = true;
            if (!a.f98M) {
                a.m101a(this.f183o, attributeSet, a.f115n);
            }
            c0018f = a;
        }
        if (this.f182n >= 1 || !c0018f.f126y) {
            m229b(c0018f);
        } else {
            m218a(c0018f, 1, 0, 0, false);
        }
        if (c0018f.f104S == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (resourceId != 0) {
            c0018f.f104S.setId(resourceId);
        }
        if (c0018f.f104S.getTag() == null) {
            c0018f.f104S.setTag(string2);
        }
        return c0018f.f104S;
    }

    Animation m208a(C0018f c0018f, int i, boolean z, int i2) {
        Animation a = c0018f.m96a(i, z, c0018f.f102Q);
        if (a != null) {
            return a;
        }
        if (c0018f.f102Q != 0) {
            a = AnimationUtils.loadAnimation(this.f183o, c0018f.f102Q);
            if (a != null) {
                return a;
            }
        }
        if (i == 0) {
            return null;
        }
        int b = C0034j.m199b(i, z);
        if (b < 0) {
            return null;
        }
        switch (b) {
            case 1:
                return C0034j.m197a(this.f183o, 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return C0034j.m197a(this.f183o, 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return C0034j.m197a(this.f183o, 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return C0034j.m197a(this.f183o, 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return C0034j.m196a(this.f183o, 0.0f, 1.0f);
            case 6:
                return C0034j.m196a(this.f183o, 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f183o.getWindow() != null) {
                    i2 = this.f183o.getWindow().getAttributes().windowAnimations;
                }
                return i2 == 0 ? null : null;
        }
    }

    public void mo23a(final int i, final int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        m221a(new Runnable(this) {
            final /* synthetic */ C0034j f161c;

            public void run() {
                this.f161c.m223a(this.f161c.f183o.f145a, null, i, i2);
            }
        }, false);
    }

    void m210a(int i, int i2, int i3, boolean z) {
        if (this.f183o == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || this.f182n != i) {
            this.f182n = i;
            if (this.f174f != null) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < this.f174f.size()) {
                    int a;
                    C0018f c0018f = (C0018f) this.f174f.get(i4);
                    if (c0018f != null) {
                        m218a(c0018f, i, i2, i3, false);
                        if (c0018f.f108W != null) {
                            a = i5 | c0018f.f108W.mo38a();
                            i4++;
                            i5 = a;
                        }
                    }
                    a = i5;
                    i4++;
                    i5 = a;
                }
                if (i5 == 0) {
                    m244f();
                }
                if (this.f186r && this.f183o != null && this.f182n == 5) {
                    this.f183o.m185d();
                    this.f186r = false;
                }
            }
        }
    }

    public void m211a(int i, C0017d c0017d) {
        synchronized (this) {
            if (this.f179k == null) {
                this.f179k = new ArrayList();
            }
            int size = this.f179k.size();
            if (i < size) {
                if (f168a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + c0017d);
                }
                this.f179k.set(i, c0017d);
            } else {
                while (size < i) {
                    this.f179k.add(null);
                    if (this.f180l == null) {
                        this.f180l = new ArrayList();
                    }
                    if (f168a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f180l.add(Integer.valueOf(size));
                    size++;
                }
                if (f168a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + c0017d);
                }
                this.f179k.add(c0017d);
            }
        }
    }

    void m212a(int i, boolean z) {
        m210a(i, 0, 0, z);
    }

    public void m213a(Configuration configuration) {
        if (this.f175g != null) {
            for (int i = 0; i < this.f175g.size(); i++) {
                C0018f c0018f = (C0018f) this.f175g.get(i);
                if (c0018f != null) {
                    c0018f.m104a(configuration);
                }
            }
        }
    }

    public void m214a(Bundle bundle, String str, C0018f c0018f) {
        if (c0018f.f117p < 0) {
            m198a(new IllegalStateException("Fragment " + c0018f + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, c0018f.f117p);
    }

    void m215a(Parcelable parcelable, ArrayList<C0018f> arrayList) {
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f19a != null) {
                int i;
                C0018f c0018f;
                int i2;
                if (arrayList != null) {
                    for (i = 0; i < arrayList.size(); i++) {
                        c0018f = (C0018f) arrayList.get(i);
                        if (f168a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + c0018f);
                        }
                        FragmentState fragmentState = fragmentManagerState.f19a[c0018f.f117p];
                        fragmentState.f32k = c0018f;
                        c0018f.f116o = null;
                        c0018f.f87B = 0;
                        c0018f.f127z = false;
                        c0018f.f123v = false;
                        c0018f.f120s = null;
                        if (fragmentState.f31j != null) {
                            fragmentState.f31j.setClassLoader(this.f183o.getClassLoader());
                            c0018f.f116o = fragmentState.f31j.getSparseParcelableArray("android:view_state");
                            c0018f.f115n = fragmentState.f31j;
                        }
                    }
                }
                this.f174f = new ArrayList(fragmentManagerState.f19a.length);
                if (this.f176h != null) {
                    this.f176h.clear();
                }
                for (i2 = 0; i2 < fragmentManagerState.f19a.length; i2++) {
                    FragmentState fragmentState2 = fragmentManagerState.f19a[i2];
                    if (fragmentState2 != null) {
                        C0018f a = fragmentState2.m26a(this.f183o, this.f185q);
                        if (f168a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i2 + ": " + a);
                        }
                        this.f174f.add(a);
                        fragmentState2.f32k = null;
                    } else {
                        this.f174f.add(null);
                        if (this.f176h == null) {
                            this.f176h = new ArrayList();
                        }
                        if (f168a) {
                            Log.v("FragmentManager", "restoreAllState: avail #" + i2);
                        }
                        this.f176h.add(Integer.valueOf(i2));
                    }
                }
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        c0018f = (C0018f) arrayList.get(i3);
                        if (c0018f.f121t >= 0) {
                            if (c0018f.f121t < this.f174f.size()) {
                                c0018f.f120s = (C0018f) this.f174f.get(c0018f.f121t);
                            } else {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + c0018f + " target no longer exists: " + c0018f.f121t);
                                c0018f.f120s = null;
                            }
                        }
                    }
                }
                if (fragmentManagerState.f20b != null) {
                    this.f175g = new ArrayList(fragmentManagerState.f20b.length);
                    for (i = 0; i < fragmentManagerState.f20b.length; i++) {
                        c0018f = (C0018f) this.f174f.get(fragmentManagerState.f20b[i]);
                        if (c0018f == null) {
                            m198a(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.f20b[i]));
                        }
                        c0018f.f123v = true;
                        if (f168a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + i + ": " + c0018f);
                        }
                        if (this.f175g.contains(c0018f)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.f175g.add(c0018f);
                    }
                } else {
                    this.f175g = null;
                }
                if (fragmentManagerState.f21c != null) {
                    this.f177i = new ArrayList(fragmentManagerState.f21c.length);
                    for (i2 = 0; i2 < fragmentManagerState.f21c.length; i2++) {
                        C0017d a2 = fragmentManagerState.f21c[i2].m21a(this);
                        if (f168a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + a2.f77p + "): " + a2);
                            a2.m76a("  ", new PrintWriter(new C0090d("FragmentManager")), false);
                        }
                        this.f177i.add(a2);
                        if (a2.f77p >= 0) {
                            m211a(a2.f77p, a2);
                        }
                    }
                    return;
                }
                this.f177i = null;
            }
        }
    }

    public void m216a(C0018f c0018f) {
        if (!c0018f.f106U) {
            return;
        }
        if (this.f173e) {
            this.f190v = true;
            return;
        }
        c0018f.f106U = false;
        m218a(c0018f, this.f182n, 0, 0, false);
    }

    public void m217a(C0018f c0018f, int i, int i2) {
        if (f168a) {
            Log.v("FragmentManager", "remove: " + c0018f + " nesting=" + c0018f.f87B);
        }
        boolean z = !c0018f.m129f();
        if (!c0018f.f96K || z) {
            if (this.f175g != null) {
                this.f175g.remove(c0018f);
            }
            if (c0018f.f99N && c0018f.f100O) {
                this.f186r = true;
            }
            c0018f.f123v = false;
            c0018f.f124w = true;
            m218a(c0018f, z ? 0 : 1, i, i2, false);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m218a(final android.support.v4.app.C0018f r11, int r12, int r13, int r14, boolean r15) {
        /*
        r10 = this;
        r9 = 4;
        r6 = 3;
        r5 = 1;
        r3 = 0;
        r7 = 0;
        r0 = r11.f123v;
        if (r0 == 0) goto L_0x000d;
    L_0x0009:
        r0 = r11.f96K;
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        if (r12 <= r5) goto L_0x0010;
    L_0x000f:
        r12 = r5;
    L_0x0010:
        r0 = r11.f124w;
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r0 = r11.f112k;
        if (r12 <= r0) goto L_0x001a;
    L_0x0018:
        r12 = r11.f112k;
    L_0x001a:
        r0 = r11.f106U;
        if (r0 == 0) goto L_0x0025;
    L_0x001e:
        r0 = r11.f112k;
        if (r0 >= r9) goto L_0x0025;
    L_0x0022:
        if (r12 <= r6) goto L_0x0025;
    L_0x0024:
        r12 = r6;
    L_0x0025:
        r0 = r11.f112k;
        if (r0 >= r12) goto L_0x0265;
    L_0x0029:
        r0 = r11.f126y;
        if (r0 == 0) goto L_0x0032;
    L_0x002d:
        r0 = r11.f127z;
        if (r0 != 0) goto L_0x0032;
    L_0x0031:
        return;
    L_0x0032:
        r0 = r11.f113l;
        if (r0 == 0) goto L_0x0040;
    L_0x0036:
        r11.f113l = r7;
        r2 = r11.f114m;
        r0 = r10;
        r1 = r11;
        r4 = r3;
        r0.m218a(r1, r2, r3, r4, r5);
    L_0x0040:
        r0 = r11.f112k;
        switch(r0) {
            case 0: goto L_0x0048;
            case 1: goto L_0x0134;
            case 2: goto L_0x0200;
            case 3: goto L_0x0200;
            case 4: goto L_0x0221;
            default: goto L_0x0045;
        };
    L_0x0045:
        r11.f112k = r12;
        goto L_0x0031;
    L_0x0048:
        r0 = f168a;
        if (r0 == 0) goto L_0x0064;
    L_0x004c:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0064:
        r0 = r11.f115n;
        if (r0 == 0) goto L_0x00a8;
    L_0x0068:
        r0 = r11.f115n;
        r1 = r10.f183o;
        r1 = r1.getClassLoader();
        r0.setClassLoader(r1);
        r0 = r11.f115n;
        r1 = "android:view_state";
        r0 = r0.getSparseParcelableArray(r1);
        r11.f116o = r0;
        r0 = r11.f115n;
        r1 = "android:target_state";
        r0 = r10.m204a(r0, r1);
        r11.f120s = r0;
        r0 = r11.f120s;
        if (r0 == 0) goto L_0x0095;
    L_0x008b:
        r0 = r11.f115n;
        r1 = "android:target_req_state";
        r0 = r0.getInt(r1, r3);
        r11.f122u = r0;
    L_0x0095:
        r0 = r11.f115n;
        r1 = "android:user_visible_hint";
        r0 = r0.getBoolean(r1, r5);
        r11.f107V = r0;
        r0 = r11.f107V;
        if (r0 != 0) goto L_0x00a8;
    L_0x00a3:
        r11.f106U = r5;
        if (r12 <= r6) goto L_0x00a8;
    L_0x00a7:
        r12 = r6;
    L_0x00a8:
        r0 = r10.f183o;
        r11.f89D = r0;
        r0 = r10.f185q;
        r11.f91F = r0;
        r0 = r10.f185q;
        if (r0 == 0) goto L_0x00e4;
    L_0x00b4:
        r0 = r10.f185q;
        r0 = r0.f90E;
    L_0x00b8:
        r11.f88C = r0;
        r11.f101P = r3;
        r0 = r10.f183o;
        r11.mo9a(r0);
        r0 = r11.f101P;
        if (r0 != 0) goto L_0x00e9;
    L_0x00c5:
        r0 = new android.support.v4.app.r;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r2 = " did not call through to super.onAttach()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00e4:
        r0 = r10.f183o;
        r0 = r0.f146b;
        goto L_0x00b8;
    L_0x00e9:
        r0 = r11.f91F;
        if (r0 != 0) goto L_0x00f2;
    L_0x00ed:
        r0 = r10.f183o;
        r0.m178a(r11);
    L_0x00f2:
        r0 = r11.f98M;
        if (r0 != 0) goto L_0x00fb;
    L_0x00f6:
        r0 = r11.f115n;
        r11.m135i(r0);
    L_0x00fb:
        r11.f98M = r3;
        r0 = r11.f126y;
        if (r0 == 0) goto L_0x0134;
    L_0x0101:
        r0 = r11.f115n;
        r0 = r11.mo11b(r0);
        r1 = r11.f115n;
        r0 = r11.m111b(r0, r7, r1);
        r11.f104S = r0;
        r0 = r11.f104S;
        if (r0 == 0) goto L_0x0254;
    L_0x0113:
        r0 = r11.f104S;
        r11.f105T = r0;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 11;
        if (r0 < r1) goto L_0x024a;
    L_0x011d:
        r0 = r11.f104S;
        android.support.v4.view.C0233z.m1082a(r0, r3);
    L_0x0122:
        r0 = r11.f95J;
        if (r0 == 0) goto L_0x012d;
    L_0x0126:
        r0 = r11.f104S;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x012d:
        r0 = r11.f104S;
        r1 = r11.f115n;
        r11.m107a(r0, r1);
    L_0x0134:
        if (r12 <= r5) goto L_0x0200;
    L_0x0136:
        r0 = f168a;
        if (r0 == 0) goto L_0x0152;
    L_0x013a:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto ACTIVITY_CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0152:
        r0 = r11.f126y;
        if (r0 != 0) goto L_0x01f0;
    L_0x0156:
        r0 = r11.f93H;
        if (r0 == 0) goto L_0x03c0;
    L_0x015a:
        r0 = r10.f184p;
        r1 = r11.f93H;
        r0 = r0.mo18a(r1);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x01a9;
    L_0x0166:
        r1 = r11.f86A;
        if (r1 != 0) goto L_0x01a9;
    L_0x016a:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = "No view found for id 0x";
        r2 = r2.append(r4);
        r4 = r11.f93H;
        r4 = java.lang.Integer.toHexString(r4);
        r2 = r2.append(r4);
        r4 = " (";
        r2 = r2.append(r4);
        r4 = r11.m132h();
        r8 = r11.f93H;
        r4 = r4.getResourceName(r8);
        r2 = r2.append(r4);
        r4 = ") for fragment ";
        r2 = r2.append(r4);
        r2 = r2.append(r11);
        r2 = r2.toString();
        r1.<init>(r2);
        r10.m198a(r1);
    L_0x01a9:
        r11.f103R = r0;
        r1 = r11.f115n;
        r1 = r11.mo11b(r1);
        r2 = r11.f115n;
        r1 = r11.m111b(r1, r0, r2);
        r11.f104S = r1;
        r1 = r11.f104S;
        if (r1 == 0) goto L_0x0262;
    L_0x01bd:
        r1 = r11.f104S;
        r11.f105T = r1;
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 11;
        if (r1 < r2) goto L_0x0258;
    L_0x01c7:
        r1 = r11.f104S;
        android.support.v4.view.C0233z.m1082a(r1, r3);
    L_0x01cc:
        if (r0 == 0) goto L_0x01de;
    L_0x01ce:
        r1 = r10.m208a(r11, r13, r5, r14);
        if (r1 == 0) goto L_0x01d9;
    L_0x01d4:
        r2 = r11.f104S;
        r2.startAnimation(r1);
    L_0x01d9:
        r1 = r11.f104S;
        r0.addView(r1);
    L_0x01de:
        r0 = r11.f95J;
        if (r0 == 0) goto L_0x01e9;
    L_0x01e2:
        r0 = r11.f104S;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x01e9:
        r0 = r11.f104S;
        r1 = r11.f115n;
        r11.m107a(r0, r1);
    L_0x01f0:
        r0 = r11.f115n;
        r11.m137j(r0);
        r0 = r11.f104S;
        if (r0 == 0) goto L_0x01fe;
    L_0x01f9:
        r0 = r11.f115n;
        r11.m128f(r0);
    L_0x01fe:
        r11.f115n = r7;
    L_0x0200:
        if (r12 <= r6) goto L_0x0221;
    L_0x0202:
        r0 = f168a;
        if (r0 == 0) goto L_0x021e;
    L_0x0206:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto STARTED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x021e:
        r11.m87D();
    L_0x0221:
        if (r12 <= r9) goto L_0x0045;
    L_0x0223:
        r0 = f168a;
        if (r0 == 0) goto L_0x023f;
    L_0x0227:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto RESUMED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x023f:
        r11.f125x = r5;
        r11.m88E();
        r11.f115n = r7;
        r11.f116o = r7;
        goto L_0x0045;
    L_0x024a:
        r0 = r11.f104S;
        r0 = android.support.v4.app.C0047p.m344a(r0);
        r11.f104S = r0;
        goto L_0x0122;
    L_0x0254:
        r11.f105T = r7;
        goto L_0x0134;
    L_0x0258:
        r1 = r11.f104S;
        r1 = android.support.v4.app.C0047p.m344a(r1);
        r11.f104S = r1;
        goto L_0x01cc;
    L_0x0262:
        r11.f105T = r7;
        goto L_0x01f0;
    L_0x0265:
        r0 = r11.f112k;
        if (r0 <= r12) goto L_0x0045;
    L_0x0269:
        r0 = r11.f112k;
        switch(r0) {
            case 1: goto L_0x0270;
            case 2: goto L_0x02f0;
            case 3: goto L_0x02cf;
            case 4: goto L_0x02ae;
            case 5: goto L_0x028a;
            default: goto L_0x026e;
        };
    L_0x026e:
        goto L_0x0045;
    L_0x0270:
        if (r12 >= r5) goto L_0x0045;
    L_0x0272:
        r0 = r10.f188t;
        if (r0 == 0) goto L_0x0281;
    L_0x0276:
        r0 = r11.f113l;
        if (r0 == 0) goto L_0x0281;
    L_0x027a:
        r0 = r11.f113l;
        r11.f113l = r7;
        r0.clearAnimation();
    L_0x0281:
        r0 = r11.f113l;
        if (r0 == 0) goto L_0x035d;
    L_0x0285:
        r11.f114m = r12;
        r12 = r5;
        goto L_0x0045;
    L_0x028a:
        r0 = 5;
        if (r12 >= r0) goto L_0x02ae;
    L_0x028d:
        r0 = f168a;
        if (r0 == 0) goto L_0x02a9;
    L_0x0291:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom RESUMED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02a9:
        r11.m90G();
        r11.f125x = r3;
    L_0x02ae:
        if (r12 >= r9) goto L_0x02cf;
    L_0x02b0:
        r0 = f168a;
        if (r0 == 0) goto L_0x02cc;
    L_0x02b4:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STARTED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02cc:
        r11.m91H();
    L_0x02cf:
        if (r12 >= r6) goto L_0x02f0;
    L_0x02d1:
        r0 = f168a;
        if (r0 == 0) goto L_0x02ed;
    L_0x02d5:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STOPPED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02ed:
        r11.m92I();
    L_0x02f0:
        r0 = 2;
        if (r12 >= r0) goto L_0x0270;
    L_0x02f3:
        r0 = f168a;
        if (r0 == 0) goto L_0x030f;
    L_0x02f7:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom ACTIVITY_CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x030f:
        r0 = r11.f104S;
        if (r0 == 0) goto L_0x0322;
    L_0x0313:
        r0 = r10.f183o;
        r0 = r0.isFinishing();
        if (r0 != 0) goto L_0x0322;
    L_0x031b:
        r0 = r11.f116o;
        if (r0 != 0) goto L_0x0322;
    L_0x031f:
        r10.m240e(r11);
    L_0x0322:
        r11.m93J();
        r0 = r11.f104S;
        if (r0 == 0) goto L_0x0355;
    L_0x0329:
        r0 = r11.f103R;
        if (r0 == 0) goto L_0x0355;
    L_0x032d:
        r0 = r10.f182n;
        if (r0 <= 0) goto L_0x03bd;
    L_0x0331:
        r0 = r10.f188t;
        if (r0 != 0) goto L_0x03bd;
    L_0x0335:
        r0 = r10.m208a(r11, r13, r3, r14);
    L_0x0339:
        if (r0 == 0) goto L_0x034e;
    L_0x033b:
        r1 = r11.f104S;
        r11.f113l = r1;
        r11.f114m = r12;
        r1 = new android.support.v4.app.j$3;
        r1.<init>(r10, r11);
        r0.setAnimationListener(r1);
        r1 = r11.f104S;
        r1.startAnimation(r0);
    L_0x034e:
        r0 = r11.f103R;
        r1 = r11.f104S;
        r0.removeView(r1);
    L_0x0355:
        r11.f103R = r7;
        r11.f104S = r7;
        r11.f105T = r7;
        goto L_0x0270;
    L_0x035d:
        r0 = f168a;
        if (r0 == 0) goto L_0x0379;
    L_0x0361:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0379:
        r0 = r11.f98M;
        if (r0 != 0) goto L_0x0380;
    L_0x037d:
        r11.m94K();
    L_0x0380:
        r11.f101P = r3;
        r11.mo12b();
        r0 = r11.f101P;
        if (r0 != 0) goto L_0x03a8;
    L_0x0389:
        r0 = new android.support.v4.app.r;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r2 = " did not call through to super.onDetach()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x03a8:
        if (r15 != 0) goto L_0x0045;
    L_0x03aa:
        r0 = r11.f98M;
        if (r0 != 0) goto L_0x03b3;
    L_0x03ae:
        r10.m237d(r11);
        goto L_0x0045;
    L_0x03b3:
        r11.f89D = r7;
        r11.f91F = r7;
        r11.f88C = r7;
        r11.f90E = r7;
        goto L_0x0045;
    L_0x03bd:
        r0 = r7;
        goto L_0x0339;
    L_0x03c0:
        r0 = r7;
        goto L_0x01a9;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.j.a(android.support.v4.app.f, int, int, int, boolean):void");
    }

    public void m219a(C0018f c0018f, boolean z) {
        if (this.f175g == null) {
            this.f175g = new ArrayList();
        }
        if (f168a) {
            Log.v("FragmentManager", "add: " + c0018f);
        }
        m235c(c0018f);
        if (!c0018f.f96K) {
            if (this.f175g.contains(c0018f)) {
                throw new IllegalStateException("Fragment already added: " + c0018f);
            }
            this.f175g.add(c0018f);
            c0018f.f123v = true;
            c0018f.f124w = false;
            if (c0018f.f99N && c0018f.f100O) {
                this.f186r = true;
            }
            if (z) {
                m229b(c0018f);
            }
        }
    }

    public void m220a(C0026g c0026g, C0020h c0020h, C0018f c0018f) {
        if (this.f183o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f183o = c0026g;
        this.f184p = c0020h;
        this.f185q = c0018f;
    }

    public void m221a(Runnable runnable, boolean z) {
        if (!z) {
            m201w();
        }
        synchronized (this) {
            if (this.f188t || this.f183o == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.f171c == null) {
                this.f171c = new ArrayList();
            }
            this.f171c.add(runnable);
            if (this.f171c.size() == 1) {
                this.f183o.f145a.removeCallbacks(this.f193y);
                this.f183o.f145a.post(this.f193y);
            }
        }
    }

    public void m222a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int i;
        C0018f c0018f;
        int i2 = 0;
        String str2 = str + "    ";
        if (this.f174f != null) {
            size = this.f174f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (i = 0; i < size; i++) {
                    c0018f = (C0018f) this.f174f.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c0018f);
                    if (c0018f != null) {
                        c0018f.mo891a(str2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        if (this.f175g != null) {
            size = this.f175g.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Added Fragments:");
                for (i = 0; i < size; i++) {
                    c0018f = (C0018f) this.f175g.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c0018f.toString());
                }
            }
        }
        if (this.f178j != null) {
            size = this.f178j.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (i = 0; i < size; i++) {
                    c0018f = (C0018f) this.f178j.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c0018f.toString());
                }
            }
        }
        if (this.f177i != null) {
            size = this.f177i.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (i = 0; i < size; i++) {
                    C0017d c0017d = (C0017d) this.f177i.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c0017d.toString());
                    c0017d.m75a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        synchronized (this) {
            if (this.f179k != null) {
                int size2 = this.f179k.size();
                if (size2 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (i = 0; i < size2; i++) {
                        c0017d = (C0017d) this.f179k.get(i);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i);
                        printWriter.print(": ");
                        printWriter.println(c0017d);
                    }
                }
            }
            if (this.f180l != null && this.f180l.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f180l.toArray()));
            }
        }
        if (this.f171c != null) {
            i = this.f171c.size();
            if (i > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                while (i2 < i) {
                    Runnable runnable = (Runnable) this.f171c.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(runnable);
                    i2++;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mActivity=");
        printWriter.println(this.f183o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f184p);
        if (this.f185q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f185q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f182n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f187s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f188t);
        if (this.f186r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f186r);
        }
        if (this.f189u != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f189u);
        }
        if (this.f176h != null && this.f176h.size() > 0) {
            printWriter.print(str);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.f176h.toArray()));
        }
    }

    boolean m223a(Handler handler, String str, int i, int i2) {
        if (this.f177i == null) {
            return false;
        }
        int size;
        C0017d c0017d;
        if (str == null && i < 0 && (i2 & 1) == 0) {
            size = this.f177i.size() - 1;
            if (size < 0) {
                return false;
            }
            c0017d = (C0017d) this.f177i.remove(size);
            SparseArray sparseArray = new SparseArray();
            SparseArray sparseArray2 = new SparseArray();
            c0017d.m74a(sparseArray, sparseArray2);
            c0017d.m68a(true, null, sparseArray, sparseArray2);
            m246h();
        } else {
            int size2;
            size = -1;
            if (str != null || i >= 0) {
                size2 = this.f177i.size() - 1;
                while (size2 >= 0) {
                    c0017d = (C0017d) this.f177i.get(size2);
                    if ((str != null && str.equals(c0017d.m80c())) || (i >= 0 && i == c0017d.f77p)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    size2--;
                    while (size2 >= 0) {
                        c0017d = (C0017d) this.f177i.get(size2);
                        if ((str == null || !str.equals(c0017d.m80c())) && (i < 0 || i != c0017d.f77p)) {
                            break;
                        }
                        size2--;
                    }
                }
                size = size2;
            }
            if (size == this.f177i.size() - 1) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (size2 = this.f177i.size() - 1; size2 > size; size2--) {
                arrayList.add(this.f177i.remove(size2));
            }
            int size3 = arrayList.size() - 1;
            SparseArray sparseArray3 = new SparseArray();
            SparseArray sparseArray4 = new SparseArray();
            for (size2 = 0; size2 <= size3; size2++) {
                ((C0017d) arrayList.get(size2)).m74a(sparseArray3, sparseArray4);
            }
            C0015b c0015b = null;
            int i3 = 0;
            while (i3 <= size3) {
                if (f168a) {
                    Log.v("FragmentManager", "Popping back stack state: " + arrayList.get(i3));
                }
                i3++;
                c0015b = ((C0017d) arrayList.get(i3)).m68a(i3 == size3, c0015b, sparseArray3, sparseArray4);
            }
            m246h();
        }
        return true;
    }

    public boolean m224a(Menu menu) {
        if (this.f175g == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f175g.size(); i++) {
            C0018f c0018f = (C0018f) this.f175g.get(i);
            if (c0018f != null && c0018f.m118c(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean m225a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        C0018f c0018f;
        int i = 0;
        ArrayList arrayList = null;
        if (this.f175g != null) {
            int i2 = 0;
            z = false;
            while (i2 < this.f175g.size()) {
                c0018f = (C0018f) this.f175g.get(i2);
                if (c0018f != null && c0018f.m114b(menu, menuInflater)) {
                    z = true;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c0018f);
                }
                i2++;
                z = z;
            }
        } else {
            z = false;
        }
        if (this.f178j != null) {
            while (i < this.f178j.size()) {
                c0018f = (C0018f) this.f178j.get(i);
                if (arrayList == null || !arrayList.contains(c0018f)) {
                    c0018f.m148t();
                }
                i++;
            }
        }
        this.f178j = arrayList;
        return z;
    }

    public boolean m226a(MenuItem menuItem) {
        if (this.f175g == null) {
            return false;
        }
        for (int i = 0; i < this.f175g.size(); i++) {
            C0018f c0018f = (C0018f) this.f175g.get(i);
            if (c0018f != null && c0018f.m119c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void m227b(int i) {
        synchronized (this) {
            this.f179k.set(i, null);
            if (this.f180l == null) {
                this.f180l = new ArrayList();
            }
            if (f168a) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.f180l.add(Integer.valueOf(i));
        }
    }

    void m228b(C0017d c0017d) {
        if (this.f177i == null) {
            this.f177i = new ArrayList();
        }
        this.f177i.add(c0017d);
        m246h();
    }

    void m229b(C0018f c0018f) {
        m218a(c0018f, this.f182n, 0, 0, false);
    }

    public void m230b(C0018f c0018f, int i, int i2) {
        if (f168a) {
            Log.v("FragmentManager", "hide: " + c0018f);
        }
        if (!c0018f.f95J) {
            c0018f.f95J = true;
            if (c0018f.f104S != null) {
                Animation a = m208a(c0018f, i, false, i2);
                if (a != null) {
                    c0018f.f104S.startAnimation(a);
                }
                c0018f.f104S.setVisibility(8);
            }
            if (c0018f.f123v && c0018f.f99N && c0018f.f100O) {
                this.f186r = true;
            }
            c0018f.m117c(true);
        }
    }

    public void m231b(Menu menu) {
        if (this.f175g != null) {
            for (int i = 0; i < this.f175g.size(); i++) {
                C0018f c0018f = (C0018f) this.f175g.get(i);
                if (c0018f != null) {
                    c0018f.m122d(menu);
                }
            }
        }
    }

    public boolean mo24b() {
        return m245g();
    }

    public boolean m233b(MenuItem menuItem) {
        if (this.f175g == null) {
            return false;
        }
        for (int i = 0; i < this.f175g.size(); i++) {
            C0018f c0018f = (C0018f) this.f175g.get(i);
            if (c0018f != null && c0018f.m124d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public List<C0018f> mo25c() {
        return this.f174f;
    }

    void m235c(C0018f c0018f) {
        if (c0018f.f117p < 0) {
            if (this.f176h == null || this.f176h.size() <= 0) {
                if (this.f174f == null) {
                    this.f174f = new ArrayList();
                }
                c0018f.m99a(this.f174f.size(), this.f185q);
                this.f174f.add(c0018f);
            } else {
                c0018f.m99a(((Integer) this.f176h.remove(this.f176h.size() - 1)).intValue(), this.f185q);
                this.f174f.set(c0018f.f117p, c0018f);
            }
            if (f168a) {
                Log.v("FragmentManager", "Allocated fragment index " + c0018f);
            }
        }
    }

    public void m236c(C0018f c0018f, int i, int i2) {
        if (f168a) {
            Log.v("FragmentManager", "show: " + c0018f);
        }
        if (c0018f.f95J) {
            c0018f.f95J = false;
            if (c0018f.f104S != null) {
                Animation a = m208a(c0018f, i, true, i2);
                if (a != null) {
                    c0018f.f104S.startAnimation(a);
                }
                c0018f.f104S.setVisibility(0);
            }
            if (c0018f.f123v && c0018f.f99N && c0018f.f100O) {
                this.f186r = true;
            }
            c0018f.m117c(false);
        }
    }

    void m237d(C0018f c0018f) {
        if (c0018f.f117p >= 0) {
            if (f168a) {
                Log.v("FragmentManager", "Freeing fragment index " + c0018f);
            }
            this.f174f.set(c0018f.f117p, null);
            if (this.f176h == null) {
                this.f176h = new ArrayList();
            }
            this.f176h.add(Integer.valueOf(c0018f.f117p));
            this.f183o.m180a(c0018f.f118q);
            c0018f.m147s();
        }
    }

    public void m238d(C0018f c0018f, int i, int i2) {
        if (f168a) {
            Log.v("FragmentManager", "detach: " + c0018f);
        }
        if (!c0018f.f96K) {
            c0018f.f96K = true;
            if (c0018f.f123v) {
                if (this.f175g != null) {
                    if (f168a) {
                        Log.v("FragmentManager", "remove from detach: " + c0018f);
                    }
                    this.f175g.remove(c0018f);
                }
                if (c0018f.f99N && c0018f.f100O) {
                    this.f186r = true;
                }
                c0018f.f123v = false;
                m218a(c0018f, 1, i, i2, false);
            }
        }
    }

    public boolean mo26d() {
        return this.f188t;
    }

    void m240e(C0018f c0018f) {
        if (c0018f.f105T != null) {
            if (this.f192x == null) {
                this.f192x = new SparseArray();
            } else {
                this.f192x.clear();
            }
            c0018f.f105T.saveHierarchyState(this.f192x);
            if (this.f192x.size() > 0) {
                c0018f.f116o = this.f192x;
                this.f192x = null;
            }
        }
    }

    public void m241e(C0018f c0018f, int i, int i2) {
        if (f168a) {
            Log.v("FragmentManager", "attach: " + c0018f);
        }
        if (c0018f.f96K) {
            c0018f.f96K = false;
            if (!c0018f.f123v) {
                if (this.f175g == null) {
                    this.f175g = new ArrayList();
                }
                if (this.f175g.contains(c0018f)) {
                    throw new IllegalStateException("Fragment already added: " + c0018f);
                }
                if (f168a) {
                    Log.v("FragmentManager", "add from attach: " + c0018f);
                }
                this.f175g.add(c0018f);
                c0018f.f123v = true;
                if (c0018f.f99N && c0018f.f100O) {
                    this.f186r = true;
                }
                m218a(c0018f, this.f182n, i, i2, false);
            }
        }
    }

    public boolean m242e() {
        m201w();
        mo24b();
        return m223a(this.f183o.f145a, null, -1, 0);
    }

    Bundle m243f(C0018f c0018f) {
        Bundle bundle;
        if (this.f191w == null) {
            this.f191w = new Bundle();
        }
        c0018f.m138k(this.f191w);
        if (this.f191w.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f191w;
            this.f191w = null;
        }
        if (c0018f.f104S != null) {
            m240e(c0018f);
        }
        if (c0018f.f116o != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", c0018f.f116o);
        }
        if (!c0018f.f107V) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", c0018f.f107V);
        }
        return bundle;
    }

    void m244f() {
        if (this.f174f != null) {
            for (int i = 0; i < this.f174f.size(); i++) {
                C0018f c0018f = (C0018f) this.f174f.get(i);
                if (c0018f != null) {
                    m216a(c0018f);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m245g() {
        /*
        r6 = this;
        r0 = 1;
        r2 = 0;
        r1 = r6.f173e;
        if (r1 == 0) goto L_0x000e;
    L_0x0006:
        r0 = new java.lang.IllegalStateException;
        r1 = "Recursive entry to executePendingTransactions";
        r0.<init>(r1);
        throw r0;
    L_0x000e:
        r1 = android.os.Looper.myLooper();
        r3 = r6.f183o;
        r3 = r3.f145a;
        r3 = r3.getLooper();
        if (r1 == r3) goto L_0x0024;
    L_0x001c:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must be called from main thread of process";
        r0.<init>(r1);
        throw r0;
    L_0x0024:
        r1 = r2;
    L_0x0025:
        monitor-enter(r6);
        r3 = r6.f171c;	 Catch:{ all -> 0x0097 }
        if (r3 == 0) goto L_0x0032;
    L_0x002a:
        r3 = r6.f171c;	 Catch:{ all -> 0x0097 }
        r3 = r3.size();	 Catch:{ all -> 0x0097 }
        if (r3 != 0) goto L_0x005a;
    L_0x0032:
        monitor-exit(r6);	 Catch:{ all -> 0x0097 }
        r0 = r6.f190v;
        if (r0 == 0) goto L_0x00a5;
    L_0x0037:
        r3 = r2;
        r4 = r2;
    L_0x0039:
        r0 = r6.f174f;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x009e;
    L_0x0041:
        r0 = r6.f174f;
        r0 = r0.get(r3);
        r0 = (android.support.v4.app.C0018f) r0;
        if (r0 == 0) goto L_0x0056;
    L_0x004b:
        r5 = r0.f108W;
        if (r5 == 0) goto L_0x0056;
    L_0x004f:
        r0 = r0.f108W;
        r0 = r0.mo38a();
        r4 = r4 | r0;
    L_0x0056:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0039;
    L_0x005a:
        r1 = r6.f171c;	 Catch:{ all -> 0x0097 }
        r3 = r1.size();	 Catch:{ all -> 0x0097 }
        r1 = r6.f172d;	 Catch:{ all -> 0x0097 }
        if (r1 == 0) goto L_0x0069;
    L_0x0064:
        r1 = r6.f172d;	 Catch:{ all -> 0x0097 }
        r1 = r1.length;	 Catch:{ all -> 0x0097 }
        if (r1 >= r3) goto L_0x006d;
    L_0x0069:
        r1 = new java.lang.Runnable[r3];	 Catch:{ all -> 0x0097 }
        r6.f172d = r1;	 Catch:{ all -> 0x0097 }
    L_0x006d:
        r1 = r6.f171c;	 Catch:{ all -> 0x0097 }
        r4 = r6.f172d;	 Catch:{ all -> 0x0097 }
        r1.toArray(r4);	 Catch:{ all -> 0x0097 }
        r1 = r6.f171c;	 Catch:{ all -> 0x0097 }
        r1.clear();	 Catch:{ all -> 0x0097 }
        r1 = r6.f183o;	 Catch:{ all -> 0x0097 }
        r1 = r1.f145a;	 Catch:{ all -> 0x0097 }
        r4 = r6.f193y;	 Catch:{ all -> 0x0097 }
        r1.removeCallbacks(r4);	 Catch:{ all -> 0x0097 }
        monitor-exit(r6);	 Catch:{ all -> 0x0097 }
        r6.f173e = r0;
        r1 = r2;
    L_0x0086:
        if (r1 >= r3) goto L_0x009a;
    L_0x0088:
        r4 = r6.f172d;
        r4 = r4[r1];
        r4.run();
        r4 = r6.f172d;
        r5 = 0;
        r4[r1] = r5;
        r1 = r1 + 1;
        goto L_0x0086;
    L_0x0097:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0097 }
        throw r0;
    L_0x009a:
        r6.f173e = r2;
        r1 = r0;
        goto L_0x0025;
    L_0x009e:
        if (r4 != 0) goto L_0x00a5;
    L_0x00a0:
        r6.f190v = r2;
        r6.m244f();
    L_0x00a5:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.j.g():boolean");
    }

    void m246h() {
        if (this.f181m != null) {
            for (int i = 0; i < this.f181m.size(); i++) {
                ((C0027a) this.f181m.get(i)).m188a();
            }
        }
    }

    ArrayList<C0018f> m247i() {
        ArrayList<C0018f> arrayList = null;
        if (this.f174f != null) {
            for (int i = 0; i < this.f174f.size(); i++) {
                C0018f c0018f = (C0018f) this.f174f.get(i);
                if (c0018f != null && c0018f.f97L) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c0018f);
                    c0018f.f98M = true;
                    c0018f.f121t = c0018f.f120s != null ? c0018f.f120s.f117p : -1;
                    if (f168a) {
                        Log.v("FragmentManager", "retainNonConfig: keeping retained " + c0018f);
                    }
                }
            }
        }
        return arrayList;
    }

    Parcelable m248j() {
        BackStackState[] backStackStateArr = null;
        m245g();
        if (f169b) {
            this.f187s = true;
        }
        if (this.f174f == null || this.f174f.size() <= 0) {
            return null;
        }
        int size = this.f174f.size();
        FragmentState[] fragmentStateArr = new FragmentState[size];
        int i = 0;
        boolean z = false;
        while (i < size) {
            boolean z2;
            C0018f c0018f = (C0018f) this.f174f.get(i);
            if (c0018f != null) {
                if (c0018f.f117p < 0) {
                    m198a(new IllegalStateException("Failure saving state: active " + c0018f + " has cleared index: " + c0018f.f117p));
                }
                FragmentState fragmentState = new FragmentState(c0018f);
                fragmentStateArr[i] = fragmentState;
                if (c0018f.f112k <= 0 || fragmentState.f31j != null) {
                    fragmentState.f31j = c0018f.f115n;
                } else {
                    fragmentState.f31j = m243f(c0018f);
                    if (c0018f.f120s != null) {
                        if (c0018f.f120s.f117p < 0) {
                            m198a(new IllegalStateException("Failure saving state: " + c0018f + " has target not in fragment manager: " + c0018f.f120s));
                        }
                        if (fragmentState.f31j == null) {
                            fragmentState.f31j = new Bundle();
                        }
                        m214a(fragmentState.f31j, "android:target_state", c0018f.f120s);
                        if (c0018f.f122u != 0) {
                            fragmentState.f31j.putInt("android:target_req_state", c0018f.f122u);
                        }
                    }
                }
                if (f168a) {
                    Log.v("FragmentManager", "Saved state of " + c0018f + ": " + fragmentState.f31j);
                }
                z2 = true;
            } else {
                z2 = z;
            }
            i++;
            z = z2;
        }
        if (z) {
            int[] iArr;
            int i2;
            FragmentManagerState fragmentManagerState;
            if (this.f175g != null) {
                i = this.f175g.size();
                if (i > 0) {
                    iArr = new int[i];
                    for (i2 = 0; i2 < i; i2++) {
                        iArr[i2] = ((C0018f) this.f175g.get(i2)).f117p;
                        if (iArr[i2] < 0) {
                            m198a(new IllegalStateException("Failure saving state: active " + this.f175g.get(i2) + " has cleared index: " + iArr[i2]));
                        }
                        if (f168a) {
                            Log.v("FragmentManager", "saveAllState: adding fragment #" + i2 + ": " + this.f175g.get(i2));
                        }
                    }
                    if (this.f177i != null) {
                        i = this.f177i.size();
                        if (i > 0) {
                            backStackStateArr = new BackStackState[i];
                            for (i2 = 0; i2 < i; i2++) {
                                backStackStateArr[i2] = new BackStackState(this, (C0017d) this.f177i.get(i2));
                                if (f168a) {
                                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f177i.get(i2));
                                }
                            }
                        }
                    }
                    fragmentManagerState = new FragmentManagerState();
                    fragmentManagerState.f19a = fragmentStateArr;
                    fragmentManagerState.f20b = iArr;
                    fragmentManagerState.f21c = backStackStateArr;
                    return fragmentManagerState;
                }
            }
            iArr = null;
            if (this.f177i != null) {
                i = this.f177i.size();
                if (i > 0) {
                    backStackStateArr = new BackStackState[i];
                    for (i2 = 0; i2 < i; i2++) {
                        backStackStateArr[i2] = new BackStackState(this, (C0017d) this.f177i.get(i2));
                        if (f168a) {
                            Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f177i.get(i2));
                        }
                    }
                }
            }
            fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f19a = fragmentStateArr;
            fragmentManagerState.f20b = iArr;
            fragmentManagerState.f21c = backStackStateArr;
            return fragmentManagerState;
        } else if (!f168a) {
            return null;
        } else {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
    }

    public void m249k() {
        this.f187s = false;
    }

    public void m250l() {
        this.f187s = false;
        m212a(1, false);
    }

    public void m251m() {
        this.f187s = false;
        m212a(2, false);
    }

    public void m252n() {
        this.f187s = false;
        m212a(4, false);
    }

    public void m253o() {
        this.f187s = false;
        m212a(5, false);
    }

    public void m254p() {
        m212a(4, false);
    }

    public void m255q() {
        this.f187s = true;
        m212a(3, false);
    }

    public void m256r() {
        m212a(2, false);
    }

    public void m257s() {
        m212a(1, false);
    }

    public void m258t() {
        this.f188t = true;
        m245g();
        m212a(0, false);
        this.f183o = null;
        this.f184p = null;
        this.f185q = null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        if (this.f185q != null) {
            C0089c.m474a(this.f185q, stringBuilder);
        } else {
            C0089c.m474a(this.f183o, stringBuilder);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public void m259u() {
        if (this.f175g != null) {
            for (int i = 0; i < this.f175g.size(); i++) {
                C0018f c0018f = (C0018f) this.f175g.get(i);
                if (c0018f != null) {
                    c0018f.m89F();
                }
            }
        }
    }

    C0033m m260v() {
        return this;
    }
}
