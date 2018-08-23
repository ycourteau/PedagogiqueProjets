package com.google.android.gms.p028c;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1305x;
import java.util.Set;

public final class iu {
    public static String[] m5300a(Set<Scope> set) {
        C1305x.m6618a((Object) set, (Object) "scopes can't be null.");
        return iu.m5301a((Scope[]) set.toArray(new Scope[set.size()]));
    }

    public static String[] m5301a(Scope[] scopeArr) {
        C1305x.m6618a((Object) scopeArr, (Object) "scopes can't be null.");
        String[] strArr = new String[scopeArr.length];
        for (int i = 0; i < scopeArr.length; i++) {
            strArr[i] = scopeArr[i].m5965a();
        }
        return strArr;
    }
}
