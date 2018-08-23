package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.drive.metadata.C1049f;
import java.util.Collection;

public class C1050a extends C1049f<Boolean> {
    public C1050a(String str, int i) {
        super(str, i);
    }

    public C1050a(String str, Collection<String> collection, Collection<String> collection2, int i) {
        super(str, collection, collection2, i);
    }

    protected Boolean m5323b(Bundle bundle) {
        return Boolean.valueOf(bundle.getBoolean(mo828a()));
    }

    protected /* synthetic */ Object mo829c(Bundle bundle) {
        return m5323b(bundle);
    }
}
