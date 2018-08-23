package android.support.v4.view.p008a;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.p008a.C0141e.C0132a;
import android.support.v4.view.p008a.C0143f.C0136a;
import java.util.ArrayList;
import java.util.List;

public class C0139d {
    private static final C0131a f381a;
    private final Object f382b;

    interface C0131a {
        Object mo120a(C0139d c0139d);
    }

    static class C0134d implements C0131a {
        C0134d() {
        }

        public Object mo120a(C0139d c0139d) {
            return null;
        }
    }

    static class C0135b extends C0134d {
        C0135b() {
        }

        public Object mo120a(final C0139d c0139d) {
            return C0141e.m761a(new C0132a(this) {
                final /* synthetic */ C0135b f378b;

                public Object mo117a(int i) {
                    C0128a a = c0139d.m756a(i);
                    return a == null ? null : a.m695a();
                }

                public List<Object> mo118a(String str, int i) {
                    List a = c0139d.m758a(str, i);
                    List<Object> arrayList = new ArrayList();
                    int size = a.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(((C0128a) a.get(i2)).m695a());
                    }
                    return arrayList;
                }

                public boolean mo119a(int i, int i2, Bundle bundle) {
                    return c0139d.m759a(i, i2, bundle);
                }
            });
        }
    }

    static class C0138c extends C0134d {
        C0138c() {
        }

        public Object mo120a(final C0139d c0139d) {
            return C0143f.m762a(new C0136a(this) {
                final /* synthetic */ C0138c f380b;

                public Object mo121a(int i) {
                    C0128a a = c0139d.m756a(i);
                    return a == null ? null : a.m695a();
                }

                public List<Object> mo122a(String str, int i) {
                    List a = c0139d.m758a(str, i);
                    List<Object> arrayList = new ArrayList();
                    int size = a.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(((C0128a) a.get(i2)).m695a());
                    }
                    return arrayList;
                }

                public boolean mo123a(int i, int i2, Bundle bundle) {
                    return c0139d.m759a(i, i2, bundle);
                }

                public Object mo124b(int i) {
                    C0128a b = c0139d.m760b(i);
                    return b == null ? null : b.m695a();
                }
            });
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f381a = new C0138c();
        } else if (VERSION.SDK_INT >= 16) {
            f381a = new C0135b();
        } else {
            f381a = new C0134d();
        }
    }

    public C0139d() {
        this.f382b = f381a.mo120a(this);
    }

    public C0139d(Object obj) {
        this.f382b = obj;
    }

    public C0128a m756a(int i) {
        return null;
    }

    public Object m757a() {
        return this.f382b;
    }

    public List<C0128a> m758a(String str, int i) {
        return null;
    }

    public boolean m759a(int i, int i2, Bundle bundle) {
        return false;
    }

    public C0128a m760b(int i) {
        return null;
    }
}
