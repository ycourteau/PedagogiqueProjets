package com.google.android.gms.p028c;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@fn
public class ch implements cg {
    private final Context f2610a;
    private final VersionInfoParcel f2611b;

    @fn
    static class C0860a {
        private final String f2596a;
        private final String f2597b;

        public C0860a(String str, String str2) {
            this.f2596a = str;
            this.f2597b = str2;
        }

        public String m4073a() {
            return this.f2596a;
        }

        public String m4074b() {
            return this.f2597b;
        }
    }

    @fn
    static class C0861b {
        private final String f2598a;
        private final URL f2599b;
        private final ArrayList<C0860a> f2600c;
        private final String f2601d;

        public C0861b(String str, URL url, ArrayList<C0860a> arrayList, String str2) {
            this.f2598a = str;
            this.f2599b = url;
            if (arrayList == null) {
                this.f2600c = new ArrayList();
            } else {
                this.f2600c = arrayList;
            }
            this.f2601d = str2;
        }

        public String m4075a() {
            return this.f2598a;
        }

        public URL m4076b() {
            return this.f2599b;
        }

        public ArrayList<C0860a> m4077c() {
            return this.f2600c;
        }

        public String m4078d() {
            return this.f2601d;
        }
    }

    @fn
    class C0862c {
        final /* synthetic */ ch f2602a;
        private final C0863d f2603b;
        private final boolean f2604c;
        private final String f2605d;

        public C0862c(ch chVar, boolean z, C0863d c0863d, String str) {
            this.f2602a = chVar;
            this.f2604c = z;
            this.f2603b = c0863d;
            this.f2605d = str;
        }

        public String m4079a() {
            return this.f2605d;
        }

        public C0863d m4080b() {
            return this.f2603b;
        }

        public boolean m4081c() {
            return this.f2604c;
        }
    }

    @fn
    static class C0863d {
        private final String f2606a;
        private final int f2607b;
        private final List<C0860a> f2608c;
        private final String f2609d;

        public C0863d(String str, int i, List<C0860a> list, String str2) {
            this.f2606a = str;
            this.f2607b = i;
            if (list == null) {
                this.f2608c = new ArrayList();
            } else {
                this.f2608c = list;
            }
            this.f2609d = str2;
        }

        public String m4082a() {
            return this.f2606a;
        }

        public int m4083b() {
            return this.f2607b;
        }

        public Iterable<C0860a> m4084c() {
            return this.f2608c;
        }

        public String m4085d() {
            return this.f2609d;
        }
    }

    public ch(Context context, VersionInfoParcel versionInfoParcel) {
        this.f2610a = context;
        this.f2611b = versionInfoParcel;
    }

    protected C0861b m4086a(JSONObject jSONObject) {
        URL url;
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (Throwable e) {
            C0691b.m3098b("Error constructing http request.", e);
            url = null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new C0860a(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new C0861b(optString, url, arrayList, optString3);
    }

    protected C0862c m4087a(C0861b c0861b) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) c0861b.m4076b().openConnection();
            C0618p.m2796e().m4859a(this.f2610a, this.f2611b.f1976b, false, httpURLConnection);
            Iterator it = c0861b.m4077c().iterator();
            while (it.hasNext()) {
                C0860a c0860a = (C0860a) it.next();
                httpURLConnection.addRequestProperty(c0860a.m4073a(), c0860a.m4074b());
            }
            if (!TextUtils.isEmpty(c0861b.m4078d())) {
                httpURLConnection.setDoOutput(true);
                byte[] bytes = c0861b.m4078d().getBytes();
                httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                bufferedOutputStream.write(bytes);
                bufferedOutputStream.close();
            }
            List arrayList = new ArrayList();
            if (httpURLConnection.getHeaderFields() != null) {
                for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
                    for (String c0860a2 : (List) entry.getValue()) {
                        arrayList.add(new C0860a((String) entry.getKey(), c0860a2));
                    }
                }
            }
            return new C0862c(this, true, new C0863d(c0861b.m4075a(), httpURLConnection.getResponseCode(), arrayList, C0618p.m2796e().m4844a(new InputStreamReader(httpURLConnection.getInputStream()))), null);
        } catch (Exception e) {
            return new C0862c(this, false, null, e.toString());
        }
    }

    protected JSONObject m4088a(C0863d c0863d) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", c0863d.m4082a());
            if (c0863d.m4085d() != null) {
                jSONObject.put("body", c0863d.m4085d());
            }
            JSONArray jSONArray = new JSONArray();
            for (C0860a c0860a : c0863d.m4084c()) {
                jSONArray.put(new JSONObject().put("key", c0860a.m4073a()).put("value", c0860a.m4074b()));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", c0863d.m4083b());
        } catch (Throwable e) {
            C0691b.m3098b("Error constructing JSON for http response.", e);
        }
        return jSONObject;
    }

    public JSONObject m4089a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            Object obj = "";
            try {
                obj = jSONObject.optString("http_request_id");
                C0862c a = m4087a(m4086a(jSONObject));
                if (a.m4081c()) {
                    jSONObject2.put("response", m4088a(a.m4080b()));
                    jSONObject2.put("success", true);
                    return jSONObject2;
                }
                jSONObject2.put("response", new JSONObject().put("http_request_id", obj));
                jSONObject2.put("success", false);
                jSONObject2.put("reason", a.m4079a());
                return jSONObject2;
            } catch (Exception e) {
                try {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", obj));
                    jSONObject2.put("success", false);
                    jSONObject2.put("reason", e.toString());
                    return jSONObject2;
                } catch (JSONException e2) {
                    return jSONObject2;
                }
            }
        } catch (JSONException e3) {
            C0691b.m3097b("The request is not a valid JSON.");
            try {
                return new JSONObject().put("success", false);
            } catch (JSONException e4) {
                return new JSONObject();
            }
        }
    }

    public void mo524a(final hg hgVar, final Map<String, String> map) {
        gn.m4822a(new Runnable(this) {
            final /* synthetic */ ch f2595c;

            public void run() {
                C0691b.m3093a("Received Http request.");
                final JSONObject a = this.f2595c.m4089a((String) map.get("http_request"));
                if (a == null) {
                    C0691b.m3097b("Response should not be null.");
                } else {
                    go.f3361a.post(new Runnable(this) {
                        final /* synthetic */ C08591 f2592b;

                        public void run() {
                            hgVar.mo769a("fetchHttpRequestCompleted", a);
                            C0691b.m3093a("Dispatched http response.");
                        }
                    });
                }
            }
        });
    }
}
