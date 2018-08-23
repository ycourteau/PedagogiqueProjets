package com.google.android.gms.common.data;

import java.util.Iterator;

public abstract class C1236a<T> implements C1235b<T> {
    protected final DataHolder f4274a;

    protected C1236a(DataHolder dataHolder) {
        this.f4274a = dataHolder;
        if (this.f4274a != null) {
            this.f4274a.m6236a((Object) this);
        }
    }

    public int mo899a() {
        return this.f4274a == null ? 0 : this.f4274a.m6248g();
    }

    public void mo627b() {
        if (this.f4274a != null) {
            this.f4274a.m6251i();
        }
    }

    public Iterator<T> iterator() {
        return new C1238d(this);
    }
}
