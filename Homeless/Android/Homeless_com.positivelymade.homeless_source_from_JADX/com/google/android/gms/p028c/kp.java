package com.google.android.gms.p028c;

import com.google.android.gms.common.internal.C1305x;
import java.util.ArrayList;
import java.util.List;

public class kp {
    private final List<kk> f3861a = new ArrayList();

    public kp m5580a(kk kkVar) {
        C1305x.m6617a((Object) kkVar);
        for (kk a : this.f3861a) {
            if (a.m5543a().equals(kkVar.m5543a())) {
                throw new IllegalArgumentException("The container is already being requested. " + kkVar.m5543a());
            }
        }
        this.f3861a.add(kkVar);
        return this;
    }

    public List<kk> m5581a() {
        return this.f3861a;
    }

    public String m5582b() {
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = 1;
        for (kk kkVar : this.f3861a) {
            if (obj != null) {
                obj = null;
            } else {
                stringBuilder.append("#");
            }
            stringBuilder.append(kkVar.m5543a());
        }
        return stringBuilder.toString();
    }
}
