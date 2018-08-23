package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.C1173a;
import com.google.android.gms.common.api.C1180c.C1176a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.C1917e;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class C1266h {
    private final Account f4349a;
    private final Set<Scope> f4350b;
    private final Set<Scope> f4351c;
    private final Map<C1173a<?>, C1265a> f4352d;
    private final int f4353e;
    private final View f4354f;
    private final String f4355g;
    private final String f4356h;
    private final C1917e f4357i;
    private Integer f4358j;

    public static final class C1265a {
        public final Set<Scope> f4347a;
        public final boolean f4348b;
    }

    public C1266h(Account account, Set<Scope> set, Map<C1173a<?>, C1265a> map, int i, View view, String str, String str2, C1917e c1917e) {
        Map map2;
        this.f4349a = account;
        this.f4350b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        if (map == null) {
            map2 = Collections.EMPTY_MAP;
        }
        this.f4352d = map2;
        this.f4354f = view;
        this.f4353e = i;
        this.f4355g = str;
        this.f4356h = str2;
        this.f4357i = c1917e;
        Set hashSet = new HashSet(this.f4350b);
        for (C1265a c1265a : this.f4352d.values()) {
            hashSet.addAll(c1265a.f4347a);
        }
        this.f4351c = Collections.unmodifiableSet(hashSet);
    }

    public static C1266h m6363a(Context context) {
        return new C1176a(context).m5995a();
    }

    public Account m6364a() {
        return this.f4349a;
    }

    public Set<Scope> m6365a(C1173a<?> c1173a) {
        C1265a c1265a = (C1265a) this.f4352d.get(c1173a);
        if (c1265a == null || c1265a.f4347a.isEmpty()) {
            return this.f4350b;
        }
        Set<Scope> hashSet = new HashSet(this.f4350b);
        hashSet.addAll(c1265a.f4347a);
        return hashSet;
    }

    public void m6366a(Integer num) {
        this.f4358j = num;
    }

    public Account m6367b() {
        return this.f4349a != null ? this.f4349a : new Account("<<default account>>", "com.google");
    }

    public int m6368c() {
        return this.f4353e;
    }

    public Set<Scope> m6369d() {
        return this.f4350b;
    }

    public Set<Scope> m6370e() {
        return this.f4351c;
    }

    public Map<C1173a<?>, C1265a> m6371f() {
        return this.f4352d;
    }

    public String m6372g() {
        return this.f4355g;
    }

    public String m6373h() {
        return this.f4356h;
    }

    public View m6374i() {
        return this.f4354f;
    }

    public C1917e m6375j() {
        return this.f4357i;
    }

    public Integer m6376k() {
        return this.f4358j;
    }
}
