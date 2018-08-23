package com.google.android.gms.p028c;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ln {
    public static String f3965a = "Volley";
    public static boolean f3966b = Log.isLoggable(f3965a, 2);

    static class C1129a {
        public static final boolean f3962a = ln.f3966b;
        private final List<C1128a> f3963b = new ArrayList();
        private boolean f3964c = false;

        private static class C1128a {
            public final String f3959a;
            public final long f3960b;
            public final long f3961c;

            public C1128a(String str, long j, long j2) {
                this.f3959a = str;
                this.f3960b = j;
                this.f3961c = j2;
            }
        }

        C1129a() {
        }

        private long m5762a() {
            if (this.f3963b.size() == 0) {
                return 0;
            }
            return ((C1128a) this.f3963b.get(this.f3963b.size() - 1)).f3961c - ((C1128a) this.f3963b.get(0)).f3961c;
        }

        public synchronized void m5763a(String str) {
            this.f3964c = true;
            if (m5762a() > 0) {
                long j = ((C1128a) this.f3963b.get(0)).f3961c;
                ln.m5767b("(%-4d ms) %s", Long.valueOf(r2), str);
                long j2 = j;
                for (C1128a c1128a : this.f3963b) {
                    ln.m5767b("(+%-4d) [%2d] %s", Long.valueOf(c1128a.f3961c - j2), Long.valueOf(c1128a.f3960b), c1128a.f3959a);
                    j2 = c1128a.f3961c;
                }
            }
        }

        public synchronized void m5764a(String str, long j) {
            if (this.f3964c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f3963b.add(new C1128a(str, j, SystemClock.elapsedRealtime()));
        }

        protected void finalize() {
            if (!this.f3964c) {
                m5763a("Request on the loose");
                ln.m5768c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static void m5765a(String str, Object... objArr) {
        if (f3966b) {
            Log.v(f3965a, ln.m5769d(str, objArr));
        }
    }

    public static void m5766a(Throwable th, String str, Object... objArr) {
        Log.e(f3965a, ln.m5769d(str, objArr), th);
    }

    public static void m5767b(String str, Object... objArr) {
        Log.d(f3965a, ln.m5769d(str, objArr));
    }

    public static void m5768c(String str, Object... objArr) {
        Log.e(f3965a, ln.m5769d(str, objArr));
    }

    private static String m5769d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str3 = "<unknown>";
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClass().equals(ln.class)) {
                str3 = stackTrace[i].getClassName();
                str3 = str3.substring(str3.lastIndexOf(46) + 1);
                str2 = str3.substring(str3.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            }
        }
        str2 = str3;
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
