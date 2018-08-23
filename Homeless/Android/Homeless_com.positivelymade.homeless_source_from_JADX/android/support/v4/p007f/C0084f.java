package android.support.v4.p007f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class C0084f<K, V> {
    C0093b f260b;
    C0094c f261c;
    C0096e f262d;

    final class C0092a<T> implements Iterator<T> {
        final int f285a;
        int f286b;
        int f287c;
        boolean f288d = false;
        final /* synthetic */ C0084f f289e;

        C0092a(C0084f c0084f, int i) {
            this.f289e = c0084f;
            this.f285a = i;
            this.f286b = c0084f.mo55a();
        }

        public boolean hasNext() {
            return this.f287c < this.f286b;
        }

        public T next() {
            T a = this.f289e.mo57a(this.f287c, this.f285a);
            this.f287c++;
            this.f288d = true;
            return a;
        }

        public void remove() {
            if (this.f288d) {
                this.f287c--;
                this.f286b--;
                this.f288d = false;
                this.f289e.mo59a(this.f287c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    final class C0093b implements Set<Entry<K, V>> {
        final /* synthetic */ C0084f f290a;

        C0093b(C0084f c0084f) {
            this.f290a = c0084f;
        }

        public boolean m483a(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ boolean add(Object obj) {
            return m483a((Entry) obj);
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int a = this.f290a.mo55a();
            for (Entry entry : collection) {
                this.f290a.mo60a(entry.getKey(), entry.getValue());
            }
            return a != this.f290a.mo55a();
        }

        public void clear() {
            this.f290a.mo63c();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = this.f290a.mo56a(entry.getKey());
            return a >= 0 ? C0088b.m472a(this.f290a.mo57a(a, 1), entry.getValue()) : false;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C0084f.m431a((Set) this, obj);
        }

        public int hashCode() {
            int a = this.f290a.mo55a() - 1;
            int i = 0;
            while (a >= 0) {
                Object a2 = this.f290a.mo57a(a, 0);
                Object a3 = this.f290a.mo57a(a, 1);
                a--;
                i += (a3 == null ? 0 : a3.hashCode()) ^ (a2 == null ? 0 : a2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return this.f290a.mo55a() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C0095d(this.f290a);
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return this.f290a.mo55a();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class C0094c implements Set<K> {
        final /* synthetic */ C0084f f291a;

        C0094c(C0084f c0084f) {
            this.f291a = c0084f;
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.f291a.mo63c();
        }

        public boolean contains(Object obj) {
            return this.f291a.mo56a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C0084f.m430a(this.f291a.mo62b(), (Collection) collection);
        }

        public boolean equals(Object obj) {
            return C0084f.m431a((Set) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = this.f291a.mo55a() - 1; a >= 0; a--) {
                Object a2 = this.f291a.mo57a(a, 0);
                i += a2 == null ? 0 : a2.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return this.f291a.mo55a() == 0;
        }

        public Iterator<K> iterator() {
            return new C0092a(this.f291a, 0);
        }

        public boolean remove(Object obj) {
            int a = this.f291a.mo56a(obj);
            if (a < 0) {
                return false;
            }
            this.f291a.mo59a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C0084f.m432b(this.f291a.mo62b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C0084f.m433c(this.f291a.mo62b(), collection);
        }

        public int size() {
            return this.f291a.mo55a();
        }

        public Object[] toArray() {
            return this.f291a.m443b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return this.f291a.m440a((Object[]) tArr, 0);
        }
    }

    final class C0095d implements Iterator<Entry<K, V>>, Entry<K, V> {
        int f292a;
        int f293b;
        boolean f294c = false;
        final /* synthetic */ C0084f f295d;

        C0095d(C0084f c0084f) {
            this.f295d = c0084f;
            this.f292a = c0084f.mo55a() - 1;
            this.f293b = -1;
        }

        public Entry<K, V> m484a() {
            this.f293b++;
            this.f294c = true;
            return this;
        }

        public final boolean equals(Object obj) {
            boolean z = true;
            if (!this.f294c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Entry)) {
                return false;
            } else {
                Entry entry = (Entry) obj;
                if (!(C0088b.m472a(entry.getKey(), this.f295d.mo57a(this.f293b, 0)) && C0088b.m472a(entry.getValue(), this.f295d.mo57a(this.f293b, 1)))) {
                    z = false;
                }
                return z;
            }
        }

        public K getKey() {
            if (this.f294c) {
                return this.f295d.mo57a(this.f293b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f294c) {
                return this.f295d.mo57a(this.f293b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f293b < this.f292a;
        }

        public final int hashCode() {
            int i = 0;
            if (this.f294c) {
                Object a = this.f295d.mo57a(this.f293b, 0);
                Object a2 = this.f295d.mo57a(this.f293b, 1);
                int hashCode = a == null ? 0 : a.hashCode();
                if (a2 != null) {
                    i = a2.hashCode();
                }
                return i ^ hashCode;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public /* synthetic */ Object next() {
            return m484a();
        }

        public void remove() {
            if (this.f294c) {
                this.f295d.mo59a(this.f293b);
                this.f293b--;
                this.f292a--;
                this.f294c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f294c) {
                return this.f295d.mo58a(this.f293b, (Object) v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class C0096e implements Collection<V> {
        final /* synthetic */ C0084f f296a;

        C0096e(C0084f c0084f) {
            this.f296a = c0084f;
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.f296a.mo63c();
        }

        public boolean contains(Object obj) {
            return this.f296a.mo61b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return this.f296a.mo55a() == 0;
        }

        public Iterator<V> iterator() {
            return new C0092a(this.f296a, 1);
        }

        public boolean remove(Object obj) {
            int b = this.f296a.mo61b(obj);
            if (b < 0) {
                return false;
            }
            this.f296a.mo59a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int i = 0;
            int a = this.f296a.mo55a();
            boolean z = false;
            while (i < a) {
                if (collection.contains(this.f296a.mo57a(i, 1))) {
                    this.f296a.mo59a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int i = 0;
            int a = this.f296a.mo55a();
            boolean z = false;
            while (i < a) {
                if (!collection.contains(this.f296a.mo57a(i, 1))) {
                    this.f296a.mo59a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return this.f296a.mo55a();
        }

        public Object[] toArray() {
            return this.f296a.m443b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return this.f296a.m440a((Object[]) tArr, 1);
        }
    }

    C0084f() {
    }

    public static <K, V> boolean m430a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean m431a(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (!(set.size() == set2.size() && set.containsAll(set2))) {
                z = false;
            }
            return z;
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    public static <K, V> boolean m432b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static <K, V> boolean m433c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract int mo55a();

    protected abstract int mo56a(Object obj);

    protected abstract Object mo57a(int i, int i2);

    protected abstract V mo58a(int i, V v);

    protected abstract void mo59a(int i);

    protected abstract void mo60a(K k, V v);

    public <T> T[] m440a(T[] tArr, int i) {
        int a = mo55a();
        T[] tArr2 = tArr.length < a ? (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a) : tArr;
        for (int i2 = 0; i2 < a; i2++) {
            tArr2[i2] = mo57a(i2, i);
        }
        if (tArr2.length > a) {
            tArr2[a] = null;
        }
        return tArr2;
    }

    protected abstract int mo61b(Object obj);

    protected abstract Map<K, V> mo62b();

    public Object[] m443b(int i) {
        int a = mo55a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo57a(i2, i);
        }
        return objArr;
    }

    protected abstract void mo63c();

    public Set<Entry<K, V>> m445d() {
        if (this.f260b == null) {
            this.f260b = new C0093b(this);
        }
        return this.f260b;
    }

    public Set<K> m446e() {
        if (this.f261c == null) {
            this.f261c = new C0094c(this);
        }
        return this.f261c;
    }

    public Collection<V> m447f() {
        if (this.f262d == null) {
            this.f262d = new C0096e(this);
        }
        return this.f262d;
    }
}
