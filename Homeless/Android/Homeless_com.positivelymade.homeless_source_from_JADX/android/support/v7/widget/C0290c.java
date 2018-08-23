package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.internal.p014a.C0278a;
import android.support.v7.p010b.C0275a.C0274i;
import android.util.AttributeSet;
import android.widget.TextView;

public class C0290c extends TextView {
    public C0290c(Context context) {
        this(context, null);
    }

    public C0290c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0290c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0274i.AppCompatTextView, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C0274i.AppCompatTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            obtainStyledAttributes = context.obtainStyledAttributes(resourceId, C0274i.TextAppearance);
            if (obtainStyledAttributes.hasValue(C0274i.TextAppearance_textAllCaps)) {
                setAllCaps(obtainStyledAttributes.getBoolean(C0274i.TextAppearance_textAllCaps, false));
            }
            obtainStyledAttributes.recycle();
        }
        obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0274i.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C0274i.AppCompatTextView_textAllCaps)) {
            setAllCaps(obtainStyledAttributes.getBoolean(C0274i.AppCompatTextView_textAllCaps, false));
        }
        obtainStyledAttributes.recycle();
    }

    public void setAllCaps(boolean z) {
        setTransformationMethod(z ? new C0278a(getContext()) : null);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C0274i.TextAppearance);
        if (obtainStyledAttributes.hasValue(C0274i.TextAppearance_textAllCaps)) {
            setAllCaps(obtainStyledAttributes.getBoolean(C0274i.TextAppearance_textAllCaps, false));
        }
        obtainStyledAttributes.recycle();
    }
}
