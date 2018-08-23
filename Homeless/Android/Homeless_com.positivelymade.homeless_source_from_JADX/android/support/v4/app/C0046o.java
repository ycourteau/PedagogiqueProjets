package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.app.C0044n.C0043a;
import android.support.v4.p000a.C0003c;
import android.support.v4.p000a.C0003c.C0002a;
import android.support.v4.p007f.C0089c;
import android.support.v4.p007f.C0097h;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class C0046o extends C0044n {
    static boolean f235a = false;
    final C0097h<C0045a> f236b = new C0097h();
    final C0097h<C0045a> f237c = new C0097h();
    final String f238d;
    C0026g f239e;
    boolean f240f;
    boolean f241g;
    boolean f242h;

    final class C0045a implements C0002a<Object> {
        final int f220a;
        final Bundle f221b;
        C0043a<Object> f222c;
        C0003c<Object> f223d;
        boolean f224e;
        boolean f225f;
        Object f226g;
        boolean f227h;
        boolean f228i;
        boolean f229j;
        boolean f230k;
        boolean f231l;
        boolean f232m;
        C0045a f233n;
        final /* synthetic */ C0046o f234o;

        public C0045a(C0046o c0046o, int i, Bundle bundle, C0043a<Object> c0043a) {
            this.f234o = c0046o;
            this.f220a = i;
            this.f221b = bundle;
            this.f222c = c0043a;
        }

        void m318a() {
            if (this.f228i && this.f229j) {
                this.f227h = true;
            } else if (!this.f227h) {
                this.f227h = true;
                if (C0046o.f235a) {
                    Log.v("LoaderManager", "  Starting: " + this);
                }
                if (this.f223d == null && this.f222c != null) {
                    this.f223d = this.f222c.mo896a(this.f220a, this.f221b);
                }
                if (this.f223d == null) {
                    return;
                }
                if (!this.f223d.getClass().isMemberClass() || Modifier.isStatic(this.f223d.getClass().getModifiers())) {
                    if (!this.f232m) {
                        this.f223d.m4a(this.f220a, this);
                        this.f232m = true;
                    }
                    this.f223d.m11d();
                    return;
                }
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.f223d);
            }
        }

        public void mo35a(C0003c<Object> c0003c, Object obj) {
            if (C0046o.f235a) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (this.f231l) {
                if (C0046o.f235a) {
                    Log.v("LoaderManager", "  Ignoring load complete -- destroyed");
                }
            } else if (this.f234o.f236b.m487a(this.f220a) == this) {
                C0045a c0045a = this.f233n;
                if (c0045a != null) {
                    if (C0046o.f235a) {
                        Log.v("LoaderManager", "  Switching to pending loader: " + c0045a);
                    }
                    this.f233n = null;
                    this.f234o.f236b.m491b(this.f220a, null);
                    m326f();
                    this.f234o.m332a(c0045a);
                    return;
                }
                if (!(this.f226g == obj && this.f224e)) {
                    this.f226g = obj;
                    this.f224e = true;
                    if (this.f227h) {
                        m322b(c0003c, obj);
                    }
                }
                c0045a = (C0045a) this.f234o.f237c.m487a(this.f220a);
                if (!(c0045a == null || c0045a == this)) {
                    c0045a.f225f = false;
                    c0045a.m326f();
                    this.f234o.f237c.m493c(this.f220a);
                }
                if (this.f234o.f239e != null && !this.f234o.mo38a()) {
                    this.f234o.f239e.f146b.m244f();
                }
            } else if (C0046o.f235a) {
                Log.v("LoaderManager", "  Ignoring load complete -- not active");
            }
        }

        public void m320a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f220a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f221b);
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.f222c);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f223d);
            if (this.f223d != null) {
                this.f223d.mo892a(str + "  ", fileDescriptor, printWriter, strArr);
            }
            if (this.f224e || this.f225f) {
                printWriter.print(str);
                printWriter.print("mHaveData=");
                printWriter.print(this.f224e);
                printWriter.print("  mDeliveredData=");
                printWriter.println(this.f225f);
                printWriter.print(str);
                printWriter.print("mData=");
                printWriter.println(this.f226g);
            }
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f227h);
            printWriter.print(" mReportNextStart=");
            printWriter.print(this.f230k);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.f231l);
            printWriter.print(str);
            printWriter.print("mRetaining=");
            printWriter.print(this.f228i);
            printWriter.print(" mRetainingStarted=");
            printWriter.print(this.f229j);
            printWriter.print(" mListenerRegistered=");
            printWriter.println(this.f232m);
            if (this.f233n != null) {
                printWriter.print(str);
                printWriter.println("Pending Loader ");
                printWriter.print(this.f233n);
                printWriter.println(":");
                this.f233n.m320a(str + "  ", fileDescriptor, printWriter, strArr);
            }
        }

        void m321b() {
            if (C0046o.f235a) {
                Log.v("LoaderManager", "  Retaining: " + this);
            }
            this.f228i = true;
            this.f229j = this.f227h;
            this.f227h = false;
            this.f222c = null;
        }

        void m322b(C0003c<Object> c0003c, Object obj) {
            String str;
            if (this.f222c != null) {
                if (this.f234o.f239e != null) {
                    String str2 = this.f234o.f239e.f146b.f189u;
                    this.f234o.f239e.f146b.f189u = "onLoadFinished";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    if (C0046o.f235a) {
                        Log.v("LoaderManager", "  onLoadFinished in " + c0003c + ": " + c0003c.m8b(obj));
                    }
                    this.f222c.mo898a((C0003c) c0003c, obj);
                    this.f225f = true;
                } finally {
                    if (this.f234o.f239e != null) {
                        this.f234o.f239e.f146b.f189u = str;
                    }
                }
            }
        }

        void m323c() {
            if (this.f228i) {
                if (C0046o.f235a) {
                    Log.v("LoaderManager", "  Finished Retaining: " + this);
                }
                this.f228i = false;
                if (!(this.f227h == this.f229j || this.f227h)) {
                    m325e();
                }
            }
            if (this.f227h && this.f224e && !this.f230k) {
                m322b(this.f223d, this.f226g);
            }
        }

        void m324d() {
            if (this.f227h && this.f230k) {
                this.f230k = false;
                if (this.f224e) {
                    m322b(this.f223d, this.f226g);
                }
            }
        }

        void m325e() {
            if (C0046o.f235a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f227h = false;
            if (!this.f228i && this.f223d != null && this.f232m) {
                this.f232m = false;
                this.f223d.m5a((C0002a) this);
                this.f223d.m13f();
            }
        }

        void m326f() {
            String str;
            C0043a c0043a = null;
            if (C0046o.f235a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f231l = true;
            boolean z = this.f225f;
            this.f225f = false;
            if (this.f222c != null && this.f223d != null && this.f224e && z) {
                if (C0046o.f235a) {
                    Log.v("LoaderManager", "  Reseting: " + this);
                }
                if (this.f234o.f239e != null) {
                    String str2 = this.f234o.f239e.f146b.f189u;
                    this.f234o.f239e.f146b.f189u = "onLoaderReset";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    this.f222c.mo897a(this.f223d);
                } finally {
                    c0043a = this.f234o.f239e;
                    if (c0043a != null) {
                        c0043a = this.f234o.f239e.f146b;
                        c0043a.f189u = str;
                    }
                }
            }
            this.f222c = c0043a;
            this.f226g = c0043a;
            this.f224e = false;
            if (this.f223d != null) {
                if (this.f232m) {
                    this.f232m = false;
                    this.f223d.m5a((C0002a) this);
                }
                this.f223d.m17j();
            }
            if (this.f233n != null) {
                this.f233n.m326f();
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("LoaderInfo{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" #");
            stringBuilder.append(this.f220a);
            stringBuilder.append(" : ");
            C0089c.m474a(this.f223d, stringBuilder);
            stringBuilder.append("}}");
            return stringBuilder.toString();
        }
    }

    C0046o(String str, C0026g c0026g, boolean z) {
        this.f238d = str;
        this.f239e = c0026g;
        this.f240f = z;
    }

    private C0045a m327c(int i, Bundle bundle, C0043a<Object> c0043a) {
        C0045a c0045a = new C0045a(this, i, bundle, c0043a);
        c0045a.f223d = c0043a.mo896a(i, bundle);
        return c0045a;
    }

    private C0045a m328d(int i, Bundle bundle, C0043a<Object> c0043a) {
        try {
            this.f242h = true;
            C0045a c = m327c(i, bundle, c0043a);
            m332a(c);
            return c;
        } finally {
            this.f242h = false;
        }
    }

    public <D> C0003c<D> mo36a(int i, Bundle bundle, C0043a<D> c0043a) {
        if (this.f242h) {
            throw new IllegalStateException("Called while creating a loader");
        }
        C0045a c0045a = (C0045a) this.f236b.m487a(i);
        if (f235a) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (c0045a == null) {
            c0045a = m328d(i, bundle, c0043a);
            if (f235a) {
                Log.v("LoaderManager", "  Created new loader " + c0045a);
            }
        } else {
            if (f235a) {
                Log.v("LoaderManager", "  Re-using existing loader " + c0045a);
            }
            c0045a.f222c = c0043a;
        }
        if (c0045a.f224e && this.f240f) {
            c0045a.m322b(c0045a.f223d, c0045a.f226g);
        }
        return c0045a.f223d;
    }

    public void mo37a(int i) {
        if (this.f242h) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (f235a) {
            Log.v("LoaderManager", "destroyLoader in " + this + " of " + i);
        }
        int g = this.f236b.m497g(i);
        if (g >= 0) {
            C0045a c0045a = (C0045a) this.f236b.m496f(g);
            this.f236b.m494d(g);
            c0045a.m326f();
        }
        g = this.f237c.m497g(i);
        if (g >= 0) {
            c0045a = (C0045a) this.f237c.m496f(g);
            this.f237c.m494d(g);
            c0045a.m326f();
        }
        if (this.f239e != null && !mo38a()) {
            this.f239e.f146b.m244f();
        }
    }

    void m331a(C0026g c0026g) {
        this.f239e = c0026g;
    }

    void m332a(C0045a c0045a) {
        this.f236b.m491b(c0045a.f220a, c0045a);
        if (this.f240f) {
            c0045a.m318a();
        }
    }

    public void m333a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 0;
        if (this.f236b.m489b() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i2 = 0; i2 < this.f236b.m489b(); i2++) {
                C0045a c0045a = (C0045a) this.f236b.m496f(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f236b.m495e(i2));
                printWriter.print(": ");
                printWriter.println(c0045a.toString());
                c0045a.m320a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.f237c.m489b() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            while (i < this.f237c.m489b()) {
                c0045a = (C0045a) this.f237c.m496f(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f237c.m495e(i));
                printWriter.print(": ");
                printWriter.println(c0045a.toString());
                c0045a.m320a(str3, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    public boolean mo38a() {
        int b = this.f236b.m489b();
        boolean z = false;
        for (int i = 0; i < b; i++) {
            C0045a c0045a = (C0045a) this.f236b.m496f(i);
            int i2 = (!c0045a.f227h || c0045a.f225f) ? 0 : 1;
            z |= i2;
        }
        return z;
    }

    public <D> C0003c<D> mo39b(int i) {
        if (this.f242h) {
            throw new IllegalStateException("Called while creating a loader");
        }
        C0045a c0045a = (C0045a) this.f236b.m487a(i);
        return c0045a != null ? c0045a.f233n != null ? c0045a.f233n.f223d : c0045a.f223d : null;
    }

    public <D> C0003c<D> mo40b(int i, Bundle bundle, C0043a<D> c0043a) {
        if (this.f242h) {
            throw new IllegalStateException("Called while creating a loader");
        }
        C0045a c0045a = (C0045a) this.f236b.m487a(i);
        if (f235a) {
            Log.v("LoaderManager", "restartLoader in " + this + ": args=" + bundle);
        }
        if (c0045a != null) {
            C0045a c0045a2 = (C0045a) this.f237c.m487a(i);
            if (c0045a2 == null) {
                if (f235a) {
                    Log.v("LoaderManager", "  Making last loader inactive: " + c0045a);
                }
                c0045a.f223d.m15h();
                this.f237c.m491b(i, c0045a);
            } else if (c0045a.f224e) {
                if (f235a) {
                    Log.v("LoaderManager", "  Removing last inactive loader: " + c0045a);
                }
                c0045a2.f225f = false;
                c0045a2.m326f();
                c0045a.f223d.m15h();
                this.f237c.m491b(i, c0045a);
            } else if (c0045a.f227h) {
                if (c0045a.f233n != null) {
                    if (f235a) {
                        Log.v("LoaderManager", "  Removing pending loader: " + c0045a.f233n);
                    }
                    c0045a.f233n.m326f();
                    c0045a.f233n = null;
                }
                if (f235a) {
                    Log.v("LoaderManager", "  Enqueuing as new pending loader");
                }
                c0045a.f233n = m327c(i, bundle, c0043a);
                return c0045a.f233n.f223d;
            } else {
                if (f235a) {
                    Log.v("LoaderManager", "  Current loader is stopped; replacing");
                }
                this.f236b.m491b(i, null);
                c0045a.m326f();
            }
        }
        return m328d(i, bundle, c0043a).f223d;
    }

    void m337b() {
        if (f235a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f240f) {
            Throwable runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.f240f = true;
        for (int b = this.f236b.m489b() - 1; b >= 0; b--) {
            ((C0045a) this.f236b.m496f(b)).m318a();
        }
    }

    void m338c() {
        if (f235a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (this.f240f) {
            for (int b = this.f236b.m489b() - 1; b >= 0; b--) {
                ((C0045a) this.f236b.m496f(b)).m325e();
            }
            this.f240f = false;
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
    }

    void m339d() {
        if (f235a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (this.f240f) {
            this.f241g = true;
            this.f240f = false;
            for (int b = this.f236b.m489b() - 1; b >= 0; b--) {
                ((C0045a) this.f236b.m496f(b)).m321b();
            }
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
    }

    void m340e() {
        if (this.f241g) {
            if (f235a) {
                Log.v("LoaderManager", "Finished Retaining in " + this);
            }
            this.f241g = false;
            for (int b = this.f236b.m489b() - 1; b >= 0; b--) {
                ((C0045a) this.f236b.m496f(b)).m323c();
            }
        }
    }

    void m341f() {
        for (int b = this.f236b.m489b() - 1; b >= 0; b--) {
            ((C0045a) this.f236b.m496f(b)).f230k = true;
        }
    }

    void m342g() {
        for (int b = this.f236b.m489b() - 1; b >= 0; b--) {
            ((C0045a) this.f236b.m496f(b)).m324d();
        }
    }

    void m343h() {
        int b;
        if (!this.f241g) {
            if (f235a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (b = this.f236b.m489b() - 1; b >= 0; b--) {
                ((C0045a) this.f236b.m496f(b)).m326f();
            }
            this.f236b.m492c();
        }
        if (f235a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (b = this.f237c.m489b() - 1; b >= 0; b--) {
            ((C0045a) this.f237c.m496f(b)).m326f();
        }
        this.f237c.m492c();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        C0089c.m474a(this.f239e, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
