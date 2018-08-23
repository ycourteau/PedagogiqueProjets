package com.google.android.gms.p032d;

import android.util.LruCache;
import com.google.android.gms.p032d.cw.C1566a;

class ae<K, V> implements cv<K, V> {
    private LruCache<K, V> f4651a;

    ae(int i, final C1566a<K, V> c1566a) {
        this.f4651a = new LruCache<K, V>(this, i) {
            final /* synthetic */ ae f4650b;

            protected int sizeOf(K k, V v) {
                return c1566a.mo1017a(k, v);
            }
        };
    }

    public V mo974a(K k) {
        return this.f4651a.get(k);
    }

    public void mo975a(K k, V v) {
        this.f4651a.put(k, v);
    }
}
