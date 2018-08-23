package com.google.android.gms.p028c;

import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.p032d.aj;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

public class ku {
    private String f3917a = "https://www.google-analytics.com";

    private String m5638b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            aj.m7036a("Cannot encode the string: " + str);
            return "";
        }
    }

    public String m5639a(List<kk> list) {
        return this.f3917a + "/gtm/android?" + m5641b((List) list);
    }

    public void m5640a(String str) {
        this.f3917a = str;
        aj.m7040c("The Ctfe server endpoint was changed to: " + str);
    }

    String m5641b(List<kk> list) {
        boolean z = true;
        if (list.size() > 1) {
            z = false;
        }
        C1305x.m6625b(z);
        if (list.isEmpty()) {
            return "";
        }
        kk kkVar = (kk) list.get(0);
        String trim = !kkVar.m5548f().trim().equals("") ? kkVar.m5548f().trim() : "-1";
        StringBuilder stringBuilder = new StringBuilder();
        if (kkVar.m5545c() != null) {
            stringBuilder.append(kkVar.m5545c());
        } else {
            stringBuilder.append("id");
        }
        stringBuilder.append("=").append(m5638b(kkVar.m5543a())).append("&").append("pv").append("=").append(m5638b(trim));
        if (kkVar.m5547e()) {
            stringBuilder.append("&gtm_debug=x");
        }
        return stringBuilder.toString();
    }
}
