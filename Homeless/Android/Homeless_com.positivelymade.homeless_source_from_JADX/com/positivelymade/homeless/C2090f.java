package com.positivelymade.homeless;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class C2090f {
    Map<String, String> f7054a = new HashMap();

    public C2090f(byte[] bArr) {
        if (bArr != null) {
            m10154a(new String(bArr));
        }
    }

    public void m10154a(String str) {
        this.f7054a.clear();
        if (str != null && !str.trim().equals("")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("version");
                if (string.equals("1.0")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("state");
                    Iterator keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String str2 = (String) keys.next();
                        this.f7054a.put(str2, jSONObject2.getString(str2));
                    }
                    return;
                }
                throw new RuntimeException("Unexpected loot format " + string);
            } catch (Throwable e) {
                e.printStackTrace();
                Log.e("SavedGame", "Save data has a syntax error: " + str, e);
                this.f7054a.clear();
            } catch (Throwable e2) {
                e2.printStackTrace();
                throw new RuntimeException("Save data has an invalid entry in it: " + str, e2);
            }
        }
    }

    public void m10155a(String str, String str2) {
        this.f7054a.put(str, str2);
    }

    public byte[] m10156a() {
        return toString().getBytes();
    }

    public String m10157b(String str) {
        String str2 = (String) this.f7054a.get(str);
        return str2 == null ? "" : str2;
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : this.f7054a.keySet()) {
                jSONObject.put(str, this.f7054a.get(str));
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("version", "1.0");
            jSONObject2.put("state", jSONObject);
            return jSONObject2.toString();
        } catch (Throwable e) {
            e.printStackTrace();
            throw new RuntimeException("Error converting save data to JSON.", e);
        }
    }
}
