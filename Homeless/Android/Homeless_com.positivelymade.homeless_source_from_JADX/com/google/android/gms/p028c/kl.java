package com.google.android.gms.p028c;

import com.google.android.gms.p028c.C1010h.C1009a;
import com.google.android.gms.p028c.kr.C1115a;
import com.google.android.gms.p028c.kr.C1116b;
import com.google.android.gms.p028c.kr.C1117c;
import com.google.android.gms.p028c.kr.C1118d;
import com.google.android.gms.p028c.kr.C1119e;
import com.google.android.gms.p028c.kr.C1120f;
import com.google.android.gms.p028c.kr.C1121g;
import com.google.android.gms.p032d.aj;
import com.google.android.gms.p032d.cj;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class kl {
    static C1009a m5549a(int i, JSONArray jSONArray, C1009a[] c1009aArr, Set<Integer> set) {
        int i2 = 0;
        if (set.contains(Integer.valueOf(i))) {
            kl.m5557b("Value cycle detected. Current value reference: " + i + "." + "  Previous value references: " + set + ".");
        }
        Object a = kl.m5553a(jSONArray, i, "values");
        if (c1009aArr[i] != null) {
            return c1009aArr[i];
        }
        set.add(Integer.valueOf(i));
        C1009a c1009a = new C1009a();
        JSONArray jSONArray2;
        if (a instanceof JSONArray) {
            jSONArray2 = (JSONArray) a;
            c1009a.f3436a = 2;
            c1009a.f3447l = true;
            c1009a.f3438c = new C1009a[jSONArray2.length()];
            while (i2 < c1009a.f3438c.length) {
                c1009a.f3438c[i2] = kl.m5549a(jSONArray2.getInt(i2), jSONArray, c1009aArr, (Set) set);
                i2++;
            }
        } else if (a instanceof JSONObject) {
            int i3;
            JSONObject jSONObject = (JSONObject) a;
            JSONArray optJSONArray = jSONObject.optJSONArray("escaping");
            if (optJSONArray != null) {
                c1009a.f3446k = new int[optJSONArray.length()];
                for (i3 = 0; i3 < c1009a.f3446k.length; i3++) {
                    c1009a.f3446k[i3] = optJSONArray.getInt(i3);
                }
            }
            if (jSONObject.has("function_id")) {
                c1009a.f3436a = 5;
                c1009a.f3442g = jSONObject.getString("function_id");
            } else if (jSONObject.has("macro_reference")) {
                c1009a.f3436a = 4;
                c1009a.f3447l = true;
                c1009a.f3441f = cj.m7319a(kl.m5549a(jSONObject.getInt("macro_reference"), jSONArray, c1009aArr, (Set) set));
            } else if (jSONObject.has("template_token")) {
                c1009a.f3436a = 7;
                c1009a.f3447l = true;
                jSONArray2 = jSONObject.getJSONArray("template_token");
                c1009a.f3445j = new C1009a[jSONArray2.length()];
                while (i2 < c1009a.f3445j.length) {
                    c1009a.f3445j[i2] = kl.m5549a(jSONArray2.getInt(i2), jSONArray, c1009aArr, (Set) set);
                    i2++;
                }
            } else {
                c1009a.f3436a = 3;
                c1009a.f3447l = true;
                i3 = jSONObject.length();
                c1009a.f3439d = new C1009a[i3];
                c1009a.f3440e = new C1009a[i3];
                Iterator keys = jSONObject.keys();
                i3 = 0;
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    c1009a.f3439d[i3] = kl.m5549a(new Integer(str).intValue(), jSONArray, c1009aArr, (Set) set);
                    c1009a.f3440e[i3] = kl.m5549a(jSONObject.getInt(str), jSONArray, c1009aArr, (Set) set);
                    i3++;
                }
            }
        } else if (a instanceof String) {
            c1009a.f3437b = (String) a;
            c1009a.f3436a = 1;
        } else if (a instanceof Boolean) {
            c1009a.f3444i = ((Boolean) a).booleanValue();
            c1009a.f3436a = 8;
        } else if (a instanceof Integer) {
            c1009a.f3443h = (long) ((Integer) a).intValue();
            c1009a.f3436a = 6;
        } else {
            kl.m5557b("Invalid value type: " + a);
        }
        c1009aArr[i] = c1009a;
        set.remove(Integer.valueOf(i));
        return c1009a;
    }

    static C1115a m5550a(JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2, C1009a[] c1009aArr, int i) {
        C1116b a = C1115a.m5591a();
        JSONArray jSONArray3 = jSONObject.getJSONArray("property");
        for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
            JSONObject jSONObject2 = (JSONObject) kl.m5553a(jSONArray, jSONArray3.getInt(i2), "properties");
            String str = (String) kl.m5553a(jSONArray2, jSONObject2.getInt("key"), "key");
            C1009a c1009a = (C1009a) kl.m5554a((Object[]) c1009aArr, jSONObject2.getInt("value"), "value");
            if (C0934f.PUSH_AFTER_EVALUATE.toString().equals(str)) {
                a.m5596a(c1009a);
            } else {
                a.m5597a(str, c1009a);
            }
        }
        return a.m5595a();
    }

    static C1117c m5551a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        Object obj = jSONObject.get("resource");
        if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            C1118d a = C1117c.m5598a();
            C1009a[] a2 = kl.m5556a(jSONObject2);
            JSONArray jSONArray = jSONObject2.getJSONArray("properties");
            JSONArray jSONArray2 = jSONObject2.getJSONArray("key");
            List a3 = kl.m5555a(jSONObject2.getJSONArray("tags"), jSONArray, jSONArray2, a2);
            List a4 = kl.m5555a(jSONObject2.getJSONArray("predicates"), jSONArray, jSONArray2, a2);
            List<C1115a> a5 = kl.m5555a(jSONObject2.getJSONArray("macros"), jSONArray, jSONArray2, a2);
            for (C1115a a6 : a5) {
                a.m5604a(a6);
            }
            jSONArray = jSONObject2.getJSONArray("rules");
            for (int i = 0; i < jSONArray.length(); i++) {
                a.m5605a(kl.m5552a(jSONArray.getJSONObject(i), a3, (List) a5, a4, a2));
            }
            a.m5606a("1");
            a.m5603a(1);
            if (jSONObject.optJSONArray("runtime") != null) {
            }
            return a.m5602a();
        }
        throw new C1121g("Resource map not found");
    }

    static C1119e m5552a(JSONObject jSONObject, List<C1115a> list, List<C1115a> list2, List<C1115a> list3, C1009a[] c1009aArr) {
        int i;
        int i2;
        C1120f a = C1119e.m5607a();
        JSONArray optJSONArray = jSONObject.optJSONArray("positive_predicate");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("negative_predicate");
        JSONArray optJSONArray3 = jSONObject.optJSONArray("add_tag");
        JSONArray optJSONArray4 = jSONObject.optJSONArray("remove_tag");
        JSONArray optJSONArray5 = jSONObject.optJSONArray("add_tag_rule_name");
        JSONArray optJSONArray6 = jSONObject.optJSONArray("remove_tag_rule_name");
        JSONArray optJSONArray7 = jSONObject.optJSONArray("add_macro");
        JSONArray optJSONArray8 = jSONObject.optJSONArray("remove_macro");
        JSONArray optJSONArray9 = jSONObject.optJSONArray("add_macro_rule_name");
        JSONArray optJSONArray10 = jSONObject.optJSONArray("remove_macro_rule_name");
        if (optJSONArray != null) {
            for (i = 0; i < optJSONArray.length(); i++) {
                a.m5619a((C1115a) list3.get(optJSONArray.getInt(i)));
            }
        }
        if (optJSONArray2 != null) {
            for (i = 0; i < optJSONArray2.length(); i++) {
                a.m5621b((C1115a) list3.get(optJSONArray2.getInt(i)));
            }
        }
        if (optJSONArray3 != null) {
            for (i = 0; i < optJSONArray3.length(); i++) {
                a.m5623c((C1115a) list.get(optJSONArray3.getInt(i)));
            }
        }
        if (optJSONArray4 != null) {
            for (i = 0; i < optJSONArray4.length(); i++) {
                a.m5625d((C1115a) list.get(optJSONArray4.getInt(i)));
            }
        }
        if (optJSONArray5 != null) {
            for (i2 = 0; i2 < optJSONArray5.length(); i2++) {
                a.m5620a(c1009aArr[optJSONArray5.getInt(i2)].f3437b);
            }
        }
        if (optJSONArray6 != null) {
            for (i2 = 0; i2 < optJSONArray6.length(); i2++) {
                a.m5622b(c1009aArr[optJSONArray6.getInt(i2)].f3437b);
            }
        }
        if (optJSONArray7 != null) {
            for (i = 0; i < optJSONArray7.length(); i++) {
                a.m5627e((C1115a) list2.get(optJSONArray7.getInt(i)));
            }
        }
        if (optJSONArray8 != null) {
            for (i = 0; i < optJSONArray8.length(); i++) {
                a.m5628f((C1115a) list2.get(optJSONArray8.getInt(i)));
            }
        }
        if (optJSONArray9 != null) {
            for (i2 = 0; i2 < optJSONArray9.length(); i2++) {
                a.m5624c(c1009aArr[optJSONArray9.getInt(i2)].f3437b);
            }
        }
        if (optJSONArray10 != null) {
            for (i2 = 0; i2 < optJSONArray10.length(); i2++) {
                a.m5626d(c1009aArr[optJSONArray10.getInt(i2)].f3437b);
            }
        }
        return a.m5618a();
    }

    private static <T> T m5553a(JSONArray jSONArray, int i, String str) {
        if (i >= 0 && i < jSONArray.length()) {
            try {
                return jSONArray.get(i);
            } catch (JSONException e) {
            }
        }
        kl.m5557b("Index out of bounds detected: " + i + " in " + str);
        return null;
    }

    private static <T> T m5554a(T[] tArr, int i, String str) {
        if (i < 0 || i >= tArr.length) {
            kl.m5557b("Index out of bounds detected: " + i + " in " + str);
        }
        return tArr[i];
    }

    static List<C1115a> m5555a(JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, C1009a[] c1009aArr) {
        List<C1115a> arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(kl.m5550a(jSONArray.getJSONObject(i), jSONArray2, jSONArray3, c1009aArr, i));
        }
        return arrayList;
    }

    static C1009a[] m5556a(JSONObject jSONObject) {
        Object opt = jSONObject.opt("values");
        if (opt instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) opt;
            C1009a[] c1009aArr = new C1009a[jSONArray.length()];
            for (int i = 0; i < c1009aArr.length; i++) {
                kl.m5549a(i, jSONArray, c1009aArr, new HashSet(0));
            }
            return c1009aArr;
        }
        throw new C1121g("Missing Values list");
    }

    private static void m5557b(String str) {
        aj.m7036a(str);
        throw new C1121g(str);
    }
}
