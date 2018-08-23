package com.google.android.gms.p028c;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0618p;
import com.google.android.gms.ads.internal.util.client.C0691b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@fn
public final class gv extends gk {
    private final String f3421a;
    private final Context f3422b;
    private final String f3423c;
    private String f3424d = null;

    public gv(Context context, String str, String str2) {
        this.f3422b = context;
        this.f3421a = str;
        this.f3423c = str2;
    }

    public gv(Context context, String str, String str2, String str3) {
        this.f3422b = context;
        this.f3421a = str;
        this.f3423c = str2;
        this.f3424d = str3;
    }

    public void mo486a() {
        HttpURLConnection httpURLConnection;
        try {
            C0691b.m3101d("Pinging URL: " + this.f3423c);
            httpURLConnection = (HttpURLConnection) new URL(this.f3423c).openConnection();
            if (TextUtils.isEmpty(this.f3424d)) {
                C0618p.m2796e().m4859a(this.f3422b, this.f3421a, true, httpURLConnection);
            } else {
                C0618p.m2796e().m4860a(this.f3422b, this.f3421a, true, httpURLConnection, this.f3424d);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                C0691b.m3103e("Received non-success response code " + responseCode + " from pinging URL: " + this.f3423c);
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            C0691b.m3103e("Error while parsing ping URL: " + this.f3423c + ". " + e.getMessage());
        } catch (IOException e2) {
            C0691b.m3103e("Error while pinging URL: " + this.f3423c + ". " + e2.getMessage());
        } catch (RuntimeException e3) {
            C0691b.m3103e("Error while pinging URL: " + this.f3423c + ". " + e3.getMessage());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
        }
    }

    public void mo487b() {
    }
}
