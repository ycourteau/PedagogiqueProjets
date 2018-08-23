package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.C0618p;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@fn
public class cq implements Iterable<cp> {
    private final List<cp> f2630a = new LinkedList();

    private cp m4115c(hg hgVar) {
        Iterator it = C0618p.m2809r().iterator();
        while (it.hasNext()) {
            cp cpVar = (cp) it.next();
            if (cpVar.f2627a == hgVar) {
                return cpVar;
            }
        }
        return null;
    }

    public void m4116a(cp cpVar) {
        this.f2630a.add(cpVar);
    }

    public boolean m4117a(hg hgVar) {
        cp c = m4115c(hgVar);
        if (c == null) {
            return false;
        }
        c.f2628b.mo628a();
        return true;
    }

    public void m4118b(cp cpVar) {
        this.f2630a.remove(cpVar);
    }

    public boolean m4119b(hg hgVar) {
        return m4115c(hgVar) != null;
    }

    public Iterator<cp> iterator() {
        return this.f2630a.iterator();
    }
}
