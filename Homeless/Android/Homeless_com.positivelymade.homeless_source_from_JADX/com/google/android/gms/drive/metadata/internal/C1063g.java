package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.C1062g;
import java.util.Collection;

public class C1063g<T extends Parcelable> extends C1062g<T> {
    public C1063g(String str, Collection<String> collection, Collection<String> collection2, int i) {
        super(str, collection, collection2, i);
    }

    protected Collection<T> mo1113b(Bundle bundle) {
        return bundle.getParcelableArrayList(mo828a());
    }

    protected /* synthetic */ Object mo829c(Bundle bundle) {
        return mo1113b(bundle);
    }
}
