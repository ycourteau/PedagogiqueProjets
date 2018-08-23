package com.google.android.gms.p028c;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.C0691b;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@fn
public class al extends Thread {
    private boolean f2413a = false;
    private boolean f2414b = false;
    private boolean f2415c = false;
    private final Object f2416d;
    private final ak f2417e;
    private final aj f2418f;
    private final fm f2419g;
    private final int f2420h;
    private final int f2421i;
    private final int f2422j;
    private final int f2423k;
    private final int f2424l;

    @fn
    class C0818a {
        final int f2410a;
        final int f2411b;
        final /* synthetic */ al f2412c;

        C0818a(al alVar, int i, int i2) {
            this.f2412c = alVar;
            this.f2410a = i;
            this.f2411b = i2;
        }
    }

    public al(ak akVar, aj ajVar, fm fmVar) {
        this.f2417e = akVar;
        this.f2418f = ajVar;
        this.f2419g = fmVar;
        this.f2416d = new Object();
        this.f2421i = ((Integer) az.f2459K.m3878c()).intValue();
        this.f2422j = ((Integer) az.f2460L.m3878c()).intValue();
        this.f2423k = ((Integer) az.f2461M.m3878c()).intValue();
        this.f2424l = ((Integer) az.f2462N.m3878c()).intValue();
        this.f2420h = ((Integer) az.f2463O.m3878c()).intValue();
        setName("ContentFetchTask");
    }

    C0818a m3821a(View view, ai aiVar) {
        int i = 0;
        if (view == null) {
            return new C0818a(this, 0, 0);
        }
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new C0818a(this, 0, 0);
            }
            aiVar.m3806b(text.toString());
            return new C0818a(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof hg)) {
            aiVar.m3809e();
            return m3828a((WebView) view, aiVar) ? new C0818a(this, 0, 1) : new C0818a(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new C0818a(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            int i3 = 0;
            while (i < viewGroup.getChildCount()) {
                C0818a a = m3821a(viewGroup.getChildAt(i), aiVar);
                i3 += a.f2410a;
                i2 += a.f2411b;
                i++;
            }
            return new C0818a(this, i3, i2);
        }
    }

    public void m3822a() {
        synchronized (this.f2416d) {
            if (this.f2413a) {
                C0691b.m3093a("Content hash thread already started, quiting...");
                return;
            }
            this.f2413a = true;
            start();
        }
    }

    void m3823a(Activity activity) {
        if (activity != null) {
            View view = null;
            if (!(activity.getWindow() == null || activity.getWindow().getDecorView() == null)) {
                view = activity.getWindow().getDecorView().findViewById(16908290);
            }
            if (view != null) {
                m3827a(view);
            }
        }
    }

    void m3824a(ai aiVar, WebView webView, String str) {
        aiVar.m3808d();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (TextUtils.isEmpty(webView.getTitle())) {
                    aiVar.m3803a(optString);
                } else {
                    aiVar.m3803a(webView.getTitle() + "\n" + optString);
                }
            }
            if (aiVar.m3804a()) {
                this.f2418f.m3815b(aiVar);
            }
        } catch (JSONException e) {
            C0691b.m3093a("Json string may be malformed.");
        } catch (Throwable th) {
            C0691b.m3094a("Failed to get webview content.", th);
            this.f2419g.m4618a(th, true);
        }
    }

    boolean m3825a(RunningAppProcessInfo runningAppProcessInfo) {
        return runningAppProcessInfo.importance == 100;
    }

    boolean m3826a(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null ? false : powerManager.isScreenOn();
    }

    boolean m3827a(final View view) {
        if (view == null) {
            return false;
        }
        view.post(new Runnable(this) {
            final /* synthetic */ al f2404b;

            public void run() {
                this.f2404b.m3829b(view);
            }
        });
        return true;
    }

    boolean m3828a(final WebView webView, final ai aiVar) {
        if (!is.m5292h()) {
            return false;
        }
        aiVar.m3809e();
        webView.post(new Runnable(this) {
            ValueCallback<String> f2406a = new C08161(this);
            final /* synthetic */ al f2409d;

            class C08161 implements ValueCallback<String> {
                final /* synthetic */ C08172 f2405a;

                C08161(C08172 c08172) {
                    this.f2405a = c08172;
                }

                public void m3820a(String str) {
                    this.f2405a.f2409d.m3824a(aiVar, webView, str);
                }

                public /* synthetic */ void onReceiveValue(Object obj) {
                    m3820a((String) obj);
                }
            }

            public void run() {
                if (webView.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f2406a);
                    } catch (Throwable th) {
                        this.f2406a.onReceiveValue("");
                    }
                }
            }
        });
        return true;
    }

    void m3829b(View view) {
        try {
            ai aiVar = new ai(this.f2421i, this.f2422j, this.f2423k, this.f2424l);
            C0818a a = m3821a(view, aiVar);
            aiVar.m3810f();
            if (a.f2410a != 0 || a.f2411b != 0) {
                if (a.f2411b != 0 || aiVar.m3812h() != 0) {
                    if (a.f2411b != 0 || !this.f2418f.m3814a(aiVar)) {
                        this.f2418f.m3816c(aiVar);
                    }
                }
            }
        } catch (Throwable e) {
            C0691b.m3098b("Exception in fetchContentOnUIThread", e);
            this.f2419g.m4618a(e, true);
        }
    }

    boolean m3830b() {
        try {
            Context b = this.f2417e.m3819b();
            if (b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (m3825a(runningAppProcessInfo) && !keyguardManager.inKeyguardRestrictedInputMode() && m3826a(b)) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public ai m3831c() {
        return this.f2418f.m3813a();
    }

    public void m3832d() {
        synchronized (this.f2416d) {
            this.f2414b = false;
            this.f2416d.notifyAll();
            C0691b.m3093a("ContentFetchThread: wakeup");
        }
    }

    public void m3833e() {
        synchronized (this.f2416d) {
            this.f2414b = true;
            C0691b.m3093a("ContentFetchThread: paused, mPause = " + this.f2414b);
        }
    }

    public boolean m3834f() {
        return this.f2414b;
    }

    public void run() {
        while (!this.f2415c) {
            try {
                if (m3830b()) {
                    Activity a = this.f2417e.m3818a();
                    if (a == null) {
                        C0691b.m3093a("ContentFetchThread: no activity");
                    } else {
                        m3823a(a);
                    }
                } else {
                    C0691b.m3093a("ContentFetchTask: sleeping");
                    m3833e();
                }
                Thread.sleep((long) (this.f2420h * 1000));
            } catch (Throwable th) {
                C0691b.m3098b("Error in ContentFetchTask", th);
                this.f2419g.m4618a(th, true);
            }
            synchronized (this.f2416d) {
                while (this.f2414b) {
                    try {
                        C0691b.m3093a("ContentFetchTask: waiting");
                        this.f2416d.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    }
}
