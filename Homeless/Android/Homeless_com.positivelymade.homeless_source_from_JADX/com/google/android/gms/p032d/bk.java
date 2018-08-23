package com.google.android.gms.p032d;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Map;

class bk extends C1546o {
    private static final String f4713a = C0914e.RESOLUTION.toString();
    private final Context f4714b;

    public bk(Context context) {
        super(f4713a, new String[0]);
        this.f4714b = context;
    }

    public C1009a mo972a(Map<String, C1009a> map) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f4714b.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        return cj.m7332e(i + "x" + displayMetrics.heightPixels);
    }

    public boolean mo973a() {
        return true;
    }
}
