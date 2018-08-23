package com.google.android.gms.p028c;

import com.google.android.gms.ads.internal.util.client.C0691b;
import java.util.PriorityQueue;

public class aq {

    public static class C0822a {
        final long f2436a;
        final String f2437b;

        C0822a(long j, String str) {
            this.f2436a = j;
            this.f2437b = str;
        }

        public boolean equals(Object obj) {
            return obj != null && (obj instanceof C0822a) && ((C0822a) obj).f2436a == this.f2436a;
        }

        public int hashCode() {
            return (int) this.f2436a;
        }
    }

    static long m3852a(int i, int i2, long j, long j2, long j3) {
        return ((((((j + 1073807359) - ((((((long) i) + 2147483647L) % 1073807359) * j2) % 1073807359)) % 1073807359) * j3) % 1073807359) + ((((long) i2) + 2147483647L) % 1073807359)) % 1073807359;
    }

    static long m3853a(long j, int i) {
        return i == 0 ? 1 : i != 1 ? i % 2 == 0 ? aq.m3853a((j * j) % 1073807359, i / 2) % 1073807359 : ((aq.m3853a((j * j) % 1073807359, i / 2) % 1073807359) * j) % 1073807359 : j;
    }

    static String m3854a(String[] strArr, int i, int i2) {
        if (strArr.length < i + i2) {
            C0691b.m3097b("Unable to construct shingle");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 < (i + i2) - 1; i3++) {
            stringBuffer.append(strArr[i3]);
            stringBuffer.append(' ');
        }
        stringBuffer.append(strArr[(i + i2) - 1]);
        return stringBuffer.toString();
    }

    static void m3855a(int i, long j, String str, PriorityQueue<C0822a> priorityQueue) {
        C0822a c0822a = new C0822a(j, str);
        if ((priorityQueue.size() != i || ((C0822a) priorityQueue.peek()).f2436a <= c0822a.f2436a) && !priorityQueue.contains(c0822a)) {
            priorityQueue.add(c0822a);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static void m3856a(String[] strArr, int i, int i2, PriorityQueue<C0822a> priorityQueue) {
        long b = aq.m3857b(strArr, 0, i2);
        aq.m3855a(i, b, aq.m3854a(strArr, 0, i2), (PriorityQueue) priorityQueue);
        long a = aq.m3853a(16785407, i2 - 1);
        for (int i3 = 1; i3 < (strArr.length - i2) + 1; i3++) {
            b = aq.m3852a(ao.m3844a(strArr[i3 - 1]), ao.m3844a(strArr[(i3 + i2) - 1]), b, a, 16785407);
            aq.m3855a(i, b, aq.m3854a(strArr, i3, i2), (PriorityQueue) priorityQueue);
        }
    }

    private static long m3857b(String[] strArr, int i, int i2) {
        long a = (((long) ao.m3844a(strArr[i])) + 2147483647L) % 1073807359;
        for (int i3 = i + 1; i3 < i + i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((((long) ao.m3844a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }
}
