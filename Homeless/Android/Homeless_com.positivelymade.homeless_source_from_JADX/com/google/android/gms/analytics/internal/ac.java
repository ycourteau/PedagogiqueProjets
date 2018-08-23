package com.google.android.gms.analytics.internal;

import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

abstract class ac<T extends ab> extends C0716o {
    C0722a<T> f2059a;

    public interface C0722a<U extends ab> {
        U mo545a();

        void mo546a(String str, int i);

        void mo547a(String str, String str2);

        void mo548a(String str, boolean z);

        void mo549b(String str, String str2);
    }

    public ac(C0750r c0750r, C0722a<T> c0722a) {
        super(c0750r);
        this.f2059a = c0722a;
    }

    private T m3273a(XmlResourceParser xmlResourceParser) {
        Object trim;
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String toLowerCase = xmlResourceParser.getName().toLowerCase();
                    String trim2;
                    if (toLowerCase.equals("screenname")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, "name");
                        trim2 = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim2))) {
                            this.f2059a.mo547a(toLowerCase, trim2);
                        }
                    } else if (toLowerCase.equals("string")) {
                        Object attributeValue = xmlResourceParser.getAttributeValue(null, "name");
                        trim2 = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(attributeValue) || trim2 == null)) {
                            this.f2059a.mo549b(attributeValue, trim2);
                        }
                    } else if (toLowerCase.equals("bool")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, "name");
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim))) {
                            try {
                                this.f2059a.mo548a(toLowerCase, Boolean.parseBoolean(trim));
                            } catch (NumberFormatException e) {
                                m3204c("Error parsing bool configuration value", trim, e);
                            }
                        }
                    } else if (toLowerCase.equals("integer")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, "name");
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim))) {
                            try {
                                this.f2059a.mo546a(toLowerCase, Integer.parseInt(trim));
                            } catch (NumberFormatException e2) {
                                m3204c("Error parsing int configuration value", trim, e2);
                            }
                        }
                    } else {
                        continue;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (XmlPullParserException e3) {
            m3209e("Error parsing tracker configuration file", e3);
        } catch (IOException e4) {
            m3209e("Error parsing tracker configuration file", e4);
        }
        return this.f2059a.mo545a();
    }

    public T m3274a(int i) {
        try {
            return m3273a(m3211k().m3491c().getResources().getXml(i));
        } catch (NotFoundException e) {
            m3206d("inflate() called with unknown resourceId", e);
            return null;
        }
    }
}
