package com.google.android.gms.games.snapshot;

import android.content.Intent;
import com.google.android.gms.common.api.C0774g;
import com.google.android.gms.common.api.C0777e;
import com.google.android.gms.common.api.C0870f;
import com.google.android.gms.common.api.C1180c;

public interface C1823g {

    public interface C1817a extends C0774g {
    }

    public interface C1819b extends C0870f, C0774g {
    }

    public interface C1821c extends C0774g {
        Snapshot mo1257c();

        String mo1258d();

        Snapshot mo1259e();
    }

    Intent mo1260a(C1180c c1180c, String str, boolean z, boolean z2, int i);

    C0777e<C1817a> mo1261a(C1180c c1180c, Snapshot snapshot, C1878d c1878d);

    C0777e<C1821c> mo1262a(C1180c c1180c, String str, Snapshot snapshot);

    C0777e<C1821c> mo1263a(C1180c c1180c, String str, boolean z);
}
