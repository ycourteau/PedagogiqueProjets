package com.google.android.gms.p028c;

import android.os.Process;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@fn
public final class gn {
    private static final ExecutorService f3356a = Executors.newFixedThreadPool(10, gn.m4825a("Default"));
    private static final ExecutorService f3357b = Executors.newFixedThreadPool(5, gn.m4825a("Loader"));

    public static hc<Void> m4821a(int i, final Runnable runnable) {
        return i == 1 ? gn.m4824a(f3357b, new Callable<Void>() {
            public Void m4819a() {
                runnable.run();
                return null;
            }

            public /* synthetic */ Object call() {
                return m4819a();
            }
        }) : gn.m4824a(f3356a, new Callable<Void>() {
            public Void m4820a() {
                runnable.run();
                return null;
            }

            public /* synthetic */ Object call() {
                return m4820a();
            }
        });
    }

    public static hc<Void> m4822a(Runnable runnable) {
        return gn.m4821a(0, runnable);
    }

    public static <T> hc<T> m4823a(Callable<T> callable) {
        return gn.m4824a(f3356a, (Callable) callable);
    }

    public static <T> hc<T> m4824a(ExecutorService executorService, final Callable<T> callable) {
        final Object gzVar = new gz();
        try {
            executorService.submit(new Runnable() {
                public void run() {
                    try {
                        Process.setThreadPriority(10);
                        gzVar.m4958b(callable.call());
                    } catch (Throwable e) {
                        C0618p.m2799h().m4781a(e, true);
                        gzVar.cancel(true);
                    }
                }
            });
        } catch (Throwable e) {
            C0691b.m3102d("Thread execution is rejected.", e);
            gzVar.cancel(true);
        }
        return gzVar;
    }

    private static ThreadFactory m4825a(final String str) {
        return new ThreadFactory() {
            private final AtomicInteger f3355b = new AtomicInteger(1);

            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "AdWorker(" + str + ") #" + this.f3355b.getAndIncrement());
            }
        };
    }
}
