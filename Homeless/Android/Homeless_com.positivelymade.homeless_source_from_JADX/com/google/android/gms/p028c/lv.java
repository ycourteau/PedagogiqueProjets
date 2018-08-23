package com.google.android.gms.p028c;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public class lv implements lu {
    private final C1135a f3999a;
    private final SSLSocketFactory f4000b;

    public interface C1135a {
        String m5815a(String str);
    }

    public lv() {
        this(null);
    }

    public lv(C1135a c1135a) {
        this(c1135a, null);
    }

    public lv(C1135a c1135a, SSLSocketFactory sSLSocketFactory) {
        this.f3999a = c1135a;
        this.f4000b = sSLSocketFactory;
    }

    private HttpURLConnection m5816a(URL url, hz<?> hzVar) {
        HttpURLConnection a = m5820a(url);
        int r = hzVar.m4044r();
        a.setConnectTimeout(r);
        a.setReadTimeout(r);
        a.setUseCaches(false);
        a.setDoInput(true);
        if ("https".equals(url.getProtocol()) && this.f4000b != null) {
            ((HttpsURLConnection) a).setSSLSocketFactory(this.f4000b);
        }
        return a;
    }

    private static HttpEntity m5817a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        HttpEntity basicHttpEntity = new BasicHttpEntity();
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (IOException e) {
            inputStream = httpURLConnection.getErrorStream();
        }
        basicHttpEntity.setContent(inputStream);
        basicHttpEntity.setContentLength((long) httpURLConnection.getContentLength());
        basicHttpEntity.setContentEncoding(httpURLConnection.getContentEncoding());
        basicHttpEntity.setContentType(httpURLConnection.getContentType());
        return basicHttpEntity;
    }

    static void m5818a(HttpURLConnection httpURLConnection, hz<?> hzVar) {
        switch (hzVar.m4025b()) {
            case -1:
                byte[] k = hzVar.m4037k();
                if (k != null) {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.addRequestProperty("Content-Type", hzVar.m4036j());
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(k);
                    dataOutputStream.close();
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                lv.m5819b(httpURLConnection, hzVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                lv.m5819b(httpURLConnection, hzVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                lv.m5819b(httpURLConnection, hzVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    private static void m5819b(HttpURLConnection httpURLConnection, hz<?> hzVar) {
        byte[] o = hzVar.m4041o();
        if (o != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", hzVar.m4040n());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(o);
            dataOutputStream.close();
        }
    }

    protected HttpURLConnection m5820a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    public HttpResponse mo844a(hz<?> hzVar, Map<String, String> map) {
        String a;
        String d = hzVar.m4030d();
        HashMap hashMap = new HashMap();
        hashMap.putAll(hzVar.mo757a());
        hashMap.putAll(map);
        if (this.f3999a != null) {
            a = this.f3999a.m5815a(d);
            if (a == null) {
                throw new IOException("URL blocked by rewriter: " + d);
            }
        }
        a = d;
        HttpURLConnection a2 = m5816a(new URL(a), (hz) hzVar);
        for (String a3 : hashMap.keySet()) {
            a2.addRequestProperty(a3, (String) hashMap.get(a3));
        }
        lv.m5818a(a2, (hz) hzVar);
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        if (a2.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        HttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(protocolVersion, a2.getResponseCode(), a2.getResponseMessage()));
        basicHttpResponse.setEntity(lv.m5817a(a2));
        for (Entry entry : a2.getHeaderFields().entrySet()) {
            if (entry.getKey() != null) {
                basicHttpResponse.addHeader(new BasicHeader((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return basicHttpResponse;
    }
}
