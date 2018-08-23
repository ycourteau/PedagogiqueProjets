package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class C0035v {
    private DataSetObservable f194a = new DataSetObservable();

    public int m261a(Object obj) {
        return -1;
    }

    public Parcelable mo27a() {
        return null;
    }

    public Object m263a(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object mo28a(ViewGroup viewGroup, int i) {
        return m263a((View) viewGroup, i);
    }

    public void m265a(DataSetObserver dataSetObserver) {
        this.f194a.registerObserver(dataSetObserver);
    }

    public void mo29a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void m267a(View view) {
    }

    public void m268a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void mo30a(ViewGroup viewGroup) {
        m267a((View) viewGroup);
    }

    public void mo31a(ViewGroup viewGroup, int i, Object obj) {
        m268a((View) viewGroup, i, obj);
    }

    public abstract boolean mo32a(View view, Object obj);

    public abstract int mo1671b();

    public void m273b(DataSetObserver dataSetObserver) {
        this.f194a.unregisterObserver(dataSetObserver);
    }

    public void m274b(View view) {
    }

    public void m275b(View view, int i, Object obj) {
    }

    public void mo33b(ViewGroup viewGroup) {
        m274b((View) viewGroup);
    }

    public void mo34b(ViewGroup viewGroup, int i, Object obj) {
        m275b((View) viewGroup, i, obj);
    }

    public float m278c(int i) {
        return 1.0f;
    }
}
