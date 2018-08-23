package com.google.android.gms.analytics.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.gms.common.internal.C1305x;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.zip.GZIPOutputStream;

class C0736i extends C0717p {
    private static final byte[] f2153c = "\n".getBytes();
    private final String f2154a = C0736i.m3408a("GoogleAnalytics", C0748q.f2184a, VERSION.RELEASE, C0741l.m3450a(Locale.getDefault()), Build.MODEL, Build.ID);
    private final C0740k f2155b;

    private class C0735a {
        final /* synthetic */ C0736i f2150a;
        private int f2151b;
        private ByteArrayOutputStream f2152c = new ByteArrayOutputStream();

        public C0735a(C0736i c0736i) {
            this.f2150a = c0736i;
        }

        public int m3404a() {
            return this.f2151b;
        }

        public boolean m3405a(C0727c c0727c) {
            C1305x.m6617a((Object) c0727c);
            if (this.f2151b + 1 > this.f2150a.m3217q().m3294m()) {
                return false;
            }
            String a = this.f2150a.m3420a(c0727c, false);
            if (a == null) {
                this.f2150a.m3216p().m3391a(c0727c, "Error formatting hit");
                return true;
            }
            byte[] bytes = a.getBytes();
            int length = bytes.length;
            if (length > this.f2150a.m3217q().m3286e()) {
                this.f2150a.m3216p().m3391a(c0727c, "Hit size exceeds the maximum size limit");
                return true;
            }
            if (this.f2152c.size() > 0) {
                length++;
            }
            if (length + this.f2152c.size() > this.f2150a.m3217q().m3288g()) {
                return false;
            }
            try {
                if (this.f2152c.size() > 0) {
                    this.f2152c.write(C0736i.f2153c);
                }
                this.f2152c.write(bytes);
                this.f2151b++;
                return true;
            } catch (IOException e) {
                this.f2150a.m3209e("Failed to write payload when batching hits", e);
                return true;
            }
        }

        public byte[] m3406b() {
            return this.f2152c.toByteArray();
        }
    }

    C0736i(C0750r c0750r) {
        super(c0750r);
        this.f2155b = new C0740k(c0750r.m3492d());
    }

