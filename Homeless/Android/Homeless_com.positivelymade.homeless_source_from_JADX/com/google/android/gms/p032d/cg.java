package com.google.android.gms.p032d;

import android.content.Context;
import com.google.android.gms.analytics.C0710e;
import com.google.android.gms.analytics.C0714g;
import com.google.android.gms.analytics.C0719h;

public class cg {
    private C0710e f4824a;
    private Context f4825b;
    private C0719h f4826c;

    static class C1588a implements C0714g {
        C1588a() {
        }

        private static int m7298b(int i) {
            switch (i) {
                case 2:
                    return 0;
                case 3:
                case 4:
                    return 1;
                case 5:
                    return 2;
                default:
                    return 3;
            }
        }

        public int mo541a() {
            return C1588a.m7298b(aj.m7035a());
        }

        public void mo542a(int i) {
            aj.m7038b("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
        }

        public void mo543a(String str) {
            aj.m7038b(str);
        }

        public void mo544b(String str) {
            aj.m7036a(str);
        }
    }

    public cg(Context context) {
        this.f4825b = context;
    }

    private synchronized void m7303b(String str) {
        if (this.f4824a == null) {
            this.f4824a = C0710e.m3165a(this.f4825b);
            this.f4824a.m3170a(new C1588a());
            this.f4826c = this.f4824a.m3168a(str);
        }
    }

    public C0719h m7304a(String str) {
        m7303b(str);
        return this.f4826c;
    }
}
