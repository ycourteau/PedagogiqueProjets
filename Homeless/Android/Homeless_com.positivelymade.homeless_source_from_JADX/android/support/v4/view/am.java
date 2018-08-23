package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class am {
    public static void m879a(final View view, final an anVar) {
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
}
