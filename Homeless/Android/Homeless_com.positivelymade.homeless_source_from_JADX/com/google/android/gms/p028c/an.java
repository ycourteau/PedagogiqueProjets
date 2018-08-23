package com.google.android.gms.p028c;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.C0691b;
import com.google.android.gms.p028c.aq.C0822a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

public class an {
    private final int f2431a;
    private final int f2432b;
    private final int f2433c;
    private final am f2434d = new ap();

    class C08191 implements Comparator<String> {
        final /* synthetic */ an f2427a;

        C08191(an anVar) {
            this.f2427a = anVar;
        }

        public int m3837a(String str, String str2) {
            return str2.length() - str.length();
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m3837a((String) obj, (String) obj2);
        }
    }

    class C08202 implements Comparator<C0822a> {
        final /* synthetic */ an f2428a;

        C08202(an anVar) {
            this.f2428a = anVar;
        }

        public int m3838a(C0822a c0822a, C0822a c0822a2) {
            return (int) (c0822a.f2436a - c0822a2.f2436a);
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m3838a((C0822a) obj, (C0822a) obj2);
        }
    }

    static class C0821a {
        ByteArrayOutputStream f2429a = new ByteArrayOutputStream(4096);
        Base64OutputStream f2430b = new Base64OutputStream(this.f2429a, 10);

        public void m3839a(byte[] bArr) {
            this.f2430b.write(bArr);
        }

        public String toString() {
            String byteArrayOutputStream;
            try {
                this.f2430b.close();
            } catch (Throwable e) {
                C0691b.m3098b("HashManager: Unable to convert to Base64.", e);
            }
            try {
                this.f2429a.close();
                byteArrayOutputStream = this.f2429a.toString();
            } catch (Throwable e2) {
                C0691b.m3098b("HashManager: Unable to convert to Base64.", e2);
                byteArrayOutputStream = "";
            } finally {
                this.f2429a = null;
                this.f2430b = null;
            }
            return byteArrayOutputStream;
        }
    }

    public an(int i) {
        this.f2432b = i;
        this.f2431a = 6;
        this.f2433c = 0;
    }

    private String m3840b(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        C0821a a = m3841a();
        Arrays.sort(split, new C08191(this));
        int i = 0;
        while (i < split.length && i < this.f2432b) {
            if (split[i].trim().length() != 0) {
                try {
                    a.m3839a(this.f2434d.mo589a(split[i]));
                } catch (Throwable e) {
                    C0691b.m3098b("Error while writing hash to byteStream", e);
                }
            }
            i++;
        }
        return a.toString();
    }

    C0821a m3841a() {
        return new C0821a();
    }

    String m3842a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        C0821a a = m3841a();
        PriorityQueue priorityQueue = new PriorityQueue(this.f2432b, new C08202(this));
        for (String b : split) {
            String[] b2 = ao.m3848b(b);
            if (b2.length >= this.f2431a) {
                aq.m3856a(b2, this.f2432b, this.f2431a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                a.m3839a(this.f2434d.mo589a(((C0822a) it.next()).f2437b));
            } catch (Throwable e) {
                C0691b.m3098b("Error while writing hash to byteStream", e);
            }
        }
        return a.toString();
    }

    public String m3843a(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((String) it.next()).toLowerCase(Locale.US));
            stringBuffer.append('\n');
        }
        switch (this.f2433c) {
            case 0:
                return m3842a(stringBuffer.toString());
            case 1:
                return m3840b(stringBuffer.toString());
            default:
                return "";
        }
    }
}
