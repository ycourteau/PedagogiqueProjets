package com.google.android.gms.games.p035c;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C1304w;
import com.google.android.gms.common.internal.C1304w.C1303a;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.games.internal.p041b.C1832b;
import java.util.HashMap;

public final class C1780b {
    private static final String[] f5541a = new String[]{"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"};
    private String f5542b;
    private String f5543c;
    private int f5544d;
    private HashMap<Integer, C1779a> f5545e = new HashMap();

    public static final class C1779a {
        public final long f5537a;
        public final String f5538b;
        public final String f5539c;
        public final boolean f5540d;

        public C1779a(long j, String str, String str2, boolean z) {
            this.f5537a = j;
            this.f5538b = str;
            this.f5539c = str2;
            this.f5540d = z;
        }

        public String toString() {
            return C1304w.m6614a((Object) this).m6612a("RawScore", Long.valueOf(this.f5537a)).m6612a("FormattedScore", this.f5538b).m6612a("ScoreTag", this.f5539c).m6612a("NewBest", Boolean.valueOf(this.f5540d)).toString();
        }
    }

    public C1780b(DataHolder dataHolder) {
        this.f5544d = dataHolder.m6245e();
        int g = dataHolder.m6248g();
        C1305x.m6625b(g == 3);
        for (int i = 0; i < g; i++) {
            int a = dataHolder.m6233a(i);
            if (i == 0) {
                this.f5542b = dataHolder.m6240c("leaderboardId", i, a);
                this.f5543c = dataHolder.m6240c("playerId", i, a);
            }
            if (dataHolder.m6242d("hasResult", i, a)) {
                m8393a(new C1779a(dataHolder.m6234a("rawScore", i, a), dataHolder.m6240c("formattedScore", i, a), dataHolder.m6240c("scoreTag", i, a), dataHolder.m6242d("newBest", i, a)), dataHolder.m6239b("timeSpan", i, a));
            }
        }
    }

    private void m8393a(C1779a c1779a, int i) {
        this.f5545e.put(Integer.valueOf(i), c1779a);
    }

    public String toString() {
        C1303a a = C1304w.m6614a((Object) this).m6612a("PlayerId", this.f5543c).m6612a("StatusCode", Integer.valueOf(this.f5544d));
        for (int i = 0; i < 3; i++) {
            C1779a c1779a = (C1779a) this.f5545e.get(Integer.valueOf(i));
            a.m6612a("TimesSpan", C1832b.m8600a(i));
            a.m6612a("Result", c1779a == null ? "null" : c1779a.toString());
        }
        return a.toString();
    }
}
