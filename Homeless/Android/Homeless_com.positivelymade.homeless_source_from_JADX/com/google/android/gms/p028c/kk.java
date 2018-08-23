package com.google.android.gms.p028c;

import com.google.android.gms.common.internal.C1305x;

public class kk {
    private final String f3838a;
    private final Integer f3839b;
    private final String f3840c;
    private final boolean f3841d;
    private final String f3842e;

    public kk(String str, Integer num, String str2, boolean z) {
        this(str, num, str2, z, "");
    }

    public kk(String str, Integer num, String str2, boolean z, String str3) {
        C1305x.m6617a((Object) str);
        C1305x.m6617a((Object) str3);
        this.f3838a = str;
        this.f3839b = num;
        this.f3840c = str2;
        this.f3841d = z;
        this.f3842e = str3;
    }

    public String m5543a() {
        return this.f3838a;
    }

    public Integer m5544b() {
        return this.f3839b;
    }

    public String m5545c() {
        return this.f3840c;
    }

    public String m5546d() {
        return this.f3840c != null ? this.f3840c + "_" + this.f3838a : this.f3838a;
    }

    public boolean m5547e() {
        return this.f3841d;
    }

    public String m5548f() {
        return this.f3842e;
    }
}
