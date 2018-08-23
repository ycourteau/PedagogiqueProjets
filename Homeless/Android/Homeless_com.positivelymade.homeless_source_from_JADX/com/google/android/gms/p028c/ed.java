package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.util.client.C0691b;
import org.json.JSONObject;

@fn
public class ed {
    private final hg f2791a;
    private final String f2792b;

    public ed(hg hgVar) {
        this(hgVar, "");
    }

    public ed(hg hgVar, String str) {
        this.f2791a = hgVar;
        this.f2792b = str;
    }

    public void m4422a(int i, int i2, int i3, int i4) {
        try {
            this.f2791a.mo769a("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (Throwable e) {
            C0691b.m3098b("Error occured while dispatching size change.", e);
        }
    }

    public void m4423a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f2791a.mo769a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (Throwable e) {
            C0691b.m3098b("Error occured while obtaining screen information.", e);
        }
    }

    public void m4424b(int i, int i2, int i3, int i4) {
        try {
            this.f2791a.mo769a("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (Throwable e) {
            C0691b.m3098b("Error occured while dispatching default position.", e);
        }
    }

    public void m4425b(String str) {
        try {
            this.f2791a.mo769a("onError", new JSONObject().put("message", str).put("action", this.f2792b));
        } catch (Throwable e) {
            C0691b.m3098b("Error occurred while dispatching error event.", e);
        }
    }

    public void m4426c(String str) {
        try {
            this.f2791a.mo769a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (Throwable e) {
            C0691b.m3098b("Error occured while dispatching ready Event.", e);
        }
    }

    public void m4427d(String str) {
        try {
            this.f2791a.mo769a("onStateChanged", new JSONObject().put("state", str));
        } catch (Throwable e) {
            C0691b.m3098b("Error occured while dispatching state change.", e);
        }
    }
}
