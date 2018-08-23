package com.google.android.gms.p032d;

import android.content.Context;
import com.google.android.gms.p032d.cz.C1565c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class bq implements C1565c {
    private final Context f4725a;
    private final String f4726b;
    private final ExecutorService f4727c = Executors.newSingleThreadExecutor();

    bq(Context context, String str) {
        this.f4725a = context;
        this.f4726b = str;
    }

    public synchronized void mo627b() {
        this.f4727c.shutdown();
    }
}
