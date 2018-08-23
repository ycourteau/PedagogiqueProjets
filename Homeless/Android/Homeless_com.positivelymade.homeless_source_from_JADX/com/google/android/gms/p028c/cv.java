package com.google.android.gms.p028c;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.ac.C0806a;
import com.google.android.gms.p028c.he.C0669c;
import com.google.android.gms.p028c.he.C0671a;
import com.google.android.gms.p028c.he.C1012b;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

@fn
public class cv {
    private final Object f2690a;
    private final Context f2691b;
    private final String f2692c;
    private final VersionInfoParcel f2693d;
    private C0675b<ac> f2694e;
    private C0675b<ac> f2695f;
    private C0891e f2696g;
    private int f2697h;

    public interface C0675b<T> {
        void mo523a(T t);
    }

    static class C0881a {
        static int f2667a = 60000;
        static int f2668b = 10000;
    }

    public static class C0882c<T> implements C0675b<T> {
        public void mo523a(T t) {
        }
    }

    public static class C0886d extends hf<af> {
        private final Object f2676d = new Object();
        private final C0891e f2677e;
        private boolean f2678f;

        class C08831 implements C0669c<af> {
            final /* synthetic */ C0886d f2669a;

            C08831(C0886d c0886d) {
                this.f2669a = c0886d;
            }

            public void m4142a(af afVar) {
                C0691b.m3101d("Ending javascript session.");
                ((ag) afVar).mo588a();
            }

            public /* synthetic */ void mo521a(Object obj) {
                m4142a((af) obj);
            }
        }

        class C08842 implements C0669c<af> {
            final /* synthetic */ C0886d f2670a;

            C08842(C0886d c0886d) {
                this.f2670a = c0886d;
            }

            public void m4144a(af afVar) {
                C0691b.m3101d("Releasing engine reference.");
                this.f2670a.f2677e.m4160b();
            }

            public /* synthetic */ void mo521a(Object obj) {
                m4144a((af) obj);
            }
        }

        class C08853 implements C0671a {
            final /* synthetic */ C0886d f2671a;

            C08853(C0886d c0886d) {
                this.f2671a = c0886d;
            }

            public void mo522a() {
                this.f2671a.f2677e.m4160b();
            }
        }

        public C0886d(C0891e c0891e) {
            this.f2677e = c0891e;
        }

        public void m4152a() {
            synchronized (this.f2676d) {
                if (this.f2678f) {
                    return;
                }
                this.f2678f = true;
                m4147a(new C08831(this), new C1012b());
                m4147a(new C08842(this), new C08853(this));
            }
        }
    }

    public static class C0891e extends hf<ac> {
        private final Object f2686d = new Object();
        private C0675b<ac> f2687e;
        private boolean f2688f;
        private int f2689g;

        class C08903 implements C0669c<ac> {
            final /* synthetic */ C0891e f2685a;

            C08903(C0891e c0891e) {
                this.f2685a = c0891e;
            }

            public void m4156a(final ac acVar) {
                go.m4830a(new Runnable(this) {
                    final /* synthetic */ C08903 f2684b;

                    public void run() {
                        this.f2684b.f2685a.f2687e.mo523a(acVar);
                        acVar.mo577a();
                    }
                });
            }

            public /* synthetic */ void mo521a(Object obj) {
                m4156a((ac) obj);
            }
        }

        public C0891e(C0675b<ac> c0675b) {
            this.f2687e = c0675b;
            this.f2688f = false;
            this.f2689g = 0;
        }

        public C0886d m4159a() {
            final C0886d c0886d = new C0886d(this);
            synchronized (this.f2686d) {
                m4147a(new C0669c<ac>(this) {
                    final /* synthetic */ C0891e f2680b;

                    public void m4153a(ac acVar) {
                        C0691b.m3101d("Getting a new session for JS Engine.");
                        c0886d.m4148a(acVar.mo584b());
                    }

                    public /* synthetic */ void mo521a(Object obj) {
                        m4153a((ac) obj);
                    }
                }, new C0671a(this) {
                    final /* synthetic */ C0891e f2682b;

                    public void mo522a() {
                        C0691b.m3101d("Rejecting reference for JS Engine.");
                        c0886d.m4149e();
                    }
                });
                C1305x.m6621a(this.f2689g >= 0);
                this.f2689g++;
            }
            return c0886d;
        }

