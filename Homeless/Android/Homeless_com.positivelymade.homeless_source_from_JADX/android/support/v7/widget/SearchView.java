package android.support.v7.widget;

import android.annotation.TargetApi;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.widget.C0242b;
import android.support.v7.p010b.C0275a.C0266a;
import android.support.v7.p010b.C0275a.C0268c;
import android.support.v7.p013d.C0277a;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends C0328d implements C0277a {
    static final C0388a f1047a = new C0388a();
    private static final boolean f1048b = (VERSION.SDK_INT >= 8);
    private boolean f1049A;
    private boolean f1050B;
    private int f1051C;
    private boolean f1052D;
    private CharSequence f1053E;
    private boolean f1054F;
    private int f1055G;
    private SearchableInfo f1056H;
    private Bundle f1057I;
    private Runnable f1058J;
    private final Runnable f1059K;
    private Runnable f1060L;
    private final WeakHashMap<String, ConstantState> f1061M;
    private final SearchAutoComplete f1062c;
    private final View f1063d;
    private final View f1064e;
    private final ImageView f1065f;
    private final ImageView f1066g;
    private final ImageView f1067h;
    private final ImageView f1068i;
    private final ImageView f1069j;
    private final Drawable f1070k;
    private final int f1071l;
    private final int f1072m;
    private final Intent f1073n;
    private final Intent f1074o;
    private final CharSequence f1075p;
    private C0390c f1076q;
    private C0389b f1077r;
    private OnFocusChangeListener f1078s;
    private C0391d f1079t;
    private OnClickListener f1080u;
    private boolean f1081v;
    private boolean f1082w;
    private C0242b f1083x;
    private boolean f1084y;
    private CharSequence f1085z;

    public static class SearchAutoComplete extends C0387b {
        private int f1041a;
        private SearchView f1042b;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0266a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1041a = getThreshold();
        }

        public boolean enoughToFilter() {
            return this.f1041a <= 0 || super.enoughToFilter();
        }

        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1042b.m1825d();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                DispatcherState keyDispatcherState;
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState == null) {
                        return true;
                    }
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1042b.clearFocus();
                        this.f1042b.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1042b.hasFocus() && getVisibility() == 0) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                if (SearchView.m1804a(getContext())) {
                    SearchView.f1047a.m1796a(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        protected void replaceText(CharSequence charSequence) {
        }

        void setSearchView(SearchView searchView) {
            this.f1042b = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1041a = i;
        }
    }

    private static class C0388a {
        private Method f1043a;
        private Method f1044b;
        private Method f1045c;
        private Method f1046d;

        C0388a() {
            try {
                this.f1043a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1043a.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            try {
                this.f1044b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1044b.setAccessible(true);
            } catch (NoSuchMethodException e2) {
            }
            try {
                this.f1045c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1045c.setAccessible(true);
            } catch (NoSuchMethodException e3) {
            }
            try {
                this.f1046d = InputMethodManager.class.getMethod("showSoftInputUnchecked", new Class[]{Integer.TYPE, ResultReceiver.class});
                this.f1046d.setAccessible(true);
            } catch (NoSuchMethodException e4) {
            }
        }

        void m1795a(AutoCompleteTextView autoCompleteTextView) {
            if (this.f1043a != null) {
                try {
                    this.f1043a.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e) {
                }
            }
        }

        void m1796a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            if (this.f1045c != null) {
                try {
                    this.f1045c.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception e) {
                }
            }
        }

        void m1797b(AutoCompleteTextView autoCompleteTextView) {
            if (this.f1044b != null) {
                try {
                    this.f1044b.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e) {
                }
            }
        }
    }

    public interface C0389b {
        boolean m1798a();
    }

    public interface C0390c {
        boolean m1799a(String str);
    }

    public interface C0391d {
    }

    private Intent m1800a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1053E);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.f1057I != null) {
            intent.putExtra("app_data", this.f1057I);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        if (f1048b) {
            intent.setComponent(this.f1056H.getSearchActivity());
        }
        return intent;
    }

    private void m1801a(int i, String str, String str2) {
        getContext().startActivity(m1800a("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    private void m1803a(boolean z) {
        boolean z2 = true;
        int i = 8;
        this.f1082w = z;
        int i2 = z ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.f1062c.getText());
        this.f1065f.setVisibility(i2);
        m1806b(z3);
        this.f1063d.setVisibility(z ? 8 : 0);
        ImageView imageView = this.f1069j;
        if (!this.f1081v) {
            i = 0;
        }
        imageView.setVisibility(i);
        m1811i();
        if (z3) {
            z2 = false;
        }
        m1807c(z2);
        m1810h();
    }

    static boolean m1804a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private CharSequence m1805b(CharSequence charSequence) {
        if (!this.f1081v || this.f1070k == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1062c.getTextSize()) * 1.25d);
        this.f1070k.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1070k), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void m1806b(boolean z) {
        int i = 8;
        if (this.f1084y && m1809f() && hasFocus() && (z || !this.f1052D)) {
            i = 0;
        }
        this.f1066g.setVisibility(i);
    }

    private void m1807c(boolean z) {
        int i;
        if (this.f1052D && !m1824c() && z) {
            i = 0;
            this.f1066g.setVisibility(8);
        } else {
            i = 8;
        }
        this.f1068i.setVisibility(i);
    }

    @TargetApi(8)
    private boolean m1808e() {
        if (this.f1056H == null || !this.f1056H.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1056H.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1073n;
        } else if (this.f1056H.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1074o;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    private boolean m1809f() {
        return (this.f1084y || this.f1052D) && !m1824c();
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0268c.abc_search_view_preferred_width);
    }

    private void m1810h() {
        int i = 8;
        if (m1809f() && (this.f1066g.getVisibility() == 0 || this.f1068i.getVisibility() == 0)) {
            i = 0;
        }
        this.f1064e.setVisibility(i);
    }

    private void m1811i() {
        int i = 1;
        int i2 = 0;
        int i3 = !TextUtils.isEmpty(this.f1062c.getText()) ? 1 : 0;
        if (i3 == 0 && (!this.f1081v || this.f1054F)) {
            i = 0;
        }
        ImageView imageView = this.f1067h;
        if (i == 0) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.f1067h.getDrawable();
        if (drawable != null) {
            drawable.setState(i3 != 0 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    private void m1812j() {
        post(this.f1059K);
    }

    private void m1813k() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1062c;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m1805b(queryHint));
    }

    @TargetApi(8)
    private void m1814l() {
        int i = 1;
        this.f1062c.setThreshold(this.f1056H.getSuggestThreshold());
        this.f1062c.setImeOptions(this.f1056H.getImeOptions());
        int inputType = this.f1056H.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1056H.getSuggestAuthority() != null) {
                inputType = (inputType | 65536) | 524288;
            }
        }
        this.f1062c.setInputType(inputType);
        if (this.f1083x != null) {
            this.f1083x.mo185a(null);
        }
        if (this.f1056H.getSuggestAuthority() != null) {
            this.f1083x = new C0420f(getContext(), this, this.f1056H, this.f1061M);
            this.f1062c.setAdapter(this.f1083x);
            C0420f c0420f = (C0420f) this.f1083x;
            if (this.f1049A) {
                i = 2;
            }
            c0420f.m1941a(i);
        }
    }

    private void m1815m() {
        CharSequence text = this.f1062c.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f1076q == null || !this.f1076q.m1799a(text.toString())) {
                if (this.f1056H != null) {
                    m1801a(0, null, text.toString());
                }
                setImeVisibility(false);
                m1816n();
            }
        }
    }

    private void m1816n() {
        this.f1062c.dismissDropDown();
    }

    private void m1817o() {
        if (!TextUtils.isEmpty(this.f1062c.getText())) {
            this.f1062c.setText("");
            this.f1062c.requestFocus();
            setImeVisibility(true);
        } else if (!this.f1081v) {
        } else {
            if (this.f1077r == null || !this.f1077r.m1798a()) {
                clearFocus();
                m1803a(true);
            }
        }
    }

    private void m1818p() {
        m1803a(false);
        this.f1062c.requestFocus();
        setImeVisibility(true);
        if (this.f1080u != null) {
            this.f1080u.onClick(this);
        }
    }

    private void m1819q() {
        f1047a.m1795a(this.f1062c);
        f1047a.m1797b(this.f1062c);
    }

    private void setImeVisibility(boolean z) {
        if (z) {
            post(this.f1058J);
            return;
        }
        removeCallbacks(this.f1058J);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.f1062c.setText(charSequence);
        this.f1062c.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void mo235a() {
        if (!this.f1054F) {
            this.f1054F = true;
            this.f1055G = this.f1062c.getImeOptions();
            this.f1062c.setImeOptions(this.f1055G | 33554432);
            this.f1062c.setText("");
            setIconified(false);
        }
    }

    void m1821a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void m1822a(CharSequence charSequence, boolean z) {
        this.f1062c.setText(charSequence);
        if (charSequence != null) {
            this.f1062c.setSelection(this.f1062c.length());
            this.f1053E = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            m1815m();
        }
    }

    public void mo236b() {
        m1822a((CharSequence) "", false);
        clearFocus();
        m1803a(true);
        this.f1062c.setImeOptions(this.f1055G);
        this.f1054F = false;
    }

    public boolean m1824c() {
        return this.f1082w;
    }

    public void clearFocus() {
        this.f1050B = true;
        setImeVisibility(false);
        super.clearFocus();
        this.f1062c.clearFocus();
        this.f1050B = false;
    }

    void m1825d() {
        m1803a(m1824c());
        m1812j();
        if (this.f1062c.hasFocus()) {
            m1819q();
        }
    }

    public int getImeOptions() {
        return this.f1062c.getImeOptions();
    }

    public int getInputType() {
        return this.f1062c.getInputType();
    }

    public int getMaxWidth() {
        return this.f1051C;
    }

    public CharSequence getQuery() {
        return this.f1062c.getText();
    }

    public CharSequence getQueryHint() {
        return this.f1085z != null ? this.f1085z : (!f1048b || this.f1056H == null || this.f1056H.getHintId() == 0) ? this.f1075p : getContext().getText(this.f1056H.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f1072m;
    }

    int getSuggestionRowLayout() {
        return this.f1071l;
    }

    public C0242b getSuggestionsAdapter() {
        return this.f1083x;
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1059K);
        post(this.f1060L);
        super.onDetachedFromWindow();
    }

    protected void onMeasure(int i, int i2) {
        if (m1824c()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                if (this.f1051C <= 0) {
                    size = Math.min(getPreferredWidth(), size);
                    break;
                } else {
                    size = Math.min(this.f1051C, size);
                    break;
                }
            case 0:
                if (this.f1051C <= 0) {
                    size = getPreferredWidth();
                    break;
                } else {
                    size = this.f1051C;
                    break;
                }
            case 1073741824:
                if (this.f1051C > 0) {
                    size = Math.min(this.f1051C, size);
                    break;
                }
                break;
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m1812j();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f1050B || !isFocusable()) {
            return false;
        }
        if (m1824c()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1062c.requestFocus(i, rect);
        if (requestFocus) {
            m1803a(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1057I = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m1817o();
        } else {
            m1818p();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1081v != z) {
            this.f1081v = z;
            m1803a(z);
            m1813k();
        }
    }

    public void setImeOptions(int i) {
        this.f1062c.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1062c.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1051C = i;
        requestLayout();
    }

    public void setOnCloseListener(C0389b c0389b) {
        this.f1077r = c0389b;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f1078s = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0390c c0390c) {
        this.f1076q = c0390c;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.f1080u = onClickListener;
    }

    public void setOnSuggestionListener(C0391d c0391d) {
        this.f1079t = c0391d;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1085z = charSequence;
        m1813k();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1049A = z;
        if (this.f1083x instanceof C0420f) {
            ((C0420f) this.f1083x).m1941a(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1056H = searchableInfo;
        if (this.f1056H != null) {
            if (f1048b) {
                m1814l();
            }
            m1813k();
        }
        boolean z = f1048b && m1808e();
        this.f1052D = z;
        if (this.f1052D) {
            this.f1062c.setPrivateImeOptions("nm");
        }
        m1803a(m1824c());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1084y = z;
        m1803a(m1824c());
    }

    public void setSuggestionsAdapter(C0242b c0242b) {
        this.f1083x = c0242b;
        this.f1062c.setAdapter(this.f1083x);
    }
}
