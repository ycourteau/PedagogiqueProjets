package com.google.android.gms.p028c;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;

public class C1141o {
    private String f4028a = "googleads.g.doubleclick.net";
    private String f4029b = "/pagead/ads";
    private String f4030c = "ad.doubleclick.net";
    private String[] f4031d = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private C0572k f4032e;

    public C1141o(C0572k c0572k) {
        this.f4032e = c0572k;
    }

    private Uri m5850a(Uri uri, Context context, String str, boolean z) {
        try {
            boolean a = m5856a(uri);
            if (a) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new C1142p("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new C1142p("Query parameter already exists: ms");
            }
            String a2 = z ? this.f4032e.mo439a(context, str) : this.f4032e.mo438a(context);
            return a ? m5852b(uri, "dc_ms", a2) : m5851a(uri, "ms", a2);
        } catch (UnsupportedOperationException e) {
            throw new C1142p("Provided Uri is not in a valid state");
        }
    }

    private Uri m5851a(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl");
        }
        return indexOf != -1 ? Uri.parse(new StringBuilder(uri2.substring(0, indexOf + 1)).append(str).append("=").append(str2).append("&").append(uri2.substring(indexOf + 1)).toString()) : uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private Uri m5852b(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf(";adurl");
        if (indexOf != -1) {
            return Uri.parse(new StringBuilder(uri2.substring(0, indexOf + 1)).append(str).append("=").append(str2).append(";").append(uri2.substring(indexOf + 1)).toString());
        }
        String encodedPath = uri.getEncodedPath();
        int indexOf2 = uri2.indexOf(encodedPath);
        return Uri.parse(new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2)).append(";").append(str).append("=").append(str2).append(";").append(uri2.substring(encodedPath.length() + indexOf2)).toString());
    }

    public Uri m5853a(Uri uri, Context context) {
        try {
            return m5850a(uri, context, uri.getQueryParameter("ai"), true);
        } catch (UnsupportedOperationException e) {
            throw new C1142p("Provided Uri is not in a valid state");
        }
    }

    public C0572k m5854a() {
        return this.f4032e;
    }

    public void m5855a(MotionEvent motionEvent) {
        this.f4032e.mo441a(motionEvent);
    }

    public boolean m5856a(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            return uri.getHost().equals(this.f4030c);
        } catch (NullPointerException e) {
            return false;
        }
    }

    public boolean m5857b(Uri uri) {
        if (uri == null) {
            throw new NullPointerException();
        }
        try {
            String host = uri.getHost();
            for (String endsWith : this.f4031d) {
                if (host.endsWith(endsWith)) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public boolean m5858c(Uri uri) {
        return m5857b(uri) && uri.getPath().endsWith("/aclk");
    }
}
