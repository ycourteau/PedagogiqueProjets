package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.request.C0647c.C0643a;
import com.google.android.gms.ads.internal.request.C0658k.C0659a;
import java.lang.ref.WeakReference;

public final class C0660g extends C0659a {
    private final WeakReference<C0643a> f1946a;

    public C0660g(C0643a c0643a) {
        this.f1946a = new WeakReference(c0643a);
    }

    public void mo518a(AdResponseParcel adResponseParcel) {
        C0643a c0643a = (C0643a) this.f1946a.get();
        if (c0643a != null) {
            c0643a.mo499a(adResponseParcel);
        }
    }
}
