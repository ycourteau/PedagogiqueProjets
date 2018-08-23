package com.google.android.gms.p028c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.C0618p;

@fn
public class gl extends Handler {
    public gl(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Throwable e) {
            C0618p.m2799h().m4781a(e, false);
            throw e;
        }
    }
}
