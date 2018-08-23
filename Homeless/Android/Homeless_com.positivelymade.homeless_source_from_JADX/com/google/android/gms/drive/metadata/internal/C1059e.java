package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.drive.metadata.C1049f;

public class C1059e extends C1049f<Long> {
    public C1059e(String str, int i) {
        super(str, i);
    }

    protected Long m5329b(Bundle bundle) {
        return Long.valueOf(bundle.getLong(mo828a()));
    }

    protected /* synthetic */ Object mo829c(Bundle bundle) {
        return m5329b(bundle);
    }
}
