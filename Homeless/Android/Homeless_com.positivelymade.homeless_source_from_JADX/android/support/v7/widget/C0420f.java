package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.p000a.C0000a;
import android.support.v4.widget.C0256i;
import android.support.v7.p010b.C0275a.C0266a;
import android.support.v7.p010b.C0275a.C0270e;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

class C0420f extends C0256i implements OnClickListener {
    private final SearchManager f1183j = ((SearchManager) this.d.getSystemService("search"));
    private final SearchView f1184k;
    private final SearchableInfo f1185l;
    private final Context f1186m;
    private final WeakHashMap<String, ConstantState> f1187n;
    private final int f1188o;
    private boolean f1189p = false;
    private int f1190q = 1;
    private ColorStateList f1191r;
    private int f1192s = -1;
    private int f1193t = -1;
    private int f1194u = -1;
    private int f1195v = -1;
    private int f1196w = -1;
    private int f1197x = -1;

    private static final class C0419a {
        public final TextView f1178a;
        public final TextView f1179b;
        public final ImageView f1180c;
        public final ImageView f1181d;
        public final ImageView f1182e;

        public C0419a(View view) {
            this.f1178a = (TextView) view.findViewById(16908308);
            this.f1179b = (TextView) view.findViewById(16908309);
            this.f1180c = (ImageView) view.findViewById(16908295);
            this.f1181d = (ImageView) view.findViewById(16908296);
            this.f1182e = (ImageView) view.findViewById(C0270e.edit_query);
        }
    }

    public C0420f(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1184k = searchView;
        this.f1185l = searchableInfo;
        this.f1188o = searchView.getSuggestionCommitIconResId();
        this.f1186m = context;
        this.f1187n = weakHashMap;
    }

    private Drawable m1922a(ComponentName componentName) {
        Object obj = null;
        String flattenToShortString = componentName.flattenToShortString();
        if (this.f1187n.containsKey(flattenToShortString)) {
            ConstantState constantState = (ConstantState) this.f1187n.get(flattenToShortString);
            return constantState == null ? null : constantState.newDrawable(this.f1186m.getResources());
        } else {
            Drawable b = m1929b(componentName);
            if (b != null) {
                obj = b.getConstantState();
            }
            this.f1187n.put(flattenToShortString, obj);
            return b;
        }
    }

    private Drawable m1923a(String str) {
        Drawable b;
        if (str == null || str.length() == 0 || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1186m.getPackageName() + "/" + parseInt;
            b = m1931b(str2);
            if (b != null) {
                return b;
            }
            b = C0000a.m0a(this.f1186m, parseInt);
            m1928a(str2, b);
            return b;
        } catch (NumberFormatException e) {
            b = m1931b(str);
            if (b != null) {
                return b;
            }
            b = m1930b(Uri.parse(str));
            m1928a(str, b);
            return b;
        } catch (NotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    private static String m1924a(Cursor cursor, int i) {
        String str = null;
        if (i != -1) {
            try {
                str = cursor.getString(i);
            } catch (Throwable e) {
                Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            }
        }
        return str;
    }

    public static String m1925a(Cursor cursor, String str) {
        return C0420f.m1924a(cursor, cursor.getColumnIndex(str));
    }

    private void m1926a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void m1927a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void m1928a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1187n.put(str, drawable.getConstantState());
        }
    }

