package com.google.android.gms.p028c;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0555e;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.util.client.C0691b;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@fn
public final class cn implements cg {
    private final ci f2622a;
    private final C0555e f2623b;
    private final dx f2624c;

    public static class C0864a extends gk {
        private final String f2617a = "play.google.com";
        private final String f2618b = "market";
        private final int f2619c = 10;
        private final String f2620d;
        private final hg f2621e;

        public C0864a(hg hgVar, String str) {
            this.f2621e = hgVar;
            this.f2620d = str;
        }

        public Intent m4097a(String str) {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setData(parse);
            return intent;
        }

        public void mo486a() {
            String str;
            Throwable th;
            CharSequence charSequence;
            Throwable th2;
            int i = 0;
            String str2 = this.f2620d;
            while (i < 10) {
                int i2 = i + 1;
                HttpURLConnection httpURLConnection;
                try {
                    URL url = new URL(str2);
                    if (!"play.google.com".equalsIgnoreCase(url.getHost())) {
                        if (!"market".equalsIgnoreCase(url.getProtocol())) {
                            CharSequence charSequence2;
                            CharSequence charSequence3;
                            httpURLConnection = (HttpURLConnection) url.openConnection();
                            C0618p.m2796e().m4859a(this.f2621e.getContext(), this.f2621e.mo791l().f1976b, false, httpURLConnection);
                            int responseCode = httpURLConnection.getResponseCode();
                            Map headerFields = httpURLConnection.getHeaderFields();
                            String str3 = "";
                            if (responseCode >= 300 && responseCode <= 399) {
                                List list = null;
                                if (headerFields.containsKey("Location")) {
                                    list = (List) headerFields.get("Location");
                                } else if (headerFields.containsKey("location")) {
                                    list = (List) headerFields.get("location");
                                }
                                if (list != null && list.size() > 0) {
                                    charSequence2 = (String) list.get(0);
                                    if (TextUtils.isEmpty(charSequence2)) {
                                        C0691b.m3103e("Arrived at landing page, this ideally should not happen. Will open it in browser.");
                                        httpURLConnection.disconnect();
                                        str = str2;
                                        break;
                                    }
                                    try {
                                        httpURLConnection.disconnect();
                                        i = i2;
                                        charSequence3 = charSequence2;
                                    } catch (Throwable e) {
                                        th = e;
                                        charSequence = charSequence2;
                                        th2 = th;
                                    } catch (Throwable e2) {
                                        th = e2;
                                        charSequence = charSequence2;
                                        th2 = th;
                                    } catch (Throwable e22) {
                                        th = e22;
                                        charSequence = charSequence2;
                                        th2 = th;
                                    }
                                }
                            }
                            Object obj = str3;
                            if (TextUtils.isEmpty(charSequence2)) {
                                C0691b.m3103e("Arrived at landing page, this ideally should not happen. Will open it in browser.");
                                httpURLConnection.disconnect();
                                str = str2;
                                break;
                            }
                            httpURLConnection.disconnect();
                            i = i2;
                            charSequence3 = charSequence2;
                        } else {
                            str = str2;
                            break;
                        }
                    }
                    str = str2;
                    break;
                } catch (Throwable e222) {
                    th2 = e222;
                    str = str2;
                } catch (Throwable e2222) {
                    th2 = e2222;
                    str = str2;
                } catch (Throwable e22222) {
                    th2 = e22222;
                    str = str2;
                } catch (Throwable th3) {
                    httpURLConnection.disconnect();
                }
            }
            str = str2;
            this.f2621e.getContext().startActivity(m4097a(str));
            C0691b.m3102d("Error while pinging URL: " + str, th2);
            this.f2621e.getContext().startActivity(m4097a(str));
            C0691b.m3102d("Error while parsing ping URL: " + str, th2);
            this.f2621e.getContext().startActivity(m4097a(str));
            C0691b.m3102d("Error while pinging URL: " + str, th2);
            this.f2621e.getContext().startActivity(m4097a(str));
        }

        public void mo487b() {
        }
    }

