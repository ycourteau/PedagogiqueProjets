package com.positivelymade.homeless;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class C2092g extends BaseAdapter {
    private static LayoutInflater f7057e = null;
    public Context f7058a;
    public Typeface f7059b;
    public Typeface f7060c;
    private ArrayList<C2107q> f7061d = new ArrayList();

    static class C2091a {
        TextView f7055a;
        TextView f7056b;

        C2091a() {
        }
    }

    public C2092g(Context context) {
        this.f7058a = context;
        f7057e = LayoutInflater.from(this.f7058a);
    }

    public ArrayList<C2107q> m10158a() {
        return this.f7061d;
    }

    public void m10159a(C2107q c2107q) {
        this.f7061d.add(c2107q);
        notifyDataSetChanged();
    }

    public void m10160b() {
        this.f7061d.clear();
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f7061d.size();
    }

    public Object getItem(int i) {
        return this.f7061d.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C2091a c2091a;
        C2107q c2107q = (C2107q) this.f7061d.get(i);
        this.f7059b = Typeface.createFromAsset(this.f7058a.getAssets(), "fonts/caviar_dreams.ttf");
        this.f7060c = Typeface.createFromAsset(this.f7058a.getAssets(), "fonts/caviar_dreams_bold.ttf");
        if (view == null) {
            C2091a c2091a2 = new C2091a();
            view = f7057e.inflate(R.layout.vitals_v_hunger, viewGroup, false);
            c2091a2.f7055a = (TextView) view.findViewById(R.id.mHunger_Name);
            c2091a2.f7055a.setTypeface(this.f7060c);
            c2091a2.f7056b = (TextView) view.findViewById(R.id.mHunger_Price);
            c2091a2.f7056b.setTypeface(this.f7059b);
            view.setTag(c2091a2);
            c2091a = c2091a2;
        } else {
            c2091a = (C2091a) view.getTag();
        }
        c2091a.f7055a.setText(c2107q.m10196a());
        c2091a.f7056b.setText(c2107q.m10198b());
        return view;
    }
}
