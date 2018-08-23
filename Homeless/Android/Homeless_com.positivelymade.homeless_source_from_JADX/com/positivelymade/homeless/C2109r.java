package com.positivelymade.homeless;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;

public class C2109r extends BaseAdapter {
    private static LayoutInflater f7116e = null;
    public Context f7117a;
    public Typeface f7118b;
    public Typeface f7119c;
    private ArrayList<C2110s> f7120d = new ArrayList();

    static class C2108a {
        ImageView f7112a;
        TextView f7113b;
        TextView f7114c;
        ProgressBar f7115d;

        C2108a() {
        }
    }

    public C2109r(Context context) {
        this.f7117a = context;
        f7116e = LayoutInflater.from(this.f7117a);
    }

    public ArrayList<C2110s> m10200a() {
        return this.f7120d;
    }

    public void m10201a(C2110s c2110s) {
        this.f7120d.add(c2110s);
        notifyDataSetChanged();
    }

    public void m10202b() {
        this.f7120d.clear();
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f7120d.size();
    }

    public Object getItem(int i) {
        return this.f7120d.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C2108a c2108a;
        C2110s c2110s = (C2110s) this.f7120d.get(i);
        this.f7118b = Typeface.createFromAsset(this.f7117a.getAssets(), "fonts/caviar_dreams.ttf");
        this.f7119c = Typeface.createFromAsset(this.f7117a.getAssets(), "fonts/caviar_dreams_bold.ttf");
        if (view == null) {
            C2108a c2108a2 = new C2108a();
            if (c2110s.m10203a().equals("Hunger")) {
                view = f7116e.inflate(R.layout.vitals_view_hunger, viewGroup, false);
            } else if (c2110s.m10203a().equals("Health")) {
                view = f7116e.inflate(R.layout.vitals_view_health, viewGroup, false);
            }
            c2108a2.f7113b = (TextView) view.findViewById(R.id.mH_Name);
            c2108a2.f7113b.setTypeface(this.f7119c);
            c2108a2.f7112a = (ImageView) view.findViewById(R.id.mH_Image);
            c2108a2.f7114c = (TextView) view.findViewById(R.id.mH_Value);
            c2108a2.f7114c.setTypeface(this.f7119c);
            if (c2110s.m10203a().equals("Hunger")) {
                c2108a2.f7115d = (ProgressBar) view.findViewById(R.id.mHu_Progress);
            } else if (c2110s.m10203a().equals("Health")) {
                c2108a2.f7115d = (ProgressBar) view.findViewById(R.id.mHe_Progress);
            }
            view.setTag(c2108a2);
            c2108a = c2108a2;
        } else {
            c2108a = (C2108a) view.getTag();
        }
        c2108a.f7113b.setText(c2110s.m10203a());
        c2108a.f7112a.setImageBitmap(c2110s.m10207b());
        c2108a.f7114c.setText(c2110s.m10209c());
        c2108a.f7115d.setProgress(Integer.parseInt(c2110s.m10209c().substring(0, c2110s.m10209c().lastIndexOf("/"))));
        return view;
    }
}
