package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.util.client.C0691b;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public class ah implements ag {
    private final af f2384a;
    private final HashSet<SimpleEntry<String, cg>> f2385b = new HashSet();

    public ah(af afVar) {
        this.f2384a = afVar;
    }

    public void mo588a() {
        Iterator it = this.f2385b.iterator();
        while (it.hasNext()) {
            SimpleEntry simpleEntry = (SimpleEntry) it.next();
            C0691b.m3101d("Unregistering eventhandler: " + ((cg) simpleEntry.getValue()).toString());
            this.f2384a.mo586b((String) simpleEntry.getKey(), (cg) simpleEntry.getValue());
        }
        this.f2385b.clear();
    }

    public void mo581a(String str, cg cgVar) {
        this.f2384a.mo581a(str, cgVar);
        this.f2385b.add(new SimpleEntry(str, cgVar));
    }

    public void mo582a(String str, String str2) {
        this.f2384a.mo582a(str, str2);
    }

    public void mo583a(String str, JSONObject jSONObject) {
        this.f2384a.mo583a(str, jSONObject);
    }

    public void mo586b(String str, cg cgVar) {
        this.f2384a.mo586b(str, cgVar);
        this.f2385b.remove(new SimpleEntry(str, cgVar));
    }
}
