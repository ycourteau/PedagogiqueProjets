package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.C1048a;
import com.google.android.gms.drive.metadata.C1062g;
import com.google.android.gms.drive.query.internal.C1690f;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.List;

public class C1691c implements C1690f<String> {
    public /* synthetic */ Object mo1114a() {
        return m7927c();
    }

    public /* synthetic */ Object mo1115a(C1048a c1048a) {
        return m7921b(c1048a);
    }

    public /* synthetic */ Object mo1116a(C1048a c1048a, Object obj) {
        return m7922b(c1048a, obj);
    }

    public /* synthetic */ Object mo1117a(C1062g c1062g, Object obj) {
        return m7923b(c1062g, obj);
    }

    public /* synthetic */ Object mo1118a(Operator operator, C1048a c1048a, Object obj) {
        return m7924b(operator, c1048a, obj);
    }

    public /* synthetic */ Object mo1119a(Operator operator, List list) {
        return m7925b(operator, list);
    }

    public /* synthetic */ Object mo1120a(Object obj) {
        return m7926b((String) obj);
    }

    public /* synthetic */ Object mo1121a(String str) {
        return m7928c(str);
    }

    public /* synthetic */ Object mo1122b() {
        return m7929d();
    }

    public String m7921b(C1048a<?> c1048a) {
        return String.format("fieldOnly(%s)", new Object[]{c1048a.mo828a()});
    }

    public <T> String m7922b(C1048a<T> c1048a, T t) {
        return String.format("has(%s,%s)", new Object[]{c1048a.mo828a(), t});
    }

    public <T> String m7923b(C1062g<T> c1062g, T t) {
        return String.format("contains(%s,%s)", new Object[]{c1062g.mo828a(), t});
    }

    public <T> String m7924b(Operator operator, C1048a<T> c1048a, T t) {
        return String.format("cmp(%s,%s,%s)", new Object[]{operator.m7942a(), c1048a.mo828a(), t});
    }

    public String m7925b(Operator operator, List<String> list) {
        StringBuilder stringBuilder = new StringBuilder(operator.m7942a() + "(");
        String str = "";
        for (String str2 : list) {
            stringBuilder.append(str);
            stringBuilder.append(str2);
            str = ",";
        }
        return stringBuilder.append(")").toString();
    }

    public String m7926b(String str) {
        return String.format("not(%s)", new Object[]{str});
    }

    public String m7927c() {
        return "all()";
    }

    public String m7928c(String str) {
        return String.format("fullTextSearch(%s)", new Object[]{str});
    }

    public String m7929d() {
        return "ownedByMe()";
    }
}
