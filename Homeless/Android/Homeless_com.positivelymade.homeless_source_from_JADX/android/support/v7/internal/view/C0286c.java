package android.support.v7.internal.view;

import android.support.v4.view.ak;
import android.support.v4.view.an;
import android.support.v4.view.ao;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class C0286c {
    private final ArrayList<ak> f518a = new ArrayList();
    private long f519b = -1;
    private Interpolator f520c;
    private an f521d;
    private boolean f522e;
    private final ao f523f = new C02851(this);

    class C02851 extends ao {
        final /* synthetic */ C0286c f515a;
        private boolean f516b = false;
        private int f517c = 0;

        C02851(C0286c c0286c) {
            this.f515a = c0286c;
        }

        void m1256a() {
            this.f517c = 0;
            this.f516b = false;
            this.f515a.m1262c();
        }

        public void mo140a(View view) {
            if (!this.f516b) {
                this.f516b = true;
                if (this.f515a.f521d != null) {
                    this.f515a.f521d.mo140a(null);
                }
            }
        }

        public void mo141b(View view) {
            int i = this.f517c + 1;
            this.f517c = i;
            if (i == this.f515a.f518a.size()) {
                if (this.f515a.f521d != null) {
                    this.f515a.f521d.mo141b(null);
                }
                m1256a();
            }
        }
    }

    private void m1262c() {
        this.f522e = false;
    }

    public C0286c m1263a(ak akVar) {
        if (!this.f522e) {
            this.f518a.add(akVar);
        }
        return this;
    }

    public void m1264a() {
        if (!this.f522e) {
            Iterator it = this.f518a.iterator();
            while (it.hasNext()) {
                ak akVar = (ak) it.next();
                if (this.f519b >= 0) {
                    akVar.m864a(this.f519b);
                }
                if (this.f520c != null) {
                    akVar.m866a(this.f520c);
                }
                if (this.f521d != null) {
                    akVar.m865a(this.f523f);
                }
                akVar.m869b();
            }
            this.f522e = true;
        }
    }

    public void m1265b() {
        if (this.f522e) {
            Iterator it = this.f518a.iterator();
            while (it.hasNext()) {
                ((ak) it.next()).m867a();
            }
            this.f522e = false;
        }
    }
}
