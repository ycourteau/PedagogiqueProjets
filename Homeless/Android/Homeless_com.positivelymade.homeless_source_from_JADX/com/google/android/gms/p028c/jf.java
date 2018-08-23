package com.google.android.gms.p028c;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class jf implements jm {
    private static final Uri f3731a;
    private final LogPrinter f3732b = new LogPrinter(4, "GA/LogCatTransport");

    class C10911 implements Comparator<ji> {
        final /* synthetic */ jf f3730a;

        C10911(jf jfVar) {
            this.f3730a = jfVar;
        }

        public int m5349a(ji jiVar, ji jiVar2) {
            return jiVar.getClass().getCanonicalName().compareTo(jiVar2.getClass().getCanonicalName());
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m5349a((ji) obj, (ji) obj2);
        }
    }

    static {
        Builder builder = new Builder();
        builder.scheme("uri");
        builder.authority("local");
        f3731a = builder.build();
    }

    public Uri mo556a() {
        return f3731a;
    }

    public void mo557a(jg jgVar) {
        List<ji> arrayList = new ArrayList(jgVar.m5358b());
        Collections.sort(arrayList, new C10911(this));
        StringBuilder stringBuilder = new StringBuilder();
        for (ji obj : arrayList) {
            Object obj2 = obj.toString();
            if (!TextUtils.isEmpty(obj2)) {
                if (stringBuilder.length() != 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(obj2);
            }
        }
        this.f3732b.println(stringBuilder.toString());
    }
}
