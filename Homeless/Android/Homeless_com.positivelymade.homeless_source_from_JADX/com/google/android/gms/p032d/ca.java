package com.google.android.gms.p032d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

class ca implements C1586h {
    private final String f4798a = m7281a("GoogleTagManager", "4.00", VERSION.RELEASE, ca.m7278a(Locale.getDefault()), Build.MODEL, Build.ID);
    private final HttpClient f4799b;
    private final Context f4800c;
    private C1555a f4801d;

    public interface C1555a {
        void mo1009a(C1623u c1623u);

        void mo1010b(C1623u c1623u);

        void mo1011c(C1623u c1623u);
    }

    ca(HttpClient httpClient, Context context, C1555a c1555a) {
        this.f4800c = context.getApplicationContext();
        this.f4799b = httpClient;
        this.f4801d = c1555a;
    }

    static String m7278a(Locale locale) {
        if (locale == null || locale.getLanguage() == null || locale.getLanguage().length() == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(locale.getLanguage().toLowerCase());
        if (!(locale.getCountry() == null || locale.getCountry().length() == 0)) {
            stringBuilder.append("-").append(locale.getCountry().toLowerCase());
        }
        return stringBuilder.toString();
    }

    private HttpEntityEnclosingRequest m7279a(URL url) {
        HttpEntityEnclosingRequest basicHttpEntityEnclosingRequest;
        URISyntaxException e;
        try {
            basicHttpEntityEnclosingRequest = new BasicHttpEntityEnclosingRequest("GET", url.toURI().toString());
            try {
                basicHttpEntityEnclosingRequest.addHeader("User-Agent", this.f4798a);
            } catch (URISyntaxException e2) {
                e = e2;
                aj.m7038b("Exception sending hit: " + e.getClass().getSimpleName());
                aj.m7038b(e.getMessage());
                return basicHttpEntityEnclosingRequest;
            }
        } catch (URISyntaxException e3) {
            URISyntaxException uRISyntaxException = e3;
            basicHttpEntityEnclosingRequest = null;
            e = uRISyntaxException;
            aj.m7038b("Exception sending hit: " + e.getClass().getSimpleName());
            aj.m7038b(e.getMessage());
            return basicHttpEntityEnclosingRequest;
        }
        return basicHttpEntityEnclosingRequest;
    }

    private void m7280a(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        StringBuffer stringBuffer = new StringBuffer();
        for (Object obj : httpEntityEnclosingRequest.getAllHeaders()) {
            stringBuffer.append(obj.toString()).append("\n");
        }
        stringBuffer.append(httpEntityEnclosingRequest.getRequestLine().toString()).append("\n");
        if (httpEntityEnclosingRequest.getEntity() != null) {
            try {
                InputStream content = httpEntityEnclosingRequest.getEntity().getContent();
                if (content != null) {
                    int available = content.available();
                    if (available > 0) {
                        byte[] bArr = new byte[available];
                        content.read(bArr);
                        stringBuffer.append("POST:\n");
                        stringBuffer.append(new String(bArr)).append("\n");
                    }
                }
            } catch (IOException e) {
                aj.m7041d("Error Writing hit to log...");
            }
        }
        aj.m7041d(stringBuffer.toString());
    }

    String m7281a(String str, String str2, String str3, String str4, String str5, String str6) {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{str, str2, str3, str4, str5, str6});
    }

    URL m7282a(C1623u c1623u) {
        try {
            return new URL(c1623u.m7499c());
        } catch (MalformedURLException e) {
            aj.m7036a("Error trying to parse the GTM url.");
            return null;
        }
    }

    public void mo1027a(List<C1623u> list) {
        int min = Math.min(list.size(), 40);
        Object obj = 1;
        int i = 0;
        while (i < min) {
            Object obj2;
            C1623u c1623u = (C1623u) list.get(i);
            URL a = m7282a(c1623u);
            if (a == null) {
                aj.m7038b("No destination: discarding hit.");
                this.f4801d.mo1010b(c1623u);
                obj2 = obj;
            } else {
                HttpEntityEnclosingRequest a2 = m7279a(a);
                if (a2 == null) {
                    this.f4801d.mo1010b(c1623u);
                    obj2 = obj;
                } else {
                    HttpHost httpHost = new HttpHost(a.getHost(), a.getPort(), a.getProtocol());
                    a2.addHeader("Host", httpHost.toHostString());
                    m7280a(a2);
                    if (obj != null) {
                        try {
                            ao.m7055b(this.f4800c);
                            obj = null;
                        } catch (ClientProtocolException e) {
                            aj.m7038b("ClientProtocolException sending hit; discarding hit...");
                            this.f4801d.mo1010b(c1623u);
                            obj2 = obj;
                        } catch (IOException e2) {
                            aj.m7038b("Exception sending hit: " + e2.getClass().getSimpleName());
                            aj.m7038b(e2.getMessage());
                            this.f4801d.mo1011c(c1623u);
                            obj2 = obj;
                        }
                    }
                    HttpResponse execute = this.f4799b.execute(httpHost, a2);
                    int statusCode = execute.getStatusLine().getStatusCode();
                    HttpEntity entity = execute.getEntity();
                    if (entity != null) {
                        entity.consumeContent();
                    }
                    if (statusCode != 200) {
                        aj.m7038b("Bad response: " + execute.getStatusLine().getStatusCode());
                        this.f4801d.mo1011c(c1623u);
                    } else {
                        this.f4801d.mo1009a(c1623u);
                    }
                    obj2 = obj;
                }
            }
            i++;
            obj = obj2;
        }
    }

    public boolean mo1028a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f4800c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        aj.m7041d("...no network connectivity");
        return false;
    }
}
