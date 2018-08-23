package android.support.v4.p007f;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C0087a<K, V> extends C0086g<K, V> implements Map<K, V> {
    C0084f<K, V> f271a;

    class C00851 extends C0084f<K, V> {
        final /* synthetic */ C0087a f263a;

        C00851(C0087a c0087a) {
            this.f263a = c0087a;
        }

        protected int mo55a() {
            return this.f263a.h;
        }

        protected int mo56a(Object obj) {
            return this.f263a.m460a(obj);
        }

        protected Object mo57a(int i, int i2) {
            return this.f263a.g[(i << 1) + i2];
        }

        protected V mo58a(int i, V v) {
            return this.f263a.m462a(i, (Object) v);
        }

        protected void mo59a(int i) {
            this.f263a.m467d(i);
        }

        protected void mo60a(K k, V v) {
            this.f263a.put(k, v);
        }

        protected int mo61b(Object obj) {
            return this.f263a.m464b(obj);
        }

        protected Map<K, V> mo62b() {
            return this.f263a;
        }

        protected void mo63c() {
            this.f263a.clear();
        }
    }

    private C0084f<K, V> m468b() {
        if (this.f271a == null) {
            this.f271a = new C00851(this);
        }
        return this.f271a;
    }

    public boolean m469a(Collection<?> collection) {
        return C0084f.m433c(this, collection);
    }

    public Set<Entry<K, V>> entrySet() {
        return m468b().m445d();
    }

    public Set<K> keySet() {
        return m468b().m446e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m463a(this.h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        return m468b().m447f();
    }
}
