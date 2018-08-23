package com.google.android.gms.p028c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.analytics.internal.C0741l;
import com.google.android.gms.common.internal.C1305x;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class jk {
    private static volatile jk f3749a;
    private final Context f3750b;
    private final List<jl> f3751c = new CopyOnWriteArrayList();
    private final jf f3752d = new jf();
    private final C1094a f3753e = new C1094a(this);
    private volatile jp f3754f;
    private UncaughtExceptionHandler f3755g;

    private class C1094a extends ThreadPoolExecutor {
        final /* synthetic */ jk f3747a;

        public C1094a(jk jkVar) {
            this.f3747a = jkVar;
            super(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
            setThreadFactory(new C1095b());
        }

        protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
            return new FutureTask<T>(this, runnable, t) {
                final /* synthetic */ C1094a f3746a;

                protected void setException(Throwable th) {
                    UncaughtExceptionHandler b = this.f3746a.f3747a.f3755g;
                    if (b != null) {
                        b.uncaughtException(Thread.currentThread(), th);
                    } else if (Log.isLoggable("GAv4", 6)) {
                        Log.e("GAv4", "MeasurementExecutor: job failed with " + th);
                    }
                    super.setException(th);
                }
            };
        }
    }

    private static class C1095b implements ThreadFactory {
        private static final AtomicInteger f3748a = new AtomicInteger();

        private C1095b() {
        }

        public Thread newThread(Runnable runnable) {
            return new C1096c(runnable, "measurement-" + f3748a.incrementAndGet());
        }
    }

    private static class C1096c extends Thread {
        C1096c(Runnable runnable, String str) {
            super(runnable, str);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    jk(Context context) {
        Object applicationContext = context.getApplicationContext();
        C1305x.m6617a(applicationContext);
        this.f3750b = applicationContext;
    }

    public static jk m5369a(Context context) {
        C1305x.m6617a((Object) context);
        if (f3749a == null) {
            synchronized (jk.class) {
                if (f3749a == null) {
                    f3749a = new jk(context);
                }
            }
        }
        return f3749a;
    }

    private void m5373b(jg jgVar) {
        C1305x.m6628c("deliver should be called from worker thread");
        C1305x.m6626b(jgVar.m5362f(), "Measurement must be submitted");
        List<jm> c = jgVar.m5359c();
        if (!c.isEmpty()) {
            Set hashSet = new HashSet();
            for (jm jmVar : c) {
                Uri a = jmVar.mo556a();
                if (!hashSet.contains(a)) {
                    hashSet.add(a);
                    jmVar.mo557a(jgVar);
                }
            }
        }
    }

    public static void m5374d() {
        if (!(Thread.currentThread() instanceof C1096c)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public jp m5375a() {
        if (this.f3754f == null) {
            synchronized (this) {
                if (this.f3754f == null) {
                    jp jpVar = new jp();
                    PackageManager packageManager = this.f3750b.getPackageManager();
                    String packageName = this.f3750b.getPackageName();
                    jpVar.m5399c(packageName);
                    jpVar.m5401d(packageManager.getInstallerPackageName(packageName));
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(this.f3750b.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (NameNotFoundException e) {
                        Log.e("GAv4", "Error retrieving package info: appName set to " + packageName);
                    }
                    jpVar.m5395a(packageName);
                    jpVar.m5397b(str);
                    this.f3754f = jpVar;
                }
            }
        }
        return this.f3754f;
    }

    public <V> Future<V> m5376a(Callable<V> callable) {
        C1305x.m6617a((Object) callable);
        if (!(Thread.currentThread() instanceof C1096c)) {
            return this.f3753e.submit(callable);
        }
        Future futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    void m5377a(jg jgVar) {
        if (jgVar.m5366j()) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        } else if (jgVar.m5362f()) {
            throw new IllegalStateException("Measurement can only be submitted once");
        } else {
            final jg a = jgVar.m5353a();
            a.m5363g();
            this.f3753e.execute(new Runnable(this) {
                final /* synthetic */ jk f3745b;

                public void run() {
                    a.m5364h().mo537a(a);
                    for (jl a : this.f3745b.f3751c) {
                        a.m5382a(a);
                    }
                    this.f3745b.m5373b(a);
                }
            });
        }
    }

    public void m5378a(Runnable runnable) {
        C1305x.m6617a((Object) runnable);
        this.f3753e.submit(runnable);
    }

    public void m5379a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f3755g = uncaughtExceptionHandler;
    }

    public jr m5380b() {
        DisplayMetrics displayMetrics = this.f3750b.getResources().getDisplayMetrics();
        jr jrVar = new jr();
        jrVar.m5428a(C0741l.m3450a(Locale.getDefault()));
        jrVar.m5430b(displayMetrics.widthPixels);
        jrVar.m5432c(displayMetrics.heightPixels);
        return jrVar;
    }

    public Context m5381c() {
        return this.f3750b;
    }
}
