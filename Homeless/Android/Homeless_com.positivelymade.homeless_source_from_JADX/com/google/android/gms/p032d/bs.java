package com.google.android.gms.p032d;

import android.content.Context;
import com.google.android.gms.p028c.C0934f;
import com.google.android.gms.p028c.C1010h.C1009a;
import com.google.android.gms.p028c.kr;
import com.google.android.gms.p028c.kr.C1115a;
import com.google.android.gms.p028c.kr.C1117c;
import com.google.android.gms.p028c.kr.C1119e;
import com.google.android.gms.p032d.cw.C1566a;
import com.google.android.gms.p032d.dd.C1542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class bs {
    private static final az<C1009a> f4744a = new az(cj.m7335f(), true);
    private final C1117c f4745b;
    private final C1551m f4746c;
    private final Map<String, C1546o> f4747d;
    private final Map<String, C1546o> f4748e;
    private final Map<String, C1546o> f4749f;
    private final cv<C1115a, az<C1009a>> f4750g;
    private final cv<String, C1572b> f4751h;
    private final Set<C1119e> f4752i;
    private final C1585c f4753j;
    private final Map<String, C1573c> f4754k;
    private volatile String f4755l;
    private int f4756m;

    class C15671 implements C1566a<C1115a, az<C1009a>> {
        final /* synthetic */ bs f4728a;

        C15671(bs bsVar) {
            this.f4728a = bsVar;
        }

        public int m7172a(C1115a c1115a, az<C1009a> azVar) {
            return ((C1009a) azVar.m7111a()).m4712g();
        }

        public /* synthetic */ int mo1017a(Object obj, Object obj2) {
            return m7172a((C1115a) obj, (az) obj2);
        }
    }

    class C15682 implements C1566a<String, C1572b> {
        final /* synthetic */ bs f4729a;

        C15682(bs bsVar) {
            this.f4729a = bsVar;
        }

        public /* synthetic */ int mo1017a(Object obj, Object obj2) {
            return m7175a((String) obj, (C1572b) obj2);
        }

        public int m7175a(String str, C1572b c1572b) {
            return str.length() + c1572b.m7181c();
        }
    }

    interface C1569a {
        void mo1018a(C1119e c1119e, Set<C1115a> set, Set<C1115a> set2, bo boVar);
    }

    class C15714 implements C1569a {
        final /* synthetic */ bs f4735a;

        C15714(bs bsVar) {
            this.f4735a = bsVar;
        }

        public void mo1018a(C1119e c1119e, Set<C1115a> set, Set<C1115a> set2, bo boVar) {
            set.addAll(c1119e.m5610d());
            set2.addAll(c1119e.m5611e());
            boVar.mo1000e().mo994a(c1119e.m5610d(), c1119e.m5615i());
            boVar.mo1001f().mo994a(c1119e.m5611e(), c1119e.m5616j());
        }
    }

    private static class C1572b {
        private az<C1009a> f4736a;
        private C1009a f4737b;

        public C1572b(az<C1009a> azVar, C1009a c1009a) {
            this.f4736a = azVar;
            this.f4737b = c1009a;
        }

        public az<C1009a> m7179a() {
            return this.f4736a;
        }

        public C1009a m7180b() {
            return this.f4737b;
        }

        public int m7181c() {
            return (this.f4737b == null ? 0 : this.f4737b.m4712g()) + ((C1009a) this.f4736a.m7111a()).m4712g();
        }
    }

    private static class C1573c {
        private final Set<C1119e> f4738a = new HashSet();
        private final Map<C1119e, List<C1115a>> f4739b = new HashMap();
        private final Map<C1119e, List<C1115a>> f4740c = new HashMap();
        private final Map<C1119e, List<String>> f4741d = new HashMap();
        private final Map<C1119e, List<String>> f4742e = new HashMap();
        private C1115a f4743f;

        public Set<C1119e> m7182a() {
            return this.f4738a;
        }

        public void m7183a(C1115a c1115a) {
            this.f4743f = c1115a;
        }

        public void m7184a(C1119e c1119e) {
            this.f4738a.add(c1119e);
        }

        public void m7185a(C1119e c1119e, C1115a c1115a) {
            List list = (List) this.f4739b.get(c1119e);
            if (list == null) {
                list = new ArrayList();
                this.f4739b.put(c1119e, list);
            }
            list.add(c1115a);
        }

        public void m7186a(C1119e c1119e, String str) {
            List list = (List) this.f4741d.get(c1119e);
            if (list == null) {
                list = new ArrayList();
                this.f4741d.put(c1119e, list);
            }
            list.add(str);
        }

        public Map<C1119e, List<C1115a>> m7187b() {
            return this.f4739b;
        }

        public void m7188b(C1119e c1119e, C1115a c1115a) {
            List list = (List) this.f4740c.get(c1119e);
            if (list == null) {
                list = new ArrayList();
                this.f4740c.put(c1119e, list);
            }
            list.add(c1115a);
        }

        public void m7189b(C1119e c1119e, String str) {
            List list = (List) this.f4742e.get(c1119e);
            if (list == null) {
                list = new ArrayList();
                this.f4742e.put(c1119e, list);
            }
            list.add(str);
        }

        public Map<C1119e, List<String>> m7190c() {
            return this.f4741d;
        }

        public Map<C1119e, List<String>> m7191d() {
            return this.f4742e;
        }

        public Map<C1119e, List<C1115a>> m7192e() {
            return this.f4740c;
        }

        public C1115a m7193f() {
            return this.f4743f;
        }
    }

    public bs(Context context, C1117c c1117c, C1585c c1585c, C1542a c1542a, C1542a c1542a2, C1551m c1551m) {
        if (c1117c == null) {
            throw new NullPointerException("resource cannot be null");
        }
        this.f4745b = c1117c;
        this.f4752i = new HashSet(c1117c.m5599b());
        this.f4753j = c1585c;
        this.f4746c = c1551m;
        this.f4750g = new cw().m7387a(1048576, new C15671(this));
        this.f4751h = new cw().m7387a(1048576, new C15682(this));
        this.f4747d = new HashMap();
        m7212b(new ct(context));
        m7212b(new dd(c1542a2));
        m7212b(new dh(c1585c));
        m7212b(new ck(context, c1585c));
        m7212b(new cf(context, c1585c));
        this.f4748e = new HashMap();
        m7213c(new db());
        m7213c(new C1615j());
        m7213c(new C1616k());
        m7213c(new C1619q());
        m7213c(new C1620r());
        m7213c(new ag());
        m7213c(new ah());
        m7213c(new bj());
        m7213c(new cb());
        this.f4749f = new HashMap();
        m7209a(new ad(context));
        m7209a(new bd(context));
        m7209a(new co(context));
        m7209a(new cp(context));
        m7209a(new cq(context));
        m7209a(new cr(context));
        m7209a(new cs(context));
        m7209a(new cx());
        m7209a(new da(this.f4745b.m5600c()));
        m7209a(new dd(c1542a));
        m7209a(new df(c1585c));
        m7209a(new C1612f(context));
        m7209a(new C1613g());
        m7209a(new C1614i());
        m7209a(new C1617n(this));
        m7209a(new C1621s());
        m7209a(new C1622t());
        m7209a(new aa(context));
        m7209a(new ac());
        m7209a(new af());
        m7209a(new al());
        m7209a(new an(context));
        m7209a(new ba());
        m7209a(new bc());
        m7209a(new bg());
        m7209a(new bi());
        m7209a(new bk(context));
        m7209a(new bt());
        m7209a(new bu());
        m7209a(new ce());
        m7209a(new cl());
        this.f4754k = new HashMap();
        for (C1119e c1119e : this.f4752i) {
            if (c1551m.mo987a()) {
                bs.m7201a(c1119e.m5612f(), c1119e.m5613g(), "add macro");
                bs.m7201a(c1119e.m5617k(), c1119e.m5614h(), "remove macro");
                bs.m7201a(c1119e.m5610d(), c1119e.m5615i(), "add tag");
                bs.m7201a(c1119e.m5611e(), c1119e.m5616j(), "remove tag");
            }
            int i = 0;
            while (i < c1119e.m5612f().size()) {
                C1115a c1115a = (C1115a) c1119e.m5612f().get(i);
                String str = "Unknown";
                if (c1551m.mo987a() && i < c1119e.m5613g().size()) {
                    str = (String) c1119e.m5613g().get(i);
                }
                C1573c a = bs.m7198a(this.f4754k, bs.m7199a(c1115a));
                a.m7184a(c1119e);
                a.m7185a(c1119e, c1115a);
                a.m7186a(c1119e, str);
                i++;
            }
            i = 0;
            while (i < c1119e.m5617k().size()) {
                c1115a = (C1115a) c1119e.m5617k().get(i);
                str = "Unknown";
                if (c1551m.mo987a() && i < c1119e.m5614h().size()) {
                    str = (String) c1119e.m5614h().get(i);
                }
                a = bs.m7198a(this.f4754k, bs.m7199a(c1115a));
                a.m7184a(c1119e);
                a.m7188b(c1119e, c1115a);
                a.m7189b(c1119e, str);
                i++;
            }
        }
        for (Entry entry : this.f4745b.m5601d().entrySet()) {
            for (C1115a c1115a2 : (List) entry.getValue()) {
                if (!cj.m7330d((C1009a) c1115a2.m5593b().get(C0934f.NOT_DEFAULT_MACRO.toString())).booleanValue()) {
                    bs.m7198a(this.f4754k, (String) entry.getKey()).m7183a(c1115a2);
                }
            }
        }
    }

    private az<C1009a> m7194a(C1009a c1009a, Set<String> set, cm cmVar) {
        if (!c1009a.f3447l) {
            return new az(c1009a, true);
        }
        C1009a a;
        int i;
        az a2;
        switch (c1009a.f3436a) {
            case 2:
                a = kr.m5629a(c1009a);
                a.f3438c = new C1009a[c1009a.f3438c.length];
                for (i = 0; i < c1009a.f3438c.length; i++) {
                    a2 = m7194a(c1009a.f3438c[i], (Set) set, cmVar.mo1005a(i));
                    if (a2 == f4744a) {
                        return f4744a;
                    }
                    a.f3438c[i] = (C1009a) a2.m7111a();
                }
                return new az(a, false);
            case 3:
                a = kr.m5629a(c1009a);
                if (c1009a.f3439d.length != c1009a.f3440e.length) {
                    aj.m7036a("Invalid serving value: " + c1009a.toString());
                    return f4744a;
                }
                a.f3439d = new C1009a[c1009a.f3439d.length];
                a.f3440e = new C1009a[c1009a.f3439d.length];
                for (i = 0; i < c1009a.f3439d.length; i++) {
                    a2 = m7194a(c1009a.f3439d[i], (Set) set, cmVar.mo1006b(i));
                    az a3 = m7194a(c1009a.f3440e[i], (Set) set, cmVar.mo1007c(i));
                    if (a2 == f4744a || a3 == f4744a) {
                        return f4744a;
                    }
                    a.f3439d[i] = (C1009a) a2.m7111a();
                    a.f3440e[i] = (C1009a) a3.m7111a();
                }
                return new az(a, false);
            case 4:
                if (set.contains(c1009a.f3441f)) {
                    aj.m7036a("Macro cycle detected.  Current macro reference: " + c1009a.f3441f + "." + "  Previous macro references: " + set.toString() + ".");
                    return f4744a;
                }
                set.add(c1009a.f3441f);
                az<C1009a> a4 = cn.m7364a(m7195a(c1009a.f3441f, (Set) set, cmVar.mo1004a()), c1009a.f3446k);
                set.remove(c1009a.f3441f);
                return a4;
            case 7:
                a = kr.m5629a(c1009a);
                a.f3445j = new C1009a[c1009a.f3445j.length];
                for (i = 0; i < c1009a.f3445j.length; i++) {
                    a2 = m7194a(c1009a.f3445j[i], (Set) set, cmVar.mo1008d(i));
                    if (a2 == f4744a) {
                        return f4744a;
                    }
                    a.f3445j[i] = (C1009a) a2.m7111a();
                }
                return new az(a, false);
            default:
                aj.m7036a("Unknown type: " + c1009a.f3436a);
                return f4744a;
        }
    }

    private az<C1009a> m7195a(String str, Set<String> set, am amVar) {
        this.f4756m++;
        C1572b c1572b = (C1572b) this.f4751h.mo974a(str);
        if (c1572b == null || this.f4746c.mo987a()) {
            C1573c c1573c = (C1573c) this.f4754k.get(str);
            if (c1573c == null) {
                aj.m7036a(m7203b() + "Invalid macro: " + str);
                this.f4756m--;
                return f4744a;
            }
            C1115a f;
            az a = m7206a(str, c1573c.m7182a(), c1573c.m7187b(), c1573c.m7190c(), c1573c.m7192e(), c1573c.m7191d(), set, amVar.mo990b());
            if (((Set) a.m7111a()).isEmpty()) {
                f = c1573c.m7193f();
            } else {
                if (((Set) a.m7111a()).size() > 1) {
                    aj.m7038b(m7203b() + "Multiple macros active for macroName " + str);
                }
                f = (C1115a) ((Set) a.m7111a()).iterator().next();
            }
            if (f == null) {
                this.f4756m--;
                return f4744a;
            }
            az a2 = m7196a(this.f4749f, f, (Set) set, amVar.mo989a());
            boolean z = a.m7112b() && a2.m7112b();
            az<C1009a> azVar = a2 == f4744a ? f4744a : new az(a2.m7111a(), z);
            C1009a c = f.m5594c();
            if (azVar.m7112b()) {
                this.f4751h.mo975a(str, new C1572b(azVar, c));
            }
            m7200a(c, (Set) set);
            this.f4756m--;
            return azVar;
        }
        m7200a(c1572b.m7180b(), (Set) set);
        this.f4756m--;
        return c1572b.m7179a();
    }

    private az<C1009a> m7196a(Map<String, C1546o> map, C1115a c1115a, Set<String> set, bl blVar) {
        boolean z = true;
        C1009a c1009a = (C1009a) c1115a.m5593b().get(C0934f.FUNCTION.toString());
        if (c1009a == null) {
            aj.m7036a("No function id in properties");
            return f4744a;
        }
        String str = c1009a.f3442g;
        C1546o c1546o = (C1546o) map.get(str);
        if (c1546o == null) {
            aj.m7036a(str + " has no backing implementation.");
            return f4744a;
        }
        az<C1009a> azVar = (az) this.f4750g.mo974a(c1115a);
        if (azVar != null && !this.f4746c.mo987a()) {
            return azVar;
        }
        Map hashMap = new HashMap();
        boolean z2 = true;
        for (Entry entry : c1115a.m5593b().entrySet()) {
            az a = m7194a((C1009a) entry.getValue(), (Set) set, blVar.mo991a((String) entry.getKey()).mo993a((C1009a) entry.getValue()));
            if (a == f4744a) {
                return f4744a;
            }
            boolean z3;
            if (a.m7112b()) {
                c1115a.m5592a((String) entry.getKey(), (C1009a) a.m7111a());
                z3 = z2;
            } else {
                z3 = false;
            }
            hashMap.put(entry.getKey(), a.m7111a());
            z2 = z3;
        }
        if (c1546o.m7000a(hashMap.keySet())) {
            if (!(z2 && c1546o.mo973a())) {
                z = false;
            }
            azVar = new az(c1546o.mo972a(hashMap), z);
            if (z) {
                this.f4750g.mo975a(c1115a, azVar);
            }
            blVar.mo992a((C1009a) azVar.m7111a());
            return azVar;
        }
        aj.m7036a("Incorrect keys for function " + str + " required " + c1546o.mo977c() + " had " + hashMap.keySet());
        return f4744a;
    }

    private az<Set<C1115a>> m7197a(Set<C1119e> set, Set<String> set2, C1569a c1569a, br brVar) {
        Set hashSet = new HashSet();
        Collection hashSet2 = new HashSet();
        boolean z = true;
        for (C1119e c1119e : set) {
            bo a = brVar.mo1002a();
            az a2 = m7205a(c1119e, (Set) set2, a);
            if (((Boolean) a2.m7111a()).booleanValue()) {
                c1569a.mo1018a(c1119e, hashSet, hashSet2, a);
            }
            boolean z2 = z && a2.m7112b();
            z = z2;
        }
        hashSet.removeAll(hashSet2);
        brVar.mo1003a(hashSet);
        return new az(hashSet, z);
    }

    private static C1573c m7198a(Map<String, C1573c> map, String str) {
        C1573c c1573c = (C1573c) map.get(str);
        if (c1573c != null) {
            return c1573c;
        }
        c1573c = new C1573c();
        map.put(str, c1573c);
        return c1573c;
    }

    private static String m7199a(C1115a c1115a) {
        return cj.m7319a((C1009a) c1115a.m5593b().get(C0934f.INSTANCE_NAME.toString()));
    }

    private void m7200a(C1009a c1009a, Set<String> set) {
        if (c1009a != null) {
            az a = m7194a(c1009a, (Set) set, new ax());
            if (a != f4744a) {
                Object e = cj.m7333e((C1009a) a.m7111a());
                if (e instanceof Map) {
                    this.f4753j.m7272a((Map) e);
                } else if (e instanceof List) {
                    for (Object e2 : (List) e2) {
                        if (e2 instanceof Map) {
                            this.f4753j.m7272a((Map) e2);
                        } else {
                            aj.m7038b("pushAfterEvaluate: value not a Map");
                        }
                    }
                } else {
                    aj.m7038b("pushAfterEvaluate: value not a Map or List");
                }
            }
        }
    }

    private static void m7201a(List<C1115a> list, List<String> list2, String str) {
        if (list.size() != list2.size()) {
            aj.m7040c("Invalid resource: imbalance of rule names of functions for " + str + " operation. Using default rule name instead");
        }
    }

    private static void m7202a(Map<String, C1546o> map, C1546o c1546o) {
        if (map.containsKey(c1546o.mo976b())) {
            throw new IllegalArgumentException("Duplicate function type name: " + c1546o.mo976b());
        }
        map.put(c1546o.mo976b(), c1546o);
    }

    private String m7203b() {
        if (this.f4756m <= 1) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toString(this.f4756m));
        for (int i = 2; i < this.f4756m; i++) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(": ");
        return stringBuilder.toString();
    }

    az<Boolean> m7204a(C1115a c1115a, Set<String> set, bl blVar) {
        az a = m7196a(this.f4748e, c1115a, (Set) set, blVar);
        Object d = cj.m7330d((C1009a) a.m7111a());
        blVar.mo992a(cj.m7332e(d));
        return new az(d, a.m7112b());
    }

    az<Boolean> m7205a(C1119e c1119e, Set<String> set, bo boVar) {
        boolean z = true;
        for (C1115a a : c1119e.m5609c()) {
            az a2 = m7204a(a, (Set) set, boVar.mo995a());
            if (((Boolean) a2.m7111a()).booleanValue()) {
                boVar.mo996a(cj.m7332e(Boolean.valueOf(false)));
                return new az(Boolean.valueOf(false), a2.m7112b());
            }
            boolean z2 = z && a2.m7112b();
            z = z2;
        }
        for (C1115a a3 : c1119e.m5608b()) {
            a2 = m7204a(a3, (Set) set, boVar.mo997b());
            if (((Boolean) a2.m7111a()).booleanValue()) {
                z = z && a2.m7112b();
            } else {
                boVar.mo996a(cj.m7332e(Boolean.valueOf(false)));
                return new az(Boolean.valueOf(false), a2.m7112b());
            }
        }
        boVar.mo996a(cj.m7332e(Boolean.valueOf(true)));
        return new az(Boolean.valueOf(true), z);
    }

    az<Set<C1115a>> m7206a(String str, Set<C1119e> set, Map<C1119e, List<C1115a>> map, Map<C1119e, List<String>> map2, Map<C1119e, List<C1115a>> map3, Map<C1119e, List<String>> map4, Set<String> set2, br brVar) {
        final Map<C1119e, List<C1115a>> map5 = map;
        final Map<C1119e, List<String>> map6 = map2;
        final Map<C1119e, List<C1115a>> map7 = map3;
        final Map<C1119e, List<String>> map8 = map4;
        return m7197a((Set) set, (Set) set2, new C1569a(this) {
            final /* synthetic */ bs f4734e;

            public void mo1018a(C1119e c1119e, Set<C1115a> set, Set<C1115a> set2, bo boVar) {
                List list = (List) map5.get(c1119e);
                List list2 = (List) map6.get(c1119e);
                if (list != null) {
                    set.addAll(list);
                    boVar.mo998c().mo994a(list, list2);
                }
                list = (List) map7.get(c1119e);
                list2 = (List) map8.get(c1119e);
                if (list != null) {
                    set2.addAll(list);
                    boVar.mo999d().mo994a(list, list2);
                }
            }
        }, brVar);
    }

    az<Set<C1115a>> m7207a(Set<C1119e> set, br brVar) {
        return m7197a((Set) set, new HashSet(), new C15714(this), brVar);
    }

    synchronized String m7208a() {
        return this.f4755l;
    }

    void m7209a(C1546o c1546o) {
        bs.m7202a(this.f4749f, c1546o);
    }

    public synchronized void m7210a(String str) {
        m7214c(str);
        C1550l b = this.f4746c.mo988b(str);
        de b2 = b.mo984b();
        for (C1115a a : (Set) m7207a(this.f4752i, b2.mo982b()).m7111a()) {
            m7196a(this.f4747d, a, new HashSet(), b2.mo981a());
        }
        b.mo985c();
        m7214c(null);
    }

    public az<C1009a> m7211b(String str) {
        this.f4756m = 0;
        C1550l a = this.f4746c.mo986a(str);
        az<C1009a> a2 = m7195a(str, new HashSet(), a.mo983a());
        a.mo985c();
        return a2;
    }

    void m7212b(C1546o c1546o) {
        bs.m7202a(this.f4747d, c1546o);
    }

    void m7213c(C1546o c1546o) {
        bs.m7202a(this.f4748e, c1546o);
    }

    synchronized void m7214c(String str) {
        this.f4755l = str;
    }
}
