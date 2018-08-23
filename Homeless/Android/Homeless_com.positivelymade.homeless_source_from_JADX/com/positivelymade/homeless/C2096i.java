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

public class C2096i extends BaseAdapter {
    private static LayoutInflater f7073e = null;
    public Context f7074a;
    public Typeface f7075b;
    public Typeface f7076c;
    private ArrayList<C2097j> f7077d = new ArrayList();

    static class C2095a {
        TextView f7070a;
        TextView f7071b;
        ImageView f7072c;

        C2095a() {
        }
    }

    public C2096i(Context context) {
        this.f7074a = context;
        f7073e = LayoutInflater.from(this.f7074a);
    }

    public ArrayList<C2097j> m10164a() {
        return this.f7077d;
    }

    public void m10165a(C2097j c2097j) {
        this.f7077d.add(c2097j);
        notifyDataSetChanged();
    }

    public void m10166b() {
        this.f7077d.clear();
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f7077d.size();
    }

    public Object getItem(int i) {
        return this.f7077d.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C2095a c2095a;
        C2097j c2097j = (C2097j) this.f7077d.get(i);
        this.f7075b = Typeface.createFromAsset(this.f7074a.getAssets(), "fonts/caviar_dreams.ttf");
        this.f7076c = Typeface.createFromAsset(this.f7074a.getAssets(), "fonts/caviar_dreams_bold.ttf");
        if (view == null) {
            C2095a c2095a2 = new C2095a();
            view = f7073e.inflate(R.layout.development_list, viewGroup, false);
            c2095a2.f7070a = (TextView) view.findViewById(R.id.mL_Name);
            c2095a2.f7070a.setTypeface(this.f7076c);
            c2095a2.f7071b = (TextView) view.findViewById(R.id.mL_Price);
            c2095a2.f7071b.setTypeface(this.f7075b);
            c2095a2.f7072c = (ImageView) view.findViewById(R.id.mL_Image);
            view.setTag(c2095a2);
            c2095a = c2095a2;
        } else {
            c2095a = (C2095a) view.getTag();
        }
        c2095a.f7070a.setText(c2097j.m10167a());
        c2095a.f7071b.setText(c2097j.m10170b());
        c2095a.f7072c.setImageBitmap(c2097j.m10172c());
        return view;
    }
}
