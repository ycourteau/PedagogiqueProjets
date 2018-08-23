package com.google.android.gms.p029b;

import android.os.IBinder;
import com.google.android.gms.p029b.C0799a.C0801a;
import java.lang.reflect.Field;

public final class C0802b<T> extends C0801a {
    private final T f2349a;

    private C0802b(T t) {
        this.f2349a = t;
    }

    public static <T> C0799a m3754a(T t) {
        return new C0802b(t);
    }

    public static <T> T m3755a(C0799a c0799a) {
        if (c0799a instanceof C0802b) {
            return ((C0802b) c0799a).f2349a;
        }
        IBinder asBinder = c0799a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (field.isAccessible()) {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (Throwable e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (Throwable e2) {
                throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
            } catch (Throwable e22) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e22);
            }
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
}
