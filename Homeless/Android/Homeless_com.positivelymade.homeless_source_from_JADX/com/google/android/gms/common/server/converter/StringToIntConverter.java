package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.C1520a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class StringToIntConverter implements SafeParcelable, C1520a<String, Integer> {
    public static final C1522b CREATOR = new C1522b();
    private final int f4530a;
    private final HashMap<String, Integer> f4531b;
    private final HashMap<Integer, String> f4532c;
    private final ArrayList<Entry> f4533d;

    public static final class Entry implements SafeParcelable {
        public static final C1523c CREATOR = new C1523c();
        final int f4527a;
        final String f4528b;
        final int f4529c;

        Entry(int i, String str, int i2) {
            this.f4527a = i;
            this.f4528b = str;
            this.f4529c = i2;
        }

        Entry(String str, int i) {
            this.f4527a = 1;
            this.f4528b = str;
            this.f4529c = i;
        }

        public int describeContents() {
            C1523c c1523c = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1523c c1523c = CREATOR;
            C1523c.m6856a(this, parcel, i);
        }
    }

    public StringToIntConverter() {
        this.f4530a = 1;
        this.f4531b = new HashMap();
        this.f4532c = new HashMap();
        this.f4533d = null;
    }

    StringToIntConverter(int i, ArrayList<Entry> arrayList) {
        this.f4530a = i;
        this.f4531b = new HashMap();
        this.f4532c = new HashMap();
        this.f4533d = null;
        m6842a((ArrayList) arrayList);
    }

    private void m6842a(ArrayList<Entry> arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            m6844a(entry.f4528b, entry.f4529c);
        }
    }

    int m6843a() {
        return this.f4530a;
    }

    public StringToIntConverter m6844a(String str, int i) {
        this.f4531b.put(str, Integer.valueOf(i));
        this.f4532c.put(Integer.valueOf(i), str);
        return this;
    }

    public /* synthetic */ Object mo964a(Object obj) {
        return m6846a((Integer) obj);
    }

    public String m6846a(Integer num) {
        String str = (String) this.f4532c.get(num);
        return (str == null && this.f4531b.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    ArrayList<Entry> m6847b() {
        ArrayList<Entry> arrayList = new ArrayList();
        for (String str : this.f4531b.keySet()) {
            arrayList.add(new Entry(str, ((Integer) this.f4531b.get(str)).intValue()));
        }
        return arrayList;
    }

    public int mo965c() {
        return 7;
    }

    public int mo966d() {
        return 0;
    }

    public int describeContents() {
        C1522b c1522b = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1522b c1522b = CREATOR;
        C1522b.m6853a(this, parcel, i);
    }
}
