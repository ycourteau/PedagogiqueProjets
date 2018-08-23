package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C1241e;
import com.google.android.gms.common.internal.C1246r.C1247a;

public class C1248a extends C1247a {
    int f4320a;
    private Account f4321b;
    private Context f4322c;

    public static Account m6323a(C1246r c1246r) {
        Account account = null;
        if (c1246r != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = c1246r.mo903a();
            } catch (RemoteException e) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    public Account mo903a() {
        int callingUid = Binder.getCallingUid();
        if (callingUid == this.f4320a) {
            return this.f4321b;
        }
        if (C1241e.m6277a(this.f4322c, callingUid)) {
            this.f4320a = callingUid;
            return this.f4321b;
        }
        throw new SecurityException("Caller is not GooglePlayServices");
    }

    public boolean equals(Object obj) {
        return this == obj ? true : !(obj instanceof C1248a) ? false : this.f4321b.equals(((C1248a) obj).f4321b);
    }
}
