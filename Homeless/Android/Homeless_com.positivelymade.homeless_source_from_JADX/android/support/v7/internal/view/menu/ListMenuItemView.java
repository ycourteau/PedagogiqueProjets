package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.view.menu.C0294k.C0291a;
import android.support.v7.p010b.C0275a.C0270e;
import android.support.v7.p010b.C0275a.C0272g;
import android.support.v7.p010b.C0275a.C0274i;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout implements C0291a {
    private C0303f f549a;
    private ImageView f550b;
    private RadioButton f551c;
    private TextView f552d;
    private CheckBox f553e;
    private TextView f554f;
    private Drawable f555g;
    private int f556h;
    private Context f557i;
    private boolean f558j;
    private int f559k;
    private Context f560l;
    private LayoutInflater f561m;
    private boolean f562n;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f560l = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0274i.MenuView, i, 0);
        this.f555g = obtainStyledAttributes.getDrawable(C0274i.MenuView_android_itemBackground);
        this.f556h = obtainStyledAttributes.getResourceId(C0274i.MenuView_android_itemTextAppearance, -1);
        this.f558j = obtainStyledAttributes.getBoolean(C0274i.MenuView_preserveIconSpacing, false);
        this.f557i = context;
        obtainStyledAttributes.recycle();
    }

    private void m1298b() {
        this.f550b = (ImageView) getInflater().inflate(C0272g.abc_list_menu_item_icon, this, false);
        addView(this.f550b, 0);
    }

    private void m1299c() {
        this.f551c = (RadioButton) getInflater().inflate(C0272g.abc_list_menu_item_radio, this, false);
        addView(this.f551c);
    }

    private void m1300d() {
        this.f553e = (CheckBox) getInflater().inflate(C0272g.abc_list_menu_item_checkbox, this, false);
        addView(this.f553e);
    }

    private LayoutInflater getInflater() {
        if (this.f561m == null) {
            this.f561m = LayoutInflater.from(this.f560l);
        }
        return this.f561m;
    }

    public void mo205a(C0303f c0303f, int i) {
        this.f549a = c0303f;
        this.f559k = i;
        setVisibility(c0303f.isVisible() ? 0 : 8);
        setTitle(c0303f.m1390a((C0291a) this));
        setCheckable(c0303f.isCheckable());
        m1302a(c0303f.m1403f(), c0303f.m1399d());
        setIcon(c0303f.getIcon());
        setEnabled(c0303f.isEnabled());
    }

    public void m1302a(boolean z, char c) {
        int i = (z && this.f549a.m1403f()) ? 0 : 8;
        if (i == 0) {
            this.f554f.setText(this.f549a.m1401e());
        }
        if (this.f554f.getVisibility() != i) {
            this.f554f.setVisibility(i);
        }
    }

    public boolean mo206a() {
        return false;
    }

    public C0303f getItemData() {
        return this.f549a;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundDrawable(this.f555g);
        this.f552d = (TextView) findViewById(C0270e.title);
        if (this.f556h != -1) {
            this.f552d.setTextAppearance(this.f557i, this.f556h);
        }
        this.f554f = (TextView) findViewById(C0270e.shortcut);
    }

    protected void onMeasure(int i, int i2) {
        if (this.f550b != null && this.f558j) {
            LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f550b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        if (z || this.f551c != null || this.f553e != null) {
            CompoundButton compoundButton;
            CompoundButton compoundButton2;
            if (this.f549a.m1404g()) {
                if (this.f551c == null) {
                    m1299c();
                }
                compoundButton = this.f551c;
                compoundButton2 = this.f553e;
            } else {
                if (this.f553e == null) {
                    m1300d();
                }
                compoundButton = this.f553e;
                compoundButton2 = this.f551c;
            }
            if (z) {
                compoundButton.setChecked(this.f549a.isChecked());
                int i = z ? 0 : 8;
                if (compoundButton.getVisibility() != i) {
                    compoundButton.setVisibility(i);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                    return;
                }
                return;
            }
            if (this.f553e != null) {
                this.f553e.setVisibility(8);
            }
            if (this.f551c != null) {
                this.f551c.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f549a.m1404g()) {
            if (this.f551c == null) {
                m1299c();
            }
            compoundButton = this.f551c;
        } else {
            if (this.f553e == null) {
                m1300d();
            }
            compoundButton = this.f553e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f562n = z;
        this.f558j = z;
    }

    public void setIcon(Drawable drawable) {
        int i = (this.f549a.m1406i() || this.f562n) ? 1 : 0;
        if (i == 0 && !this.f558j) {
            return;
        }
        if (this.f550b != null || drawable != null || this.f558j) {
            if (this.f550b == null) {
                m1298b();
            }
            if (drawable != null || this.f558j) {
                ImageView imageView = this.f550b;
                if (i == 0) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f550b.getVisibility() != 0) {
                    this.f550b.setVisibility(0);
                    return;
                }
                return;
            }
            this.f550b.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f552d.setText(charSequence);
            if (this.f552d.getVisibility() != 0) {
                this.f552d.setVisibility(0);
            }
        } else if (this.f552d.getVisibility() != 8) {
            this.f552d.setVisibility(8);
        }
    }
}
