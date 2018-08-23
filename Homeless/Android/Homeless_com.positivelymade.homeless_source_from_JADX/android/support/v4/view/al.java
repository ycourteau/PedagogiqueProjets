package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;

class al {
    public static void m871a(View view) {
        view.animate().cancel();
    }

    public static void m872a(View view, float f) {
        view.animate().translationX(f);
    }

    public static void m873a(View view, long j) {
        view.animate().setDuration(j);
    }

    public static void m874a(final View view, final an anVar) {
        if (anVar != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                public void onAnimationCancel(Animator animator) {
                    anVar.mo142c(view);
                }

                public void onAnimationEnd(Animator animator) {
                    anVar.mo141b(view);
                }

                public void onAnimationStart(Animator animator) {
                    anVar.mo140a(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    public static void m875a(View view, Interpolator interpolator) {
        view.animate().setInterpolator(interpolator);
    }

    public static void m876b(View view) {
        view.animate().start();
    }

    public static void m877b(View view, float f) {
        view.animate().translationY(f);
    }

    public static void m878c(View view, float f) {
        view.animate().scaleY(f);
    }
}
