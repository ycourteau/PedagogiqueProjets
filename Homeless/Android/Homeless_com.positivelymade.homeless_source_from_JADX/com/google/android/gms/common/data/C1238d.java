package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.C1305x;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class C1238d<T> implements Iterator<T> {
    protected final C1235b<T> f4275a;
    protected int f4276b = -1;

    public C1238d(C1235b<T> c1235b) {
        this.f4275a = (C1235b) C1305x.m6617a((Object) c1235b);
    }

    public boolean hasNext() {
        return this.f4276b < this.f4275a.mo899a() + -1;
    }

    public T next() {
        if (hasNext()) {
            C1235b c1235b = this.f4275a;
            int i = this.f4276b + 1;
            this.f4276b = i;
            return c1235b.mo1618a(i);
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.f4276b);
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