    public static class C0865b {
        public Intent m4100a(Context context, Map<String, String> map) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            String str = (String) map.get("u");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Uri parse = Uri.parse(str);
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            Uri build = "http".equalsIgnoreCase(parse.getScheme()) ? parse.buildUpon().scheme("https").build() : "https".equalsIgnoreCase(parse.getScheme()) ? parse.buildUpon().scheme("http").build() : null;
            ArrayList arrayList = new ArrayList();
            Intent a = m4102a(parse);
            Intent a2 = m4102a(build);
            ResolveInfo a3 = m4104a(context, a, arrayList);
            if (a3 != null) {
                return m4101a(a, a3);
            }
            if (a2 != null) {
                ResolveInfo a4 = m4103a(context, a2);
                if (a4 != null) {
                    Intent a5 = m4101a(a, a4);
                    if (m4103a(context, a5) != null) {
                        return a5;
                    }
                }
            }
            if (arrayList.size() == 0) {
                return a;
            }
            if (parseBoolean2 && activityManager != null) {
                List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ResolveInfo resolveInfo = (ResolveInfo) it.next();
                        for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                            if (runningAppProcessInfo.processName.equals(resolveInfo.activityInfo.packageName)) {
                                return m4101a(a, resolveInfo);
                            }
                        }
                    }
                }
            }
            return parseBoolean ? m4101a(a, (ResolveInfo) arrayList.get(0)) : a;
        }

        public Intent m4101a(Intent intent, ResolveInfo resolveInfo) {
            Intent intent2 = new Intent(intent);
            intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            return intent2;
        }

        public Intent m4102a(Uri uri) {
            if (uri == null) {
                return null;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setData(uri);
            intent.setAction("android.intent.action.VIEW");
            return intent;
        }

        public ResolveInfo m4103a(Context context, Intent intent) {
            return m4104a(context, intent, new ArrayList());
        }

        public ResolveInfo m4104a(Context context, Intent intent, ArrayList<ResolveInfo> arrayList) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            ResolveInfo resolveInfo;
            Collection queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (!(queryIntentActivities == null || resolveActivity == null)) {
                for (int i = 0; i < queryIntentActivities.size(); i++) {
                    resolveInfo = (ResolveInfo) queryIntentActivities.get(i);
                    if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo.activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                }
            }
            resolveInfo = null;
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        }
    }

    public cn(ci ciVar, C0555e c0555e, dx dxVar) {
        this.f2622a = ciVar;
        this.f2623b = c0555e;
        this.f2624c = dxVar;
    }

    private static void m4105a(Context context, Map<String, String> map) {
        if (TextUtils.isEmpty((String) map.get("u"))) {
            C0691b.m3103e("Destination url cannot be empty.");
            return;
        }
        try {
            context.startActivity(new C0865b().m4100a(context, (Map) map));
        } catch (ActivityNotFoundException e) {
            C0691b.m3103e(e.getMessage());
        }
    }

    private void m4106a(boolean z) {
        if (this.f2624c != null) {
            this.f2624c.m4439a(z);
        }
    }

    private static boolean m4107a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    private static int m4108b(Map<String, String> map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return C0618p.m2798g().mo739b();
            }
            if ("l".equalsIgnoreCase(str)) {
                return C0618p.m2798g().mo737a();
            }
            if ("c".equalsIgnoreCase(str)) {
                return C0618p.m2798g().mo754c();
            }
        }
        return -1;
    }

    private static void m4109b(hg hgVar, Map<String, String> map) {
        String str = (String) map.get("u");
        if (TextUtils.isEmpty(str)) {
            C0691b.m3103e("Destination url cannot be empty.");
        } else {
            new C0864a(hgVar, str).m2829g();
        }
    }

    public void mo524a(hg hgVar, Map<String, String> map) {
        String str = (String) map.get("a");
        if (str == null) {
            C0691b.m3103e("Action missing from an open GMSG.");
        } else if (this.f2623b == null || this.f2623b.m2476b()) {
            hh i = hgVar.mo788i();
            if ("expand".equalsIgnoreCase(str)) {
                if (hgVar.mo795m()) {
                    C0691b.m3103e("Cannot expand WebView that is already expanded.");
                    return;
                }
                m4106a(false);
                i.m5046a(cn.m4107a((Map) map), cn.m4108b(map));
            } else if ("webapp".equalsIgnoreCase(str)) {
                str = (String) map.get("u");
                m4106a(false);
                if (str != null) {
                    i.m5047a(cn.m4107a((Map) map), cn.m4108b(map), str);
                } else {
                    i.m5048a(cn.m4107a((Map) map), cn.m4108b(map), (String) map.get("html"), (String) map.get("baseurl"));
                }
            } else if ("in_app_purchase".equalsIgnoreCase(str)) {
                str = (String) map.get("product_id");
                String str2 = (String) map.get("report_urls");
                if (this.f2622a == null) {
                    return;
                }
                if (str2 == null || str2.isEmpty()) {
                    this.f2622a.mo363a(str, new ArrayList());
                    return;
                }
                this.f2622a.mo363a(str, new ArrayList(Arrays.asList(str2.split(" "))));
            } else if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("play_store"))) {
                cn.m4109b(hgVar, map);
            } else if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
                cn.m4105a(hgVar.getContext(), (Map) map);
            } else {
                String str3;
                m4106a(true);
                C1141o k = hgVar.mo790k();
                str = (String) map.get("u");
                if (TextUtils.isEmpty(str)) {
                    str3 = str;
                } else {
                    if (k != null && k.m5857b(Uri.parse(str))) {
                        str = C0618p.m2796e().m4869b(hgVar.getContext(), str, hgVar.mo800r());
                    }
                    str3 = C0618p.m2796e().m4843a(hgVar, str);
                }
                i.m5040a(new AdLauncherIntentInfoParcel((String) map.get("i"), str3, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
            }
        } else {
            this.f2623b.m2475a((String) map.get("u"));
        }
    }
}
