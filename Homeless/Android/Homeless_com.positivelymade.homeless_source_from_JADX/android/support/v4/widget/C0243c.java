package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

class C0243c extends Filter {
    C0241a f466a;

    interface C0241a {
        Cursor mo183a();

        Cursor mo184a(CharSequence charSequence);

        void mo185a(Cursor cursor);

        CharSequence mo186c(Cursor cursor);
    }

    C0243c(C0241a c0241a) {
        this.f466a = c0241a;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f466a.mo186c((Cursor) obj);
    }

    protected FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f466a.mo184a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a = this.f466a.mo183a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f466a.mo185a((Cursor) filterResults.values);
        }
    }
}
