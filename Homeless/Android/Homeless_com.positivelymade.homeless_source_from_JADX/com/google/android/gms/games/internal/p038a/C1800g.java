package com.google.android.gms.games.internal.p038a;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.C1180c;
import com.google.android.gms.games.C1776b;
import com.google.android.gms.games.internal.C1852c;
import com.google.android.gms.games.internal.C1853d;
import com.google.android.gms.games.p035c.C1778a;

public final class C1800g implements C1778a {
    public Intent mo1255a(C1180c c1180c, String str) {
        return m8413a(c1180c, str, -1);
    }

    public Intent m8413a(C1180c c1180c, String str, int i) {
        return C1776b.m8387a(c1180c).m8621a(str, i);
    }

    public void mo1256a(C1180c c1180c, String str, long j) {
        m8415a(c1180c, str, j, null);
    }

    public void m8415a(C1180c c1180c, String str, long j, String str2) {
        C1852c a = C1776b.m8388a(c1180c, false);
        if (a != null) {
            try {
                a.m8634a(null, str, j, str2);
            } catch (RemoteException e) {
                C1853d.m8647a("LeaderboardsImpl", "service died");
            }
        }
    }
}