    private int m3407a(URL url, byte[] bArr) {
        int responseCode;
        Object e;
        Throwable th;
        OutputStream outputStream = null;
        C1305x.m6617a((Object) url);
        C1305x.m6617a((Object) bArr);
        m3200b("POST bytes, url", Integer.valueOf(bArr.length), url);
        if (m3194B()) {
            m3195a("Post payload\n", new String(bArr));
        }
        HttpURLConnection a;
        try {
            a = m3421a(url);
            try {
                a.setDoOutput(true);
                a.setFixedLengthStreamingMode(bArr.length);
                a.connect();
                outputStream = a.getOutputStream();
                outputStream.write(bArr);
                m3411a(a);
                responseCode = a.getResponseCode();
                if (responseCode == 200) {
                    m3220t().m3486g();
                }
                m3199b("POST status", Integer.valueOf(responseCode));
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e2) {
                        m3209e("Error closing http post connection output stream", e2);
                    }
                }
                if (a != null) {
                    a.disconnect();
                }
            } catch (IOException e3) {
                e = e3;
                try {
                    m3206d("Network POST connection error", e);
                    responseCode = 0;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e22) {
                            m3209e("Error closing http post connection output stream", e22);
                        }
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    return responseCode;
                } catch (Throwable th2) {
                    th = th2;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e222) {
                            m3209e("Error closing http post connection output stream", e222);
                        }
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    throw th;
                }
            }
        } catch (IOException e4) {
            e = e4;
            a = outputStream;
            m3206d("Network POST connection error", e);
            responseCode = 0;
            if (outputStream != null) {
                outputStream.close();
            }
            if (a != null) {
                a.disconnect();
            }
            return responseCode;
        } catch (Throwable th3) {
            th = th3;
            a = outputStream;
            if (outputStream != null) {
                outputStream.close();
            }
            if (a != null) {
                a.disconnect();
            }
            throw th;
        }
        return responseCode;
    }

    private static String m3408a(String str, String str2, String str3, String str4, String str5, String str6) {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{str, str2, str3, str4, str5, str6});
    }

    private URL m3409a(C0727c c0727c, String str) {
        try {
            return new URL(c0727c.m3371f() ? m3217q().m3296o() + m3217q().m3298q() + "?" + str : m3217q().m3297p() + m3217q().m3298q() + "?" + str);
        } catch (MalformedURLException e) {
            m3209e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private void m3410a(StringBuilder stringBuilder, String str, String str2) {
        if (stringBuilder.length() != 0) {
            stringBuilder.append('&');
        }
        stringBuilder.append(URLEncoder.encode(str, "UTF-8"));
        stringBuilder.append('=');
        stringBuilder.append(URLEncoder.encode(str2, "UTF-8"));
    }

    private void m3411a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            do {
            } while (inputStream.read(new byte[1024]) > 0);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    m3209e("Error closing http connection input stream", e);
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    m3209e("Error closing http connection input stream", e2);
                }
            }
        }
    }

    private boolean m3412a(C0727c c0727c) {
        C1305x.m6617a((Object) c0727c);
        String a = m3420a(c0727c, !c0727c.m3371f());
        if (a == null) {
            m3216p().m3391a(c0727c, "Error formatting hit for upload");
            return true;
        } else if (a.length() <= m3217q().m3285d()) {
            URL a2 = m3409a(c0727c, a);
            if (a2 != null) {
                return m3414b(a2) == 200;
            } else {
                m3210f("Failed to build collect GET endpoint url");
                return false;
            }
        } else {
            a = m3420a(c0727c, false);
            if (a == null) {
                m3216p().m3391a(c0727c, "Error formatting hit for POST upload");
                return true;
            }
            byte[] bytes = a.getBytes();
            if (bytes.length > m3217q().m3287f()) {
                m3216p().m3391a(c0727c, "Hit payload exceeds size limit");
                return true;
            }
            URL b = m3416b(c0727c);
            if (b != null) {
                return m3407a(b, bytes) == 200;
            } else {
                m3210f("Failed to build collect POST endpoint url");
                return false;
            }
        }
    }

    private static byte[] m3413a(byte[] bArr) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private int m3414b(URL url) {
        int responseCode;
        C1305x.m6617a((Object) url);
        m3199b("GET request", url);
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = m3421a(url);
            httpURLConnection.connect();
            m3411a(httpURLConnection);
            responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                m3220t().m3486g();
            }
            m3199b("GET status", Integer.valueOf(responseCode));
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            m3206d("Network GET connection error", e);
            responseCode = 0;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
        return responseCode;
    }

    private int m3415b(URL url, byte[] bArr) {
        HttpURLConnection a;
        Object e;
        HttpURLConnection httpURLConnection;
        int i;
        Throwable th;
        OutputStream outputStream = null;
        C1305x.m6617a((Object) url);
        C1305x.m6617a((Object) bArr);
        try {
            OutputStream outputStream2;
            byte[] a2 = C0736i.m3413a(bArr);
            m3197a("POST compressed size, ratio %, url", Integer.valueOf(a2.length), Long.valueOf((100 * ((long) a2.length)) / ((long) bArr.length)), url);
            if (a2.length > bArr.length) {
                m3204c("Compressed payload is larger then uncompressed. compressed, uncompressed", Integer.valueOf(a2.length), Integer.valueOf(bArr.length));
            }
            if (m3194B()) {
                m3195a("Post payload", "\n" + new String(bArr));
            }
            a = m3421a(url);
            try {
                a.setDoOutput(true);
                a.addRequestProperty("Content-Encoding", "gzip");
                a.setFixedLengthStreamingMode(a2.length);
                a.connect();
                outputStream2 = a.getOutputStream();
            } catch (IOException e2) {
                e = e2;
                httpURLConnection = a;
                try {
                    m3206d("Network compressed POST connection error", e);
                    i = 0;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e3) {
                            m3209e("Error closing http compressed post connection output stream", e3);
                        }
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return i;
                } catch (Throwable th2) {
                    th = th2;
                    a = httpURLConnection;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e32) {
                            m3209e("Error closing http compressed post connection output stream", e32);
                        }
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (a != null) {
                    a.disconnect();
                }
                throw th;
            }
            try {
                outputStream2.write(a2);
                outputStream2.close();
                outputStream2 = null;
                m3411a(a);
                i = a.getResponseCode();
                if (i == 200) {
                    m3220t().m3486g();
                }
                m3199b("POST status", Integer.valueOf(i));
                if (null != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException e322) {
                        m3209e("Error closing http compressed post connection output stream", e322);
                    }
                }
                if (a != null) {
                    a.disconnect();
                }
            } catch (IOException e4) {
                e = e4;
                outputStream = outputStream2;
                httpURLConnection = a;
                m3206d("Network compressed POST connection error", e);
                i = 0;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return i;
            } catch (Throwable th4) {
                th = th4;
                outputStream = outputStream2;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (a != null) {
                    a.disconnect();
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            httpURLConnection = null;
            m3206d("Network compressed POST connection error", e);
            i = 0;
            if (outputStream != null) {
                outputStream.close();
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return i;
        } catch (Throwable th5) {
            th = th5;
            a = null;
            if (outputStream != null) {
                outputStream.close();
            }
            if (a != null) {
                a.disconnect();
            }
            throw th;
        }
        return i;
    }

    private URL m3416b(C0727c c0727c) {
        try {
            return new URL(c0727c.m3371f() ? m3217q().m3296o() + m3217q().m3298q() : m3217q().m3297p() + m3217q().m3298q());
        } catch (MalformedURLException e) {
            m3209e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private String m3417c(C0727c c0727c) {
        return String.valueOf(c0727c.m3368c());
    }

    private URL m3419d() {
        try {
            return new URL(m3217q().m3296o() + m3217q().m3299r());
        } catch (MalformedURLException e) {
            m3209e("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    String m3420a(C0727c c0727c, boolean z) {
        C1305x.m6617a((Object) c0727c);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Entry entry : c0727c.m3367b().entrySet()) {
                String str = (String) entry.getKey();
                if (!("ht".equals(str) || "qt".equals(str) || "AppUID".equals(str) || "z".equals(str) || "_gmsv".equals(str))) {
                    m3410a(stringBuilder, str, (String) entry.getValue());
                }
            }
            m3410a(stringBuilder, "ht", String.valueOf(c0727c.m3369d()));
            m3410a(stringBuilder, "qt", String.valueOf(m3214n().mo824a() - c0727c.m3369d()));
            if (m3217q().m3282a()) {
                m3410a(stringBuilder, "_gmsv", C0748q.f2184a);
            }
            if (z) {
                long g = c0727c.m3372g();
                m3410a(stringBuilder, "z", g != 0 ? String.valueOf(g) : m3417c(c0727c));
            }
            return stringBuilder.toString();
        } catch (UnsupportedEncodingException e) {
            m3209e("Failed to encode name or value", e);
            return null;
        }
    }

    HttpURLConnection m3421a(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(m3217q().m3278D());
            httpURLConnection.setReadTimeout(m3217q().m3279E());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.f2154a);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    public List<Long> m3422a(List<C0727c> list) {
        boolean z;
        boolean z2 = true;
        m3213m();
        m3228D();
        C1305x.m6617a((Object) list);
        if (m3217q().m3302u().isEmpty() || !this.f2155b.m3445a(m3217q().m3295n() * 1000)) {
            z2 = false;
            z = false;
        } else {
            z = m3217q().m3300s() != C0767y.NONE;
            if (m3217q().m3301t() != aa.GZIP) {
                z2 = false;
            }
        }
        return z ? m3423a((List) list, z2) : m3425b((List) list);
    }

    List<Long> m3423a(List<C0727c> list, boolean z) {
        C1305x.m6625b(!list.isEmpty());
        m3196a("Uploading batched hits. compression, count", Boolean.valueOf(z), Integer.valueOf(list.size()));
        C0735a c0735a = new C0735a(this);
        List<Long> arrayList = new ArrayList();
        for (C0727c c0727c : list) {
            if (!c0735a.m3405a(c0727c)) {
                break;
            }
            arrayList.add(Long.valueOf(c0727c.m3368c()));
        }
        if (c0735a.m3404a() == 0) {
            return arrayList;
        }
        URL d = m3419d();
        if (d == null) {
            m3210f("Failed to build batching endpoint url");
            return Collections.emptyList();
        }
        int b = z ? m3415b(d, c0735a.m3406b()) : m3407a(d, c0735a.m3406b());
        if (200 == b) {
            m3195a("Batched upload completed. Hits batched", Integer.valueOf(c0735a.m3404a()));
            return arrayList;
        }
        m3195a("Network error uploading hits. status code", Integer.valueOf(b));
        if (m3217q().m3302u().contains(Integer.valueOf(b))) {
            m3208e("Server instructed the client to stop batching");
            this.f2155b.m3444a();
        }
        return Collections.emptyList();
    }

    protected void mo540a() {
        m3195a("Network initialized. User agent", this.f2154a);
    }

    List<Long> m3425b(List<C0727c> list) {
        List<Long> arrayList = new ArrayList(list.size());
        for (C0727c c0727c : list) {
            if (!m3412a(c0727c)) {
                break;
            }
            arrayList.add(Long.valueOf(c0727c.m3368c()));
            if (arrayList.size() >= m3217q().m3293l()) {
                break;
            }
        }
        return arrayList;
    }

    public boolean m3426b() {
        NetworkInfo activeNetworkInfo;
        m3213m();
        m3228D();
        try {
            activeNetworkInfo = ((ConnectivityManager) m3215o().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        m3198b("No network connectivity");
        return false;
    }
}
