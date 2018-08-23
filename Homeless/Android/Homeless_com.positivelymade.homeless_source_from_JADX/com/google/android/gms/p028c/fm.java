package com.google.android.gms.p028c;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@fn
public class fm implements UncaughtExceptionHandler {
    private UncaughtExceptionHandler f3064a;
    private UncaughtExceptionHandler f3065b;
    private Context f3066c;
    private VersionInfoParcel f3067d;

    public fm(Context context, VersionInfoParcel versionInfoParcel, UncaughtExceptionHandler uncaughtExceptionHandler, UncaughtExceptionHandler uncaughtExceptionHandler2) {
        this.f3064a = uncaughtExceptionHandler;
        this.f3065b = uncaughtExceptionHandler2;
        this.f3066c = context;
        this.f3067d = versionInfoParcel;
    }

    public static fm m4615a(Context context, Thread thread, VersionInfoParcel versionInfoParcel) {
        if (context == null || thread == null || versionInfoParcel == null) {
            return null;
        }
        if (!fm.m4616a(context)) {
            return null;
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
        UncaughtExceptionHandler fmVar = new fm(context, versionInfoParcel, uncaughtExceptionHandler, Thread.getDefaultUncaughtExceptionHandler());
        if (uncaughtExceptionHandler != null && (uncaughtExceptionHandler instanceof fm)) {
            return (fm) uncaughtExceptionHandler;
        }
        try {
            thread.setUncaughtExceptionHandler(fmVar);
            return fmVar;
        } catch (Throwable e) {
            C0691b.m3100c("Fail to set UncaughtExceptionHandler.", e);
            return null;
        }
    }

    private static boolean m4616a(Context context) {
        return ((Boolean) az.f2481g.m3878c()).booleanValue();
    }

    private Throwable m4617b(Throwable th) {
        if (((Boolean) az.f2482h.m3878c()).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3;
            Throwable th4 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th4.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
            int i = 0;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m4619a(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    i = 1;
                } else if (m4622b(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                } else {
                    arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                }
            }
            if (i != 0) {
                th3 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            } else {
                th3 = th2;
            }
            th2 = th3;
        }
        return th2;
    }

    public void m4618a(Throwable th, boolean z) {
        if (fm.m4616a(this.f3066c)) {
            Throwable b = m4617b(th);
            if (b != null) {
                List arrayList = new ArrayList();
                arrayList.add(m4621b(b, z));
                C0618p.m2796e().m4858a(this.f3066c, this.f3067d.f1976b, arrayList, C0618p.m2799h().m4791h());
            }
        }
    }

    protected boolean m4619a(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        if (str.startsWith("com.google.android.gms.ads")) {
            return true;
        }
        if (str.startsWith("com.google.ads")) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(fn.class);
        } catch (Throwable e) {
            C0691b.m3094a("Fail to check class type for class " + str, e);
            return z;
        }
    }

    protected boolean m4620a(Throwable th) {
        boolean z = true;
        if (th == null) {
            return false;
        }
        boolean z2 = false;
        boolean z3 = false;
        while (th != null) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (m4619a(stackTraceElement.getClassName())) {
                    z3 = true;
                }
                if (getClass().getName().equals(stackTraceElement.getClassName())) {
                    z2 = true;
                }
            }
            th = th.getCause();
        }
        if (!z3 || r2) {
            z = false;
        }
        return z;
    }

    String m4621b(Throwable th, boolean z) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", VERSION.RELEASE).appendQueryParameter("api", String.valueOf(VERSION.SDK_INT)).appendQueryParameter("device", C0618p.m2796e().m4881d()).appendQueryParameter("js", this.f3067d.f1976b).appendQueryParameter("appid", this.f3066c.getApplicationContext().getPackageName()).appendQueryParameter("stacktrace", stringWriter.toString()).appendQueryParameter("eids", TextUtils.join(",", az.m3894a())).appendQueryParameter("trapped", String.valueOf(z)).toString();
    }

    protected boolean m4622b(String str) {
        return TextUtils.isEmpty(str) ? false : str.startsWith("android.") || str.startsWith("java.");
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (m4620a(th)) {
            if (Looper.getMainLooper().getThread() != thread) {
                m4618a(th, true);
                return;
            }
            m4618a(th, false);
        }
        if (this.f3064a != null) {
            this.f3064a.uncaughtException(thread, th);
        } else if (this.f3065b != null) {
            this.f3065b.uncaughtException(thread, th);
        }
    }
}
