package com.google.android.gms.p028c;

import java.util.concurrent.TimeUnit;

@fn
public class ha<T> implements hc<T> {
    private final T f3448a;
    private final hd f3449b = new hd();

    public ha(T t) {
        this.f3448a = t;
        this.f3449b.m4986a();
    }

    public void mo758a(Runnable runnable) {
        this.f3449b.m4987a(runnable);
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public T get() {
        return this.f3448a;
    }

    public T get(long j, TimeUnit timeUnit) {
        return this.f3448a;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
