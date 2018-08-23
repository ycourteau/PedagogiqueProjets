package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.util.client.C0691b;
import org.json.JSONObject;

@fn
public class ea {
    private final boolean f2886a;
    private final boolean f2887b;
    private final boolean f2888c;
    private final boolean f2889d;
    private final boolean f2890e;

    public static final class C0916a {
        private boolean f2881a;
        private boolean f2882b;
        private boolean f2883c;
        private boolean f2884d;
        private boolean f2885e;

        public C0916a m4455a(boolean z) {
            this.f2881a = z;
            return this;
        }

        public ea m4456a() {
            return new ea();
        }

        public C0916a m4457b(boolean z) {
            this.f2882b = z;
            return this;
        }

        public C0916a m4458c(boolean z) {
            this.f2883c = z;
            return this;
        }

        public C0916a m4459d(boolean z) {
            this.f2884d = z;
            return this;
        }

        public C0916a m4460e(boolean z) {
            this.f2885e = z;
            return this;
        }
    }

    private ea(C0916a c0916a) {
        this.f2886a = c0916a.f2881a;
        this.f2887b = c0916a.f2882b;
        this.f2888c = c0916a.f2883c;
        this.f2889d = c0916a.f2884d;
        this.f2890e = c0916a.f2885e;
    }

    public JSONObject m4461a() {
        try {
            return new JSONObject().put("sms", this.f2886a).put("tel", this.f2887b).put("calendar", this.f2888c).put("storePicture", this.f2889d).put("inlineVideo", this.f2890e);
        } catch (Throwable e) {
            C0691b.m3098b("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
