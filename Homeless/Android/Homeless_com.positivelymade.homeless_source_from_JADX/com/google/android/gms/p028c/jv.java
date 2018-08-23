package com.google.android.gms.p028c;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C1305x;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class jv extends ji<jv> {
    private String f3792a;
    private int f3793b;
    private int f3794c;
    private String f3795d;
    private String f3796e;
    private boolean f3797f;
    private boolean f3798g;
    private boolean f3799h;

    public jv() {
        this(false);
    }

    public jv(boolean z) {
        this(z, jv.m5461a());
    }

    public jv(boolean z, int i) {
        C1305x.m6616a(i);
        this.f3793b = i;
        this.f3798g = z;
    }

    static int m5461a() {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits != 0) {
            return leastSignificantBits;
        }
        leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L);
        if (leastSignificantBits != 0) {
            return leastSignificantBits;
        }
        Log.e("GAv4", "UUID.randomUUID() returned 0.");
        return Integer.MAX_VALUE;
    }

    private void m5462j() {
        if (this.f3799h) {
            throw new IllegalStateException("ScreenViewInfo is immutable");
        }
    }

    public void m5463a(int i) {
        m5462j();
        this.f3793b = i;
    }

    public /* synthetic */ void mo804a(ji jiVar) {
        m5465a((jv) jiVar);
    }

    public void m5465a(jv jvVar) {
        if (!TextUtils.isEmpty(this.f3792a)) {
            jvVar.m5466a(this.f3792a);
        }
        if (this.f3793b != 0) {
            jvVar.m5463a(this.f3793b);
        }
        if (this.f3794c != 0) {
            jvVar.m5469b(this.f3794c);
        }
        if (!TextUtils.isEmpty(this.f3795d)) {
            jvVar.m5470b(this.f3795d);
        }
        if (!TextUtils.isEmpty(this.f3796e)) {
            jvVar.m5473c(this.f3796e);
        }
        if (this.f3797f) {
            jvVar.m5471b(this.f3797f);
        }
        if (this.f3798g) {
            jvVar.m5467a(this.f3798g);
        }
    }

    public void m5466a(String str) {
        m5462j();
        this.f3792a = str;
    }

    public void m5467a(boolean z) {
        m5462j();
        this.f3798g = z;
    }

    public String m5468b() {
        return this.f3792a;
    }

    public void m5469b(int i) {
        m5462j();
        this.f3794c = i;
    }

    public void m5470b(String str) {
        m5462j();
        this.f3795d = str;
    }

    public void m5471b(boolean z) {
        m5462j();
        this.f3797f = z;
    }

    public int m5472c() {
        return this.f3793b;
    }

    public void m5473c(String str) {
        m5462j();
        if (TextUtils.isEmpty(str)) {
            this.f3796e = null;
        } else {
            this.f3796e = str;
        }
    }

    public int m5474d() {
        return this.f3794c;
    }

    public String m5475e() {
        return this.f3795d;
    }

    public String m5476f() {
        return this.f3796e;
    }

    public boolean m5477g() {
        return !this.f3799h;
    }

    public void m5478h() {
        this.f3799h = true;
    }

    public boolean m5479i() {
        return this.f3797f;
    }

    public String toString() {
        Map hashMap = new HashMap();
        hashMap.put("screenName", this.f3792a);
        hashMap.put("interstitial", Boolean.valueOf(this.f3797f));
        hashMap.put("automatic", Boolean.valueOf(this.f3798g));
        hashMap.put("screenId", Integer.valueOf(this.f3793b));
        hashMap.put("referrerScreenId", Integer.valueOf(this.f3794c));
        hashMap.put("referrerScreenName", this.f3795d);
        hashMap.put("referrerUri", this.f3796e);
        return ji.m5116a((Object) hashMap);
    }
}
