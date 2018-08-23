package android.support.v4.p006e;

import java.util.Locale;

public class C0083c {
    public static final Locale f257a = new Locale("", "");
    private static String f258b = "Arab";
    private static String f259c = "Hebr";

    public static int m428a(Locale locale) {
        if (!(locale == null || locale.equals(f257a))) {
            String a = C0081a.m424a(C0081a.m425b(locale.toString()));
            if (a == null) {
                return C0083c.m429b(locale);
            }
            if (a.equalsIgnoreCase(f258b) || a.equalsIgnoreCase(f259c)) {
                return 1;
            }
        }
        return 0;
    }

    private static int m429b(Locale locale) {
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
            case (byte) 1:
            case (byte) 2:
                return 1;
            default:
                return 0;
        }
    }
}
