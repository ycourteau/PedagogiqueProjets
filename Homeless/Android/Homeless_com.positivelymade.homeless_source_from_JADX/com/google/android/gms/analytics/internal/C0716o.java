package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.C0710e;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p028c.ik;
import com.google.android.gms.p028c.jk;

public class C0716o {
    private final C0750r f2036a;

    protected C0716o(C0750r c0750r) {
        C1305x.m6617a((Object) c0750r);
        this.f2036a = c0750r;
    }

    private static String mo553a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Boolean)) {
            return obj instanceof Throwable ? ((Throwable) obj).toString() : obj.toString();
        } else {
            return obj == Boolean.TRUE ? "true" : "false";
        }
    }

    private void mo554a(int i, String str, Object obj, Object obj2, Object obj3) {
        C0733g c0733g = null;
        if (this.f2036a != null) {
            c0733g = this.f2036a.m3495g();
        }
        if (c0733g != null) {
            c0733g.mo554a(i, str, obj, obj2, obj3);
            return;
        }
        String str2 = (String) ak.f2097c.m3343a();
        if (Log.isLoggable(str2, i)) {
            Log.println(i, str2, C0716o.m3192c(str, obj, obj2, obj3));
        }
    }

    protected static String m3192c(String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            Object obj4 = "";
        }
        Object a = C0716o.mo553a(obj);
        Object a2 = C0716o.mo553a(obj2);
        Object a3 = C0716o.mo553a(obj3);
        StringBuilder stringBuilder = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(obj4)) {
            stringBuilder.append(obj4);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(a)) {
            stringBuilder.append(str2);
            stringBuilder.append(a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a2)) {
            stringBuilder.append(str2);
            stringBuilder.append(a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a3)) {
            stringBuilder.append(str2);
            stringBuilder.append(a3);
            str2 = ", ";
        }
        return stringBuilder.toString();
    }

    protected ag m3193A() {
        return this.f2036a.m3506r();
    }

    public boolean m3194B() {
        return Log.isLoggable((String) ak.f2097c.m3343a(), 2);
    }

    public void m3195a(String str, Object obj) {
        mo554a(2, str, obj, null, null);
    }

    public void m3196a(String str, Object obj, Object obj2) {
        mo554a(2, str, obj, obj2, null);
    }

    public void m3197a(String str, Object obj, Object obj2, Object obj3) {
        mo554a(3, str, obj, obj2, obj3);
    }

    public void m3198b(String str) {
        mo554a(2, str, null, null, null);
    }

    public void m3199b(String str, Object obj) {
        mo554a(3, str, obj, null, null);
    }

    public void m3200b(String str, Object obj, Object obj2) {
        mo554a(3, str, obj, obj2, null);
    }

    public void m3201b(String str, Object obj, Object obj2, Object obj3) {
        mo554a(5, str, obj, obj2, obj3);
    }

    public void m3202c(String str) {
        mo554a(3, str, null, null, null);
    }

    public void m3203c(String str, Object obj) {
        mo554a(4, str, obj, null, null);
    }

    public void m3204c(String str, Object obj, Object obj2) {
        mo554a(5, str, obj, obj2, null);
    }

    public void m3205d(String str) {
        mo554a(4, str, null, null, null);
    }

    public void m3206d(String str, Object obj) {
        mo554a(5, str, obj, null, null);
    }

    public void m3207d(String str, Object obj, Object obj2) {
        mo554a(6, str, obj, obj2, null);
    }

    public void m3208e(String str) {
        mo554a(5, str, null, null, null);
    }

    public void m3209e(String str, Object obj) {
        mo554a(6, str, obj, null, null);
    }

    public void m3210f(String str) {
        mo554a(6, str, null, null, null);
    }

    public C0750r m3211k() {
        return this.f2036a;
    }

    protected void m3212l() {
        if (m3217q().m3282a()) {
            throw new IllegalStateException("Call only supported on the client side");
        }
    }

    protected void m3213m() {
        this.f2036a.m3507s();
    }

    protected ik m3214n() {
        return this.f2036a.m3492d();
    }

    protected Context m3215o() {
        return this.f2036a.m3490b();
    }

    protected C0733g m3216p() {
        return this.f2036a.m3494f();
    }

    protected ad m3217q() {
        return this.f2036a.m3493e();
    }

    protected jk m3218r() {
        return this.f2036a.m3496h();
    }

    public C0710e m3219s() {
        return this.f2036a.m3499k();
    }

    protected C0747n m3220t() {
        return this.f2036a.m3497i();
    }

    protected ah m3221u() {
        return this.f2036a.m3498j();
    }

    protected C0742m m3222v() {
        return this.f2036a.m3500l();
    }

    protected C0739j m3223w() {
        return this.f2036a.m3501m();
    }

    protected C0770z m3224x() {
        return this.f2036a.m3504p();
    }

    protected C0721a m3225y() {
        return this.f2036a.m3503o();
    }

    protected C0760w m3226z() {
        return this.f2036a.m3505q();
    }
}
