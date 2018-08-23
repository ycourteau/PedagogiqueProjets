package android.support.v4.p000a;

import android.content.Context;
import android.support.v4.p007f.C0089c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class C0003c<D> {
    int f0a;
    C0002a<D> f1b;
    Context f2c;
    boolean f3d = false;
    boolean f4e = false;
    boolean f5f = true;
    boolean f6g = false;
    boolean f7h = false;

    public interface C0002a<D> {
        void mo35a(C0003c<D> c0003c, D d);
    }

    public C0003c(Context context) {
        this.f2c = context.getApplicationContext();
    }

    public int m3a() {
        return this.f0a;
    }

    public void m4a(int i, C0002a<D> c0002a) {
        if (this.f1b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f1b = c0002a;
        this.f0a = i;
    }

    public void m5a(C0002a<D> c0002a) {
        if (this.f1b == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f1b != c0002a) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f1b = null;
        }
    }

    public void m6a(D d) {
        if (this.f1b != null) {
            this.f1b.mo35a(this, d);
        }
    }

    public void mo892a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f0a);
        printWriter.print(" mListener=");
        printWriter.println(this.f1b);
        if (this.f3d || this.f6g || this.f7h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f3d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f6g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f7h);
        }
        if (this.f4e || this.f5f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f4e);
            printWriter.print(" mReset=");
            printWriter.println(this.f5f);
        }
    }

    public String m8b(D d) {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0089c.m474a(d, stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean m9b() {
        return this.f3d;
    }

    public boolean m10c() {
        return this.f4e;
    }

    public final void m11d() {
        this.f3d = true;
        this.f5f = false;
        this.f4e = false;
        mo893e();
    }

    protected void mo893e() {
    }

    public void m13f() {
        this.f3d = false;
        mo894g();
    }

    protected void mo894g() {
    }

    public void m15h() {
        this.f4e = true;
        m16i();
    }

    protected void m16i() {
    }

    public void m17j() {
        mo895k();
        this.f5f = true;
        this.f3d = false;
        this.f4e = false;
        this.f6g = false;
        this.f7h = false;
    }

    protected void mo895k() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0089c.m474a(this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f0a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
