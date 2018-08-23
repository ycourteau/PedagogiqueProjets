package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class ak {
    static final C0158g f396a;
    private WeakReference<View> f397b;
    private Runnable f398c = null;
    private Runnable f399d = null;
    private int f400e = -1;

    interface C0158g {
        void mo132a(ak akVar, View view);

        void mo133a(ak akVar, View view, float f);

        void mo134a(ak akVar, View view, long j);

        void mo135a(ak akVar, View view, an anVar);

        void mo136a(ak akVar, View view, Interpolator interpolator);

        void mo137b(ak akVar, View view);

        void mo138b(ak akVar, View view, float f);

        void mo139c(ak akVar, View view, float f);
    }

    static class C0159a implements C0158g {
        WeakHashMap<View, Runnable> f393a = null;

        class C0157a implements Runnable {
            WeakReference<View> f390a;
            ak f391b;
            final /* synthetic */ C0159a f392c;

            private C0157a(C0159a c0159a, ak akVar, View view) {
                this.f392c = c0159a;
                this.f390a = new WeakReference(view);
                this.f391b = akVar;
            }

            public void run() {
                View view = (View) this.f390a.get();
                if (view != null) {
                    this.f392c.m834c(this.f391b, view);
                }
            }
        }

        C0159a() {
        }

        private void m833a(View view) {
            if (this.f393a != null) {
                Runnable runnable = (Runnable) this.f393a.get(view);
                if (runnable != null) {
                    view.removeCallbacks(runnable);
                }
            }
        }

        private void m834c(ak akVar, View view) {
            Object tag = view.getTag(2113929216);
            an anVar = tag instanceof an ? (an) tag : null;
            Runnable a = akVar.f398c;
            Runnable b = akVar.f399d;
            if (a != null) {
                a.run();
            }
            if (anVar != null) {
                anVar.mo140a(view);
                anVar.mo141b(view);
            }
            if (b != null) {
                b.run();
            }
            if (this.f393a != null) {
                this.f393a.remove(view);
            }
        }

        private void m835d(ak akVar, View view) {
            Runnable runnable = this.f393a != null ? (Runnable) this.f393a.get(view) : null;
            if (runnable == null) {
                runnable = new C0157a(akVar, view);
                if (this.f393a == null) {
                    this.f393a = new WeakHashMap();
                }
                this.f393a.put(view, runnable);
            }
            view.removeCallbacks(runnable);
            view.post(runnable);
        }

        public void mo132a(ak akVar, View view) {
            m835d(akVar, view);
        }

        public void mo133a(ak akVar, View view, float f) {
            m835d(akVar, view);
        }

        public void mo134a(ak akVar, View view, long j) {
        }

        public void mo135a(ak akVar, View view, an anVar) {
            view.setTag(2113929216, anVar);
        }

        public void mo136a(ak akVar, View view, Interpolator interpolator) {
        }

        public void mo137b(ak akVar, View view) {
            m833a(view);
            m834c(akVar, view);
        }

        public void mo138b(ak akVar, View view, float f) {
            m835d(akVar, view);
        }

        public void mo139c(ak akVar, View view, float f) {
            m835d(akVar, view);
        }
    }

    static class C0161b extends C0159a {
        WeakHashMap<View, Integer> f395b = null;

        static class C0160a implements an {
            ak f394a;

            C0160a(ak akVar) {
                this.f394a = akVar;
            }

            public void mo140a(View view) {
                if (this.f394a.f400e >= 0) {
                    C0233z.m1078a(view, 2, null);
                }
                if (this.f394a.f398c != null) {
                    this.f394a.f398c.run();
                }
                Object tag = view.getTag(2113929216);
                an anVar = tag instanceof an ? (an) tag : null;
                if (anVar != null) {
                    anVar.mo140a(view);
                }
            }

            public void mo141b(View view) {
                if (this.f394a.f400e >= 0) {
                    C0233z.m1078a(view, this.f394a.f400e, null);
                    this.f394a.f400e = -1;
                }
                if (this.f394a.f399d != null) {
                    this.f394a.f399d.run();
                }
                Object tag = view.getTag(2113929216);
                an anVar = tag instanceof an ? (an) tag : null;
                if (anVar != null) {
                    anVar.mo141b(view);
                }
            }

            public void mo142c(View view) {
                Object tag = view.getTag(2113929216);
                an anVar = tag instanceof an ? (an) tag : null;
                if (anVar != null) {
                    anVar.mo142c(view);
                }
            }
        }

        C0161b() {
        }

        public void mo132a(ak akVar, View view) {
            al.m871a(view);
        }

        public void mo133a(ak akVar, View view, float f) {
            al.m872a(view, f);
        }

        public void mo134a(ak akVar, View view, long j) {
            al.m873a(view, j);
        }

        public void mo135a(ak akVar, View view, an anVar) {
            view.setTag(2113929216, anVar);
            al.m874a(view, new C0160a(akVar));
        }

        public void mo136a(ak akVar, View view, Interpolator interpolator) {
            al.m875a(view, interpolator);
        }

        public void mo137b(ak akVar, View view) {
            al.m876b(view);
        }

        public void mo138b(ak akVar, View view, float f) {
            al.m877b(view, f);
        }

        public void mo139c(ak akVar, View view, float f) {
            al.m878c(view, f);
        }
    }

    static class C0162d extends C0161b {
        C0162d() {
        }

        public void mo135a(ak akVar, View view, an anVar) {
            am.m879a(view, anVar);
        }
    }

    static class C0163c extends C0162d {
        C0163c() {
        }
    }

    static class C0164e extends C0163c {
        C0164e() {
        }
    }

    static class C0165f extends C0164e {
        C0165f() {
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f396a = new C0165f();
        } else if (i >= 19) {
            f396a = new C0164e();
        } else if (i >= 18) {
            f396a = new C0163c();
        } else if (i >= 16) {
            f396a = new C0162d();
        } else if (i >= 14) {
            f396a = new C0161b();
        } else {
            f396a = new C0159a();
        }
    }

    ak(View view) {
        this.f397b = new WeakReference(view);
    }

    public ak m863a(float f) {
        View view = (View) this.f397b.get();
        if (view != null) {
            f396a.mo133a(this, view, f);
        }
        return this;
    }

    public ak m864a(long j) {
        View view = (View) this.f397b.get();
        if (view != null) {
            f396a.mo134a(this, view, j);
        }
        return this;
    }

    public ak m865a(an anVar) {
        View view = (View) this.f397b.get();
        if (view != null) {
            f396a.mo135a(this, view, anVar);
        }
        return this;
    }

    public ak m866a(Interpolator interpolator) {
        View view = (View) this.f397b.get();
        if (view != null) {
            f396a.mo136a(this, view, interpolator);
        }
        return this;
    }

    public void m867a() {
        View view = (View) this.f397b.get();
        if (view != null) {
            f396a.mo132a(this, view);
        }
    }

    public ak m868b(float f) {
        View view = (View) this.f397b.get();
        if (view != null) {
            f396a.mo138b(this, view, f);
        }
        return this;
    }

    public void m869b() {
        View view = (View) this.f397b.get();
        if (view != null) {
            f396a.mo137b(this, view);
        }
    }

    public ak m870c(float f) {
        View view = (View) this.f397b.get();
        if (view != null) {
            f396a.mo139c(this, view, f);
        }
        return this;
    }
}
