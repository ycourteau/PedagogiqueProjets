package com.google.android.gms.analytics.internal;

import com.google.android.gms.analytics.internal.ac.C0722a;

public class al extends ac<C0726b> {

    private static class C0725a implements C0722a<C0726b> {
        private final C0750r f2121a;
        private final C0726b f2122b = new C0726b();

        public C0725a(C0750r c0750r) {
            this.f2121a = c0750r;
        }

        public /* synthetic */ ab mo545a() {
            return m3348b();
        }

        public void mo546a(String str, int i) {
            if ("ga_dispatchPeriod".equals(str)) {
                this.f2122b.f2126d = i;
            } else {
                this.f2121a.m3494f().m3206d("Int xml configuration name not recognized", str);
            }
        }

        public void mo547a(String str, String str2) {
        }

        public void mo548a(String str, boolean z) {
            if ("ga_dryRun".equals(str)) {
                this.f2122b.f2127e = z ? 1 : 0;
                return;
            }
            this.f2121a.m3494f().m3206d("Bool xml configuration name not recognized", str);
        }

        public C0726b m3348b() {
            return this.f2122b;
        }

        public void mo549b(String str, String str2) {
            if ("ga_appName".equals(str)) {
                this.f2122b.f2123a = str2;
            } else if ("ga_appVersion".equals(str)) {
                this.f2122b.f2124b = str2;
            } else if ("ga_logLevel".equals(str)) {
                this.f2122b.f2125c = str2;
            } else {
                this.f2121a.m3494f().m3206d("String xml configuration name not recognized", str);
            }
        }
    }

    public al(C0750r c0750r) {
        super(c0750r, new C0725a(c0750r));
    }
}
