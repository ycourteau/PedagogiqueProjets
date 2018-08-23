package com.google.android.gms.games.snapshot;

import com.google.android.gms.common.data.C1236a;
import com.google.android.gms.common.data.DataHolder;

public final class C1881c extends C1236a<SnapshotMetadata> {
    public C1881c(DataHolder dataHolder) {
        super(dataHolder);
    }

    public /* synthetic */ Object mo1618a(int i) {
        return m9408b(i);
    }

    public SnapshotMetadata m9408b(int i) {
        return new SnapshotMetadataRef(this.a, i);
    }
}
