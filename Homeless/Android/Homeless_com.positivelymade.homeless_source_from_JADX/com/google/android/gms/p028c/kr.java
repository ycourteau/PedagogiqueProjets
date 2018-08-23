package com.google.android.gms.p028c;

import com.google.android.gms.p028c.C1010h.C1009a;
import com.google.android.gms.p032d.cj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class kr {

    public static class C1115a {
        private final Map<String, C1009a> f3873a;
        private final C1009a f3874b;

        private C1115a(Map<String, C1009a> map, C1009a c1009a) {
            this.f3873a = map;
            this.f3874b = c1009a;
        }

        public static C1116b m5591a() {
            return new C1116b();
        }

        public void m5592a(String str, C1009a c1009a) {
            this.f3873a.put(str, c1009a);
        }

        public Map<String, C1009a> m5593b() {
            return Collections.unmodifiableMap(this.f3873a);
        }

        public C1009a m5594c() {
            return this.f3874b;
        }

        public String toString() {
            return "Properties: " + m5593b() + " pushAfterEvaluate: " + this.f3874b;
        }
    }

    public static class C1116b {
        private final Map<String, C1009a> f3875a;
        private C1009a f3876b;

        private C1116b() {
            this.f3875a = new HashMap();
        }

        public C1115a m5595a() {
            return new C1115a(this.f3875a, this.f3876b);
        }

        public C1116b m5596a(C1009a c1009a) {
            this.f3876b = c1009a;
            return this;
        }

        public C1116b m5597a(String str, C1009a c1009a) {
            this.f3875a.put(str, c1009a);
            return this;
        }
    }

    public static class C1117c {
        private final List<C1119e> f3877a;
        private final Map<String, List<C1115a>> f3878b;
        private final String f3879c;
        private final int f3880d;

        private C1117c(List<C1119e> list, Map<String, List<C1115a>> map, String str, int i) {
            this.f3877a = Collections.unmodifiableList(list);
            this.f3878b = Collections.unmodifiableMap(map);
            this.f3879c = str;
            this.f3880d = i;
        }

        public static C1118d m5598a() {
            return new C1118d();
        }

        public List<C1119e> m5599b() {
            return this.f3877a;
        }

        public String m5600c() {
            return this.f3879c;
        }

        public Map<String, List<C1115a>> m5601d() {
            return this.f3878b;
        }

        public String toString() {
            return "Rules: " + m5599b() + "  Macros: " + this.f3878b;
        }
    }

    public static class C1118d {
        private final List<C1119e> f3881a;
        private final Map<String, List<C1115a>> f3882b;
        private String f3883c;
        private int f3884d;

        private C1118d() {
            this.f3881a = new ArrayList();
            this.f3882b = new HashMap();
            this.f3883c = "";
            this.f3884d = 0;
        }

        public C1117c m5602a() {
            return new C1117c(this.f3881a, this.f3882b, this.f3883c, this.f3884d);
        }

        public C1118d m5603a(int i) {
            this.f3884d = i;
            return this;
        }

        public C1118d m5604a(C1115a c1115a) {
            String a = cj.m7319a((C1009a) c1115a.m5593b().get(C0934f.INSTANCE_NAME.toString()));
            List list = (List) this.f3882b.get(a);
            if (list == null) {
                list = new ArrayList();
                this.f3882b.put(a, list);
            }
            list.add(c1115a);
            return this;
        }

        public C1118d m5605a(C1119e c1119e) {
            this.f3881a.add(c1119e);
            return this;
        }

        public C1118d m5606a(String str) {
            this.f3883c = str;
            return this;
        }
    }

    public static class C1119e {
        private final List<C1115a> f3885a;
        private final List<C1115a> f3886b;
        private final List<C1115a> f3887c;
        private final List<C1115a> f3888d;
        private final List<C1115a> f3889e;
        private final List<C1115a> f3890f;
        private final List<String> f3891g;
        private final List<String> f3892h;
        private final List<String> f3893i;
        private final List<String> f3894j;

        private C1119e(List<C1115a> list, List<C1115a> list2, List<C1115a> list3, List<C1115a> list4, List<C1115a> list5, List<C1115a> list6, List<String> list7, List<String> list8, List<String> list9, List<String> list10) {
            this.f3885a = Collections.unmodifiableList(list);
            this.f3886b = Collections.unmodifiableList(list2);
            this.f3887c = Collections.unmodifiableList(list3);
            this.f3888d = Collections.unmodifiableList(list4);
            this.f3889e = Collections.unmodifiableList(list5);
            this.f3890f = Collections.unmodifiableList(list6);
            this.f3891g = Collections.unmodifiableList(list7);
            this.f3892h = Collections.unmodifiableList(list8);
            this.f3893i = Collections.unmodifiableList(list9);
            this.f3894j = Collections.unmodifiableList(list10);
        }

        public static C1120f m5607a() {
            return new C1120f();
        }

        public List<C1115a> m5608b() {
            return this.f3885a;
        }

        public List<C1115a> m5609c() {
            return this.f3886b;
        }

        public List<C1115a> m5610d() {
            return this.f3887c;
        }

        public List<C1115a> m5611e() {
            return this.f3888d;
        }

        public List<C1115a> m5612f() {
            return this.f3889e;
        }

        public List<String> m5613g() {
            return this.f3891g;
        }

        public List<String> m5614h() {
            return this.f3892h;
        }

        public List<String> m5615i() {
            return this.f3893i;
        }

        public List<String> m5616j() {
            return this.f3894j;
        }

        public List<C1115a> m5617k() {
            return this.f3890f;
        }

        public String toString() {
            return "Positive predicates: " + m5608b() + "  Negative predicates: " + m5609c() + "  Add tags: " + m5610d() + "  Remove tags: " + m5611e() + "  Add macros: " + m5612f() + "  Remove macros: " + m5617k();
        }
    }

    public static class C1120f {
        private final List<C1115a> f3895a;
        private final List<C1115a> f3896b;
        private final List<C1115a> f3897c;
        private final List<C1115a> f3898d;
        private final List<C1115a> f3899e;
        private final List<C1115a> f3900f;
        private final List<String> f3901g;
        private final List<String> f3902h;
        private final List<String> f3903i;
        private final List<String> f3904j;

        private C1120f() {
            this.f3895a = new ArrayList();
            this.f3896b = new ArrayList();
            this.f3897c = new ArrayList();
            this.f3898d = new ArrayList();
            this.f3899e = new ArrayList();
            this.f3900f = new ArrayList();
            this.f3901g = new ArrayList();
            this.f3902h = new ArrayList();
            this.f3903i = new ArrayList();
            this.f3904j = new ArrayList();
        }

        public C1119e m5618a() {
            return new C1119e(this.f3895a, this.f3896b, this.f3897c, this.f3898d, this.f3899e, this.f3900f, this.f3901g, this.f3902h, this.f3903i, this.f3904j);
        }

        public C1120f m5619a(C1115a c1115a) {
            this.f3895a.add(c1115a);
            return this;
        }

        public C1120f m5620a(String str) {
            this.f3903i.add(str);
            return this;
        }

        public C1120f m5621b(C1115a c1115a) {
            this.f3896b.add(c1115a);
            return this;
        }

        public C1120f m5622b(String str) {
            this.f3904j.add(str);
            return this;
        }

        public C1120f m5623c(C1115a c1115a) {
            this.f3897c.add(c1115a);
            return this;
        }

        public C1120f m5624c(String str) {
            this.f3901g.add(str);
            return this;
        }

        public C1120f m5625d(C1115a c1115a) {
            this.f3898d.add(c1115a);
            return this;
        }

        public C1120f m5626d(String str) {
            this.f3902h.add(str);
            return this;
        }

        public C1120f m5627e(C1115a c1115a) {
            this.f3899e.add(c1115a);
            return this;
        }

        public C1120f m5628f(C1115a c1115a) {
            this.f3900f.add(c1115a);
            return this;
        }
    }

    public static class C1121g extends Exception {
        public C1121g(String str) {
            super(str);
        }
    }

    public static C1009a m5629a(C1009a c1009a) {
        C1009a c1009a2 = new C1009a();
        c1009a2.f3436a = c1009a.f3436a;
        c1009a2.f3446k = (int[]) c1009a.f3446k.clone();
        if (c1009a.f3447l) {
            c1009a2.f3447l = c1009a.f3447l;
        }
        return c1009a2;
    }
}
