package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.drive.metadata.C1062g;
import java.util.Collection;
import java.util.Collections;

public class C1686j extends C1062g<String> {
    public C1686j(String str, int i) {
        super(str, Collections.singleton(str), Collections.emptySet(), i);
    }

    protected Collection<String> m7892b(Bundle bundle) {
        return bundle.getStringArrayList(mo828a());
    }

    protected /* synthetic */ Object mo829c(Bundle bundle) {
        return m7892b(bundle);
    }
}
