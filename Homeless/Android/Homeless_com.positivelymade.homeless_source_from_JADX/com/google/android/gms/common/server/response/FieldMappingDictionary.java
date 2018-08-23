package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FieldMappingDictionary implements SafeParcelable {
    public static final C1526c CREATOR = new C1526c();
    private final int f4551a;
    private final HashMap<String, Map<String, Field<?, ?>>> f4552b;
    private final ArrayList<Entry> f4553c = null;
    private final String f4554d;

    public static class Entry implements SafeParcelable {
        public static final C1527d CREATOR = new C1527d();
        final int f4545a;
        final String f4546b;
        final ArrayList<FieldMapPair> f4547c;

        Entry(int i, String str, ArrayList<FieldMapPair> arrayList) {
            this.f4545a = i;
            this.f4546b = str;
            this.f4547c = arrayList;
        }

        Entry(String str, Map<String, Field<?, ?>> map) {
            this.f4545a = 1;
            this.f4546b = str;
            this.f4547c = m6894a(map);
        }

        private static ArrayList<FieldMapPair> m6894a(Map<String, Field<?, ?>> map) {
            if (map == null) {
                return null;
            }
            ArrayList<FieldMapPair> arrayList = new ArrayList();
            for (String str : map.keySet()) {
                arrayList.add(new FieldMapPair(str, (Field) map.get(str)));
            }
            return arrayList;
        }

        HashMap<String, Field<?, ?>> m6895a() {
            HashMap<String, Field<?, ?>> hashMap = new HashMap();
            int size = this.f4547c.size();
            for (int i = 0; i < size; i++) {
                FieldMapPair fieldMapPair = (FieldMapPair) this.f4547c.get(i);
                hashMap.put(fieldMapPair.f4549b, fieldMapPair.f4550c);
            }
            return hashMap;
        }

        public int describeContents() {
            C1527d c1527d = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1527d c1527d = CREATOR;
            C1527d.m6926a(this, parcel, i);
        }
    }

    public static class FieldMapPair implements SafeParcelable {
        public static final C1525b CREATOR = new C1525b();
        final int f4548a;
        final String f4549b;
        final Field<?, ?> f4550c;

        FieldMapPair(int i, String str, Field<?, ?> field) {
            this.f4548a = i;
            this.f4549b = str;
            this.f4550c = field;
        }

        FieldMapPair(String str, Field<?, ?> field) {
            this.f4548a = 1;
            this.f4549b = str;
            this.f4550c = field;
        }

        public int describeContents() {
            C1525b c1525b = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1525b c1525b = CREATOR;
            C1525b.m6920a(this, parcel, i);
        }
    }

    FieldMappingDictionary(int i, ArrayList<Entry> arrayList, String str) {
        this.f4551a = i;
        this.f4552b = m6896a((ArrayList) arrayList);
        this.f4554d = (String) C1305x.m6617a((Object) str);
        m6898a();
    }

    private static HashMap<String, Map<String, Field<?, ?>>> m6896a(ArrayList<Entry> arrayList) {
        HashMap<String, Map<String, Field<?, ?>>> hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Entry entry = (Entry) arrayList.get(i);
            hashMap.put(entry.f4546b, entry.m6895a());
        }
        return hashMap;
    }

    public Map<String, Field<?, ?>> m6897a(String str) {
        return (Map) this.f4552b.get(str);
    }

    public void m6898a() {
        for (String str : this.f4552b.keySet()) {
            Map map = (Map) this.f4552b.get(str);
            for (String str2 : map.keySet()) {
                ((Field) map.get(str2)).m6868a(this);
            }
        }
    }

    int m6899b() {
        return this.f4551a;
    }

    ArrayList<Entry> m6900c() {
        ArrayList<Entry> arrayList = new ArrayList();
        for (String str : this.f4552b.keySet()) {
            arrayList.add(new Entry(str, (Map) this.f4552b.get(str)));
        }
        return arrayList;
    }

    public String m6901d() {
        return this.f4554d;
    }

    public int describeContents() {
        C1526c c1526c = CREATOR;
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : this.f4552b.keySet()) {
            stringBuilder.append(str).append(":\n");
            Map map = (Map) this.f4552b.get(str);
            for (String str2 : map.keySet()) {
                stringBuilder.append("  ").append(str2).append(": ");
                stringBuilder.append(map.get(str2));
            }
        }
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1526c c1526c = CREATOR;
        C1526c.m6923a(this, parcel, i);
    }
}
