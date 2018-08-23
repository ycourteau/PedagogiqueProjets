package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.C1305x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.p028c.ih;
import com.google.android.gms.p028c.ip;
import com.google.android.gms.p028c.iq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class FastJsonResponse {

    public interface C1520a<I, O> {
        I mo964a(O o);

        int mo965c();

        int mo966d();
    }

    public static class Field<I, O> implements SafeParcelable {
        public static final C1524a CREATOR = new C1524a();
        protected final int f4534a;
        protected final boolean f4535b;
        protected final int f4536c;
        protected final boolean f4537d;
        protected final String f4538e;
        protected final int f4539f;
        protected final Class<? extends FastJsonResponse> f4540g;
        protected final String f4541h;
        private final int f4542i;
        private FieldMappingDictionary f4543j;
        private C1520a<I, O> f4544k;

        Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, ConverterWrapper converterWrapper) {
            this.f4542i = i;
            this.f4534a = i2;
            this.f4535b = z;
            this.f4536c = i3;
            this.f4537d = z2;
            this.f4538e = str;
            this.f4539f = i4;
            if (str2 == null) {
                this.f4540g = null;
                this.f4541h = null;
            } else {
                this.f4540g = SafeParcelResponse.class;
                this.f4541h = str2;
            }
            if (converterWrapper == null) {
                this.f4544k = null;
            } else {
                this.f4544k = converterWrapper.m6838c();
            }
        }

        protected Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends FastJsonResponse> cls, C1520a<I, O> c1520a) {
            this.f4542i = 1;
            this.f4534a = i;
            this.f4535b = z;
            this.f4536c = i2;
            this.f4537d = z2;
            this.f4538e = str;
            this.f4539f = i3;
            this.f4540g = cls;
            if (cls == null) {
                this.f4541h = null;
            } else {
                this.f4541h = cls.getCanonicalName();
            }
            this.f4544k = c1520a;
        }

        public static Field<Integer, Integer> m6859a(String str, int i) {
            return new Field(0, false, 0, false, str, i, null, null);
        }

        public static Field m6860a(String str, int i, C1520a<?, ?> c1520a, boolean z) {
            return new Field(c1520a.mo965c(), z, c1520a.mo966d(), false, str, i, null, c1520a);
        }

        public static <T extends FastJsonResponse> Field<T, T> m6861a(String str, int i, Class<T> cls) {
            return new Field(11, false, 11, false, str, i, cls, null);
        }

        public static Field<Boolean, Boolean> m6863b(String str, int i) {
            return new Field(6, false, 6, false, str, i, null, null);
        }

        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> m6864b(String str, int i, Class<T> cls) {
            return new Field(11, true, 11, true, str, i, cls, null);
        }

        public static Field<String, String> m6865c(String str, int i) {
            return new Field(7, false, 7, false, str, i, null, null);
        }

        public int m6866a() {
            return this.f4542i;
        }

        public I m6867a(O o) {
            return this.f4544k.mo964a(o);
        }

        public void m6868a(FieldMappingDictionary fieldMappingDictionary) {
            this.f4543j = fieldMappingDictionary;
        }

        public int m6869b() {
            return this.f4534a;
        }

        public boolean m6870c() {
            return this.f4535b;
        }

        public int m6871d() {
            return this.f4536c;
        }

        public int describeContents() {
            C1524a c1524a = CREATOR;
            return 0;
        }

        public boolean m6872e() {
            return this.f4537d;
        }

        public String m6873f() {
            return this.f4538e;
        }

        public int m6874g() {
            return this.f4539f;
        }

        public Class<? extends FastJsonResponse> m6875h() {
            return this.f4540g;
        }

        String m6876i() {
            return this.f4541h == null ? null : this.f4541h;
        }

        public boolean m6877j() {
            return this.f4544k != null;
        }

        ConverterWrapper m6878k() {
            return this.f4544k == null ? null : ConverterWrapper.m6835a(this.f4544k);
        }

        public Map<String, Field<?, ?>> m6879l() {
            C1305x.m6617a(this.f4541h);
            C1305x.m6617a(this.f4543j);
            return this.f4543j.m6897a(this.f4541h);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Field\n");
            stringBuilder.append("            versionCode=").append(this.f4542i).append('\n');
            stringBuilder.append("                 typeIn=").append(this.f4534a).append('\n');
            stringBuilder.append("            typeInArray=").append(this.f4535b).append('\n');
            stringBuilder.append("                typeOut=").append(this.f4536c).append('\n');
            stringBuilder.append("           typeOutArray=").append(this.f4537d).append('\n');
            stringBuilder.append("        outputFieldName=").append(this.f4538e).append('\n');
            stringBuilder.append("      safeParcelFieldId=").append(this.f4539f).append('\n');
            stringBuilder.append("       concreteTypeName=").append(m6876i()).append('\n');
            if (m6875h() != null) {
                stringBuilder.append("     concreteType.class=").append(m6875h().getCanonicalName()).append('\n');
            }
            stringBuilder.append("          converterName=").append(this.f4544k == null ? "null" : this.f4544k.getClass().getCanonicalName()).append('\n');
            return stringBuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C1524a c1524a = CREATOR;
            C1524a.m6917a(this, parcel, i);
        }
    }

    private void m6880a(StringBuilder stringBuilder, Field field, Object obj) {
        if (field.m6869b() == 11) {
            stringBuilder.append(((FastJsonResponse) field.m6875h().cast(obj)).toString());
        } else if (field.m6869b() == 7) {
            stringBuilder.append("\"");
            stringBuilder.append(ip.m5281a((String) obj));
            stringBuilder.append("\"");
        } else {
            stringBuilder.append(obj);
        }
    }

    private void m6881a(StringBuilder stringBuilder, Field field, ArrayList<Object> arrayList) {
        stringBuilder.append("[");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(",");
            }
            Object obj = arrayList.get(i);
            if (obj != null) {
                m6880a(stringBuilder, field, obj);
            }
        }
        stringBuilder.append("]");
    }

    protected <O, I> I m6882a(Field<I, O> field, Object obj) {
        return field.f4544k != null ? field.m6867a(obj) : obj;
    }

    protected abstract Object mo967a(String str);

    public abstract Map<String, Field<?, ?>> mo969a();

    protected boolean mo1651a(Field field) {
        return field.m6871d() == 11 ? field.m6872e() ? m6891d(field.m6873f()) : m6890c(field.m6873f()) : mo968b(field.m6873f());
    }

    protected Object mo1652b(Field field) {
        String f = field.m6873f();
        if (field.m6875h() == null) {
            return mo967a(field.m6873f());
        }
        C1305x.m6623a(mo967a(field.m6873f()) == null, "Concrete field shouldn't be value object: %s", field.m6873f());
        Map c = field.m6872e() ? m6889c() : m6887b();
        if (c != null) {
            return c.get(f);
        }
        try {
            return getClass().getMethod("get" + Character.toUpperCase(f.charAt(0)) + f.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public HashMap<String, Object> m6887b() {
        return null;
    }

    protected abstract boolean mo968b(String str);

    public HashMap<String, Object> m6889c() {
        return null;
    }

    protected boolean m6890c(String str) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected boolean m6891d(String str) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    public String toString() {
        Map a = mo969a();
        StringBuilder stringBuilder = new StringBuilder(100);
        for (String str : a.keySet()) {
            Field field = (Field) a.get(str);
            if (mo1651a(field)) {
                Object a2 = m6882a(field, mo1652b(field));
                if (stringBuilder.length() == 0) {
                    stringBuilder.append("{");
                } else {
                    stringBuilder.append(",");
                }
                stringBuilder.append("\"").append(str).append("\":");
                if (a2 != null) {
                    switch (field.m6871d()) {
                        case 8:
                            stringBuilder.append("\"").append(ih.m5257a((byte[]) a2)).append("\"");
                            break;
                        case 9:
                            stringBuilder.append("\"").append(ih.m5258b((byte[]) a2)).append("\"");
                            break;
                        case 10:
                            iq.m5282a(stringBuilder, (HashMap) a2);
                            break;
                        default:
                            if (!field.m6870c()) {
                                m6880a(stringBuilder, field, a2);
                                break;
                            }
                            m6881a(stringBuilder, field, (ArrayList) a2);
                            break;
                    }
                }
                stringBuilder.append("null");
            }
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append("}");
        } else {
            stringBuilder.append("{}");
        }
        return stringBuilder.toString();
    }
}
