package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.p007f.C0086g;
import android.support.v4.p007f.C0089c;
import android.support.v4.view.C0190i;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class C0018f implements ComponentCallbacks, OnCreateContextMenuListener {
    private static final C0086g<String, Class<?>> f84a = new C0086g();
    static final Object f85j = new Object();
    boolean f86A;
    int f87B;
    C0034j f88C;
    C0026g f89D;
    C0034j f90E;
    C0018f f91F;
    int f92G;
    int f93H;
    String f94I;
    boolean f95J;
    boolean f96K;
    boolean f97L;
    boolean f98M;
    boolean f99N;
    boolean f100O = true;
    boolean f101P;
    int f102Q;
    ViewGroup f103R;
    View f104S;
    View f105T;
    boolean f106U;
    boolean f107V = true;
    C0046o f108W;
    boolean f109X;
    boolean f110Y;
    Object f111Z = null;
    Object aa = f85j;
    Object ab = null;
    Object ac = f85j;
    Object ad = null;
    Object ae = f85j;
    Boolean af;
    Boolean ag;
    C0048q ah = null;
    C0048q ai = null;
    int f112k = 0;
    View f113l;
    int f114m;
    Bundle f115n;
    SparseArray<Parcelable> f116o;
    int f117p = -1;
    String f118q;
    Bundle f119r;
    C0018f f120s;
    int f121t = -1;
    int f122u;
    boolean f123v;
    boolean f124w;
    boolean f125x;
    boolean f126y;
    boolean f127z;

    class C00211 implements C0020h {
        final /* synthetic */ C0018f f137a;

        C00211(C0018f c0018f) {
            this.f137a = c0018f;
        }

        public View mo18a(int i) {
            if (this.f137a.f104S != null) {
                return this.f137a.f104S.findViewById(i);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        public boolean mo19a() {
            return this.f137a.f104S != null;
        }
    }

    public static class C0022a extends RuntimeException {
        public C0022a(String str, Exception exception) {
            super(str, exception);
        }
    }

    public static C0018f m81a(Context context, String str) {
        return C0018f.m82a(context, str, null);
    }

    public static C0018f m82a(Context context, String str, Bundle bundle) {
        try {
            Class cls = (Class) f84a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f84a.put(str, cls);
            }
            C0018f c0018f = (C0018f) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(c0018f.getClass().getClassLoader());
                c0018f.f119r = bundle;
            }
            return c0018f;
        } catch (Exception e) {
            throw new C0022a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e);
        } catch (Exception e2) {
            throw new C0022a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (Exception e22) {
            throw new C0022a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e22);
        }
    }

    static boolean m83b(Context context, String str) {
        try {
            Class cls = (Class) f84a.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f84a.put(str, cls);
            }
            return C0018f.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public boolean m84A() {
        return this.ag == null ? true : this.ag.booleanValue();
    }

    public boolean m85B() {
        return this.af == null ? true : this.af.booleanValue();
    }

    void m86C() {
        this.f90E = new C0034j();
        this.f90E.m220a(this.f89D, new C00211(this), this);
    }

    void m87D() {
        if (this.f90E != null) {
            this.f90E.m249k();
            this.f90E.m245g();
        }
        this.f101P = false;
        mo13c();
        if (this.f101P) {
            if (this.f90E != null) {
                this.f90E.m252n();
            }
            if (this.f108W != null) {
                this.f108W.m342g();
                return;
            }
            return;
        }
        throw new C0049r("Fragment " + this + " did not call through to super.onStart()");
    }

    void m88E() {
        if (this.f90E != null) {
            this.f90E.m249k();
            this.f90E.m245g();
        }
        this.f101P = false;
        mo1680p();
        if (!this.f101P) {
            throw new C0049r("Fragment " + this + " did not call through to super.onResume()");
        } else if (this.f90E != null) {
            this.f90E.m253o();
            this.f90E.m245g();
        }
    }

    void m89F() {
        onLowMemory();
        if (this.f90E != null) {
            this.f90E.m259u();
        }
    }

    void m90G() {
        if (this.f90E != null) {
            this.f90E.m254p();
        }
        this.f101P = false;
        mo1681q();
        if (!this.f101P) {
            throw new C0049r("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    void m91H() {
        if (this.f90E != null) {
            this.f90E.m255q();
        }
        this.f101P = false;
        mo14d();
        if (!this.f101P) {
            throw new C0049r("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    void m92I() {
        if (this.f90E != null) {
            this.f90E.m256r();
        }
        if (this.f109X) {
            this.f109X = false;
            if (!this.f110Y) {
                this.f110Y = true;
                this.f108W = this.f89D.m176a(this.f118q, this.f109X, false);
            }
            if (this.f108W == null) {
                return;
            }
            if (this.f89D.f152h) {
                this.f108W.m339d();
            } else {
                this.f108W.m338c();
            }
        }
    }

    void m93J() {
        if (this.f90E != null) {
            this.f90E.m257s();
        }
        this.f101P = false;
        mo16e();
        if (!this.f101P) {
            throw new C0049r("Fragment " + this + " did not call through to super.onDestroyView()");
        } else if (this.f108W != null) {
            this.f108W.m341f();
        }
    }

    void m94K() {
        if (this.f90E != null) {
            this.f90E.m258t();
        }
        this.f101P = false;
        m146r();
        if (!this.f101P) {
            throw new C0049r("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public View mo1679a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public Animation m96a(int i, boolean z, int i2) {
        return null;
    }

    public final String m97a(int i) {
        return m132h().getString(i);
    }

    public void mo890a(int i, int i2, Intent intent) {
    }

    final void m99a(int i, C0018f c0018f) {
        this.f117p = i;
        if (c0018f != null) {
            this.f118q = c0018f.f118q + ":" + this.f117p;
        } else {
            this.f118q = "android:fragment:" + this.f117p;
        }
    }

    public void mo9a(Activity activity) {
        this.f101P = true;
    }

    public void m101a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f101P = true;
    }

    public void m102a(Intent intent) {
        if (this.f89D == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f89D.m179a(this, intent, -1);
    }

    public void m103a(Intent intent, int i) {
        if (this.f89D == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f89D.m179a(this, intent, i);
    }

    void m104a(Configuration configuration) {
        onConfigurationChanged(configuration);
        if (this.f90E != null) {
            this.f90E.m213a(configuration);
        }
    }

    public void m105a(Menu menu) {
    }

    public void m106a(Menu menu, MenuInflater menuInflater) {
    }

    public void m107a(View view, Bundle bundle) {
    }

    public void mo891a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f92G));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f93H));
        printWriter.print(" mTag=");
        printWriter.println(this.f94I);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f112k);
        printWriter.print(" mIndex=");
        printWriter.print(this.f117p);
        printWriter.print(" mWho=");
        printWriter.print(this.f118q);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f87B);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f123v);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f124w);
        printWriter.print(" mResumed=");
        printWriter.print(this.f125x);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f126y);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f127z);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f95J);
        printWriter.print(" mDetached=");
        printWriter.print(this.f96K);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f100O);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f99N);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f97L);
        printWriter.print(" mRetaining=");
        printWriter.print(this.f98M);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f107V);
        if (this.f88C != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f88C);
        }
        if (this.f89D != null) {
            printWriter.print(str);
            printWriter.print("mActivity=");
            printWriter.println(this.f89D);
        }
        if (this.f91F != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f91F);
        }
        if (this.f119r != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f119r);
        }
        if (this.f115n != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f115n);
        }
        if (this.f116o != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f116o);
        }
        if (this.f120s != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.f120s);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f122u);
        }
        if (this.f102Q != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(this.f102Q);
        }
        if (this.f103R != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f103R);
        }
        if (this.f104S != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f104S);
        }
        if (this.f105T != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.f104S);
        }
        if (this.f113l != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.f113l);
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.f114m);
        }
        if (this.f108W != null) {
            printWriter.print(str);
            printWriter.println("Loader Manager:");
            this.f108W.m333a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        if (this.f90E != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.f90E + ":");
            this.f90E.m222a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public boolean m109a(MenuItem menuItem) {
        return false;
    }

    public void a_(Bundle bundle) {
        this.f101P = true;
    }

    public LayoutInflater mo11b(Bundle bundle) {
        LayoutInflater cloneInContext = this.f89D.getLayoutInflater().cloneInContext(this.f89D);
        m136j();
        C0190i.m930a(cloneInContext, this.f90E.m260v());
        return cloneInContext;
    }

    View m111b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f90E != null) {
            this.f90E.m249k();
        }
        return mo1679a(layoutInflater, viewGroup, bundle);
    }

    public void mo12b() {
        this.f101P = true;
    }

    public void m113b(Menu menu) {
    }

    boolean m114b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f95J) {
            return false;
        }
        if (this.f99N && this.f100O) {
            z = true;
            m106a(menu, menuInflater);
        }
        return this.f90E != null ? z | this.f90E.m225a(menu, menuInflater) : z;
    }

    public boolean m115b(MenuItem menuItem) {
        return false;
    }

    public void mo13c() {
        this.f101P = true;
        if (!this.f109X) {
            this.f109X = true;
            if (!this.f110Y) {
                this.f110Y = true;
                this.f108W = this.f89D.m176a(this.f118q, this.f109X, false);
            }
            if (this.f108W != null) {
                this.f108W.m337b();
            }
        }
    }

    public void m117c(boolean z) {
    }

    boolean m118c(Menu menu) {
        boolean z = false;
        if (this.f95J) {
            return false;
        }
        if (this.f99N && this.f100O) {
            z = true;
            m105a(menu);
        }
        return this.f90E != null ? z | this.f90E.m224a(menu) : z;
    }

    boolean m119c(MenuItem menuItem) {
        if (!this.f95J) {
            if (this.f99N && this.f100O && m109a(menuItem)) {
                return true;
            }
            if (this.f90E != null && this.f90E.m226a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void mo14d() {
        this.f101P = true;
    }

    public void mo15d(Bundle bundle) {
        this.f101P = true;
    }

    void m122d(Menu menu) {
        if (!this.f95J) {
            if (this.f99N && this.f100O) {
                m113b(menu);
            }
            if (this.f90E != null) {
                this.f90E.m231b(menu);
            }
        }
    }

    public void m123d(boolean z) {
        if (this.f100O != z) {
            this.f100O = z;
            if (this.f99N && m139k() && !m141m()) {
                this.f89D.m185d();
            }
        }
    }

    boolean m124d(MenuItem menuItem) {
        if (!this.f95J) {
            if (m115b(menuItem)) {
                return true;
            }
            if (this.f90E != null && this.f90E.m233b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void mo16e() {
        this.f101P = true;
    }

    public void mo17e(Bundle bundle) {
    }

    public void m127e(boolean z) {
        if (!this.f107V && z && this.f112k < 4) {
            this.f88C.m216a(this);
        }
        this.f107V = z;
        this.f106U = !z;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    final void m128f(Bundle bundle) {
        if (this.f116o != null) {
            this.f105T.restoreHierarchyState(this.f116o);
            this.f116o = null;
        }
        this.f101P = false;
        m133h(bundle);
        if (!this.f101P) {
            throw new C0049r("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    final boolean m129f() {
        return this.f87B > 0;
    }

    public final C0026g m130g() {
        return this.f89D;
    }

    public void m131g(Bundle bundle) {
        if (this.f117p >= 0) {
            throw new IllegalStateException("Fragment already active");
        }
        this.f119r = bundle;
    }

    public final Resources m132h() {
        if (this.f89D != null) {
            return this.f89D.getResources();
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void m133h(Bundle bundle) {
        this.f101P = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final C0028i m134i() {
        return this.f88C;
    }

    void m135i(Bundle bundle) {
        if (this.f90E != null) {
            this.f90E.m249k();
        }
        this.f101P = false;
        a_(bundle);
        if (!this.f101P) {
            throw new C0049r("Fragment " + this + " did not call through to super.onCreate()");
        } else if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                if (this.f90E == null) {
                    m86C();
                }
                this.f90E.m215a(parcelable, null);
                this.f90E.m250l();
            }
        }
    }

    public final C0028i m136j() {
        if (this.f90E == null) {
            m86C();
            if (this.f112k >= 5) {
                this.f90E.m253o();
            } else if (this.f112k >= 4) {
                this.f90E.m252n();
            } else if (this.f112k >= 2) {
                this.f90E.m251m();
            } else if (this.f112k >= 1) {
                this.f90E.m250l();
            }
        }
        return this.f90E;
    }

    void m137j(Bundle bundle) {
        if (this.f90E != null) {
            this.f90E.m249k();
        }
        this.f101P = false;
        mo15d(bundle);
        if (!this.f101P) {
            throw new C0049r("Fragment " + this + " did not call through to super.onActivityCreated()");
        } else if (this.f90E != null) {
            this.f90E.m251m();
        }
    }

    void m138k(Bundle bundle) {
        mo17e(bundle);
        if (this.f90E != null) {
            Parcelable j = this.f90E.m248j();
            if (j != null) {
                bundle.putParcelable("android:support:fragments", j);
            }
        }
    }

    public final boolean m139k() {
        return this.f89D != null && this.f123v;
    }

    public final boolean m140l() {
        return this.f124w;
    }

    public final boolean m141m() {
        return this.f95J;
    }

    public C0044n m142n() {
        if (this.f108W != null) {
            return this.f108W;
        }
        if (this.f89D == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        this.f110Y = true;
        this.f108W = this.f89D.m176a(this.f118q, this.f109X, true);
        return this.f108W;
    }

    public View m143o() {
        return this.f104S;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f101P = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        m130g().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f101P = true;
    }

    public void mo1680p() {
        this.f101P = true;
    }

    public void mo1681q() {
        this.f101P = true;
    }

    public void m146r() {
        this.f101P = true;
        if (!this.f110Y) {
            this.f110Y = true;
            this.f108W = this.f89D.m176a(this.f118q, this.f109X, false);
        }
        if (this.f108W != null) {
            this.f108W.m343h();
        }
    }

    void m147s() {
        this.f117p = -1;
        this.f118q = null;
        this.f123v = false;
        this.f124w = false;
        this.f125x = false;
        this.f126y = false;
        this.f127z = false;
        this.f86A = false;
        this.f87B = 0;
        this.f88C = null;
        this.f90E = null;
        this.f89D = null;
        this.f92G = 0;
        this.f93H = 0;
        this.f94I = null;
        this.f95J = false;
        this.f96K = false;
        this.f98M = false;
        this.f108W = null;
        this.f109X = false;
        this.f110Y = false;
    }

    public void m148t() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        C0089c.m474a(this, stringBuilder);
        if (this.f117p >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f117p);
        }
        if (this.f92G != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.f92G));
        }
        if (this.f94I != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.f94I);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public Object m149u() {
        return this.f111Z;
    }

    public Object m150v() {
        return this.aa == f85j ? m149u() : this.aa;
    }

    public Object m151w() {
        return this.ab;
    }

    public Object m152x() {
        return this.ac == f85j ? m151w() : this.ac;
    }

    public Object m153y() {
        return this.ad;
    }

    public Object m154z() {
        return this.ae == f85j ? m153y() : this.ae;
    }
}
