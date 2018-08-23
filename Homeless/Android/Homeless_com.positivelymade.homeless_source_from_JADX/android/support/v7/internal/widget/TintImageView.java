package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class TintImageView extends ImageView {
    private static final int[] f884a = new int[]{16842964, 16843033};
    private final C0376p f885b;

    public TintImageView(Context context) {
        this(context, null);
    }

    public TintImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TintImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0377q a = C0377q.m1724a(getContext(), attributeSet, f884a, i, 0);
        if (a.m1726a() > 0) {
            if (a.m1737d(0)) {
                setBackgroundDrawable(a.m1728a(0));
            }
            if (a.m1737d(1)) {
                setImageDrawable(a.m1728a(1));
            }
        }
        a.m1732b();
        this.f885b = a.m1734c();
    }

    public void setImageResource(int i) {
        setImageDrawable(this.f885b.m1718a(i));
    }
}
