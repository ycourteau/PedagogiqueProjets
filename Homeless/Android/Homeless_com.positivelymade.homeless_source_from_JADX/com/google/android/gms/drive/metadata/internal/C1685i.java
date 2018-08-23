package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.C1681b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class C1685i extends C1063g<DriveId> implements C1681b<DriveId> {
    public C1685i(int i) {
        super("parents", Collections.emptySet(), Arrays.asList(new String[]{"parentsExtra", "dbInstanceId", "parentsExtraHolder"}), i);
    }

    protected Collection<DriveId> mo1113b(Bundle bundle) {
        Collection b = super.mo1113b(bundle);
        return b == null ? null : new HashSet(b);
    }

    protected /* synthetic */ Object mo829c(Bundle bundle) {
        return mo1113b(bundle);
    }
}
