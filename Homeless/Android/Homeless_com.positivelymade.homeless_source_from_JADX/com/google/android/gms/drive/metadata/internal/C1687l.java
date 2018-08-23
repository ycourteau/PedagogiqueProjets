package com.google.android.gms.drive.metadata.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class C1687l extends C1052h<Object> {
    public C1687l(String str, int i) {
        super(str, C1687l.m7895a(str), Collections.emptyList(), i);
    }

    private static String m7894a(String str, String str2) {
        return str + "." + str2;
    }

    private static Collection<String> m7895a(String str) {
        return Arrays.asList(new String[]{C1687l.m7894a(str, "permissionId"), C1687l.m7894a(str, "displayName"), C1687l.m7894a(str, "picture"), C1687l.m7894a(str, "isAuthenticatedUser"), C1687l.m7894a(str, "emailAddress")});
    }
}
