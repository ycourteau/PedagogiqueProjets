package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.internal.C1305x;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class C1049f<T> implements C1048a<T> {
    private final String f3613a;
    private final Set<String> f3614b;
    private final Set<String> f3615c;
    private final int f3616d;

    protected C1049f(String str, int i) {
        this.f3613a = (String) C1305x.m6618a((Object) str, (Object) "fieldName");
        this.f3614b = Collections.singleton(str);
        this.f3615c = Collections.emptySet();
        this.f3616d = i;
    }

    protected C1049f(String str, Collection<String> collection, Collection<String> collection2, int i) {
        this.f3613a = (String) C1305x.m6618a((Object) str, (Object) "fieldName");
        this.f3614b = Collections.unmodifiableSet(new HashSet(collection));
        this.f3615c = Collections.unmodifiableSet(new HashSet(collection2));
        this.f3616d = i;
    }

    public final T mo827a(Bundle bundle) {
        C1305x.m6618a((Object) bundle, (Object) "bundle");
        return bundle.get(mo828a()) != null ? mo829c(bundle) : null;
    }

    public final String mo828a() {
        return this.f3613a;
    }

    protected abstract T mo829c(Bundle bundle);

    public String toString() {
        return this.f3613a;
    }
}
