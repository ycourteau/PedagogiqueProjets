package com.google.android.gms.p028c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class ie<K, V> {
    C1044b f3572b;
    C1045c f3573c;
    C1047e f3574d;

    final class C1043a<T> implements Iterator<T> {
        final int f3587a;
        int f3588b;
        int f3589c;
        boolean f3590d = false;
        final /* synthetic */ ie f3591e;

        C1043a(ie ieVar, int i) {
            this.f3591e = ieVar;
            this.f3587a = i;
            this.f3588b = ieVar.mo815a();
        }

        public boolean hasNext() {
            return this.f3589c < this.f3588b;
        }

        public T next() {
            T a = this.f3591e.mo817a(this.f3589c, this.f3587a);
            this.f3589c++;
            this.f3590d = true;
            return a;
        }

        public void remove() {
            if (this.f3590d) {
                this.f3589c--;
                this.f3588b--;
                this.f3590d = false;
                this.f3591e.mo819a(this.f3589c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    final class C1044b implements Set<Entry<K, V>> {
        final /* synthetic */ ie f3592a;

        C1044b(ie ieVar) {
            this.f3592a = ieVar;
        }

        public boolean m5248a(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ boolean add(Object obj) {
            return m5248a((Entry) obj);
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int a = this.f3592a.mo815a();
            for (Entry entry : collection) {
                this.f3592a.mo820a(entry.getKey(), entry.getValue());
            }
            return a != this.f3592a.mo815a();
        }

        public void clear() {
            this.f3592a.mo823c();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = this.f3592a.mo816a(entry.getKey());
            return a >= 0 ? id.m5247a(this.f3592a.mo817a(a, 1), entry.getValue()) : false;
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
            return ie.m5209a((Set) this, obj);
        }

        public int hashCode() {
            int a = this.f3592a.mo815a() - 1;
            int i = 0;
            while (a >= 0) {
                Object a2 = this.f3592a.mo817a(a, 0);
                Object a3 = this.f3592a.mo817a(a, 1);
                a--;
                i += (a3 == null ? 0 : a3.hashCode()) ^ (a2 == null ? 0 : a2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return this.f3592a.mo815a() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C1046d(this.f3592a);
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
            return this.f3592a.mo815a();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class C1045c implements Set<K> {
        final /* synthetic */ ie f3593a;

        C1045c(ie ieVar) {
            this.f3593a = ieVar;
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.f3593a.mo823c();
        }

        public boolean contains(Object obj) {
            return this.f3593a.mo816a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return ie.m5208a(this.f3593a.mo822b(), (Collection) collection);
        }

        public boolean equals(Object obj) {
            return ie.m5209a((Set) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = this.f3593a.mo815a() - 1; a >= 0; a--) {
                Object a2 = this.f3593a.mo817a(a, 0);
                i += a2 == null ? 0 : a2.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return this.f3593a.mo815a() == 0;
        }

        public Iterator<K> iterator() {
            return new C1043a(this.f3593a, 0);
        }

        public boolean remove(Object obj) {
            int a = this.f3593a.mo816a(obj);
            if (a < 0) {
                return false;
            }
            this.f3593a.mo819a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return ie.m5210b(this.f3593a.mo822b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return ie.m5211c(this.f3593a.mo822b(), collection);
        }

        public int size() {
            return this.f3593a.mo815a();
        }

        public Object[] toArray() {
            return this.f3593a.m5221b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return this.f3593a.m5218a((Object[]) tArr, 0);
        }
    }

    final class C1046d implements Iterator<Entry<K, V>>, Entry<K, V> {
        int f3594a;
        int f3595b;
        boolean f3596c = false;
        final /* synthetic */ ie f3597d;

        C1046d(ie ieVar) {
            this.f3597d = ieVar;
            this.f3594a = ieVar.mo815a() - 1;
            this.f3595b = -1;
        }

        public Entry<K, V> m5249a() {
            this.f3595b++;
            this.f3596c = true;
            return this;
        }

        public final boolean equals(Object obj) {
            boolean z = true;
            if (!this.f3596c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Entry)) {
                return false;
            } else {
                Entry entry = (Entry) obj;
                if (!(id.m5247a(entry.getKey(), this.f3597d.mo817a(this.f3595b, 0)) && id.m5247a(entry.getValue(), this.f3597d.mo817a(this.f3595b, 1)))) {
                    z = false;
                }
                return z;
            }
        }

        public K getKey() {
            if (this.f3596c) {
                return this.f3597d.mo817a(this.f3595b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f3596c) {
                return this.f3597d.mo817a(this.f3595b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f3595b < this.f3594a;
        }

        public final int hashCode() {
            int i = 0;
            if (this.f3596c) {
                Object a = this.f3597d.mo817a(this.f3595b, 0);
                Object a2 = this.f3597d.mo817a(this.f3595b, 1);
                int hashCode = a == null ? 0 : a.hashCode();
                if (a2 != null) {
                    i = a2.hashCode();
                }
                return i ^ hashCode;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public /* synthetic */ Object next() {
            return m5249a();
        }

        public void remove() {
            if (this.f3596c) {
                this.f3597d.mo819a(this.f3595b);
                this.f3595b--;
                this.f3594a--;
                this.f3596c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f3596c) {
                return this.f3597d.mo818a(this.f3595b, (Object) v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class C1047e implements Collection<V> {
        final /* synthetic */ ie f3598a;

        C1047e(ie ieVar) {
            this.f3598a = ieVar;
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.f3598a.mo823c();
        }

        public boolean contains(Object obj) {
            return this.f3598a.mo821b(obj) >= 0;
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
            return this.f3598a.mo815a() == 0;
        }

        public Iterator<V> iterator() {
            return new C1043a(this.f3598a, 1);
        }

        public boolean remove(Object obj) {
            int b = this.f3598a.mo821b(obj);
            if (b < 0) {
                return false;
            }
            this.f3598a.mo819a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int i = 0;
            int a = this.f3598a.mo815a();
            boolean z = false;
            while (i < a) {
                if (collection.contains(this.f3598a.mo817a(i, 1))) {
                    this.f3598a.mo819a(i);
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
            int a = this.f3598a.mo815a();
            boolean z = false;
            while (i < a) {
                if (!collection.contains(this.f3598a.mo817a(i, 1))) {
                    this.f3598a.mo819a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return this.f3598a.mo815a();
        }

        public Object[] toArray() {
            return this.f3598a.m5221b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return this.f3598a.m5218a((Object[]) tArr, 1);
        }
    }

    ie() {
    }

    public static <K, V> boolean m5208a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean m5209a(Set<T> set, Object obj) {
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

    public static <K, V> boolean m5210b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static <K, V> boolean m5211c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract int mo815a();

    protected abstract int mo816a(Object obj);

    protected abstract Object mo817a(int i, int i2);

    protected abstract V mo818a(int i, V v);

    protected abstract void mo819a(int i);

    protected abstract void mo820a(K k, V v);

    public <T> T[] m5218a(T[] tArr, int i) {
        int a = mo815a();
        T[] tArr2 = tArr.length < a ? (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a) : tArr;
        for (int i2 = 0; i2 < a; i2++) {
            tArr2[i2] = mo817a(i2, i);
        }
        if (tArr2.length > a) {
            tArr2[a] = null;
        }
        return tArr2;
    }

    protected abstract int mo821b(Object obj);

    protected abstract Map<K, V> mo822b();

    public Object[] m5221b(int i) {
        int a = mo815a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo817a(i2, i);
        }
        return objArr;
    }

    protected abstract void mo823c();

    public Set<Entry<K, V>> m5223d() {
        if (this.f3572b == null) {
            this.f3572b = new C1044b(this);
        }
        return this.f3572b;
    }

    public Set<K> m5224e() {
        if (this.f3573c == null) {
            this.f3573c = new C1045c(this);
        }
        return this.f3573c;
    }

    public Collection<V> m5225f() {
        if (this.f3574d == null) {
            this.f3574d = new C1047e(this);
        }
        return this.f3574d;
    }
}
