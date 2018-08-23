package com.google.android.gms.p032d;

import android.support.v7.p010b.C0275a.C0274i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C1585c {
    public static final Object f4789a = new Object();
    static final String[] f4790b = "gtm.lifetime".toString().split("\\.");
    private static final Pattern f4791c = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap<C1584b, Integer> f4792d;
    private final Map<String, Object> f4793e;
    private final ReentrantLock f4794f;
    private final LinkedList<Map<String, Object>> f4795g;
    private final C1579c f4796h;
    private final CountDownLatch f4797i;

    interface C1579c {

        public interface C1581a {
            void mo1026a(List<C1583a> list);
        }

        void mo1023a(C1581a c1581a);

        void mo1024a(String str);

        void mo1025a(List<C1583a> list, long j);
    }

    class C15801 implements C1579c {
        C15801() {
        }

        public void mo1023a(C1581a c1581a) {
            c1581a.mo1026a(new ArrayList());
        }

        public void mo1024a(String str) {
        }

        public void mo1025a(List<C1583a> list, long j) {
        }
    }

    class C15822 implements C1581a {
        final /* synthetic */ C1585c f4786a;

        C15822(C1585c c1585c) {
            this.f4786a = c1585c;
        }

        public void mo1026a(List<C1583a> list) {
            for (C1583a c1583a : list) {
                this.f4786a.m7260b(this.f4786a.m7274b(c1583a.f4787a, c1583a.f4788b));
            }
            this.f4786a.f4797i.countDown();
        }
    }

    static final class C1583a {
        public final String f4787a;
        public final Object f4788b;

        C1583a(String str, Object obj) {
            this.f4787a = str;
            this.f4788b = obj;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1583a)) {
                return false;
            }
            C1583a c1583a = (C1583a) obj;
            return this.f4787a.equals(c1583a.f4787a) && this.f4788b.equals(c1583a.f4788b);
        }

        public int hashCode() {
            return Arrays.hashCode(new Integer[]{Integer.valueOf(this.f4787a.hashCode()), Integer.valueOf(this.f4788b.hashCode())});
        }

        public String toString() {
            return "Key: " + this.f4787a + " value: " + this.f4788b.toString();
        }
    }

    interface C1584b {
        void mo1029a(Map<String, Object> map);
    }

    C1585c() {
        this(new C15801());
    }

    C1585c(C1579c c1579c) {
        this.f4796h = c1579c;
        this.f4792d = new ConcurrentHashMap();
        this.f4793e = new HashMap();
        this.f4794f = new ReentrantLock();
        this.f4795g = new LinkedList();
        this.f4797i = new CountDownLatch(1);
        m7255a();
    }

    public static Map<String, Object> m7253a(Object... objArr) {
        if (objArr.length % 2 != 0) {
            throw new IllegalArgumentException("expected even number of key-value pairs");
        }
        Map<String, Object> hashMap = new HashMap();
        int i = 0;
        while (i < objArr.length) {
            if (objArr[i] instanceof String) {
                hashMap.put((String) objArr[i], objArr[i + 1]);
                i += 2;
            } else {
                throw new IllegalArgumentException("key is not a string: " + objArr[i]);
            }
        }
        return hashMap;
    }

    private void m7255a() {
        this.f4796h.mo1023a(new C15822(this));
    }

    private void m7257a(Map<String, Object> map, String str, Collection<C1583a> collection) {
        for (Entry entry : map.entrySet()) {
            String str2 = str + (str.length() == 0 ? "" : ".") + ((String) entry.getKey());
            if (entry.getValue() instanceof Map) {
                m7257a((Map) entry.getValue(), str2, collection);
            } else if (!str2.equals("gtm.lifetime")) {
                collection.add(new C1583a(str2, entry.getValue()));
            }
        }
    }

    static Long m7258b(String str) {
        Matcher matcher = f4791c.matcher(str);
        if (matcher.matches()) {
            long parseLong;
            try {
                parseLong = Long.parseLong(matcher.group(1));
            } catch (NumberFormatException e) {
                aj.m7038b("illegal number in _lifetime value: " + str);
                parseLong = 0;
            }
            if (parseLong <= 0) {
                aj.m7040c("non-positive _lifetime: " + str);
                return null;
            }
            String group = matcher.group(2);
            if (group.length() == 0) {
                return Long.valueOf(parseLong);
            }
            switch (group.charAt(0)) {
                case C0274i.Theme_checkboxStyle /*100*/:
                    return Long.valueOf((((parseLong * 1000) * 60) * 60) * 24);
                case C0274i.Theme_ratingBarStyle /*104*/:
                    return Long.valueOf(((parseLong * 1000) * 60) * 60);
                case 'm':
                    return Long.valueOf((parseLong * 1000) * 60);
                case 's':
                    return Long.valueOf(parseLong * 1000);
                default:
                    aj.m7038b("unknown units in _lifetime: " + str);
                    return null;
            }
        }
        aj.m7040c("unknown _lifetime: " + str);
        return null;
    }

    private void m7259b() {
        int i = 0;
        while (true) {
            Map map = (Map) this.f4795g.poll();
            if (map != null) {
                m7265g(map);
                int i2 = i + 1;
                if (i2 > 500) {
                    this.f4795g.clear();
                    throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    private void m7260b(Map<String, Object> map) {
        this.f4794f.lock();
        try {
            this.f4795g.offer(map);
            if (this.f4794f.getHoldCount() == 1) {
                m7259b();
            }
            m7261c((Map) map);
        } finally {
            this.f4794f.unlock();
        }
    }

    private void m7261c(Map<String, Object> map) {
        Long d = m7262d(map);
        if (d != null) {
            List f = m7264f(map);
            f.remove("gtm.lifetime");
            this.f4796h.mo1025a(f, d.longValue());
        }
    }

    private Long m7262d(Map<String, Object> map) {
        Object e = m7263e(map);
        return e == null ? null : C1585c.m7258b(e.toString());
    }

    private Object m7263e(Map<String, Object> map) {
        String[] strArr = f4790b;
        int length = strArr.length;
        int i = 0;
        Object obj = map;
        while (i < length) {
            Object obj2 = strArr[i];
            if (!(obj instanceof Map)) {
                return null;
            }
            i++;
            obj = ((Map) obj).get(obj2);
        }
        return obj;
    }

    private List<C1583a> m7264f(Map<String, Object> map) {
        Object arrayList = new ArrayList();
        m7257a(map, "", arrayList);
        return arrayList;
    }

    private void m7265g(Map<String, Object> map) {
        synchronized (this.f4793e) {
            for (String str : map.keySet()) {
                m7273a(m7274b(str, map.get(str)), this.f4793e);
            }
        }
        m7266h(map);
    }

    private void m7266h(Map<String, Object> map) {
        for (C1584b a : this.f4792d.keySet()) {
            a.mo1029a(map);
        }
    }

    void m7267a(C1584b c1584b) {
        this.f4792d.put(c1584b, Integer.valueOf(0));
    }

    void m7268a(String str) {
        m7269a(str, null);
        this.f4796h.mo1024a(str);
    }

    public void m7269a(String str, Object obj) {
        m7272a(m7274b(str, obj));
    }

    public void m7270a(String str, Map<String, Object> map) {
        Map hashMap = new HashMap(map);
        hashMap.put("event", str);
        m7272a(hashMap);
    }

    void m7271a(List<Object> list, List<Object> list2) {
        while (list2.size() < list.size()) {
            list2.add(null);
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof List) {
                if (!(list2.get(i) instanceof List)) {
                    list2.set(i, new ArrayList());
                }
                m7271a((List) obj, (List) list2.get(i));
            } else if (obj instanceof Map) {
                if (!(list2.get(i) instanceof Map)) {
                    list2.set(i, new HashMap());
                }
                m7273a((Map) obj, (Map) list2.get(i));
            } else if (obj != f4789a) {
                list2.set(i, obj);
            }
        }
    }

    public void m7272a(Map<String, Object> map) {
        try {
            this.f4797i.await();
        } catch (InterruptedException e) {
            aj.m7038b("DataLayer.push: unexpected InterruptedException");
        }
        m7260b((Map) map);
    }

    void m7273a(Map<String, Object> map, Map<String, Object> map2) {
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                if (!(map2.get(str) instanceof List)) {
                    map2.put(str, new ArrayList());
                }
                m7271a((List) obj, (List) map2.get(str));
            } else if (obj instanceof Map) {
                if (!(map2.get(str) instanceof Map)) {
                    map2.put(str, new HashMap());
                }
                m7273a((Map) obj, (Map) map2.get(str));
            } else {
                map2.put(str, obj);
            }
        }
    }

    Map<String, Object> m7274b(String str, Object obj) {
        Map hashMap = new HashMap();
        String[] split = str.toString().split("\\.");
        int i = 0;
        Map map = hashMap;
        while (i < split.length - 1) {
            HashMap hashMap2 = new HashMap();
            map.put(split[i], hashMap2);
            i++;
            Object obj2 = hashMap2;
        }
        map.put(split[split.length - 1], obj);
        return hashMap;
    }

    public Object m7275c(String str) {
        synchronized (this.f4793e) {
            Map map = this.f4793e;
            String[] split = str.split("\\.");
            int length = split.length;
            Object obj = map;
            int i = 0;
            while (i < length) {
                Object obj2 = split[i];
                if (obj instanceof Map) {
                    obj2 = ((Map) obj).get(obj2);
                    if (obj2 == null) {
                        return null;
                    }
                    i++;
                    obj = obj2;
                } else {
                    return null;
                }
            }
            return obj;
        }
    }

    public String toString() {
        String stringBuilder;
        synchronized (this.f4793e) {
            StringBuilder stringBuilder2 = new StringBuilder();
            for (Entry entry : this.f4793e.entrySet()) {
                stringBuilder2.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[]{entry.getKey(), entry.getValue()}));
            }
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }
}
