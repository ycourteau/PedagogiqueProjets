package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.C0169b.C0112a;
import android.support.v4.view.C0171c.C0117a;
import android.support.v4.view.p008a.C0128a;
import android.support.v4.view.p008a.C0139d;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class C0105a {
    private static final C0114b f317b;
    private static final Object f318c = f317b.mo77a();
    final Object f319a = f317b.mo78a(this);

    interface C0114b {
        C0139d mo76a(Object obj, View view);

        Object mo77a();

        Object mo78a(C0105a c0105a);

        void mo79a(Object obj, View view, int i);

        void mo80a(Object obj, View view, C0128a c0128a);

        boolean mo81a(Object obj, View view, int i, Bundle bundle);

        boolean mo82a(Object obj, View view, AccessibilityEvent accessibilityEvent);

        boolean mo83a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        void mo84b(Object obj, View view, AccessibilityEvent accessibilityEvent);

        void mo85c(Object obj, View view, AccessibilityEvent accessibilityEvent);

        void mo86d(Object obj, View view, AccessibilityEvent accessibilityEvent);
    }

    static class C0115d implements C0114b {
        C0115d() {
        }

        public C0139d mo76a(Object obj, View view) {
            return null;
        }

        public Object mo77a() {
            return null;
        }

        public Object mo78a(C0105a c0105a) {
            return null;
        }

        public void mo79a(Object obj, View view, int i) {
        }

        public void mo80a(Object obj, View view, C0128a c0128a) {
        }

        public boolean mo81a(Object obj, View view, int i, Bundle bundle) {
            return false;
        }

        public boolean mo82a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            return false;
        }

        public boolean mo83a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return true;
        }

        public void mo84b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        public void mo85c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        public void mo86d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }
    }

    static class C0116a extends C0115d {
        C0116a() {
        }

        public Object mo77a() {
            return C0169b.m883a();
        }

        public Object mo78a(final C0105a c0105a) {
            return C0169b.m884a(new C0112a(this) {
                final /* synthetic */ C0116a f372b;

                public void mo69a(View view, int i) {
                    c0105a.m505a(view, i);
                }

                public void mo70a(View view, Object obj) {
                    c0105a.mo66a(view, new C0128a(obj));
                }

                public boolean mo71a(View view, AccessibilityEvent accessibilityEvent) {
                    return c0105a.m510b(view, accessibilityEvent);
                }

                public boolean mo72a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return c0105a.m509a(viewGroup, view, accessibilityEvent);
                }

                public void mo73b(View view, AccessibilityEvent accessibilityEvent) {
                    c0105a.mo68d(view, accessibilityEvent);
                }

                public void mo74c(View view, AccessibilityEvent accessibilityEvent) {
                    c0105a.m511c(view, accessibilityEvent);
                }

                public void mo75d(View view, AccessibilityEvent accessibilityEvent) {
                    c0105a.m507a(view, accessibilityEvent);
                }
            });
        }

        public void mo79a(Object obj, View view, int i) {
            C0169b.m885a(obj, view, i);
        }

        public void mo80a(Object obj, View view, C0128a c0128a) {
            C0169b.m886a(obj, view, c0128a.m695a());
        }

        public boolean mo82a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            return C0169b.m887a(obj, view, accessibilityEvent);
        }

        public boolean mo83a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return C0169b.m888a(obj, viewGroup, view, accessibilityEvent);
        }

        public void mo84b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            C0169b.m889b(obj, view, accessibilityEvent);
        }

        public void mo85c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            C0169b.m890c(obj, view, accessibilityEvent);
        }

        public void mo86d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            C0169b.m891d(obj, view, accessibilityEvent);
        }
    }

    static class C0119c extends C0116a {
        C0119c() {
        }

        public C0139d mo76a(Object obj, View view) {
            Object a = C0171c.m893a(obj, view);
            return a != null ? new C0139d(a) : null;
        }

        public Object mo78a(final C0105a c0105a) {
            return C0171c.m892a(new C0117a(this) {
                final /* synthetic */ C0119c f374b;

                public Object mo87a(View view) {
                    C0139d a = c0105a.m503a(view);
                    return a != null ? a.m757a() : null;
                }

                public void mo88a(View view, int i) {
                    c0105a.m505a(view, i);
                }

                public void mo89a(View view, Object obj) {
                    c0105a.mo66a(view, new C0128a(obj));
                }

                public boolean mo90a(View view, int i, Bundle bundle) {
                    return c0105a.mo67a(view, i, bundle);
                }

                public boolean mo91a(View view, AccessibilityEvent accessibilityEvent) {
                    return c0105a.m510b(view, accessibilityEvent);
                }

                public boolean mo92a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return c0105a.m509a(viewGroup, view, accessibilityEvent);
                }

                public void mo93b(View view, AccessibilityEvent accessibilityEvent) {
                    c0105a.mo68d(view, accessibilityEvent);
                }

                public void mo94c(View view, AccessibilityEvent accessibilityEvent) {
                    c0105a.m511c(view, accessibilityEvent);
                }

                public void mo95d(View view, AccessibilityEvent accessibilityEvent) {
                    c0105a.m507a(view, accessibilityEvent);
                }
            });
        }

        public boolean mo81a(Object obj, View view, int i, Bundle bundle) {
            return C0171c.m894a(obj, view, i, bundle);
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            f317b = new C0119c();
        } else if (VERSION.SDK_INT >= 14) {
            f317b = new C0116a();
        } else {
            f317b = new C0115d();
        }
    }

    public C0139d m503a(View view) {
        return f317b.mo76a(f318c, view);
    }

    Object m504a() {
        return this.f319a;
    }

    public void m505a(View view, int i) {
        f317b.mo79a(f318c, view, i);
    }

    public void mo66a(View view, C0128a c0128a) {
        f317b.mo80a(f318c, view, c0128a);
    }

    public void m507a(View view, AccessibilityEvent accessibilityEvent) {
        f317b.mo86d(f318c, view, accessibilityEvent);
    }

    public boolean mo67a(View view, int i, Bundle bundle) {
        return f317b.mo81a(f318c, view, i, bundle);
    }

    public boolean m509a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f317b.mo83a(f318c, viewGroup, view, accessibilityEvent);
    }

    public boolean m510b(View view, AccessibilityEvent accessibilityEvent) {
        return f317b.mo82a(f318c, view, accessibilityEvent);
    }

    public void m511c(View view, AccessibilityEvent accessibilityEvent) {
        f317b.mo85c(f318c, view, accessibilityEvent);
    }

    public void mo68d(View view, AccessibilityEvent accessibilityEvent) {
        f317b.mo84b(f318c, view, accessibilityEvent);
    }
}