        protected void m4160b() {
            boolean z = true;
            synchronized (this.f2686d) {
                if (this.f2689g < 1) {
                    z = false;
                }
                C1305x.m6621a(z);
                C0691b.m3101d("Releasing 1 reference for JS Engine");
                this.f2689g--;
                m4162d();
            }
        }

        public void m4161c() {
            boolean z = true;
            synchronized (this.f2686d) {
                if (this.f2689g < 0) {
                    z = false;
                }
                C1305x.m6621a(z);
                C0691b.m3101d("Releasing root reference. JS Engine will be destroyed once other references are released.");
                this.f2688f = true;
                m4162d();
            }
        }

        protected void m4162d() {
            synchronized (this.f2686d) {
                C1305x.m6621a(this.f2689g >= 0);
                if (this.f2688f && this.f2689g == 0) {
                    C0691b.m3101d("No reference is left (including root). Cleaning up engine.");
                    m4147a(new C08903(this), new C1012b());
                } else {
                    C0691b.m3101d("There are still references to the engine. Not destroying.");
                }
            }
        }
    }

    public cv(Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.f2690a = new Object();
        this.f2697h = 1;
        this.f2692c = str;
        this.f2691b = context.getApplicationContext();
        this.f2693d = versionInfoParcel;
        this.f2694e = new C0882c();
        this.f2695f = new C0882c();
    }

    public cv(Context context, VersionInfoParcel versionInfoParcel, String str, C0675b<ac> c0675b, C0675b<ac> c0675b2) {
        this(context, versionInfoParcel, str);
        this.f2694e = c0675b;
        this.f2695f = c0675b2;
    }

