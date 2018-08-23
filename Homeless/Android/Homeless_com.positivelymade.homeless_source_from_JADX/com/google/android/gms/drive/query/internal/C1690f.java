package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.C1048a;
import com.google.android.gms.drive.metadata.C1062g;
import java.util.List;

public interface C1690f<F> {
    F mo1114a();

    F mo1115a(C1048a<?> c1048a);

    <T> F mo1116a(C1048a<T> c1048a, T t);

    <T> F mo1117a(C1062g<T> c1062g, T t);

    <T> F mo1118a(Operator operator, C1048a<T> c1048a, T t);

    F mo1119a(Operator operator, List<F> list);

    F mo1120a(F f);

    F mo1121a(String str);

    F mo1122b();
}
