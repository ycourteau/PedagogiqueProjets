package com.google.android.gms.ads.internal.formats;

import com.google.android.gms.ads.internal.formats.C0569g.C0563a;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.C1042if;
import com.google.android.gms.p028c.bl;
import com.google.android.gms.p028c.bt.C0567a;
import com.google.android.gms.p028c.fn;
import java.util.Arrays;
import java.util.List;

@fn
public class C0568e extends C0567a implements C0563a {
    private final C0559a f1509a;
    private final String f1510b;
    private final C1042if<String, C0561b> f1511c;
    private final C1042if<String, String> f1512d;
    private final Object f1513e = new Object();
    private C0569g f1514f;

    public C0568e(String str, C1042if<String, C0561b> c1042if, C1042if<String, String> c1042if2, C0559a c0559a) {
        this.f1510b = str;
        this.f1511c = c1042if;
        this.f1512d = c1042if2;
        this.f1509a = c0559a;
    }

    public String mo432a(String str) {
        return (String) this.f1512d.get(str);
    }

    public List<String> mo433a() {
        int i = 0;
        String[] strArr = new String[(this.f1511c.size() + this.f1512d.size())];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f1511c.size(); i3++) {
            strArr[i2] = (String) this.f1511c.m5242b(i3);
            i2++;
        }
        while (i < this.f1512d.size()) {
            strArr[i2] = (String) this.f1512d.m5242b(i);
            i++;
            i2++;
        }
        return Arrays.asList(strArr);
    }

    public void mo412a(C0569g c0569g) {
        synchronized (this.f1513e) {
            this.f1514f = c0569g;
        }
    }

    public bl mo434b(String str) {
        return (bl) this.f1511c.get(str);
    }

    public void mo435b() {
        synchronized (this.f1513e) {
            if (this.f1514f == null) {
                C0691b.m3097b("Attempt to perform recordImpression before ad initialized.");
                return;
            }
            this.f1514f.mo437a();
        }
    }

    public void mo436c(String str) {
        synchronized (this.f1513e) {
            if (this.f1514f == null) {
                C0691b.m3097b("Attempt to call performClick before ad initialized.");
                return;
            }
            this.f1514f.m2554a(str);
        }
    }

    public String mo421j() {
        return "3";
    }

    public String mo422k() {
        return this.f1510b;
    }
}
