package com.google.p016a.p018a;

import com.google.android.gms.ads.internal.util.client.C0691b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
public abstract class C0448h {

    public static final class C0446a extends Exception {
        public C0446a(String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    protected @interface C0447b {
        String m2039a();

        boolean m2040b() default true;
    }

    protected void m2041a() {
    }

    public void m2042a(Map<String, String> map) {
        Map hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            C0447b c0447b = (C0447b) field.getAnnotation(C0447b.class);
            if (c0447b != null) {
                hashMap.put(c0447b.m2039a(), field);
            }
        }
        if (hashMap.isEmpty()) {
            C0691b.m3103e("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Entry entry : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException e) {
                    C0691b.m3103e("Server option \"" + ((String) entry.getKey()) + "\" could not be set: Illegal Access");
                } catch (IllegalArgumentException e2) {
                    C0691b.m3103e("Server option \"" + ((String) entry.getKey()) + "\" could not be set: Bad Type");
                }
            } else {
                C0691b.m3093a("Unexpected server option: " + ((String) entry.getKey()) + " = \"" + ((String) entry.getValue()) + "\"");
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Field field22 : hashMap.values()) {
            if (((C0447b) field22.getAnnotation(C0447b.class)).m2040b()) {
                C0691b.m3103e("Required server option missing: " + ((C0447b) field22.getAnnotation(C0447b.class)).m2039a());
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(((C0447b) field22.getAnnotation(C0447b.class)).m2039a());
            }
        }
        if (stringBuilder.length() > 0) {
            throw new C0446a("Required server option(s) missing: " + stringBuilder.toString());
        }
        m2041a();
    }
}
