package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.C1294a;
import com.google.android.gms.common.internal.safeparcel.C1294a.C1293a;
import com.google.android.gms.common.internal.safeparcel.C1295b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.p028c.ig;
import com.google.android.gms.p028c.ih;
import com.google.android.gms.p028c.ip;
import com.google.android.gms.p028c.iq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SafeParcelResponse extends FastJsonResponse implements SafeParcelable {
    public static final C1528e CREATOR = new C1528e();
    private final int f4555a;
    private final Parcel f4556b;
    private final int f4557c = 2;
    private final FieldMappingDictionary f4558d;
    private final String f4559e;
    private int f4560f;
    private int f4561g;

    SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldMappingDictionary) {
        this.f4555a = i;
        this.f4556b = (Parcel) C1305x.m6617a((Object) parcel);
        this.f4558d = fieldMappingDictionary;
        if (this.f4558d == null) {
            this.f4559e = null;
        } else {
            this.f4559e = this.f4558d.m6901d();
        }
        this.f4560f = 2;
    }

    public static HashMap<String, String> m6902a(Bundle bundle) {
        HashMap<String, String> hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    private static HashMap<Integer, Entry<String, Field<?, ?>>> m6903a(Map<String, Field<?, ?>> map) {
        HashMap<Integer, Entry<String, Field<?, ?>>> hashMap = new HashMap();
        for (Entry entry : map.entrySet()) {
            hashMap.put(Integer.valueOf(((Field) entry.getValue()).m6874g()), entry);
        }
        return hashMap;
    }

    private void m6904a(StringBuilder stringBuilder, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                stringBuilder.append(obj);
                return;
            case 7:
                stringBuilder.append("\"").append(ip.m5281a(obj.toString())).append("\"");
                return;
            case 8:
                stringBuilder.append("\"").append(ih.m5257a((byte[]) obj)).append("\"");
                return;
            case 9:
                stringBuilder.append("\"").append(ih.m5258b((byte[]) obj));
                stringBuilder.append("\"");
                return;
            case 10:
                iq.m5282a(stringBuilder, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    private void m6905a(StringBuilder stringBuilder, Field<?, ?> field, Parcel parcel, int i) {
        switch (field.m6871d()) {
            case 0:
                m6906a(stringBuilder, (Field) field, m6882a(field, Integer.valueOf(C1294a.m6471e(parcel, i))));
                return;
            case 1:
                m6906a(stringBuilder, (Field) field, m6882a(field, C1294a.m6475i(parcel, i)));
                return;
            case 2:
                m6906a(stringBuilder, (Field) field, m6882a(field, Long.valueOf(C1294a.m6473g(parcel, i))));
                return;
            case 3:
                m6906a(stringBuilder, (Field) field, m6882a(field, Float.valueOf(C1294a.m6476j(parcel, i))));
                return;
            case 4:
                m6906a(stringBuilder, (Field) field, m6882a(field, Double.valueOf(C1294a.m6477k(parcel, i))));
                return;
            case 5:
                m6906a(stringBuilder, (Field) field, m6882a(field, C1294a.m6478l(parcel, i)));
                return;
            case 6:
                m6906a(stringBuilder, (Field) field, m6882a(field, Boolean.valueOf(C1294a.m6469c(parcel, i))));
                return;
            case 7:
                m6906a(stringBuilder, (Field) field, m6882a(field, C1294a.m6479m(parcel, i)));
                return;
            case 8:
            case 9:
                m6906a(stringBuilder, (Field) field, m6882a(field, C1294a.m6482p(parcel, i)));
                return;
            case 10:
                m6906a(stringBuilder, (Field) field, m6882a(field, m6902a(C1294a.m6481o(parcel, i))));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown field out type = " + field.m6871d());
        }
    }

    private void m6906a(StringBuilder stringBuilder, Field<?, ?> field, Object obj) {
        if (field.m6870c()) {
            m6907a(stringBuilder, (Field) field, (ArrayList) obj);
        } else {
            m6904a(stringBuilder, field.m6869b(), obj);
        }
    }

    private void m6907a(StringBuilder stringBuilder, Field<?, ?> field, ArrayList<?> arrayList) {
        stringBuilder.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                stringBuilder.append(",");
            }
            m6904a(stringBuilder, field.m6869b(), arrayList.get(i));
        }
        stringBuilder.append("]");
    }

    private void m6908a(StringBuilder stringBuilder, String str, Field<?, ?> field, Parcel parcel, int i) {
        stringBuilder.append("\"").append(str).append("\":");
        if (field.m6877j()) {
            m6905a(stringBuilder, field, parcel, i);
        } else {
            m6910b(stringBuilder, field, parcel, i);
        }
    }

    private void m6909a(StringBuilder stringBuilder, Map<String, Field<?, ?>> map, Parcel parcel) {
        HashMap a = m6903a((Map) map);
        stringBuilder.append('{');
        int b = C1294a.m6465b(parcel);
        Object obj = null;
        while (parcel.dataPosition() < b) {
            int a2 = C1294a.m6460a(parcel);
            Entry entry = (Entry) a.get(Integer.valueOf(C1294a.m6459a(a2)));
            if (entry != null) {
                if (obj != null) {
                    stringBuilder.append(",");
                }
                m6908a(stringBuilder, (String) entry.getKey(), (Field) entry.getValue(), parcel, a2);
                obj = 1;
            }
        }
        if (parcel.dataPosition() != b) {
            throw new C1293a("Overread allowed size end=" + b, parcel);
        }
        stringBuilder.append('}');
    }

    private void m6910b(StringBuilder stringBuilder, Field<?, ?> field, Parcel parcel, int i) {
        if (field.m6872e()) {
            stringBuilder.append("[");
            switch (field.m6871d()) {
                case 0:
                    ig.m5252a(stringBuilder, C1294a.m6484r(parcel, i));
                    break;
                case 1:
                    ig.m5254a(stringBuilder, C1294a.m6486t(parcel, i));
                    break;
                case 2:
                    ig.m5253a(stringBuilder, C1294a.m6485s(parcel, i));
                    break;
                case 3:
                    ig.m5251a(stringBuilder, C1294a.m6487u(parcel, i));
                    break;
                case 4:
                    ig.m5250a(stringBuilder, C1294a.m6488v(parcel, i));
                    break;
                case 5:
                    ig.m5254a(stringBuilder, C1294a.m6489w(parcel, i));
                    break;
                case 6:
                    ig.m5256a(stringBuilder, C1294a.m6483q(parcel, i));
                    break;
                case 7:
                    ig.m5255a(stringBuilder, C1294a.m6490x(parcel, i));
                    break;
                case 8:
                case 9:
                case 10:
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                case 11:
                    Parcel[] A = C1294a.m6458A(parcel, i);
                    int length = A.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (i2 > 0) {
                            stringBuilder.append(",");
                        }
                        A[i2].setDataPosition(0);
                        m6909a(stringBuilder, field.m6879l(), A[i2]);
                    }
                    break;
                default:
                    throw new IllegalStateException("Unknown field type out.");
            }
            stringBuilder.append("]");
            return;
        }
        switch (field.m6871d()) {
            case 0:
                stringBuilder.append(C1294a.m6471e(parcel, i));
                return;
            case 1:
                stringBuilder.append(C1294a.m6475i(parcel, i));
                return;
            case 2:
                stringBuilder.append(C1294a.m6473g(parcel, i));
                return;
            case 3:
                stringBuilder.append(C1294a.m6476j(parcel, i));
                return;
            case 4:
                stringBuilder.append(C1294a.m6477k(parcel, i));
                return;
            case 5:
                stringBuilder.append(C1294a.m6478l(parcel, i));
                return;
            case 6:
                stringBuilder.append(C1294a.m6469c(parcel, i));
                return;
            case 7:
                stringBuilder.append("\"").append(ip.m5281a(C1294a.m6479m(parcel, i))).append("\"");
                return;
            case 8:
                stringBuilder.append("\"").append(ih.m5257a(C1294a.m6482p(parcel, i))).append("\"");
                return;
            case 9:
                stringBuilder.append("\"").append(ih.m5258b(C1294a.m6482p(parcel, i)));
                stringBuilder.append("\"");
                return;
            case 10:
                Bundle o = C1294a.m6481o(parcel, i);
                Set<String> keySet = o.keySet();
                keySet.size();
                stringBuilder.append("{");
                int i3 = 1;
                for (String str : keySet) {
                    if (i3 == 0) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append("\"").append(str).append("\"");
                    stringBuilder.append(":");
                    stringBuilder.append("\"").append(ip.m5281a(o.getString(str))).append("\"");
                    i3 = 0;
                }
                stringBuilder.append("}");
                return;
            case 11:
                Parcel z = C1294a.m6492z(parcel, i);
                z.setDataPosition(0);
                m6909a(stringBuilder, field.m6879l(), z);
                return;
            default:
                throw new IllegalStateException("Unknown field type out");
        }
    }

    protected Object mo967a(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public Map<String, Field<?, ?>> mo969a() {
        return this.f4558d == null ? null : this.f4558d.m6897a(this.f4559e);
    }

    protected boolean mo968b(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public int m6914d() {
        return this.f4555a;
    }

    public int describeContents() {
        C1528e c1528e = CREATOR;
        return 0;
    }

    public Parcel m6915e() {
        switch (this.f4560f) {
            case 0:
                this.f4561g = C1295b.m6493a(this.f4556b);
                C1295b.m6494a(this.f4556b, this.f4561g);
                this.f4560f = 2;
                break;
            case 1:
                C1295b.m6494a(this.f4556b, this.f4561g);
                this.f4560f = 2;
                break;
        }
        return this.f4556b;
    }

    FieldMappingDictionary m6916f() {
        switch (this.f4557c) {
            case 0:
                return null;
            case 1:
                return this.f4558d;
            case 2:
                return this.f4558d;
            default:
                throw new IllegalStateException("Invalid creation type: " + this.f4557c);
        }
    }

    public String toString() {
        C1305x.m6618a(this.f4558d, (Object) "Cannot convert to JSON on client side.");
        Parcel e = m6915e();
        e.setDataPosition(0);
        StringBuilder stringBuilder = new StringBuilder(100);
        m6909a(stringBuilder, this.f4558d.m6897a(this.f4559e), e);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C1528e c1528e = CREATOR;
        C1528e.m6929a(this, parcel, i);
    }
}
