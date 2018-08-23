package com.google.android.gms.p028c;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ic<K, V> extends C1042if<K, V> implements Map<K, V> {
    ie<K, V> f3583a;

    class C10411 extends ie<K, V> {
        final /* synthetic */ ic f3575a;

        C10411(ic icVar) {
            this.f3575a = icVar;
        }

        protected int mo815a() {
            return this.f3575a.h;
        }

        protected int mo816a(Object obj) {
            return obj == null ? this.f3575a.m5237a() : this.f3575a.m5239a(obj, obj.hashCode());
        }

        protected Object mo817a(int i, int i2) {
            return this.f3575a.g[(i << 1) + i2];
        }

        protected V mo818a(int i, V v) {
            return this.f3575a.m5240a(i, (Object) v);
        }

        protected void mo819a(int i) {
            this.f3575a.m5244d(i);
        }

        protected void mo820a(K k, V v) {
            this.f3575a.put(k, v);
        }

        protected int mo821b(Object obj) {
            return this.f3575a.m5238a(obj);
        }

        protected Map<K, V> mo822b() {
            return this.f3575a;
        }

        protected void mo823c() {
            this.f3575a.clear();
        }
    }

    private ie<K, V> m5245b() {
        if (this.f3583a == null) {
            this.f3583a = new C10411(this);
        }
        return this.f3583a;
    }

    public Set<Entry<K, V>> entrySet() {
        return m5245b().m5223d();
    }

    public Set<K> keySet() {
        return m5245b().m5224e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m5241a(this.h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        return m5245b().m5225f();
    }
}
