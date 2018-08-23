package com.google.android.gms.p028c;

import com.google.android.gms.drive.metadata.C1060e;
import com.google.android.gms.drive.metadata.C1086d;
import com.google.android.gms.drive.metadata.internal.C1084b;
import java.util.Date;

public class ja {
    public static final C1085a f3722a = new C1085a("created", 4100000);
    public static final C1087b f3723b = new C1087b("lastOpenedTime", 4300000);
    public static final C1089d f3724c = new C1089d("modified", 4100000);
    public static final C1088c f3725d = new C1088c("modifiedByMe", 4100000);
    public static final C1090e f3726e = new C1090e("sharedWithMe", 4100000);

    public static class C1085a extends C1084b implements C1060e<Date> {
        public C1085a(String str, int i) {
            super(str, i);
        }
    }

    public static class C1087b extends C1084b implements C1086d<Date>, C1060e<Date> {
        public C1087b(String str, int i) {
            super(str, i);
        }
    }

    public static class C1088c extends C1084b implements C1060e<Date> {
        public C1088c(String str, int i) {
            super(str, i);
        }
    }

    public static class C1089d extends C1084b implements C1086d<Date>, C1060e<Date> {
        public C1089d(String str, int i) {
            super(str, i);
        }
    }

    public static class C1090e extends C1084b implements C1086d<Date>, C1060e<Date> {
        public C1090e(String str, int i) {
            super(str, i);
        }
    }
}
