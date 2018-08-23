package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.drive.metadata.C1083h;
import java.util.Date;

public class C1084b extends C1083h<Date> {
    public C1084b(String str, int i) {
        super(str, i);
    }

    protected Date m5347b(Bundle bundle) {
        return new Date(bundle.getLong(mo828a()));
    }

    protected /* synthetic */ Object mo829c(Bundle bundle) {
        return m5347b(bundle);
    }
}
