package android.support.v4.view;

import android.view.MotionEvent;

class C0215t {
    public static int m987a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    public static int m988b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    public static float m989c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    public static float m990d(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }
}
