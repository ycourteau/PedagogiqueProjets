package com.google.android.gms.p028c;

import java.net.URI;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class ls implements lu {
    protected final HttpClient f3998a;

    public static final class C1134a extends HttpEntityEnclosingRequestBase {
        public C1134a(String str) {
            setURI(URI.create(str));
        }

        public String getMethod() {
            return "PATCH";
        }
    }

    public ls(HttpClient httpClient) {
        this.f3998a = httpClient;
    }

    private static void m5806a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, hz<?> hzVar) {
        byte[] o = hzVar.m4041o();
        if (o != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(o));
        }
    }

    private static void m5807a(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, (String) map.get(str));
        }
    }

    static HttpUriRequest m5808b(hz<?> hzVar, Map<String, String> map) {
        HttpEntityEnclosingRequestBase httpPost;
        switch (hzVar.m4025b()) {
            case -1:
                byte[] k = hzVar.m4037k();
                if (k == null) {
                    return new HttpGet(hzVar.m4030d());
                }
                HttpUriRequest httpPost2 = new HttpPost(hzVar.m4030d());
                httpPost2.addHeader("Content-Type", hzVar.m4036j());
                httpPost2.setEntity(new ByteArrayEntity(k));
                return httpPost2;
            case 0:
                return new HttpGet(hzVar.m4030d());
            case 1:
                httpPost = new HttpPost(hzVar.m4030d());
                httpPost.addHeader("Content-Type", hzVar.m4040n());
                ls.m5806a(httpPost, (hz) hzVar);
                return httpPost;
            case 2:
                httpPost = new HttpPut(hzVar.m4030d());
                httpPost.addHeader("Content-Type", hzVar.m4040n());
                ls.m5806a(httpPost, (hz) hzVar);
                return httpPost;
            case 3:
                return new HttpDelete(hzVar.m4030d());
            case 4:
                return new HttpHead(hzVar.m4030d());
            case 5:
                return new HttpOptions(hzVar.m4030d());
            case 6:
                return new HttpTrace(hzVar.m4030d());
            case 7:
                httpPost = new C1134a(hzVar.m4030d());
                httpPost.addHeader("Content-Type", hzVar.m4040n());
                ls.m5806a(httpPost, (hz) hzVar);
                return httpPost;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    public HttpResponse mo844a(hz<?> hzVar, Map<String, String> map) {
        HttpUriRequest b = ls.m5808b(hzVar, map);
        ls.m5807a(b, (Map) map);
        ls.m5807a(b, hzVar.mo757a());
        m5810a(b);
        HttpParams params = b.getParams();
        int r = hzVar.m4044r();
        HttpConnectionParams.setConnectionTimeout(params, 5000);
        HttpConnectionParams.setSoTimeout(params, r);
        return this.f3998a.execute(b);
    }

    protected void m5810a(HttpUriRequest httpUriRequest) {
    }
}
