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

public class C2094h extends BaseAdapter {
    private static LayoutInflater f7065e = null;
    public Context f7066a;
    public Typeface f7067b;
    public Typeface f7068c;
    private ArrayList<C2097j> f7069d = new ArrayList();

    static class C2093a {
        TextView f7062a;
        TextView f7063b;
        ImageView f7064c;

        C2093a() {
        }
    }

    public C2094h(Context context) {
        this.f7066a = context;
        f7065e = LayoutInflater.from(this.f7066a);
    }

    public ArrayList<C2097j> m10161a() {
        return this.f7069d;
    }

    public void m10162a(C2097j c2097j) {
        this.f7069d.add(c2097j);
        notifyDataSetChanged();
    }

    public void m10163b() {
        this.f7069d.clear();
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f7069d.size();
    }

    public Object getItem(int i) {
        return this.f7069d.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C2093a c2093a;
        C2097j c2097j = (C2097j) this.f7069d.get(i);
        this.f7067b = Typeface.createFromAsset(this.f7066a.getAssets(), "fonts/caviar_dreams.ttf");
        this.f7068c = Typeface.createFromAsset(this.f7066a.getAssets(), "fonts/caviar_dreams_bold.ttf");
        if (view == null) {
            C2093a c2093a2 = new C2093a();
            view = f7065e.inflate(R.layout.development_criminal_list, viewGroup, false);
            c2093a2.f7062a = (TextView) view.findViewById(R.id.mL_Name);
            c2093a2.f7062a.setTypeface(this.f7068c);
            c2093a2.f7063b = (TextView) view.findViewById(R.id.mL_Price);
            c2093a2.f7063b.setTypeface(this.f7067b);
            c2093a2.f7064c = (ImageView) view.findViewById(R.id.mL_Image);
            view.setTag(c2093a2);
            c2093a = c2093a2;
        } else {
            c2093a = (C2093a) view.getTag();
        }
        c2093a.f7062a.setText(c2097j.m10167a());
        c2093a.f7063b.setText(c2097j.m10170b());
        c2093a.f7064c.setImageBitmap(c2097j.m10172c());
        return view;
    }
}
