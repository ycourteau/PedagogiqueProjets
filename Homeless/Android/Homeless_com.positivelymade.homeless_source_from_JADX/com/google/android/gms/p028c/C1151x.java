package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

@fn
public final class C1151x {
    private final String f4040a;
    private final JSONObject f4041b;
    private final String f4042c;
    private final String f4043d;
    private final boolean f4044e;

    public C1151x(String str, VersionInfoParcel versionInfoParcel, String str2, JSONObject jSONObject, boolean z) {
        this.f4043d = versionInfoParcel.f1976b;
        this.f4041b = jSONObject;
        this.f4042c = str;
        this.f4040a = str2;
        this.f4044e = z;
    }

    public String m5907a() {
        return this.f4040a;
    }

    public String m5908b() {
        return this.f4043d;
    }

    public JSONObject m5909c() {
        return this.f4041b;
    }

    public String m5910d() {
        return this.f4042c;
    }

    public boolean m5911e() {
        return this.f4044e;
    }
}
