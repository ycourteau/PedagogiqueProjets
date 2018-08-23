package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.util.client.C0691b;
import java.util.Map;

@fn
public final class cc implements cg {
    private final cd f2578a;

    public cc(cd cdVar) {
        this.f2578a = cdVar;
    }

    public void mo524a(hg hgVar, Map<String, String> map) {
        String str = (String) map.get("name");
        if (str == null) {
            C0691b.m3103e("App event with no name parameter.");
        } else {
            this.f2578a.mo349a(str, (String) map.get("info"));
        }
    }
}
