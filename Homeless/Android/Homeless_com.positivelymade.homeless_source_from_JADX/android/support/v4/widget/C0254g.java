package android.support.v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.PopupWindow;

public class C0254g {
    static final C0251c f470a;

    interface C0251c {
        void mo197a(PopupWindow popupWindow, View view, int i, int i2, int i3);
    }

    static class C0252a implements C0251c {
        C0252a() {
        }

        public void mo197a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2);
        }
    }

    static class C0253b extends C0252a {
        C0253b() {
        }

        public void mo197a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            C0255h.m1201a(popupWindow, view, i, i2, i3);
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f470a = new C0253b();
        } else {
            f470a = new C0252a();
        }
    }

    public static void m1200a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        f470a.mo197a(popupWindow, view, i, i2, i3);
    }
}
