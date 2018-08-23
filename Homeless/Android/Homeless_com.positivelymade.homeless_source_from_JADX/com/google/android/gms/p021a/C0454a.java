package com.google.android.gms.p021a;

import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.gms.common.internal.C1304w;

public final class C0454a {
    private final Uri f1243a;

    private C0454a(Uri uri) {
        this.f1243a = uri;
    }

    public static C0454a m2045a(String str, Uri uri) {
        Builder authority = new Builder().scheme("android-app").authority(str);
        if (uri != null) {
            authority.appendPath(uri.getScheme());
            if (uri.getAuthority() != null) {
                authority.appendPath(uri.getAuthority());
            }
            for (String appendPath : uri.getPathSegments()) {
                authority.appendPath(appendPath);
            }
            authority.encodedQuery(uri.getEncodedQuery()).encodedFragment(uri.getEncodedFragment());
        }
        return new C0454a(authority.build());
    }

    public boolean equals(Object obj) {
        return obj instanceof C0454a ? this.f1243a.equals(((C0454a) obj).f1243a) : false;
    }

    public int hashCode() {
        return C1304w.m6613a(this.f1243a);
    }

    public String toString() {
        return this.f1243a.toString();
    }
}
