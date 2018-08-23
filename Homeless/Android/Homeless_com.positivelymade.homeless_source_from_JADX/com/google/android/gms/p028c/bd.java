package com.google.android.gms.p028c;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.C0691b;

public class bd {
    public bc m3911a(ba baVar) {
        if (baVar == null) {
            throw new IllegalArgumentException("CSI configuration can't be null. ");
        } else if (!baVar.m3897a()) {
            C0691b.m3101d("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
            return null;
        } else if (baVar.m3899c() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(baVar.m3900d())) {
            return new bc(baVar.m3899c(), baVar.m3900d(), baVar.m3898b(), baVar.m3901e());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
