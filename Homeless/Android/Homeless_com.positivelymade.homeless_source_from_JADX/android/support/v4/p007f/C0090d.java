package android.support.v4.p007f;

import android.util.Log;
import java.io.Writer;

public class C0090d extends Writer {
    private final String f275a;
    private StringBuilder f276b = new StringBuilder(128);

    public C0090d(String str) {
        this.f275a = str;
    }

    private void m475a() {
        if (this.f276b.length() > 0) {
            Log.d(this.f275a, this.f276b.toString());
            this.f276b.delete(0, this.f276b.length());
        }
    }

    public void close() {
        m475a();
    }

    public void flush() {
        m475a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m475a();
            } else {
                this.f276b.append(c);
            }
        }
    }
}
