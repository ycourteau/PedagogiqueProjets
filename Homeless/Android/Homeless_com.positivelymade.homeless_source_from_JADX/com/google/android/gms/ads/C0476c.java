package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.aa;
import com.google.android.gms.ads.internal.client.aa.C0506a;
import com.google.android.gms.ads.p017d.C0434b;
import com.google.p016a.p018a.p020a.C0439a;
import java.util.Date;

public final class C0476c {
    public static final String f1275a = aa.f1388a;
    private final aa f1276b;

    public static final class C0472a {
        private final C0506a f1260a = new C0506a();

        public C0472a() {
            this.f1260a.m2303b(C0476c.f1275a);
        }

        public C0472a m2088a(int i) {
            this.f1260a.m2297a(i);
            return this;
        }

        public C0472a m2089a(Location location) {
            this.f1260a.m2298a(location);
            return this;
        }

        public C0472a m2090a(Class<? extends C0434b> cls, Bundle bundle) {
            this.f1260a.m2299a(cls, bundle);
            if (cls.equals(C0439a.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f1260a.m2304c(C0476c.f1275a);
            }
            return this;
        }

        public C0472a m2091a(String str) {
            this.f1260a.m2300a(str);
            return this;
        }

        public C0472a m2092a(Date date) {
            this.f1260a.m2301a(date);
            return this;
        }

        public C0472a m2093a(boolean z) {
            this.f1260a.m2302a(z);
            return this;
        }

        public C0476c m2094a() {
            return new C0476c();
        }

        public C0472a m2095b(String str) {
            this.f1260a.m2303b(str);
            return this;
        }
    }

    private C0476c(C0472a c0472a) {
        this.f1276b = new aa(c0472a.f1260a);
    }

    public aa m2109a() {
        return this.f1276b;
    }
}
