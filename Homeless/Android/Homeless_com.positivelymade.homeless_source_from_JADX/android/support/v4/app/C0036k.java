package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.C0035v;
import android.view.View;
import android.view.ViewGroup;

public abstract class C0036k extends C0035v {
    private final C0028i f195a;
    private C0016l f196b = null;
    private C0018f f197c = null;

    public C0036k(C0028i c0028i) {
        this.f195a = c0028i;
    }

    private static String m279a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    public Parcelable mo27a() {
        return null;
    }

    public abstract C0018f mo1670a(int i);

    public Object mo28a(ViewGroup viewGroup, int i) {
        if (this.f196b == null) {
            this.f196b = this.f195a.mo21a();
        }
        long b = m287b(i);
        C0018f a = this.f195a.mo20a(C0036k.m279a(viewGroup.getId(), b));
        if (a != null) {
            this.f196b.mo8c(a);
        } else {
            a = mo1670a(i);
            this.f196b.mo3a(viewGroup.getId(), a, C0036k.m279a(viewGroup.getId(), b));
        }
        if (a != this.f197c) {
            a.m123d(false);
            a.m127e(false);
        }
        return a;
    }

    public void mo29a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void mo30a(ViewGroup viewGroup) {
    }

    public void mo31a(ViewGroup viewGroup, int i, Object obj) {
        if (this.f196b == null) {
            this.f196b = this.f195a.mo21a();
        }
        this.f196b.mo7b((C0018f) obj);
    }

    public boolean mo32a(View view, Object obj) {
        return ((C0018f) obj).m143o() == view;
    }

    public long m287b(int i) {
        return (long) i;
    }

    public void mo33b(ViewGroup viewGroup) {
        if (this.f196b != null) {
            this.f196b.mo6b();
            this.f196b = null;
            this.f195a.mo24b();
        }
    }

    public void mo34b(ViewGroup viewGroup, int i, Object obj) {
        C0018f c0018f = (C0018f) obj;
        if (c0018f != this.f197c) {
            if (this.f197c != null) {
                this.f197c.m123d(false);
                this.f197c.m127e(false);
            }
            if (c0018f != null) {
                c0018f.m123d(true);
                c0018f.m127e(true);
            }
            this.f197c = c0018f;
        }
    }
}
