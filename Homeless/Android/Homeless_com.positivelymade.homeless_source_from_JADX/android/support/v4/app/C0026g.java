package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.p007f.C0086g;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public class C0026g extends Activity {
    final Handler f145a = new C00231(this);
    final C0034j f146b = new C0034j();
    final C0020h f147c = new C00242(this);
    boolean f148d;
    boolean f149e;
    boolean f150f;
    boolean f151g;
    boolean f152h;
    boolean f153i;
    boolean f154j;
    boolean f155k;
    C0086g<String, C0046o> f156l;
    C0046o f157m;

    class C00231 extends Handler {
        final /* synthetic */ C0026g f138a;

        C00231(C0026g c0026g) {
            this.f138a = c0026g;
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    if (this.f138a.f150f) {
                        this.f138a.m181a(false);
                        return;
                    }
                    return;
                case 2:
                    this.f138a.m183b();
                    this.f138a.f146b.m245g();
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    }

    class C00242 implements C0020h {
        final /* synthetic */ C0026g f139a;

        C00242(C0026g c0026g) {
            this.f139a = c0026g;
        }

        public View mo18a(int i) {
            return this.f139a.findViewById(i);
        }

        public boolean mo19a() {
            Window window = this.f139a.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    static final class C0025a {
        Object f140a;
        Object f141b;
        C0086g<String, Object> f142c;
        ArrayList<C0018f> f143d;
        C0086g<String, C0046o> f144e;

        C0025a() {
        }
    }

    private static String m174a(View view) {
        char c = 'F';
        char c2 = '.';
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(view.getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(view)));
        stringBuilder.append(' ');
        switch (view.getVisibility()) {
            case 0:
                stringBuilder.append('V');
                break;
            case 4:
                stringBuilder.append('I');
                break;
            case 8:
                stringBuilder.append('G');
                break;
            default:
                stringBuilder.append('.');
                break;
        }
        stringBuilder.append(view.isFocusable() ? 'F' : '.');
        stringBuilder.append(view.isEnabled() ? 'E' : '.');
        stringBuilder.append(view.willNotDraw() ? '.' : 'D');
        stringBuilder.append(view.isHorizontalScrollBarEnabled() ? 'H' : '.');
        stringBuilder.append(view.isVerticalScrollBarEnabled() ? 'V' : '.');
        stringBuilder.append(view.isClickable() ? 'C' : '.');
        stringBuilder.append(view.isLongClickable() ? 'L' : '.');
        stringBuilder.append(' ');
        if (!view.isFocused()) {
            c = '.';
        }
        stringBuilder.append(c);
        stringBuilder.append(view.isSelected() ? 'S' : '.');
        if (view.isPressed()) {
            c2 = 'P';
        }
        stringBuilder.append(c2);
        stringBuilder.append(' ');
        stringBuilder.append(view.getLeft());
        stringBuilder.append(',');
        stringBuilder.append(view.getTop());
        stringBuilder.append('-');
        stringBuilder.append(view.getRight());
        stringBuilder.append(',');
        stringBuilder.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            stringBuilder.append(" #");
            stringBuilder.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (!(id == 0 || resources == null)) {
                String str;
                switch (-16777216 & id) {
                    case 16777216:
                        str = "android";
                        break;
                    case 2130706432:
                        str = "app";
                        break;
                    default:
                        try {
                            str = resources.getResourcePackageName(id);
                            break;
                        } catch (NotFoundException e) {
                            break;
                        }
                }
                String resourceTypeName = resources.getResourceTypeName(id);
                String resourceEntryName = resources.getResourceEntryName(id);
                stringBuilder.append(" ");
                stringBuilder.append(str);
                stringBuilder.append(":");
                stringBuilder.append(resourceTypeName);
                stringBuilder.append("/");
                stringBuilder.append(resourceEntryName);
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private void m175a(String str, PrintWriter printWriter, View view) {
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(C0026g.m174a(view));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount > 0) {
                String str2 = str + "  ";
                for (int i = 0; i < childCount; i++) {
                    m175a(str2, printWriter, viewGroup.getChildAt(i));
                }
            }
        }
    }

    C0046o m176a(String str, boolean z, boolean z2) {
        if (this.f156l == null) {
            this.f156l = new C0086g();
        }
        C0046o c0046o = (C0046o) this.f156l.get(str);
        if (c0046o != null) {
            c0046o.m331a(this);
            return c0046o;
        } else if (!z2) {
            return c0046o;
        } else {
            c0046o = new C0046o(str, this, z);
            this.f156l.put(str, c0046o);
            return c0046o;
        }
    }

    public void m177a() {
        C0007a.m27a(this);
    }

    public void m178a(C0018f c0018f) {
    }

    public void m179a(C0018f c0018f, Intent intent, int i) {
        if (i == -1) {
            super.startActivityForResult(intent, -1);
        } else if ((-65536 & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        } else {
            super.startActivityForResult(intent, ((c0018f.f117p + 1) << 16) + (65535 & i));
        }
    }

    void m180a(String str) {
        if (this.f156l != null) {
            C0046o c0046o = (C0046o) this.f156l.get(str);
            if (c0046o != null && !c0046o.f241g) {
                c0046o.m343h();
                this.f156l.remove(str);
            }
        }
    }

    void m181a(boolean z) {
        if (!this.f151g) {
            this.f151g = true;
            this.f152h = z;
            this.f145a.removeMessages(1);
            m186e();
        }
    }

    protected boolean m182a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void m183b() {
        this.f146b.m253o();
    }

    public Object m184c() {
        return null;
    }

    public void m185d() {
        if (VERSION.SDK_INT >= 11) {
            C0009c.m29a(this);
        } else {
            this.f153i = true;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        if (VERSION.SDK_INT >= 11) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f148d);
            printWriter.print("mResumed=");
            printWriter.print(this.f149e);
            printWriter.print(" mStopped=");
            printWriter.print(this.f150f);
            printWriter.print(" mReallyStopped=");
            printWriter.println(this.f151g);
            printWriter.print(str2);
            printWriter.print("mLoadersStarted=");
            printWriter.println(this.f155k);
        } else {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f148d);
            printWriter.print("mResumed=");
            printWriter.print(this.f149e);
            printWriter.print(" mStopped=");
            printWriter.print(this.f150f);
            printWriter.print(" mReallyStopped=");
            printWriter.println(this.f151g);
            printWriter.print(str2);
            printWriter.print("mLoadersStarted=");
            printWriter.println(this.f155k);
        }
        if (this.f157m != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.f157m)));
            printWriter.println(":");
            this.f157m.m333a(str + "  ", fileDescriptor, printWriter, strArr);
        }
        this.f146b.m222a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        m175a(str + "  ", printWriter, getWindow().getDecorView());
    }

    void m186e() {
        if (this.f155k) {
            this.f155k = false;
            if (this.f157m != null) {
                if (this.f152h) {
                    this.f157m.m339d();
                } else {
                    this.f157m.m338c();
                }
            }
        }
        this.f146b.m256r();
    }

    public C0028i m187f() {
        return this.f146b;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        this.f146b.m249k();
        int i3 = i >> 16;
        if (i3 != 0) {
            i3--;
            if (this.f146b.f174f == null || i3 < 0 || i3 >= this.f146b.f174f.size()) {
                Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(i));
                return;
            }
            C0018f c0018f = (C0018f) this.f146b.f174f.get(i3);
            if (c0018f == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(i));
                return;
            } else {
                c0018f.mo890a(65535 & i, i2, intent);
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (!this.f146b.m242e()) {
            m177a();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f146b.m213a(configuration);
    }

    protected void onCreate(Bundle bundle) {
        this.f146b.m220a(this, this.f147c, null);
        if (getLayoutInflater().getFactory() == null) {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
        C0025a c0025a = (C0025a) getLastNonConfigurationInstance();
        if (c0025a != null) {
            this.f156l = c0025a.f144e;
        }
        if (bundle != null) {
            this.f146b.m215a(bundle.getParcelable("android:support:fragments"), c0025a != null ? c0025a.f143d : null);
        }
        this.f146b.m250l();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        return VERSION.SDK_INT >= 11 ? super.onCreatePanelMenu(i, menu) | this.f146b.m225a(menu, getMenuInflater()) : true;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return super.onCreateView(str, context, attributeSet);
        }
        View a = this.f146b.mo22a(null, str, context, attributeSet);
        return a == null ? super.onCreateView(str, context, attributeSet) : a;
    }

    protected void onDestroy() {
        super.onDestroy();
        m181a(false);
        this.f146b.m258t();
        if (this.f157m != null) {
            this.f157m.m343h();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 5 || i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        onBackPressed();
        return true;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f146b.m259u();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case 0:
                return this.f146b.m226a(menuItem);
            case 6:
                return this.f146b.m233b(menuItem);
            default:
                return false;
        }
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f146b.m249k();
    }

    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case 0:
                this.f146b.m231b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    protected void onPause() {
        super.onPause();
        this.f149e = false;
        if (this.f145a.hasMessages(2)) {
            this.f145a.removeMessages(2);
            m183b();
        }
        this.f146b.m254p();
    }

    protected void onPostResume() {
        super.onPostResume();
        this.f145a.removeMessages(2);
        m183b();
        this.f146b.m245g();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        if (this.f153i) {
            this.f153i = false;
            menu.clear();
            onCreatePanelMenu(i, menu);
        }
        return m182a(view, menu) | this.f146b.m224a(menu);
    }

    protected void onResume() {
        super.onResume();
        this.f145a.sendEmptyMessage(2);
        this.f149e = true;
        this.f146b.m245g();
    }

    public final Object onRetainNonConfigurationInstance() {
        int i = 0;
        if (this.f150f) {
            m181a(true);
        }
        Object c = m184c();
        ArrayList i2 = this.f146b.m247i();
        int i3;
        if (this.f156l != null) {
            int size = this.f156l.size();
            C0046o[] c0046oArr = new C0046o[size];
            for (int i4 = size - 1; i4 >= 0; i4--) {
                c0046oArr[i4] = (C0046o) this.f156l.m466c(i4);
            }
            i3 = 0;
            while (i < size) {
                C0046o c0046o = c0046oArr[i];
                if (c0046o.f241g) {
                    i3 = true;
                } else {
                    c0046o.m343h();
                    this.f156l.remove(c0046o.f238d);
                }
                i++;
            }
        } else {
            i3 = 0;
        }
        if (i2 == null && r0 == 0 && c == null) {
            return null;
        }
        C0025a c0025a = new C0025a();
        c0025a.f140a = null;
        c0025a.f141b = c;
        c0025a.f142c = null;
        c0025a.f143d = i2;
        c0025a.f144e = this.f156l;
        return c0025a;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable j = this.f146b.m248j();
        if (j != null) {
            bundle.putParcelable("android:support:fragments", j);
        }
    }

    protected void onStart() {
        super.onStart();
        this.f150f = false;
        this.f151g = false;
        this.f145a.removeMessages(1);
        if (!this.f148d) {
            this.f148d = true;
            this.f146b.m251m();
        }
        this.f146b.m249k();
        this.f146b.m245g();
        if (!this.f155k) {
            this.f155k = true;
            if (this.f157m != null) {
                this.f157m.m337b();
            } else if (!this.f154j) {
                this.f157m = m176a("(root)", this.f155k, false);
                if (!(this.f157m == null || this.f157m.f240f)) {
                    this.f157m.m337b();
                }
            }
            this.f154j = true;
        }
        this.f146b.m252n();
        if (this.f156l != null) {
            int size = this.f156l.size();
            C0046o[] c0046oArr = new C0046o[size];
            for (int i = size - 1; i >= 0; i--) {
                c0046oArr[i] = (C0046o) this.f156l.m466c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                C0046o c0046o = c0046oArr[i2];
                c0046o.m340e();
                c0046o.m342g();
            }
        }
    }

    protected void onStop() {
        super.onStop();
        this.f150f = true;
        this.f145a.sendEmptyMessage(1);
        this.f146b.m255q();
    }

    public void startActivityForResult(Intent intent, int i) {
        if (i == -1 || (-65536 & i) == 0) {
            super.startActivityForResult(intent, i);
            return;
        }
        throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
}
