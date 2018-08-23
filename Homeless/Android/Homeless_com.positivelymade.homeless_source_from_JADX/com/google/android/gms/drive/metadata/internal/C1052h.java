package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.C1049f;
import java.util.Collection;

public abstract class C1052h<T extends Parcelable> extends C1049f<T> {
    public C1052h(String str, Collection<String> collection, Collection<String> collection2, int i) {
        super(str, collection, collection2, i);
    }

    protected T m5325b(Bundle bundle) {
        return bundle.getParcelable(mo828a());
    }

    protected /* synthetic */ Object mo829c(Bundle bundle) {
        return m5325b(bundle);
    }
}
