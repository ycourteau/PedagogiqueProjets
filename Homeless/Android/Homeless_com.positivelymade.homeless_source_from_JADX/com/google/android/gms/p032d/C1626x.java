package com.google.android.gms.p032d;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

class C1626x extends Thread implements C1624w {
    private static C1626x f5000d;
    private final LinkedBlockingQueue<Runnable> f5001a = new LinkedBlockingQueue();
    private volatile boolean f5002b = false;
    private volatile boolean f5003c = false;
    private volatile C1558y f5004e;
    private final Context f5005f;

    private C1626x(Context context) {
        super("GAThread");
        if (context != null) {
            this.f5005f = context.getApplicationContext();
        } else {
            this.f5005f = context;
        }
        start();
    }

    static C1626x m7502a(Context context) {
        if (f5000d == null) {
            f5000d = new C1626x(context);
        }
        return f5000d;
    }

    private String m7505a(Throwable th) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        th.printStackTrace(printStream);
        printStream.flush();
        return new String(byteArrayOutputStream.toByteArray());
    }

    public void mo1043a(Runnable runnable) {
        this.f5001a.add(runnable);
    }

    public void mo1044a(String str) {
        m7509a(str, System.currentTimeMillis());
    }

    void m7509a(String str, long j) {
        final C1626x c1626x = this;
        final long j2 = j;
        final String str2 = str;
        mo1043a(new Runnable(this) {
            final /* synthetic */ C1626x f4999d;

            public void run() {
                if (this.f4999d.f5004e == null) {
                    bx c = bx.m7227c();
                    c.m7235a(this.f4999d.f5005f, c1626x);
                    this.f4999d.f5004e = c.m7239d();
                }
                this.f4999d.f5004e.mo1013a(j2, str2);
            }
        });
    }

    public void run() {
        while (!this.f5003c) {
            try {
                Runnable runnable = (Runnable) this.f5001a.take();
                if (!this.f5002b) {
                    runnable.run();
                }
            } catch (InterruptedException e) {
                aj.m7040c(e.toString());
            } catch (Throwable th) {
                aj.m7036a("Error on Google TagManager Thread: " + m7505a(th));
                aj.m7036a("Google TagManager is shutting down.");
                this.f5002b = true;
            }
        }
    }
}
