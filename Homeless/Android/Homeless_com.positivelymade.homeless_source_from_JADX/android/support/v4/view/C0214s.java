package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MotionEvent;

public class C0214s {
    static final C0209e f418a;

    interface C0209e {
        int mo154a(MotionEvent motionEvent, int i);

        int mo155b(MotionEvent motionEvent, int i);

        float mo156c(MotionEvent motionEvent, int i);

        float mo157d(MotionEvent motionEvent, int i);
    }

    static class C0210a implements C0209e {
        C0210a() {
        }

        public int mo154a(MotionEvent motionEvent, int i) {
            return i == 0 ? 0 : -1;
        }

        public int mo155b(MotionEvent motionEvent, int i) {
            if (i == 0) {
                return 0;
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }

        public float mo156c(MotionEvent motionEvent, int i) {
            if (i == 0) {
                return motionEvent.getX();
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }

        public float mo157d(MotionEvent motionEvent, int i) {
            if (i == 0) {
                return motionEvent.getY();
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }
    }

    static class C0211b extends C0210a {
        C0211b() {
        }

        public int mo154a(MotionEvent motionEvent, int i) {
            return C0215t.m987a(motionEvent, i);
        }

        public int mo155b(MotionEvent motionEvent, int i) {
            return C0215t.m988b(motionEvent, i);
        }

        public float mo156c(MotionEvent motionEvent, int i) {
            return C0215t.m989c(motionEvent, i);
        }

        public float mo157d(MotionEvent motionEvent, int i) {
            return C0215t.m990d(motionEvent, i);
        }
    }

    static class C0212c extends C0211b {
        C0212c() {
        }
    }

    static class C0213d extends C0212c {
        C0213d() {
        }
    }

    static {
        if (VERSION.SDK_INT >= 12) {
            f418a = new C0213d();
        } else if (VERSION.SDK_INT >= 9) {
            f418a = new C0212c();
        } else if (VERSION.SDK_INT >= 5) {
            f418a = new C0211b();
        } else {
            f418a = new C0210a();
        }
    }

    public static int m981a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    public static int m982a(MotionEvent motionEvent, int i) {
        return f418a.mo154a(motionEvent, i);
    }

    public static int m983b(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    public static int m984b(MotionEvent motionEvent, int i) {
        return f418a.mo155b(motionEvent, i);
    }

    public static float m985c(MotionEvent motionEvent, int i) {
        return f418a.mo156c(motionEvent, i);
    }

    public static float m986d(MotionEvent motionEvent, int i) {
        return f418a.mo157d(motionEvent, i);
    }
}
