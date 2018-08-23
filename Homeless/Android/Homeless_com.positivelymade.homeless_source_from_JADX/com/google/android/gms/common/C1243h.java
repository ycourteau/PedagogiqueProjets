package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class C1243h implements ServiceConnection {
    boolean f4288a = false;
    private final BlockingQueue<IBinder> f4289b = new LinkedBlockingQueue();

    public IBinder m6297a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
        } else if (this.f4288a) {
            throw new IllegalStateException();
        } else {
            this.f4288a = true;
            return (IBinder) this.f4289b.take();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f4289b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
