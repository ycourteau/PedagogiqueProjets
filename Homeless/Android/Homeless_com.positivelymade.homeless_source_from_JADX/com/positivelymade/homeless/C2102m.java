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

public class C2102m extends BaseAdapter {
    private static LayoutInflater f7092e = null;
    public Context f7093a;
    public Typeface f7094b;
    public Typeface f7095c;
    private ArrayList<C2103n> f7096d = new ArrayList();

    static class C2101a {
        TextView f7090a;
        ImageView f7091b;

        C2101a() {
        }
    }

    public C2102m(Context context) {
        this.f7093a = context;
        f7092e = LayoutInflater.from(this.f7093a);
    }

    public ArrayList<C2103n> m10180a() {
        return this.f7096d;
    }

    public void m10181a(C2103n c2103n) {
        this.f7096d.add(c2103n);
        notifyDataSetChanged();
    }

    public void m10182b() {
        this.f7096d.clear();
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f7096d.size();
    }

    public Object getItem(int i) {
        return this.f7096d.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C2101a c2101a;
        C2103n c2103n = (C2103n) this.f7096d.get(i);
        this.f7094b = Typeface.createFromAsset(this.f7093a.getAssets(), "fonts/caviar_dreams.ttf");
        this.f7095c = Typeface.createFromAsset(this.f7093a.getAssets(), "fonts/caviar_dreams_bold.ttf");
        if (view == null) {
            C2101a c2101a2 = new C2101a();
            view = f7092e.inflate(R.layout.vitals_view_business, viewGroup, false);
            c2101a2.f7090a = (TextView) view.findViewById(R.id.mHB_Title);
            c2101a2.f7090a.setTypeface(this.f7095c);
            c2101a2.f7091b = (ImageView) view.findViewById(R.id.mHB_Image);
            view.setTag(c2101a2);
            c2101a = c2101a2;
        } else {
            c2101a = (C2101a) view.getTag();
        }
        c2101a.f7090a.setText(c2103n.m10183a());
        c2101a.f7091b.setImageBitmap(c2103n.m10186b());
        return view;
    }
}
