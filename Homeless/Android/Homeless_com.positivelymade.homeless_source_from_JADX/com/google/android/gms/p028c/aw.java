package com.google.android.gms.p028c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@fn
public class aw {
    private final Collection<av> f2443a = new ArrayList();
    private final Collection<av<String>> f2444b = new ArrayList();
    private final Collection<av<String>> f2445c = new ArrayList();

    public List<String> m3887a() {
        List<String> arrayList = new ArrayList();
        for (av c : this.f2444b) {
            String str = (String) c.m3878c();
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public void m3888a(av avVar) {
        this.f2443a.add(avVar);
    }

    public void m3889b(av<String> avVar) {
        this.f2444b.add(avVar);
    }

    public void m3890c(av<String> avVar) {
        this.f2445c.add(avVar);
    }
}
