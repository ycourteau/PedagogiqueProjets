package com.google.android.gms.p028c;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class io {
    public static long m5275a(InputStream inputStream, OutputStream outputStream) {
        return io.m5276a(inputStream, outputStream, false);
    }

    public static long m5276a(InputStream inputStream, OutputStream outputStream, boolean z) {
        return io.m5277a(inputStream, outputStream, z, 1024);
    }

    public static long m5277a(InputStream inputStream, OutputStream outputStream, boolean z, int i) {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, bArr.length);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } finally {
                if (z) {
                    io.m5278a((Closeable) inputStream);
                    io.m5278a((Closeable) outputStream);
                }
            }
        }
        return j;
    }

    public static void m5278a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    public static byte[] m5279a(InputStream inputStream) {
        return io.m5280a(inputStream, true);
    }

    public static byte[] m5280a(InputStream inputStream, boolean z) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        io.m5276a(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }
}
