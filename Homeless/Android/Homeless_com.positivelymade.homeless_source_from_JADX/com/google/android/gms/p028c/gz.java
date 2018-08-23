package com.google.android.gms.p028c;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@fn
public class gz<T> implements hc<T> {
    private final Object f3404a = new Object();
    private T f3405b = null;
    private boolean f3406c = false;
    private boolean f3407d = false;
    private final hd f3408e = new hd();

    public void mo758a(Runnable runnable) {
        this.f3408e.m4987a(runnable);
    }

    public void m4958b(T t) {
        synchronized (this.f3404a) {
            if (this.f3406c) {
                throw new IllegalStateException("Provided CallbackFuture with multiple values.");
            }
            this.f3406c = true;
            this.f3405b = t;
            this.f3404a.notifyAll();
            this.f3408e.m4986a();
        }
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f3404a) {
            if (this.f3406c) {
                return false;
            }
            this.f3407d = true;
            this.f3406c = true;
            this.f3404a.notifyAll();
            this.f3408e.m4986a();
            return true;
        }
    }

    public T get() {
        T t;
        synchronized (this.f3404a) {
            if (!this.f3406c) {
                try {
                    this.f3404a.wait();
                } catch (InterruptedException e) {
                }
            }
            if (this.f3407d) {
                throw new CancellationException("CallbackFuture was cancelled.");
            }
            t = this.f3405b;
        }
        return t;
    }

    public T get(long j, TimeUnit timeUnit) {
        T t;
        synchronized (this.f3404a) {
            if (!this.f3406c) {
                try {
                    long toMillis = timeUnit.toMillis(j);
                    if (toMillis != 0) {
                        this.f3404a.wait(toMillis);
                    }
                } catch (InterruptedException e) {
                }
            }
            if (!this.f3406c) {
                throw new TimeoutException("CallbackFuture timed out.");
            } else if (this.f3407d) {
                throw new CancellationException("CallbackFuture was cancelled.");
            } else {
                t = this.f3405b;
            }
        }
        return t;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.f3404a) {
            z = this.f3407d;
        }
        return z;
    }

    public boolean isDone() {
        boolean z;
        synchronized (this.f3404a) {
            z = this.f3406c;
        }
        return z;
    }
}
