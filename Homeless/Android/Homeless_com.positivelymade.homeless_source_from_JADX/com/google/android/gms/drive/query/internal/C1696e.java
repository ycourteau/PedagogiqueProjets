package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.C1048a;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Set;

class C1696e {
    static C1048a<?> m7956a(MetadataBundle metadataBundle) {
        Set a = metadataBundle.m7882a();
        if (a.size() == 1) {
            return (C1048a) a.iterator().next();
        }
        throw new IllegalArgumentException("bundle should have exactly 1 populated field");
    }
}
