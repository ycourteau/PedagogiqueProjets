package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C1304w {

    public static final class C1303a {
        private final List<String> f4417a;
        private final Object f4418b;

        private C1303a(Object obj) {
            this.f4418b = C1305x.m6617a(obj);
            this.f4417a = new ArrayList();
        }

        public C1303a m6612a(String str, Object obj) {
            this.f4417a.add(((String) C1305x.m6617a((Object) str)) + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder append = new StringBuilder(100).append(this.f4418b.getClass().getSimpleName()).append('{');
            int size = this.f4417a.size();
            for (int i = 0; i < size; i++) {
                append.append((String) this.f4417a.get(i));
                if (i < size - 1) {
                    append.append(", ");
                }
            }
            return append.append('}').toString();
        }
    }

    public static int m6613a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static C1303a m6614a(Object obj) {
        return new C1303a(obj);
    }

    public static boolean m6615a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
