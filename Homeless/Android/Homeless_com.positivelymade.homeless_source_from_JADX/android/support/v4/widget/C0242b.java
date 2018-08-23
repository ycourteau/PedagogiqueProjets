package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.v4.widget.C0243c.C0241a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

public abstract class C0242b extends BaseAdapter implements C0241a, Filterable {
    protected boolean f457a;
    protected boolean f458b;
    protected Cursor f459c;
    protected Context f460d;
    protected int f461e;
    protected C0239a f462f;
    protected DataSetObserver f463g;
    protected C0243c f464h;
    protected FilterQueryProvider f465i;

    private class C0239a extends ContentObserver {
        final /* synthetic */ C0242b f455a;

        public C0239a(C0242b c0242b) {
            this.f455a = c0242b;
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            this.f455a.m1158b();
        }
    }

    private class C0240b extends DataSetObserver {
        final /* synthetic */ C0242b f456a;

        private C0240b(C0242b c0242b) {
            this.f456a = c0242b;
        }

        public void onChanged() {
            this.f456a.f457a = true;
            this.f456a.notifyDataSetChanged();
        }

        public void onInvalidated() {
            this.f456a.f457a = false;
            this.f456a.notifyDataSetInvalidated();
        }
    }

    public C0242b(Context context, Cursor cursor, boolean z) {
        m1153a(context, cursor, z ? 1 : 2);
    }

    public Cursor mo183a() {
        return this.f459c;
    }

    public Cursor mo184a(CharSequence charSequence) {
        return this.f465i != null ? this.f465i.runQuery(charSequence) : this.f459c;
    }

    public abstract View mo198a(Context context, Cursor cursor, ViewGroup viewGroup);

    void m1153a(Context context, Cursor cursor, int i) {
        boolean z = true;
        if ((i & 1) == 1) {
            i |= 2;
            this.f458b = true;
        } else {
            this.f458b = false;
        }
        if (cursor == null) {
            z = false;
        }
        this.f459c = cursor;
        this.f457a = z;
        this.f460d = context;
        this.f461e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f462f = new C0239a(this);
            this.f463g = new C0240b();
        } else {
            this.f462f = null;
            this.f463g = null;
        }
        if (z) {
            if (this.f462f != null) {
                cursor.registerContentObserver(this.f462f);
            }
            if (this.f463g != null) {
                cursor.registerDataSetObserver(this.f463g);
            }
        }
    }

    public void mo185a(Cursor cursor) {
        Cursor b = m1156b(cursor);
        if (b != null) {
            b.close();
        }
    }

    public abstract void mo318a(View view, Context context, Cursor cursor);

    public Cursor m1156b(Cursor cursor) {
        if (cursor == this.f459c) {
            return null;
        }
        Cursor cursor2 = this.f459c;
        if (cursor2 != null) {
            if (this.f462f != null) {
                cursor2.unregisterContentObserver(this.f462f);
            }
            if (this.f463g != null) {
                cursor2.unregisterDataSetObserver(this.f463g);
            }
        }
        this.f459c = cursor;
        if (cursor != null) {
            if (this.f462f != null) {
                cursor.registerContentObserver(this.f462f);
            }
            if (this.f463g != null) {
                cursor.registerDataSetObserver(this.f463g);
            }
            this.f461e = cursor.getColumnIndexOrThrow("_id");
            this.f457a = true;
            notifyDataSetChanged();
            return cursor2;
        }
        this.f461e = -1;
        this.f457a = false;
        notifyDataSetInvalidated();
        return cursor2;
    }

    public View mo199b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo198a(context, cursor, viewGroup);
    }

    protected void m1158b() {
        if (this.f458b && this.f459c != null && !this.f459c.isClosed()) {
            this.f457a = this.f459c.requery();
        }
    }

    public CharSequence mo186c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public int getCount() {
        return (!this.f457a || this.f459c == null) ? 0 : this.f459c.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f457a) {
            return null;
        }
        this.f459c.moveToPosition(i);
        if (view == null) {
            view = mo199b(this.f460d, this.f459c, viewGroup);
        }
        mo318a(view, this.f460d, this.f459c);
        return view;
    }

    public Filter getFilter() {
        if (this.f464h == null) {
            this.f464h = new C0243c(this);
        }
        return this.f464h;
    }

    public Object getItem(int i) {
        if (!this.f457a || this.f459c == null) {
            return null;
        }
        this.f459c.moveToPosition(i);
        return this.f459c;
    }

    public long getItemId(int i) {
        return (this.f457a && this.f459c != null && this.f459c.moveToPosition(i)) ? this.f459c.getLong(this.f461e) : 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f457a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f459c.moveToPosition(i)) {
            if (view == null) {
                view = mo198a(this.f460d, this.f459c, viewGroup);
            }
            mo318a(view, this.f460d, this.f459c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    public boolean hasStableIds() {
        return true;
    }
}
