package com.google.android.gms.p032d;

import android.content.Context;
import com.google.android.gms.analytics.C0713f.C0712b;
import com.google.android.gms.analytics.C0719h;
import com.google.android.gms.analytics.p031a.C0697a;
import com.google.android.gms.analytics.p031a.C0698b;
import com.google.android.gms.analytics.p031a.C0699c;
import com.google.android.gms.p028c.C0914e;
import com.google.android.gms.p028c.C0934f;
import com.google.android.gms.p028c.C1010h.C1009a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ck extends ch {
    private static final String f4839a = C0914e.UNIVERSAL_ANALYTICS.toString();
    private static final String f4840b = C0934f.ACCOUNT.toString();
    private static final String f4841c = C0934f.ANALYTICS_PASS_THROUGH.toString();
    private static final String f4842d = C0934f.ENABLE_ECOMMERCE.toString();
    private static final String f4843e = C0934f.ECOMMERCE_USE_DATA_LAYER.toString();
    private static final String f4844f = C0934f.ECOMMERCE_MACRO_DATA.toString();
    private static final String f4845g = C0934f.ANALYTICS_FIELDS.toString();
    private static final String f4846h = C0934f.TRACK_TRANSACTION.toString();
    private static final String f4847i = C0934f.TRANSACTION_DATALAYER_MAP.toString();
    private static final String f4848j = C0934f.TRANSACTION_ITEM_DATALAYER_MAP.toString();
    private static final List<String> f4849k = Arrays.asList(new String[]{"detail", "checkout", "checkout_option", "click", "add", "remove", "purchase", "refund"});
    private static final Pattern f4850l = Pattern.compile("dimension(\\d+)");
    private static final Pattern f4851m = Pattern.compile("metric(\\d+)");
    private static Map<String, String> f4852n;
    private static Map<String, String> f4853o;
    private final Set<String> f4854p;
    private final cg f4855q;
    private final C1585c f4856r;

    public ck(Context context, C1585c c1585c) {
        this(context, c1585c, new cg(context));
    }

    ck(Context context, C1585c c1585c, cg cgVar) {
        super(f4839a, new String[0]);
        this.f4856r = c1585c;
        this.f4855q = cgVar;
        this.f4854p = new HashSet();
        this.f4854p.add("");
        this.f4854p.add("0");
        this.f4854p.add("false");
    }

    private C0698b m7340a(String str, Map<String, Object> map) {
        C0698b c0698b = new C0698b(str);
        Object obj = map.get("id");
        if (obj != null) {
            c0698b.m3125a(String.valueOf(obj));
        }
        obj = map.get("affiliation");
        if (obj != null) {
            c0698b.m3129b(String.valueOf(obj));
        }
        obj = map.get("coupon");
        if (obj != null) {
            c0698b.m3131c(String.valueOf(obj));
        }
        obj = map.get("list");
        if (obj != null) {
            c0698b.m3133e(String.valueOf(obj));
        }
        obj = map.get("option");
        if (obj != null) {
            c0698b.m3132d(String.valueOf(obj));
        }
        obj = map.get("revenue");
        if (obj != null) {
            c0698b.m3123a(m7341a(obj).doubleValue());
        }
        obj = map.get("tax");
        if (obj != null) {
            c0698b.m3128b(m7341a(obj).doubleValue());
        }
        obj = map.get("shipping");
        if (obj != null) {
            c0698b.m3130c(m7341a(obj).doubleValue());
        }
        obj = map.get("step");
        if (obj != null) {
            c0698b.m3124a(m7347b(obj).intValue());
        }
        return c0698b;
    }

    private Double m7341a(Object obj) {
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Cannot convert the object to Double: " + e.getMessage());
            }
        } else if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        } else {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            throw new RuntimeException("Cannot convert the object to Double: " + obj.toString());
        }
    }

    private String m7342a(String str) {
        Object c = this.f4856r.m7275c(str);
        return c == null ? null : c.toString();
    }

    private Map<String, String> m7343a(C1009a c1009a) {
        Object e = cj.m7333e(c1009a);
        if (!(e instanceof Map)) {
            return null;
        }
        Map map = (Map) e;
        Map<String, String> linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    private void m7344a(C0719h c0719h, Map<String, C1009a> map) {
        String a = m7342a("transactionId");
        if (a == null) {
            aj.m7036a("Cannot find transactionId in data layer.");
            return;
        }
        List<Map> linkedList = new LinkedList();
        try {
            Map b = m7349b((C1009a) map.get(f4845g));
            b.put("&t", "transaction");
            for (Entry entry : m7353e(map).entrySet()) {
                m7345a(b, (String) entry.getValue(), m7342a((String) entry.getKey()));
            }
            linkedList.add(b);
            List<Map> b2 = m7348b("transactionProducts");
            if (b2 != null) {
                for (Map map2 : b2) {
                    if (map2.get("name") == null) {
                        aj.m7036a("Unable to send transaction item hit due to missing 'name' field.");
                        return;
                    }
                    Map b3 = m7349b((C1009a) map.get(f4845g));
                    b3.put("&t", "item");
                    b3.put("&ti", a);
                    for (Entry entry2 : m7354f(map).entrySet()) {
                        m7345a(b3, (String) entry2.getValue(), (String) map2.get(entry2.getKey()));
                    }
                    linkedList.add(b3);
                }
            }
            for (Map map22 : linkedList) {
                c0719h.m3250a(map22);
            }
        } catch (Throwable e) {
            aj.m7037a("Unable to send transaction", e);
        }
    }

    private void m7345a(Map<String, String> map, String str, String str2) {
        if (str2 != null) {
            map.put(str, str2);
        }
    }

    private boolean m7346a(Map<String, C1009a> map, String str) {
        C1009a c1009a = (C1009a) map.get(str);
        return c1009a == null ? false : cj.m7330d(c1009a).booleanValue();
    }

    private Integer m7347b(Object obj) {
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Cannot convert the object to Integer: " + e.getMessage());
            }
        } else if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        } else {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            throw new RuntimeException("Cannot convert the object to Integer: " + obj.toString());
        }
    }

    private List<Map<String, String>> m7348b(String str) {
        Object c = this.f4856r.m7275c(str);
        if (c == null) {
            return null;
        }
        if (c instanceof List) {
            for (Object obj : (List) c) {
                if (!(obj instanceof Map)) {
                    throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
                }
            }
            return (List) c;
        }
        throw new IllegalArgumentException("transactionProducts should be of type List.");
    }

    private Map<String, String> m7349b(C1009a c1009a) {
        if (c1009a == null) {
            return new HashMap();
        }
        Map<String, String> a = m7343a(c1009a);
        if (a == null) {
            return new HashMap();
        }
        String str = (String) a.get("&aip");
        if (str != null && this.f4854p.contains(str.toLowerCase())) {
            a.remove("&aip");
        }
        return a;
    }

    private void m7350b(C0719h c0719h, Map<String, C1009a> map) {
        Object c;
        Map map2;
        C0712b c0712b = new C0712b();
        Map b = m7349b((C1009a) map.get(f4845g));
        c0712b.m3183a(b);
        if (m7346a((Map) map, f4843e)) {
            c = this.f4856r.m7275c("ecommerce");
            map2 = c instanceof Map ? (Map) c : null;
        } else {
            c = cj.m7333e((C1009a) map.get(f4844f));
            map2 = c instanceof Map ? (Map) c : null;
        }
        if (map2 != null) {
            Map map3;
            List<Map> list;
            String str = (String) b.get("&cu");
            if (str == null) {
                str = (String) map2.get("currencyCode");
            }
            if (str != null) {
                c0712b.m3182a("&cu", str);
            }
            c = map2.get("impressions");
            if (c instanceof List) {
                for (Map map4 : (List) c) {
                    try {
                        c0712b.m3179a(m7352d(map4), (String) map4.get("list"));
                    } catch (RuntimeException e) {
                        aj.m7036a("Failed to extract a product from DataLayer. " + e.getMessage());
                    }
                }
            }
            List list2 = map2.containsKey("promoClick") ? (List) ((Map) map2.get("promoClick")).get("promotions") : map2.containsKey("promoView") ? (List) ((Map) map2.get("promoView")).get("promotions") : null;
            if (r0 != null) {
                for (Map map42 : r0) {
                    try {
                        c0712b.m3181a(m7351c(map42));
                    } catch (RuntimeException e2) {
                        aj.m7036a("Failed to extract a promotion from DataLayer. " + e2.getMessage());
                    }
                }
                if (map2.containsKey("promoClick")) {
                    c0712b.m3182a("&promoa", "click");
                    c = null;
                    if (c != null) {
                        for (String str2 : f4849k) {
                            if (map2.containsKey(str2)) {
                                map3 = (Map) map2.get(str2);
                                list = (List) map3.get("products");
                                if (list != null) {
                                    for (Map map22 : list) {
                                        try {
                                            c0712b.m3178a(m7352d(map22));
                                        } catch (RuntimeException e3) {
                                            aj.m7036a("Failed to extract a product from DataLayer. " + e3.getMessage());
                                        }
                                    }
                                }
                                try {
                                    c0712b.m3180a(map3.containsKey("actionField") ? m7340a(str2, (Map) map3.get("actionField")) : new C0698b(str2));
                                } catch (RuntimeException e22) {
                                    aj.m7036a("Failed to extract a product action from DataLayer. " + e22.getMessage());
                                }
                            }
                        }
                    }
                } else {
                    c0712b.m3182a("&promoa", "view");
                }
            }
            int i = 1;
            if (c != null) {
                for (String str22 : f4849k) {
                    if (map22.containsKey(str22)) {
                        map3 = (Map) map22.get(str22);
                        list = (List) map3.get("products");
                        if (list != null) {
                            while (r4.hasNext()) {
                                c0712b.m3178a(m7352d(map22));
                            }
                        }
                        if (map3.containsKey("actionField")) {
                        }
                        c0712b.m3180a(map3.containsKey("actionField") ? m7340a(str22, (Map) map3.get("actionField")) : new C0698b(str22));
                    }
                }
            }
        }
        c0719h.m3250a(c0712b.mo539a());
    }

    private C0699c m7351c(Map<String, String> map) {
        C0699c c0699c = new C0699c();
        String str = (String) map.get("id");
        if (str != null) {
            c0699c.m3134a(String.valueOf(str));
        }
        str = (String) map.get("name");
        if (str != null) {
            c0699c.m3136b(String.valueOf(str));
        }
        str = (String) map.get("creative");
        if (str != null) {
            c0699c.m3137c(String.valueOf(str));
        }
        str = (String) map.get("position");
        if (str != null) {
            c0699c.m3138d(String.valueOf(str));
        }
        return c0699c;
    }

    private C0697a m7352d(Map<String, Object> map) {
        C0697a c0697a = new C0697a();
        Object obj = map.get("id");
        if (obj != null) {
            c0697a.m3114a(String.valueOf(obj));
        }
        obj = map.get("name");
        if (obj != null) {
            c0697a.m3117b(String.valueOf(obj));
        }
        obj = map.get("brand");
        if (obj != null) {
            c0697a.m3118c(String.valueOf(obj));
        }
        obj = map.get("category");
        if (obj != null) {
            c0697a.m3119d(String.valueOf(obj));
        }
        obj = map.get("variant");
        if (obj != null) {
            c0697a.m3120e(String.valueOf(obj));
        }
        obj = map.get("coupon");
        if (obj != null) {
            c0697a.m3121f(String.valueOf(obj));
        }
        obj = map.get("position");
        if (obj != null) {
            c0697a.m3111a(m7347b(obj).intValue());
        }
        obj = map.get("price");
        if (obj != null) {
            c0697a.m3110a(m7341a(obj).doubleValue());
        }
        obj = map.get("quantity");
        if (obj != null) {
            c0697a.m3116b(m7347b(obj).intValue());
        }
        for (String str : map.keySet()) {
            Matcher matcher = f4850l.matcher(str);
            if (matcher.matches()) {
                try {
                    c0697a.m3113a(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(str)));
                } catch (NumberFormatException e) {
                    aj.m7038b("illegal number in custom dimension value: " + str);
                }
            } else {
                matcher = f4851m.matcher(str);
                if (matcher.matches()) {
                    try {
                        c0697a.m3112a(Integer.parseInt(matcher.group(1)), m7347b(map.get(str)).intValue());
                    } catch (NumberFormatException e2) {
                        aj.m7038b("illegal number in custom metric value: " + str);
                    }
                }
            }
        }
        return c0697a;
    }

    private Map<String, String> m7353e(Map<String, C1009a> map) {
        C1009a c1009a = (C1009a) map.get(f4847i);
        if (c1009a != null) {
            return m7343a(c1009a);
        }
        if (f4852n == null) {
            Map hashMap = new HashMap();
            hashMap.put("transactionId", "&ti");
            hashMap.put("transactionAffiliation", "&ta");
            hashMap.put("transactionTax", "&tt");
            hashMap.put("transactionShipping", "&ts");
            hashMap.put("transactionTotal", "&tr");
            hashMap.put("transactionCurrency", "&cu");
            f4852n = hashMap;
        }
        return f4852n;
    }

    private Map<String, String> m7354f(Map<String, C1009a> map) {
        C1009a c1009a = (C1009a) map.get(f4848j);
        if (c1009a != null) {
            return m7343a(c1009a);
        }
        if (f4853o == null) {
            Map hashMap = new HashMap();
            hashMap.put("name", "&in");
            hashMap.put("sku", "&ic");
            hashMap.put("category", "&iv");
            hashMap.put("price", "&ip");
            hashMap.put("quantity", "&iq");
            hashMap.put("currency", "&cu");
            f4853o = hashMap;
        }
        return f4853o;
    }

    public /* bridge */ /* synthetic */ boolean mo973a() {
        return super.mo973a();
    }

    public /* bridge */ /* synthetic */ String mo976b() {
        return super.mo976b();
    }

    public void mo1030b(Map<String, C1009a> map) {
        C0719h a = this.f4855q.m7304a("_GTM_DEFAULT_TRACKER_");
        a.m3251a(m7346a((Map) map, "collect_adid"));
        if (m7346a((Map) map, f4842d)) {
            m7350b(a, map);
        } else if (m7346a((Map) map, f4841c)) {
            a.m3250a(m7349b((C1009a) map.get(f4845g)));
        } else if (m7346a((Map) map, f4846h)) {
            m7344a(a, (Map) map);
        } else {
            aj.m7038b("Ignoring unknown tag.");
        }
    }

    public /* bridge */ /* synthetic */ Set mo977c() {
        return super.mo977c();
    }
}
