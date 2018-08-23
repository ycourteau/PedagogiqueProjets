package com.google.android.gms.games.internal.p042c;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class C1851a {
    final Object f5592a;
    private HashMap<String, AtomicInteger> f5593b;

    public void m8617a() {
        synchronized (this.f5592a) {
            for (Entry entry : this.f5593b.entrySet()) {
                m8618a((String) entry.getKey(), ((AtomicInteger) entry.getValue()).get());
            }
            this.f5593b.clear();
        }
    }

    protected abstract void m8618a(String str, int i);
}
