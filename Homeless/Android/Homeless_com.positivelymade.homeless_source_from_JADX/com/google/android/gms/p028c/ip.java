package com.google.android.gms.p028c;

import android.support.v7.p010b.C0275a.C0274i;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ip {
    private static final Pattern f3601a = Pattern.compile("\\\\.");
    private static final Pattern f3602b = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    public static String m5281a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f3602b.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            switch (matcher.group().charAt(0)) {
                case '\b':
                    matcher.appendReplacement(stringBuffer, "\\\\b");
                    break;
                case '\t':
                    matcher.appendReplacement(stringBuffer, "\\\\t");
                    break;
                case '\n':
                    matcher.appendReplacement(stringBuffer, "\\\\n");
                    break;
                case '\f':
                    matcher.appendReplacement(stringBuffer, "\\\\f");
                    break;
                case '\r':
                    matcher.appendReplacement(stringBuffer, "\\\\r");
                    break;
                case C0274i.Theme_actionModePasteDrawable /*34*/:
                    matcher.appendReplacement(stringBuffer, "\\\\\\\"");
                    break;
                case C0274i.Theme_spinnerDropDownItemStyle /*47*/:
                    matcher.appendReplacement(stringBuffer, "\\\\/");
                    break;
                case C0274i.Theme_alertDialogTheme /*92*/:
                    matcher.appendReplacement(stringBuffer, "\\\\\\\\");
                    break;
                default:
                    break;
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