    private Drawable m1929b(ComponentName componentName) {
        PackageManager packageManager = this.d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    private Drawable m1930b(Uri uri) {
        InputStream openInputStream;
        try {
            if ("android.resource".equals(uri.getScheme())) {
                return m1939a(uri);
            }
            openInputStream = this.f1186m.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
            try {
                openInputStream.close();
                return createFromStream;
            } catch (Throwable e) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                return createFromStream;
            }
        } catch (NotFoundException e2) {
            throw new FileNotFoundException("Resource does not exist: " + uri);
        } catch (FileNotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        } catch (Throwable th) {
            try {
                openInputStream.close();
            } catch (Throwable e4) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e4);
            }
        }
    }

    private Drawable m1931b(String str) {
        ConstantState constantState = (ConstantState) this.f1187n.get(str);
        return constantState == null ? null : constantState.newDrawable();
    }

    private CharSequence m1932b(CharSequence charSequence) {
        if (this.f1191r == null) {
            TypedValue typedValue = new TypedValue();
            this.d.getTheme().resolveAttribute(C0266a.textColorSearchUrl, typedValue, true);
            this.f1191r = this.d.getResources().getColorStateList(typedValue.resourceId);
        }
        CharSequence spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1191r, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private void m1933d(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null && !extras.getBoolean("in_progress")) {
        }
    }

    private Drawable m1934e(Cursor cursor) {
        if (this.f1195v == -1) {
            return null;
        }
        Drawable a = m1923a(cursor.getString(this.f1195v));
        return a == null ? m1936g(cursor) : a;
    }

    private Drawable m1935f(Cursor cursor) {
        return this.f1196w == -1 ? null : m1923a(cursor.getString(this.f1196w));
    }

    private Drawable m1936g(Cursor cursor) {
        Drawable a = m1922a(this.f1185l.getSearchActivity());
        return a != null ? a : this.d.getPackageManager().getDefaultActivityIcon();
    }

    Cursor m1937a(SearchableInfo searchableInfo, String str, int i) {
        if (searchableInfo == null) {
            return null;
        }
        String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        String[] strArr;
        Builder fragment = new Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
            strArr = null;
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    public Cursor mo184a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1184k.getVisibility() != 0 || this.f1184k.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor a = m1937a(this.f1185l, charSequence2, 50);
            if (a != null) {
                a.getCount();
                return a;
            }
        } catch (Throwable e) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
        }
        return null;
    }

    Drawable m1939a(Uri uri) {
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.d.getPackageManager().getResourcesForApplication(authority);
            List pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    size = Integer.parseInt((String) pathSegments.get(0));
                } catch (NumberFormatException e) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size == 2) {
                size = resourcesForApplication.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + uri);
            }
            if (size != 0) {
                return resourcesForApplication.getDrawable(size);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (NameNotFoundException e2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public View mo198a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a = super.mo198a(context, cursor, viewGroup);
        a.setTag(new C0419a(a));
        ((ImageView) a.findViewById(C0270e.edit_query)).setImageResource(this.f1188o);
        return a;
    }

    public void m1941a(int i) {
        this.f1190q = i;
    }

    public void mo185a(Cursor cursor) {
        if (this.f1189p) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo185a(cursor);
            if (cursor != null) {
                this.f1192s = cursor.getColumnIndex("suggest_text_1");
                this.f1193t = cursor.getColumnIndex("suggest_text_2");
                this.f1194u = cursor.getColumnIndex("suggest_text_2_url");
                this.f1195v = cursor.getColumnIndex("suggest_icon_1");
                this.f1196w = cursor.getColumnIndex("suggest_icon_2");
                this.f1197x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Throwable e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    public void mo318a(View view, Context context, Cursor cursor) {
        C0419a c0419a = (C0419a) view.getTag();
        int i = this.f1197x != -1 ? cursor.getInt(this.f1197x) : 0;
        if (c0419a.f1178a != null) {
            m1927a(c0419a.f1178a, C0420f.m1924a(cursor, this.f1192s));
        }
        if (c0419a.f1179b != null) {
            CharSequence a = C0420f.m1924a(cursor, this.f1194u);
            a = a != null ? m1932b(a) : C0420f.m1924a(cursor, this.f1193t);
            if (TextUtils.isEmpty(a)) {
                if (c0419a.f1178a != null) {
                    c0419a.f1178a.setSingleLine(false);
                    c0419a.f1178a.setMaxLines(2);
                }
            } else if (c0419a.f1178a != null) {
                c0419a.f1178a.setSingleLine(true);
                c0419a.f1178a.setMaxLines(1);
            }
            m1927a(c0419a.f1179b, a);
        }
        if (c0419a.f1180c != null) {
            m1926a(c0419a.f1180c, m1934e(cursor), 4);
        }
        if (c0419a.f1181d != null) {
            m1926a(c0419a.f1181d, m1935f(cursor), 8);
        }
        if (this.f1190q == 2 || (this.f1190q == 1 && (i & 1) != 0)) {
            c0419a.f1182e.setVisibility(0);
            c0419a.f1182e.setTag(c0419a.f1178a.getText());
            c0419a.f1182e.setOnClickListener(this);
            return;
        }
        c0419a.f1182e.setVisibility(8);
    }

    public CharSequence mo186c(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String a = C0420f.m1925a(cursor, "suggest_intent_query");
        if (a != null) {
            return a;
        }
        if (this.f1185l.shouldRewriteQueryFromData()) {
            a = C0420f.m1925a(cursor, "suggest_intent_data");
            if (a != null) {
                return a;
            }
        }
        if (!this.f1185l.shouldRewriteQueryFromText()) {
            return null;
        }
        a = C0420f.m1925a(cursor, "suggest_text_1");
        return a != null ? a : null;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (Throwable e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = mo198a(this.d, this.c, viewGroup);
            if (a != null) {
                ((C0419a) a.getTag()).f1178a.setText(e.toString());
            }
            return a;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1933d(mo183a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1933d(mo183a());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1184k.m1821a((CharSequence) tag);
        }
    }
}
