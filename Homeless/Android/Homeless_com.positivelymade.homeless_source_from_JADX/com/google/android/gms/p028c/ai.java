package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.util.client.C0691b;
import java.util.ArrayList;
import java.util.Iterator;

@fn
public class ai {
    private final int f2386a;
    private final int f2387b;
    private final int f2388c;
    private final an f2389d;
    private final Object f2390e = new Object();
    private ArrayList<String> f2391f = new ArrayList();
    private int f2392g = 0;
    private int f2393h = 0;
    private int f2394i = 0;
    private int f2395j;
    private String f2396k = "";

    public ai(int i, int i2, int i3, int i4) {
        this.f2386a = i;
        this.f2387b = i2;
        this.f2388c = i3;
        this.f2389d = new an(i4);
    }

    private String m3799a(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append((String) it.next());
            stringBuffer.append(' ');
            if (stringBuffer.length() > i) {
                break;
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        String stringBuffer2 = stringBuffer.toString();
        return stringBuffer2.length() >= i ? stringBuffer2.substring(0, i) : stringBuffer2;
    }

    private void m3800c(String str) {
        if (str != null && str.length() >= this.f2388c) {
            synchronized (this.f2390e) {
                this.f2391f.add(str);
                this.f2392g += str.length();
            }
        }
    }

    int m3801a(int i, int i2) {
        return (this.f2386a * i) + (this.f2387b * i2);
    }

    public void m3802a(int i) {
        this.f2393h = i;
    }

    public void m3803a(String str) {
        m3800c(str);
        synchronized (this.f2390e) {
            if (this.f2394i < 0) {
                C0691b.m3093a("ActivityContent: negative number of WebViews.");
            }
            m3810f();
        }
    }

    public boolean m3804a() {
        boolean z;
        synchronized (this.f2390e) {
            z = this.f2394i == 0;
        }
        return z;
    }

    public String m3805b() {
        return this.f2396k;
    }

    public void m3806b(String str) {
        m3800c(str);
    }

    public void m3807c() {
        synchronized (this.f2390e) {
            this.f2395j -= 100;
        }
    }

    public void m3808d() {
        synchronized (this.f2390e) {
            this.f2394i--;
        }
    }

    public void m3809e() {
        synchronized (this.f2390e) {
            this.f2394i++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ai)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ai aiVar = (ai) obj;
        return aiVar.m3805b() != null && aiVar.m3805b().equals(m3805b());
    }

    public void m3810f() {
        synchronized (this.f2390e) {
            int a = m3801a(this.f2392g, this.f2393h);
            if (a > this.f2395j) {
                this.f2395j = a;
                this.f2396k = this.f2389d.m3843a(this.f2391f);
            }
        }
    }

    public int m3811g() {
        return this.f2395j;
    }

    int m3812h() {
        return this.f2392g;
    }

    public int hashCode() {
        return m3805b().hashCode();
    }

    public String toString() {
        return "ActivityContent fetchId: " + this.f2393h + " score:" + this.f2395j + " total_length:" + this.f2392g + "\n text: " + m3799a(this.f2391f, 200) + "\n signture: " + this.f2396k;
    }
}
