package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.p028c.in;

public abstract class GamesDowngradeableSafeParcel extends DowngradeableSafeParcel {
    protected static boolean m8215b(Integer num) {
        return num == null ? false : in.m5274a(num.intValue());
    }
}
