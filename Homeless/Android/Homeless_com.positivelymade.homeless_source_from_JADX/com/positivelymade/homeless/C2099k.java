package com.positivelymade.homeless;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class C2099k extends BaseAdapter {
    private static LayoutInflater f7083e = null;
    public Context f7084a;
    public Typeface f7085b;
    public Typeface f7086c;
    private ArrayList<C2100l> f7087d = new ArrayList();

    static class C2098a {
        TextView f7081a;
        ImageView f7082b;

        C2098a() {
        }
    }

    public C2099k(Context context) {
        this.f7084a = context;
        f7083e = LayoutInflater.from(this.f7084a);
    }

    public ArrayList<C2100l> m10173a() {
        return this.f7087d;
    }

    public void m10174a(C2100l c2100l) {
        this.f7087d.add(c2100l);
        notifyDataSetChanged();
    }

    public void m10175b() {
        this.f7087d.clear();
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f7087d.size();
    }

    public Object getItem(int i) {
        return this.f7087d.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C2098a c2098a;
        C2100l c2100l = (C2100l) this.f7087d.get(i);
        this.f7085b = Typeface.createFromAsset(this.f7084a.getAssets(), "fonts/caviar_dreams.ttf");
        this.f7086c = Typeface.createFromAsset(this.f7084a.getAssets(), "fonts/caviar_dreams_bold.ttf");
        if (view == null) {
            C2098a c2098a2 = new C2098a();
            view = f7083e.inflate(R.layout.vitals_view_business, viewGroup, false);
            c2098a2.f7081a = (TextView) view.findViewById(R.id.mHB_Title);
            c2098a2.f7081a.setTypeface(this.f7086c);
            c2098a2.f7082b = (ImageView) view.findViewById(R.id.mHB_Image);
            view.setTag(c2098a2);
            c2098a = c2098a2;
        } else {
            c2098a = (C2098a) view.getTag();
        }
        c2098a.f7081a.setText(c2100l.m10176a());
        c2098a.f7082b.setImageBitmap(c2100l.m10179b());
        return view;
    }
}
