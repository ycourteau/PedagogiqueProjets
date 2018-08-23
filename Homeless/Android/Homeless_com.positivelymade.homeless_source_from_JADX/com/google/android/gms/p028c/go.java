package com.google.android.gms.p028c;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C0470b;
import com.google.android.gms.ads.C0486e;
import com.google.android.gms.ads.internal.C0581m;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.C0526n;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.p022a.C0459d;
import com.google.android.gms.ads.p022a.C0460e;
import com.google.android.gms.ads.p027f.C0488b;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@fn
public class go {
    public static final Handler f3361a = new gl(Looper.getMainLooper());
    private static final String f3362b = AdView.class.getName();
    private static final String f3363c = C0486e.class.getName();
    private static final String f3364d = C0459d.class.getName();
    private static final String f3365e = C0460e.class.getName();
    private static final String f3366f = C0488b.class.getName();
    private static final String f3367g = C0470b.class.getName();
    private final Object f3368h = new Object();
    private boolean f3369i = true;
    private String f3370j;
    private boolean f3371k = false;

    private final class C0987a extends BroadcastReceiver {
        final /* synthetic */ go f3360a;

        private C0987a(go goVar) {
            this.f3360a = goVar;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                this.f3360a.f3369i = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                this.f3360a.f3369i = false;
            }
        }
    }

    private JSONArray m4828a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            m4831a(jSONArray, a);
        }
        return jSONArray;
    }

    private JSONObject m4829a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m4832a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public static void m4830a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f3361a.post(runnable);
        }
    }

    private void m4831a(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(m4829a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(m4851a((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m4828a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(m4850a((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    private void m4832a(JSONObject jSONObject, String str, Object obj) {
        if (obj instanceof Bundle) {
            jSONObject.put(str, m4829a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, m4851a((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m4828a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m4828a(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    public static void m4834b(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            gn.m4822a(runnable);
        }
    }

    private boolean m4835h(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null ? false : powerManager.isScreenOn();
    }

    public Bitmap m4836a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    public DisplayMetrics m4837a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public PopupWindow m4838a(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, z);
    }

    public String m4839a(Context context, View view, AdSizeParcel adSizeParcel) {
        String str = null;
        if (((Boolean) az.f2471W.m3878c()).booleanValue()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", adSizeParcel.f1352f);
                jSONObject2.put("height", adSizeParcel.f1349c);
                jSONObject.put("size", jSONObject2);
                jSONObject.put("activity", m4886f(context));
                if (!adSizeParcel.f1351e) {
                    JSONArray jSONArray = new JSONArray();
                    while (view != null) {
                        ViewParent parent = view.getParent();
                        if (parent != null) {
                            int i = -1;
                            if (parent instanceof ViewGroup) {
                                i = ((ViewGroup) parent).indexOfChild(view);
                            }
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("type", parent.getClass().getName());
                            jSONObject3.put("index_of_child", i);
                            jSONArray.put(jSONObject3);
                        }
                        View view2 = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                        view = view2;
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("parents", jSONArray);
                    }
                }
                str = jSONObject.toString();
            } catch (Throwable e) {
                C0691b.m3102d("Fail to get view hierarchy json", e);
            }
        }
        return str;
    }

    public String m4840a(Context context, C1141o c1141o, String str) {
        if (c1141o != null) {
            try {
                Uri parse = Uri.parse(str);
                if (c1141o.m5858c(parse)) {
                    parse = c1141o.m5853a(parse, context);
                }
                str = parse.toString();
            } catch (Exception e) {
            }
        }
        return str;
    }

    public String m4841a(final Context context, String str) {
        String str2;
        synchronized (this.f3368h) {
            if (this.f3370j != null) {
                str2 = this.f3370j;
            } else {
                try {
                    this.f3370j = C0618p.m2798g().mo752a(context);
                } catch (Exception e) {
                }
                if (TextUtils.isEmpty(this.f3370j)) {
                    if (C0526n.m2400a().m3088b()) {
                        try {
                            this.f3370j = m4876c(context);
                        } catch (Exception e2) {
                            this.f3370j = m4868b();
                        }
                    } else {
                        this.f3370j = null;
                        f3361a.post(new Runnable(this) {
                            final /* synthetic */ go f3359b;

                            public void run() {
                                synchronized (this.f3359b.f3368h) {
                                    this.f3359b.f3370j = this.f3359b.m4876c(context);
                                    this.f3359b.f3368h.notifyAll();
                                }
                            }
                        });
                        while (this.f3370j == null) {
                            try {
                                this.f3368h.wait();
                            } catch (InterruptedException e3) {
                                this.f3370j = m4868b();
                                C0691b.m3103e("Interrupted, use default user agent: " + this.f3370j);
                            }
                        }
                    }
                }
                this.f3370j += " (Mobile; " + str + ")";
                str2 = this.f3370j;
            }
        }
        return str2;
    }

    public String m4842a(Context context, String str, String str2, int i) {
        if (!((Boolean) az.f2470V.m3878c()).booleanValue() || !C0581m.m2611a(context).m2615a() || TextUtils.isEmpty(str) || !m4873b(Uri.parse(str))) {
            return str;
        }
        Map hashMap = new HashMap();
        hashMap.put("ga_cid", str2);
        hashMap.put("ga_hid", String.valueOf(i));
        return m4846a(str, hashMap);
    }

    public String m4843a(hg hgVar, String str) {
        return m4840a(hgVar.getContext(), hgVar.mo790k(), str);
    }

    public String m4844a(InputStreamReader inputStreamReader) {
        StringBuilder stringBuilder = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return stringBuilder.toString();
            }
            stringBuilder.append(cArr, 0, read);
        }
    }

    public String m4845a(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    String m4846a(String str, Map<String, String> map) {
        int indexOf = str.indexOf("&adurl");
        int indexOf2 = indexOf == -1 ? str.indexOf("?adurl") : indexOf;
        Uri parse = Uri.parse(str);
        if (!m4877c(parse) || indexOf2 == -1) {
            Builder buildUpon = parse.buildUpon();
            Builder builder = buildUpon;
            for (String str2 : map.keySet()) {
                builder = builder.appendQueryParameter(str2, (String) map.get(str2));
            }
            return builder.build().toString();
        }
        StringBuilder stringBuilder = new StringBuilder(str.substring(0, indexOf2 + 1));
        for (String str22 : map.keySet()) {
            stringBuilder.append(str22).append("=").append((String) map.get(str22)).append("&");
        }
        return stringBuilder.append(str.substring(indexOf2 + 1)).toString();
    }

    public String m4847a(StackTraceElement[] stackTraceElementArr, String str) {
        if (((Boolean) az.ah.m3878c()).booleanValue()) {
            String className;
            for (int i = 0; i + 1 < stackTraceElementArr.length; i++) {
                StackTraceElement stackTraceElement = stackTraceElementArr[i];
                String className2 = stackTraceElement.getClassName();
                if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f3362b.equalsIgnoreCase(className2) || f3363c.equalsIgnoreCase(className2) || f3364d.equalsIgnoreCase(className2) || f3365e.equalsIgnoreCase(className2) || f3366f.equalsIgnoreCase(className2) || f3367g.equalsIgnoreCase(className2))) {
                    className = stackTraceElementArr[i + 1].getClassName();
                    break;
                }
            }
            className = null;
            if (!(className == null || className.contains(str))) {
                return className;
            }
        }
        return null;
    }

    public ArrayList<String> m4848a(Context context, List<String> list, String str) {
        int c = C0581m.m2611a(context).m2618c();
        ArrayList<String> arrayList = new ArrayList();
        for (String a : list) {
            arrayList.add(m4842a(context, a, str, c));
        }
        return arrayList;
    }

    public Map<String, String> m4849a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : C0618p.m2798g().mo742a(uri)) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    JSONArray m4850a(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object a : objArr) {
            m4831a(jSONArray, a);
        }
        return jSONArray;
    }

    public JSONObject m4851a(Map<String, ?> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m4832a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            throw new JSONException("Could not convert map to JSON: " + e.getMessage());
        }
    }

    public void m4852a(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public void m4853a(Activity activity, OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
        }
    }

    public void m4854a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(m4841a(context, str));
    }

    public void m4855a(Context context, String str, String str2) {
        List arrayList = new ArrayList();
        arrayList.add(str2);
        m4857a(context, str, arrayList);
    }

    public void m4856a(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString("os", VERSION.RELEASE);
            bundle.putString("api", String.valueOf(VERSION.SDK_INT));
            bundle.putString("device", C0618p.m2796e().m4881d());
            bundle.putString("js", str);
            bundle.putString("appid", applicationContext.getPackageName());
            bundle.putString("eids", TextUtils.join(",", az.m3894a()));
        }
        Builder appendQueryParameter = new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        C0618p.m2796e().m4855a(context, str, appendQueryParameter.toString());
    }

    public void m4857a(Context context, String str, List<String> list) {
        for (String gvVar : list) {
            new gv(context, str, gvVar).m2829g();
        }
    }

    public void m4858a(Context context, String str, List<String> list, String str2) {
        for (String gvVar : list) {
            new gv(context, str, gvVar, str2).m2829g();
        }
    }

    public void m4859a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        m4861a(context, str, z, httpURLConnection, false);
    }

    public void m4860a(Context context, String str, boolean z, HttpURLConnection httpURLConnection, String str2) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", str2);
        httpURLConnection.setUseCaches(false);
    }

    public void m4861a(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", m4841a(context, str));
        httpURLConnection.setUseCaches(z2);
    }

    public boolean m4862a() {
        return this.f3369i;
    }

    public boolean m4863a(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            C0691b.m3103e("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        boolean z;
        String str = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
        if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
            C0691b.m3103e(String.format(str, new Object[]{"keyboard"}));
            z = false;
        } else {
            z = true;
        }
        if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
            C0691b.m3103e(String.format(str, new Object[]{"keyboardHidden"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
            C0691b.m3103e(String.format(str, new Object[]{"orientation"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
            C0691b.m3103e(String.format(str, new Object[]{"screenLayout"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 512) == 0) {
            C0691b.m3103e(String.format(str, new Object[]{"uiMode"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 1024) == 0) {
            C0691b.m3103e(String.format(str, new Object[]{"screenSize"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 2048) != 0) {
            return z;
        }
        C0691b.m3103e(String.format(str, new Object[]{"smallestScreenSize"}));
        return false;
    }

    public boolean m4864a(PackageManager packageManager, String str, String str2) {
        return packageManager.checkPermission(str2, str) == 0;
    }

    public boolean m4865a(ClassLoader classLoader, Class<?> cls, String str) {
        boolean z = false;
        try {
            z = cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable th) {
        }
        return z;
    }

    public int[] m4866a(Activity activity) {
        Window window = activity.getWindow();
        if (window == null || window.findViewById(16908290) == null) {
            return m4885e();
        }
        return new int[]{window.findViewById(16908290).getWidth(), window.findViewById(16908290).getHeight()};
    }

    public int m4867b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            C0691b.m3103e("Could not parse value:" + e);
            return 0;
        }
    }

    String m4868b() {
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("Mozilla/5.0 (Linux; U; Android");
        if (VERSION.RELEASE != null) {
            stringBuffer.append(" ").append(VERSION.RELEASE);
        }
        stringBuffer.append("; ").append(Locale.getDefault());
        if (Build.DEVICE != null) {
            stringBuffer.append("; ").append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                stringBuffer.append(" Build/").append(Build.DISPLAY);
            }
        }
        stringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuffer.toString();
    }

    public String m4869b(Context context, String str, String str2) {
        return m4842a(context, str, str2, C0581m.m2611a(context).m2618c());
    }

    public void m4870b(Activity activity, OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        }
    }

    public void m4871b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) az.ae.m3878c()).booleanValue()) {
            m4856a(context, str, str2, bundle, z);
        }
    }

    public boolean m4872b(Context context) {
        if (this.f3371k) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new C0987a(), intentFilter);
        this.f3371k = true;
        return true;
    }

    public boolean m4873b(Uri uri) {
        return new C1141o(null).m5857b(uri);
    }

    public int[] m4874b(Activity activity) {
        int[] a = m4866a(activity);
        return new int[]{C0526n.m2400a().m3086b((Context) activity, a[0]), C0526n.m2400a().m3086b((Context) activity, a[1])};
    }

    public String m4875c() {
        UUID randomUUID = UUID.randomUUID();
        byte[] toByteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] toByteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, toByteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(toByteArray);
                instance.update(toByteArray2);
                Object obj = new byte[8];
                System.arraycopy(instance.digest(), 0, obj, 0, 8);
                bigInteger = new BigInteger(1, obj).toString();
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return bigInteger;
    }

    protected String m4876c(Context context) {
        return new WebView(context).getSettings().getUserAgentString();
    }

    public boolean m4877c(Uri uri) {
        return new C1141o(null).m5858c(uri);
    }

    public boolean m4878c(String str) {
        return TextUtils.isEmpty(str) ? false : str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public int[] m4879c(Activity activity) {
        Window window = activity.getWindow();
        if (window == null || window.findViewById(16908290) == null) {
            return m4885e();
        }
        return new int[]{window.findViewById(16908290).getTop(), window.findViewById(16908290).getBottom()};
    }

    public AlertDialog.Builder m4880d(Context context) {
        return new AlertDialog.Builder(context);
    }

    public String m4881d() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : str + " " + str2;
    }

    public int[] m4882d(Activity activity) {
        int[] c = m4879c(activity);
        return new int[]{C0526n.m2400a().m3086b((Context) activity, c[0]), C0526n.m2400a().m3086b((Context) activity, c[1])};
    }

    public int m4883e(Activity activity) {
        if (activity == null) {
            C0691b.m3103e("Fail to get AdActivity type since it is null");
            return 0;
        }
        AdOverlayInfoParcel a = AdOverlayInfoParcel.m2652a(activity.getIntent());
        if (a == null) {
            C0691b.m3103e("Fail to get AdOverlayInfo");
            return 0;
        }
        switch (a.f1605l) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return 0;
        }
    }

    public ar m4884e(Context context) {
        return new ar(context);
    }

    protected int[] m4885e() {
        return new int[]{0, 0};
    }

    public String m4886f(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            List runningTasks = activityManager.getRunningTasks(1);
            if (!(runningTasks == null || runningTasks.isEmpty())) {
                RunningTaskInfo runningTaskInfo = (RunningTaskInfo) runningTasks.get(0);
                if (!(runningTaskInfo == null || runningTaskInfo.topActivity == null)) {
                    return runningTaskInfo.topActivity.getClassName();
                }
            }
            return null;
        } catch (Exception e) {
        }
    }

    public boolean m4887g(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && m4835h(context)) {
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
}
