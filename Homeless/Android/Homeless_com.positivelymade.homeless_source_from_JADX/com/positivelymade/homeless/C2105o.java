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

public class C2105o extends BaseAdapter {
    private static LayoutInflater f7102e = null;
    public Context f7103a;
    public Typeface f7104b;
    public Typeface f7105c;
    private ArrayList<C2106p> f7106d = new ArrayList();

    static class C2104a {
        TextView f7099a;
        TextView f7100b;
        ImageView f7101c;

        C2104a() {
        }
    }

    public C2105o(Context context) {
        this.f7103a = context;
        f7102e = LayoutInflater.from(this.f7103a);
    }

    public ArrayList<C2106p> m10187a() {
        return this.f7106d;
    }

    public void m10188a(C2106p c2106p) {
        this.f7106d.add(c2106p);
        notifyDataSetChanged();
    }

    public void m10189b() {
        this.f7106d.clear();
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f7106d.size();
    }

    public Object getItem(int i) {
        return this.f7106d.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C2104a c2104a;
        C2106p c2106p = (C2106p) this.f7106d.get(i);
        this.f7104b = Typeface.createFromAsset(this.f7103a.getAssets(), "fonts/caviar_dreams.ttf");
        this.f7105c = Typeface.createFromAsset(this.f7103a.getAssets(), "fonts/caviar_dreams_bold.ttf");
        if (view == null) {
            C2104a c2104a2 = new C2104a();
            view = f7102e.inflate(R.layout.possessions_list, viewGroup, false);
            c2104a2.f7099a = (TextView) view.findViewById(R.id.mL_Name);
            c2104a2.f7099a.setTypeface(this.f7105c);
            c2104a2.f7100b = (TextView) view.findViewById(R.id.mL_Price);
            c2104a2.f7100b.setTypeface(this.f7104b);
            c2104a2.f7101c = (ImageView) view.findViewById(R.id.mL_Image);
            view.setTag(c2104a2);
            c2104a = c2104a2;
        } else {
            c2104a = (C2104a) view.getTag();
        }
        c2104a.f7099a.setText(c2106p.m10190a());
        c2104a.f7100b.setText(c2106p.m10193b());
        c2104a.f7101c.setImageBitmap(c2106p.m10195c());
        return view;
    }
}
