package com.google.android.gms.p028c;

import android.content.Intent;

public class C0804a extends lc {
    private Intent f2352b;

    public C0804a(gu guVar) {
        super(guVar);
    }

    public String getMessage() {
        return this.f2352b != null ? "User needs to (re)enter credentials." : super.getMessage();
    }
}
