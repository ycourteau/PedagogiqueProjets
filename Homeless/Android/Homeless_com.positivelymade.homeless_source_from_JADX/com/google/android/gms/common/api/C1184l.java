package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

public abstract class C1184l implements C0870f, C0774g {
    protected final Status f4131a;
    protected final DataHolder f4132b;

    protected C1184l(DataHolder dataHolder, Status status) {
        this.f4131a = status;
        this.f4132b = dataHolder;
    }

    public Status mo558a() {
        return this.f4131a;
    }

    public void mo627b() {
        if (this.f4132b != null) {
            this.f4132b.m6251i();
        }
    }
}
