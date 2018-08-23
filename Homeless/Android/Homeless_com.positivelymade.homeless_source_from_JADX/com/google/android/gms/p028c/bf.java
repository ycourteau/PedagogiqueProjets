package com.google.android.gms.p028c;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0618p;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class bf {
    boolean f2527a;
    private final List<be> f2528b = new LinkedList();
    private final Map<String, String> f2529c = new LinkedHashMap();
    private final Object f2530d = new Object();
    private String f2531e;
    private be f2532f;

    public bf(boolean z, String str, String str2) {
        this.f2527a = z;
        this.f2529c.put("action", str);
        this.f2529c.put("ad_format", str2);
    }

    private boolean m3915a(be beVar, long j, String... strArr) {
        synchronized (this.f2530d) {
            for (String beVar2 : strArr) {
                this.f2528b.add(new be(j, beVar2, beVar));
            }
        }
        return true;
    }

    public be m3916a() {
        return m3917a(C0618p.m2800i().mo825b());
    }

    public be m3917a(long j) {
        return !this.f2527a ? null : new be(j, null, null);
    }

    public void m3918a(String str) {
        if (this.f2527a) {
            synchronized (this.f2530d) {
                this.f2531e = str;
            }
        }
    }

    public void m3919a(String str, String str2) {
        if (this.f2527a) {
            synchronized (this.f2530d) {
                this.f2529c.put(str, str2);
            }
        }
    }

    public boolean m3920a(be beVar, String... strArr) {
        return (!this.f2527a || beVar == null) ? false : m3915a(beVar, C0618p.m2800i().mo825b(), strArr);
    }

    public void m3921b() {
        synchronized (this.f2530d) {
            this.f2532f = m3916a();
        }
    }

    public String m3922c() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        synchronized (this.f2530d) {
            for (be beVar : this.f2528b) {
                long a = beVar.m3912a();
                String b = beVar.m3913b();
                be beVar2 = beVar2.m3914c();
                if (beVar2 != null && a > 0) {
                    stringBuilder2.append(b).append('.').append(a - beVar2.m3912a()).append(',');
                }
            }
            this.f2528b.clear();
            if (!TextUtils.isEmpty(this.f2531e)) {
                stringBuilder2.append(this.f2531e);
            } else if (stringBuilder2.length() > 0) {
                stringBuilder2.setLength(stringBuilder2.length() - 1);
            }
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    Map<String, String> m3923d() {
        Map<String, String> map;
        synchronized (this.f2530d) {
            map = this.f2529c;
        }
        return map;
    }

    public be m3924e() {
        be beVar;
        synchronized (this.f2530d) {
            beVar = this.f2532f;
        }
        return beVar;
    }
}
