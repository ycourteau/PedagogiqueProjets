package com.google.android.gms.common.api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class C1217r {
    private static final ExecutorService f4217a = Executors.newFixedThreadPool(2);

    public static ExecutorService m6168a() {
        return f4217a;
    }
}
