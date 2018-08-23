package com.google.android.gms.p032d;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.p032d.C1585c.C1584b;
import java.util.Map;

class cd implements C1584b {
    private final Context f4803a;

    public cd(Context context) {
        this.f4803a = context;
    }

    public void mo1029a(Map<String, Object> map) {
        Object obj;
        Object obj2 = map.get("gtm.url");
        if (obj2 == null) {
            obj = map.get("gtm");
            if (obj != null && (obj instanceof Map)) {
                obj = ((Map) obj).get("url");
                if (obj != null && (obj instanceof String)) {
                    String queryParameter = Uri.parse((String) obj).getQueryParameter("referrer");
                    if (queryParameter != null) {
                        ab.m7008b(this.f4803a, queryParameter);
                        return;
                    }
                    return;
                }
            }
        }
        obj = obj2;
        if (obj != null) {
        }
    }
}
