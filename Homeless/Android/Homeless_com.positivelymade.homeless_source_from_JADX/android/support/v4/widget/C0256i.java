package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class C0256i extends C0242b {
    private int f471j;
    private int f472k;
    private LayoutInflater f473l;

    public C0256i(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f472k = i;
        this.f471j = i;
        this.f473l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View mo198a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f473l.inflate(this.f471j, viewGroup, false);
    }

    public View mo199b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f473l.inflate(this.f472k, viewGroup, false);
    }
}
