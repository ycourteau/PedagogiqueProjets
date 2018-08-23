package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.util.client.C0691b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@fn
public class aj {
    private final Object f2397a = new Object();
    private int f2398b;
    private List<ai> f2399c = new LinkedList();

    public ai m3813a() {
        ai aiVar = null;
        synchronized (this.f2397a) {
            if (this.f2399c.size() == 0) {
                C0691b.m3093a("Queue empty");
                return null;
            } else if (this.f2399c.size() >= 2) {
                int i = Integer.MIN_VALUE;
                for (ai aiVar2 : this.f2399c) {
                    ai aiVar3;
                    int i2;
                    int g = aiVar2.m3811g();
                    if (g > i) {
                        int i3 = g;
                        aiVar3 = aiVar2;
                        i2 = i3;
                    } else {
                        i2 = i;
                        aiVar3 = aiVar;
                    }
                    i = i2;
                    aiVar = aiVar3;
                }
                this.f2399c.remove(aiVar);
                return aiVar;
            } else {
                aiVar2 = (ai) this.f2399c.get(0);
                aiVar2.m3807c();
                return aiVar2;
            }
        }
    }

    public boolean m3814a(ai aiVar) {
        boolean z;
        synchronized (this.f2397a) {
            if (this.f2399c.contains(aiVar)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean m3815b(ai aiVar) {
        boolean z;
        synchronized (this.f2397a) {
            Iterator it = this.f2399c.iterator();
            while (it.hasNext()) {
                ai aiVar2 = (ai) it.next();
                if (aiVar != aiVar2 && aiVar2.m3805b().equals(aiVar.m3805b())) {
                    it.remove();
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return z;
    }

    public void m3816c(ai aiVar) {
        synchronized (this.f2397a) {
            if (this.f2399c.size() >= 10) {
                C0691b.m3093a("Queue is full, current size = " + this.f2399c.size());
                this.f2399c.remove(0);
            }
            int i = this.f2398b;
            this.f2398b = i + 1;
            aiVar.m3802a(i);
            this.f2399c.add(aiVar);
        }
    }
}
