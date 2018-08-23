package com.google.android.gms.p032d;

import com.google.android.gms.p032d.cw.C1566a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class bz<K, V> implements cv<K, V> {
    private final Map<K, V> f4782a = new HashMap();
    private final int f4783b;
    private final C1566a<K, V> f4784c;
    private int f4785d;

    bz(int i, C1566a<K, V> c1566a) {
        this.f4783b = i;
        this.f4784c = c1566a;
    }

    public synchronized V mo974a(K k) {
        return this.f4782a.get(k);
    }

    public synchronized void mo975a(K k, V v) {
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        this.f4785d += this.f4784c.mo1017a(k, v);
        if (this.f4785d > this.f4783b) {
            Iterator it = this.f4782a.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                this.f4785d -= this.f4784c.mo1017a(entry.getKey(), entry.getValue());
                it.remove();
                if (this.f4785d <= this.f4783b) {
                    break;
                }
            }
        }
        this.f4782a.put(k, v);
    }
}