    private C0891e m4167c() {
        final C0891e c0891e = new C0891e(this.f2695f);
        go.m4830a(new Runnable(this) {
            final /* synthetic */ cv f2662b;

            public void run() {
                final ac a = this.f2662b.m4173a(this.f2662b.f2691b, this.f2662b.f2693d);
                a.mo579a(new C0806a(this) {
                    final /* synthetic */ C08781 f2652b;

                    class C08721 extends TimerTask {
                        final /* synthetic */ C08731 f2650a;

                        class C08711 implements Runnable {
                            final /* synthetic */ C08721 f2649a;

                            C08711(C08721 c08721) {
                                this.f2649a = c08721;
                            }

                            public void run() {
                                a.mo577a();
                            }
                        }

                        C08721(C08731 c08731) {
                            this.f2650a = c08731;
                        }

                        /* JADX WARNING: inconsistent code. */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void run() {
                            /*
                            r3 = this;
                            r0 = r3.f2650a;
                            r0 = r0.f2652b;
                            r0 = r0.f2662b;
                            r1 = r0.f2690a;
                            monitor-enter(r1);
                            r0 = r3.f2650a;	 Catch:{ all -> 0x003f }
                            r0 = r0.f2652b;	 Catch:{ all -> 0x003f }
                            r0 = r0;	 Catch:{ all -> 0x003f }
                            r0 = r0.m4150f();	 Catch:{ all -> 0x003f }
                            r2 = -1;
                            if (r0 == r2) goto L_0x0025;
                        L_0x0018:
                            r0 = r3.f2650a;	 Catch:{ all -> 0x003f }
                            r0 = r0.f2652b;	 Catch:{ all -> 0x003f }
                            r0 = r0;	 Catch:{ all -> 0x003f }
                            r0 = r0.m4150f();	 Catch:{ all -> 0x003f }
                            r2 = 1;
                            if (r0 != r2) goto L_0x0027;
                        L_0x0025:
                            monitor-exit(r1);	 Catch:{ all -> 0x003f }
                        L_0x0026:
                            return;
                        L_0x0027:
                            r0 = r3.f2650a;	 Catch:{ all -> 0x003f }
                            r0 = r0.f2652b;	 Catch:{ all -> 0x003f }
                            r0 = r0;	 Catch:{ all -> 0x003f }
                            r0.m4149e();	 Catch:{ all -> 0x003f }
                            r0 = new com.google.android.gms.c.cv$1$1$1$1;	 Catch:{ all -> 0x003f }
                            r0.<init>(r3);	 Catch:{ all -> 0x003f }
                            com.google.android.gms.p028c.go.m4830a(r0);	 Catch:{ all -> 0x003f }
                            r0 = "Could not receive loaded message in a timely manner. Rejecting.";
                            com.google.android.gms.ads.internal.util.client.C0691b.m3101d(r0);	 Catch:{ all -> 0x003f }
                            monitor-exit(r1);	 Catch:{ all -> 0x003f }
                            goto L_0x0026;
                        L_0x003f:
                            r0 = move-exception;
                            monitor-exit(r1);	 Catch:{ all -> 0x003f }
                            throw r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.cv.1.1.1.run():void");
                        }
                    }

                    public void mo576a() {
                        new Timer().schedule(new C08721(this), (long) C0881a.f2668b);
                    }
                });
                a.mo581a("/jsLoaded", new cg(this) {
                    final /* synthetic */ C08781 f2654b;

                    /* JADX WARNING: inconsistent code. */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void mo524a(com.google.android.gms.p028c.hg r4, java.util.Map<java.lang.String, java.lang.String> r5) {
                        /*
                        r3 = this;
                        r0 = r3.f2654b;
                        r0 = r0.f2662b;
                        r1 = r0.f2690a;
                        monitor-enter(r1);
                        r0 = r3.f2654b;	 Catch:{ all -> 0x0051 }
                        r0 = r0;	 Catch:{ all -> 0x0051 }
                        r0 = r0.m4150f();	 Catch:{ all -> 0x0051 }
                        r2 = -1;
                        if (r0 == r2) goto L_0x001f;
                    L_0x0014:
                        r0 = r3.f2654b;	 Catch:{ all -> 0x0051 }
                        r0 = r0;	 Catch:{ all -> 0x0051 }
                        r0 = r0.m4150f();	 Catch:{ all -> 0x0051 }
                        r2 = 1;
                        if (r0 != r2) goto L_0x0021;
                    L_0x001f:
                        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
                    L_0x0020:
                        return;
                    L_0x0021:
                        r0 = r3.f2654b;	 Catch:{ all -> 0x0051 }
                        r0 = r0.f2662b;	 Catch:{ all -> 0x0051 }
                        r2 = 0;
                        r0.f2697h = r2;	 Catch:{ all -> 0x0051 }
                        r0 = r3.f2654b;	 Catch:{ all -> 0x0051 }
                        r0 = r0.f2662b;	 Catch:{ all -> 0x0051 }
                        r0 = r0.f2694e;	 Catch:{ all -> 0x0051 }
                        r2 = r0;	 Catch:{ all -> 0x0051 }
                        r0.mo523a(r2);	 Catch:{ all -> 0x0051 }
                        r0 = r3.f2654b;	 Catch:{ all -> 0x0051 }
                        r0 = r0;	 Catch:{ all -> 0x0051 }
                        r2 = r0;	 Catch:{ all -> 0x0051 }
                        r0.m4148a(r2);	 Catch:{ all -> 0x0051 }
                        r0 = r3.f2654b;	 Catch:{ all -> 0x0051 }
                        r0 = r0.f2662b;	 Catch:{ all -> 0x0051 }
                        r2 = r3.f2654b;	 Catch:{ all -> 0x0051 }
                        r2 = r0;	 Catch:{ all -> 0x0051 }
                        r0.f2696g = r2;	 Catch:{ all -> 0x0051 }
                        r0 = "Successfully loaded JS Engine.";
                        com.google.android.gms.ads.internal.util.client.C0691b.m3101d(r0);	 Catch:{ all -> 0x0051 }
                        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
                        goto L_0x0020;
                    L_0x0051:
                        r0 = move-exception;
                        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
                        throw r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.cv.1.2.a(com.google.android.gms.c.hg, java.util.Map):void");
                    }
                });
                final gx gxVar = new gx();
                cg c08753 = new cg(this) {
                    final /* synthetic */ C08781 f2657c;

                    public void mo524a(hg hgVar, Map<String, String> map) {
                        synchronized (this.f2657c.f2662b.f2690a) {
                            C0691b.m3099c("JS Engine is requesting an update");
                            if (this.f2657c.f2662b.f2697h == 0) {
                                C0691b.m3099c("Starting reload.");
                                this.f2657c.f2662b.f2697h = 2;
                                this.f2657c.f2662b.m4174a();
                            }
                            a.mo586b("/requestReload", (cg) gxVar.m4969a());
                        }
                    }
                };
                gxVar.m4970a(c08753);
                a.mo581a("/requestReload", c08753);
                if (this.f2662b.f2692c.endsWith(".js")) {
                    a.mo580a(this.f2662b.f2692c);
                } else if (this.f2662b.f2692c.startsWith("<html>")) {
                    a.mo587c(this.f2662b.f2692c);
                } else {
                    a.mo585b(this.f2662b.f2692c);
                }
                new Timer().schedule(new TimerTask(this) {
                    final /* synthetic */ C08781 f2660b;

                    class C08761 implements Runnable {
                        final /* synthetic */ C08774 f2658a;

                        C08761(C08774 c08774) {
                            this.f2658a = c08774;
                        }

                        public void run() {
                            a.mo577a();
                        }
                    }

                    /* JADX WARNING: inconsistent code. */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                        r3 = this;
                        r0 = r3.f2660b;
                        r0 = r0.f2662b;
                        r1 = r0.f2690a;
                        monitor-enter(r1);
                        r0 = r3.f2660b;	 Catch:{ all -> 0x0037 }
                        r0 = r0;	 Catch:{ all -> 0x0037 }
                        r0 = r0.m4150f();	 Catch:{ all -> 0x0037 }
                        r2 = -1;
                        if (r0 == r2) goto L_0x001f;
                    L_0x0014:
                        r0 = r3.f2660b;	 Catch:{ all -> 0x0037 }
                        r0 = r0;	 Catch:{ all -> 0x0037 }
                        r0 = r0.m4150f();	 Catch:{ all -> 0x0037 }
                        r2 = 1;
                        if (r0 != r2) goto L_0x0021;
                    L_0x001f:
                        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
                    L_0x0020:
                        return;
                    L_0x0021:
                        r0 = r3.f2660b;	 Catch:{ all -> 0x0037 }
                        r0 = r0;	 Catch:{ all -> 0x0037 }
                        r0.m4149e();	 Catch:{ all -> 0x0037 }
                        r0 = new com.google.android.gms.c.cv$1$4$1;	 Catch:{ all -> 0x0037 }
                        r0.<init>(r3);	 Catch:{ all -> 0x0037 }
                        com.google.android.gms.p028c.go.m4830a(r0);	 Catch:{ all -> 0x0037 }
                        r0 = "Could not receive loaded message in a timely manner. Rejecting.";
                        com.google.android.gms.ads.internal.util.client.C0691b.m3101d(r0);	 Catch:{ all -> 0x0037 }
                        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
                        goto L_0x0020;
                    L_0x0037:
                        r0 = move-exception;
                        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
                        throw r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.c.cv.1.4.run():void");
                    }
                }, (long) C0881a.f2667a);
            }
        });
        return c0891e;
    }

    protected ac m4173a(Context context, VersionInfoParcel versionInfoParcel) {
        return new ae(context, versionInfoParcel, null);
    }

    protected C0891e m4174a() {
        final C0891e c = m4167c();
        c.m4147a(new C0669c<ac>(this) {
            final /* synthetic */ cv f2664b;

            public void m4138a(ac acVar) {
                synchronized (this.f2664b.f2690a) {
                    this.f2664b.f2697h = 0;
                    if (!(this.f2664b.f2696g == null || c == this.f2664b.f2696g)) {
                        C0691b.m3101d("New JS engine is loaded, marking previous one as destroyable.");
                        this.f2664b.f2696g.m4161c();
                    }
                    this.f2664b.f2696g = c;
                }
            }

            public /* synthetic */ void mo521a(Object obj) {
                m4138a((ac) obj);
            }
        }, new C0671a(this) {
            final /* synthetic */ cv f2666b;

            public void mo522a() {
                synchronized (this.f2666b.f2690a) {
                    this.f2666b.f2697h = 1;
                    C0691b.m3101d("Failed loading new engine. Marking new engine destroyable.");
                    c.m4161c();
                }
            }
        });
        return c;
    }

    public C0886d m4175b() {
        C0886d a;
        synchronized (this.f2690a) {
            if (this.f2696g == null || this.f2696g.m4150f() == -1) {
                this.f2697h = 2;
                this.f2696g = m4174a();
                a = this.f2696g.m4159a();
            } else if (this.f2697h == 0) {
                a = this.f2696g.m4159a();
            } else if (this.f2697h == 1) {
                this.f2697h = 2;
                m4174a();
                a = this.f2696g.m4159a();
            } else if (this.f2697h == 2) {
                a = this.f2696g.m4159a();
            } else {
                a = this.f2696g.m4159a();
            }
        }
        return a;
    }
}
